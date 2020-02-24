package b4a.example3;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class dayanikliliktestlistele_subs_0 {


public static RemoteObject  _activity_create(RemoteObject _firsttime) throws Exception{
try {
		Debug.PushSubsStack("Activity_Create (dayanikliliktestlistele) ","dayanikliliktestlistele",3,dayanikliliktestlistele.mostCurrent.activityBA,dayanikliliktestlistele.mostCurrent,31);
if (RapidSub.canDelegate("activity_create")) { return b4a.example3.dayanikliliktestlistele.remoteMe.runUserSub(false, "dayanikliliktestlistele","activity_create", _firsttime);}
Debug.locals.put("FirstTime", _firsttime);
 BA.debugLineNum = 31;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
Debug.ShouldStop(1073741824);
 BA.debugLineNum = 33;BA.debugLine="Activity.LoadLayout(\"DayaniklilikTestListelePage\"";
Debug.ShouldStop(1);
dayanikliliktestlistele.mostCurrent._activity.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("DayaniklilikTestListelePage")),dayanikliliktestlistele.mostCurrent.activityBA);
 BA.debugLineNum = 34;BA.debugLine="LabelCarpi.Visible = False";
Debug.ShouldStop(2);
dayanikliliktestlistele.mostCurrent._labelcarpi.runMethod(true,"setVisible",dayanikliliktestlistele.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 37;BA.debugLine="EditTextAra.TextColor = Colors.White";
Debug.ShouldStop(16);
dayanikliliktestlistele.mostCurrent._edittextara.runMethod(true,"setTextColor",dayanikliliktestlistele.mostCurrent.__c.getField(false,"Colors").getField(true,"White"));
 BA.debugLineNum = 38;BA.debugLine="EditTextAra.Hint = \"Bu alana yazarak aratabilirsi";
Debug.ShouldStop(32);
dayanikliliktestlistele.mostCurrent._edittextara.runMethod(true,"setHint",BA.ObjectToString("Bu alana yazarak aratabilirsiniz.."));
 BA.debugLineNum = 39;BA.debugLine="EditTextAra.HintColor = Color.hintColor";
Debug.ShouldStop(64);
dayanikliliktestlistele.mostCurrent._edittextara.runMethod(true,"setHintColor",dayanikliliktestlistele.mostCurrent._color._hintcolor /*RemoteObject*/ );
 BA.debugLineNum = 40;BA.debugLine="EditTextAra.TextSize = 20";
Debug.ShouldStop(128);
dayanikliliktestlistele.mostCurrent._edittextara.runMethod(true,"setTextSize",BA.numberCast(float.class, 20));
 BA.debugLineNum = 41;BA.debugLine="EditTextAra.Typeface = Typeface.DEFAULT_BOLD";
Debug.ShouldStop(256);
dayanikliliktestlistele.mostCurrent._edittextara.runMethod(false,"setTypeface",dayanikliliktestlistele.mostCurrent.__c.getField(false,"Typeface").getField(false,"DEFAULT_BOLD"));
 BA.debugLineNum = 43;BA.debugLine="ButtonDenekTC.TextColor = Color.koyuMavi";
Debug.ShouldStop(1024);
dayanikliliktestlistele.mostCurrent._buttondenektc.runMethod(true,"setTextColor",dayanikliliktestlistele.mostCurrent._color._koyumavi /*RemoteObject*/ );
 BA.debugLineNum = 44;BA.debugLine="ButtonDenekTC.Typeface = Typeface.DEFAULT_BOLD";
Debug.ShouldStop(2048);
dayanikliliktestlistele.mostCurrent._buttondenektc.runMethod(false,"setTypeface",dayanikliliktestlistele.mostCurrent.__c.getField(false,"Typeface").getField(false,"DEFAULT_BOLD"));
 BA.debugLineNum = 45;BA.debugLine="ButtonDenekTC.TextSize = 14";
Debug.ShouldStop(4096);
dayanikliliktestlistele.mostCurrent._buttondenektc.runMethod(true,"setTextSize",BA.numberCast(float.class, 14));
 BA.debugLineNum = 46;BA.debugLine="ButtonDenekTC.SingleLine = True";
Debug.ShouldStop(8192);
dayanikliliktestlistele.mostCurrent._buttondenektc.runVoidMethod ("setSingleLine",dayanikliliktestlistele.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 48;BA.debugLine="ButtonDenekIsim.TextColor = Color.koyuMavi";
Debug.ShouldStop(32768);
dayanikliliktestlistele.mostCurrent._buttondenekisim.runMethod(true,"setTextColor",dayanikliliktestlistele.mostCurrent._color._koyumavi /*RemoteObject*/ );
 BA.debugLineNum = 49;BA.debugLine="ButtonDenekIsim.Typeface = Typeface.DEFAULT_BOLD";
Debug.ShouldStop(65536);
dayanikliliktestlistele.mostCurrent._buttondenekisim.runMethod(false,"setTypeface",dayanikliliktestlistele.mostCurrent.__c.getField(false,"Typeface").getField(false,"DEFAULT_BOLD"));
 BA.debugLineNum = 50;BA.debugLine="ButtonDenekIsim.TextSize = 14";
Debug.ShouldStop(131072);
dayanikliliktestlistele.mostCurrent._buttondenekisim.runMethod(true,"setTextSize",BA.numberCast(float.class, 14));
 BA.debugLineNum = 51;BA.debugLine="ButtonDenekIsim.SingleLine = True";
Debug.ShouldStop(262144);
dayanikliliktestlistele.mostCurrent._buttondenekisim.runVoidMethod ("setSingleLine",dayanikliliktestlistele.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 53;BA.debugLine="ButtonProgramAdi.TextColor = Color.koyuMavi";
Debug.ShouldStop(1048576);
dayanikliliktestlistele.mostCurrent._buttonprogramadi.runMethod(true,"setTextColor",dayanikliliktestlistele.mostCurrent._color._koyumavi /*RemoteObject*/ );
 BA.debugLineNum = 54;BA.debugLine="ButtonProgramAdi.Typeface = Typeface.DEFAULT_BOLD";
Debug.ShouldStop(2097152);
dayanikliliktestlistele.mostCurrent._buttonprogramadi.runMethod(false,"setTypeface",dayanikliliktestlistele.mostCurrent.__c.getField(false,"Typeface").getField(false,"DEFAULT_BOLD"));
 BA.debugLineNum = 55;BA.debugLine="ButtonProgramAdi.TextSize = 14";
Debug.ShouldStop(4194304);
dayanikliliktestlistele.mostCurrent._buttonprogramadi.runMethod(true,"setTextSize",BA.numberCast(float.class, 14));
 BA.debugLineNum = 56;BA.debugLine="ButtonProgramAdi.SingleLine = True";
Debug.ShouldStop(8388608);
dayanikliliktestlistele.mostCurrent._buttonprogramadi.runVoidMethod ("setSingleLine",dayanikliliktestlistele.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 58;BA.debugLine="ButtonTestTuru.TextColor = Color.koyuMavi";
Debug.ShouldStop(33554432);
dayanikliliktestlistele.mostCurrent._buttontestturu.runMethod(true,"setTextColor",dayanikliliktestlistele.mostCurrent._color._koyumavi /*RemoteObject*/ );
 BA.debugLineNum = 59;BA.debugLine="ButtonTestTuru.Typeface = Typeface.DEFAULT_BOLD";
Debug.ShouldStop(67108864);
dayanikliliktestlistele.mostCurrent._buttontestturu.runMethod(false,"setTypeface",dayanikliliktestlistele.mostCurrent.__c.getField(false,"Typeface").getField(false,"DEFAULT_BOLD"));
 BA.debugLineNum = 60;BA.debugLine="ButtonTestTuru.TextSize = 14";
Debug.ShouldStop(134217728);
dayanikliliktestlistele.mostCurrent._buttontestturu.runMethod(true,"setTextSize",BA.numberCast(float.class, 14));
 BA.debugLineNum = 61;BA.debugLine="ButtonTestTuru.SingleLine = True";
Debug.ShouldStop(268435456);
dayanikliliktestlistele.mostCurrent._buttontestturu.runVoidMethod ("setSingleLine",dayanikliliktestlistele.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 63;BA.debugLine="ButtonLevel.TextColor = Color.koyuMavi";
Debug.ShouldStop(1073741824);
dayanikliliktestlistele.mostCurrent._buttonlevel.runMethod(true,"setTextColor",dayanikliliktestlistele.mostCurrent._color._koyumavi /*RemoteObject*/ );
 BA.debugLineNum = 64;BA.debugLine="ButtonLevel.Typeface = Typeface.DEFAULT_BOLD";
Debug.ShouldStop(-2147483648);
dayanikliliktestlistele.mostCurrent._buttonlevel.runMethod(false,"setTypeface",dayanikliliktestlistele.mostCurrent.__c.getField(false,"Typeface").getField(false,"DEFAULT_BOLD"));
 BA.debugLineNum = 65;BA.debugLine="ButtonLevel.TextSize = 14";
Debug.ShouldStop(1);
dayanikliliktestlistele.mostCurrent._buttonlevel.runMethod(true,"setTextSize",BA.numberCast(float.class, 14));
 BA.debugLineNum = 66;BA.debugLine="ButtonLevel.SingleLine = True";
Debug.ShouldStop(2);
dayanikliliktestlistele.mostCurrent._buttonlevel.runVoidMethod ("setSingleLine",dayanikliliktestlistele.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 68;BA.debugLine="ButtonMekikSayisi.TextColor = Color.koyuMavi";
Debug.ShouldStop(8);
dayanikliliktestlistele.mostCurrent._buttonmekiksayisi.runMethod(true,"setTextColor",dayanikliliktestlistele.mostCurrent._color._koyumavi /*RemoteObject*/ );
 BA.debugLineNum = 69;BA.debugLine="ButtonMekikSayisi.Typeface = Typeface.DEFAULT_BOL";
Debug.ShouldStop(16);
dayanikliliktestlistele.mostCurrent._buttonmekiksayisi.runMethod(false,"setTypeface",dayanikliliktestlistele.mostCurrent.__c.getField(false,"Typeface").getField(false,"DEFAULT_BOLD"));
 BA.debugLineNum = 70;BA.debugLine="ButtonMekikSayisi.TextSize = 14";
Debug.ShouldStop(32);
dayanikliliktestlistele.mostCurrent._buttonmekiksayisi.runMethod(true,"setTextSize",BA.numberCast(float.class, 14));
 BA.debugLineNum = 71;BA.debugLine="ButtonMekikSayisi.SingleLine = True";
Debug.ShouldStop(64);
dayanikliliktestlistele.mostCurrent._buttonmekiksayisi.runVoidMethod ("setSingleLine",dayanikliliktestlistele.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 73;BA.debugLine="ButtonTarih.TextColor = Color.koyuMavi";
Debug.ShouldStop(256);
dayanikliliktestlistele.mostCurrent._buttontarih.runMethod(true,"setTextColor",dayanikliliktestlistele.mostCurrent._color._koyumavi /*RemoteObject*/ );
 BA.debugLineNum = 74;BA.debugLine="ButtonTarih.Typeface = Typeface.DEFAULT_BOLD";
Debug.ShouldStop(512);
dayanikliliktestlistele.mostCurrent._buttontarih.runMethod(false,"setTypeface",dayanikliliktestlistele.mostCurrent.__c.getField(false,"Typeface").getField(false,"DEFAULT_BOLD"));
 BA.debugLineNum = 75;BA.debugLine="ButtonTarih.TextSize = 14";
Debug.ShouldStop(1024);
dayanikliliktestlistele.mostCurrent._buttontarih.runMethod(true,"setTextSize",BA.numberCast(float.class, 14));
 BA.debugLineNum = 76;BA.debugLine="ButtonTarih.SingleLine = True";
Debug.ShouldStop(2048);
dayanikliliktestlistele.mostCurrent._buttontarih.runVoidMethod ("setSingleLine",dayanikliliktestlistele.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 78;BA.debugLine="WebView1.JavaScriptEnabled = True";
Debug.ShouldStop(8192);
dayanikliliktestlistele.mostCurrent._webview1.runMethod(true,"setJavaScriptEnabled",dayanikliliktestlistele.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 79;BA.debugLine="WebView1.ZoomEnabled = True";
Debug.ShouldStop(16384);
dayanikliliktestlistele.mostCurrent._webview1.runMethod(true,"setZoomEnabled",dayanikliliktestlistele.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 83;BA.debugLine="HTMLGosterDB";
Debug.ShouldStop(262144);
_htmlgosterdb();
 BA.debugLineNum = 85;BA.debugLine="End Sub";
Debug.ShouldStop(1048576);
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
		Debug.PushSubsStack("Activity_Pause (dayanikliliktestlistele) ","dayanikliliktestlistele",3,dayanikliliktestlistele.mostCurrent.activityBA,dayanikliliktestlistele.mostCurrent,91);
if (RapidSub.canDelegate("activity_pause")) { return b4a.example3.dayanikliliktestlistele.remoteMe.runUserSub(false, "dayanikliliktestlistele","activity_pause", _userclosed);}
Debug.locals.put("UserClosed", _userclosed);
 BA.debugLineNum = 91;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
Debug.ShouldStop(67108864);
 BA.debugLineNum = 93;BA.debugLine="End Sub";
Debug.ShouldStop(268435456);
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
		Debug.PushSubsStack("Activity_Resume (dayanikliliktestlistele) ","dayanikliliktestlistele",3,dayanikliliktestlistele.mostCurrent.activityBA,dayanikliliktestlistele.mostCurrent,87);
if (RapidSub.canDelegate("activity_resume")) { return b4a.example3.dayanikliliktestlistele.remoteMe.runUserSub(false, "dayanikliliktestlistele","activity_resume");}
 BA.debugLineNum = 87;BA.debugLine="Sub Activity_Resume";
Debug.ShouldStop(4194304);
 BA.debugLineNum = 89;BA.debugLine="End Sub";
Debug.ShouldStop(16777216);
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
		Debug.PushSubsStack("ButtonAnasayfa_Click (dayanikliliktestlistele) ","dayanikliliktestlistele",3,dayanikliliktestlistele.mostCurrent.activityBA,dayanikliliktestlistele.mostCurrent,99);
if (RapidSub.canDelegate("buttonanasayfa_click")) { return b4a.example3.dayanikliliktestlistele.remoteMe.runUserSub(false, "dayanikliliktestlistele","buttonanasayfa_click");}
 BA.debugLineNum = 99;BA.debugLine="Sub ButtonAnasayfa_Click";
Debug.ShouldStop(4);
 BA.debugLineNum = 100;BA.debugLine="StartActivity(AnaMenu)";
Debug.ShouldStop(8);
dayanikliliktestlistele.mostCurrent.__c.runVoidMethod ("StartActivity",dayanikliliktestlistele.processBA,(Object)((dayanikliliktestlistele.mostCurrent._anamenu.getObject())));
 BA.debugLineNum = 101;BA.debugLine="Activity.Finish";
Debug.ShouldStop(16);
dayanikliliktestlistele.mostCurrent._activity.runVoidMethod ("Finish");
 BA.debugLineNum = 102;BA.debugLine="End Sub";
Debug.ShouldStop(32);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _buttondayanikliliktestekle_click() throws Exception{
try {
		Debug.PushSubsStack("ButtonDayaniklilikTestEkle_Click (dayanikliliktestlistele) ","dayanikliliktestlistele",3,dayanikliliktestlistele.mostCurrent.activityBA,dayanikliliktestlistele.mostCurrent,118);
if (RapidSub.canDelegate("buttondayanikliliktestekle_click")) { return b4a.example3.dayanikliliktestlistele.remoteMe.runUserSub(false, "dayanikliliktestlistele","buttondayanikliliktestekle_click");}
 BA.debugLineNum = 118;BA.debugLine="Sub ButtonDayaniklilikTestEkle_Click";
Debug.ShouldStop(2097152);
 BA.debugLineNum = 119;BA.debugLine="StartActivity(GelismisTestDenekAra)";
Debug.ShouldStop(4194304);
dayanikliliktestlistele.mostCurrent.__c.runVoidMethod ("StartActivity",dayanikliliktestlistele.processBA,(Object)((dayanikliliktestlistele.mostCurrent._gelismistestdenekara.getObject())));
 BA.debugLineNum = 120;BA.debugLine="Activity.finish";
Debug.ShouldStop(8388608);
dayanikliliktestlistele.mostCurrent._activity.runVoidMethod ("Finish");
 BA.debugLineNum = 121;BA.debugLine="End Sub";
Debug.ShouldStop(16777216);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _buttondenekisim_click() throws Exception{
try {
		Debug.PushSubsStack("ButtonDenekIsim_Click (dayanikliliktestlistele) ","dayanikliliktestlistele",3,dayanikliliktestlistele.mostCurrent.activityBA,dayanikliliktestlistele.mostCurrent,133);
if (RapidSub.canDelegate("buttondenekisim_click")) { return b4a.example3.dayanikliliktestlistele.remoteMe.runUserSub(false, "dayanikliliktestlistele","buttondenekisim_click");}
 BA.debugLineNum = 133;BA.debugLine="Sub ButtonDenekIsim_Click";
Debug.ShouldStop(16);
 BA.debugLineNum = 135;BA.debugLine="End Sub";
Debug.ShouldStop(64);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _buttondenektc_click() throws Exception{
try {
		Debug.PushSubsStack("ButtonDenekTC_Click (dayanikliliktestlistele) ","dayanikliliktestlistele",3,dayanikliliktestlistele.mostCurrent.activityBA,dayanikliliktestlistele.mostCurrent,129);
if (RapidSub.canDelegate("buttondenektc_click")) { return b4a.example3.dayanikliliktestlistele.remoteMe.runUserSub(false, "dayanikliliktestlistele","buttondenektc_click");}
 BA.debugLineNum = 129;BA.debugLine="Sub ButtonDenekTC_Click";
Debug.ShouldStop(1);
 BA.debugLineNum = 130;BA.debugLine="WebView1.LoadHtml(DBUtils.ExecuteHtml(Main.sql, \"";
Debug.ShouldStop(2);
dayanikliliktestlistele.mostCurrent._webview1.runVoidMethod ("LoadHtml",(Object)(dayanikliliktestlistele.mostCurrent._dbutils.runMethod(true,"_executehtml" /*RemoteObject*/ ,dayanikliliktestlistele.mostCurrent.activityBA,(Object)(dayanikliliktestlistele.mostCurrent._main._sql /*RemoteObject*/ ),(Object)(RemoteObject.concat(RemoteObject.createImmutable("SELECT denektc1 As [TC1],denektc2 As [TC2], denektc3 As [TC3],denektc4 As [TC4],denektc5 As [TC5],denektc6 As [TC6],denektc7 As [TC7],denektc8 As [TC8],denektc9 As [TC9],denektc10 As [TC10],dayaniklilik_tarih As [TARİH],program_adi As [PROGRAM], mekik_sayisi As [MEKİK] FROM DayaniklilikTest, DayaniklilikTestProgram WHERE DayaniklilikTest.program_id = DayaniklilikTestProgram.program_id AND (denektc1 LIKE '%"),dayanikliliktestlistele.mostCurrent._edittextara.runMethod(true,"getText"),RemoteObject.createImmutable("%' OR denektc2 LIKE '%"),dayanikliliktestlistele.mostCurrent._edittextara.runMethod(true,"getText"),RemoteObject.createImmutable("%' OR denektc3 LIKE '%"),dayanikliliktestlistele.mostCurrent._edittextara.runMethod(true,"getText"),RemoteObject.createImmutable("%' OR denektc4 LIKE '%"),dayanikliliktestlistele.mostCurrent._edittextara.runMethod(true,"getText"),RemoteObject.createImmutable("%' OR denektc5 LIKE '%"),dayanikliliktestlistele.mostCurrent._edittextara.runMethod(true,"getText"),RemoteObject.createImmutable("%' OR denektc6 LIKE '%"),dayanikliliktestlistele.mostCurrent._edittextara.runMethod(true,"getText"),RemoteObject.createImmutable("%'  OR denektc7 LIKE '%"),dayanikliliktestlistele.mostCurrent._edittextara.runMethod(true,"getText"),RemoteObject.createImmutable("%' OR denektc8 LIKE '%"),dayanikliliktestlistele.mostCurrent._edittextara.runMethod(true,"getText"),RemoteObject.createImmutable("%' OR denektc9 LIKE '%"),dayanikliliktestlistele.mostCurrent._edittextara.runMethod(true,"getText"),RemoteObject.createImmutable("%' OR denektc10 LIKE '%"),dayanikliliktestlistele.mostCurrent._edittextara.runMethod(true,"getText"),RemoteObject.createImmutable("%') ORDER BY dayaniklilik_id DESC"))),(Object)((dayanikliliktestlistele.mostCurrent.__c.getField(false,"Null"))),(Object)(BA.numberCast(int.class, -(double) (0 + 1))),(Object)(dayanikliliktestlistele.mostCurrent.__c.getField(true,"False")))));
 BA.debugLineNum = 131;BA.debugLine="End Sub";
Debug.ShouldStop(4);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _buttonlevel_click() throws Exception{
try {
		Debug.PushSubsStack("ButtonLevel_Click (dayanikliliktestlistele) ","dayanikliliktestlistele",3,dayanikliliktestlistele.mostCurrent.activityBA,dayanikliliktestlistele.mostCurrent,145);
if (RapidSub.canDelegate("buttonlevel_click")) { return b4a.example3.dayanikliliktestlistele.remoteMe.runUserSub(false, "dayanikliliktestlistele","buttonlevel_click");}
 BA.debugLineNum = 145;BA.debugLine="Sub ButtonLevel_Click";
Debug.ShouldStop(65536);
 BA.debugLineNum = 147;BA.debugLine="End Sub";
Debug.ShouldStop(262144);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _buttonmekiksayisi_click() throws Exception{
try {
		Debug.PushSubsStack("ButtonMekikSayisi_Click (dayanikliliktestlistele) ","dayanikliliktestlistele",3,dayanikliliktestlistele.mostCurrent.activityBA,dayanikliliktestlistele.mostCurrent,149);
if (RapidSub.canDelegate("buttonmekiksayisi_click")) { return b4a.example3.dayanikliliktestlistele.remoteMe.runUserSub(false, "dayanikliliktestlistele","buttonmekiksayisi_click");}
 BA.debugLineNum = 149;BA.debugLine="Sub ButtonMekikSayisi_Click";
Debug.ShouldStop(1048576);
 BA.debugLineNum = 151;BA.debugLine="End Sub";
Debug.ShouldStop(4194304);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _buttonprogramadi_click() throws Exception{
try {
		Debug.PushSubsStack("ButtonProgramAdi_Click (dayanikliliktestlistele) ","dayanikliliktestlistele",3,dayanikliliktestlistele.mostCurrent.activityBA,dayanikliliktestlistele.mostCurrent,137);
if (RapidSub.canDelegate("buttonprogramadi_click")) { return b4a.example3.dayanikliliktestlistele.remoteMe.runUserSub(false, "dayanikliliktestlistele","buttonprogramadi_click");}
 BA.debugLineNum = 137;BA.debugLine="Sub ButtonProgramAdi_Click";
Debug.ShouldStop(256);
 BA.debugLineNum = 139;BA.debugLine="End Sub";
Debug.ShouldStop(1024);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _buttonsil_click() throws Exception{
try {
		Debug.PushSubsStack("ButtonSil_Click (dayanikliliktestlistele) ","dayanikliliktestlistele",3,dayanikliliktestlistele.mostCurrent.activityBA,dayanikliliktestlistele.mostCurrent,123);
if (RapidSub.canDelegate("buttonsil_click")) { return b4a.example3.dayanikliliktestlistele.remoteMe.runUserSub(false, "dayanikliliktestlistele","buttonsil_click");}
 BA.debugLineNum = 123;BA.debugLine="Sub ButtonSil_Click";
Debug.ShouldStop(67108864);
 BA.debugLineNum = 124;BA.debugLine="StartActivity(DayaniklilikTestSil)";
Debug.ShouldStop(134217728);
dayanikliliktestlistele.mostCurrent.__c.runVoidMethod ("StartActivity",dayanikliliktestlistele.processBA,(Object)((dayanikliliktestlistele.mostCurrent._dayanikliliktestsil.getObject())));
 BA.debugLineNum = 125;BA.debugLine="Activity.Finish";
Debug.ShouldStop(268435456);
dayanikliliktestlistele.mostCurrent._activity.runVoidMethod ("Finish");
 BA.debugLineNum = 126;BA.debugLine="End Sub";
Debug.ShouldStop(536870912);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _buttontarih_click() throws Exception{
try {
		Debug.PushSubsStack("ButtonTarih_Click (dayanikliliktestlistele) ","dayanikliliktestlistele",3,dayanikliliktestlistele.mostCurrent.activityBA,dayanikliliktestlistele.mostCurrent,153);
if (RapidSub.canDelegate("buttontarih_click")) { return b4a.example3.dayanikliliktestlistele.remoteMe.runUserSub(false, "dayanikliliktestlistele","buttontarih_click");}
 BA.debugLineNum = 153;BA.debugLine="Sub ButtonTarih_Click";
Debug.ShouldStop(16777216);
 BA.debugLineNum = 155;BA.debugLine="End Sub";
Debug.ShouldStop(67108864);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _buttontestturu_click() throws Exception{
try {
		Debug.PushSubsStack("ButtonTestTuru_Click (dayanikliliktestlistele) ","dayanikliliktestlistele",3,dayanikliliktestlistele.mostCurrent.activityBA,dayanikliliktestlistele.mostCurrent,141);
if (RapidSub.canDelegate("buttontestturu_click")) { return b4a.example3.dayanikliliktestlistele.remoteMe.runUserSub(false, "dayanikliliktestlistele","buttontestturu_click");}
 BA.debugLineNum = 141;BA.debugLine="Sub ButtonTestTuru_Click";
Debug.ShouldStop(4096);
 BA.debugLineNum = 143;BA.debugLine="End Sub";
Debug.ShouldStop(16384);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _edittextara_textchanged(RemoteObject _old,RemoteObject _new) throws Exception{
try {
		Debug.PushSubsStack("EditTextAra_TextChanged (dayanikliliktestlistele) ","dayanikliliktestlistele",3,dayanikliliktestlistele.mostCurrent.activityBA,dayanikliliktestlistele.mostCurrent,104);
if (RapidSub.canDelegate("edittextara_textchanged")) { return b4a.example3.dayanikliliktestlistele.remoteMe.runUserSub(false, "dayanikliliktestlistele","edittextara_textchanged", _old, _new);}
Debug.locals.put("Old", _old);
Debug.locals.put("New", _new);
 BA.debugLineNum = 104;BA.debugLine="Sub EditTextAra_TextChanged (Old As String, New As";
Debug.ShouldStop(128);
 BA.debugLineNum = 105;BA.debugLine="LabelCarpi.Visible = True";
Debug.ShouldStop(256);
dayanikliliktestlistele.mostCurrent._labelcarpi.runMethod(true,"setVisible",dayanikliliktestlistele.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 106;BA.debugLine="WebView1.LoadHtml(DBUtils.ExecuteHtml(Main.sql, \"";
Debug.ShouldStop(512);
dayanikliliktestlistele.mostCurrent._webview1.runVoidMethod ("LoadHtml",(Object)(dayanikliliktestlistele.mostCurrent._dbutils.runMethod(true,"_executehtml" /*RemoteObject*/ ,dayanikliliktestlistele.mostCurrent.activityBA,(Object)(dayanikliliktestlistele.mostCurrent._main._sql /*RemoteObject*/ ),(Object)(RemoteObject.concat(RemoteObject.createImmutable("SELECT dayaniklilik_tarih As [TARİH],program_adi As [PROGRAM], mekik_sayisi As [MEKİK], denektc1 As [TC1], denekIsim1 As [İSİM1], denektc2 As [TC2], denekIsim2 As [İSİM2],denektc3 As [TC3], denekIsim3 As [İSİM3],denektc4 As [TC4], denekIsim4 As [İSİM4],denektc5 As [TC5], denekIsim5 As [İSİM5],denektc6 As [TC6], denekIsim6 As [İSİM6],denektc7 As [TC7], denekIsim7 As [İSİM7],denektc8 As [TC8], denekIsim8 As [İSİM8],denektc9 As [TC9], denekIsim9 As [İSİM9],denektc10 As [TC10], denekIsim10 As [İSİM10] FROM DayaniklilikTest, DayaniklilikTestProgram WHERE DayaniklilikTest.program_id = DayaniklilikTestProgram.program_id AND (denektc1 LIKE '%"),dayanikliliktestlistele.mostCurrent._edittextara.runMethod(true,"getText"),RemoteObject.createImmutable("%' OR denekIsim1 LIKE '%"),dayanikliliktestlistele.mostCurrent._edittextara.runMethod(true,"getText"),RemoteObject.createImmutable("%' OR denektc2 LIKE '%"),dayanikliliktestlistele.mostCurrent._edittextara.runMethod(true,"getText"),RemoteObject.createImmutable("%' OR denekIsim2 LIKE '%"),dayanikliliktestlistele.mostCurrent._edittextara.runMethod(true,"getText"),RemoteObject.createImmutable("%' OR denektc3 LIKE '%"),dayanikliliktestlistele.mostCurrent._edittextara.runMethod(true,"getText"),RemoteObject.createImmutable("%' OR denekIsim3 LIKE '%"),dayanikliliktestlistele.mostCurrent._edittextara.runMethod(true,"getText"),RemoteObject.createImmutable("%' OR denektc4 LIKE '%"),dayanikliliktestlistele.mostCurrent._edittextara.runMethod(true,"getText"),RemoteObject.createImmutable("%' OR denekIsim4 LIKE '%"),dayanikliliktestlistele.mostCurrent._edittextara.runMethod(true,"getText"),RemoteObject.createImmutable("%' OR denektc5 LIKE '%"),dayanikliliktestlistele.mostCurrent._edittextara.runMethod(true,"getText"),RemoteObject.createImmutable("%' OR denekIsim5 LIKE '%"),dayanikliliktestlistele.mostCurrent._edittextara.runMethod(true,"getText"),RemoteObject.createImmutable("%' OR denektc6 LIKE '%"),dayanikliliktestlistele.mostCurrent._edittextara.runMethod(true,"getText"),RemoteObject.createImmutable("%' OR denekIsim6 LIKE '%"),dayanikliliktestlistele.mostCurrent._edittextara.runMethod(true,"getText"),RemoteObject.createImmutable("%' OR denektc7 LIKE '%"),dayanikliliktestlistele.mostCurrent._edittextara.runMethod(true,"getText"),RemoteObject.createImmutable("%' OR denekIsim7 LIKE '%"),dayanikliliktestlistele.mostCurrent._edittextara.runMethod(true,"getText"),RemoteObject.createImmutable("%' OR denektc8 LIKE '%"),dayanikliliktestlistele.mostCurrent._edittextara.runMethod(true,"getText"),RemoteObject.createImmutable("%' OR denekIsim8 LIKE '%"),dayanikliliktestlistele.mostCurrent._edittextara.runMethod(true,"getText"),RemoteObject.createImmutable("%' OR denektc9 LIKE '%"),dayanikliliktestlistele.mostCurrent._edittextara.runMethod(true,"getText"),RemoteObject.createImmutable("%' OR denekIsim9 LIKE '%"),dayanikliliktestlistele.mostCurrent._edittextara.runMethod(true,"getText"),RemoteObject.createImmutable("%' OR denektc10 LIKE '%"),dayanikliliktestlistele.mostCurrent._edittextara.runMethod(true,"getText"),RemoteObject.createImmutable("%' OR denekIsim10 LIKE '%"),dayanikliliktestlistele.mostCurrent._edittextara.runMethod(true,"getText"),RemoteObject.createImmutable("%' OR program_adi LIKE '%"),dayanikliliktestlistele.mostCurrent._edittextara.runMethod(true,"getText"),RemoteObject.createImmutable("%' OR  program_testTuru LIKE '%"),dayanikliliktestlistele.mostCurrent._edittextara.runMethod(true,"getText"),RemoteObject.createImmutable("%' OR  level LIKE '%"),dayanikliliktestlistele.mostCurrent._edittextara.runMethod(true,"getText"),RemoteObject.createImmutable("%' OR  mekik_sayisi LIKE '%"),dayanikliliktestlistele.mostCurrent._edittextara.runMethod(true,"getText"),RemoteObject.createImmutable("%' OR dayaniklilik_tarih LIKE '%"),dayanikliliktestlistele.mostCurrent._edittextara.runMethod(true,"getText"),RemoteObject.createImmutable("%' ) ORDER BY dayaniklilik_id DESC"))),(Object)((dayanikliliktestlistele.mostCurrent.__c.getField(false,"Null"))),(Object)(BA.numberCast(int.class, -(double) (0 + 1))),(Object)(dayanikliliktestlistele.mostCurrent.__c.getField(true,"False")))));
 BA.debugLineNum = 107;BA.debugLine="If EditTextAra.Text = \"\" Then";
Debug.ShouldStop(1024);
if (RemoteObject.solveBoolean("=",dayanikliliktestlistele.mostCurrent._edittextara.runMethod(true,"getText"),BA.ObjectToString(""))) { 
 BA.debugLineNum = 108;BA.debugLine="LabelCarpi.Visible = False";
Debug.ShouldStop(2048);
dayanikliliktestlistele.mostCurrent._labelcarpi.runMethod(true,"setVisible",dayanikliliktestlistele.mostCurrent.__c.getField(true,"False"));
 };
 BA.debugLineNum = 110;BA.debugLine="End Sub";
Debug.ShouldStop(8192);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _globals() throws Exception{
 //BA.debugLineNum = 12;BA.debugLine="Sub Globals";
 //BA.debugLineNum = 16;BA.debugLine="Private ButtonAnasayfa As Button";
dayanikliliktestlistele.mostCurrent._buttonanasayfa = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 17;BA.debugLine="Private EditTextAra As EditText";
dayanikliliktestlistele.mostCurrent._edittextara = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
 //BA.debugLineNum = 18;BA.debugLine="Private LabelCarpi As Label";
dayanikliliktestlistele.mostCurrent._labelcarpi = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 19;BA.debugLine="Private ButtonDayaniklilikTestEkle As Button";
dayanikliliktestlistele.mostCurrent._buttondayanikliliktestekle = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 20;BA.debugLine="Private ButtonSil As Button";
dayanikliliktestlistele.mostCurrent._buttonsil = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 21;BA.debugLine="Private WebView1 As WebView";
dayanikliliktestlistele.mostCurrent._webview1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.WebViewWrapper");
 //BA.debugLineNum = 22;BA.debugLine="Private ButtonDenekTC As Button";
dayanikliliktestlistele.mostCurrent._buttondenektc = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 23;BA.debugLine="Private ButtonDenekIsim As Button";
dayanikliliktestlistele.mostCurrent._buttondenekisim = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 24;BA.debugLine="Private ButtonProgramAdi As Button";
dayanikliliktestlistele.mostCurrent._buttonprogramadi = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 25;BA.debugLine="Private ButtonTestTuru As Button";
dayanikliliktestlistele.mostCurrent._buttontestturu = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 26;BA.debugLine="Private ButtonLevel As Button";
dayanikliliktestlistele.mostCurrent._buttonlevel = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 27;BA.debugLine="Private ButtonMekikSayisi As Button";
dayanikliliktestlistele.mostCurrent._buttonmekiksayisi = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 28;BA.debugLine="Private ButtonTarih As Button";
dayanikliliktestlistele.mostCurrent._buttontarih = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 29;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _htmlgosterdb() throws Exception{
try {
		Debug.PushSubsStack("HTMLGosterDB (dayanikliliktestlistele) ","dayanikliliktestlistele",3,dayanikliliktestlistele.mostCurrent.activityBA,dayanikliliktestlistele.mostCurrent,95);
if (RapidSub.canDelegate("htmlgosterdb")) { return b4a.example3.dayanikliliktestlistele.remoteMe.runUserSub(false, "dayanikliliktestlistele","htmlgosterdb");}
 BA.debugLineNum = 95;BA.debugLine="Sub HTMLGosterDB";
Debug.ShouldStop(1073741824);
 BA.debugLineNum = 96;BA.debugLine="WebView1.LoadHtml(DBUtils.ExecuteHtml(Main.sql, \"";
Debug.ShouldStop(-2147483648);
dayanikliliktestlistele.mostCurrent._webview1.runVoidMethod ("LoadHtml",(Object)(dayanikliliktestlistele.mostCurrent._dbutils.runMethod(true,"_executehtml" /*RemoteObject*/ ,dayanikliliktestlistele.mostCurrent.activityBA,(Object)(dayanikliliktestlistele.mostCurrent._main._sql /*RemoteObject*/ ),(Object)(BA.ObjectToString("SELECT dayaniklilik_tarih As [TARİH],dayaniklilik_saat As [SAAT], program_adi As [PROGRAM], mekik_sayisi As [MEKİK], denektc1 As [TC1], denekIsim1 As [İSİM1], denektc2 As [TC2], denekIsim2 As [İSİM2],denektc3 As [TC3], denekIsim3 As [İSİM3],denektc4 As [TC4], denekIsim4 As [İSİM4],denektc5 As [TC5], denekIsim5 As [İSİM5],denektc6 As [TC6], denekIsim6 As [İSİM6],denektc7 As [TC7], denekIsim7 As [İSİM7],denektc8 As [TC8], denekIsim8 As [İSİM8],denektc9 As [TC9], denekIsim9 As [İSİM9],denektc10 As [TC10], denekIsim10 As [İSİM10] FROM DayaniklilikTest, DayaniklilikTestProgram WHERE DayaniklilikTest.program_id = DayaniklilikTestProgram.program_id ORDER BY dayaniklilik_id DESC ")),(Object)((dayanikliliktestlistele.mostCurrent.__c.getField(false,"Null"))),(Object)(BA.numberCast(int.class, -(double) (0 + 1))),(Object)(dayanikliliktestlistele.mostCurrent.__c.getField(true,"False")))));
 BA.debugLineNum = 97;BA.debugLine="End Sub";
Debug.ShouldStop(1);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _labelcarpi_click() throws Exception{
try {
		Debug.PushSubsStack("LabelCarpi_Click (dayanikliliktestlistele) ","dayanikliliktestlistele",3,dayanikliliktestlistele.mostCurrent.activityBA,dayanikliliktestlistele.mostCurrent,112);
if (RapidSub.canDelegate("labelcarpi_click")) { return b4a.example3.dayanikliliktestlistele.remoteMe.runUserSub(false, "dayanikliliktestlistele","labelcarpi_click");}
 BA.debugLineNum = 112;BA.debugLine="Sub LabelCarpi_Click";
Debug.ShouldStop(32768);
 BA.debugLineNum = 113;BA.debugLine="EditTextAra.SelectAll";
Debug.ShouldStop(65536);
dayanikliliktestlistele.mostCurrent._edittextara.runVoidMethod ("SelectAll");
 BA.debugLineNum = 114;BA.debugLine="EditTextAra.Text = \"\"";
Debug.ShouldStop(131072);
dayanikliliktestlistele.mostCurrent._edittextara.runMethodAndSync(true,"setText",BA.ObjectToCharSequence(""));
 BA.debugLineNum = 115;BA.debugLine="HTMLGosterDB";
Debug.ShouldStop(262144);
_htmlgosterdb();
 BA.debugLineNum = 116;BA.debugLine="End Sub";
Debug.ShouldStop(524288);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _process_globals() throws Exception{
 //BA.debugLineNum = 6;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 10;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
}