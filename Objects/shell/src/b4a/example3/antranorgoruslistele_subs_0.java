package b4a.example3;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class antranorgoruslistele_subs_0 {


public static RemoteObject  _activity_create(RemoteObject _firsttime) throws Exception{
try {
		Debug.PushSubsStack("Activity_Create (antranorgoruslistele) ","antranorgoruslistele",2,antranorgoruslistele.mostCurrent.activityBA,antranorgoruslistele.mostCurrent,29);
if (RapidSub.canDelegate("activity_create")) { return b4a.example3.antranorgoruslistele.remoteMe.runUserSub(false, "antranorgoruslistele","activity_create", _firsttime);}
Debug.locals.put("FirstTime", _firsttime);
 BA.debugLineNum = 29;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
Debug.ShouldStop(268435456);
 BA.debugLineNum = 31;BA.debugLine="Activity.LoadLayout(\"AntranorGorusleriListelePage";
Debug.ShouldStop(1073741824);
antranorgoruslistele.mostCurrent._activity.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("AntranorGorusleriListelePage")),antranorgoruslistele.mostCurrent.activityBA);
 BA.debugLineNum = 32;BA.debugLine="LabelCarpi.Visible = False";
Debug.ShouldStop(-2147483648);
antranorgoruslistele.mostCurrent._labelcarpi.runMethod(true,"setVisible",antranorgoruslistele.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 35;BA.debugLine="ButtonTc.TextColor = Color.koyuMavi";
Debug.ShouldStop(4);
antranorgoruslistele.mostCurrent._buttontc.runMethod(true,"setTextColor",antranorgoruslistele.mostCurrent._color._koyumavi /*RemoteObject*/ );
 BA.debugLineNum = 36;BA.debugLine="ButtonTc.Typeface = Typeface.DEFAULT_BOLD";
Debug.ShouldStop(8);
antranorgoruslistele.mostCurrent._buttontc.runMethod(false,"setTypeface",antranorgoruslistele.mostCurrent.__c.getField(false,"Typeface").getField(false,"DEFAULT_BOLD"));
 BA.debugLineNum = 37;BA.debugLine="ButtonTc.Text = \"TC\"";
Debug.ShouldStop(16);
antranorgoruslistele.mostCurrent._buttontc.runMethod(true,"setText",BA.ObjectToCharSequence("TC"));
 BA.debugLineNum = 38;BA.debugLine="ButtonTc.TextSize = 14";
Debug.ShouldStop(32);
antranorgoruslistele.mostCurrent._buttontc.runMethod(true,"setTextSize",BA.numberCast(float.class, 14));
 BA.debugLineNum = 39;BA.debugLine="ButtonTc.SingleLine = True";
Debug.ShouldStop(64);
antranorgoruslistele.mostCurrent._buttontc.runVoidMethod ("setSingleLine",antranorgoruslistele.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 41;BA.debugLine="ButtonIsim.TextColor = Color.koyuMavi";
Debug.ShouldStop(256);
antranorgoruslistele.mostCurrent._buttonisim.runMethod(true,"setTextColor",antranorgoruslistele.mostCurrent._color._koyumavi /*RemoteObject*/ );
 BA.debugLineNum = 42;BA.debugLine="ButtonIsim.Typeface = Typeface.DEFAULT_BOLD";
Debug.ShouldStop(512);
antranorgoruslistele.mostCurrent._buttonisim.runMethod(false,"setTypeface",antranorgoruslistele.mostCurrent.__c.getField(false,"Typeface").getField(false,"DEFAULT_BOLD"));
 BA.debugLineNum = 43;BA.debugLine="ButtonIsim.Text = \"İSİM\"";
Debug.ShouldStop(1024);
antranorgoruslistele.mostCurrent._buttonisim.runMethod(true,"setText",BA.ObjectToCharSequence("İSİM"));
 BA.debugLineNum = 44;BA.debugLine="ButtonIsim.TextSize = 14";
Debug.ShouldStop(2048);
antranorgoruslistele.mostCurrent._buttonisim.runMethod(true,"setTextSize",BA.numberCast(float.class, 14));
 BA.debugLineNum = 45;BA.debugLine="ButtonIsim.SingleLine = True";
Debug.ShouldStop(4096);
antranorgoruslistele.mostCurrent._buttonisim.runVoidMethod ("setSingleLine",antranorgoruslistele.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 47;BA.debugLine="ButtonAntranorGorusleriAciklama.TextColor = Color";
Debug.ShouldStop(16384);
antranorgoruslistele.mostCurrent._buttonantranorgorusleriaciklama.runMethod(true,"setTextColor",antranorgoruslistele.mostCurrent._color._koyumavi /*RemoteObject*/ );
 BA.debugLineNum = 48;BA.debugLine="ButtonAntranorGorusleriAciklama.Typeface = Typefa";
Debug.ShouldStop(32768);
antranorgoruslistele.mostCurrent._buttonantranorgorusleriaciklama.runMethod(false,"setTypeface",antranorgoruslistele.mostCurrent.__c.getField(false,"Typeface").getField(false,"DEFAULT_BOLD"));
 BA.debugLineNum = 49;BA.debugLine="ButtonAntranorGorusleriAciklama.Text = \"ANTRANÖR";
Debug.ShouldStop(65536);
antranorgoruslistele.mostCurrent._buttonantranorgorusleriaciklama.runMethod(true,"setText",BA.ObjectToCharSequence("ANTRANÖR GÖRÜŞ AÇIKLAMA"));
 BA.debugLineNum = 50;BA.debugLine="ButtonAntranorGorusleriAciklama.TextSize = 14";
Debug.ShouldStop(131072);
antranorgoruslistele.mostCurrent._buttonantranorgorusleriaciklama.runMethod(true,"setTextSize",BA.numberCast(float.class, 14));
 BA.debugLineNum = 51;BA.debugLine="ButtonAntranorGorusleriAciklama.SingleLine = True";
Debug.ShouldStop(262144);
antranorgoruslistele.mostCurrent._buttonantranorgorusleriaciklama.runVoidMethod ("setSingleLine",antranorgoruslistele.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 53;BA.debugLine="ButtonTarih.TextColor = Color.koyuMavi";
Debug.ShouldStop(1048576);
antranorgoruslistele.mostCurrent._buttontarih.runMethod(true,"setTextColor",antranorgoruslistele.mostCurrent._color._koyumavi /*RemoteObject*/ );
 BA.debugLineNum = 54;BA.debugLine="ButtonTarih.Typeface = Typeface.DEFAULT_BOLD";
Debug.ShouldStop(2097152);
antranorgoruslistele.mostCurrent._buttontarih.runMethod(false,"setTypeface",antranorgoruslistele.mostCurrent.__c.getField(false,"Typeface").getField(false,"DEFAULT_BOLD"));
 BA.debugLineNum = 55;BA.debugLine="ButtonTarih.Text = \"TARİH\"";
Debug.ShouldStop(4194304);
antranorgoruslistele.mostCurrent._buttontarih.runMethod(true,"setText",BA.ObjectToCharSequence("TARİH"));
 BA.debugLineNum = 56;BA.debugLine="ButtonTarih.TextSize  =14";
Debug.ShouldStop(8388608);
antranorgoruslistele.mostCurrent._buttontarih.runMethod(true,"setTextSize",BA.numberCast(float.class, 14));
 BA.debugLineNum = 57;BA.debugLine="ButtonTarih.SingleLine = True";
Debug.ShouldStop(16777216);
antranorgoruslistele.mostCurrent._buttontarih.runVoidMethod ("setSingleLine",antranorgoruslistele.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 59;BA.debugLine="EditTextAra.TextColor = Colors.White";
Debug.ShouldStop(67108864);
antranorgoruslistele.mostCurrent._edittextara.runMethod(true,"setTextColor",antranorgoruslistele.mostCurrent.__c.getField(false,"Colors").getField(true,"White"));
 BA.debugLineNum = 60;BA.debugLine="EditTextAra.Hint = \"Bu alana yazarak aratabilirsi";
Debug.ShouldStop(134217728);
antranorgoruslistele.mostCurrent._edittextara.runMethod(true,"setHint",BA.ObjectToString("Bu alana yazarak aratabilirsiniz.."));
 BA.debugLineNum = 61;BA.debugLine="EditTextAra.HintColor = Color.hintColor";
Debug.ShouldStop(268435456);
antranorgoruslistele.mostCurrent._edittextara.runMethod(true,"setHintColor",antranorgoruslistele.mostCurrent._color._hintcolor /*RemoteObject*/ );
 BA.debugLineNum = 62;BA.debugLine="EditTextAra.TextSize = 20";
Debug.ShouldStop(536870912);
antranorgoruslistele.mostCurrent._edittextara.runMethod(true,"setTextSize",BA.numberCast(float.class, 20));
 BA.debugLineNum = 63;BA.debugLine="EditTextAra.Typeface = Typeface.DEFAULT_BOLD";
Debug.ShouldStop(1073741824);
antranorgoruslistele.mostCurrent._edittextara.runMethod(false,"setTypeface",antranorgoruslistele.mostCurrent.__c.getField(false,"Typeface").getField(false,"DEFAULT_BOLD"));
 BA.debugLineNum = 65;BA.debugLine="WebView1.ZoomEnabled = True";
Debug.ShouldStop(1);
antranorgoruslistele.mostCurrent._webview1.runMethod(true,"setZoomEnabled",antranorgoruslistele.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 66;BA.debugLine="WebView1.JavaScriptEnabled = True";
Debug.ShouldStop(2);
antranorgoruslistele.mostCurrent._webview1.runMethod(true,"setJavaScriptEnabled",antranorgoruslistele.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 71;BA.debugLine="HTMLGosterDB";
Debug.ShouldStop(64);
_htmlgosterdb();
 BA.debugLineNum = 73;BA.debugLine="End Sub";
Debug.ShouldStop(256);
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
		Debug.PushSubsStack("Activity_Pause (antranorgoruslistele) ","antranorgoruslistele",2,antranorgoruslistele.mostCurrent.activityBA,antranorgoruslistele.mostCurrent,79);
if (RapidSub.canDelegate("activity_pause")) { return b4a.example3.antranorgoruslistele.remoteMe.runUserSub(false, "antranorgoruslistele","activity_pause", _userclosed);}
Debug.locals.put("UserClosed", _userclosed);
 BA.debugLineNum = 79;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
Debug.ShouldStop(16384);
 BA.debugLineNum = 81;BA.debugLine="End Sub";
Debug.ShouldStop(65536);
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
		Debug.PushSubsStack("Activity_Resume (antranorgoruslistele) ","antranorgoruslistele",2,antranorgoruslistele.mostCurrent.activityBA,antranorgoruslistele.mostCurrent,75);
if (RapidSub.canDelegate("activity_resume")) { return b4a.example3.antranorgoruslistele.remoteMe.runUserSub(false, "antranorgoruslistele","activity_resume");}
 BA.debugLineNum = 75;BA.debugLine="Sub Activity_Resume";
Debug.ShouldStop(1024);
 BA.debugLineNum = 77;BA.debugLine="End Sub";
Debug.ShouldStop(4096);
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
		Debug.PushSubsStack("ButtonAnasayfa_Click (antranorgoruslistele) ","antranorgoruslistele",2,antranorgoruslistele.mostCurrent.activityBA,antranorgoruslistele.mostCurrent,125);
if (RapidSub.canDelegate("buttonanasayfa_click")) { return b4a.example3.antranorgoruslistele.remoteMe.runUserSub(false, "antranorgoruslistele","buttonanasayfa_click");}
 BA.debugLineNum = 125;BA.debugLine="Sub ButtonAnasayfa_Click";
Debug.ShouldStop(268435456);
 BA.debugLineNum = 126;BA.debugLine="StartActivity(AnaMenu)";
Debug.ShouldStop(536870912);
antranorgoruslistele.mostCurrent.__c.runVoidMethod ("StartActivity",antranorgoruslistele.processBA,(Object)((antranorgoruslistele.mostCurrent._anamenu.getObject())));
 BA.debugLineNum = 127;BA.debugLine="Activity.Finish";
Debug.ShouldStop(1073741824);
antranorgoruslistele.mostCurrent._activity.runVoidMethod ("Finish");
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
public static RemoteObject  _buttonantranorgorusleriaciklama_click() throws Exception{
try {
		Debug.PushSubsStack("ButtonAntranorGorusleriAciklama_Click (antranorgoruslistele) ","antranorgoruslistele",2,antranorgoruslistele.mostCurrent.activityBA,antranorgoruslistele.mostCurrent,105);
if (RapidSub.canDelegate("buttonantranorgorusleriaciklama_click")) { return b4a.example3.antranorgoruslistele.remoteMe.runUserSub(false, "antranorgoruslistele","buttonantranorgorusleriaciklama_click");}
 BA.debugLineNum = 105;BA.debugLine="Sub ButtonAntranorGorusleriAciklama_Click";
Debug.ShouldStop(256);
 BA.debugLineNum = 106;BA.debugLine="WebView1.LoadHtml(DBUtils.ExecuteHtml(Main.sql, \"";
Debug.ShouldStop(512);
antranorgoruslistele.mostCurrent._webview1.runVoidMethod ("LoadHtml",(Object)(antranorgoruslistele.mostCurrent._dbutils.runMethod(true,"_executehtml" /*RemoteObject*/ ,antranorgoruslistele.mostCurrent.activityBA,(Object)(antranorgoruslistele.mostCurrent._main._sql /*RemoteObject*/ ),(Object)(RemoteObject.concat(RemoteObject.createImmutable("SELECT denek_tc As [Denek TC], denek_isim As [DENEK İSİM], antranorGorüsleri_aciklama As [ANTRANOR GÖRÜŞLERİ AÇIKLAMA] FROM AntranorGorusleri,Denek WHERE  AntranorGorusleri.denek_id = Denek.denek_id AND antranorGorüsleri_aciklama LIKE '%"),antranorgoruslistele.mostCurrent._edittextara.runMethod(true,"getText"),RemoteObject.createImmutable("%' ORDER BY antranorGorüsleri_id DESC"))),(Object)((antranorgoruslistele.mostCurrent.__c.getField(false,"Null"))),(Object)(BA.numberCast(int.class, -(double) (0 + 1))),(Object)(antranorgoruslistele.mostCurrent.__c.getField(true,"False")))));
 BA.debugLineNum = 107;BA.debugLine="End Sub";
Debug.ShouldStop(1024);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _buttonantranorgorusleriekle_click() throws Exception{
try {
		Debug.PushSubsStack("ButtonAntranorGorusleriEkle_Click (antranorgoruslistele) ","antranorgoruslistele",2,antranorgoruslistele.mostCurrent.activityBA,antranorgoruslistele.mostCurrent,114);
if (RapidSub.canDelegate("buttonantranorgorusleriekle_click")) { return b4a.example3.antranorgoruslistele.remoteMe.runUserSub(false, "antranorgoruslistele","buttonantranorgorusleriekle_click");}
 BA.debugLineNum = 114;BA.debugLine="Sub ButtonAntranorGorusleriEkle_Click";
Debug.ShouldStop(131072);
 BA.debugLineNum = 115;BA.debugLine="Main.Status = \"S\"";
Debug.ShouldStop(262144);
antranorgoruslistele.mostCurrent._main._status /*RemoteObject*/  = BA.ObjectToString("S");
 BA.debugLineNum = 116;BA.debugLine="StartActivity(TestDenekAra)";
Debug.ShouldStop(524288);
antranorgoruslistele.mostCurrent.__c.runVoidMethod ("StartActivity",antranorgoruslistele.processBA,(Object)((antranorgoruslistele.mostCurrent._testdenekara.getObject())));
 BA.debugLineNum = 117;BA.debugLine="Activity.Finish";
Debug.ShouldStop(1048576);
antranorgoruslistele.mostCurrent._activity.runVoidMethod ("Finish");
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
public static RemoteObject  _buttonantranorgoruslerisil_click() throws Exception{
try {
		Debug.PushSubsStack("ButtonAntranorGorusleriSil_Click (antranorgoruslistele) ","antranorgoruslistele",2,antranorgoruslistele.mostCurrent.activityBA,antranorgoruslistele.mostCurrent,120);
if (RapidSub.canDelegate("buttonantranorgoruslerisil_click")) { return b4a.example3.antranorgoruslistele.remoteMe.runUserSub(false, "antranorgoruslistele","buttonantranorgoruslerisil_click");}
 BA.debugLineNum = 120;BA.debugLine="Sub ButtonAntranorGorusleriSil_Click";
Debug.ShouldStop(8388608);
 BA.debugLineNum = 121;BA.debugLine="StartActivity(AntranorGorusSil)";
Debug.ShouldStop(16777216);
antranorgoruslistele.mostCurrent.__c.runVoidMethod ("StartActivity",antranorgoruslistele.processBA,(Object)((antranorgoruslistele.mostCurrent._antranorgorussil.getObject())));
 BA.debugLineNum = 122;BA.debugLine="Activity.Finish";
Debug.ShouldStop(33554432);
antranorgoruslistele.mostCurrent._activity.runVoidMethod ("Finish");
 BA.debugLineNum = 123;BA.debugLine="End Sub";
Debug.ShouldStop(67108864);
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
		Debug.PushSubsStack("ButtonIsim_Click (antranorgoruslistele) ","antranorgoruslistele",2,antranorgoruslistele.mostCurrent.activityBA,antranorgoruslistele.mostCurrent,97);
if (RapidSub.canDelegate("buttonisim_click")) { return b4a.example3.antranorgoruslistele.remoteMe.runUserSub(false, "antranorgoruslistele","buttonisim_click");}
 BA.debugLineNum = 97;BA.debugLine="Sub ButtonIsim_Click";
Debug.ShouldStop(1);
 BA.debugLineNum = 98;BA.debugLine="WebView1.LoadHtml(DBUtils.ExecuteHtml(Main.sql, \"";
Debug.ShouldStop(2);
antranorgoruslistele.mostCurrent._webview1.runVoidMethod ("LoadHtml",(Object)(antranorgoruslistele.mostCurrent._dbutils.runMethod(true,"_executehtml" /*RemoteObject*/ ,antranorgoruslistele.mostCurrent.activityBA,(Object)(antranorgoruslistele.mostCurrent._main._sql /*RemoteObject*/ ),(Object)(RemoteObject.concat(RemoteObject.createImmutable("SELECT  denek_isim As [DENEK İSİM], denek_tc As [Denek TC] FROM AntranorGorusleri,Denek WHERE  AntranorGorusleri.denek_id = Denek.denek_id AND denek_isim LIKE '%"),antranorgoruslistele.mostCurrent._edittextara.runMethod(true,"getText"),RemoteObject.createImmutable("%' ORDER BY antranorGorüsleri_id DESC"))),(Object)((antranorgoruslistele.mostCurrent.__c.getField(false,"Null"))),(Object)(BA.numberCast(int.class, -(double) (0 + 1))),(Object)(antranorgoruslistele.mostCurrent.__c.getField(true,"False")))));
 BA.debugLineNum = 99;BA.debugLine="End Sub";
Debug.ShouldStop(4);
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
		Debug.PushSubsStack("ButtonTarih_Click (antranorgoruslistele) ","antranorgoruslistele",2,antranorgoruslistele.mostCurrent.activityBA,antranorgoruslistele.mostCurrent,109);
if (RapidSub.canDelegate("buttontarih_click")) { return b4a.example3.antranorgoruslistele.remoteMe.runUserSub(false, "antranorgoruslistele","buttontarih_click");}
 BA.debugLineNum = 109;BA.debugLine="Sub ButtonTarih_Click";
Debug.ShouldStop(4096);
 BA.debugLineNum = 110;BA.debugLine="WebView1.LoadHtml(DBUtils.ExecuteHtml(Main.sql, \"";
Debug.ShouldStop(8192);
antranorgoruslistele.mostCurrent._webview1.runVoidMethod ("LoadHtml",(Object)(antranorgoruslistele.mostCurrent._dbutils.runMethod(true,"_executehtml" /*RemoteObject*/ ,antranorgoruslistele.mostCurrent.activityBA,(Object)(antranorgoruslistele.mostCurrent._main._sql /*RemoteObject*/ ),(Object)(RemoteObject.concat(RemoteObject.createImmutable("SELECT denek_tc As [Denek TC], denek_isim As [DENEK İSİM], antranorGorüsleri_tarih As [TARİH],antranorGorüsleri_saat As [SAAT] FROM AntranorGorusleri,Denek WHERE  AntranorGorusleri.denek_id = Denek.denek_id AND antranorGorüsleri_tarih LIKE '%"),antranorgoruslistele.mostCurrent._edittextara.runMethod(true,"getText"),RemoteObject.createImmutable("%' ORDER BY antranorGorüsleri_id DESC"))),(Object)((antranorgoruslistele.mostCurrent.__c.getField(false,"Null"))),(Object)(BA.numberCast(int.class, -(double) (0 + 1))),(Object)(antranorgoruslistele.mostCurrent.__c.getField(true,"False")))));
 BA.debugLineNum = 111;BA.debugLine="End Sub";
Debug.ShouldStop(16384);
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
		Debug.PushSubsStack("ButtonTc_Click (antranorgoruslistele) ","antranorgoruslistele",2,antranorgoruslistele.mostCurrent.activityBA,antranorgoruslistele.mostCurrent,101);
if (RapidSub.canDelegate("buttontc_click")) { return b4a.example3.antranorgoruslistele.remoteMe.runUserSub(false, "antranorgoruslistele","buttontc_click");}
 BA.debugLineNum = 101;BA.debugLine="Sub ButtonTc_Click";
Debug.ShouldStop(16);
 BA.debugLineNum = 102;BA.debugLine="WebView1.LoadHtml(DBUtils.ExecuteHtml(Main.sql, \"";
Debug.ShouldStop(32);
antranorgoruslistele.mostCurrent._webview1.runVoidMethod ("LoadHtml",(Object)(antranorgoruslistele.mostCurrent._dbutils.runMethod(true,"_executehtml" /*RemoteObject*/ ,antranorgoruslistele.mostCurrent.activityBA,(Object)(antranorgoruslistele.mostCurrent._main._sql /*RemoteObject*/ ),(Object)(RemoteObject.concat(RemoteObject.createImmutable("SELECT denek_tc As [Denek TC], denek_isim As [DENEK İSİM] FROM AntranorGorusleri,Denek WHERE  AntranorGorusleri.denek_id = Denek.denek_id AND denek_tc LIKE '%"),antranorgoruslistele.mostCurrent._edittextara.runMethod(true,"getText"),RemoteObject.createImmutable("%' ORDER BY antranorGorüsleri_id DESC "))),(Object)((antranorgoruslistele.mostCurrent.__c.getField(false,"Null"))),(Object)(BA.numberCast(int.class, -(double) (0 + 1))),(Object)(antranorgoruslistele.mostCurrent.__c.getField(true,"False")))));
 BA.debugLineNum = 103;BA.debugLine="End Sub";
Debug.ShouldStop(64);
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
		Debug.PushSubsStack("EditTextAra_TextChanged (antranorgoruslistele) ","antranorgoruslistele",2,antranorgoruslistele.mostCurrent.activityBA,antranorgoruslistele.mostCurrent,88);
if (RapidSub.canDelegate("edittextara_textchanged")) { return b4a.example3.antranorgoruslistele.remoteMe.runUserSub(false, "antranorgoruslistele","edittextara_textchanged", _old, _new);}
Debug.locals.put("Old", _old);
Debug.locals.put("New", _new);
 BA.debugLineNum = 88;BA.debugLine="Sub EditTextAra_TextChanged (Old As String, New As";
Debug.ShouldStop(8388608);
 BA.debugLineNum = 89;BA.debugLine="LabelCarpi.Visible = True";
Debug.ShouldStop(16777216);
antranorgoruslistele.mostCurrent._labelcarpi.runMethod(true,"setVisible",antranorgoruslistele.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 90;BA.debugLine="WebView1.LoadHtml(DBUtils.ExecuteHtml(Main.sql, \"";
Debug.ShouldStop(33554432);
antranorgoruslistele.mostCurrent._webview1.runVoidMethod ("LoadHtml",(Object)(antranorgoruslistele.mostCurrent._dbutils.runMethod(true,"_executehtml" /*RemoteObject*/ ,antranorgoruslistele.mostCurrent.activityBA,(Object)(antranorgoruslistele.mostCurrent._main._sql /*RemoteObject*/ ),(Object)(RemoteObject.concat(RemoteObject.createImmutable("SELECT denek_tc As [Denek TC], denek_isim As [DENEK İSİM] ,antranorGorüsleri_tarih   As [TARİH],antranorGorüsleri_saat  As [SAAT],antranorGorüsleri_aciklama As [ANTRANOR GÖRÜŞLERİ AÇIKLAMA] FROM AntranorGorusleri,Denek WHERE AntranorGorusleri.denek_id = Denek.denek_id AND (denek_tc LIKE '%"),antranorgoruslistele.mostCurrent._edittextara.runMethod(true,"getText"),RemoteObject.createImmutable("%' OR denek_isim LIKE '%"),antranorgoruslistele.mostCurrent._edittextara.runMethod(true,"getText"),RemoteObject.createImmutable("%' OR antranorGorüsleri_tarih LIKE '%"),antranorgoruslistele.mostCurrent._edittextara.runMethod(true,"getText"),RemoteObject.createImmutable("%' OR antranorGorüsleri_aciklama LIKE '%"),antranorgoruslistele.mostCurrent._edittextara.runMethod(true,"getText"),RemoteObject.createImmutable("%' ) ORDER BY antranorGorüsleri_id DESC"))),(Object)((antranorgoruslistele.mostCurrent.__c.getField(false,"Null"))),(Object)(BA.numberCast(int.class, -(double) (0 + 1))),(Object)(antranorgoruslistele.mostCurrent.__c.getField(true,"False")))));
 BA.debugLineNum = 91;BA.debugLine="If EditTextAra.Text = \"\" Then";
Debug.ShouldStop(67108864);
if (RemoteObject.solveBoolean("=",antranorgoruslistele.mostCurrent._edittextara.runMethod(true,"getText"),BA.ObjectToString(""))) { 
 BA.debugLineNum = 92;BA.debugLine="LabelCarpi.Visible = False";
Debug.ShouldStop(134217728);
antranorgoruslistele.mostCurrent._labelcarpi.runMethod(true,"setVisible",antranorgoruslistele.mostCurrent.__c.getField(true,"False"));
 };
 BA.debugLineNum = 94;BA.debugLine="End Sub";
Debug.ShouldStop(536870912);
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
antranorgoruslistele.mostCurrent._edittextara = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
 //BA.debugLineNum = 17;BA.debugLine="Private ButtonAntranorGorusleriEkle As Button";
antranorgoruslistele.mostCurrent._buttonantranorgorusleriekle = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 18;BA.debugLine="Private ButtonAntranorGorusleriSil As Button";
antranorgoruslistele.mostCurrent._buttonantranorgoruslerisil = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 19;BA.debugLine="Private ButtonAnasayfa As Button";
antranorgoruslistele.mostCurrent._buttonanasayfa = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 21;BA.debugLine="Private ButtonTarih As Button";
antranorgoruslistele.mostCurrent._buttontarih = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 22;BA.debugLine="Private ButtonAntranorGorusleriAciklama As Button";
antranorgoruslistele.mostCurrent._buttonantranorgorusleriaciklama = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 23;BA.debugLine="Private ButtonTc As Button";
antranorgoruslistele.mostCurrent._buttontc = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 24;BA.debugLine="Private ButtonIsim As Button";
antranorgoruslistele.mostCurrent._buttonisim = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 25;BA.debugLine="Private WebView1 As WebView";
antranorgoruslistele.mostCurrent._webview1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.WebViewWrapper");
 //BA.debugLineNum = 26;BA.debugLine="Private LabelCarpi As Label";
antranorgoruslistele.mostCurrent._labelcarpi = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 27;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _htmlgosterdb() throws Exception{
try {
		Debug.PushSubsStack("HTMLGosterDB (antranorgoruslistele) ","antranorgoruslistele",2,antranorgoruslistele.mostCurrent.activityBA,antranorgoruslistele.mostCurrent,83);
if (RapidSub.canDelegate("htmlgosterdb")) { return b4a.example3.antranorgoruslistele.remoteMe.runUserSub(false, "antranorgoruslistele","htmlgosterdb");}
 BA.debugLineNum = 83;BA.debugLine="Sub HTMLGosterDB";
Debug.ShouldStop(262144);
 BA.debugLineNum = 85;BA.debugLine="WebView1.LoadHtml(DBUtils.ExecuteHtml(Main.sql,\"S";
Debug.ShouldStop(1048576);
antranorgoruslistele.mostCurrent._webview1.runVoidMethod ("LoadHtml",(Object)(antranorgoruslistele.mostCurrent._dbutils.runMethod(true,"_executehtml" /*RemoteObject*/ ,antranorgoruslistele.mostCurrent.activityBA,(Object)(antranorgoruslistele.mostCurrent._main._sql /*RemoteObject*/ ),(Object)(BA.ObjectToString("SELECT denek_tc As [Denek TC], denek_isim As [Denek İSİM], antranorGorüsleri_tarih As [TARİH],antranorGorüsleri_saat  As [SAAT], antranorGorüsleri_aciklama As [ANTRANOR GÖRÜŞLERİ AÇIKLAMA] FROM AntranorGorusleri,Denek WHERE AntranorGorusleri.denek_id = Denek.denek_id ORDER BY antranorGorüsleri_id DESC")),(Object)((antranorgoruslistele.mostCurrent.__c.getField(false,"Null"))),(Object)(BA.numberCast(int.class, -(double) (0 + 1))),(Object)(antranorgoruslistele.mostCurrent.__c.getField(true,"False")))));
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
public static RemoteObject  _labelcarpi_click() throws Exception{
try {
		Debug.PushSubsStack("LabelCarpi_Click (antranorgoruslistele) ","antranorgoruslistele",2,antranorgoruslistele.mostCurrent.activityBA,antranorgoruslistele.mostCurrent,130);
if (RapidSub.canDelegate("labelcarpi_click")) { return b4a.example3.antranorgoruslistele.remoteMe.runUserSub(false, "antranorgoruslistele","labelcarpi_click");}
 BA.debugLineNum = 130;BA.debugLine="Sub LabelCarpi_Click";
Debug.ShouldStop(2);
 BA.debugLineNum = 131;BA.debugLine="EditTextAra.SelectAll";
Debug.ShouldStop(4);
antranorgoruslistele.mostCurrent._edittextara.runVoidMethod ("SelectAll");
 BA.debugLineNum = 132;BA.debugLine="EditTextAra.Text = \"\"";
Debug.ShouldStop(8);
antranorgoruslistele.mostCurrent._edittextara.runMethodAndSync(true,"setText",BA.ObjectToCharSequence(""));
 BA.debugLineNum = 133;BA.debugLine="HTMLGosterDB";
Debug.ShouldStop(16);
_htmlgosterdb();
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
public static RemoteObject  _process_globals() throws Exception{
 //BA.debugLineNum = 6;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 10;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
}