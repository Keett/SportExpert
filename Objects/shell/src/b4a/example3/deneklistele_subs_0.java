package b4a.example3;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class deneklistele_subs_0 {


public static RemoteObject  _activity_create(RemoteObject _firsttime) throws Exception{
try {
		Debug.PushSubsStack("Activity_Create (deneklistele) ","deneklistele",9,deneklistele.mostCurrent.activityBA,deneklistele.mostCurrent,36);
if (RapidSub.canDelegate("activity_create")) { return b4a.example3.deneklistele.remoteMe.runUserSub(false, "deneklistele","activity_create", _firsttime);}
Debug.locals.put("FirstTime", _firsttime);
 BA.debugLineNum = 36;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
Debug.ShouldStop(8);
 BA.debugLineNum = 38;BA.debugLine="Activity.LoadLayout(\"DenekListelePage\")";
Debug.ShouldStop(32);
deneklistele.mostCurrent._activity.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("DenekListelePage")),deneklistele.mostCurrent.activityBA);
 BA.debugLineNum = 39;BA.debugLine="LabelCarpi.Visible = False";
Debug.ShouldStop(64);
deneklistele.mostCurrent._labelcarpi.runMethod(true,"setVisible",deneklistele.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 40;BA.debugLine="HTMLGosterDB";
Debug.ShouldStop(128);
_htmlgosterdb();
 BA.debugLineNum = 43;BA.debugLine="EditTextAra.TextColor = Colors.White";
Debug.ShouldStop(1024);
deneklistele.mostCurrent._edittextara.runMethod(true,"setTextColor",deneklistele.mostCurrent.__c.getField(false,"Colors").getField(true,"White"));
 BA.debugLineNum = 44;BA.debugLine="EditTextAra.Hint = \"Bu alana yazarak aratabilirsi";
Debug.ShouldStop(2048);
deneklistele.mostCurrent._edittextara.runMethod(true,"setHint",BA.ObjectToString("Bu alana yazarak aratabilirsiniz.."));
 BA.debugLineNum = 45;BA.debugLine="EditTextAra.HintColor = Color.hintColor";
Debug.ShouldStop(4096);
deneklistele.mostCurrent._edittextara.runMethod(true,"setHintColor",deneklistele.mostCurrent._color._hintcolor /*RemoteObject*/ );
 BA.debugLineNum = 46;BA.debugLine="EditTextAra.TextSize = 20";
Debug.ShouldStop(8192);
deneklistele.mostCurrent._edittextara.runMethod(true,"setTextSize",BA.numberCast(float.class, 20));
 BA.debugLineNum = 47;BA.debugLine="EditTextAra.Typeface = Typeface.DEFAULT_BOLD";
Debug.ShouldStop(16384);
deneklistele.mostCurrent._edittextara.runMethod(false,"setTypeface",deneklistele.mostCurrent.__c.getField(false,"Typeface").getField(false,"DEFAULT_BOLD"));
 BA.debugLineNum = 49;BA.debugLine="ButtonTc.TextColor = Color.koyuMavi";
Debug.ShouldStop(65536);
deneklistele.mostCurrent._buttontc.runMethod(true,"setTextColor",deneklistele.mostCurrent._color._koyumavi /*RemoteObject*/ );
 BA.debugLineNum = 50;BA.debugLine="ButtonTc.Typeface = Typeface.DEFAULT_BOLD";
Debug.ShouldStop(131072);
deneklistele.mostCurrent._buttontc.runMethod(false,"setTypeface",deneklistele.mostCurrent.__c.getField(false,"Typeface").getField(false,"DEFAULT_BOLD"));
 BA.debugLineNum = 51;BA.debugLine="ButtonTc.SingleLine = True";
Debug.ShouldStop(262144);
deneklistele.mostCurrent._buttontc.runVoidMethod ("setSingleLine",deneklistele.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 52;BA.debugLine="ButtonTc.Text = \"TC\"";
Debug.ShouldStop(524288);
deneklistele.mostCurrent._buttontc.runMethod(true,"setText",BA.ObjectToCharSequence("TC"));
 BA.debugLineNum = 53;BA.debugLine="ButtonTc.TextSize = 14";
Debug.ShouldStop(1048576);
deneklistele.mostCurrent._buttontc.runMethod(true,"setTextSize",BA.numberCast(float.class, 14));
 BA.debugLineNum = 55;BA.debugLine="ButtonIsim.TextColor = Color.koyuMavi";
Debug.ShouldStop(4194304);
deneklistele.mostCurrent._buttonisim.runMethod(true,"setTextColor",deneklistele.mostCurrent._color._koyumavi /*RemoteObject*/ );
 BA.debugLineNum = 56;BA.debugLine="ButtonIsim.Typeface = Typeface.DEFAULT_BOLD";
Debug.ShouldStop(8388608);
deneklistele.mostCurrent._buttonisim.runMethod(false,"setTypeface",deneklistele.mostCurrent.__c.getField(false,"Typeface").getField(false,"DEFAULT_BOLD"));
 BA.debugLineNum = 57;BA.debugLine="ButtonIsim.SingleLine = True";
Debug.ShouldStop(16777216);
deneklistele.mostCurrent._buttonisim.runVoidMethod ("setSingleLine",deneklistele.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 58;BA.debugLine="ButtonIsim.Text =\"İSİM\"";
Debug.ShouldStop(33554432);
deneklistele.mostCurrent._buttonisim.runMethod(true,"setText",BA.ObjectToCharSequence("İSİM"));
 BA.debugLineNum = 59;BA.debugLine="ButtonIsim.TextSize = 14";
Debug.ShouldStop(67108864);
deneklistele.mostCurrent._buttonisim.runMethod(true,"setTextSize",BA.numberCast(float.class, 14));
 BA.debugLineNum = 61;BA.debugLine="ButtonCinsiyet.TextColor = Color.koyuMavi";
Debug.ShouldStop(268435456);
deneklistele.mostCurrent._buttoncinsiyet.runMethod(true,"setTextColor",deneklistele.mostCurrent._color._koyumavi /*RemoteObject*/ );
 BA.debugLineNum = 62;BA.debugLine="ButtonCinsiyet.Typeface = Typeface.DEFAULT_BOLD";
Debug.ShouldStop(536870912);
deneklistele.mostCurrent._buttoncinsiyet.runMethod(false,"setTypeface",deneklistele.mostCurrent.__c.getField(false,"Typeface").getField(false,"DEFAULT_BOLD"));
 BA.debugLineNum = 63;BA.debugLine="ButtonCinsiyet.SingleLine = True";
Debug.ShouldStop(1073741824);
deneklistele.mostCurrent._buttoncinsiyet.runVoidMethod ("setSingleLine",deneklistele.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 64;BA.debugLine="ButtonCinsiyet.Text = \"CİNSİYET\"";
Debug.ShouldStop(-2147483648);
deneklistele.mostCurrent._buttoncinsiyet.runMethod(true,"setText",BA.ObjectToCharSequence("CİNSİYET"));
 BA.debugLineNum = 65;BA.debugLine="ButtonCinsiyet.TextSize = 14";
Debug.ShouldStop(1);
deneklistele.mostCurrent._buttoncinsiyet.runMethod(true,"setTextSize",BA.numberCast(float.class, 14));
 BA.debugLineNum = 67;BA.debugLine="ButtonDogumTarihi.TextColor = Color.koyuMavi";
Debug.ShouldStop(4);
deneklistele.mostCurrent._buttondogumtarihi.runMethod(true,"setTextColor",deneklistele.mostCurrent._color._koyumavi /*RemoteObject*/ );
 BA.debugLineNum = 68;BA.debugLine="ButtonDogumTarihi.Typeface = Typeface.DEFAULT_BOL";
Debug.ShouldStop(8);
deneklistele.mostCurrent._buttondogumtarihi.runMethod(false,"setTypeface",deneklistele.mostCurrent.__c.getField(false,"Typeface").getField(false,"DEFAULT_BOLD"));
 BA.debugLineNum = 69;BA.debugLine="ButtonDogumTarihi.SingleLine = True";
Debug.ShouldStop(16);
deneklistele.mostCurrent._buttondogumtarihi.runVoidMethod ("setSingleLine",deneklistele.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 70;BA.debugLine="ButtonDogumTarihi.Text = \"DOĞUM TARİHİ\"";
Debug.ShouldStop(32);
deneklistele.mostCurrent._buttondogumtarihi.runMethod(true,"setText",BA.ObjectToCharSequence("DOĞUM TARİHİ"));
 BA.debugLineNum = 71;BA.debugLine="ButtonDogumTarihi.TextSize = 14";
Debug.ShouldStop(64);
deneklistele.mostCurrent._buttondogumtarihi.runMethod(true,"setTextSize",BA.numberCast(float.class, 14));
 BA.debugLineNum = 73;BA.debugLine="ButtonDogumYeri.TextColor = Color.koyuMavi";
Debug.ShouldStop(256);
deneklistele.mostCurrent._buttondogumyeri.runMethod(true,"setTextColor",deneklistele.mostCurrent._color._koyumavi /*RemoteObject*/ );
 BA.debugLineNum = 74;BA.debugLine="ButtonDogumYeri.Typeface = Typeface.DEFAULT_BOLD";
Debug.ShouldStop(512);
deneklistele.mostCurrent._buttondogumyeri.runMethod(false,"setTypeface",deneklistele.mostCurrent.__c.getField(false,"Typeface").getField(false,"DEFAULT_BOLD"));
 BA.debugLineNum = 75;BA.debugLine="ButtonDogumYeri.SingleLine = True";
Debug.ShouldStop(1024);
deneklistele.mostCurrent._buttondogumyeri.runVoidMethod ("setSingleLine",deneklistele.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 76;BA.debugLine="ButtonDogumYeri.Text = \"DOĞUM YERİ\"";
Debug.ShouldStop(2048);
deneklistele.mostCurrent._buttondogumyeri.runMethod(true,"setText",BA.ObjectToCharSequence("DOĞUM YERİ"));
 BA.debugLineNum = 77;BA.debugLine="ButtonDogumYeri.TextSize = 14";
Debug.ShouldStop(4096);
deneklistele.mostCurrent._buttondogumyeri.runMethod(true,"setTextSize",BA.numberCast(float.class, 14));
 BA.debugLineNum = 79;BA.debugLine="ButtonBabaAdi.TextColor = Color.koyuMavi";
Debug.ShouldStop(16384);
deneklistele.mostCurrent._buttonbabaadi.runMethod(true,"setTextColor",deneklistele.mostCurrent._color._koyumavi /*RemoteObject*/ );
 BA.debugLineNum = 80;BA.debugLine="ButtonBabaAdi.Typeface = Typeface.DEFAULT_BOLD";
Debug.ShouldStop(32768);
deneklistele.mostCurrent._buttonbabaadi.runMethod(false,"setTypeface",deneklistele.mostCurrent.__c.getField(false,"Typeface").getField(false,"DEFAULT_BOLD"));
 BA.debugLineNum = 81;BA.debugLine="ButtonBabaAdi.SingleLine = True";
Debug.ShouldStop(65536);
deneklistele.mostCurrent._buttonbabaadi.runVoidMethod ("setSingleLine",deneklistele.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 82;BA.debugLine="ButtonBabaAdi.Text = \"BABA ADI\"";
Debug.ShouldStop(131072);
deneklistele.mostCurrent._buttonbabaadi.runMethod(true,"setText",BA.ObjectToCharSequence("BABA ADI"));
 BA.debugLineNum = 83;BA.debugLine="ButtonBabaAdi.TextSize = 14";
Debug.ShouldStop(262144);
deneklistele.mostCurrent._buttonbabaadi.runMethod(true,"setTextSize",BA.numberCast(float.class, 14));
 BA.debugLineNum = 85;BA.debugLine="ButtonEngelDurumu.TextColor= Color.koyuMavi";
Debug.ShouldStop(1048576);
deneklistele.mostCurrent._buttonengeldurumu.runMethod(true,"setTextColor",deneklistele.mostCurrent._color._koyumavi /*RemoteObject*/ );
 BA.debugLineNum = 86;BA.debugLine="ButtonEngelDurumu.Typeface= Typeface.DEFAULT_BOLD";
Debug.ShouldStop(2097152);
deneklistele.mostCurrent._buttonengeldurumu.runMethod(false,"setTypeface",deneklistele.mostCurrent.__c.getField(false,"Typeface").getField(false,"DEFAULT_BOLD"));
 BA.debugLineNum = 87;BA.debugLine="ButtonEngelDurumu.SingleLine= True";
Debug.ShouldStop(4194304);
deneklistele.mostCurrent._buttonengeldurumu.runVoidMethod ("setSingleLine",deneklistele.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 88;BA.debugLine="ButtonEngelDurumu.Text= \"ENGEL DURUMU\"";
Debug.ShouldStop(8388608);
deneklistele.mostCurrent._buttonengeldurumu.runMethod(true,"setText",BA.ObjectToCharSequence("ENGEL DURUMU"));
 BA.debugLineNum = 89;BA.debugLine="ButtonEngelDurumu.TextSize= 14";
Debug.ShouldStop(16777216);
deneklistele.mostCurrent._buttonengeldurumu.runMethod(true,"setTextSize",BA.numberCast(float.class, 14));
 BA.debugLineNum = 91;BA.debugLine="ButtonTakimOkul.TextColor = Color.koyuMavi";
Debug.ShouldStop(67108864);
deneklistele.mostCurrent._buttontakimokul.runMethod(true,"setTextColor",deneklistele.mostCurrent._color._koyumavi /*RemoteObject*/ );
 BA.debugLineNum = 92;BA.debugLine="ButtonTakimOkul.Typeface = Typeface.DEFAULT_BOLD";
Debug.ShouldStop(134217728);
deneklistele.mostCurrent._buttontakimokul.runMethod(false,"setTypeface",deneklistele.mostCurrent.__c.getField(false,"Typeface").getField(false,"DEFAULT_BOLD"));
 BA.debugLineNum = 93;BA.debugLine="ButtonTakimOkul.SingleLine = True";
Debug.ShouldStop(268435456);
deneklistele.mostCurrent._buttontakimokul.runVoidMethod ("setSingleLine",deneklistele.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 94;BA.debugLine="ButtonTakimOkul.Text = \"TAKIM/OKUL\"";
Debug.ShouldStop(536870912);
deneklistele.mostCurrent._buttontakimokul.runMethod(true,"setText",BA.ObjectToCharSequence("TAKIM/OKUL"));
 BA.debugLineNum = 95;BA.debugLine="ButtonTakimOkul.TextSize = 14";
Debug.ShouldStop(1073741824);
deneklistele.mostCurrent._buttontakimokul.runMethod(true,"setTextSize",BA.numberCast(float.class, 14));
 BA.debugLineNum = 97;BA.debugLine="ButtonBransSinif.TextColor = Color.koyuMavi";
Debug.ShouldStop(1);
deneklistele.mostCurrent._buttonbranssinif.runMethod(true,"setTextColor",deneklistele.mostCurrent._color._koyumavi /*RemoteObject*/ );
 BA.debugLineNum = 98;BA.debugLine="ButtonBransSinif.Typeface = Typeface.DEFAULT_BOLD";
Debug.ShouldStop(2);
deneklistele.mostCurrent._buttonbranssinif.runMethod(false,"setTypeface",deneklistele.mostCurrent.__c.getField(false,"Typeface").getField(false,"DEFAULT_BOLD"));
 BA.debugLineNum = 99;BA.debugLine="ButtonBransSinif.SingleLine = True";
Debug.ShouldStop(4);
deneklistele.mostCurrent._buttonbranssinif.runVoidMethod ("setSingleLine",deneklistele.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 100;BA.debugLine="ButtonBransSinif.Text = \"BRANŞ/SINIF\"";
Debug.ShouldStop(8);
deneklistele.mostCurrent._buttonbranssinif.runMethod(true,"setText",BA.ObjectToCharSequence("BRANŞ/SINIF"));
 BA.debugLineNum = 101;BA.debugLine="ButtonBransSinif.TextSize = 14";
Debug.ShouldStop(16);
deneklistele.mostCurrent._buttonbranssinif.runMethod(true,"setTextSize",BA.numberCast(float.class, 14));
 BA.debugLineNum = 103;BA.debugLine="ButtonMevki.TextColor = Color.koyuMavi";
Debug.ShouldStop(64);
deneklistele.mostCurrent._buttonmevki.runMethod(true,"setTextColor",deneklistele.mostCurrent._color._koyumavi /*RemoteObject*/ );
 BA.debugLineNum = 104;BA.debugLine="ButtonMevki.Typeface = Typeface.DEFAULT_BOLD";
Debug.ShouldStop(128);
deneklistele.mostCurrent._buttonmevki.runMethod(false,"setTypeface",deneklistele.mostCurrent.__c.getField(false,"Typeface").getField(false,"DEFAULT_BOLD"));
 BA.debugLineNum = 105;BA.debugLine="ButtonMevki.SingleLine = True";
Debug.ShouldStop(256);
deneklistele.mostCurrent._buttonmevki.runVoidMethod ("setSingleLine",deneklistele.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 106;BA.debugLine="ButtonMevki.Text = \"MEVKİ\"";
Debug.ShouldStop(512);
deneklistele.mostCurrent._buttonmevki.runMethod(true,"setText",BA.ObjectToCharSequence("MEVKİ"));
 BA.debugLineNum = 107;BA.debugLine="ButtonMevki.TextSize = 14";
Debug.ShouldStop(1024);
deneklistele.mostCurrent._buttonmevki.runMethod(true,"setTextSize",BA.numberCast(float.class, 14));
 BA.debugLineNum = 109;BA.debugLine="ButtonDuzenleSil.TextColor = Color.koyuMavi";
Debug.ShouldStop(4096);
deneklistele.mostCurrent._buttonduzenlesil.runMethod(true,"setTextColor",deneklistele.mostCurrent._color._koyumavi /*RemoteObject*/ );
 BA.debugLineNum = 110;BA.debugLine="ButtonDenekEkle.TextColor = Color.koyuMavi";
Debug.ShouldStop(8192);
deneklistele.mostCurrent._buttondenekekle.runMethod(true,"setTextColor",deneklistele.mostCurrent._color._koyumavi /*RemoteObject*/ );
 BA.debugLineNum = 113;BA.debugLine="End Sub";
Debug.ShouldStop(65536);
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
		Debug.PushSubsStack("Activity_Pause (deneklistele) ","deneklistele",9,deneklistele.mostCurrent.activityBA,deneklistele.mostCurrent,119);
if (RapidSub.canDelegate("activity_pause")) { return b4a.example3.deneklistele.remoteMe.runUserSub(false, "deneklistele","activity_pause", _userclosed);}
Debug.locals.put("UserClosed", _userclosed);
 BA.debugLineNum = 119;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
Debug.ShouldStop(4194304);
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
public static RemoteObject  _activity_resume() throws Exception{
try {
		Debug.PushSubsStack("Activity_Resume (deneklistele) ","deneklistele",9,deneklistele.mostCurrent.activityBA,deneklistele.mostCurrent,115);
if (RapidSub.canDelegate("activity_resume")) { return b4a.example3.deneklistele.remoteMe.runUserSub(false, "deneklistele","activity_resume");}
 BA.debugLineNum = 115;BA.debugLine="Sub Activity_Resume";
Debug.ShouldStop(262144);
 BA.debugLineNum = 117;BA.debugLine="End Sub";
Debug.ShouldStop(1048576);
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
		Debug.PushSubsStack("ButtonAnasayfa_Click (deneklistele) ","deneklistele",9,deneklistele.mostCurrent.activityBA,deneklistele.mostCurrent,194);
if (RapidSub.canDelegate("buttonanasayfa_click")) { return b4a.example3.deneklistele.remoteMe.runUserSub(false, "deneklistele","buttonanasayfa_click");}
 BA.debugLineNum = 194;BA.debugLine="Sub ButtonAnasayfa_Click";
Debug.ShouldStop(2);
 BA.debugLineNum = 195;BA.debugLine="StartActivity(AnaMenu)";
Debug.ShouldStop(4);
deneklistele.mostCurrent.__c.runVoidMethod ("StartActivity",deneklistele.processBA,(Object)((deneklistele.mostCurrent._anamenu.getObject())));
 BA.debugLineNum = 196;BA.debugLine="Activity.Finish";
Debug.ShouldStop(8);
deneklistele.mostCurrent._activity.runVoidMethod ("Finish");
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
public static RemoteObject  _buttonbabaadi_click() throws Exception{
try {
		Debug.PushSubsStack("ButtonBabaAdi_Click (deneklistele) ","deneklistele",9,deneklistele.mostCurrent.activityBA,deneklistele.mostCurrent,158);
if (RapidSub.canDelegate("buttonbabaadi_click")) { return b4a.example3.deneklistele.remoteMe.runUserSub(false, "deneklistele","buttonbabaadi_click");}
 BA.debugLineNum = 158;BA.debugLine="Sub ButtonBabaAdi_Click";
Debug.ShouldStop(536870912);
 BA.debugLineNum = 159;BA.debugLine="WebView1.LoadHtml(DBUtils.ExecuteHtml(Main.sql, \"";
Debug.ShouldStop(1073741824);
deneklistele.mostCurrent._webview1.runVoidMethod ("LoadHtml",(Object)(deneklistele.mostCurrent._dbutils.runMethod(true,"_executehtml" /*RemoteObject*/ ,deneklistele.mostCurrent.activityBA,(Object)(deneklistele.mostCurrent._main._sql /*RemoteObject*/ ),(Object)(RemoteObject.concat(RemoteObject.createImmutable("SELECT denek_tc As [DENEK TC] ,denek_babaAdi As [DENEK BABA ADI] FROM Denek WHERE denek_babaAdi LIKE '%"),deneklistele.mostCurrent._edittextara.runMethod(true,"getText"),RemoteObject.createImmutable("%' ORDER BY denek_id DESC"))),(Object)((deneklistele.mostCurrent.__c.getField(false,"Null"))),(Object)(BA.numberCast(int.class, -(double) (0 + 1))),(Object)(deneklistele.mostCurrent.__c.getField(true,"False")))));
 BA.debugLineNum = 160;BA.debugLine="End Sub";
Debug.ShouldStop(-2147483648);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _buttonbranssinif_click() throws Exception{
try {
		Debug.PushSubsStack("ButtonBransSinif_Click (deneklistele) ","deneklistele",9,deneklistele.mostCurrent.activityBA,deneklistele.mostCurrent,170);
if (RapidSub.canDelegate("buttonbranssinif_click")) { return b4a.example3.deneklistele.remoteMe.runUserSub(false, "deneklistele","buttonbranssinif_click");}
 BA.debugLineNum = 170;BA.debugLine="Sub ButtonBransSinif_Click";
Debug.ShouldStop(512);
 BA.debugLineNum = 171;BA.debugLine="WebView1.LoadHtml(DBUtils.ExecuteHtml(Main.sql, \"";
Debug.ShouldStop(1024);
deneklistele.mostCurrent._webview1.runVoidMethod ("LoadHtml",(Object)(deneklistele.mostCurrent._dbutils.runMethod(true,"_executehtml" /*RemoteObject*/ ,deneklistele.mostCurrent.activityBA,(Object)(deneklistele.mostCurrent._main._sql /*RemoteObject*/ ),(Object)(RemoteObject.concat(RemoteObject.createImmutable("SELECT denek_tc As [DENEK TC] ,denek_bransSinif  As [BRANŞ/SINIF] FROM Denek WHERE denek_bransSinif LIKE '%"),deneklistele.mostCurrent._edittextara.runMethod(true,"getText"),RemoteObject.createImmutable("%' ORDER BY denek_id DESC"))),(Object)((deneklistele.mostCurrent.__c.getField(false,"Null"))),(Object)(BA.numberCast(int.class, -(double) (0 + 1))),(Object)(deneklistele.mostCurrent.__c.getField(true,"False")))));
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
public static RemoteObject  _buttoncinsiyet_click() throws Exception{
try {
		Debug.PushSubsStack("ButtonCinsiyet_Click (deneklistele) ","deneklistele",9,deneklistele.mostCurrent.activityBA,deneklistele.mostCurrent,145);
if (RapidSub.canDelegate("buttoncinsiyet_click")) { return b4a.example3.deneklistele.remoteMe.runUserSub(false, "deneklistele","buttoncinsiyet_click");}
 BA.debugLineNum = 145;BA.debugLine="Sub ButtonCinsiyet_Click";
Debug.ShouldStop(65536);
 BA.debugLineNum = 146;BA.debugLine="WebView1.LoadHtml(DBUtils.ExecuteHtml(Main.sql, \"";
Debug.ShouldStop(131072);
deneklistele.mostCurrent._webview1.runVoidMethod ("LoadHtml",(Object)(deneklistele.mostCurrent._dbutils.runMethod(true,"_executehtml" /*RemoteObject*/ ,deneklistele.mostCurrent.activityBA,(Object)(deneklistele.mostCurrent._main._sql /*RemoteObject*/ ),(Object)(RemoteObject.concat(RemoteObject.createImmutable("SELECT denek_tc As [DENEK TC] , cinsiyet_adi As [CİNSİYET] FROM Denek WHERE cinsiyet_adi LIKE '%"),deneklistele.mostCurrent._edittextara.runMethod(true,"getText"),RemoteObject.createImmutable("%' ORDER BY denek_id DESC"))),(Object)((deneklistele.mostCurrent.__c.getField(false,"Null"))),(Object)(BA.numberCast(int.class, -(double) (0 + 1))),(Object)(deneklistele.mostCurrent.__c.getField(true,"False")))));
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
public static RemoteObject  _buttondenekekle_click() throws Exception{
try {
		Debug.PushSubsStack("ButtonDenekEkle_Click (deneklistele) ","deneklistele",9,deneklistele.mostCurrent.activityBA,deneklistele.mostCurrent,184);
if (RapidSub.canDelegate("buttondenekekle_click")) { return b4a.example3.deneklistele.remoteMe.runUserSub(false, "deneklistele","buttondenekekle_click");}
 BA.debugLineNum = 184;BA.debugLine="Sub ButtonDenekEkle_Click";
Debug.ShouldStop(8388608);
 BA.debugLineNum = 185;BA.debugLine="Main.Status = \"S\"";
Debug.ShouldStop(16777216);
deneklistele.mostCurrent._main._status /*RemoteObject*/  = BA.ObjectToString("S");
 BA.debugLineNum = 186;BA.debugLine="StartActivity(DenekEkleGuncelle)";
Debug.ShouldStop(33554432);
deneklistele.mostCurrent.__c.runVoidMethod ("StartActivity",deneklistele.processBA,(Object)((deneklistele.mostCurrent._denekekleguncelle.getObject())));
 BA.debugLineNum = 187;BA.debugLine="Activity.Finish";
Debug.ShouldStop(67108864);
deneklistele.mostCurrent._activity.runVoidMethod ("Finish");
 BA.debugLineNum = 188;BA.debugLine="End Sub";
Debug.ShouldStop(134217728);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _buttondogumtarihi_click() throws Exception{
try {
		Debug.PushSubsStack("ButtonDogumTarihi_Click (deneklistele) ","deneklistele",9,deneklistele.mostCurrent.activityBA,deneklistele.mostCurrent,149);
if (RapidSub.canDelegate("buttondogumtarihi_click")) { return b4a.example3.deneklistele.remoteMe.runUserSub(false, "deneklistele","buttondogumtarihi_click");}
 BA.debugLineNum = 149;BA.debugLine="Sub ButtonDogumTarihi_Click";
Debug.ShouldStop(1048576);
 BA.debugLineNum = 150;BA.debugLine="WebView1.LoadHtml(DBUtils.ExecuteHtml(Main.sql, \"";
Debug.ShouldStop(2097152);
deneklistele.mostCurrent._webview1.runVoidMethod ("LoadHtml",(Object)(deneklistele.mostCurrent._dbutils.runMethod(true,"_executehtml" /*RemoteObject*/ ,deneklistele.mostCurrent.activityBA,(Object)(deneklistele.mostCurrent._main._sql /*RemoteObject*/ ),(Object)(RemoteObject.concat(RemoteObject.createImmutable("SELECT denek_tc As [DENEK TC] , denek_dogumTarihi As [DENEK DOĞUM TARİHİ] FROM Denek WHERE denek_dogumTarihi LIKE '%"),deneklistele.mostCurrent._edittextara.runMethod(true,"getText"),RemoteObject.createImmutable("%' ORDER BY denek_id DESC"))),(Object)((deneklistele.mostCurrent.__c.getField(false,"Null"))),(Object)(BA.numberCast(int.class, -(double) (0 + 1))),(Object)(deneklistele.mostCurrent.__c.getField(true,"False")))));
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
public static RemoteObject  _buttondogumyeri_click() throws Exception{
try {
		Debug.PushSubsStack("ButtonDogumYeri_Click (deneklistele) ","deneklistele",9,deneklistele.mostCurrent.activityBA,deneklistele.mostCurrent,153);
if (RapidSub.canDelegate("buttondogumyeri_click")) { return b4a.example3.deneklistele.remoteMe.runUserSub(false, "deneklistele","buttondogumyeri_click");}
 BA.debugLineNum = 153;BA.debugLine="Sub ButtonDogumYeri_Click";
Debug.ShouldStop(16777216);
 BA.debugLineNum = 154;BA.debugLine="WebView1.LoadHtml(DBUtils.ExecuteHtml(Main.sql, \"";
Debug.ShouldStop(33554432);
deneklistele.mostCurrent._webview1.runVoidMethod ("LoadHtml",(Object)(deneklistele.mostCurrent._dbutils.runMethod(true,"_executehtml" /*RemoteObject*/ ,deneklistele.mostCurrent.activityBA,(Object)(deneklistele.mostCurrent._main._sql /*RemoteObject*/ ),(Object)(RemoteObject.concat(RemoteObject.createImmutable("SELECT denek_tc As [DENEK TC] , il_adi As [DOĞUM YERİ] FROM Denek WHERE il_adi LIKE '%"),deneklistele.mostCurrent._edittextara.runMethod(true,"getText"),RemoteObject.createImmutable("%' ORDER BY denek_id DESC"))),(Object)((deneklistele.mostCurrent.__c.getField(false,"Null"))),(Object)(BA.numberCast(int.class, -(double) (0 + 1))),(Object)(deneklistele.mostCurrent.__c.getField(true,"False")))));
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
public static RemoteObject  _buttonduzenlesil_click() throws Exception{
try {
		Debug.PushSubsStack("ButtonDuzenleSil_Click (deneklistele) ","deneklistele",9,deneklistele.mostCurrent.activityBA,deneklistele.mostCurrent,179);
if (RapidSub.canDelegate("buttonduzenlesil_click")) { return b4a.example3.deneklistele.remoteMe.runUserSub(false, "deneklistele","buttonduzenlesil_click");}
 BA.debugLineNum = 179;BA.debugLine="Sub ButtonDuzenleSil_Click";
Debug.ShouldStop(262144);
 BA.debugLineNum = 180;BA.debugLine="StartActivity(DenekDuzenleSil)";
Debug.ShouldStop(524288);
deneklistele.mostCurrent.__c.runVoidMethod ("StartActivity",deneklistele.processBA,(Object)((deneklistele.mostCurrent._denekduzenlesil.getObject())));
 BA.debugLineNum = 181;BA.debugLine="Activity.Finish";
Debug.ShouldStop(1048576);
deneklistele.mostCurrent._activity.runVoidMethod ("Finish");
 BA.debugLineNum = 182;BA.debugLine="End Sub";
Debug.ShouldStop(2097152);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _buttonengeldurumu_click() throws Exception{
try {
		Debug.PushSubsStack("ButtonEngelDurumu_Click (deneklistele) ","deneklistele",9,deneklistele.mostCurrent.activityBA,deneklistele.mostCurrent,162);
if (RapidSub.canDelegate("buttonengeldurumu_click")) { return b4a.example3.deneklistele.remoteMe.runUserSub(false, "deneklistele","buttonengeldurumu_click");}
 BA.debugLineNum = 162;BA.debugLine="Sub ButtonEngelDurumu_Click";
Debug.ShouldStop(2);
 BA.debugLineNum = 163;BA.debugLine="WebView1.LoadHtml(DBUtils.ExecuteHtml(Main.sql, \"";
Debug.ShouldStop(4);
deneklistele.mostCurrent._webview1.runVoidMethod ("LoadHtml",(Object)(deneklistele.mostCurrent._dbutils.runMethod(true,"_executehtml" /*RemoteObject*/ ,deneklistele.mostCurrent.activityBA,(Object)(deneklistele.mostCurrent._main._sql /*RemoteObject*/ ),(Object)(RemoteObject.concat(RemoteObject.createImmutable("SELECT denek_tc As [DENEK TC] ,denek_engelDurumu As [DENEK ENGEL DURUMU] FROM Denek WHERE denek_engelDurumu LIKE '%"),deneklistele.mostCurrent._edittextara.runMethod(true,"getText"),RemoteObject.createImmutable("%' ORDER BY denek_id DESC"))),(Object)((deneklistele.mostCurrent.__c.getField(false,"Null"))),(Object)(BA.numberCast(int.class, -(double) (0 + 1))),(Object)(deneklistele.mostCurrent.__c.getField(true,"False")))));
 BA.debugLineNum = 164;BA.debugLine="End Sub";
Debug.ShouldStop(8);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _buttonisim_click() throws Exception{
try {
		Debug.PushSubsStack("ButtonIsim_Click (deneklistele) ","deneklistele",9,deneklistele.mostCurrent.activityBA,deneklistele.mostCurrent,141);
if (RapidSub.canDelegate("buttonisim_click")) { return b4a.example3.deneklistele.remoteMe.runUserSub(false, "deneklistele","buttonisim_click");}
 BA.debugLineNum = 141;BA.debugLine="Sub ButtonIsim_Click";
Debug.ShouldStop(4096);
 BA.debugLineNum = 142;BA.debugLine="WebView1.LoadHtml(DBUtils.ExecuteHtml(Main.sql, \"";
Debug.ShouldStop(8192);
deneklistele.mostCurrent._webview1.runVoidMethod ("LoadHtml",(Object)(deneklistele.mostCurrent._dbutils.runMethod(true,"_executehtml" /*RemoteObject*/ ,deneklistele.mostCurrent.activityBA,(Object)(deneklistele.mostCurrent._main._sql /*RemoteObject*/ ),(Object)(RemoteObject.concat(RemoteObject.createImmutable("SELECT denek_tc As [DENEK TC] , denek_isim As [DENEK İSİM] FROM Denek WHERE denek_isim LIKE '%"),deneklistele.mostCurrent._edittextara.runMethod(true,"getText"),RemoteObject.createImmutable("%' ORDER BY denek_id DESC"))),(Object)((deneklistele.mostCurrent.__c.getField(false,"Null"))),(Object)(BA.numberCast(int.class, -(double) (0 + 1))),(Object)(deneklistele.mostCurrent.__c.getField(true,"False")))));
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
public static RemoteObject  _buttonmevki_click() throws Exception{
try {
		Debug.PushSubsStack("ButtonMevki_Click (deneklistele) ","deneklistele",9,deneklistele.mostCurrent.activityBA,deneklistele.mostCurrent,174);
if (RapidSub.canDelegate("buttonmevki_click")) { return b4a.example3.deneklistele.remoteMe.runUserSub(false, "deneklistele","buttonmevki_click");}
 BA.debugLineNum = 174;BA.debugLine="Sub ButtonMevki_Click";
Debug.ShouldStop(8192);
 BA.debugLineNum = 175;BA.debugLine="WebView1.LoadHtml(DBUtils.ExecuteHtml(Main.sql, \"";
Debug.ShouldStop(16384);
deneklistele.mostCurrent._webview1.runVoidMethod ("LoadHtml",(Object)(deneklistele.mostCurrent._dbutils.runMethod(true,"_executehtml" /*RemoteObject*/ ,deneklistele.mostCurrent.activityBA,(Object)(deneklistele.mostCurrent._main._sql /*RemoteObject*/ ),(Object)(RemoteObject.concat(RemoteObject.createImmutable("SELECT denek_tc As [DENEK TC] ,denek_mevki As [MEVKİ] FROM Denek WHERE denek_mevki LIKE '%"),deneklistele.mostCurrent._edittextara.runMethod(true,"getText"),RemoteObject.createImmutable("%' ORDER BY denek_id DESC"))),(Object)((deneklistele.mostCurrent.__c.getField(false,"Null"))),(Object)(BA.numberCast(int.class, -(double) (0 + 1))),(Object)(deneklistele.mostCurrent.__c.getField(true,"False")))));
 BA.debugLineNum = 176;BA.debugLine="End Sub";
Debug.ShouldStop(32768);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _buttontakimokul_click() throws Exception{
try {
		Debug.PushSubsStack("ButtonTakimOkul_Click (deneklistele) ","deneklistele",9,deneklistele.mostCurrent.activityBA,deneklistele.mostCurrent,166);
if (RapidSub.canDelegate("buttontakimokul_click")) { return b4a.example3.deneklistele.remoteMe.runUserSub(false, "deneklistele","buttontakimokul_click");}
 BA.debugLineNum = 166;BA.debugLine="Sub ButtonTakimOkul_Click";
Debug.ShouldStop(32);
 BA.debugLineNum = 167;BA.debugLine="WebView1.LoadHtml(DBUtils.ExecuteHtml(Main.sql, \"";
Debug.ShouldStop(64);
deneklistele.mostCurrent._webview1.runVoidMethod ("LoadHtml",(Object)(deneklistele.mostCurrent._dbutils.runMethod(true,"_executehtml" /*RemoteObject*/ ,deneklistele.mostCurrent.activityBA,(Object)(deneklistele.mostCurrent._main._sql /*RemoteObject*/ ),(Object)(RemoteObject.concat(RemoteObject.createImmutable("SELECT denek_tc As [DENEK TC] ,denek_takimOkul As [TAKIM/OKUL] FROM Denek WHERE denek_takimOkul LIKE '%"),deneklistele.mostCurrent._edittextara.runMethod(true,"getText"),RemoteObject.createImmutable("%' ORDER BY denek_id DESC "))),(Object)((deneklistele.mostCurrent.__c.getField(false,"Null"))),(Object)(BA.numberCast(int.class, -(double) (0 + 1))),(Object)(deneklistele.mostCurrent.__c.getField(true,"False")))));
 BA.debugLineNum = 168;BA.debugLine="End Sub";
Debug.ShouldStop(128);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _buttontc_click() throws Exception{
try {
		Debug.PushSubsStack("ButtonTc_Click (deneklistele) ","deneklistele",9,deneklistele.mostCurrent.activityBA,deneklistele.mostCurrent,137);
if (RapidSub.canDelegate("buttontc_click")) { return b4a.example3.deneklistele.remoteMe.runUserSub(false, "deneklistele","buttontc_click");}
 BA.debugLineNum = 137;BA.debugLine="Sub ButtonTc_Click";
Debug.ShouldStop(256);
 BA.debugLineNum = 138;BA.debugLine="WebView1.LoadHtml(DBUtils.ExecuteHtml(Main.sql, \"";
Debug.ShouldStop(512);
deneklistele.mostCurrent._webview1.runVoidMethod ("LoadHtml",(Object)(deneklistele.mostCurrent._dbutils.runMethod(true,"_executehtml" /*RemoteObject*/ ,deneklistele.mostCurrent.activityBA,(Object)(deneklistele.mostCurrent._main._sql /*RemoteObject*/ ),(Object)(RemoteObject.concat(RemoteObject.createImmutable("SELECT denek_tc As [DENEK TC] FROM Denek WHERE denek_tc LIKE '%"),deneklistele.mostCurrent._edittextara.runMethod(true,"getText"),RemoteObject.createImmutable("%' ORDER BY denek_id DESC"))),(Object)((deneklistele.mostCurrent.__c.getField(false,"Null"))),(Object)(BA.numberCast(int.class, -(double) (0 + 1))),(Object)(deneklistele.mostCurrent.__c.getField(true,"False")))));
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
public static RemoteObject  _edittextara_textchanged(RemoteObject _old,RemoteObject _new) throws Exception{
try {
		Debug.PushSubsStack("EditTextAra_TextChanged (deneklistele) ","deneklistele",9,deneklistele.mostCurrent.activityBA,deneklistele.mostCurrent,128);
if (RapidSub.canDelegate("edittextara_textchanged")) { return b4a.example3.deneklistele.remoteMe.runUserSub(false, "deneklistele","edittextara_textchanged", _old, _new);}
Debug.locals.put("Old", _old);
Debug.locals.put("New", _new);
 BA.debugLineNum = 128;BA.debugLine="Sub EditTextAra_TextChanged (Old As String, New As";
Debug.ShouldStop(-2147483648);
 BA.debugLineNum = 129;BA.debugLine="LabelCarpi.Visible = True";
Debug.ShouldStop(1);
deneklistele.mostCurrent._labelcarpi.runMethod(true,"setVisible",deneklistele.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 130;BA.debugLine="WebView1.LoadHtml(DBUtils.ExecuteHtml(Main.sql, \"";
Debug.ShouldStop(2);
deneklistele.mostCurrent._webview1.runVoidMethod ("LoadHtml",(Object)(deneklistele.mostCurrent._dbutils.runMethod(true,"_executehtml" /*RemoteObject*/ ,deneklistele.mostCurrent.activityBA,(Object)(deneklistele.mostCurrent._main._sql /*RemoteObject*/ ),(Object)(RemoteObject.concat(RemoteObject.createImmutable("SELECT denek_tc As [DENEK TC],denek_isim  As [DENEK İSİM],cinsiyet_adi As [CİNSİYET],denek_dogumTarihi As[DENEK DOĞUM TARİHİ],il_adi  As [DOĞUM YERİ],denek_babaAdi As [DENEK BABA ADI],denek_engelDurumu As [DENEK ENGEL DURUMU],denek_takimOkul As [TAKIM/OKUL],denek_bransSinif As [BRANŞ/SINIF],denek_mevki  As [MEVKİ] FROM Denek WHERE denek_tc LIKE '%"),deneklistele.mostCurrent._edittextara.runMethod(true,"getText"),RemoteObject.createImmutable("%' OR denek_isim LIKE '%"),deneklistele.mostCurrent._edittextara.runMethod(true,"getText"),RemoteObject.createImmutable("%' OR cinsiyet_adi LIKE '%"),deneklistele.mostCurrent._edittextara.runMethod(true,"getText"),RemoteObject.createImmutable("%' OR denek_dogumTarihi LIKE '%"),deneklistele.mostCurrent._edittextara.runMethod(true,"getText"),RemoteObject.createImmutable("%' OR il_adi LIKE '%"),deneklistele.mostCurrent._edittextara.runMethod(true,"getText"),RemoteObject.createImmutable("%' OR denek_babaAdi LIKE '%"),deneklistele.mostCurrent._edittextara.runMethod(true,"getText"),RemoteObject.createImmutable("%' OR denek_engelDurumu LIKE '%"),deneklistele.mostCurrent._edittextara.runMethod(true,"getText"),RemoteObject.createImmutable("%' OR denek_takimOkul LIKE '%"),deneklistele.mostCurrent._edittextara.runMethod(true,"getText"),RemoteObject.createImmutable("%' OR denek_bransSinif LIKE '%"),deneklistele.mostCurrent._edittextara.runMethod(true,"getText"),RemoteObject.createImmutable("%' OR denek_mevki LIKE '%"),deneklistele.mostCurrent._edittextara.runMethod(true,"getText"),RemoteObject.createImmutable("%' ORDER BY denek_id DESC"))),(Object)((deneklistele.mostCurrent.__c.getField(false,"Null"))),(Object)(BA.numberCast(int.class, -(double) (0 + 1))),(Object)(deneklistele.mostCurrent.__c.getField(true,"False")))));
 BA.debugLineNum = 131;BA.debugLine="If EditTextAra.Text = \"\" Then";
Debug.ShouldStop(4);
if (RemoteObject.solveBoolean("=",deneklistele.mostCurrent._edittextara.runMethod(true,"getText"),BA.ObjectToString(""))) { 
 BA.debugLineNum = 132;BA.debugLine="LabelCarpi.Visible = False";
Debug.ShouldStop(8);
deneklistele.mostCurrent._labelcarpi.runMethod(true,"setVisible",deneklistele.mostCurrent.__c.getField(true,"False"));
 };
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
public static RemoteObject  _globals() throws Exception{
 //BA.debugLineNum = 12;BA.debugLine="Sub Globals";
 //BA.debugLineNum = 16;BA.debugLine="Private WebView1 As WebView";
deneklistele.mostCurrent._webview1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.WebViewWrapper");
 //BA.debugLineNum = 17;BA.debugLine="Private EditTextAra As EditText";
deneklistele.mostCurrent._edittextara = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
 //BA.debugLineNum = 18;BA.debugLine="Private ButtonDuzenleSil As Button";
deneklistele.mostCurrent._buttonduzenlesil = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 19;BA.debugLine="Private ButtonDenekEkle As Button";
deneklistele.mostCurrent._buttondenekekle = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 20;BA.debugLine="Private ButtonMevki As Button";
deneklistele.mostCurrent._buttonmevki = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 21;BA.debugLine="Private ButtonBransSinif As Button";
deneklistele.mostCurrent._buttonbranssinif = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 22;BA.debugLine="Private ButtonTakimOkul As Button";
deneklistele.mostCurrent._buttontakimokul = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 23;BA.debugLine="Private ButtonEngelDurumu As Button";
deneklistele.mostCurrent._buttonengeldurumu = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 24;BA.debugLine="Private ButtonBabaAdi As Button";
deneklistele.mostCurrent._buttonbabaadi = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 25;BA.debugLine="Private ButtonDogumYeri As Button";
deneklistele.mostCurrent._buttondogumyeri = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 26;BA.debugLine="Private ButtonDogumTarihi As Button";
deneklistele.mostCurrent._buttondogumtarihi = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 27;BA.debugLine="Private ButtonCinsiyet As Button";
deneklistele.mostCurrent._buttoncinsiyet = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 28;BA.debugLine="Private ButtonIsim As Button";
deneklistele.mostCurrent._buttonisim = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 29;BA.debugLine="Private ButtonTc As Button";
deneklistele.mostCurrent._buttontc = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 30;BA.debugLine="Private Label1 As Label";
deneklistele.mostCurrent._label1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 31;BA.debugLine="Private ButtonAnasayfa As Button";
deneklistele.mostCurrent._buttonanasayfa = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 32;BA.debugLine="Private LabelCarpi As Label";
deneklistele.mostCurrent._labelcarpi = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 34;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _htmlgosterdb() throws Exception{
try {
		Debug.PushSubsStack("HTMLGosterDB (deneklistele) ","deneklistele",9,deneklistele.mostCurrent.activityBA,deneklistele.mostCurrent,123);
if (RapidSub.canDelegate("htmlgosterdb")) { return b4a.example3.deneklistele.remoteMe.runUserSub(false, "deneklistele","htmlgosterdb");}
 BA.debugLineNum = 123;BA.debugLine="Sub HTMLGosterDB";
Debug.ShouldStop(67108864);
 BA.debugLineNum = 125;BA.debugLine="WebView1.LoadHtml(DBUtils.ExecuteHtml(Main.sql,\"S";
Debug.ShouldStop(268435456);
deneklistele.mostCurrent._webview1.runVoidMethod ("LoadHtml",(Object)(deneklistele.mostCurrent._dbutils.runMethod(true,"_executehtml" /*RemoteObject*/ ,deneklistele.mostCurrent.activityBA,(Object)(deneklistele.mostCurrent._main._sql /*RemoteObject*/ ),(Object)(BA.ObjectToString("SELECT denek_tc As [DENEK TC], denek_isim As [DENEK İSİM],cinsiyet_adi As [CİNSİYET],denek_dogumTarihi As[DENEK DOĞUM TARİHİ],il_adi As [DOĞUM YERİ],denek_babaAdi As [DENEK BABA ADI],denek_engelDurumu As [DENEK ENGEL DURUMU],denek_takimOkul As [TAKIM/OKUL],denek_bransSinif As [BRANŞ/SINIF],denek_mevki As [MEVKİ] FROM Denek ORDER BY denek_id DESC")),(Object)((deneklistele.mostCurrent.__c.getField(false,"Null"))),(Object)(BA.numberCast(int.class, -(double) (0 + 1))),(Object)(deneklistele.mostCurrent.__c.getField(true,"False")))));
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
public static RemoteObject  _label1_click() throws Exception{
try {
		Debug.PushSubsStack("Label1_Click (deneklistele) ","deneklistele",9,deneklistele.mostCurrent.activityBA,deneklistele.mostCurrent,190);
if (RapidSub.canDelegate("label1_click")) { return b4a.example3.deneklistele.remoteMe.runUserSub(false, "deneklistele","label1_click");}
 BA.debugLineNum = 190;BA.debugLine="Sub Label1_Click";
Debug.ShouldStop(536870912);
 BA.debugLineNum = 191;BA.debugLine="HTMLGosterDB";
Debug.ShouldStop(1073741824);
_htmlgosterdb();
 BA.debugLineNum = 192;BA.debugLine="End Sub";
Debug.ShouldStop(-2147483648);
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
		Debug.PushSubsStack("LabelCarpi_Click (deneklistele) ","deneklistele",9,deneklistele.mostCurrent.activityBA,deneklistele.mostCurrent,199);
if (RapidSub.canDelegate("labelcarpi_click")) { return b4a.example3.deneklistele.remoteMe.runUserSub(false, "deneklistele","labelcarpi_click");}
 BA.debugLineNum = 199;BA.debugLine="Sub LabelCarpi_Click";
Debug.ShouldStop(64);
 BA.debugLineNum = 200;BA.debugLine="EditTextAra.SelectAll";
Debug.ShouldStop(128);
deneklistele.mostCurrent._edittextara.runVoidMethod ("SelectAll");
 BA.debugLineNum = 201;BA.debugLine="HTMLGosterDB";
Debug.ShouldStop(256);
_htmlgosterdb();
 BA.debugLineNum = 202;BA.debugLine="End Sub";
Debug.ShouldStop(512);
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