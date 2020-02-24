package b4a.example3;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class programsil_subs_0 {


public static RemoteObject  _activity_create(RemoteObject _firsttime) throws Exception{
try {
		Debug.PushSubsStack("Activity_Create (programsil) ","programsil",17,programsil.mostCurrent.activityBA,programsil.mostCurrent,41);
if (RapidSub.canDelegate("activity_create")) { return b4a.example3.programsil.remoteMe.runUserSub(false, "programsil","activity_create", _firsttime);}
Debug.locals.put("FirstTime", _firsttime);
 BA.debugLineNum = 41;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
Debug.ShouldStop(256);
 BA.debugLineNum = 43;BA.debugLine="Activity.LoadLayout(\"ProgramSilPage\")";
Debug.ShouldStop(1024);
programsil.mostCurrent._activity.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("ProgramSilPage")),programsil.mostCurrent.activityBA);
 BA.debugLineNum = 44;BA.debugLine="WebView1.Visible = False";
Debug.ShouldStop(2048);
programsil.mostCurrent._webview1.runMethod(true,"setVisible",programsil.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 45;BA.debugLine="LabelCarpi.Visible = False";
Debug.ShouldStop(4096);
programsil.mostCurrent._labelcarpi.runMethod(true,"setVisible",programsil.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 48;BA.debugLine="ListView1.TwoLinesAndBitmap.Label.Visible = False";
Debug.ShouldStop(32768);
programsil.mostCurrent._listview1.runMethod(false,"getTwoLinesAndBitmap").getField(false,"Label").runMethod(true,"setVisible",programsil.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 49;BA.debugLine="ListView1.TwoLinesAndBitmap.SecondLabel.TextColor";
Debug.ShouldStop(65536);
programsil.mostCurrent._listview1.runMethod(false,"getTwoLinesAndBitmap").getField(false,"SecondLabel").runMethod(true,"setTextColor",programsil.mostCurrent._color._koyumavi /*RemoteObject*/ );
 BA.debugLineNum = 50;BA.debugLine="ListView1.TwoLinesAndBitmap.SecondLabel.TextSize";
Debug.ShouldStop(131072);
programsil.mostCurrent._listview1.runMethod(false,"getTwoLinesAndBitmap").getField(false,"SecondLabel").runMethod(true,"setTextSize",BA.numberCast(float.class, 20));
 BA.debugLineNum = 51;BA.debugLine="SetDivider(ListView1,Color.acikMavi,3dip)";
Debug.ShouldStop(262144);
_setdivider(programsil.mostCurrent._listview1,programsil.mostCurrent._color._acikmavi /*RemoteObject*/ ,programsil.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 3))));
 BA.debugLineNum = 53;BA.debugLine="EditTextAra.TextColor = Colors.White";
Debug.ShouldStop(1048576);
programsil.mostCurrent._edittextara.runMethod(true,"setTextColor",programsil.mostCurrent.__c.getField(false,"Colors").getField(true,"White"));
 BA.debugLineNum = 54;BA.debugLine="EditTextAra.Hint = \"Bu alana yazarak aratabilirsi";
Debug.ShouldStop(2097152);
programsil.mostCurrent._edittextara.runMethod(true,"setHint",BA.ObjectToString("Bu alana yazarak aratabilirsiniz.."));
 BA.debugLineNum = 55;BA.debugLine="EditTextAra.HintColor = Color.hintColor";
Debug.ShouldStop(4194304);
programsil.mostCurrent._edittextara.runMethod(true,"setHintColor",programsil.mostCurrent._color._hintcolor /*RemoteObject*/ );
 BA.debugLineNum = 56;BA.debugLine="EditTextAra.TextSize = 20";
Debug.ShouldStop(8388608);
programsil.mostCurrent._edittextara.runMethod(true,"setTextSize",BA.numberCast(float.class, 20));
 BA.debugLineNum = 57;BA.debugLine="EditTextAra.Typeface = Typeface.DEFAULT_BOLD";
Debug.ShouldStop(16777216);
programsil.mostCurrent._edittextara.runMethod(false,"setTypeface",programsil.mostCurrent.__c.getField(false,"Typeface").getField(false,"DEFAULT_BOLD"));
 BA.debugLineNum = 59;BA.debugLine="ButtonProgramAdi.TextColor = Color.koyuMavi";
Debug.ShouldStop(67108864);
programsil.mostCurrent._buttonprogramadi.runMethod(true,"setTextColor",programsil.mostCurrent._color._koyumavi /*RemoteObject*/ );
 BA.debugLineNum = 60;BA.debugLine="ButtonProgramAdi.Typeface = Typeface.DEFAULT_BOLD";
Debug.ShouldStop(134217728);
programsil.mostCurrent._buttonprogramadi.runMethod(false,"setTypeface",programsil.mostCurrent.__c.getField(false,"Typeface").getField(false,"DEFAULT_BOLD"));
 BA.debugLineNum = 61;BA.debugLine="ButtonProgramAdi.TextSize = 14";
Debug.ShouldStop(268435456);
programsil.mostCurrent._buttonprogramadi.runMethod(true,"setTextSize",BA.numberCast(float.class, 14));
 BA.debugLineNum = 62;BA.debugLine="ButtonProgramAdi.SingleLine = True";
Debug.ShouldStop(536870912);
programsil.mostCurrent._buttonprogramadi.runVoidMethod ("setSingleLine",programsil.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 64;BA.debugLine="ButtonTestTuru.TextColor = Color.koyuMavi";
Debug.ShouldStop(-2147483648);
programsil.mostCurrent._buttontestturu.runMethod(true,"setTextColor",programsil.mostCurrent._color._koyumavi /*RemoteObject*/ );
 BA.debugLineNum = 65;BA.debugLine="ButtonTestTuru.Typeface = Typeface.DEFAULT_BOLD";
Debug.ShouldStop(1);
programsil.mostCurrent._buttontestturu.runMethod(false,"setTypeface",programsil.mostCurrent.__c.getField(false,"Typeface").getField(false,"DEFAULT_BOLD"));
 BA.debugLineNum = 66;BA.debugLine="ButtonTestTuru.TextSize = 14";
Debug.ShouldStop(2);
programsil.mostCurrent._buttontestturu.runMethod(true,"setTextSize",BA.numberCast(float.class, 14));
 BA.debugLineNum = 67;BA.debugLine="ButtonTestTuru.SingleLine = True";
Debug.ShouldStop(4);
programsil.mostCurrent._buttontestturu.runVoidMethod ("setSingleLine",programsil.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 69;BA.debugLine="ButtonTarih.TextColor = Color.koyuMavi";
Debug.ShouldStop(16);
programsil.mostCurrent._buttontarih.runMethod(true,"setTextColor",programsil.mostCurrent._color._koyumavi /*RemoteObject*/ );
 BA.debugLineNum = 70;BA.debugLine="ButtonTarih.Typeface = Typeface.DEFAULT_BOLD";
Debug.ShouldStop(32);
programsil.mostCurrent._buttontarih.runMethod(false,"setTypeface",programsil.mostCurrent.__c.getField(false,"Typeface").getField(false,"DEFAULT_BOLD"));
 BA.debugLineNum = 71;BA.debugLine="ButtonTarih.Text = \"TARİH\"";
Debug.ShouldStop(64);
programsil.mostCurrent._buttontarih.runMethod(true,"setText",BA.ObjectToCharSequence("TARİH"));
 BA.debugLineNum = 72;BA.debugLine="ButtonTarih.TextSize = 14";
Debug.ShouldStop(128);
programsil.mostCurrent._buttontarih.runMethod(true,"setTextSize",BA.numberCast(float.class, 14));
 BA.debugLineNum = 73;BA.debugLine="ButtonTarih.SingleLine = True";
Debug.ShouldStop(256);
programsil.mostCurrent._buttontarih.runVoidMethod ("setSingleLine",programsil.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 75;BA.debugLine="ButtonPistUzunlugu.TextColor = Color.koyuMavi";
Debug.ShouldStop(1024);
programsil.mostCurrent._buttonpistuzunlugu.runMethod(true,"setTextColor",programsil.mostCurrent._color._koyumavi /*RemoteObject*/ );
 BA.debugLineNum = 76;BA.debugLine="ButtonPistUzunlugu.Typeface = Typeface.DEFAULT_BO";
Debug.ShouldStop(2048);
programsil.mostCurrent._buttonpistuzunlugu.runMethod(false,"setTypeface",programsil.mostCurrent.__c.getField(false,"Typeface").getField(false,"DEFAULT_BOLD"));
 BA.debugLineNum = 77;BA.debugLine="ButtonPistUzunlugu.Text = \"PİST UZUNLUĞU\"";
Debug.ShouldStop(4096);
programsil.mostCurrent._buttonpistuzunlugu.runMethod(true,"setText",BA.ObjectToCharSequence("PİST UZUNLUĞU"));
 BA.debugLineNum = 78;BA.debugLine="ButtonPistUzunlugu.TextSize = 14";
Debug.ShouldStop(8192);
programsil.mostCurrent._buttonpistuzunlugu.runMethod(true,"setTextSize",BA.numberCast(float.class, 14));
 BA.debugLineNum = 79;BA.debugLine="ButtonPistUzunlugu.SingleLine = True";
Debug.ShouldStop(16384);
programsil.mostCurrent._buttonpistuzunlugu.runVoidMethod ("setSingleLine",programsil.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 81;BA.debugLine="ButtonKoniArasiMesafe.TextColor = Color.koyuMavi";
Debug.ShouldStop(65536);
programsil.mostCurrent._buttonkoniarasimesafe.runMethod(true,"setTextColor",programsil.mostCurrent._color._koyumavi /*RemoteObject*/ );
 BA.debugLineNum = 82;BA.debugLine="ButtonKoniArasiMesafe.Typeface = Typeface.DEFAULT";
Debug.ShouldStop(131072);
programsil.mostCurrent._buttonkoniarasimesafe.runMethod(false,"setTypeface",programsil.mostCurrent.__c.getField(false,"Typeface").getField(false,"DEFAULT_BOLD"));
 BA.debugLineNum = 83;BA.debugLine="ButtonKoniArasiMesafe.Text = \"KONİ ARASI MESAFE\"";
Debug.ShouldStop(262144);
programsil.mostCurrent._buttonkoniarasimesafe.runMethod(true,"setText",BA.ObjectToCharSequence("KONİ ARASI MESAFE"));
 BA.debugLineNum = 84;BA.debugLine="ButtonKoniArasiMesafe.TextSize = 14";
Debug.ShouldStop(524288);
programsil.mostCurrent._buttonkoniarasimesafe.runMethod(true,"setTextSize",BA.numberCast(float.class, 14));
 BA.debugLineNum = 85;BA.debugLine="ButtonKoniArasiMesafe.SingleLine = True";
Debug.ShouldStop(1048576);
programsil.mostCurrent._buttonkoniarasimesafe.runVoidMethod ("setSingleLine",programsil.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 87;BA.debugLine="ButtonKoniSayisi.TextColor = Color.koyuMavi";
Debug.ShouldStop(4194304);
programsil.mostCurrent._buttonkonisayisi.runMethod(true,"setTextColor",programsil.mostCurrent._color._koyumavi /*RemoteObject*/ );
 BA.debugLineNum = 88;BA.debugLine="ButtonKoniSayisi.Typeface = Typeface.DEFAULT_BOLD";
Debug.ShouldStop(8388608);
programsil.mostCurrent._buttonkonisayisi.runMethod(false,"setTypeface",programsil.mostCurrent.__c.getField(false,"Typeface").getField(false,"DEFAULT_BOLD"));
 BA.debugLineNum = 89;BA.debugLine="ButtonKoniSayisi.Text = \"KONİ SAYISI\"";
Debug.ShouldStop(16777216);
programsil.mostCurrent._buttonkonisayisi.runMethod(true,"setText",BA.ObjectToCharSequence("KONİ SAYISI"));
 BA.debugLineNum = 90;BA.debugLine="ButtonKoniSayisi.TextSize = 14";
Debug.ShouldStop(33554432);
programsil.mostCurrent._buttonkonisayisi.runMethod(true,"setTextSize",BA.numberCast(float.class, 14));
 BA.debugLineNum = 91;BA.debugLine="ButtonKoniSayisi.SingleLine = True";
Debug.ShouldStop(67108864);
programsil.mostCurrent._buttonkonisayisi.runVoidMethod ("setSingleLine",programsil.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 93;BA.debugLine="ButtonHiz.TextColor = Color.koyuMavi";
Debug.ShouldStop(268435456);
programsil.mostCurrent._buttonhiz.runMethod(true,"setTextColor",programsil.mostCurrent._color._koyumavi /*RemoteObject*/ );
 BA.debugLineNum = 94;BA.debugLine="ButtonHiz.Typeface = Typeface.DEFAULT_BOLD";
Debug.ShouldStop(536870912);
programsil.mostCurrent._buttonhiz.runMethod(false,"setTypeface",programsil.mostCurrent.__c.getField(false,"Typeface").getField(false,"DEFAULT_BOLD"));
 BA.debugLineNum = 95;BA.debugLine="ButtonHiz.Text = \"HIZ\"";
Debug.ShouldStop(1073741824);
programsil.mostCurrent._buttonhiz.runMethod(true,"setText",BA.ObjectToCharSequence("HIZ"));
 BA.debugLineNum = 96;BA.debugLine="ButtonHiz.TextSize = 14";
Debug.ShouldStop(-2147483648);
programsil.mostCurrent._buttonhiz.runMethod(true,"setTextSize",BA.numberCast(float.class, 14));
 BA.debugLineNum = 97;BA.debugLine="ButtonHiz.SingleLine = True";
Debug.ShouldStop(1);
programsil.mostCurrent._buttonhiz.runVoidMethod ("setSingleLine",programsil.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 99;BA.debugLine="ButtonLevel.TextColor = Color.koyuMavi";
Debug.ShouldStop(4);
programsil.mostCurrent._buttonlevel.runMethod(true,"setTextColor",programsil.mostCurrent._color._koyumavi /*RemoteObject*/ );
 BA.debugLineNum = 100;BA.debugLine="ButtonLevel.Typeface = Typeface.DEFAULT_BOLD";
Debug.ShouldStop(8);
programsil.mostCurrent._buttonlevel.runMethod(false,"setTypeface",programsil.mostCurrent.__c.getField(false,"Typeface").getField(false,"DEFAULT_BOLD"));
 BA.debugLineNum = 101;BA.debugLine="ButtonLevel.Text = \"LEVEL\"";
Debug.ShouldStop(16);
programsil.mostCurrent._buttonlevel.runMethod(true,"setText",BA.ObjectToCharSequence("LEVEL"));
 BA.debugLineNum = 102;BA.debugLine="ButtonLevel.TextSize = 14";
Debug.ShouldStop(32);
programsil.mostCurrent._buttonlevel.runMethod(true,"setTextSize",BA.numberCast(float.class, 14));
 BA.debugLineNum = 103;BA.debugLine="ButtonLevel.SingleLine = True";
Debug.ShouldStop(64);
programsil.mostCurrent._buttonlevel.runVoidMethod ("setSingleLine",programsil.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 105;BA.debugLine="WebView1.JavaScriptEnabled = True";
Debug.ShouldStop(256);
programsil.mostCurrent._webview1.runMethod(true,"setJavaScriptEnabled",programsil.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 106;BA.debugLine="WebView1.ZoomEnabled = True";
Debug.ShouldStop(512);
programsil.mostCurrent._webview1.runMethod(true,"setZoomEnabled",programsil.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 109;BA.debugLine="ListViewGosterDB";
Debug.ShouldStop(4096);
_listviewgosterdb();
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
public static RemoteObject  _activity_pause(RemoteObject _userclosed) throws Exception{
try {
		Debug.PushSubsStack("Activity_Pause (programsil) ","programsil",17,programsil.mostCurrent.activityBA,programsil.mostCurrent,116);
if (RapidSub.canDelegate("activity_pause")) { return b4a.example3.programsil.remoteMe.runUserSub(false, "programsil","activity_pause", _userclosed);}
Debug.locals.put("UserClosed", _userclosed);
 BA.debugLineNum = 116;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
Debug.ShouldStop(524288);
 BA.debugLineNum = 118;BA.debugLine="End Sub";
Debug.ShouldStop(2097152);
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
		Debug.PushSubsStack("Activity_Resume (programsil) ","programsil",17,programsil.mostCurrent.activityBA,programsil.mostCurrent,112);
if (RapidSub.canDelegate("activity_resume")) { return b4a.example3.programsil.remoteMe.runUserSub(false, "programsil","activity_resume");}
 BA.debugLineNum = 112;BA.debugLine="Sub Activity_Resume";
Debug.ShouldStop(32768);
 BA.debugLineNum = 114;BA.debugLine="End Sub";
Debug.ShouldStop(131072);
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
		Debug.PushSubsStack("ButtonAnasayfa_Click (programsil) ","programsil",17,programsil.mostCurrent.activityBA,programsil.mostCurrent,248);
if (RapidSub.canDelegate("buttonanasayfa_click")) { return b4a.example3.programsil.remoteMe.runUserSub(false, "programsil","buttonanasayfa_click");}
 BA.debugLineNum = 248;BA.debugLine="Sub ButtonAnasayfa_Click";
Debug.ShouldStop(8388608);
 BA.debugLineNum = 249;BA.debugLine="StartActivity(AnaMenu)";
Debug.ShouldStop(16777216);
programsil.mostCurrent.__c.runVoidMethod ("StartActivity",programsil.processBA,(Object)((programsil.mostCurrent._anamenu.getObject())));
 BA.debugLineNum = 250;BA.debugLine="Activity.Finish";
Debug.ShouldStop(33554432);
programsil.mostCurrent._activity.runVoidMethod ("Finish");
 BA.debugLineNum = 251;BA.debugLine="End Sub";
Debug.ShouldStop(67108864);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _buttondayaniklilikprogramekle_click() throws Exception{
try {
		Debug.PushSubsStack("ButtonDayaniklilikProgramEkle_Click (programsil) ","programsil",17,programsil.mostCurrent.activityBA,programsil.mostCurrent,289);
if (RapidSub.canDelegate("buttondayaniklilikprogramekle_click")) { return b4a.example3.programsil.remoteMe.runUserSub(false, "programsil","buttondayaniklilikprogramekle_click");}
 BA.debugLineNum = 289;BA.debugLine="Sub ButtonDayaniklilikProgramEkle_Click";
Debug.ShouldStop(1);
 BA.debugLineNum = 290;BA.debugLine="WebView1.Visible = False";
Debug.ShouldStop(2);
programsil.mostCurrent._webview1.runMethod(true,"setVisible",programsil.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 291;BA.debugLine="StartActivity(ProgramAyar)";
Debug.ShouldStop(4);
programsil.mostCurrent.__c.runVoidMethod ("StartActivity",programsil.processBA,(Object)((programsil.mostCurrent._programayar.getObject())));
 BA.debugLineNum = 292;BA.debugLine="Activity.Finish";
Debug.ShouldStop(8);
programsil.mostCurrent._activity.runVoidMethod ("Finish");
 BA.debugLineNum = 293;BA.debugLine="End Sub";
Debug.ShouldStop(16);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _buttondayaniklilikprogramtabloveri_click() throws Exception{
try {
		Debug.PushSubsStack("ButtonDayaniklilikProgramTabloVeri_Click (programsil) ","programsil",17,programsil.mostCurrent.activityBA,programsil.mostCurrent,295);
if (RapidSub.canDelegate("buttondayaniklilikprogramtabloveri_click")) { return b4a.example3.programsil.remoteMe.runUserSub(false, "programsil","buttondayaniklilikprogramtabloveri_click");}
 BA.debugLineNum = 295;BA.debugLine="Sub ButtonDayaniklilikProgramTabloVeri_Click";
Debug.ShouldStop(64);
 BA.debugLineNum = 296;BA.debugLine="WebView1.Visible = False";
Debug.ShouldStop(128);
programsil.mostCurrent._webview1.runMethod(true,"setVisible",programsil.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 297;BA.debugLine="StartActivity(ProgramListele)";
Debug.ShouldStop(256);
programsil.mostCurrent.__c.runVoidMethod ("StartActivity",programsil.processBA,(Object)((programsil.mostCurrent._programlistele.getObject())));
 BA.debugLineNum = 298;BA.debugLine="Activity.Finish";
Debug.ShouldStop(512);
programsil.mostCurrent._activity.runVoidMethod ("Finish");
 BA.debugLineNum = 299;BA.debugLine="End Sub";
Debug.ShouldStop(1024);
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
		Debug.PushSubsStack("ButtonHiz_Click (programsil) ","programsil",17,programsil.mostCurrent.activityBA,programsil.mostCurrent,233);
if (RapidSub.canDelegate("buttonhiz_click")) { return b4a.example3.programsil.remoteMe.runUserSub(false, "programsil","buttonhiz_click");}
int _i = 0;
 BA.debugLineNum = 233;BA.debugLine="Sub ButtonHiz_Click";
Debug.ShouldStop(256);
 BA.debugLineNum = 234;BA.debugLine="WebView1.Visible = False";
Debug.ShouldStop(512);
programsil.mostCurrent._webview1.runMethod(true,"setVisible",programsil.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 235;BA.debugLine="ListView1.Clear";
Debug.ShouldStop(1024);
programsil.mostCurrent._listview1.runVoidMethod ("Clear");
 BA.debugLineNum = 236;BA.debugLine="rs = Main.sql.ExecQuery(\"SELECT * FROM Dayaniklil";
Debug.ShouldStop(2048);
programsil.mostCurrent._rs.setObject(programsil.mostCurrent._main._sql /*RemoteObject*/ .runMethod(false,"ExecQuery",(Object)(RemoteObject.concat(RemoteObject.createImmutable("SELECT * FROM DayaniklilikTestProgram WHERE hiz1 LIKE '%"),programsil.mostCurrent._edittextara.runMethod(true,"getText"),RemoteObject.createImmutable("%' ORDER BY program_id DESC ")))));
 BA.debugLineNum = 238;BA.debugLine="For i=0 To rs.RowCount-1";
Debug.ShouldStop(8192);
{
final int step4 = 1;
final int limit4 = RemoteObject.solve(new RemoteObject[] {programsil.mostCurrent._rs.runMethod(true,"getRowCount"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step4 > 0 && _i <= limit4) || (step4 < 0 && _i >= limit4) ;_i = ((int)(0 + _i + step4))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 239;BA.debugLine="rs.Position = i";
Debug.ShouldStop(16384);
programsil.mostCurrent._rs.runMethod(true,"setPosition",BA.numberCast(int.class, _i));
 BA.debugLineNum = 240;BA.debugLine="VeriAl";
Debug.ShouldStop(32768);
_verial();
 BA.debugLineNum = 241;BA.debugLine="ListView1.AddTwoLines(id,$\"Program Adı: ${progra";
Debug.ShouldStop(65536);
programsil.mostCurrent._listview1.runVoidMethod ("AddTwoLines",(Object)(BA.ObjectToCharSequence(programsil._id)),(Object)(BA.ObjectToCharSequence((RemoteObject.concat(RemoteObject.createImmutable("Program Adı: "),programsil.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((programsil.mostCurrent._programadi))),RemoteObject.createImmutable(" // Test Türü: "),programsil.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((programsil.mostCurrent._testturu))),RemoteObject.createImmutable(" // Level: "),programsil.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((programsil._level))),RemoteObject.createImmutable(" // Tarih: "),programsil.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((programsil.mostCurrent._tarih))),RemoteObject.createImmutable(" // Saat: "),programsil.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((programsil.mostCurrent._saat))),RemoteObject.createImmutable(" // Hız: "),programsil.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((programsil._hiz))),RemoteObject.createImmutable(""))))));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 243;BA.debugLine="rs.Close";
Debug.ShouldStop(262144);
programsil.mostCurrent._rs.runVoidMethod ("Close");
 BA.debugLineNum = 244;BA.debugLine="End Sub";
Debug.ShouldStop(524288);
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
		Debug.PushSubsStack("ButtonKoniArasiMesafe_Click (programsil) ","programsil",17,programsil.mostCurrent.activityBA,programsil.mostCurrent,216);
if (RapidSub.canDelegate("buttonkoniarasimesafe_click")) { return b4a.example3.programsil.remoteMe.runUserSub(false, "programsil","buttonkoniarasimesafe_click");}
int _i = 0;
 BA.debugLineNum = 216;BA.debugLine="Sub ButtonKoniArasiMesafe_Click";
Debug.ShouldStop(8388608);
 BA.debugLineNum = 217;BA.debugLine="WebView1.Visible = False";
Debug.ShouldStop(16777216);
programsil.mostCurrent._webview1.runMethod(true,"setVisible",programsil.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 218;BA.debugLine="ListView1.Clear";
Debug.ShouldStop(33554432);
programsil.mostCurrent._listview1.runVoidMethod ("Clear");
 BA.debugLineNum = 219;BA.debugLine="rs = Main.sql.ExecQuery(\"SELECT * FROM Dayaniklil";
Debug.ShouldStop(67108864);
programsil.mostCurrent._rs.setObject(programsil.mostCurrent._main._sql /*RemoteObject*/ .runMethod(false,"ExecQuery",(Object)(RemoteObject.concat(RemoteObject.createImmutable("SELECT * FROM DayaniklilikTestProgram WHERE koniMesafesi1 LIKE '%"),programsil.mostCurrent._edittextara.runMethod(true,"getText"),RemoteObject.createImmutable("%' ORDER BY program_id DESC ")))));
 BA.debugLineNum = 221;BA.debugLine="For i=0 To rs.RowCount-1";
Debug.ShouldStop(268435456);
{
final int step4 = 1;
final int limit4 = RemoteObject.solve(new RemoteObject[] {programsil.mostCurrent._rs.runMethod(true,"getRowCount"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step4 > 0 && _i <= limit4) || (step4 < 0 && _i >= limit4) ;_i = ((int)(0 + _i + step4))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 222;BA.debugLine="rs.Position = i";
Debug.ShouldStop(536870912);
programsil.mostCurrent._rs.runMethod(true,"setPosition",BA.numberCast(int.class, _i));
 BA.debugLineNum = 223;BA.debugLine="VeriAl";
Debug.ShouldStop(1073741824);
_verial();
 BA.debugLineNum = 224;BA.debugLine="ListView1.AddTwoLines(id,$\"Program Adı: ${progra";
Debug.ShouldStop(-2147483648);
programsil.mostCurrent._listview1.runVoidMethod ("AddTwoLines",(Object)(BA.ObjectToCharSequence(programsil._id)),(Object)(BA.ObjectToCharSequence((RemoteObject.concat(RemoteObject.createImmutable("Program Adı: "),programsil.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((programsil.mostCurrent._programadi))),RemoteObject.createImmutable(" // Test Türü: "),programsil.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((programsil.mostCurrent._testturu))),RemoteObject.createImmutable(" // Level: "),programsil.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((programsil._level))),RemoteObject.createImmutable(" // Tarih: "),programsil.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((programsil.mostCurrent._tarih))),RemoteObject.createImmutable(" // Saat: "),programsil.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((programsil.mostCurrent._saat))),RemoteObject.createImmutable(" // Koni Mesafesi: "),programsil.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((programsil._konimesafesi))),RemoteObject.createImmutable(""))))));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 226;BA.debugLine="rs.Close";
Debug.ShouldStop(2);
programsil.mostCurrent._rs.runVoidMethod ("Close");
 BA.debugLineNum = 227;BA.debugLine="End Sub";
Debug.ShouldStop(4);
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
		Debug.PushSubsStack("ButtonKoniSayisi_Click (programsil) ","programsil",17,programsil.mostCurrent.activityBA,programsil.mostCurrent,229);
if (RapidSub.canDelegate("buttonkonisayisi_click")) { return b4a.example3.programsil.remoteMe.runUserSub(false, "programsil","buttonkonisayisi_click");}
 BA.debugLineNum = 229;BA.debugLine="Sub ButtonKoniSayisi_Click";
Debug.ShouldStop(16);
 BA.debugLineNum = 231;BA.debugLine="End Sub";
Debug.ShouldStop(64);
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
		Debug.PushSubsStack("ButtonLevel_Click (programsil) ","programsil",17,programsil.mostCurrent.activityBA,programsil.mostCurrent,173);
if (RapidSub.canDelegate("buttonlevel_click")) { return b4a.example3.programsil.remoteMe.runUserSub(false, "programsil","buttonlevel_click");}
int _i = 0;
 BA.debugLineNum = 173;BA.debugLine="Sub ButtonLevel_Click";
Debug.ShouldStop(4096);
 BA.debugLineNum = 174;BA.debugLine="WebView1.Visible = False";
Debug.ShouldStop(8192);
programsil.mostCurrent._webview1.runMethod(true,"setVisible",programsil.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 175;BA.debugLine="ListView1.Clear";
Debug.ShouldStop(16384);
programsil.mostCurrent._listview1.runVoidMethod ("Clear");
 BA.debugLineNum = 176;BA.debugLine="rs = Main.sql.ExecQuery(\"SELECT * FROM Dayaniklil";
Debug.ShouldStop(32768);
programsil.mostCurrent._rs.setObject(programsil.mostCurrent._main._sql /*RemoteObject*/ .runMethod(false,"ExecQuery",(Object)(RemoteObject.concat(RemoteObject.createImmutable("SELECT * FROM DayaniklilikTestProgram WHERE level LIKE '%"),programsil.mostCurrent._edittextara.runMethod(true,"getText"),RemoteObject.createImmutable("%' ORDER BY program_id DESC ")))));
 BA.debugLineNum = 178;BA.debugLine="For i=0 To rs.RowCount-1";
Debug.ShouldStop(131072);
{
final int step4 = 1;
final int limit4 = RemoteObject.solve(new RemoteObject[] {programsil.mostCurrent._rs.runMethod(true,"getRowCount"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step4 > 0 && _i <= limit4) || (step4 < 0 && _i >= limit4) ;_i = ((int)(0 + _i + step4))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 179;BA.debugLine="rs.Position = i";
Debug.ShouldStop(262144);
programsil.mostCurrent._rs.runMethod(true,"setPosition",BA.numberCast(int.class, _i));
 BA.debugLineNum = 180;BA.debugLine="VeriAl";
Debug.ShouldStop(524288);
_verial();
 BA.debugLineNum = 181;BA.debugLine="ListView1.AddTwoLines(id,$\"Level: ${level} // Pr";
Debug.ShouldStop(1048576);
programsil.mostCurrent._listview1.runVoidMethod ("AddTwoLines",(Object)(BA.ObjectToCharSequence(programsil._id)),(Object)(BA.ObjectToCharSequence((RemoteObject.concat(RemoteObject.createImmutable("Level: "),programsil.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((programsil._level))),RemoteObject.createImmutable(" // Program Adı: "),programsil.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((programsil.mostCurrent._programadi))),RemoteObject.createImmutable(" // Test Türü: "),programsil.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((programsil.mostCurrent._testturu))),RemoteObject.createImmutable(" //// Tarih: "),programsil.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((programsil.mostCurrent._tarih))),RemoteObject.createImmutable(" // Saat: "),programsil.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((programsil.mostCurrent._saat))),RemoteObject.createImmutable(""))))));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 183;BA.debugLine="rs.Close";
Debug.ShouldStop(4194304);
programsil.mostCurrent._rs.runVoidMethod ("Close");
 BA.debugLineNum = 184;BA.debugLine="End Sub";
Debug.ShouldStop(8388608);
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
		Debug.PushSubsStack("ButtonPistUzunlugu_Click (programsil) ","programsil",17,programsil.mostCurrent.activityBA,programsil.mostCurrent,212);
if (RapidSub.canDelegate("buttonpistuzunlugu_click")) { return b4a.example3.programsil.remoteMe.runUserSub(false, "programsil","buttonpistuzunlugu_click");}
 BA.debugLineNum = 212;BA.debugLine="Sub ButtonPistUzunlugu_Click";
Debug.ShouldStop(524288);
 BA.debugLineNum = 214;BA.debugLine="End Sub";
Debug.ShouldStop(2097152);
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
		Debug.PushSubsStack("ButtonProgramAdi_Click (programsil) ","programsil",17,programsil.mostCurrent.activityBA,programsil.mostCurrent,160);
if (RapidSub.canDelegate("buttonprogramadi_click")) { return b4a.example3.programsil.remoteMe.runUserSub(false, "programsil","buttonprogramadi_click");}
int _i = 0;
 BA.debugLineNum = 160;BA.debugLine="Sub ButtonProgramAdi_Click";
Debug.ShouldStop(-2147483648);
 BA.debugLineNum = 161;BA.debugLine="WebView1.Visible = False";
Debug.ShouldStop(1);
programsil.mostCurrent._webview1.runMethod(true,"setVisible",programsil.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 162;BA.debugLine="ListView1.Clear";
Debug.ShouldStop(2);
programsil.mostCurrent._listview1.runVoidMethod ("Clear");
 BA.debugLineNum = 163;BA.debugLine="rs = Main.sql.ExecQuery(\"SELECT * FROM Dayaniklil";
Debug.ShouldStop(4);
programsil.mostCurrent._rs.setObject(programsil.mostCurrent._main._sql /*RemoteObject*/ .runMethod(false,"ExecQuery",(Object)(RemoteObject.concat(RemoteObject.createImmutable("SELECT * FROM DayaniklilikTestProgram WHERE program_adi LIKE '%"),programsil.mostCurrent._edittextara.runMethod(true,"getText"),RemoteObject.createImmutable("%' ORDER BY program_id DESC ")))));
 BA.debugLineNum = 165;BA.debugLine="For i=0 To rs.RowCount-1";
Debug.ShouldStop(16);
{
final int step4 = 1;
final int limit4 = RemoteObject.solve(new RemoteObject[] {programsil.mostCurrent._rs.runMethod(true,"getRowCount"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step4 > 0 && _i <= limit4) || (step4 < 0 && _i >= limit4) ;_i = ((int)(0 + _i + step4))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 166;BA.debugLine="rs.Position = i";
Debug.ShouldStop(32);
programsil.mostCurrent._rs.runMethod(true,"setPosition",BA.numberCast(int.class, _i));
 BA.debugLineNum = 167;BA.debugLine="VeriAl";
Debug.ShouldStop(64);
_verial();
 BA.debugLineNum = 168;BA.debugLine="ListView1.AddTwoLines(id,$\"Program Adı: ${progra";
Debug.ShouldStop(128);
programsil.mostCurrent._listview1.runVoidMethod ("AddTwoLines",(Object)(BA.ObjectToCharSequence(programsil._id)),(Object)(BA.ObjectToCharSequence((RemoteObject.concat(RemoteObject.createImmutable("Program Adı: "),programsil.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((programsil.mostCurrent._programadi))),RemoteObject.createImmutable(" // Test Türü: "),programsil.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((programsil.mostCurrent._testturu))),RemoteObject.createImmutable(" // Level: "),programsil.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((programsil._level))),RemoteObject.createImmutable(" // Tarih: "),programsil.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((programsil.mostCurrent._tarih))),RemoteObject.createImmutable(" // Saat: "),programsil.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((programsil.mostCurrent._saat))),RemoteObject.createImmutable(""))))));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 170;BA.debugLine="rs.Close";
Debug.ShouldStop(512);
programsil.mostCurrent._rs.runVoidMethod ("Close");
 BA.debugLineNum = 171;BA.debugLine="End Sub";
Debug.ShouldStop(1024);
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
		Debug.PushSubsStack("ButtonTarih_Click (programsil) ","programsil",17,programsil.mostCurrent.activityBA,programsil.mostCurrent,199);
if (RapidSub.canDelegate("buttontarih_click")) { return b4a.example3.programsil.remoteMe.runUserSub(false, "programsil","buttontarih_click");}
int _i = 0;
 BA.debugLineNum = 199;BA.debugLine="Sub ButtonTarih_Click";
Debug.ShouldStop(64);
 BA.debugLineNum = 200;BA.debugLine="WebView1.Visible = False";
Debug.ShouldStop(128);
programsil.mostCurrent._webview1.runMethod(true,"setVisible",programsil.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 201;BA.debugLine="ListView1.Clear";
Debug.ShouldStop(256);
programsil.mostCurrent._listview1.runVoidMethod ("Clear");
 BA.debugLineNum = 202;BA.debugLine="rs = Main.sql.ExecQuery(\"SELECT * FROM Dayaniklil";
Debug.ShouldStop(512);
programsil.mostCurrent._rs.setObject(programsil.mostCurrent._main._sql /*RemoteObject*/ .runMethod(false,"ExecQuery",(Object)(RemoteObject.concat(RemoteObject.createImmutable("SELECT * FROM DayaniklilikTestProgram WHERE program_tarih LIKE '%"),programsil.mostCurrent._edittextara.runMethod(true,"getText"),RemoteObject.createImmutable("%' ORDER BY program_id DESC ")))));
 BA.debugLineNum = 204;BA.debugLine="For i=0 To rs.RowCount-1";
Debug.ShouldStop(2048);
{
final int step4 = 1;
final int limit4 = RemoteObject.solve(new RemoteObject[] {programsil.mostCurrent._rs.runMethod(true,"getRowCount"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step4 > 0 && _i <= limit4) || (step4 < 0 && _i >= limit4) ;_i = ((int)(0 + _i + step4))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 205;BA.debugLine="rs.Position = i";
Debug.ShouldStop(4096);
programsil.mostCurrent._rs.runMethod(true,"setPosition",BA.numberCast(int.class, _i));
 BA.debugLineNum = 206;BA.debugLine="VeriAl";
Debug.ShouldStop(8192);
_verial();
 BA.debugLineNum = 207;BA.debugLine="ListView1.AddTwoLines(id,$\"Tarih: ${tarih} // Sa";
Debug.ShouldStop(16384);
programsil.mostCurrent._listview1.runVoidMethod ("AddTwoLines",(Object)(BA.ObjectToCharSequence(programsil._id)),(Object)(BA.ObjectToCharSequence((RemoteObject.concat(RemoteObject.createImmutable("Tarih: "),programsil.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((programsil.mostCurrent._tarih))),RemoteObject.createImmutable(" // Saat: "),programsil.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((programsil.mostCurrent._saat))),RemoteObject.createImmutable(" // Level: "),programsil.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((programsil._level))),RemoteObject.createImmutable(" // Program Adı: "),programsil.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((programsil.mostCurrent._programadi))),RemoteObject.createImmutable(" // Test Türü: "),programsil.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((programsil.mostCurrent._testturu))),RemoteObject.createImmutable(""))))));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 209;BA.debugLine="rs.Close";
Debug.ShouldStop(65536);
programsil.mostCurrent._rs.runVoidMethod ("Close");
 BA.debugLineNum = 210;BA.debugLine="End Sub";
Debug.ShouldStop(131072);
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
		Debug.PushSubsStack("ButtonTestTuru_Click (programsil) ","programsil",17,programsil.mostCurrent.activityBA,programsil.mostCurrent,186);
if (RapidSub.canDelegate("buttontestturu_click")) { return b4a.example3.programsil.remoteMe.runUserSub(false, "programsil","buttontestturu_click");}
int _i = 0;
 BA.debugLineNum = 186;BA.debugLine="Sub ButtonTestTuru_Click";
Debug.ShouldStop(33554432);
 BA.debugLineNum = 187;BA.debugLine="WebView1.Visible = False";
Debug.ShouldStop(67108864);
programsil.mostCurrent._webview1.runMethod(true,"setVisible",programsil.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 188;BA.debugLine="ListView1.Clear";
Debug.ShouldStop(134217728);
programsil.mostCurrent._listview1.runVoidMethod ("Clear");
 BA.debugLineNum = 189;BA.debugLine="rs = Main.sql.ExecQuery(\"SELECT * FROM Dayaniklil";
Debug.ShouldStop(268435456);
programsil.mostCurrent._rs.setObject(programsil.mostCurrent._main._sql /*RemoteObject*/ .runMethod(false,"ExecQuery",(Object)(RemoteObject.concat(RemoteObject.createImmutable("SELECT * FROM DayaniklilikTestProgram WHERE program_testTuru  LIKE '%"),programsil.mostCurrent._edittextara.runMethod(true,"getText"),RemoteObject.createImmutable("%' ORDER BY program_id DESC ")))));
 BA.debugLineNum = 191;BA.debugLine="For i=0 To rs.RowCount-1";
Debug.ShouldStop(1073741824);
{
final int step4 = 1;
final int limit4 = RemoteObject.solve(new RemoteObject[] {programsil.mostCurrent._rs.runMethod(true,"getRowCount"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step4 > 0 && _i <= limit4) || (step4 < 0 && _i >= limit4) ;_i = ((int)(0 + _i + step4))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 192;BA.debugLine="rs.Position = i";
Debug.ShouldStop(-2147483648);
programsil.mostCurrent._rs.runMethod(true,"setPosition",BA.numberCast(int.class, _i));
 BA.debugLineNum = 193;BA.debugLine="VeriAl";
Debug.ShouldStop(1);
_verial();
 BA.debugLineNum = 194;BA.debugLine="ListView1.AddTwoLines(id,$\"Level: ${level} // Pr";
Debug.ShouldStop(2);
programsil.mostCurrent._listview1.runVoidMethod ("AddTwoLines",(Object)(BA.ObjectToCharSequence(programsil._id)),(Object)(BA.ObjectToCharSequence((RemoteObject.concat(RemoteObject.createImmutable("Level: "),programsil.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((programsil._level))),RemoteObject.createImmutable(" // Program Adı: "),programsil.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((programsil.mostCurrent._programadi))),RemoteObject.createImmutable(" // Test Türü: "),programsil.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((programsil.mostCurrent._testturu))),RemoteObject.createImmutable(" // Tarih: "),programsil.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((programsil.mostCurrent._tarih))),RemoteObject.createImmutable(" // Saat: "),programsil.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((programsil.mostCurrent._saat))),RemoteObject.createImmutable(""))))));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 196;BA.debugLine="rs.Close";
Debug.ShouldStop(8);
programsil.mostCurrent._rs.runVoidMethod ("Close");
 BA.debugLineNum = 197;BA.debugLine="End Sub";
Debug.ShouldStop(16);
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
		Debug.PushSubsStack("EditTextAra_TextChanged (programsil) ","programsil",17,programsil.mostCurrent.activityBA,programsil.mostCurrent,142);
if (RapidSub.canDelegate("edittextara_textchanged")) { return b4a.example3.programsil.remoteMe.runUserSub(false, "programsil","edittextara_textchanged", _old, _new);}
int _i = 0;
Debug.locals.put("Old", _old);
Debug.locals.put("New", _new);
 BA.debugLineNum = 142;BA.debugLine="Sub EditTextAra_TextChanged (Old As String, New As";
Debug.ShouldStop(8192);
 BA.debugLineNum = 143;BA.debugLine="WebView1.Visible = False";
Debug.ShouldStop(16384);
programsil.mostCurrent._webview1.runMethod(true,"setVisible",programsil.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 144;BA.debugLine="LabelCarpi.Visible = True";
Debug.ShouldStop(32768);
programsil.mostCurrent._labelcarpi.runMethod(true,"setVisible",programsil.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 145;BA.debugLine="ListView1.Clear";
Debug.ShouldStop(65536);
programsil.mostCurrent._listview1.runVoidMethod ("Clear");
 BA.debugLineNum = 146;BA.debugLine="rs = Main.sql.ExecQuery( \"SELECT * FROM Dayanikli";
Debug.ShouldStop(131072);
programsil.mostCurrent._rs.setObject(programsil.mostCurrent._main._sql /*RemoteObject*/ .runMethod(false,"ExecQuery",(Object)(RemoteObject.concat(RemoteObject.createImmutable("SELECT * FROM DayaniklilikTestProgram WHERE program_adi LIKE '%"),programsil.mostCurrent._edittextara.runMethod(true,"getText"),RemoteObject.createImmutable("%' OR program_testTuru LIKE '%"),programsil.mostCurrent._edittextara.runMethod(true,"getText"),RemoteObject.createImmutable("%' OR level LIKE '%"),programsil.mostCurrent._edittextara.runMethod(true,"getText"),RemoteObject.createImmutable("%' OR program_tarih LIKE '%"),programsil.mostCurrent._edittextara.runMethod(true,"getText"),RemoteObject.createImmutable("%' OR program_saat LIKE '%"),programsil.mostCurrent._edittextara.runMethod(true,"getText"),RemoteObject.createImmutable("%' ORDER BY program_id DESC")))));
 BA.debugLineNum = 148;BA.debugLine="For i=0 To rs.RowCount-1";
Debug.ShouldStop(524288);
{
final int step5 = 1;
final int limit5 = RemoteObject.solve(new RemoteObject[] {programsil.mostCurrent._rs.runMethod(true,"getRowCount"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step5 > 0 && _i <= limit5) || (step5 < 0 && _i >= limit5) ;_i = ((int)(0 + _i + step5))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 149;BA.debugLine="rs.Position = i";
Debug.ShouldStop(1048576);
programsil.mostCurrent._rs.runMethod(true,"setPosition",BA.numberCast(int.class, _i));
 BA.debugLineNum = 150;BA.debugLine="VeriAl";
Debug.ShouldStop(2097152);
_verial();
 BA.debugLineNum = 151;BA.debugLine="ListView1.AddTwoLines(id,$\"Program Adı: ${progra";
Debug.ShouldStop(4194304);
programsil.mostCurrent._listview1.runVoidMethod ("AddTwoLines",(Object)(BA.ObjectToCharSequence(programsil._id)),(Object)(BA.ObjectToCharSequence((RemoteObject.concat(RemoteObject.createImmutable("Program Adı: "),programsil.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((programsil.mostCurrent._programadi))),RemoteObject.createImmutable(" // Test Türü: "),programsil.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((programsil.mostCurrent._testturu))),RemoteObject.createImmutable(" // Level: "),programsil.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((programsil._level))),RemoteObject.createImmutable(" // Tarih: "),programsil.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((programsil.mostCurrent._tarih))),RemoteObject.createImmutable(" // Saat: "),programsil.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((programsil.mostCurrent._saat))),RemoteObject.createImmutable(""))))));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 153;BA.debugLine="rs.Close";
Debug.ShouldStop(16777216);
programsil.mostCurrent._rs.runVoidMethod ("Close");
 BA.debugLineNum = 154;BA.debugLine="If EditTextAra.Text = \"\" Then";
Debug.ShouldStop(33554432);
if (RemoteObject.solveBoolean("=",programsil.mostCurrent._edittextara.runMethod(true,"getText"),BA.ObjectToString(""))) { 
 BA.debugLineNum = 155;BA.debugLine="LabelCarpi.Visible = False";
Debug.ShouldStop(67108864);
programsil.mostCurrent._labelcarpi.runMethod(true,"setVisible",programsil.mostCurrent.__c.getField(true,"False"));
 };
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
public static RemoteObject  _globals() throws Exception{
 //BA.debugLineNum = 12;BA.debugLine="Sub Globals";
 //BA.debugLineNum = 16;BA.debugLine="Private ButtonAnasayfa As Button";
programsil.mostCurrent._buttonanasayfa = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 17;BA.debugLine="Private EditTextAra As EditText";
programsil.mostCurrent._edittextara = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
 //BA.debugLineNum = 18;BA.debugLine="Private LabelCarpi As Label";
programsil.mostCurrent._labelcarpi = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 19;BA.debugLine="Private ButtonDayaniklilikProgramEkle As Button";
programsil.mostCurrent._buttondayaniklilikprogramekle = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 20;BA.debugLine="Private ButtonDayaniklilikProgramTabloVeri As But";
programsil.mostCurrent._buttondayaniklilikprogramtabloveri = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 21;BA.debugLine="Private ListView1 As ListView";
programsil.mostCurrent._listview1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.ListViewWrapper");
 //BA.debugLineNum = 22;BA.debugLine="Private WebView1 As WebView";
programsil.mostCurrent._webview1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.WebViewWrapper");
 //BA.debugLineNum = 24;BA.debugLine="Private ButtonProgramAdi As Button";
programsil.mostCurrent._buttonprogramadi = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 25;BA.debugLine="Private ButtonLevel As Button";
programsil.mostCurrent._buttonlevel = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 26;BA.debugLine="Private ButtonTestTuru As Button";
programsil.mostCurrent._buttontestturu = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 27;BA.debugLine="Private ButtonTarih As Button";
programsil.mostCurrent._buttontarih = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 28;BA.debugLine="Private ButtonPistUzunlugu As Button";
programsil.mostCurrent._buttonpistuzunlugu = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 29;BA.debugLine="Private ButtonKoniArasiMesafe As Button";
programsil.mostCurrent._buttonkoniarasimesafe = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 30;BA.debugLine="Private ButtonKoniSayisi As Button";
programsil.mostCurrent._buttonkonisayisi = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 31;BA.debugLine="Private ButtonHiz As Button";
programsil.mostCurrent._buttonhiz = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 33;BA.debugLine="Dim rs As ResultSet";
programsil.mostCurrent._rs = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL.ResultSetWrapper");
 //BA.debugLineNum = 34;BA.debugLine="Dim id , level As Int";
programsil._id = RemoteObject.createImmutable(0);
programsil._level = RemoteObject.createImmutable(0);
 //BA.debugLineNum = 35;BA.debugLine="Dim programAdi ,testTuru, tarih, saat As String";
programsil.mostCurrent._programadi = RemoteObject.createImmutable("");
programsil.mostCurrent._testturu = RemoteObject.createImmutable("");
programsil.mostCurrent._tarih = RemoteObject.createImmutable("");
programsil.mostCurrent._saat = RemoteObject.createImmutable("");
 //BA.debugLineNum = 36;BA.debugLine="Dim koniMesafesi, hiz As Float";
programsil._konimesafesi = RemoteObject.createImmutable(0f);
programsil._hiz = RemoteObject.createImmutable(0f);
 //BA.debugLineNum = 39;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _labelcarpi_click() throws Exception{
try {
		Debug.PushSubsStack("LabelCarpi_Click (programsil) ","programsil",17,programsil.mostCurrent.activityBA,programsil.mostCurrent,253);
if (RapidSub.canDelegate("labelcarpi_click")) { return b4a.example3.programsil.remoteMe.runUserSub(false, "programsil","labelcarpi_click");}
 BA.debugLineNum = 253;BA.debugLine="Sub LabelCarpi_Click";
Debug.ShouldStop(268435456);
 BA.debugLineNum = 254;BA.debugLine="EditTextAra.SelectAll";
Debug.ShouldStop(536870912);
programsil.mostCurrent._edittextara.runVoidMethod ("SelectAll");
 BA.debugLineNum = 255;BA.debugLine="ListViewGosterDB";
Debug.ShouldStop(1073741824);
_listviewgosterdb();
 BA.debugLineNum = 256;BA.debugLine="End Sub";
Debug.ShouldStop(-2147483648);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _listview1_itemclick(RemoteObject _position,RemoteObject _value) throws Exception{
try {
		Debug.PushSubsStack("ListView1_ItemClick (programsil) ","programsil",17,programsil.mostCurrent.activityBA,programsil.mostCurrent,276);
if (RapidSub.canDelegate("listview1_itemclick")) { return b4a.example3.programsil.remoteMe.runUserSub(false, "programsil","listview1_itemclick", _position, _value);}
RemoteObject _result = RemoteObject.createImmutable(0);
Debug.locals.put("Position", _position);
Debug.locals.put("Value", _value);
 BA.debugLineNum = 276;BA.debugLine="Sub ListView1_ItemClick (Position As Int, Value As";
Debug.ShouldStop(524288);
 BA.debugLineNum = 277;BA.debugLine="Dim result As Int = Msgbox2($\"Program ismi: ${pro";
Debug.ShouldStop(1048576);
_result = programsil.mostCurrent.__c.runMethodAndSync(true,"Msgbox2",(Object)(BA.ObjectToCharSequence((RemoteObject.concat(RemoteObject.createImmutable("Program ismi: "),programsil.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((programsil.mostCurrent._programadi))),RemoteObject.createImmutable(" olan program bilgilerini görüntülemek için Görüntüle'yi tıklayın ya da Seçili program için Dayanıklılık Testi yapmak için lütfen Test Yap'ı seçin"))))),(Object)(BA.ObjectToCharSequence("Bildirim Mesajı")),(Object)(BA.ObjectToString("Görüntüle")),(Object)(BA.ObjectToString("")),(Object)(BA.ObjectToString("Test Yap")),(Object)((programsil.mostCurrent.__c.getField(false,"Null"))),programsil.mostCurrent.activityBA);Debug.locals.put("result", _result);Debug.locals.put("result", _result);
 BA.debugLineNum = 278;BA.debugLine="If result = DialogResponse.POSITIVE Then";
Debug.ShouldStop(2097152);
if (RemoteObject.solveBoolean("=",_result,BA.numberCast(double.class, programsil.mostCurrent.__c.getField(false,"DialogResponse").getField(true,"POSITIVE")))) { 
 BA.debugLineNum = 279;BA.debugLine="WebView1.Visible = True";
Debug.ShouldStop(4194304);
programsil.mostCurrent._webview1.runMethod(true,"setVisible",programsil.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 280;BA.debugLine="WebView1.LoadHtml(DBUtils.ExecuteHtml(Main.sql,\"";
Debug.ShouldStop(8388608);
programsil.mostCurrent._webview1.runVoidMethod ("LoadHtml",(Object)(programsil.mostCurrent._dbutils.runMethod(true,"_executehtml" /*RemoteObject*/ ,programsil.mostCurrent.activityBA,(Object)(programsil.mostCurrent._main._sql /*RemoteObject*/ ),(Object)(RemoteObject.concat(RemoteObject.createImmutable("SELECT program_adi  As [PROGRAM ADI], program_tarih  As [TARİH],program_saat As [SAAT], level As [LEVEL], program_testTuru  As [TEST TÜRÜ],koniMesafesi1 As [KONİ MESAFESİ1] , hiz1 As [HIZ1], dakika1 As [DAKİKA1] ,saniye1  As [SANİYE1] ,koniMesafesi2 As [KONİ MESAFESİ2] , hiz2 As [HIZ2],dakika2 As [DAKİKA2],saniye2  As [SANİYE2],koniMesafesi3 As [KONİ MESAFESİ3],hiz3 As [HIZ3],dakika3 As [DAKİKA3] ,saniye3  As [SANİYE3],koniMesafesi4 As [KONİ MESAFESİ4] ,hiz4 As [HIZ4],dakika4 As [DAKİKA4],saniye4  As [SANİYE4],koniMesafesi5 As [KONİ MESAFESİ5],hiz5 As [HIZ5] ,dakika5 As [DAKİKA5],saniye5  As [SANİYE5],koniMesafesi6 As [KONİ MESAFESİ6] ,hiz6 As [HIZ6] ,dakika6 As [DAKİKA6],saniye6  As [SANİYE6],koniMesafesi7 As [KONİ MESAFESİ7] ,hiz7 As [HIZ7] ,dakika7 As [DAKİKA7] ,saniye7  As [SANİYE7], koniMesafesi8 As [KONİ MESAFESİ8] ,hiz8 As [HIZ8],dakika8 As [DAKİKA8] ,saniye8  As [SANİYE8],koniMesafesi9 As [KONİ MESAFESİ9],hiz9 As [HIZ9],dakika9 As [DAKİKA9] ,saniye9  As [SANİYE9],koniMesafesi10 As [KONİ MESAFESİ10] ,hiz10 As [HIZ10] ,dakika10 As [DAKİKA10] ,saniye10  As [SANİYE10],koniMesafesi11 As [KONİ MESAFESİ11] ,hiz11 As [HIZ11] ,dakika11 As [DAKİKA11] ,saniye11  As [SANİYE11],koniMesafesi12 As [KONİ MESAFESİ12],hiz12 As [HIZ12],dakika12 As [DAKİKA12],saniye12  As [SANİYE12],koniMesafesi13 As [KONİ MESAFESİ13] ,hiz13 As [HIZ13] ,dakika13 As [DAKİKA13] ,saniye13  As [SANİYE13],koniMesafesi14 As [KONİ MESAFESİ14],hiz14 As [HIZ14] ,dakika14 As [DAKİKA14],saniye14  As [SANİYE14],koniMesafesi15 As [KONİ MESAFESİ15],hiz15 As [HIZ15] ,dakika15 As [DAKİKA15] ,saniye15  As [SANİYE15],koniMesafesi16 As [KONİ MESAFESİ16],hiz16 As [HIZ16],dakika16 As [DAKİKA16] ,saniye16  As [SANİYE16], koniMesafesi17 As [KONİ MESAFESİ17] ,hiz17 As [HIZ17] ,dakika17 As [DAKİKA17],saniye17  As [SANİYE17] ,koniMesafesi18 As [KONİ MESAFESİ18] ,hiz18 As [HIZ18] ,dakika18 As [DAKİKA18],saniye18  As [SANİYE18] ,koniMesafesi19 As [KONİ MESAFESİ19] ,hiz19 As [HIZ19] ,dakika19 As [DAKİKA19] ,saniye19  As [SANİYE19],koniMesafesi20 As [KONİ MESAFESİ20] ,hiz20 As [HIZ20] ,dakika20 As [DAKİKA20] ,saniye20 As [SANİYE20], koniMesafesi21 As [KONİ MESAFESİ21] ,hiz21 As [HIZ21] ,dakika21 As [DAKİKA21],saniye21 As [SANİYE21], koniMesafesi22 As [KONİ MESAFESİ22] ,hiz22 As [HIZ22],dakika22 As [DAKİKA22] ,saniye22 As [SANİYE22], koniMesafesi23 As [KONİ MESAFESİ23] ,hiz23 As [HIZ23],dakika23 As [DAKİKA23],saniye23 As [SANİYE23], koniMesafesi24 As [KONİ MESAFESİ24] ,hiz24 As [HIZ24] ,dakika24 As [DAKİKA24],saniye24 As [SANİYE24],koniMesafesi25 As [KONİ MESAFESİ25] ,hiz25 As [HIZ25] ,dakika25 As [DAKİKA25] ,saniye25 As [SANİYE25] FROM DayaniklilikTestProgram WHERE program_id = '"),_value,RemoteObject.createImmutable("' "))),(Object)((programsil.mostCurrent.__c.getField(false,"Null"))),(Object)(BA.numberCast(int.class, -(double) (0 + 1))),(Object)(programsil.mostCurrent.__c.getField(true,"False")))));
 BA.debugLineNum = 281;BA.debugLine="Return";
Debug.ShouldStop(16777216);
if (true) return RemoteObject.createImmutable("");
 }else 
{ BA.debugLineNum = 282;BA.debugLine="Else if result = DialogResponse.NEGATIVE Then";
Debug.ShouldStop(33554432);
if (RemoteObject.solveBoolean("=",_result,BA.numberCast(double.class, programsil.mostCurrent.__c.getField(false,"DialogResponse").getField(true,"NEGATIVE")))) { 
 BA.debugLineNum = 284;BA.debugLine="Activity.finish";
Debug.ShouldStop(134217728);
programsil.mostCurrent._activity.runVoidMethod ("Finish");
 }}
;
 BA.debugLineNum = 287;BA.debugLine="End Sub";
Debug.ShouldStop(1073741824);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _listview1_itemlongclick(RemoteObject _position,RemoteObject _value) throws Exception{
try {
		Debug.PushSubsStack("ListView1_ItemLongClick (programsil) ","programsil",17,programsil.mostCurrent.activityBA,programsil.mostCurrent,258);
if (RapidSub.canDelegate("listview1_itemlongclick")) { return b4a.example3.programsil.remoteMe.runUserSub(false, "programsil","listview1_itemlongclick", _position, _value);}
int _i = 0;
RemoteObject _result = RemoteObject.createImmutable(0);
Debug.locals.put("Position", _position);
Debug.locals.put("Value", _value);
 BA.debugLineNum = 258;BA.debugLine="Sub ListView1_ItemLongClick (Position As Int, Valu";
Debug.ShouldStop(2);
 BA.debugLineNum = 259;BA.debugLine="rs = Main.sql.ExecQuery(\"SELECT * FROM Dayaniklil";
Debug.ShouldStop(4);
programsil.mostCurrent._rs.setObject(programsil.mostCurrent._main._sql /*RemoteObject*/ .runMethod(false,"ExecQuery",(Object)(RemoteObject.concat(RemoteObject.createImmutable("SELECT * FROM DayaniklilikTestProgram WHERE program_id = '"),_value,RemoteObject.createImmutable("' ")))));
 BA.debugLineNum = 261;BA.debugLine="For i=0 To rs.RowCount-1";
Debug.ShouldStop(16);
{
final int step2 = 1;
final int limit2 = RemoteObject.solve(new RemoteObject[] {programsil.mostCurrent._rs.runMethod(true,"getRowCount"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step2 > 0 && _i <= limit2) || (step2 < 0 && _i >= limit2) ;_i = ((int)(0 + _i + step2))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 262;BA.debugLine="rs.Position = i";
Debug.ShouldStop(32);
programsil.mostCurrent._rs.runMethod(true,"setPosition",BA.numberCast(int.class, _i));
 BA.debugLineNum = 263;BA.debugLine="id = rs.GetInt(\"program_id\")";
Debug.ShouldStop(64);
programsil._id = programsil.mostCurrent._rs.runMethod(true,"GetInt",(Object)(RemoteObject.createImmutable("program_id")));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 265;BA.debugLine="rs.Close";
Debug.ShouldStop(256);
programsil.mostCurrent._rs.runVoidMethod ("Close");
 BA.debugLineNum = 267;BA.debugLine="Dim result As Int";
Debug.ShouldStop(1024);
_result = RemoteObject.createImmutable(0);Debug.locals.put("result", _result);
 BA.debugLineNum = 268;BA.debugLine="result = Msgbox2(\"Programı silmek istediğinizden";
Debug.ShouldStop(2048);
_result = programsil.mostCurrent.__c.runMethodAndSync(true,"Msgbox2",(Object)(BA.ObjectToCharSequence("Programı silmek istediğinizden emin misiniz?:")),(Object)(BA.ObjectToCharSequence("Onay Mesajı")),(Object)(BA.ObjectToString("Evet")),(Object)(BA.ObjectToString("")),(Object)(BA.ObjectToString("Hayır")),(Object)((programsil.mostCurrent.__c.getField(false,"Null"))),programsil.mostCurrent.activityBA);Debug.locals.put("result", _result);
 BA.debugLineNum = 269;BA.debugLine="If result = DialogResponse.POSITIVE Then";
Debug.ShouldStop(4096);
if (RemoteObject.solveBoolean("=",_result,BA.numberCast(double.class, programsil.mostCurrent.__c.getField(false,"DialogResponse").getField(true,"POSITIVE")))) { 
 BA.debugLineNum = 270;BA.debugLine="Main.sql.ExecNonQuery(\"DELETE FROM DayaniklilikT";
Debug.ShouldStop(8192);
programsil.mostCurrent._main._sql /*RemoteObject*/ .runVoidMethod ("ExecNonQuery",(Object)(RemoteObject.concat(RemoteObject.createImmutable("DELETE FROM DayaniklilikTestProgram WHERE program_id = '"),programsil._id,RemoteObject.createImmutable("' "))));
 BA.debugLineNum = 271;BA.debugLine="ToastMessageShow(\"Program silindi...\",False)";
Debug.ShouldStop(16384);
programsil.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("Program silindi...")),(Object)(programsil.mostCurrent.__c.getField(true,"False")));
 };
 BA.debugLineNum = 273;BA.debugLine="ListViewGosterDB";
Debug.ShouldStop(65536);
_listviewgosterdb();
 BA.debugLineNum = 274;BA.debugLine="End Sub";
Debug.ShouldStop(131072);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _listviewgosterdb() throws Exception{
try {
		Debug.PushSubsStack("ListViewGosterDB (programsil) ","programsil",17,programsil.mostCurrent.activityBA,programsil.mostCurrent,131);
if (RapidSub.canDelegate("listviewgosterdb")) { return b4a.example3.programsil.remoteMe.runUserSub(false, "programsil","listviewgosterdb");}
int _i = 0;
 BA.debugLineNum = 131;BA.debugLine="Sub ListViewGosterDB";
Debug.ShouldStop(4);
 BA.debugLineNum = 132;BA.debugLine="WebView1.Visible = False";
Debug.ShouldStop(8);
programsil.mostCurrent._webview1.runMethod(true,"setVisible",programsil.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 133;BA.debugLine="ListView1.Clear";
Debug.ShouldStop(16);
programsil.mostCurrent._listview1.runVoidMethod ("Clear");
 BA.debugLineNum = 134;BA.debugLine="rs = Main.sql.ExecQuery(\"SELECT * FROM Dayaniklil";
Debug.ShouldStop(32);
programsil.mostCurrent._rs.setObject(programsil.mostCurrent._main._sql /*RemoteObject*/ .runMethod(false,"ExecQuery",(Object)(RemoteObject.createImmutable("SELECT * FROM DayaniklilikTestProgram ORDER BY program_id DESC"))));
 BA.debugLineNum = 135;BA.debugLine="For i=0 To rs.RowCount-1";
Debug.ShouldStop(64);
{
final int step4 = 1;
final int limit4 = RemoteObject.solve(new RemoteObject[] {programsil.mostCurrent._rs.runMethod(true,"getRowCount"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step4 > 0 && _i <= limit4) || (step4 < 0 && _i >= limit4) ;_i = ((int)(0 + _i + step4))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 136;BA.debugLine="rs.Position = i";
Debug.ShouldStop(128);
programsil.mostCurrent._rs.runMethod(true,"setPosition",BA.numberCast(int.class, _i));
 BA.debugLineNum = 137;BA.debugLine="VeriAl";
Debug.ShouldStop(256);
_verial();
 BA.debugLineNum = 138;BA.debugLine="ListView1.AddTwoLines(id,$\"Program Adı: ${progra";
Debug.ShouldStop(512);
programsil.mostCurrent._listview1.runVoidMethod ("AddTwoLines",(Object)(BA.ObjectToCharSequence(programsil._id)),(Object)(BA.ObjectToCharSequence((RemoteObject.concat(RemoteObject.createImmutable("Program Adı: "),programsil.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((programsil.mostCurrent._programadi))),RemoteObject.createImmutable(" // Test Türü: "),programsil.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((programsil.mostCurrent._testturu))),RemoteObject.createImmutable(" // Level: "),programsil.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((programsil._level))),RemoteObject.createImmutable(" // Tarih: "),programsil.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((programsil.mostCurrent._tarih))),RemoteObject.createImmutable(" // Saat: "),programsil.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((programsil.mostCurrent._saat))),RemoteObject.createImmutable(""))))));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 140;BA.debugLine="End Sub";
Debug.ShouldStop(2048);
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
public static RemoteObject  _setdivider(RemoteObject _lv,RemoteObject _renk,RemoteObject _height) throws Exception{
try {
		Debug.PushSubsStack("SetDivider (programsil) ","programsil",17,programsil.mostCurrent.activityBA,programsil.mostCurrent,301);
if (RapidSub.canDelegate("setdivider")) { return b4a.example3.programsil.remoteMe.runUserSub(false, "programsil","setdivider", _lv, _renk, _height);}
RemoteObject _r = RemoteObject.declareNull("anywheresoftware.b4a.agraham.reflection.Reflection");
RemoteObject _cd = RemoteObject.declareNull("anywheresoftware.b4a.objects.drawable.ColorDrawable");
Debug.locals.put("lv", _lv);
Debug.locals.put("Renk", _renk);
Debug.locals.put("Height", _height);
 BA.debugLineNum = 301;BA.debugLine="Sub SetDivider(lv As ListView, Renk As Int, Height";
Debug.ShouldStop(4096);
 BA.debugLineNum = 302;BA.debugLine="Dim r As Reflector";
Debug.ShouldStop(8192);
_r = RemoteObject.createNew ("anywheresoftware.b4a.agraham.reflection.Reflection");Debug.locals.put("r", _r);
 BA.debugLineNum = 303;BA.debugLine="r.Target = lv";
Debug.ShouldStop(16384);
_r.setField ("Target",(_lv.getObject()));
 BA.debugLineNum = 304;BA.debugLine="Dim CD As ColorDrawable";
Debug.ShouldStop(32768);
_cd = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.ColorDrawable");Debug.locals.put("CD", _cd);
 BA.debugLineNum = 305;BA.debugLine="CD.Initialize(Renk, 0)";
Debug.ShouldStop(65536);
_cd.runVoidMethod ("Initialize",(Object)(_renk),(Object)(BA.numberCast(int.class, 0)));
 BA.debugLineNum = 306;BA.debugLine="r.RunMethod4(\"setDivider\", Array As Object(CD), A";
Debug.ShouldStop(131072);
_r.runVoidMethod ("RunMethod4",(Object)(BA.ObjectToString("setDivider")),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(_cd.getObject())})),(Object)(RemoteObject.createNewArray("String",new int[] {1},new Object[] {RemoteObject.createImmutable("android.graphics.drawable.Drawable")})));
 BA.debugLineNum = 307;BA.debugLine="r.RunMethod2(\"setDividerHeight\", Height, \"java.la";
Debug.ShouldStop(262144);
_r.runVoidMethod ("RunMethod2",(Object)(BA.ObjectToString("setDividerHeight")),(Object)(BA.NumberToString(_height)),(Object)(RemoteObject.createImmutable("java.lang.int")));
 BA.debugLineNum = 308;BA.debugLine="End Sub";
Debug.ShouldStop(524288);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _verial() throws Exception{
try {
		Debug.PushSubsStack("VeriAl (programsil) ","programsil",17,programsil.mostCurrent.activityBA,programsil.mostCurrent,120);
if (RapidSub.canDelegate("verial")) { return b4a.example3.programsil.remoteMe.runUserSub(false, "programsil","verial");}
 BA.debugLineNum = 120;BA.debugLine="Sub VeriAl";
Debug.ShouldStop(8388608);
 BA.debugLineNum = 121;BA.debugLine="id= rs.GetInt(\"program_id\")";
Debug.ShouldStop(16777216);
programsil._id = programsil.mostCurrent._rs.runMethod(true,"GetInt",(Object)(RemoteObject.createImmutable("program_id")));
 BA.debugLineNum = 122;BA.debugLine="programAdi = rs.GetString(\"program_adi\")";
Debug.ShouldStop(33554432);
programsil.mostCurrent._programadi = programsil.mostCurrent._rs.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("program_adi")));
 BA.debugLineNum = 123;BA.debugLine="testTuru = rs.GetString(\"program_testTuru\")";
Debug.ShouldStop(67108864);
programsil.mostCurrent._testturu = programsil.mostCurrent._rs.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("program_testTuru")));
 BA.debugLineNum = 124;BA.debugLine="level = rs.GetInt(\"level\")";
Debug.ShouldStop(134217728);
programsil._level = programsil.mostCurrent._rs.runMethod(true,"GetInt",(Object)(RemoteObject.createImmutable("level")));
 BA.debugLineNum = 125;BA.debugLine="tarih = rs.GetString(\"program_tarih\")";
Debug.ShouldStop(268435456);
programsil.mostCurrent._tarih = programsil.mostCurrent._rs.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("program_tarih")));
 BA.debugLineNum = 126;BA.debugLine="saat = rs.GetString(\"program_saat\")";
Debug.ShouldStop(536870912);
programsil.mostCurrent._saat = programsil.mostCurrent._rs.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("program_saat")));
 BA.debugLineNum = 127;BA.debugLine="koniMesafesi = rs.GetString(\"koniMesafesi1\")";
Debug.ShouldStop(1073741824);
programsil._konimesafesi = BA.numberCast(float.class, programsil.mostCurrent._rs.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("koniMesafesi1"))));
 BA.debugLineNum = 128;BA.debugLine="hiz = rs.GetString(\"hiz1\")";
Debug.ShouldStop(-2147483648);
programsil._hiz = BA.numberCast(float.class, programsil.mostCurrent._rs.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("hiz1"))));
 BA.debugLineNum = 129;BA.debugLine="End Sub";
Debug.ShouldStop(1);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}