package com.zqh.conversion.server;


/**
 * 单位转换算法
 * 参数：输入单位，输入数值，输出单位
 * @author zqh
 *
 */
public class ChangeUnit {
	private float temp,metre,result;
public float ChangetoUnit(String unit,String number,String unit2){
	
if (unit.equals("纳米")) {
   temp=Float.valueOf(number);
   metre = temp/1000000000;
   
} else if(unit.equals("微米")){
	temp=Float.valueOf(number);
	   metre = temp/1000000;
}else if (unit.equals("毫米")) {
	temp=Float.valueOf(number);
	   metre = temp/1000;
}else if (unit.equals("厘米")) {
	temp=Float.valueOf(number);
	   metre = temp/100;
}else if (unit.equals("分米")) {
	temp=Float.valueOf(number);
	   metre = temp/10;
}else if (unit.equals("米")) {
	temp=Float.valueOf(number);
	   metre = temp;
}else if (unit.equals("公里")) {
	temp=Float.valueOf(number);
	   metre = temp*1000;
}
if (unit2.equals("纳米")) {
	   	   result = metre*1000000000;
	   	   return result;
	} else if(unit2.equals("微米")){
		result = metre*1000000;
	   	   return result;
	}else if (unit2.equals("毫米")) {
		result = metre*1000;
	   	   return result;
	}else if (unit2.equals("厘米")) {
		result = metre*100;
	   	   return result;
	}else if (unit2.equals("分米")) {
		result = metre*10;
	   	   return result;
	}else if (unit2.equals("米")) {
		result = metre*1;
	   	   return result;
	}else if (unit2.equals("公里")) {
		result = metre/1000;
	   	   return result;
	}
return (Float) null;
	
	
}
public float ChangetoUnitarea(String unit,String number,String unit2){
	
if (unit.equals("平方毫米")) {
   temp=Float.valueOf(number);
   metre = temp/1000000;
   
} else if(unit.equals("平方厘米")){
	temp=Float.valueOf(number);
	   metre = temp/10000;
}else if (unit.equals("平方分米")) {
	temp=Float.valueOf(number);
	   metre = temp/100;
}else if (unit.equals("平方米")) {
	temp=Float.valueOf(number);
	   metre = temp/1;
}else if (unit.equals("公亩")) {
	temp=Float.valueOf(number);
	   metre = temp*100;
}else if (unit.equals("公顷")) {
	temp=Float.valueOf(number);
	   metre = temp*10000;
}else if (unit.equals("平方千米")) {
	temp=Float.valueOf(number);
	   metre = temp*100000;
}
if (unit2.equals("平方厘米")) {
	   	   result = metre*10000;
	   	   return result;
	} else if(unit2.equals("平方分米")){
		result = metre*100;
	   	   return result;
	}else if (unit2.equals("平方米")) {
		result = metre;
	   	   return result;
	}else if (unit2.equals("公亩")) {
		result = metre/100;
	   	   return result;
	}else if (unit2.equals("公顷")) {
		result = metre/10000;
	   	   return result;
	}else if (unit2.equals("平方千米")) {
		result = metre/1000000;
	   	   return result;
	}else if (unit2.equals("平方毫米")) {
		result = metre*1000000;
	   	   return result;
	}
return (Float) null;
	
	
}
public float ChangetoUnitvolume(String unit,String number,String unit2){
	
if (unit.equals("立方千米")) {
   temp=Float.valueOf(number);
   metre = temp*1000000000;
   
} else if(unit.equals("立方米")){
	temp=Float.valueOf(number);
	   metre = temp;
}else if (unit.equals("立方分米")) {
	temp=Float.valueOf(number);
	   metre = temp/1000;
}else if (unit.equals("立方厘米")) {
	temp=Float.valueOf(number);
	   metre = temp/1000000;
}else if (unit.equals("立方毫米")) {
	temp=Float.valueOf(number);
	   metre = temp/1000000000;
}
if (unit2.equals("立方千米")) {
	   	   result = metre/1000000000;
	   	   return result;	
	} else if(unit2.equals("立方分米")){
		result = metre*1000;
	   	   return result;
	}else if (unit2.equals("立方米")) {
		result = metre;
	   	   return result;
	}else if (unit2.equals("立方毫米")) {
		result = metre*1000000000;
	   	   return result;
	}else if (unit2.equals("立方厘米")) {
		result = metre*1000000;
	   	   return result;
	}
return (Float) null;
}
public float ChangetoUnitweight(String unit,String number,String unit2){
	
if (unit.equals("吨")) {
   temp=Float.valueOf(number);
   metre = temp*1000;
   } else if(unit.equals("公顷")){
	temp=Float.valueOf(number);
	   metre = temp*100;
}else if (unit.equals("千克(公斤)")) {
	temp=Float.valueOf(number);
	   metre = temp;
}else if (unit.equals("克")) {
	temp=Float.valueOf(number);
	   metre = temp/1000;
}else if (unit.equals("克拉")) {
	temp=Float.valueOf(number);
	   metre = temp/5000;
}else if (unit.equals("毫克")) {
	temp=Float.valueOf(number);
	   metre = temp/1000000;
}else if (unit.equals("微克")) {
	temp=Float.valueOf(number);
	   metre = temp/1000000000;
}
if (unit2.equals("吨")) {
	   	   result = metre/1000;
	   	   return result;
	} else if(unit2.equals("公顷")){
		result = metre/100;
	   	   return result;
	}else if (unit2.equals("千克(公斤)")) {
		result = metre;
	   	   return result;
	}else if (unit2.equals("克")) {
		result = metre*1000;
	   	   return result;
	}else if (unit2.equals("克拉")) {
		result = metre*5000;
	   	   return result;
	}else if (unit2.equals("毫克")) {
		result = metre*1000000;
	   	   return result;
	}else if (unit2.equals("微克")) {
		result = metre*1000000000;
	   	   return result;
	}
return (Float) null;
}
public float ChangetoUnittemperature(String unit,String number,String unit2){
	
if (unit.equals("摄氏度")) {
   temp=Float.valueOf(number);
   metre = (float) (temp+272.15);
   } else if(unit.equals("华氏度")){
	temp=Float.valueOf(number);
	   metre = (float) (temp+457.87);
}else if (unit.equals("开尔文")) {
	temp=Float.valueOf(number);
	   metre = temp;
}
if (unit2.equals("摄氏度")) {
	   	   result = (float) (metre-272.15);
	   	   return result;
	} else if(unit2.equals("华氏度")){
		result = (float) (metre-457.87);
	   	   return result;
	}else if (unit2.equals("开尔文")) {
		result = metre;
	   	   return result;
	}
return (Float) null;
}
/**
 * 时间换算
 */
public float ChangetoUnittime(String unit,String number,String unit2){
	
	if (unit.equals("年")) {
		   temp=Float.valueOf(number);
		   metre = temp*365*24*60*60;
		   
		} else if(unit.equals("周")){
			temp=Float.valueOf(number);
			   metre = temp*7*24*60*60;
		}else if (unit.equals("日")) {
			temp=Float.valueOf(number);
			   metre = temp*24*60*60;
		}else if (unit.equals("时")) {
			temp=Float.valueOf(number);
			   metre = temp*3600;
		}else if (unit.equals("分")) {
			temp=Float.valueOf(number);
			   metre = temp*60;
		}else if (unit.equals("秒")) {
			temp=Float.valueOf(number);
			   metre = temp;
		}else if (unit.equals("毫秒")) {
			temp=Float.valueOf(number);
			   metre = temp/1000;
		}else if (unit.equals("微秒")) {
			temp=Float.valueOf(number);
			   metre = temp/1000000;
		}else if (unit.equals("纳秒")) {
			temp=Float.valueOf(number);
			   metre = temp/1000000000;
		}
		if (unit2.equals("年")) {
			   	   result = metre/60/60/24/365;
			   	   return result;	
			} else if(unit2.equals("周")){
				result = metre/7/24/60/60;
			   	   return result;
			}else if (unit2.equals("日")) {
				result = metre/24/60/60;
			   	   return result;
			}else if (unit2.equals("时")) {
				result = metre/60/60;
			   	   return result;
			}else if (unit2.equals("分")) {
				result = metre/60;
			   	   return result;
			}else if (unit2.equals("秒")) {
				result = metre;
			   	   return result;
			}else if (unit2.equals("毫秒")) {
				result = metre*1000;
			   	   return result;
			}else if (unit2.equals("微秒")) {
				result = metre*1000000;
			   	   return result;
			}else if (unit2.equals("纳秒")) {
				result = metre*1000000000;
			   	   return result;
			}
return (Float) null;
}
public float ChangetoUnitspeed(String unit,String number,String unit2){
	
if (unit.equals("千米/秒")) {
   temp=Float.valueOf(number);
   metre = temp*1000;
   
} else if(unit.equals("米/秒")){
	temp=Float.valueOf(number);
	   metre = temp;
}else if (unit.equals("千米/小时")) {
	temp=Float.valueOf(number);
	   metre = (float) (temp*0.27777);
}else if (unit.equals("马赫")) {
	temp=Float.valueOf(number);
	   metre = (float) (temp*340.3);
}else if (unit.equals("节")) {
	temp=Float.valueOf(number);
	   metre = (float) (temp*0.5144);
}else if (unit.equals("英里/小时")) {
	temp=Float.valueOf(number);
	   metre = (float) (temp*0.44704);
}else if (unit.equals("英尺/秒")) {
	temp=Float.valueOf(number);
	   metre = (float) (temp*0.3048);
}
if (unit2.equals("千米/秒")) {
	   	   result = metre/1000;
	   	   return result;
	} else if(unit2.equals("米/秒")){
		result = metre;
	   	   return result;
	}else if (unit2.equals("千米/小时")) {
		result = (float) (metre*3.6);
	   	   return result;
	}else if (unit2.equals("马赫")) {
		result = (float) (metre*0.00293);
	   	   return result;
	}else if (unit2.equals("节")) {
		result = (float) (metre*1.94384);
	   	   return result;
	}else if (unit2.equals("英里/小时")) {
		result = (float) (metre*2.23693);
	   	   return result;
	}else if (unit2.equals("英尺/秒")) {
		result = (float) (metre*3.28083);
	   	   return result;
	}
return (Float) null;
	
	
}
public float ChangetoUnitenergy(String unit, String number, String unit2) {
	if (unit.equals("兆焦")) {
		   temp=Float.valueOf(number);
		   metre = temp*1000000;
		   
		} else if(unit.equals("千焦")){
			temp=Float.valueOf(number);
			   metre = temp*1000;
		}else if (unit.equals("焦耳")) {
			temp=Float.valueOf(number);
			   metre = temp;
		}else if (unit.equals("尔格")) {
			temp=Float.valueOf(number);
			   metre = temp/10000000;
		}else if (unit.equals("千卡(大卡)")) {
			temp=Float.valueOf(number);
			   metre = temp*4184;
		}else if (unit.equals("卡")) {
			temp=Float.valueOf(number);
			   metre = (float) (temp*4.184);
		}
	if (unit2.equals("兆焦")) {
		   	   result = metre/1000000;
		   	   return result;
		}else if (unit2.equals("千焦")) {
			   	   result = metre/1000;
			   	   return result;
			} else if(unit2.equals("焦耳")){
				result = metre;
			   	   return result;
			}else if (unit2.equals("尔格")) {
				result = metre*10000000;
			   	   return result;
			}else if (unit2.equals("千卡(大卡)")) {
				result = metre/4184;
			   	   return result;
			}else if (unit2.equals("卡")) {
				result = (float) (metre/4.184);
			   	   return result;
			}
	return 0;
}
}
