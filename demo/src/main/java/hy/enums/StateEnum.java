/*
 * @(#)StateEnum.java    1.0.0 2018年7月18日 上午11:12:45
 *
 * Copyright (c) 2007-2016 Shanghai Handpay IT, Co., Ltd. 
 * 4/F, 763 MengZi Road. W., Shanghai, China 
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of 
 * Shanghai Handpay IT Co., Ltd. ("Confidential Information").  
 * You shall not disclose such Confidential Information and shall use 
 * it only in accordance with the terms of the license agreement you 
 * entered into with Handpay.
 */
package com.hy.enums;

import java.util.Iterator;

import com.hy.bean.Aircon;

/**
 * 状态机
 * 
 * @version 1.0.0 2018年7月18日 上午11:12:45
 * @author hy
 * @history 
 *			时间	版本	姓名	修改内容
 */
public enum StateEnum {

	OFF{
		
		@Override
		public void open(Aircon ac) {
			if (ac.state==OFF) {
				super.exit(ac);
				startFan();
				ac.state = FAN;
				ac.state.entry(ac);
				ac.getFlag().put(ac.state.name(), true);
			}
		}
		
		@Override
		public void close(Aircon ac) {
			super.exit(ac);
			stopFan();
			super.exit(ac);
			stopCool();
			super.exit(ac);
			startHot();
			ac.getFlag().clear();
		}
		
	},
	
	FAN{
		
		@Override
		public void exit(Aircon ac) {
			super.exit(ac);
			stopFan();
			ac.getFlag().remove(FAN.name());
			Iterator<String> iterator = ac.getFlag().keySet().iterator();
			ac.state = OFF;
			while (iterator.hasNext()) {
				String key = (String) iterator.next();
				if (ac.getFlag().get(key)) {
					ac.state = super.getByName(key);
					break;
				}
			}
			
			ac.state.entry(ac);
			if (ac.state == OFF) {
				// remove
				ac.getFlag().clear();
			}
		}

		@Override
		public void power(Aircon ac) {
			if (ac.getFlag().get(FAN.name())) {
				this.exit(ac);
			}
			
		}

	},
	
	COOL{
		
		@Override
		public void exit(Aircon ac) {
			super.exit(ac);
			stopCool();
			ac.getFlag().remove(COOL.name());
			
			Iterator<String> iterator = ac.getFlag().keySet().iterator();
			ac.state = OFF;
			while (iterator.hasNext()) {
				String key = (String) iterator.next();
				if (ac.getFlag().get(key)) {
					ac.state = super.getByName(key);
					break;
				}
			}
			
			ac.state.entry(ac);
			if (ac.state == OFF) {
				// remove
				ac.getFlag().clear();
			}
		}

		@Override
		public void cool(Aircon ac) {
			if (ac.getFlag().containsKey(COOL.name()) 
					&& ac.getFlag().get(COOL.name())) {
				this.exit(ac);
				return;
			}
			
			if (ac.state == HOT) {
				// 关HOT,开COOL
				HOT.exit(ac);
				startCool();
				ac.getFlag().put(COOL.name(), true);
				ac.state = COOL;
				ac.getFlag().remove(HOT.name());
				ac.state.entry(ac);
				ac.getFlag().put(ac.state.name(), true);
				return;
			}
			
			if (ac.state != OFF) {
				super.exit(ac);
				startCool();
				ac.getFlag().put(COOL.name(), true);
				ac.state = COOL;
				ac.getFlag().remove(HOT.name());
				ac.state.entry(ac);
				ac.getFlag().put(ac.state.name(), true);
			}
		}

	},
	
	HOT{
		
		@Override
		public void exit(Aircon ac) {
			super.exit(ac);
			stopHot();
			ac.getFlag().put(HOT.name(), false);
			
			Iterator<String> iterator = ac.getFlag().keySet().iterator();
			ac.state = OFF;
			while (iterator.hasNext()) {
				String key = (String) iterator.next();
				if (ac.getFlag().get(key)) {
					ac.state = super.getByName(key);
					break;
				}
			}
			
			ac.state.entry(ac);
			if (ac.state == OFF) {
				// remove
				ac.getFlag().clear();
			}
		}

		@Override
		public void hot(Aircon ac) {
			if (ac.getFlag().get(HOT.name())) {
				this.exit(ac);
				return;
			}
			
			if (ac.state == COOL) {
				// 关HOT,开COOL
				COOL.exit(ac);
				startHot();
				ac.getFlag().put(HOT.name(), true);
				ac.state = HOT;
				ac.getFlag().remove(COOL.name());
				ac.state.entry(ac);
				ac.getFlag().put(ac.state.name(), true);
				return;
			}
			
			if (ac.state != OFF) {
				super.exit(ac);
				startHot();
				ac.getFlag().put(HOT.name(), true);
				ac.state = HOT;
				ac.getFlag().remove(COOL.name());
				ac.state.entry(ac);
				ac.getFlag().put(ac.state.name(), true);
			}
		}
	};
	
	// 送风
	public void power(Aircon ac) {
	}
	
	// 制冷
	public void cool(Aircon ac) {
	}
	
	// 制热
	public void hot(Aircon ac) {
	}
	
	// start -> power
	public void startFan() {
		System.out.println("start Fan");
	}
	
	// stop -> power
	public void stopFan() {
		System.out.println("stop Fan");
	}
	
	// start -> cool
	public void startCool() {
		System.out.println("start Cool");
	}

	// stop -> cool
	public void stopCool() {
		System.out.println("stop Cool");
	}
	
	// start -> hot
	public void startHot() {
		System.out.println("start Hot");
	}

	// stop -> cool
	public void stopHot() {
		System.out.println("stop Hot");
	}
	
	public void entry(Aircon ac) {
		System.out.println("->"+ac.state.name());
	}
	
	public void exit(Aircon ac) {
		System.out.print(ac.state.name()+"->");
	}
	
	public void open(Aircon ac) {
		
	}
	
	public void close(Aircon ac) {
		
	}
	
	private StateEnum getByName(String name) {
		for (StateEnum state : StateEnum.values()) {
			if (state.name().equals(name)) {
				return state;
			}
		}
		return null;
	}
}
