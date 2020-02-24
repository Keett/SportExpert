package b4a.example3;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class motorozellikmenu_subs_0 {


public static RemoteObject  _activity_create(RemoteObject _firsttime) throws Exception{
try {
		Debug.PushSubsStack("Activity_Create (motorozellikmenu) ","motorozellikmenu",26,motorozellikmenu.mostCurrent.activityBA,motorozellikmenu.mostCurrent,32);
if (RapidSub.canDelegate("activity_create")) { return b4a.example3.motorozellikmenu.remoteMe.runUserSub(false, "motorozellikmenu","activity_create", _firsttime);}
Debug.locals.put("FirstTime", _firsttime);
 BA.debugLineNum = 32;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
Debug.ShouldStop(-2147483648);
 BA.debugLineNum = 34;BA.debugLine="Activity.LoadLayout(\"MotorOzellikMenuPage\")";
Debug.ShouldStop(2);
motorozellikmenu.mostCurrent._activity.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("MotorOzellikMenuPage")),motorozellikmenu.mostCurrent.activityBA);
 BA.debugLineNum = 36;BA.debugLine="End Sub";
Debug.ShouldStop(8);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _activity_pause(RemoteObject _userclosed) throws Exception{
try {
		Debug.PushSubsStack("Activity_Pause (motorozellikmenu) ","motorozellikmenu",26,motorozellikmenu.mostCurrent.activityBA,motorozellikmenu.mostCurrent,42);
if (RapidSub.canDelegate("activity_pause")) { return b4a.example3.motorozellikmenu.remoteMe.runUserSub(false, "motorozellikmenu","activity_pause", _userclosed);}
Debug.locals.put("UserClosed", _userclosed);
 BA.debugLineNum = 42;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
Debug.ShouldStop(512);
 BA.debugLineNum = 44;BA.debugLine="End Sub";
Debug.ShouldStop(2048);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _activity_resume() throws Exception{
try {
		Debug.PushSubsStack("Activity_Resume (motorozellikmenu) ","motorozellikmenu",26,motorozellikmenu.mostCurrent.activityBA,motorozellikmenu.mostCurrent,38);
if (RapidSub.canDelegate("activity_resume")) { return b4a.example3.motorozellikmenu.remoteMe.runUserSub(false, "motorozellikmenu","activity_resume");}
 BA.debugLineNum = 38;BA.debugLine="Sub Activity_Resume";
Debug.ShouldStop(32);
 BA.debugLineNum = 40;BA.debugLine="End Sub";
Debug.ShouldStop(128);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _buttonanasayfa_click() throws Exception{
try {
		Debug.PushSubsStack("ButtonAnasayfa_Click (motorozellikmenu) ","motorozellikmenu",26,motorozellikmenu.mostCurrent.activityBA,motorozellikmenu.mostCurrent,88);
if (RapidSub.canDelegate("buttonanasayfa_click")) { return b4a.example3.motorozellikmenu.remoteMe.runUserSub(false, "motorozellikmenu","buttonanasayfa_click");}
 BA.debugLineNum = 88;BA.debugLine="Sub ButtonAnasayfa_Click";
Debug.ShouldStop(8388608);
 BA.debugLineNum = 89;BA.debugLine="StartActivity(AnaMenu)";
Debug.ShouldStop(16777216);
motorozellikmenu.mostCurrent.__c.runVoidMethod ("StartActivity",motorozellikmenu.processBA,(Object)((motorozellikmenu.mostCurrent._anamenu.getObject())));
 BA.debugLineNum = 90;BA.debugLine="Activity.Finish";
Debug.ShouldStop(33554432);
motorozellikmenu.mostCurrent._activity.runVoidMethod ("Finish");
 BA.debugLineNum = 91;BA.debugLine="End Sub";
Debug.ShouldStop(67108864);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _buttondayanikliliktest_click() throws Exception{
try {
		Debug.PushSubsStack("ButtonDayaniklilikTest_Click (motorozellikmenu) ","motorozellikmenu",26,motorozellikmenu.mostCurrent.activityBA,motorozellikmenu.mostCurrent,53);
if (RapidSub.canDelegate("buttondayanikliliktest_click")) { return b4a.example3.motorozellikmenu.remoteMe.runUserSub(false, "motorozellikmenu","buttondayanikliliktest_click");}
 BA.debugLineNum = 53;BA.debugLine="Sub ButtonDayaniklilikTest_Click";
Debug.ShouldStop(1048576);
 BA.debugLineNum = 54;BA.debugLine="yapilacakMotorOzellikTest = \"DayaniklilikTest\"";
Debug.ShouldStop(2097152);
motorozellikmenu._yapilacakmotorozelliktest = BA.ObjectToString("DayaniklilikTest");
 BA.debugLineNum = 55;BA.debugLine="motorOzellikTestAdi = \"Dayanıklılık Testi\"";
Debug.ShouldStop(4194304);
motorozellikmenu._motorozelliktestadi = BA.ObjectToString("Dayanıklılık Testi");
 BA.debugLineNum = 56;BA.debugLine="StartActivity(DayaniklilikTestMenu)";
Debug.ShouldStop(8388608);
motorozellikmenu.mostCurrent.__c.runVoidMethod ("StartActivity",motorozellikmenu.processBA,(Object)((motorozellikmenu.mostCurrent._dayanikliliktestmenu.getObject())));
 BA.debugLineNum = 58;BA.debugLine="End Sub";
Debug.ShouldStop(33554432);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _buttondengetest_click() throws Exception{
try {
		Debug.PushSubsStack("ButtonDengeTest_Click (motorozellikmenu) ","motorozellikmenu",26,motorozellikmenu.mostCurrent.activityBA,motorozellikmenu.mostCurrent,67);
if (RapidSub.canDelegate("buttondengetest_click")) { return b4a.example3.motorozellikmenu.remoteMe.runUserSub(false, "motorozellikmenu","buttondengetest_click");}
 BA.debugLineNum = 67;BA.debugLine="Sub ButtonDengeTest_Click";
Debug.ShouldStop(4);
 BA.debugLineNum = 68;BA.debugLine="yapilacakMotorOzellikTest = \"DengeTest\"";
Debug.ShouldStop(8);
motorozellikmenu._yapilacakmotorozelliktest = BA.ObjectToString("DengeTest");
 BA.debugLineNum = 69;BA.debugLine="motorOzellikTestAdi = \"Denge Testi\"";
Debug.ShouldStop(16);
motorozellikmenu._motorozelliktestadi = BA.ObjectToString("Denge Testi");
 BA.debugLineNum = 70;BA.debugLine="StartActivity(DengeTest)";
Debug.ShouldStop(32);
motorozellikmenu.mostCurrent.__c.runVoidMethod ("StartActivity",motorozellikmenu.processBA,(Object)((motorozellikmenu.mostCurrent._dengetest.getObject())));
 BA.debugLineNum = 72;BA.debugLine="End Sub";
Debug.ShouldStop(128);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _buttondikeysicramatest_click() throws Exception{
try {
		Debug.PushSubsStack("ButtonDikeySicramaTest_Click (motorozellikmenu) ","motorozellikmenu",26,motorozellikmenu.mostCurrent.activityBA,motorozellikmenu.mostCurrent,60);
if (RapidSub.canDelegate("buttondikeysicramatest_click")) { return b4a.example3.motorozellikmenu.remoteMe.runUserSub(false, "motorozellikmenu","buttondikeysicramatest_click");}
 BA.debugLineNum = 60;BA.debugLine="Sub ButtonDikeySicramaTest_Click";
Debug.ShouldStop(134217728);
 BA.debugLineNum = 61;BA.debugLine="yapilacakMotorOzellikTest = \"DikeySicramaTest\"";
Debug.ShouldStop(268435456);
motorozellikmenu._yapilacakmotorozelliktest = BA.ObjectToString("DikeySicramaTest");
 BA.debugLineNum = 62;BA.debugLine="motorOzellikTestAdi = \"Dikey Sıçrama Testi\"";
Debug.ShouldStop(536870912);
motorozellikmenu._motorozelliktestadi = BA.ObjectToString("Dikey Sıçrama Testi");
 BA.debugLineNum = 63;BA.debugLine="StartActivity(DikeySicramaTest)";
Debug.ShouldStop(1073741824);
motorozellikmenu.mostCurrent.__c.runVoidMethod ("StartActivity",motorozellikmenu.processBA,(Object)((motorozellikmenu.mostCurrent._dikeysicramatest.getObject())));
 BA.debugLineNum = 65;BA.debugLine="End Sub";
Debug.ShouldStop(1);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _buttonkuvvettest_click() throws Exception{
try {
		Debug.PushSubsStack("ButtonKuvvetTest_Click (motorozellikmenu) ","motorozellikmenu",26,motorozellikmenu.mostCurrent.activityBA,motorozellikmenu.mostCurrent,74);
if (RapidSub.canDelegate("buttonkuvvettest_click")) { return b4a.example3.motorozellikmenu.remoteMe.runUserSub(false, "motorozellikmenu","buttonkuvvettest_click");}
 BA.debugLineNum = 74;BA.debugLine="Sub ButtonKuvvetTest_Click";
Debug.ShouldStop(512);
 BA.debugLineNum = 75;BA.debugLine="yapilacakMotorOzellikTest = \"KuvvetTest\"";
Debug.ShouldStop(1024);
motorozellikmenu._yapilacakmotorozelliktest = BA.ObjectToString("KuvvetTest");
 BA.debugLineNum = 76;BA.debugLine="motorOzellikTestAdi = \"Kuvvet Testi\"";
Debug.ShouldStop(2048);
motorozellikmenu._motorozelliktestadi = BA.ObjectToString("Kuvvet Testi");
 BA.debugLineNum = 77;BA.debugLine="StartActivity(KuvvetTest)";
Debug.ShouldStop(4096);
motorozellikmenu.mostCurrent.__c.runVoidMethod ("StartActivity",motorozellikmenu.processBA,(Object)((motorozellikmenu.mostCurrent._kuvvettest.getObject())));
 BA.debugLineNum = 79;BA.debugLine="End Sub";
Debug.ShouldStop(16384);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _buttonreaksiyontest_click() throws Exception{
try {
		Debug.PushSubsStack("ButtonReaksiyonTest_Click (motorozellikmenu) ","motorozellikmenu",26,motorozellikmenu.mostCurrent.activityBA,motorozellikmenu.mostCurrent,81);
if (RapidSub.canDelegate("buttonreaksiyontest_click")) { return b4a.example3.motorozellikmenu.remoteMe.runUserSub(false, "motorozellikmenu","buttonreaksiyontest_click");}
 BA.debugLineNum = 81;BA.debugLine="Sub ButtonReaksiyonTest_Click";
Debug.ShouldStop(65536);
 BA.debugLineNum = 82;BA.debugLine="yapilacakMotorOzellikTest = \"ReaksiyonTest\"";
Debug.ShouldStop(131072);
motorozellikmenu._yapilacakmotorozelliktest = BA.ObjectToString("ReaksiyonTest");
 BA.debugLineNum = 83;BA.debugLine="motorOzellikTestAdi = \"Reaksiyon Testi\"";
Debug.ShouldStop(262144);
motorozellikmenu._motorozelliktestadi = BA.ObjectToString("Reaksiyon Testi");
 BA.debugLineNum = 84;BA.debugLine="StartActivity(ReaksiyonTest)";
Debug.ShouldStop(524288);
motorozellikmenu.mostCurrent.__c.runVoidMethod ("StartActivity",motorozellikmenu.processBA,(Object)((motorozellikmenu.mostCurrent._reaksiyontest.getObject())));
 BA.debugLineNum = 86;BA.debugLine="End Sub";
Debug.ShouldStop(2097152);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _buttonsurattest_click() throws Exception{
try {
		Debug.PushSubsStack("ButtonSuratTest_Click (motorozellikmenu) ","motorozellikmenu",26,motorozellikmenu.mostCurrent.activityBA,motorozellikmenu.mostCurrent,46);
if (RapidSub.canDelegate("buttonsurattest_click")) { return b4a.example3.motorozellikmenu.remoteMe.runUserSub(false, "motorozellikmenu","buttonsurattest_click");}
 BA.debugLineNum = 46;BA.debugLine="Sub ButtonSuratTest_Click";
Debug.ShouldStop(8192);
 BA.debugLineNum = 47;BA.debugLine="yapilacakMotorOzellikTest = \"SuratTest\"";
Debug.ShouldStop(16384);
motorozellikmenu._yapilacakmotorozelliktest = BA.ObjectToString("SuratTest");
 BA.debugLineNum = 48;BA.debugLine="motorOzellikTestAdi = \"Sürat (Sprint) Testi\"";
Debug.ShouldStop(32768);
motorozellikmenu._motorozelliktestadi = BA.ObjectToString("Sürat (Sprint) Testi");
 BA.debugLineNum = 49;BA.debugLine="StartActivity(SuratTestListele)";
Debug.ShouldStop(65536);
motorozellikmenu.mostCurrent.__c.runVoidMethod ("StartActivity",motorozellikmenu.processBA,(Object)((motorozellikmenu.mostCurrent._surattestlistele.getObject())));
 BA.debugLineNum = 51;BA.debugLine="End Sub";
Debug.ShouldStop(262144);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _globals() throws Exception{
 //BA.debugLineNum = 13;BA.debugLine="Sub Globals";
 //BA.debugLineNum = 17;BA.debugLine="Private ButtonSuratTest As Button";
motorozellikmenu.mostCurrent._buttonsurattest = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 18;BA.debugLine="Private ButtonDayaniklilikTest As Button";
motorozellikmenu.mostCurrent._buttondayanikliliktest = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 19;BA.debugLine="Private ButtonDikeySicramaTest As Button";
motorozellikmenu.mostCurrent._buttondikeysicramatest = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 20;BA.debugLine="Private ButtonDengeTest As Button";
motorozellikmenu.mostCurrent._buttondengetest = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 21;BA.debugLine="Private ButtonKuvvetTest As Button";
motorozellikmenu.mostCurrent._buttonkuvvettest = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 22;BA.debugLine="Private ButtonReaksiyonTest As Button";
motorozellikmenu.mostCurrent._buttonreaksiyontest = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 23;BA.debugLine="Private LabelSuratTest As Label";
motorozellikmenu.mostCurrent._labelsurattest = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 24;BA.debugLine="Private LabelDikeySicramaTest As Label";
motorozellikmenu.mostCurrent._labeldikeysicramatest = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 25;BA.debugLine="Private LabelDengeTest As Label";
motorozellikmenu.mostCurrent._labeldengetest = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 26;BA.debugLine="Private LabelKuvvetTest As Label";
motorozellikmenu.mostCurrent._labelkuvvettest = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 27;BA.debugLine="Private LabelReaksiyonTest As Label";
motorozellikmenu.mostCurrent._labelreaksiyontest = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 29;BA.debugLine="Private ButtonAnasayfa As Button";
motorozellikmenu.mostCurrent._buttonanasayfa = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 30;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _process_globals() throws Exception{
 //BA.debugLineNum = 6;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 9;BA.debugLine="Dim yapilacakMotorOzellikTest As String = \"\"";
motorozellikmenu._yapilacakmotorozelliktest = BA.ObjectToString("");
 //BA.debugLineNum = 10;BA.debugLine="Dim motorOzellikTestAdi As String = \"\"";
motorozellikmenu._motorozelliktestadi = BA.ObjectToString("");
 //BA.debugLineNum = 11;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
}