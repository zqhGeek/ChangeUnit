package com.zqh.conversion.server;


/**
 * ��λת���㷨
 * ���������뵥λ��������ֵ�������λ
 * @author zqh
 *
 */
public class ChangeUnit {
	private float temp,metre,result;
public float ChangetoUnit(String unit,String number,String unit2){
	
if (unit.equals("����")) {
   temp=Float.valueOf(number);
   metre = temp/1000000000;
   
} else if(unit.equals("΢��")){
	temp=Float.valueOf(number);
	   metre = temp/1000000;
}else if (unit.equals("����")) {
	temp=Float.valueOf(number);
	   metre = temp/1000;
}else if (unit.equals("����")) {
	temp=Float.valueOf(number);
	   metre = temp/100;
}else if (unit.equals("����")) {
	temp=Float.valueOf(number);
	   metre = temp/10;
}else if (unit.equals("��")) {
	temp=Float.valueOf(number);
	   metre = temp;
}else if (unit.equals("����")) {
	temp=Float.valueOf(number);
	   metre = temp*1000;
}
if (unit2.equals("����")) {
	   	   result = metre*1000000000;
	   	   return result;
	} else if(unit2.equals("΢��")){
		result = metre*1000000;
	   	   return result;
	}else if (unit2.equals("����")) {
		result = metre*1000;
	   	   return result;
	}else if (unit2.equals("����")) {
		result = metre*100;
	   	   return result;
	}else if (unit2.equals("����")) {
		result = metre*10;
	   	   return result;
	}else if (unit2.equals("��")) {
		result = metre*1;
	   	   return result;
	}else if (unit2.equals("����")) {
		result = metre/1000;
	   	   return result;
	}
return (Float) null;
	
	
}
public float ChangetoUnitarea(String unit,String number,String unit2){
	
if (unit.equals("ƽ������")) {
   temp=Float.valueOf(number);
   metre = temp/1000000;
   
} else if(unit.equals("ƽ������")){
	temp=Float.valueOf(number);
	   metre = temp/10000;
}else if (unit.equals("ƽ������")) {
	temp=Float.valueOf(number);
	   metre = temp/100;
}else if (unit.equals("ƽ����")) {
	temp=Float.valueOf(number);
	   metre = temp/1;
}else if (unit.equals("��Ķ")) {
	temp=Float.valueOf(number);
	   metre = temp*100;
}else if (unit.equals("����")) {
	temp=Float.valueOf(number);
	   metre = temp*10000;
}else if (unit.equals("ƽ��ǧ��")) {
	temp=Float.valueOf(number);
	   metre = temp*100000;
}
if (unit2.equals("ƽ������")) {
	   	   result = metre*10000;
	   	   return result;
	} else if(unit2.equals("ƽ������")){
		result = metre*100;
	   	   return result;
	}else if (unit2.equals("ƽ����")) {
		result = metre;
	   	   return result;
	}else if (unit2.equals("��Ķ")) {
		result = metre/100;
	   	   return result;
	}else if (unit2.equals("����")) {
		result = metre/10000;
	   	   return result;
	}else if (unit2.equals("ƽ��ǧ��")) {
		result = metre/1000000;
	   	   return result;
	}else if (unit2.equals("ƽ������")) {
		result = metre*1000000;
	   	   return result;
	}
return (Float) null;
	
	
}
public float ChangetoUnitvolume(String unit,String number,String unit2){
	
if (unit.equals("����ǧ��")) {
   temp=Float.valueOf(number);
   metre = temp*1000000000;
   
} else if(unit.equals("������")){
	temp=Float.valueOf(number);
	   metre = temp;
}else if (unit.equals("��������")) {
	temp=Float.valueOf(number);
	   metre = temp/1000;
}else if (unit.equals("��������")) {
	temp=Float.valueOf(number);
	   metre = temp/1000000;
}else if (unit.equals("��������")) {
	temp=Float.valueOf(number);
	   metre = temp/1000000000;
}
if (unit2.equals("����ǧ��")) {
	   	   result = metre/1000000000;
	   	   return result;	
	} else if(unit2.equals("��������")){
		result = metre*1000;
	   	   return result;
	}else if (unit2.equals("������")) {
		result = metre;
	   	   return result;
	}else if (unit2.equals("��������")) {
		result = metre*1000000000;
	   	   return result;
	}else if (unit2.equals("��������")) {
		result = metre*1000000;
	   	   return result;
	}
return (Float) null;
}
public float ChangetoUnitweight(String unit,String number,String unit2){
	
if (unit.equals("��")) {
   temp=Float.valueOf(number);
   metre = temp*1000;
   } else if(unit.equals("����")){
	temp=Float.valueOf(number);
	   metre = temp*100;
}else if (unit.equals("ǧ��(����)")) {
	temp=Float.valueOf(number);
	   metre = temp;
}else if (unit.equals("��")) {
	temp=Float.valueOf(number);
	   metre = temp/1000;
}else if (unit.equals("����")) {
	temp=Float.valueOf(number);
	   metre = temp/5000;
}else if (unit.equals("����")) {
	temp=Float.valueOf(number);
	   metre = temp/1000000;
}else if (unit.equals("΢��")) {
	temp=Float.valueOf(number);
	   metre = temp/1000000000;
}
if (unit2.equals("��")) {
	   	   result = metre/1000;
	   	   return result;
	} else if(unit2.equals("����")){
		result = metre/100;
	   	   return result;
	}else if (unit2.equals("ǧ��(����)")) {
		result = metre;
	   	   return result;
	}else if (unit2.equals("��")) {
		result = metre*1000;
	   	   return result;
	}else if (unit2.equals("����")) {
		result = metre*5000;
	   	   return result;
	}else if (unit2.equals("����")) {
		result = metre*1000000;
	   	   return result;
	}else if (unit2.equals("΢��")) {
		result = metre*1000000000;
	   	   return result;
	}
return (Float) null;
}
public float ChangetoUnittemperature(String unit,String number,String unit2){
	
if (unit.equals("���϶�")) {
   temp=Float.valueOf(number);
   metre = (float) (temp+272.15);
   } else if(unit.equals("���϶�")){
	temp=Float.valueOf(number);
	   metre = (float) (temp+457.87);
}else if (unit.equals("������")) {
	temp=Float.valueOf(number);
	   metre = temp;
}
if (unit2.equals("���϶�")) {
	   	   result = (float) (metre-272.15);
	   	   return result;
	} else if(unit2.equals("���϶�")){
		result = (float) (metre-457.87);
	   	   return result;
	}else if (unit2.equals("������")) {
		result = metre;
	   	   return result;
	}
return (Float) null;
}
/**
 * ʱ�任��
 */
public float ChangetoUnittime(String unit,String number,String unit2){
	
	if (unit.equals("��")) {
		   temp=Float.valueOf(number);
		   metre = temp*365*24*60*60;
		   
		} else if(unit.equals("��")){
			temp=Float.valueOf(number);
			   metre = temp*7*24*60*60;
		}else if (unit.equals("��")) {
			temp=Float.valueOf(number);
			   metre = temp*24*60*60;
		}else if (unit.equals("ʱ")) {
			temp=Float.valueOf(number);
			   metre = temp*3600;
		}else if (unit.equals("��")) {
			temp=Float.valueOf(number);
			   metre = temp*60;
		}else if (unit.equals("��")) {
			temp=Float.valueOf(number);
			   metre = temp;
		}else if (unit.equals("����")) {
			temp=Float.valueOf(number);
			   metre = temp/1000;
		}else if (unit.equals("΢��")) {
			temp=Float.valueOf(number);
			   metre = temp/1000000;
		}else if (unit.equals("����")) {
			temp=Float.valueOf(number);
			   metre = temp/1000000000;
		}
		if (unit2.equals("��")) {
			   	   result = metre/60/60/24/365;
			   	   return result;	
			} else if(unit2.equals("��")){
				result = metre/7/24/60/60;
			   	   return result;
			}else if (unit2.equals("��")) {
				result = metre/24/60/60;
			   	   return result;
			}else if (unit2.equals("ʱ")) {
				result = metre/60/60;
			   	   return result;
			}else if (unit2.equals("��")) {
				result = metre/60;
			   	   return result;
			}else if (unit2.equals("��")) {
				result = metre;
			   	   return result;
			}else if (unit2.equals("����")) {
				result = metre*1000;
			   	   return result;
			}else if (unit2.equals("΢��")) {
				result = metre*1000000;
			   	   return result;
			}else if (unit2.equals("����")) {
				result = metre*1000000000;
			   	   return result;
			}
return (Float) null;
}
public float ChangetoUnitspeed(String unit,String number,String unit2){
	
if (unit.equals("ǧ��/��")) {
   temp=Float.valueOf(number);
   metre = temp*1000;
   
} else if(unit.equals("��/��")){
	temp=Float.valueOf(number);
	   metre = temp;
}else if (unit.equals("ǧ��/Сʱ")) {
	temp=Float.valueOf(number);
	   metre = (float) (temp*0.27777);
}else if (unit.equals("���")) {
	temp=Float.valueOf(number);
	   metre = (float) (temp*340.3);
}else if (unit.equals("��")) {
	temp=Float.valueOf(number);
	   metre = (float) (temp*0.5144);
}else if (unit.equals("Ӣ��/Сʱ")) {
	temp=Float.valueOf(number);
	   metre = (float) (temp*0.44704);
}else if (unit.equals("Ӣ��/��")) {
	temp=Float.valueOf(number);
	   metre = (float) (temp*0.3048);
}
if (unit2.equals("ǧ��/��")) {
	   	   result = metre/1000;
	   	   return result;
	} else if(unit2.equals("��/��")){
		result = metre;
	   	   return result;
	}else if (unit2.equals("ǧ��/Сʱ")) {
		result = (float) (metre*3.6);
	   	   return result;
	}else if (unit2.equals("���")) {
		result = (float) (metre*0.00293);
	   	   return result;
	}else if (unit2.equals("��")) {
		result = (float) (metre*1.94384);
	   	   return result;
	}else if (unit2.equals("Ӣ��/Сʱ")) {
		result = (float) (metre*2.23693);
	   	   return result;
	}else if (unit2.equals("Ӣ��/��")) {
		result = (float) (metre*3.28083);
	   	   return result;
	}
return (Float) null;
	
	
}
public float ChangetoUnitenergy(String unit, String number, String unit2) {
	if (unit.equals("�׽�")) {
		   temp=Float.valueOf(number);
		   metre = temp*1000000;
		   
		} else if(unit.equals("ǧ��")){
			temp=Float.valueOf(number);
			   metre = temp*1000;
		}else if (unit.equals("����")) {
			temp=Float.valueOf(number);
			   metre = temp;
		}else if (unit.equals("����")) {
			temp=Float.valueOf(number);
			   metre = temp/10000000;
		}else if (unit.equals("ǧ��(��)")) {
			temp=Float.valueOf(number);
			   metre = temp*4184;
		}else if (unit.equals("��")) {
			temp=Float.valueOf(number);
			   metre = (float) (temp*4.184);
		}
	if (unit2.equals("�׽�")) {
		   	   result = metre/1000000;
		   	   return result;
		}else if (unit2.equals("ǧ��")) {
			   	   result = metre/1000;
			   	   return result;
			} else if(unit2.equals("����")){
				result = metre;
			   	   return result;
			}else if (unit2.equals("����")) {
				result = metre*10000000;
			   	   return result;
			}else if (unit2.equals("ǧ��(��)")) {
				result = metre/4184;
			   	   return result;
			}else if (unit2.equals("��")) {
				result = (float) (metre/4.184);
			   	   return result;
			}
	return 0;
}
}
