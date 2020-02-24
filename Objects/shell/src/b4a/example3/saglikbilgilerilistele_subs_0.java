package b4a.example3;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class saglikbilgilerilistele_subs_0 {


public static RemoteObject  _activity_create(RemoteObject _firsttime) throws Exception{
try {
		Debug.PushSubsStack("Activity_Create (saglikbilgilerilistele) ","saglikbilgilerilistele",27,saglikbilgilerilistele.mostCurrent.activityBA,saglikbilgilerilistele.mostCurrent,30);
if (RapidSub.canDelegate("activity_create")) { return b4a.example3.saglikbilgilerilistele.remoteMe.runUserSub(false, "saglikbilgilerilistele","activity_create", _firsttime);}
Debug.locals.put("FirstTime", _firsttime);
 BA.debugLineNum = 30;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
Debug.ShouldStop(536870912);
 BA.debugLineNum = 32;BA.debugLine="Activity.LoadLayout(\"SaglikBilgileriListelePage\")";
Debug.ShouldStop(-2147483648);
saglikbilgilerilistele.mostCurrent._activity.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("SaglikBilgileriListelePage")),saglikbilgilerilistele.mostCurrent.activityBA);
 BA.debugLineNum = 33;BA.debugLine="LabelCarpi.Visible = False";
Debug.ShouldStop(1);
saglikbilgilerilistele.mostCurrent._labelcarpi.runMethod(true,"setVisible",saglikbilgilerilistele.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 36;BA.debugLine="EditTextAra.TextColor = Colors.White";
Debug.ShouldStop(8);
saglikbilgilerilistele.mostCurrent._edittextara.runMethod(true,"setTextColor",saglikbilgilerilistele.mostCurrent.__c.getField(false,"Colors").getField(true,"White"));
 BA.debugLineNum = 37;BA.debugLine="EditTextAra.Hint = \"Bu alana yazarak aratabilirsi";
Debug.ShouldStop(16);
saglikbilgilerilistele.mostCurrent._edittextara.runMethod(true,"setHint",BA.ObjectToString("Bu alana yazarak aratabilirsiniz.."));
 BA.debugLineNum = 38;BA.debugLine="EditTextAra.HintColor = Color.hintColor";
Debug.ShouldStop(32);
saglikbilgilerilistele.mostCurrent._edittextara.runMethod(true,"setHintColor",saglikbilgilerilistele.mostCurrent._color._hintcolor /*RemoteObject*/ );
 BA.debugLineNum = 39;BA.debugLine="EditTextAra.TextSize = 20";
Debug.ShouldStop(64);
saglikbilgilerilistele.mostCurrent._edittextara.runMethod(true,"setTextSize",BA.numberCast(float.class, 20));
 BA.debugLineNum = 40;BA.debugLine="EditTextAra.Typeface = Typeface.DEFAULT_BOLD";
Debug.ShouldStop(128);
saglikbilgilerilistele.mostCurrent._edittextara.runMethod(false,"setTypeface",saglikbilgilerilistele.mostCurrent.__c.getField(false,"Typeface").getField(false,"DEFAULT_BOLD"));
 BA.debugLineNum = 42;BA.debugLine="ButtonTc.TextColor = Color.koyuMavi";
Debug.ShouldStop(512);
saglikbilgilerilistele.mostCurrent._buttontc.runMethod(true,"setTextColor",saglikbilgilerilistele.mostCurrent._color._koyumavi /*RemoteObject*/ );
 BA.debugLineNum = 43;BA.debugLine="ButtonTc.Typeface = Typeface.DEFAULT_BOLD";
Debug.ShouldStop(1024);
saglikbilgilerilistele.mostCurrent._buttontc.runMethod(false,"setTypeface",saglikbilgilerilistele.mostCurrent.__c.getField(false,"Typeface").getField(false,"DEFAULT_BOLD"));
 BA.debugLineNum = 44;BA.debugLine="ButtonTc.Text = \"TC\"";
Debug.ShouldStop(2048);
saglikbilgilerilistele.mostCurrent._buttontc.runMethod(true,"setText",BA.ObjectToCharSequence("TC"));
 BA.debugLineNum = 45;BA.debugLine="ButtonTc.TextSize = 14";
Debug.ShouldStop(4096);
saglikbilgilerilistele.mostCurrent._buttontc.runMethod(true,"setTextSize",BA.numberCast(float.class, 14));
 BA.debugLineNum = 46;BA.debugLine="ButtonTc.SingleLine = True";
Debug.ShouldStop(8192);
saglikbilgilerilistele.mostCurrent._buttontc.runVoidMethod ("setSingleLine",saglikbilgilerilistele.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 48;BA.debugLine="ButtonIsim.TextColor = Color.koyuMavi";
Debug.ShouldStop(32768);
saglikbilgilerilistele.mostCurrent._buttonisim.runMethod(true,"setTextColor",saglikbilgilerilistele.mostCurrent._color._koyumavi /*RemoteObject*/ );
 BA.debugLineNum = 49;BA.debugLine="ButtonIsim.Typeface = Typeface.DEFAULT_BOLD";
Debug.ShouldStop(65536);
saglikbilgilerilistele.mostCurrent._buttonisim.runMethod(false,"setTypeface",saglikbilgilerilistele.mostCurrent.__c.getField(false,"Typeface").getField(false,"DEFAULT_BOLD"));
 BA.debugLineNum = 50;BA.debugLine="ButtonIsim.Text = \"İSİM\"";
Debug.ShouldStop(131072);
saglikbilgilerilistele.mostCurrent._buttonisim.runMethod(true,"setText",BA.ObjectToCharSequence("İSİM"));
 BA.debugLineNum = 51;BA.debugLine="ButtonIsim.TextSize = 14";
Debug.ShouldStop(262144);
saglikbilgilerilistele.mostCurrent._buttonisim.runMethod(true,"setTextSize",BA.numberCast(float.class, 14));
 BA.debugLineNum = 52;BA.debugLine="ButtonIsim.SingleLine = True";
Debug.ShouldStop(524288);
saglikbilgilerilistele.mostCurrent._buttonisim.runVoidMethod ("setSingleLine",saglikbilgilerilistele.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 54;BA.debugLine="ButtonHastalikSaglik.TextColor = Color.koyuMavi";
Debug.ShouldStop(2097152);
saglikbilgilerilistele.mostCurrent._buttonhastaliksaglik.runMethod(true,"setTextColor",saglikbilgilerilistele.mostCurrent._color._koyumavi /*RemoteObject*/ );
 BA.debugLineNum = 55;BA.debugLine="ButtonHastalikSaglik.Typeface = Typeface.DEFAULT_";
Debug.ShouldStop(4194304);
saglikbilgilerilistele.mostCurrent._buttonhastaliksaglik.runMethod(false,"setTypeface",saglikbilgilerilistele.mostCurrent.__c.getField(false,"Typeface").getField(false,"DEFAULT_BOLD"));
 BA.debugLineNum = 56;BA.debugLine="ButtonHastalikSaglik.Text = \"HASTALIK/SAĞLIK\"";
Debug.ShouldStop(8388608);
saglikbilgilerilistele.mostCurrent._buttonhastaliksaglik.runMethod(true,"setText",BA.ObjectToCharSequence("HASTALIK/SAĞLIK"));
 BA.debugLineNum = 57;BA.debugLine="ButtonHastalikSaglik.TextSize = 14";
Debug.ShouldStop(16777216);
saglikbilgilerilistele.mostCurrent._buttonhastaliksaglik.runMethod(true,"setTextSize",BA.numberCast(float.class, 14));
 BA.debugLineNum = 58;BA.debugLine="ButtonHastalikSaglik.SingleLine = True";
Debug.ShouldStop(33554432);
saglikbilgilerilistele.mostCurrent._buttonhastaliksaglik.runVoidMethod ("setSingleLine",saglikbilgilerilistele.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 60;BA.debugLine="ButtonSaglikBilgileriAciklama.TextColor = Color.k";
Debug.ShouldStop(134217728);
saglikbilgilerilistele.mostCurrent._buttonsaglikbilgileriaciklama.runMethod(true,"setTextColor",saglikbilgilerilistele.mostCurrent._color._koyumavi /*RemoteObject*/ );
 BA.debugLineNum = 61;BA.debugLine="ButtonSaglikBilgileriAciklama.Typeface = Typeface";
Debug.ShouldStop(268435456);
saglikbilgilerilistele.mostCurrent._buttonsaglikbilgileriaciklama.runMethod(false,"setTypeface",saglikbilgilerilistele.mostCurrent.__c.getField(false,"Typeface").getField(false,"DEFAULT_BOLD"));
 BA.debugLineNum = 62;BA.debugLine="ButtonSaglikBilgileriAciklama.Text = \"SAĞLIK BİLG";
Debug.ShouldStop(536870912);
saglikbilgilerilistele.mostCurrent._buttonsaglikbilgileriaciklama.runMethod(true,"setText",BA.ObjectToCharSequence("SAĞLIK BİLGİLERİ AÇIKLAMA"));
 BA.debugLineNum = 63;BA.debugLine="ButtonSaglikBilgileriAciklama.TextSize = 14";
Debug.ShouldStop(1073741824);
saglikbilgilerilistele.mostCurrent._buttonsaglikbilgileriaciklama.runMethod(true,"setTextSize",BA.numberCast(float.class, 14));
 BA.debugLineNum = 64;BA.debugLine="ButtonSaglikBilgileriAciklama.SingleLine = True";
Debug.ShouldStop(-2147483648);
saglikbilgilerilistele.mostCurrent._buttonsaglikbilgileriaciklama.runVoidMethod ("setSingleLine",saglikbilgilerilistele.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 66;BA.debugLine="ButtonTarih.TextColor = Color.koyuMavi";
Debug.ShouldStop(2);
saglikbilgilerilistele.mostCurrent._buttontarih.runMethod(true,"setTextColor",saglikbilgilerilistele.mostCurrent._color._koyumavi /*RemoteObject*/ );
 BA.debugLineNum = 67;BA.debugLine="ButtonTarih.Typeface = Typeface.DEFAULT_BOLD";
Debug.ShouldStop(4);
saglikbilgilerilistele.mostCurrent._buttontarih.runMethod(false,"setTypeface",saglikbilgilerilistele.mostCurrent.__c.getField(false,"Typeface").getField(false,"DEFAULT_BOLD"));
 BA.debugLineNum = 68;BA.debugLine="ButtonTarih.Text = \"TARİH\"";
Debug.ShouldStop(8);
saglikbilgilerilistele.mostCurrent._buttontarih.runMethod(true,"setText",BA.ObjectToCharSequence("TARİH"));
 BA.debugLineNum = 69;BA.debugLine="ButtonTarih.TextSize = 14";
Debug.ShouldStop(16);
saglikbilgilerilistele.mostCurrent._buttontarih.runMethod(true,"setTextSize",BA.numberCast(float.class, 14));
 BA.debugLineNum = 70;BA.debugLine="ButtonTarih.SingleLine = True";
Debug.ShouldStop(32);
saglikbilgilerilistele.mostCurrent._buttontarih.runVoidMethod ("setSingleLine",saglikbilgilerilistele.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 72;BA.debugLine="WebView1.JavaScriptEnabled = True";
Debug.ShouldStop(128);
saglikbilgilerilistele.mostCurrent._webview1.runMethod(true,"setJavaScriptEnabled",saglikbilgilerilistele.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 73;BA.debugLine="WebView1.ZoomEnabled = True";
Debug.ShouldStop(256);
saglikbilgilerilistele.mostCurrent._webview1.runMethod(true,"setZoomEnabled",saglikbilgilerilistele.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 77;BA.debugLine="HTMLGosterDB";
Debug.ShouldStop(4096);
_htmlgosterdb();
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
public static RemoteObject  _activity_pause(RemoteObject _userclosed) throws Exception{
try {
		Debug.PushSubsStack("Activity_Pause (saglikbilgilerilistele) ","saglikbilgilerilistele",27,saglikbilgilerilistele.mostCurrent.activityBA,saglikbilgilerilistele.mostCurrent,85);
if (RapidSub.canDelegate("activity_pause")) { return b4a.example3.saglikbilgilerilistele.remoteMe.runUserSub(false, "saglikbilgilerilistele","activity_pause", _userclosed);}
Debug.locals.put("UserClosed", _userclosed);
 BA.debugLineNum = 85;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
Debug.ShouldStop(1048576);
 BA.debugLineNum = 87;BA.debugLine="End Sub";
Debug.ShouldStop(4194304);
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
		Debug.PushSubsStack("Activity_Resume (saglikbilgilerilistele) ","saglikbilgilerilistele",27,saglikbilgilerilistele.mostCurrent.activityBA,saglikbilgilerilistele.mostCurrent,81);
if (RapidSub.canDelegate("activity_resume")) { return b4a.example3.saglikbilgilerilistele.remoteMe.runUserSub(false, "saglikbilgilerilistele","activity_resume");}
 BA.debugLineNum = 81;BA.debugLine="Sub Activity_Resume";
Debug.ShouldStop(65536);
 BA.debugLineNum = 83;BA.debugLine="End Sub";
Debug.ShouldStop(262144);
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
		Debug.PushSubsStack("ButtonAnasayfa_Click (saglikbilgilerilistele) ","saglikbilgilerilistele",27,saglikbilgilerilistele.mostCurrent.activityBA,saglikbilgilerilistele.mostCurrent,142);
if (RapidSub.canDelegate("buttonanasayfa_click")) { return b4a.example3.saglikbilgilerilistele.remoteMe.runUserSub(false, "saglikbilgilerilistele","buttonanasayfa_click");}
 BA.debugLineNum = 142;BA.debugLine="Sub ButtonAnasayfa_Click";
Debug.ShouldStop(8192);
 BA.debugLineNum = 143;BA.debugLine="StartActivity(AnaMenu)";
Debug.ShouldStop(16384);
saglikbilgilerilistele.mostCurrent.__c.runVoidMethod ("StartActivity",saglikbilgilerilistele.processBA,(Object)((saglikbilgilerilistele.mostCurrent._anamenu.getObject())));
 BA.debugLineNum = 144;BA.debugLine="Activity.Finish";
Debug.ShouldStop(32768);
saglikbilgilerilistele.mostCurrent._activity.runVoidMethod ("Finish");
 BA.debugLineNum = 145;BA.debugLine="End Sub";
Debug.ShouldStop(65536);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _buttonhastaliksaglik_click() throws Exception{
try {
		Debug.PushSubsStack("ButtonHastalikSaglik_Click (saglikbilgilerilistele) ","saglikbilgilerilistele",27,saglikbilgilerilistele.mostCurrent.activityBA,saglikbilgilerilistele.mostCurrent,111);
if (RapidSub.canDelegate("buttonhastaliksaglik_click")) { return b4a.example3.saglikbilgilerilistele.remoteMe.runUserSub(false, "saglikbilgilerilistele","buttonhastaliksaglik_click");}
 BA.debugLineNum = 111;BA.debugLine="Sub ButtonHastalikSaglik_Click";
Debug.ShouldStop(16384);
 BA.debugLineNum = 112;BA.debugLine="WebView1.LoadHtml(DBUtils.ExecuteHtml(Main.sql, \"";
Debug.ShouldStop(32768);
saglikbilgilerilistele.mostCurrent._webview1.runVoidMethod ("LoadHtml",(Object)(saglikbilgilerilistele.mostCurrent._dbutils.runMethod(true,"_executehtml" /*RemoteObject*/ ,saglikbilgilerilistele.mostCurrent.activityBA,(Object)(saglikbilgilerilistele.mostCurrent._main._sql /*RemoteObject*/ ),(Object)(RemoteObject.concat(RemoteObject.createImmutable("SELECT denek_tc As [Denek TC], denek_isim As [DENEK İSİM], saglikBilgileri_hastalikSakatlik As [HASTALIK/SAKATLIK] FROM SaglikBilgileri,Denek WHERE  SaglikBilgileri.denek_id = Denek.denek_id AND saglikBilgileri_hastalikSakatlik LIKE '%"),saglikbilgilerilistele.mostCurrent._edittextara.runMethod(true,"getText"),RemoteObject.createImmutable("%' ORDER BY saglikBilgileri_id DESC"))),(Object)((saglikbilgilerilistele.mostCurrent.__c.getField(false,"Null"))),(Object)(BA.numberCast(int.class, -(double) (0 + 1))),(Object)(saglikbilgilerilistele.mostCurrent.__c.getField(true,"False")))));
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
public static RemoteObject  _buttonisim_click() throws Exception{
try {
		Debug.PushSubsStack("ButtonIsim_Click (saglikbilgilerilistele) ","saglikbilgilerilistele",27,saglikbilgilerilistele.mostCurrent.activityBA,saglikbilgilerilistele.mostCurrent,103);
if (RapidSub.canDelegate("buttonisim_click")) { return b4a.example3.saglikbilgilerilistele.remoteMe.runUserSub(false, "saglikbilgilerilistele","buttonisim_click");}
 BA.debugLineNum = 103;BA.debugLine="Sub ButtonIsim_Click";
Debug.ShouldStop(64);
 BA.debugLineNum = 104;BA.debugLine="WebView1.LoadHtml(DBUtils.ExecuteHtml(Main.sql, \"";
Debug.ShouldStop(128);
saglikbilgilerilistele.mostCurrent._webview1.runVoidMethod ("LoadHtml",(Object)(saglikbilgilerilistele.mostCurrent._dbutils.runMethod(true,"_executehtml" /*RemoteObject*/ ,saglikbilgilerilistele.mostCurrent.activityBA,(Object)(saglikbilgilerilistele.mostCurrent._main._sql /*RemoteObject*/ ),(Object)(RemoteObject.concat(RemoteObject.createImmutable("SELECT  denek_isim As [DENEK İSİM], denek_tc As [Denek TC] FROM SaglikBilgileri,Denek WHERE  SaglikBilgileri.denek_id = Denek.denek_id AND denek_isim LIKE '%"),saglikbilgilerilistele.mostCurrent._edittextara.runMethod(true,"getText"),RemoteObject.createImmutable("%' ORDER BY saglikBilgileri_id DESC"))),(Object)((saglikbilgilerilistele.mostCurrent.__c.getField(false,"Null"))),(Object)(BA.numberCast(int.class, -(double) (0 + 1))),(Object)(saglikbilgilerilistele.mostCurrent.__c.getField(true,"False")))));
 BA.debugLineNum = 105;BA.debugLine="End Sub";
Debug.ShouldStop(256);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _buttonsaglikbilgileraciklama_click() throws Exception{
try {
		Debug.PushSubsStack("ButtonSaglikBilgilerAciklama_Click (saglikbilgilerilistele) ","saglikbilgilerilistele",27,saglikbilgilerilistele.mostCurrent.activityBA,saglikbilgilerilistele.mostCurrent,115);
if (RapidSub.canDelegate("buttonsaglikbilgileraciklama_click")) { return b4a.example3.saglikbilgilerilistele.remoteMe.runUserSub(false, "saglikbilgilerilistele","buttonsaglikbilgileraciklama_click");}
 BA.debugLineNum = 115;BA.debugLine="Sub ButtonSaglikBilgilerAciklama_Click";
Debug.ShouldStop(262144);
 BA.debugLineNum = 116;BA.debugLine="WebView1.LoadHtml(DBUtils.ExecuteHtml(Main.sql, \"";
Debug.ShouldStop(524288);
saglikbilgilerilistele.mostCurrent._webview1.runVoidMethod ("LoadHtml",(Object)(saglikbilgilerilistele.mostCurrent._dbutils.runMethod(true,"_executehtml" /*RemoteObject*/ ,saglikbilgilerilistele.mostCurrent.activityBA,(Object)(saglikbilgilerilistele.mostCurrent._main._sql /*RemoteObject*/ ),(Object)(RemoteObject.concat(RemoteObject.createImmutable("SELECT denek_tc As [Denek TC], denek_isim As [DENEK İSİM], saglikBilgileri_aciklama  As [SAĞLIK İLGİLERİ AÇIKLAMA] FROM SaglikBilgileri,Denek WHERE  SaglikBilgileri.denek_id = Denek.denek_id AND saglikBilgileri_aciklama LIKE '%"),saglikbilgilerilistele.mostCurrent._edittextara.runMethod(true,"getText"),RemoteObject.createImmutable("%' ORDER BY saglikBilgileri_id DESC"))),(Object)((saglikbilgilerilistele.mostCurrent.__c.getField(false,"Null"))),(Object)(BA.numberCast(int.class, -(double) (0 + 1))),(Object)(saglikbilgilerilistele.mostCurrent.__c.getField(true,"False")))));
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
public static RemoteObject  _buttonsaglikbilgileriekle_click() throws Exception{
try {
		Debug.PushSubsStack("ButtonSaglikBilgileriEkle_Click (saglikbilgilerilistele) ","saglikbilgilerilistele",27,saglikbilgilerilistele.mostCurrent.activityBA,saglikbilgilerilistele.mostCurrent,130);
if (RapidSub.canDelegate("buttonsaglikbilgileriekle_click")) { return b4a.example3.saglikbilgilerilistele.remoteMe.runUserSub(false, "saglikbilgilerilistele","buttonsaglikbilgileriekle_click");}
 BA.debugLineNum = 130;BA.debugLine="Sub ButtonSaglikBilgileriEkle_Click";
Debug.ShouldStop(2);
 BA.debugLineNum = 131;BA.debugLine="Main.Status = \"S\"";
Debug.ShouldStop(4);
saglikbilgilerilistele.mostCurrent._main._status /*RemoteObject*/  = BA.ObjectToString("S");
 BA.debugLineNum = 132;BA.debugLine="StartActivity(TestDenekAra)";
Debug.ShouldStop(8);
saglikbilgilerilistele.mostCurrent.__c.runVoidMethod ("StartActivity",saglikbilgilerilistele.processBA,(Object)((saglikbilgilerilistele.mostCurrent._testdenekara.getObject())));
 BA.debugLineNum = 133;BA.debugLine="Activity.Finish";
Debug.ShouldStop(16);
saglikbilgilerilistele.mostCurrent._activity.runVoidMethod ("Finish");
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
public static RemoteObject  _buttonsaglikbilgilerisil_click() throws Exception{
try {
		Debug.PushSubsStack("ButtonSaglikBilgileriSil_Click (saglikbilgilerilistele) ","saglikbilgilerilistele",27,saglikbilgilerilistele.mostCurrent.activityBA,saglikbilgilerilistele.mostCurrent,125);
if (RapidSub.canDelegate("buttonsaglikbilgilerisil_click")) { return b4a.example3.saglikbilgilerilistele.remoteMe.runUserSub(false, "saglikbilgilerilistele","buttonsaglikbilgilerisil_click");}
 BA.debugLineNum = 125;BA.debugLine="Sub ButtonSaglikBilgileriSil_Click";
Debug.ShouldStop(268435456);
 BA.debugLineNum = 126;BA.debugLine="StartActivity(SaglikBilgileriSil)";
Debug.ShouldStop(536870912);
saglikbilgilerilistele.mostCurrent.__c.runVoidMethod ("StartActivity",saglikbilgilerilistele.processBA,(Object)((saglikbilgilerilistele.mostCurrent._saglikbilgilerisil.getObject())));
 BA.debugLineNum = 127;BA.debugLine="Activity.Finish";
Debug.ShouldStop(1073741824);
saglikbilgilerilistele.mostCurrent._activity.runVoidMethod ("Finish");
 BA.debugLineNum = 128;BA.debugLine="End Sub";
Debug.ShouldStop(-2147483648);
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
		Debug.PushSubsStack("ButtonTarih_Click (saglikbilgilerilistele) ","saglikbilgilerilistele",27,saglikbilgilerilistele.mostCurrent.activityBA,saglikbilgilerilistele.mostCurrent,119);
if (RapidSub.canDelegate("buttontarih_click")) { return b4a.example3.saglikbilgilerilistele.remoteMe.runUserSub(false, "saglikbilgilerilistele","buttontarih_click");}
 BA.debugLineNum = 119;BA.debugLine="Sub ButtonTarih_Click";
Debug.ShouldStop(4194304);
 BA.debugLineNum = 120;BA.debugLine="WebView1.LoadHtml(DBUtils.ExecuteHtml(Main.sql, \"";
Debug.ShouldStop(8388608);
saglikbilgilerilistele.mostCurrent._webview1.runVoidMethod ("LoadHtml",(Object)(saglikbilgilerilistele.mostCurrent._dbutils.runMethod(true,"_executehtml" /*RemoteObject*/ ,saglikbilgilerilistele.mostCurrent.activityBA,(Object)(saglikbilgilerilistele.mostCurrent._main._sql /*RemoteObject*/ ),(Object)(RemoteObject.concat(RemoteObject.createImmutable("SELECT denek_tc As [Denek TC], denek_isim As [DENEK İSİM], saglikBilgileri_tarih As [TARİH],saglikBilgileri_saat As [SAAT] FROM SaglikBilgileri,Denek WHERE  SaglikBilgileri.denek_id = Denek.denek_id AND saglikBilgileri_tarih  LIKE '%"),saglikbilgilerilistele.mostCurrent._edittextara.runMethod(true,"getText"),RemoteObject.createImmutable("%' ORDER BY saglikBilgileri_id DESC"))),(Object)((saglikbilgilerilistele.mostCurrent.__c.getField(false,"Null"))),(Object)(BA.numberCast(int.class, -(double) (0 + 1))),(Object)(saglikbilgilerilistele.mostCurrent.__c.getField(true,"False")))));
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
public static RemoteObject  _buttontc_click() throws Exception{
try {
		Debug.PushSubsStack("ButtonTc_Click (saglikbilgilerilistele) ","saglikbilgilerilistele",27,saglikbilgilerilistele.mostCurrent.activityBA,saglikbilgilerilistele.mostCurrent,107);
if (RapidSub.canDelegate("buttontc_click")) { return b4a.example3.saglikbilgilerilistele.remoteMe.runUserSub(false, "saglikbilgilerilistele","buttontc_click");}
 BA.debugLineNum = 107;BA.debugLine="Sub ButtonTc_Click";
Debug.ShouldStop(1024);
 BA.debugLineNum = 108;BA.debugLine="WebView1.LoadHtml(DBUtils.ExecuteHtml(Main.sql, \"";
Debug.ShouldStop(2048);
saglikbilgilerilistele.mostCurrent._webview1.runVoidMethod ("LoadHtml",(Object)(saglikbilgilerilistele.mostCurrent._dbutils.runMethod(true,"_executehtml" /*RemoteObject*/ ,saglikbilgilerilistele.mostCurrent.activityBA,(Object)(saglikbilgilerilistele.mostCurrent._main._sql /*RemoteObject*/ ),(Object)(RemoteObject.concat(RemoteObject.createImmutable("SELECT denek_tc As [Denek TC], denek_isim As [DENEK İSİM] FROM SaglikBilgileri,Denek WHERE  SaglikBilgileri.denek_id = Denek.denek_id AND denek_tc LIKE '%"),saglikbilgilerilistele.mostCurrent._edittextara.runMethod(true,"getText"),RemoteObject.createImmutable("%' ORDER BY saglikBilgileri_id DESC"))),(Object)((saglikbilgilerilistele.mostCurrent.__c.getField(false,"Null"))),(Object)(BA.numberCast(int.class, -(double) (0 + 1))),(Object)(saglikbilgilerilistele.mostCurrent.__c.getField(true,"False")))));
 BA.debugLineNum = 109;BA.debugLine="End Sub";
Debug.ShouldStop(4096);
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
		Debug.PushSubsStack("EditTextAra_TextChanged (saglikbilgilerilistele) ","saglikbilgilerilistele",27,saglikbilgilerilistele.mostCurrent.activityBA,saglikbilgilerilistele.mostCurrent,94);
if (RapidSub.canDelegate("edittextara_textchanged")) { return b4a.example3.saglikbilgilerilistele.remoteMe.runUserSub(false, "saglikbilgilerilistele","edittextara_textchanged", _old, _new);}
Debug.locals.put("Old", _old);
Debug.locals.put("New", _new);
 BA.debugLineNum = 94;BA.debugLine="Sub EditTextAra_TextChanged (Old As String, New As";
Debug.ShouldStop(536870912);
 BA.debugLineNum = 95;BA.debugLine="LabelCarpi.Visible = True";
Debug.ShouldStop(1073741824);
saglikbilgilerilistele.mostCurrent._labelcarpi.runMethod(true,"setVisible",saglikbilgilerilistele.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 96;BA.debugLine="WebView1.LoadHtml(DBUtils.ExecuteHtml(Main.sql, \"";
Debug.ShouldStop(-2147483648);
saglikbilgilerilistele.mostCurrent._webview1.runVoidMethod ("LoadHtml",(Object)(saglikbilgilerilistele.mostCurrent._dbutils.runMethod(true,"_executehtml" /*RemoteObject*/ ,saglikbilgilerilistele.mostCurrent.activityBA,(Object)(saglikbilgilerilistele.mostCurrent._main._sql /*RemoteObject*/ ),(Object)(RemoteObject.concat(RemoteObject.createImmutable("SELECT  denek_tc As [Denek TC], denek_isim As [DENEK İSİM] ,saglikBilgileri_tarih As [TARİH],saglikBilgileri_saat As [SAAT], saglikBilgileri_hastalikSakatlik As [HASTALIK/SAKATLIK],saglikBilgileri_aciklama As [SAĞLIK BİLGİLERİ AÇIKLAMA] FROM SaglikBilgileri,Denek WHERE SaglikBilgileri.denek_id = Denek.denek_id AND (denek_tc LIKE '%"),saglikbilgilerilistele.mostCurrent._edittextara.runMethod(true,"getText"),RemoteObject.createImmutable("%' OR denek_isim LIKE '%"),saglikbilgilerilistele.mostCurrent._edittextara.runMethod(true,"getText"),RemoteObject.createImmutable("%' OR saglikBilgileri_tarih LIKE '%"),saglikbilgilerilistele.mostCurrent._edittextara.runMethod(true,"getText"),RemoteObject.createImmutable("%' OR saglikBilgileri_hastalikSakatlik LIKE '%"),saglikbilgilerilistele.mostCurrent._edittextara.runMethod(true,"getText"),RemoteObject.createImmutable("%' OR saglikBilgileri_aciklama LIKE '%"),saglikbilgilerilistele.mostCurrent._edittextara.runMethod(true,"getText"),RemoteObject.createImmutable("%' ) ORDER BY saglikBilgileri_id DESC"))),(Object)((saglikbilgilerilistele.mostCurrent.__c.getField(false,"Null"))),(Object)(BA.numberCast(int.class, -(double) (0 + 1))),(Object)(saglikbilgilerilistele.mostCurrent.__c.getField(true,"False")))));
 BA.debugLineNum = 97;BA.debugLine="If EditTextAra.Text = \"\" Then";
Debug.ShouldStop(1);
if (RemoteObject.solveBoolean("=",saglikbilgilerilistele.mostCurrent._edittextara.runMethod(true,"getText"),BA.ObjectToString(""))) { 
 BA.debugLineNum = 98;BA.debugLine="LabelCarpi.Visible = False";
Debug.ShouldStop(2);
saglikbilgilerilistele.mostCurrent._labelcarpi.runMethod(true,"setVisible",saglikbilgilerilistele.mostCurrent.__c.getField(true,"False"));
 };
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
public static RemoteObject  _globals() throws Exception{
 //BA.debugLineNum = 12;BA.debugLine="Sub Globals";
 //BA.debugLineNum = 16;BA.debugLine="Private EditTextAra As EditText";
saglikbilgilerilistele.mostCurrent._edittextara = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
 //BA.debugLineNum = 17;BA.debugLine="Private ButtonIsim As Button";
saglikbilgilerilistele.mostCurrent._buttonisim = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 18;BA.debugLine="Private ButtonTc As Button";
saglikbilgilerilistele.mostCurrent._buttontc = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 19;BA.debugLine="Private ButtonHastalikSaglik As Button";
saglikbilgilerilistele.mostCurrent._buttonhastaliksaglik = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 20;BA.debugLine="Private ButtonSaglikBilgileriAciklama As Button";
saglikbilgilerilistele.mostCurrent._buttonsaglikbilgileriaciklama = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 21;BA.debugLine="Private ButtonTarih As Button";
saglikbilgilerilistele.mostCurrent._buttontarih = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 22;BA.debugLine="Private WebView1 As WebView";
saglikbilgilerilistele.mostCurrent._webview1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.WebViewWrapper");
 //BA.debugLineNum = 24;BA.debugLine="Private ButtonSaglikBilgileriSil As Button";
saglikbilgilerilistele.mostCurrent._buttonsaglikbilgilerisil = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 25;BA.debugLine="Private ButtonSaglikBilgileriEkle As Button";
saglikbilgilerilistele.mostCurrent._buttonsaglikbilgileriekle = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 26;BA.debugLine="Private LabelCarpi As Label";
saglikbilgilerilistele.mostCurrent._labelcarpi = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 27;BA.debugLine="Private ButtonAnasayfa As Button";
saglikbilgilerilistele.mostCurrent._buttonanasayfa = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 28;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _htmlgosterdb() throws Exception{
try {
		Debug.PushSubsStack("HTMLGosterDB (saglikbilgilerilistele) ","saglikbilgilerilistele",27,saglikbilgilerilistele.mostCurrent.activityBA,saglikbilgilerilistele.mostCurrent,89);
if (RapidSub.canDelegate("htmlgosterdb")) { return b4a.example3.saglikbilgilerilistele.remoteMe.runUserSub(false, "saglikbilgilerilistele","htmlgosterdb");}
 BA.debugLineNum = 89;BA.debugLine="Sub HTMLGosterDB";
Debug.ShouldStop(16777216);
 BA.debugLineNum = 91;BA.debugLine="WebView1.LoadHtml(DBUtils.ExecuteHtml(Main.sql,\"S";
Debug.ShouldStop(67108864);
saglikbilgilerilistele.mostCurrent._webview1.runVoidMethod ("LoadHtml",(Object)(saglikbilgilerilistele.mostCurrent._dbutils.runMethod(true,"_executehtml" /*RemoteObject*/ ,saglikbilgilerilistele.mostCurrent.activityBA,(Object)(saglikbilgilerilistele.mostCurrent._main._sql /*RemoteObject*/ ),(Object)(BA.ObjectToString("SELECT denek_tc As [Denek TC], denek_isim As [Denek İSİM], saglikBilgileri_tarih As [TARİH],saglikBilgileri_saat As [SAAT], saglikBilgileri_hastalikSakatlik As [HASTALIK/SAKATLIK],saglikBilgileri_aciklama As [SAĞLIK BİLGİLERİ AÇIKLAMA] FROM SaglikBilgileri,Denek WHERE SaglikBilgileri.denek_id = Denek.denek_id ORDER BY saglikBilgileri_id DESC")),(Object)((saglikbilgilerilistele.mostCurrent.__c.getField(false,"Null"))),(Object)(BA.numberCast(int.class, -(double) (0 + 1))),(Object)(saglikbilgilerilistele.mostCurrent.__c.getField(true,"False")))));
 BA.debugLineNum = 92;BA.debugLine="End Sub";
Debug.ShouldStop(134217728);
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
		Debug.PushSubsStack("LabelCarpi_Click (saglikbilgilerilistele) ","saglikbilgilerilistele",27,saglikbilgilerilistele.mostCurrent.activityBA,saglikbilgilerilistele.mostCurrent,136);
if (RapidSub.canDelegate("labelcarpi_click")) { return b4a.example3.saglikbilgilerilistele.remoteMe.runUserSub(false, "saglikbilgilerilistele","labelcarpi_click");}
 BA.debugLineNum = 136;BA.debugLine="Sub LabelCarpi_Click";
Debug.ShouldStop(128);
 BA.debugLineNum = 137;BA.debugLine="EditTextAra.SelectAll";
Debug.ShouldStop(256);
saglikbilgilerilistele.mostCurrent._edittextara.runVoidMethod ("SelectAll");
 BA.debugLineNum = 138;BA.debugLine="EditTextAra.Text= \"\"";
Debug.ShouldStop(512);
saglikbilgilerilistele.mostCurrent._edittextara.runMethodAndSync(true,"setText",BA.ObjectToCharSequence(""));
 BA.debugLineNum = 139;BA.debugLine="HTMLGosterDB";
Debug.ShouldStop(1024);
_htmlgosterdb();
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
}