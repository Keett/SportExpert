package b4a.example3;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class programlistele_subs_0 {


public static RemoteObject  _activity_create(RemoteObject _firsttime) throws Exception{
try {
		Debug.PushSubsStack("Activity_Create (programlistele) ","programlistele",16,programlistele.mostCurrent.activityBA,programlistele.mostCurrent,32);
if (RapidSub.canDelegate("activity_create")) { return b4a.example3.programlistele.remoteMe.runUserSub(false, "programlistele","activity_create", _firsttime);}
Debug.locals.put("FirstTime", _firsttime);
 BA.debugLineNum = 32;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
Debug.ShouldStop(-2147483648);
 BA.debugLineNum = 34;BA.debugLine="Activity.LoadLayout(\"ProgramListelePage\")";
Debug.ShouldStop(2);
programlistele.mostCurrent._activity.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("ProgramListelePage")),programlistele.mostCurrent.activityBA);
 BA.debugLineNum = 35;BA.debugLine="LabelCarpi.Visible = False";
Debug.ShouldStop(4);
programlistele.mostCurrent._labelcarpi.runMethod(true,"setVisible",programlistele.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 38;BA.debugLine="EditTextAra.TextColor = Colors.White";
Debug.ShouldStop(32);
programlistele.mostCurrent._edittextara.runMethod(true,"setTextColor",programlistele.mostCurrent.__c.getField(false,"Colors").getField(true,"White"));
 BA.debugLineNum = 39;BA.debugLine="EditTextAra.Hint = \"Bu alana yazarak aratabilirsi";
Debug.ShouldStop(64);
programlistele.mostCurrent._edittextara.runMethod(true,"setHint",BA.ObjectToString("Bu alana yazarak aratabilirsiniz.."));
 BA.debugLineNum = 40;BA.debugLine="EditTextAra.HintColor = Color.hintColor";
Debug.ShouldStop(128);
programlistele.mostCurrent._edittextara.runMethod(true,"setHintColor",programlistele.mostCurrent._color._hintcolor /*RemoteObject*/ );
 BA.debugLineNum = 41;BA.debugLine="EditTextAra.TextSize = 20";
Debug.ShouldStop(256);
programlistele.mostCurrent._edittextara.runMethod(true,"setTextSize",BA.numberCast(float.class, 20));
 BA.debugLineNum = 42;BA.debugLine="EditTextAra.Typeface = Typeface.DEFAULT_BOLD";
Debug.ShouldStop(512);
programlistele.mostCurrent._edittextara.runMethod(false,"setTypeface",programlistele.mostCurrent.__c.getField(false,"Typeface").getField(false,"DEFAULT_BOLD"));
 BA.debugLineNum = 44;BA.debugLine="ButtonProgramAdi.TextColor = Color.koyuMavi";
Debug.ShouldStop(2048);
programlistele.mostCurrent._buttonprogramadi.runMethod(true,"setTextColor",programlistele.mostCurrent._color._koyumavi /*RemoteObject*/ );
 BA.debugLineNum = 45;BA.debugLine="ButtonProgramAdi.Typeface = Typeface.DEFAULT_BOLD";
Debug.ShouldStop(4096);
programlistele.mostCurrent._buttonprogramadi.runMethod(false,"setTypeface",programlistele.mostCurrent.__c.getField(false,"Typeface").getField(false,"DEFAULT_BOLD"));
 BA.debugLineNum = 46;BA.debugLine="ButtonProgramAdi.TextSize = 14";
Debug.ShouldStop(8192);
programlistele.mostCurrent._buttonprogramadi.runMethod(true,"setTextSize",BA.numberCast(float.class, 14));
 BA.debugLineNum = 47;BA.debugLine="ButtonProgramAdi.SingleLine = True";
Debug.ShouldStop(16384);
programlistele.mostCurrent._buttonprogramadi.runVoidMethod ("setSingleLine",programlistele.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 49;BA.debugLine="ButtonTestTuru.TextColor = Color.koyuMavi";
Debug.ShouldStop(65536);
programlistele.mostCurrent._buttontestturu.runMethod(true,"setTextColor",programlistele.mostCurrent._color._koyumavi /*RemoteObject*/ );
 BA.debugLineNum = 50;BA.debugLine="ButtonTestTuru.Typeface = Typeface.DEFAULT_BOLD";
Debug.ShouldStop(131072);
programlistele.mostCurrent._buttontestturu.runMethod(false,"setTypeface",programlistele.mostCurrent.__c.getField(false,"Typeface").getField(false,"DEFAULT_BOLD"));
 BA.debugLineNum = 51;BA.debugLine="ButtonTestTuru.TextSize = 14";
Debug.ShouldStop(262144);
programlistele.mostCurrent._buttontestturu.runMethod(true,"setTextSize",BA.numberCast(float.class, 14));
 BA.debugLineNum = 52;BA.debugLine="ButtonTestTuru.SingleLine = True";
Debug.ShouldStop(524288);
programlistele.mostCurrent._buttontestturu.runVoidMethod ("setSingleLine",programlistele.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 54;BA.debugLine="ButtonTarih.TextColor = Color.koyuMavi";
Debug.ShouldStop(2097152);
programlistele.mostCurrent._buttontarih.runMethod(true,"setTextColor",programlistele.mostCurrent._color._koyumavi /*RemoteObject*/ );
 BA.debugLineNum = 55;BA.debugLine="ButtonTarih.Typeface = Typeface.DEFAULT_BOLD";
Debug.ShouldStop(4194304);
programlistele.mostCurrent._buttontarih.runMethod(false,"setTypeface",programlistele.mostCurrent.__c.getField(false,"Typeface").getField(false,"DEFAULT_BOLD"));
 BA.debugLineNum = 56;BA.debugLine="ButtonTarih.Text = \"TARİH\"";
Debug.ShouldStop(8388608);
programlistele.mostCurrent._buttontarih.runMethod(true,"setText",BA.ObjectToCharSequence("TARİH"));
 BA.debugLineNum = 57;BA.debugLine="ButtonTarih.TextSize = 14";
Debug.ShouldStop(16777216);
programlistele.mostCurrent._buttontarih.runMethod(true,"setTextSize",BA.numberCast(float.class, 14));
 BA.debugLineNum = 58;BA.debugLine="ButtonTarih.SingleLine = True";
Debug.ShouldStop(33554432);
programlistele.mostCurrent._buttontarih.runVoidMethod ("setSingleLine",programlistele.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 60;BA.debugLine="ButtonPistUzunlugu.TextColor = Color.koyuMavi";
Debug.ShouldStop(134217728);
programlistele.mostCurrent._buttonpistuzunlugu.runMethod(true,"setTextColor",programlistele.mostCurrent._color._koyumavi /*RemoteObject*/ );
 BA.debugLineNum = 61;BA.debugLine="ButtonPistUzunlugu.Typeface = Typeface.DEFAULT_BO";
Debug.ShouldStop(268435456);
programlistele.mostCurrent._buttonpistuzunlugu.runMethod(false,"setTypeface",programlistele.mostCurrent.__c.getField(false,"Typeface").getField(false,"DEFAULT_BOLD"));
 BA.debugLineNum = 62;BA.debugLine="ButtonPistUzunlugu.Text = \"PİST UZUNLUĞU\"";
Debug.ShouldStop(536870912);
programlistele.mostCurrent._buttonpistuzunlugu.runMethod(true,"setText",BA.ObjectToCharSequence("PİST UZUNLUĞU"));
 BA.debugLineNum = 63;BA.debugLine="ButtonPistUzunlugu.TextSize = 14";
Debug.ShouldStop(1073741824);
programlistele.mostCurrent._buttonpistuzunlugu.runMethod(true,"setTextSize",BA.numberCast(float.class, 14));
 BA.debugLineNum = 64;BA.debugLine="ButtonPistUzunlugu.SingleLine = True";
Debug.ShouldStop(-2147483648);
programlistele.mostCurrent._buttonpistuzunlugu.runVoidMethod ("setSingleLine",programlistele.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 66;BA.debugLine="ButtonKoniArasiMesafe.TextColor = Color.koyuMavi";
Debug.ShouldStop(2);
programlistele.mostCurrent._buttonkoniarasimesafe.runMethod(true,"setTextColor",programlistele.mostCurrent._color._koyumavi /*RemoteObject*/ );
 BA.debugLineNum = 67;BA.debugLine="ButtonKoniArasiMesafe.Typeface = Typeface.DEFAULT";
Debug.ShouldStop(4);
programlistele.mostCurrent._buttonkoniarasimesafe.runMethod(false,"setTypeface",programlistele.mostCurrent.__c.getField(false,"Typeface").getField(false,"DEFAULT_BOLD"));
 BA.debugLineNum = 68;BA.debugLine="ButtonKoniArasiMesafe.Text = \"KONİ ARASI MESAFE\"";
Debug.ShouldStop(8);
programlistele.mostCurrent._buttonkoniarasimesafe.runMethod(true,"setText",BA.ObjectToCharSequence("KONİ ARASI MESAFE"));
 BA.debugLineNum = 69;BA.debugLine="ButtonKoniArasiMesafe.TextSize = 14";
Debug.ShouldStop(16);
programlistele.mostCurrent._buttonkoniarasimesafe.runMethod(true,"setTextSize",BA.numberCast(float.class, 14));
 BA.debugLineNum = 70;BA.debugLine="ButtonKoniArasiMesafe.SingleLine = True";
Debug.ShouldStop(32);
programlistele.mostCurrent._buttonkoniarasimesafe.runVoidMethod ("setSingleLine",programlistele.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 72;BA.debugLine="ButtonKoniSayisi.TextColor = Color.koyuMavi";
Debug.ShouldStop(128);
programlistele.mostCurrent._buttonkonisayisi.runMethod(true,"setTextColor",programlistele.mostCurrent._color._koyumavi /*RemoteObject*/ );
 BA.debugLineNum = 73;BA.debugLine="ButtonKoniSayisi.Typeface = Typeface.DEFAULT_BOLD";
Debug.ShouldStop(256);
programlistele.mostCurrent._buttonkonisayisi.runMethod(false,"setTypeface",programlistele.mostCurrent.__c.getField(false,"Typeface").getField(false,"DEFAULT_BOLD"));
 BA.debugLineNum = 74;BA.debugLine="ButtonKoniSayisi.Text = \"KONİ SAYISI\"";
Debug.ShouldStop(512);
programlistele.mostCurrent._buttonkonisayisi.runMethod(true,"setText",BA.ObjectToCharSequence("KONİ SAYISI"));
 BA.debugLineNum = 75;BA.debugLine="ButtonKoniSayisi.TextSize = 14";
Debug.ShouldStop(1024);
programlistele.mostCurrent._buttonkonisayisi.runMethod(true,"setTextSize",BA.numberCast(float.class, 14));
 BA.debugLineNum = 76;BA.debugLine="ButtonKoniSayisi.SingleLine = True";
Debug.ShouldStop(2048);
programlistele.mostCurrent._buttonkonisayisi.runVoidMethod ("setSingleLine",programlistele.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 78;BA.debugLine="ButtonHiz.TextColor = Color.koyuMavi";
Debug.ShouldStop(8192);
programlistele.mostCurrent._buttonhiz.runMethod(true,"setTextColor",programlistele.mostCurrent._color._koyumavi /*RemoteObject*/ );
 BA.debugLineNum = 79;BA.debugLine="ButtonHiz.Typeface = Typeface.DEFAULT_BOLD";
Debug.ShouldStop(16384);
programlistele.mostCurrent._buttonhiz.runMethod(false,"setTypeface",programlistele.mostCurrent.__c.getField(false,"Typeface").getField(false,"DEFAULT_BOLD"));
 BA.debugLineNum = 80;BA.debugLine="ButtonHiz.Text = \"HIZ\"";
Debug.ShouldStop(32768);
programlistele.mostCurrent._buttonhiz.runMethod(true,"setText",BA.ObjectToCharSequence("HIZ"));
 BA.debugLineNum = 81;BA.debugLine="ButtonHiz.TextSize = 14";
Debug.ShouldStop(65536);
programlistele.mostCurrent._buttonhiz.runMethod(true,"setTextSize",BA.numberCast(float.class, 14));
 BA.debugLineNum = 82;BA.debugLine="ButtonHiz.SingleLine = True";
Debug.ShouldStop(131072);
programlistele.mostCurrent._buttonhiz.runVoidMethod ("setSingleLine",programlistele.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 84;BA.debugLine="ButtonLevel.TextColor = Color.koyuMavi";
Debug.ShouldStop(524288);
programlistele.mostCurrent._buttonlevel.runMethod(true,"setTextColor",programlistele.mostCurrent._color._koyumavi /*RemoteObject*/ );
 BA.debugLineNum = 85;BA.debugLine="ButtonLevel.Typeface = Typeface.DEFAULT_BOLD";
Debug.ShouldStop(1048576);
programlistele.mostCurrent._buttonlevel.runMethod(false,"setTypeface",programlistele.mostCurrent.__c.getField(false,"Typeface").getField(false,"DEFAULT_BOLD"));
 BA.debugLineNum = 86;BA.debugLine="ButtonLevel.Text = \"LEVEL\"";
Debug.ShouldStop(2097152);
programlistele.mostCurrent._buttonlevel.runMethod(true,"setText",BA.ObjectToCharSequence("LEVEL"));
 BA.debugLineNum = 87;BA.debugLine="ButtonLevel.TextSize = 14";
Debug.ShouldStop(4194304);
programlistele.mostCurrent._buttonlevel.runMethod(true,"setTextSize",BA.numberCast(float.class, 14));
 BA.debugLineNum = 88;BA.debugLine="ButtonLevel.SingleLine = True";
Debug.ShouldStop(8388608);
programlistele.mostCurrent._buttonlevel.runVoidMethod ("setSingleLine",programlistele.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 90;BA.debugLine="WebView1.JavaScriptEnabled = True";
Debug.ShouldStop(33554432);
programlistele.mostCurrent._webview1.runMethod(true,"setJavaScriptEnabled",programlistele.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 91;BA.debugLine="WebView1.ZoomEnabled = True";
Debug.ShouldStop(67108864);
programlistele.mostCurrent._webview1.runMethod(true,"setZoomEnabled",programlistele.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 94;BA.debugLine="HTMLGosterDB";
Debug.ShouldStop(536870912);
_htmlgosterdb();
 BA.debugLineNum = 96;BA.debugLine="End Sub";
Debug.ShouldStop(-2147483648);
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
		Debug.PushSubsStack("Activity_Pause (programlistele) ","programlistele",16,programlistele.mostCurrent.activityBA,programlistele.mostCurrent,102);
if (RapidSub.canDelegate("activity_pause")) { return b4a.example3.programlistele.remoteMe.runUserSub(false, "programlistele","activity_pause", _userclosed);}
Debug.locals.put("UserClosed", _userclosed);
 BA.debugLineNum = 102;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
Debug.ShouldStop(32);
 BA.debugLineNum = 104;BA.debugLine="End Sub";
Debug.ShouldStop(128);
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
		Debug.PushSubsStack("Activity_Resume (programlistele) ","programlistele",16,programlistele.mostCurrent.activityBA,programlistele.mostCurrent,98);
if (RapidSub.canDelegate("activity_resume")) { return b4a.example3.programlistele.remoteMe.runUserSub(false, "programlistele","activity_resume");}
 BA.debugLineNum = 98;BA.debugLine="Sub Activity_Resume";
Debug.ShouldStop(2);
 BA.debugLineNum = 100;BA.debugLine="End Sub";
Debug.ShouldStop(8);
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
		Debug.PushSubsStack("ButtonAnasayfa_Click (programlistele) ","programlistele",16,programlistele.mostCurrent.activityBA,programlistele.mostCurrent,169);
if (RapidSub.canDelegate("buttonanasayfa_click")) { return b4a.example3.programlistele.remoteMe.runUserSub(false, "programlistele","buttonanasayfa_click");}
 BA.debugLineNum = 169;BA.debugLine="Sub ButtonAnasayfa_Click";
Debug.ShouldStop(256);
 BA.debugLineNum = 170;BA.debugLine="StartActivity(AnaMenu)";
Debug.ShouldStop(512);
programlistele.mostCurrent.__c.runVoidMethod ("StartActivity",programlistele.processBA,(Object)((programlistele.mostCurrent._anamenu.getObject())));
 BA.debugLineNum = 171;BA.debugLine="Activity.Finish";
Debug.ShouldStop(1024);
programlistele.mostCurrent._activity.runVoidMethod ("Finish");
 BA.debugLineNum = 172;BA.debugLine="End Sub";
Debug.ShouldStop(2048);
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
		Debug.PushSubsStack("ButtonDayaniklilikTestEkle_Click (programlistele) ","programlistele",16,programlistele.mostCurrent.activityBA,programlistele.mostCurrent,154);
if (RapidSub.canDelegate("buttondayanikliliktestekle_click")) { return b4a.example3.programlistele.remoteMe.runUserSub(false, "programlistele","buttondayanikliliktestekle_click");}
 BA.debugLineNum = 154;BA.debugLine="Sub ButtonDayaniklilikTestEkle_Click";
Debug.ShouldStop(33554432);
 BA.debugLineNum = 155;BA.debugLine="StartActivity(ProgramAyar)";
Debug.ShouldStop(67108864);
programlistele.mostCurrent.__c.runVoidMethod ("StartActivity",programlistele.processBA,(Object)((programlistele.mostCurrent._programayar.getObject())));
 BA.debugLineNum = 156;BA.debugLine="Activity.Finish";
Debug.ShouldStop(134217728);
programlistele.mostCurrent._activity.runVoidMethod ("Finish");
 BA.debugLineNum = 157;BA.debugLine="End Sub";
Debug.ShouldStop(268435456);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _buttonhiz_click() throws Exception{
try {
		Debug.PushSubsStack("ButtonHiz_Click (programlistele) ","programlistele",16,programlistele.mostCurrent.activityBA,programlistele.mostCurrent,148);
if (RapidSub.canDelegate("buttonhiz_click")) { return b4a.example3.programlistele.remoteMe.runUserSub(false, "programlistele","buttonhiz_click");}
 BA.debugLineNum = 148;BA.debugLine="Sub ButtonHiz_Click";
Debug.ShouldStop(524288);
 BA.debugLineNum = 149;BA.debugLine="WebView1.LoadHtml(DBUtils.ExecuteHtml(Main.sql, \"";
Debug.ShouldStop(1048576);
programlistele.mostCurrent._webview1.runVoidMethod ("LoadHtml",(Object)(programlistele.mostCurrent._dbutils.runMethod(true,"_executehtml" /*RemoteObject*/ ,programlistele.mostCurrent.activityBA,(Object)(programlistele.mostCurrent._main._sql /*RemoteObject*/ ),(Object)(RemoteObject.concat(RemoteObject.createImmutable("SELECT hiz1 As [HIZ] , program_adi As [PROGRAM ADI] , program_tarih As [TARİH], program_saat As [SAAT] FROM DayaniklilikTestProgram WHERE hiz1 LIKE '%"),programlistele.mostCurrent._edittextara.runMethod(true,"getText"),RemoteObject.createImmutable("%'  ORDER BY program_id  DESC "))),(Object)((programlistele.mostCurrent.__c.getField(false,"Null"))),(Object)(BA.numberCast(int.class, -(double) (0 + 1))),(Object)(programlistele.mostCurrent.__c.getField(true,"False")))));
 BA.debugLineNum = 150;BA.debugLine="End Sub";
Debug.ShouldStop(2097152);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _buttonkoniarasimesafe_click() throws Exception{
try {
		Debug.PushSubsStack("ButtonKoniArasiMesafe_Click (programlistele) ","programlistele",16,programlistele.mostCurrent.activityBA,programlistele.mostCurrent,140);
if (RapidSub.canDelegate("buttonkoniarasimesafe_click")) { return b4a.example3.programlistele.remoteMe.runUserSub(false, "programlistele","buttonkoniarasimesafe_click");}
 BA.debugLineNum = 140;BA.debugLine="Sub ButtonKoniArasiMesafe_Click";
Debug.ShouldStop(2048);
 BA.debugLineNum = 141;BA.debugLine="WebView1.LoadHtml(DBUtils.ExecuteHtml(Main.sql, \"";
Debug.ShouldStop(4096);
programlistele.mostCurrent._webview1.runVoidMethod ("LoadHtml",(Object)(programlistele.mostCurrent._dbutils.runMethod(true,"_executehtml" /*RemoteObject*/ ,programlistele.mostCurrent.activityBA,(Object)(programlistele.mostCurrent._main._sql /*RemoteObject*/ ),(Object)(RemoteObject.concat(RemoteObject.createImmutable("SELECT  koniMesafesi1 As [KONİ MESAFESİ] ,program_adi As [PROGRAM ADI] , program_tarih As [TARİH], program_saat As [SAAT] FROM DayaniklilikTestProgram WHERE koniMesafesi1  LIKE '%"),programlistele.mostCurrent._edittextara.runMethod(true,"getText"),RemoteObject.createImmutable("%'  ORDER BY program_id  DESC "))),(Object)((programlistele.mostCurrent.__c.getField(false,"Null"))),(Object)(BA.numberCast(int.class, -(double) (0 + 1))),(Object)(programlistele.mostCurrent.__c.getField(true,"False")))));
 BA.debugLineNum = 142;BA.debugLine="End Sub";
Debug.ShouldStop(8192);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _buttonkonisayisi_click() throws Exception{
try {
		Debug.PushSubsStack("ButtonKoniSayisi_Click (programlistele) ","programlistele",16,programlistele.mostCurrent.activityBA,programlistele.mostCurrent,144);
if (RapidSub.canDelegate("buttonkonisayisi_click")) { return b4a.example3.programlistele.remoteMe.runUserSub(false, "programlistele","buttonkonisayisi_click");}
 BA.debugLineNum = 144;BA.debugLine="Sub ButtonKoniSayisi_Click";
Debug.ShouldStop(32768);
 BA.debugLineNum = 146;BA.debugLine="End Sub";
Debug.ShouldStop(131072);
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
		Debug.PushSubsStack("ButtonLevel_Click (programlistele) ","programlistele",16,programlistele.mostCurrent.activityBA,programlistele.mostCurrent,128);
if (RapidSub.canDelegate("buttonlevel_click")) { return b4a.example3.programlistele.remoteMe.runUserSub(false, "programlistele","buttonlevel_click");}
 BA.debugLineNum = 128;BA.debugLine="Sub ButtonLevel_Click";
Debug.ShouldStop(-2147483648);
 BA.debugLineNum = 129;BA.debugLine="WebView1.LoadHtml(DBUtils.ExecuteHtml(Main.sql, \"";
Debug.ShouldStop(1);
programlistele.mostCurrent._webview1.runVoidMethod ("LoadHtml",(Object)(programlistele.mostCurrent._dbutils.runMethod(true,"_executehtml" /*RemoteObject*/ ,programlistele.mostCurrent.activityBA,(Object)(programlistele.mostCurrent._main._sql /*RemoteObject*/ ),(Object)(RemoteObject.concat(RemoteObject.createImmutable("SELECT level As [LEVEL], program_adi As [PROGRAM ADI] ,program_testTuru As [PROGRAM TEST TÜRÜ],  program_tarih As [TARİH], program_saat As [SAAT] FROM DayaniklilikTestProgram WHERE level LIKE '%"),programlistele.mostCurrent._edittextara.runMethod(true,"getText"),RemoteObject.createImmutable("%'  ORDER BY program_id  DESC "))),(Object)((programlistele.mostCurrent.__c.getField(false,"Null"))),(Object)(BA.numberCast(int.class, -(double) (0 + 1))),(Object)(programlistele.mostCurrent.__c.getField(true,"False")))));
 BA.debugLineNum = 130;BA.debugLine="End Sub";
Debug.ShouldStop(2);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _buttonpistuzunlugu_click() throws Exception{
try {
		Debug.PushSubsStack("ButtonPistUzunlugu_Click (programlistele) ","programlistele",16,programlistele.mostCurrent.activityBA,programlistele.mostCurrent,136);
if (RapidSub.canDelegate("buttonpistuzunlugu_click")) { return b4a.example3.programlistele.remoteMe.runUserSub(false, "programlistele","buttonpistuzunlugu_click");}
 BA.debugLineNum = 136;BA.debugLine="Sub ButtonPistUzunlugu_Click";
Debug.ShouldStop(128);
 BA.debugLineNum = 138;BA.debugLine="End Sub";
Debug.ShouldStop(512);
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
		Debug.PushSubsStack("ButtonProgramAdi_Click (programlistele) ","programlistele",16,programlistele.mostCurrent.activityBA,programlistele.mostCurrent,120);
if (RapidSub.canDelegate("buttonprogramadi_click")) { return b4a.example3.programlistele.remoteMe.runUserSub(false, "programlistele","buttonprogramadi_click");}
 BA.debugLineNum = 120;BA.debugLine="Sub ButtonProgramAdi_Click";
Debug.ShouldStop(8388608);
 BA.debugLineNum = 121;BA.debugLine="WebView1.LoadHtml(DBUtils.ExecuteHtml(Main.sql, \"";
Debug.ShouldStop(16777216);
programlistele.mostCurrent._webview1.runVoidMethod ("LoadHtml",(Object)(programlistele.mostCurrent._dbutils.runMethod(true,"_executehtml" /*RemoteObject*/ ,programlistele.mostCurrent.activityBA,(Object)(programlistele.mostCurrent._main._sql /*RemoteObject*/ ),(Object)(RemoteObject.concat(RemoteObject.createImmutable("SELECT program_adi As [PROGRAM ADI] ,program_testTuru As [PROGRAM TEST TÜRÜ], level As [LEVEL], program_tarih As [TARİH], program_saat As [SAAT] FROM DayaniklilikTestProgram WHERE program_adi LIKE '%"),programlistele.mostCurrent._edittextara.runMethod(true,"getText"),RemoteObject.createImmutable("%'  ORDER BY program_id  DESC "))),(Object)((programlistele.mostCurrent.__c.getField(false,"Null"))),(Object)(BA.numberCast(int.class, -(double) (0 + 1))),(Object)(programlistele.mostCurrent.__c.getField(true,"False")))));
 BA.debugLineNum = 122;BA.debugLine="End Sub";
Debug.ShouldStop(33554432);
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
		Debug.PushSubsStack("ButtonSil_Click (programlistele) ","programlistele",16,programlistele.mostCurrent.activityBA,programlistele.mostCurrent,159);
if (RapidSub.canDelegate("buttonsil_click")) { return b4a.example3.programlistele.remoteMe.runUserSub(false, "programlistele","buttonsil_click");}
 BA.debugLineNum = 159;BA.debugLine="Sub ButtonSil_Click";
Debug.ShouldStop(1073741824);
 BA.debugLineNum = 160;BA.debugLine="StartActivity(ProgramSil)";
Debug.ShouldStop(-2147483648);
programlistele.mostCurrent.__c.runVoidMethod ("StartActivity",programlistele.processBA,(Object)((programlistele.mostCurrent._programsil.getObject())));
 BA.debugLineNum = 161;BA.debugLine="Activity.Finish";
Debug.ShouldStop(1);
programlistele.mostCurrent._activity.runVoidMethod ("Finish");
 BA.debugLineNum = 162;BA.debugLine="End Sub";
Debug.ShouldStop(2);
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
		Debug.PushSubsStack("ButtonTarih_Click (programlistele) ","programlistele",16,programlistele.mostCurrent.activityBA,programlistele.mostCurrent,132);
if (RapidSub.canDelegate("buttontarih_click")) { return b4a.example3.programlistele.remoteMe.runUserSub(false, "programlistele","buttontarih_click");}
 BA.debugLineNum = 132;BA.debugLine="Sub ButtonTarih_Click";
Debug.ShouldStop(8);
 BA.debugLineNum = 133;BA.debugLine="WebView1.LoadHtml(DBUtils.ExecuteHtml(Main.sql, \"";
Debug.ShouldStop(16);
programlistele.mostCurrent._webview1.runVoidMethod ("LoadHtml",(Object)(programlistele.mostCurrent._dbutils.runMethod(true,"_executehtml" /*RemoteObject*/ ,programlistele.mostCurrent.activityBA,(Object)(programlistele.mostCurrent._main._sql /*RemoteObject*/ ),(Object)(RemoteObject.concat(RemoteObject.createImmutable("SELECT program_adi As [PROGRAM ADI] , program_tarih As [TARİH], program_saat As [SAAT] FROM DayaniklilikTestProgram WHERE program_tarih LIKE '%"),programlistele.mostCurrent._edittextara.runMethod(true,"getText"),RemoteObject.createImmutable("%'  ORDER BY program_id  DESC "))),(Object)((programlistele.mostCurrent.__c.getField(false,"Null"))),(Object)(BA.numberCast(int.class, -(double) (0 + 1))),(Object)(programlistele.mostCurrent.__c.getField(true,"False")))));
 BA.debugLineNum = 134;BA.debugLine="End Sub";
Debug.ShouldStop(32);
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
		Debug.PushSubsStack("ButtonTestTuru_Click (programlistele) ","programlistele",16,programlistele.mostCurrent.activityBA,programlistele.mostCurrent,124);
if (RapidSub.canDelegate("buttontestturu_click")) { return b4a.example3.programlistele.remoteMe.runUserSub(false, "programlistele","buttontestturu_click");}
 BA.debugLineNum = 124;BA.debugLine="Sub ButtonTestTuru_Click";
Debug.ShouldStop(134217728);
 BA.debugLineNum = 125;BA.debugLine="WebView1.LoadHtml(DBUtils.ExecuteHtml(Main.sql, \"";
Debug.ShouldStop(268435456);
programlistele.mostCurrent._webview1.runVoidMethod ("LoadHtml",(Object)(programlistele.mostCurrent._dbutils.runMethod(true,"_executehtml" /*RemoteObject*/ ,programlistele.mostCurrent.activityBA,(Object)(programlistele.mostCurrent._main._sql /*RemoteObject*/ ),(Object)(RemoteObject.concat(RemoteObject.createImmutable("SELECT program_testTuru As [PROGRAM TEST TÜRÜ], program_adi As [PROGRAM ADI] , level As [LEVEL], program_tarih As [TARİH], program_saat As [SAAT] FROM DayaniklilikTestProgram WHERE program_testTuru LIKE '%"),programlistele.mostCurrent._edittextara.runMethod(true,"getText"),RemoteObject.createImmutable("%'  ORDER BY program_id  DESC "))),(Object)((programlistele.mostCurrent.__c.getField(false,"Null"))),(Object)(BA.numberCast(int.class, -(double) (0 + 1))),(Object)(programlistele.mostCurrent.__c.getField(true,"False")))));
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
public static RemoteObject  _edittextara_textchanged(RemoteObject _old,RemoteObject _new) throws Exception{
try {
		Debug.PushSubsStack("EditTextAra_TextChanged (programlistele) ","programlistele",16,programlistele.mostCurrent.activityBA,programlistele.mostCurrent,110);
if (RapidSub.canDelegate("edittextara_textchanged")) { return b4a.example3.programlistele.remoteMe.runUserSub(false, "programlistele","edittextara_textchanged", _old, _new);}
Debug.locals.put("Old", _old);
Debug.locals.put("New", _new);
 BA.debugLineNum = 110;BA.debugLine="Sub EditTextAra_TextChanged (Old As String, New As";
Debug.ShouldStop(8192);
 BA.debugLineNum = 111;BA.debugLine="LabelCarpi.Visible = True";
Debug.ShouldStop(16384);
programlistele.mostCurrent._labelcarpi.runMethod(true,"setVisible",programlistele.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 112;BA.debugLine="WebView1.LoadHtml(DBUtils.ExecuteHtml(Main.sql, \"";
Debug.ShouldStop(32768);
programlistele.mostCurrent._webview1.runVoidMethod ("LoadHtml",(Object)(programlistele.mostCurrent._dbutils.runMethod(true,"_executehtml" /*RemoteObject*/ ,programlistele.mostCurrent.activityBA,(Object)(programlistele.mostCurrent._main._sql /*RemoteObject*/ ),(Object)(RemoteObject.concat(RemoteObject.createImmutable("SELECT program_adi  As [PROGRAM ADI], program_tarih  As [TARİH],program_saat As [SAAT], level As [LEVEL], program_testTuru  As [TEST TÜRÜ] FROM DayaniklilikTestProgram WHERE program_adi LIKE '%"),programlistele.mostCurrent._edittextara.runMethod(true,"getText"),RemoteObject.createImmutable("%' OR program_tarih LIKE '%"),programlistele.mostCurrent._edittextara.runMethod(true,"getText"),RemoteObject.createImmutable("%' OR level LIKE '%"),programlistele.mostCurrent._edittextara.runMethod(true,"getText"),RemoteObject.createImmutable("%' OR program_testTuru LIKE '%"),programlistele.mostCurrent._edittextara.runMethod(true,"getText"),RemoteObject.createImmutable("%' ORDER BY program_id  DESC"))),(Object)((programlistele.mostCurrent.__c.getField(false,"Null"))),(Object)(BA.numberCast(int.class, -(double) (0 + 1))),(Object)(programlistele.mostCurrent.__c.getField(true,"False")))));
 BA.debugLineNum = 113;BA.debugLine="If EditTextAra.Text = \"\" Then";
Debug.ShouldStop(65536);
if (RemoteObject.solveBoolean("=",programlistele.mostCurrent._edittextara.runMethod(true,"getText"),BA.ObjectToString(""))) { 
 BA.debugLineNum = 114;BA.debugLine="LabelCarpi.Visible = False";
Debug.ShouldStop(131072);
programlistele.mostCurrent._labelcarpi.runMethod(true,"setVisible",programlistele.mostCurrent.__c.getField(true,"False"));
 };
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
public static RemoteObject  _globals() throws Exception{
 //BA.debugLineNum = 12;BA.debugLine="Sub Globals";
 //BA.debugLineNum = 16;BA.debugLine="Private ButtonAnasayfa As Button";
programlistele.mostCurrent._buttonanasayfa = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 17;BA.debugLine="Private EditTextAra As EditText";
programlistele.mostCurrent._edittextara = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
 //BA.debugLineNum = 18;BA.debugLine="Private LabelCarpi As Label";
programlistele.mostCurrent._labelcarpi = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 19;BA.debugLine="Private ButtonTarih As Button";
programlistele.mostCurrent._buttontarih = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 20;BA.debugLine="Private ButtonPistUzunlugu As Button";
programlistele.mostCurrent._buttonpistuzunlugu = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 21;BA.debugLine="Private ButtonHiz As Button";
programlistele.mostCurrent._buttonhiz = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 22;BA.debugLine="Private ButtonLevel As Button";
programlistele.mostCurrent._buttonlevel = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 23;BA.debugLine="Private WebView1 As WebView";
programlistele.mostCurrent._webview1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.WebViewWrapper");
 //BA.debugLineNum = 24;BA.debugLine="Private ButtonKoniArasiMesafe As Button";
programlistele.mostCurrent._buttonkoniarasimesafe = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 25;BA.debugLine="Private ButtonKoniSayisi As Button";
programlistele.mostCurrent._buttonkonisayisi = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 26;BA.debugLine="Private ButtonDayaniklilikTestEkle As Button";
programlistele.mostCurrent._buttondayanikliliktestekle = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 27;BA.debugLine="Private ButtonSil As Button";
programlistele.mostCurrent._buttonsil = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 28;BA.debugLine="Private ButtonProgramAdi As Button";
programlistele.mostCurrent._buttonprogramadi = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 29;BA.debugLine="Private ButtonTestTuru As Button";
programlistele.mostCurrent._buttontestturu = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 30;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _htmlgosterdb() throws Exception{
try {
		Debug.PushSubsStack("HTMLGosterDB (programlistele) ","programlistele",16,programlistele.mostCurrent.activityBA,programlistele.mostCurrent,106);
if (RapidSub.canDelegate("htmlgosterdb")) { return b4a.example3.programlistele.remoteMe.runUserSub(false, "programlistele","htmlgosterdb");}
 BA.debugLineNum = 106;BA.debugLine="Sub HTMLGosterDB";
Debug.ShouldStop(512);
 BA.debugLineNum = 107;BA.debugLine="WebView1.LoadHtml(DBUtils.ExecuteHtml(Main.sql,\"S";
Debug.ShouldStop(1024);
programlistele.mostCurrent._webview1.runVoidMethod ("LoadHtml",(Object)(programlistele.mostCurrent._dbutils.runMethod(true,"_executehtml" /*RemoteObject*/ ,programlistele.mostCurrent.activityBA,(Object)(programlistele.mostCurrent._main._sql /*RemoteObject*/ ),(Object)(BA.ObjectToString("SELECT program_adi  As [PROGRAM ADI], program_tarih  As [TARİH],program_saat As [SAAT], level As [LEVEL], program_testTuru  As [TEST TÜRÜ],koniMesafesi1 As [KONİ MESAFESİ1] , hiz1 As [HIZ1], dakika1 As [DAKİKA1] ,saniye1  As [SANİYE1] ,koniMesafesi2 As [KONİ MESAFESİ2] , hiz2 As [HIZ2],dakika2 As [DAKİKA2],saniye2  As [SANİYE2],koniMesafesi3 As [KONİ MESAFESİ3],hiz3 As [HIZ3],dakika3 As [DAKİKA3] ,saniye3  As [SANİYE3],koniMesafesi4 As [KONİ MESAFESİ4] ,hiz4 As [HIZ4],dakika4 As [DAKİKA4],saniye4  As [SANİYE4],koniMesafesi5 As [KONİ MESAFESİ5],hiz5 As [HIZ5] ,dakika5 As [DAKİKA5],saniye5  As [SANİYE5],koniMesafesi6 As [KONİ MESAFESİ6] ,hiz6 As [HIZ6] ,dakika6 As [DAKİKA6],saniye6  As [SANİYE6],koniMesafesi7 As [KONİ MESAFESİ7] ,hiz7 As [HIZ7] ,dakika7 As [DAKİKA7] ,saniye7  As [SANİYE7], koniMesafesi8 As [KONİ MESAFESİ8] ,hiz8 As [HIZ8],dakika8 As [DAKİKA8] ,saniye8  As [SANİYE8],koniMesafesi9 As [KONİ MESAFESİ9],hiz9 As [HIZ9],dakika9 As [DAKİKA9] ,saniye9  As [SANİYE9],koniMesafesi10 As [KONİ MESAFESİ10] ,hiz10 As [HIZ10] ,dakika10 As [DAKİKA10] ,saniye10  As [SANİYE10],koniMesafesi11 As [KONİ MESAFESİ11] ,hiz11 As [HIZ11] ,dakika11 As [DAKİKA11] ,saniye11  As [SANİYE11],koniMesafesi12 As [KONİ MESAFESİ12],hiz12 As [HIZ12],dakika12 As [DAKİKA12],saniye12  As [SANİYE12],koniMesafesi13 As [KONİ MESAFESİ13] ,hiz13 As [HIZ13] ,dakika13 As [DAKİKA13] ,saniye13  As [SANİYE13],koniMesafesi14 As [KONİ MESAFESİ14],hiz14 As [HIZ14] ,dakika14 As [DAKİKA14],saniye14  As [SANİYE14],koniMesafesi15 As [KONİ MESAFESİ15],hiz15 As [HIZ15] ,dakika15 As [DAKİKA15] ,saniye15  As [SANİYE15],koniMesafesi16 As [KONİ MESAFESİ16],hiz16 As [HIZ16],dakika16 As [DAKİKA16] ,saniye16  As [SANİYE16], koniMesafesi17 As [KONİ MESAFESİ17] ,hiz17 As [HIZ17] ,dakika17 As [DAKİKA17],saniye17  As [SANİYE17] ,koniMesafesi18 As [KONİ MESAFESİ18] ,hiz18 As [HIZ18] ,dakika18 As [DAKİKA18],saniye18  As [SANİYE18] ,koniMesafesi19 As [KONİ MESAFESİ19] ,hiz19 As [HIZ19] ,dakika19 As [DAKİKA19] ,saniye19  As [SANİYE19],koniMesafesi20 As [KONİ MESAFESİ20] ,hiz20 As [HIZ20] ,dakika20 As [DAKİKA20] ,saniye20 As [SANİYE20], koniMesafesi21 As [KONİ MESAFESİ21] ,hiz21 As [HIZ21] ,dakika21 As [DAKİKA21],saniye21 As [SANİYE21], koniMesafesi22 As [KONİ MESAFESİ22] ,hiz22 As [HIZ22],dakika22 As [DAKİKA22] ,saniye22 As [SANİYE22], koniMesafesi23 As [KONİ MESAFESİ23] ,hiz23 As [HIZ23],dakika23 As [DAKİKA23],saniye23 As [SANİYE23], koniMesafesi24 As [KONİ MESAFESİ24] ,hiz24 As [HIZ24] ,dakika24 As [DAKİKA24],saniye24 As [SANİYE24],koniMesafesi25 As [KONİ MESAFESİ25] ,hiz25 As [HIZ25] ,dakika25 As [DAKİKA25] ,saniye25 As [SANİYE25] FROM DayaniklilikTestProgram ORDER BY program_id  DESC")),(Object)((programlistele.mostCurrent.__c.getField(false,"Null"))),(Object)(BA.numberCast(int.class, -(double) (0 + 1))),(Object)(programlistele.mostCurrent.__c.getField(true,"False")))));
 BA.debugLineNum = 108;BA.debugLine="End Sub";
Debug.ShouldStop(2048);
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
		Debug.PushSubsStack("LabelCarpi_Click (programlistele) ","programlistele",16,programlistele.mostCurrent.activityBA,programlistele.mostCurrent,164);
if (RapidSub.canDelegate("labelcarpi_click")) { return b4a.example3.programlistele.remoteMe.runUserSub(false, "programlistele","labelcarpi_click");}
 BA.debugLineNum = 164;BA.debugLine="Sub LabelCarpi_Click";
Debug.ShouldStop(8);
 BA.debugLineNum = 165;BA.debugLine="EditTextAra.SelectAll";
Debug.ShouldStop(16);
programlistele.mostCurrent._edittextara.runVoidMethod ("SelectAll");
 BA.debugLineNum = 166;BA.debugLine="HTMLGosterDB";
Debug.ShouldStop(32);
_htmlgosterdb();
 BA.debugLineNum = 167;BA.debugLine="End Sub";
Debug.ShouldStop(64);
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