package b4a.example3;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class biyokimyasallistele_subs_0 {


public static RemoteObject  _activity_create(RemoteObject _firsttime) throws Exception{
try {
		Debug.PushSubsStack("Activity_Create (biyokimyasallistele) ","biyokimyasallistele",34,biyokimyasallistele.mostCurrent.activityBA,biyokimyasallistele.mostCurrent,28);
if (RapidSub.canDelegate("activity_create")) { return b4a.example3.biyokimyasallistele.remoteMe.runUserSub(false, "biyokimyasallistele","activity_create", _firsttime);}
Debug.locals.put("FirstTime", _firsttime);
 BA.debugLineNum = 28;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
Debug.ShouldStop(134217728);
 BA.debugLineNum = 30;BA.debugLine="Activity.LoadLayout(\"BiyokimyasalListelePage\")";
Debug.ShouldStop(536870912);
biyokimyasallistele.mostCurrent._activity.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("BiyokimyasalListelePage")),biyokimyasallistele.mostCurrent.activityBA);
 BA.debugLineNum = 31;BA.debugLine="LabelCarpi.Visible = False";
Debug.ShouldStop(1073741824);
biyokimyasallistele.mostCurrent._labelcarpi.runMethod(true,"setVisible",biyokimyasallistele.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 34;BA.debugLine="EditTextAra.TextColor = Colors.White";
Debug.ShouldStop(2);
biyokimyasallistele.mostCurrent._edittextara.runMethod(true,"setTextColor",biyokimyasallistele.mostCurrent.__c.getField(false,"Colors").getField(true,"White"));
 BA.debugLineNum = 35;BA.debugLine="EditTextAra.Hint = \"Bu alana yazarak aratabilirsi";
Debug.ShouldStop(4);
biyokimyasallistele.mostCurrent._edittextara.runMethod(true,"setHint",BA.ObjectToString("Bu alana yazarak aratabilirsiniz.."));
 BA.debugLineNum = 36;BA.debugLine="EditTextAra.HintColor = Color.hintColor";
Debug.ShouldStop(8);
biyokimyasallistele.mostCurrent._edittextara.runMethod(true,"setHintColor",biyokimyasallistele.mostCurrent._color._hintcolor /*RemoteObject*/ );
 BA.debugLineNum = 37;BA.debugLine="EditTextAra.TextSize = 20";
Debug.ShouldStop(16);
biyokimyasallistele.mostCurrent._edittextara.runMethod(true,"setTextSize",BA.numberCast(float.class, 20));
 BA.debugLineNum = 38;BA.debugLine="EditTextAra.Typeface = Typeface.DEFAULT_BOLD";
Debug.ShouldStop(32);
biyokimyasallistele.mostCurrent._edittextara.runMethod(false,"setTypeface",biyokimyasallistele.mostCurrent.__c.getField(false,"Typeface").getField(false,"DEFAULT_BOLD"));
 BA.debugLineNum = 40;BA.debugLine="ButtonTc.TextColor = Color.koyuMavi";
Debug.ShouldStop(128);
biyokimyasallistele.mostCurrent._buttontc.runMethod(true,"setTextColor",biyokimyasallistele.mostCurrent._color._koyumavi /*RemoteObject*/ );
 BA.debugLineNum = 41;BA.debugLine="ButtonTc.Typeface = Typeface.DEFAULT_BOLD";
Debug.ShouldStop(256);
biyokimyasallistele.mostCurrent._buttontc.runMethod(false,"setTypeface",biyokimyasallistele.mostCurrent.__c.getField(false,"Typeface").getField(false,"DEFAULT_BOLD"));
 BA.debugLineNum = 42;BA.debugLine="ButtonTc.Text = \"TC\"";
Debug.ShouldStop(512);
biyokimyasallistele.mostCurrent._buttontc.runMethod(true,"setText",BA.ObjectToCharSequence("TC"));
 BA.debugLineNum = 43;BA.debugLine="ButtonTc.TextSize = 14";
Debug.ShouldStop(1024);
biyokimyasallistele.mostCurrent._buttontc.runMethod(true,"setTextSize",BA.numberCast(float.class, 14));
 BA.debugLineNum = 44;BA.debugLine="ButtonTc.SingleLine = True";
Debug.ShouldStop(2048);
biyokimyasallistele.mostCurrent._buttontc.runVoidMethod ("setSingleLine",biyokimyasallistele.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 46;BA.debugLine="ButtonBiyokimyasalAciklama.TextColor = Color.koyu";
Debug.ShouldStop(8192);
biyokimyasallistele.mostCurrent._buttonbiyokimyasalaciklama.runMethod(true,"setTextColor",biyokimyasallistele.mostCurrent._color._koyumavi /*RemoteObject*/ );
 BA.debugLineNum = 47;BA.debugLine="ButtonBiyokimyasalAciklama.Typeface = Typeface.DE";
Debug.ShouldStop(16384);
biyokimyasallistele.mostCurrent._buttonbiyokimyasalaciklama.runMethod(false,"setTypeface",biyokimyasallistele.mostCurrent.__c.getField(false,"Typeface").getField(false,"DEFAULT_BOLD"));
 BA.debugLineNum = 48;BA.debugLine="ButtonBiyokimyasalAciklama.Text = \"BİYOKİMYASAL A";
Debug.ShouldStop(32768);
biyokimyasallistele.mostCurrent._buttonbiyokimyasalaciklama.runMethod(true,"setText",BA.ObjectToCharSequence("BİYOKİMYASAL AÇIKLAMA"));
 BA.debugLineNum = 49;BA.debugLine="ButtonBiyokimyasalAciklama.TextSize = 14";
Debug.ShouldStop(65536);
biyokimyasallistele.mostCurrent._buttonbiyokimyasalaciklama.runMethod(true,"setTextSize",BA.numberCast(float.class, 14));
 BA.debugLineNum = 50;BA.debugLine="ButtonBiyokimyasalAciklama.SingleLine = True";
Debug.ShouldStop(131072);
biyokimyasallistele.mostCurrent._buttonbiyokimyasalaciklama.runVoidMethod ("setSingleLine",biyokimyasallistele.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 52;BA.debugLine="ButtonTarih.TextColor = Color.koyuMavi";
Debug.ShouldStop(524288);
biyokimyasallistele.mostCurrent._buttontarih.runMethod(true,"setTextColor",biyokimyasallistele.mostCurrent._color._koyumavi /*RemoteObject*/ );
 BA.debugLineNum = 53;BA.debugLine="ButtonTarih.Typeface = Typeface.DEFAULT_BOLD";
Debug.ShouldStop(1048576);
biyokimyasallistele.mostCurrent._buttontarih.runMethod(false,"setTypeface",biyokimyasallistele.mostCurrent.__c.getField(false,"Typeface").getField(false,"DEFAULT_BOLD"));
 BA.debugLineNum = 54;BA.debugLine="ButtonTarih.Text = \"TARİH\"";
Debug.ShouldStop(2097152);
biyokimyasallistele.mostCurrent._buttontarih.runMethod(true,"setText",BA.ObjectToCharSequence("TARİH"));
 BA.debugLineNum = 55;BA.debugLine="ButtonTarih.TextSize = 14";
Debug.ShouldStop(4194304);
biyokimyasallistele.mostCurrent._buttontarih.runMethod(true,"setTextSize",BA.numberCast(float.class, 14));
 BA.debugLineNum = 56;BA.debugLine="ButtonTc.SingleLine = True";
Debug.ShouldStop(8388608);
biyokimyasallistele.mostCurrent._buttontc.runVoidMethod ("setSingleLine",biyokimyasallistele.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 58;BA.debugLine="ButtonIsim.TextColor = Color.koyuMavi";
Debug.ShouldStop(33554432);
biyokimyasallistele.mostCurrent._buttonisim.runMethod(true,"setTextColor",biyokimyasallistele.mostCurrent._color._koyumavi /*RemoteObject*/ );
 BA.debugLineNum = 59;BA.debugLine="ButtonIsim.Typeface = Typeface.DEFAULT_BOLD";
Debug.ShouldStop(67108864);
biyokimyasallistele.mostCurrent._buttonisim.runMethod(false,"setTypeface",biyokimyasallistele.mostCurrent.__c.getField(false,"Typeface").getField(false,"DEFAULT_BOLD"));
 BA.debugLineNum = 60;BA.debugLine="ButtonIsim.Text = \"İSİM\"";
Debug.ShouldStop(134217728);
biyokimyasallistele.mostCurrent._buttonisim.runMethod(true,"setText",BA.ObjectToCharSequence("İSİM"));
 BA.debugLineNum = 61;BA.debugLine="ButtonIsim.TextSize = 14";
Debug.ShouldStop(268435456);
biyokimyasallistele.mostCurrent._buttonisim.runMethod(true,"setTextSize",BA.numberCast(float.class, 14));
 BA.debugLineNum = 62;BA.debugLine="ButtonIsim.SingleLine = True";
Debug.ShouldStop(536870912);
biyokimyasallistele.mostCurrent._buttonisim.runVoidMethod ("setSingleLine",biyokimyasallistele.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 64;BA.debugLine="WebView1.JavaScriptEnabled = True";
Debug.ShouldStop(-2147483648);
biyokimyasallistele.mostCurrent._webview1.runMethod(true,"setJavaScriptEnabled",biyokimyasallistele.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 65;BA.debugLine="WebView1.ZoomEnabled = True";
Debug.ShouldStop(1);
biyokimyasallistele.mostCurrent._webview1.runMethod(true,"setZoomEnabled",biyokimyasallistele.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 67;BA.debugLine="HTMLGosterDB";
Debug.ShouldStop(4);
_htmlgosterdb();
 BA.debugLineNum = 68;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("Activity_Pause (biyokimyasallistele) ","biyokimyasallistele",34,biyokimyasallistele.mostCurrent.activityBA,biyokimyasallistele.mostCurrent,74);
if (RapidSub.canDelegate("activity_pause")) { return b4a.example3.biyokimyasallistele.remoteMe.runUserSub(false, "biyokimyasallistele","activity_pause", _userclosed);}
Debug.locals.put("UserClosed", _userclosed);
 BA.debugLineNum = 74;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
Debug.ShouldStop(512);
 BA.debugLineNum = 76;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("Activity_Resume (biyokimyasallistele) ","biyokimyasallistele",34,biyokimyasallistele.mostCurrent.activityBA,biyokimyasallistele.mostCurrent,70);
if (RapidSub.canDelegate("activity_resume")) { return b4a.example3.biyokimyasallistele.remoteMe.runUserSub(false, "biyokimyasallistele","activity_resume");}
 BA.debugLineNum = 70;BA.debugLine="Sub Activity_Resume";
Debug.ShouldStop(32);
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
public static RemoteObject  _buttonanasayfa_click() throws Exception{
try {
		Debug.PushSubsStack("ButtonAnasayfa_Click (biyokimyasallistele) ","biyokimyasallistele",34,biyokimyasallistele.mostCurrent.activityBA,biyokimyasallistele.mostCurrent,121);
if (RapidSub.canDelegate("buttonanasayfa_click")) { return b4a.example3.biyokimyasallistele.remoteMe.runUserSub(false, "biyokimyasallistele","buttonanasayfa_click");}
 BA.debugLineNum = 121;BA.debugLine="Sub ButtonAnasayfa_Click";
Debug.ShouldStop(16777216);
 BA.debugLineNum = 122;BA.debugLine="StartActivity(AnaMenu)";
Debug.ShouldStop(33554432);
biyokimyasallistele.mostCurrent.__c.runVoidMethod ("StartActivity",biyokimyasallistele.processBA,(Object)((biyokimyasallistele.mostCurrent._anamenu.getObject())));
 BA.debugLineNum = 123;BA.debugLine="Activity.Finish";
Debug.ShouldStop(67108864);
biyokimyasallistele.mostCurrent._activity.runVoidMethod ("Finish");
 BA.debugLineNum = 124;BA.debugLine="End Sub";
Debug.ShouldStop(134217728);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _buttonbiyokimyasalaciklama_click() throws Exception{
try {
		Debug.PushSubsStack("ButtonBiyokimyasalAciklama_Click (biyokimyasallistele) ","biyokimyasallistele",34,biyokimyasallistele.mostCurrent.activityBA,biyokimyasallistele.mostCurrent,100);
if (RapidSub.canDelegate("buttonbiyokimyasalaciklama_click")) { return b4a.example3.biyokimyasallistele.remoteMe.runUserSub(false, "biyokimyasallistele","buttonbiyokimyasalaciklama_click");}
 BA.debugLineNum = 100;BA.debugLine="Sub ButtonBiyokimyasalAciklama_Click";
Debug.ShouldStop(8);
 BA.debugLineNum = 101;BA.debugLine="WebView1.LoadHtml(DBUtils.ExecuteHtml(Main.sql, \"";
Debug.ShouldStop(16);
biyokimyasallistele.mostCurrent._webview1.runVoidMethod ("LoadHtml",(Object)(biyokimyasallistele.mostCurrent._dbutils.runMethod(true,"_executehtml" /*RemoteObject*/ ,biyokimyasallistele.mostCurrent.activityBA,(Object)(biyokimyasallistele.mostCurrent._main._sql /*RemoteObject*/ ),(Object)(RemoteObject.concat(RemoteObject.createImmutable("SELECT denek_tc As [Denek TC], denek_isim As [DENEK İSİM], biyokimyasal_aciklama As [BİYOKİMYASAL AÇIKLAMA] FROM Biyokimyasal,Denek WHERE  Biyokimyasal.denek_id = Denek.denek_id AND biyokimyasal_aciklama LIKE '%"),biyokimyasallistele.mostCurrent._edittextara.runMethod(true,"getText"),RemoteObject.createImmutable("%' ORDER BY biyokimyasal_id DESC"))),(Object)((biyokimyasallistele.mostCurrent.__c.getField(false,"Null"))),(Object)(BA.numberCast(int.class, -(double) (0 + 1))),(Object)(biyokimyasallistele.mostCurrent.__c.getField(true,"False")))));
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
public static RemoteObject  _buttonbiyokimyasalekle_click() throws Exception{
try {
		Debug.PushSubsStack("ButtonBiyokimyasalEkle_Click (biyokimyasallistele) ","biyokimyasallistele",34,biyokimyasallistele.mostCurrent.activityBA,biyokimyasallistele.mostCurrent,110);
if (RapidSub.canDelegate("buttonbiyokimyasalekle_click")) { return b4a.example3.biyokimyasallistele.remoteMe.runUserSub(false, "biyokimyasallistele","buttonbiyokimyasalekle_click");}
 BA.debugLineNum = 110;BA.debugLine="Sub ButtonBiyokimyasalEkle_Click";
Debug.ShouldStop(8192);
 BA.debugLineNum = 111;BA.debugLine="Main.Status = \"S\"";
Debug.ShouldStop(16384);
biyokimyasallistele.mostCurrent._main._status /*RemoteObject*/  = BA.ObjectToString("S");
 BA.debugLineNum = 112;BA.debugLine="StartActivity(TestDenekAra)";
Debug.ShouldStop(32768);
biyokimyasallistele.mostCurrent.__c.runVoidMethod ("StartActivity",biyokimyasallistele.processBA,(Object)((biyokimyasallistele.mostCurrent._testdenekara.getObject())));
 BA.debugLineNum = 113;BA.debugLine="Activity.Finish";
Debug.ShouldStop(65536);
biyokimyasallistele.mostCurrent._activity.runVoidMethod ("Finish");
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
public static RemoteObject  _buttonbiyokimyasalsil_click() throws Exception{
try {
		Debug.PushSubsStack("ButtonBiyokimyasalSil_Click (biyokimyasallistele) ","biyokimyasallistele",34,biyokimyasallistele.mostCurrent.activityBA,biyokimyasallistele.mostCurrent,116);
if (RapidSub.canDelegate("buttonbiyokimyasalsil_click")) { return b4a.example3.biyokimyasallistele.remoteMe.runUserSub(false, "biyokimyasallistele","buttonbiyokimyasalsil_click");}
 BA.debugLineNum = 116;BA.debugLine="Sub ButtonBiyokimyasalSil_Click";
Debug.ShouldStop(524288);
 BA.debugLineNum = 117;BA.debugLine="StartActivity(BiyokimyasalSil)";
Debug.ShouldStop(1048576);
biyokimyasallistele.mostCurrent.__c.runVoidMethod ("StartActivity",biyokimyasallistele.processBA,(Object)((biyokimyasallistele.mostCurrent._biyokimyasalsil.getObject())));
 BA.debugLineNum = 118;BA.debugLine="Activity.Finish";
Debug.ShouldStop(2097152);
biyokimyasallistele.mostCurrent._activity.runVoidMethod ("Finish");
 BA.debugLineNum = 119;BA.debugLine="End Sub";
Debug.ShouldStop(4194304);
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
		Debug.PushSubsStack("ButtonIsim_Click (biyokimyasallistele) ","biyokimyasallistele",34,biyokimyasallistele.mostCurrent.activityBA,biyokimyasallistele.mostCurrent,92);
if (RapidSub.canDelegate("buttonisim_click")) { return b4a.example3.biyokimyasallistele.remoteMe.runUserSub(false, "biyokimyasallistele","buttonisim_click");}
 BA.debugLineNum = 92;BA.debugLine="Sub ButtonIsim_Click";
Debug.ShouldStop(134217728);
 BA.debugLineNum = 93;BA.debugLine="WebView1.LoadHtml(DBUtils.ExecuteHtml(Main.sql, \"";
Debug.ShouldStop(268435456);
biyokimyasallistele.mostCurrent._webview1.runVoidMethod ("LoadHtml",(Object)(biyokimyasallistele.mostCurrent._dbutils.runMethod(true,"_executehtml" /*RemoteObject*/ ,biyokimyasallistele.mostCurrent.activityBA,(Object)(biyokimyasallistele.mostCurrent._main._sql /*RemoteObject*/ ),(Object)(RemoteObject.concat(RemoteObject.createImmutable("SELECT denek_isim As [DENEK İSİM], denek_tc As [Denek TC] FROM Biyokimyasal,Denek WHERE  Biyokimyasal.denek_id = Denek.denek_id AND denek_isim LIKE '%"),biyokimyasallistele.mostCurrent._edittextara.runMethod(true,"getText"),RemoteObject.createImmutable("%' ORDER BY biyokimyasal_id DESC "))),(Object)((biyokimyasallistele.mostCurrent.__c.getField(false,"Null"))),(Object)(BA.numberCast(int.class, -(double) (0 + 1))),(Object)(biyokimyasallistele.mostCurrent.__c.getField(true,"False")))));
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
public static RemoteObject  _buttontarih_click() throws Exception{
try {
		Debug.PushSubsStack("ButtonTarih_Click (biyokimyasallistele) ","biyokimyasallistele",34,biyokimyasallistele.mostCurrent.activityBA,biyokimyasallistele.mostCurrent,104);
if (RapidSub.canDelegate("buttontarih_click")) { return b4a.example3.biyokimyasallistele.remoteMe.runUserSub(false, "biyokimyasallistele","buttontarih_click");}
 BA.debugLineNum = 104;BA.debugLine="Sub ButtonTarih_Click";
Debug.ShouldStop(128);
 BA.debugLineNum = 105;BA.debugLine="WebView1.LoadHtml(DBUtils.ExecuteHtml(Main.sql, \"";
Debug.ShouldStop(256);
biyokimyasallistele.mostCurrent._webview1.runVoidMethod ("LoadHtml",(Object)(biyokimyasallistele.mostCurrent._dbutils.runMethod(true,"_executehtml" /*RemoteObject*/ ,biyokimyasallistele.mostCurrent.activityBA,(Object)(biyokimyasallistele.mostCurrent._main._sql /*RemoteObject*/ ),(Object)(RemoteObject.concat(RemoteObject.createImmutable("SELECT denek_tc As [Denek TC], denek_isim As [DENEK İSİM], biyokimyasal_tarih  As [TARİH], biyokimyasal_saat As [SAAT] FROM Biyokimyasal,Denek WHERE  Biyokimyasal.denek_id = Denek.denek_id AND biyokimyasal_tarih LIKE '%"),biyokimyasallistele.mostCurrent._edittextara.runMethod(true,"getText"),RemoteObject.createImmutable("%' ORDER BY biyokimyasal_id DESC"))),(Object)((biyokimyasallistele.mostCurrent.__c.getField(false,"Null"))),(Object)(BA.numberCast(int.class, -(double) (0 + 1))),(Object)(biyokimyasallistele.mostCurrent.__c.getField(true,"False")))));
 BA.debugLineNum = 106;BA.debugLine="End Sub";
Debug.ShouldStop(512);
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
		Debug.PushSubsStack("ButtonTc_Click (biyokimyasallistele) ","biyokimyasallistele",34,biyokimyasallistele.mostCurrent.activityBA,biyokimyasallistele.mostCurrent,96);
if (RapidSub.canDelegate("buttontc_click")) { return b4a.example3.biyokimyasallistele.remoteMe.runUserSub(false, "biyokimyasallistele","buttontc_click");}
 BA.debugLineNum = 96;BA.debugLine="Sub ButtonTc_Click";
Debug.ShouldStop(-2147483648);
 BA.debugLineNum = 97;BA.debugLine="WebView1.LoadHtml(DBUtils.ExecuteHtml(Main.sql, \"";
Debug.ShouldStop(1);
biyokimyasallistele.mostCurrent._webview1.runVoidMethod ("LoadHtml",(Object)(biyokimyasallistele.mostCurrent._dbutils.runMethod(true,"_executehtml" /*RemoteObject*/ ,biyokimyasallistele.mostCurrent.activityBA,(Object)(biyokimyasallistele.mostCurrent._main._sql /*RemoteObject*/ ),(Object)(RemoteObject.concat(RemoteObject.createImmutable("SELECT denek_tc As [Denek TC],denek_isim As [DENEK İSİM] FROM Biyokimyasal,Denek WHERE  Biyokimyasal.denek_id = Denek.denek_id AND denek_tc LIKE '%"),biyokimyasallistele.mostCurrent._edittextara.runMethod(true,"getText"),RemoteObject.createImmutable("%' ORDER BY biyokimyasal_id DESC"))),(Object)((biyokimyasallistele.mostCurrent.__c.getField(false,"Null"))),(Object)(BA.numberCast(int.class, -(double) (0 + 1))),(Object)(biyokimyasallistele.mostCurrent.__c.getField(true,"False")))));
 BA.debugLineNum = 98;BA.debugLine="End Sub";
Debug.ShouldStop(2);
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
		Debug.PushSubsStack("EditTextAra_TextChanged (biyokimyasallistele) ","biyokimyasallistele",34,biyokimyasallistele.mostCurrent.activityBA,biyokimyasallistele.mostCurrent,83);
if (RapidSub.canDelegate("edittextara_textchanged")) { return b4a.example3.biyokimyasallistele.remoteMe.runUserSub(false, "biyokimyasallistele","edittextara_textchanged", _old, _new);}
Debug.locals.put("Old", _old);
Debug.locals.put("New", _new);
 BA.debugLineNum = 83;BA.debugLine="Sub EditTextAra_TextChanged (Old As String, New As";
Debug.ShouldStop(262144);
 BA.debugLineNum = 84;BA.debugLine="LabelCarpi.Visible = True";
Debug.ShouldStop(524288);
biyokimyasallistele.mostCurrent._labelcarpi.runMethod(true,"setVisible",biyokimyasallistele.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 85;BA.debugLine="WebView1.LoadHtml(DBUtils.ExecuteHtml(Main.sql, \"";
Debug.ShouldStop(1048576);
biyokimyasallistele.mostCurrent._webview1.runVoidMethod ("LoadHtml",(Object)(biyokimyasallistele.mostCurrent._dbutils.runMethod(true,"_executehtml" /*RemoteObject*/ ,biyokimyasallistele.mostCurrent.activityBA,(Object)(biyokimyasallistele.mostCurrent._main._sql /*RemoteObject*/ ),(Object)(RemoteObject.concat(RemoteObject.createImmutable("SELECT denek_tc As [Denek TC], denek_isim As [DENEK İSİM] ,biyokimyasal_tarih As [TARİH], biyokimyasal_saat As [SAAT],biyokimyasal_aciklama  As [BİYOKİMYASAL AÇIKLAMA] FROM Biyokimyasal,Denek WHERE Biyokimyasal.denek_id = Denek.denek_id AND (denek_tc LIKE '%"),biyokimyasallistele.mostCurrent._edittextara.runMethod(true,"getText"),RemoteObject.createImmutable("%' OR denek_isim LIKE '%"),biyokimyasallistele.mostCurrent._edittextara.runMethod(true,"getText"),RemoteObject.createImmutable("%' OR biyokimyasal_tarih LIKE '%"),biyokimyasallistele.mostCurrent._edittextara.runMethod(true,"getText"),RemoteObject.createImmutable("%' OR biyokimyasal_aciklama  LIKE '%"),biyokimyasallistele.mostCurrent._edittextara.runMethod(true,"getText"),RemoteObject.createImmutable("%' ) ORDER BY biyokimyasal_id DESC"))),(Object)((biyokimyasallistele.mostCurrent.__c.getField(false,"Null"))),(Object)(BA.numberCast(int.class, -(double) (0 + 1))),(Object)(biyokimyasallistele.mostCurrent.__c.getField(true,"False")))));
 BA.debugLineNum = 86;BA.debugLine="If EditTextAra.Text = \"\" Then";
Debug.ShouldStop(2097152);
if (RemoteObject.solveBoolean("=",biyokimyasallistele.mostCurrent._edittextara.runMethod(true,"getText"),BA.ObjectToString(""))) { 
 BA.debugLineNum = 87;BA.debugLine="LabelCarpi.Visible = False";
Debug.ShouldStop(4194304);
biyokimyasallistele.mostCurrent._labelcarpi.runMethod(true,"setVisible",biyokimyasallistele.mostCurrent.__c.getField(true,"False"));
 };
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
public static RemoteObject  _globals() throws Exception{
 //BA.debugLineNum = 12;BA.debugLine="Sub Globals";
 //BA.debugLineNum = 16;BA.debugLine="Private EditTextAra As EditText";
biyokimyasallistele.mostCurrent._edittextara = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
 //BA.debugLineNum = 17;BA.debugLine="Private ButtonIsim As Button";
biyokimyasallistele.mostCurrent._buttonisim = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 18;BA.debugLine="Private ButtonTc As Button";
biyokimyasallistele.mostCurrent._buttontc = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 19;BA.debugLine="Private ButtonBiyokimyasalAciklama As Button";
biyokimyasallistele.mostCurrent._buttonbiyokimyasalaciklama = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 20;BA.debugLine="Private ButtonTarih As Button";
biyokimyasallistele.mostCurrent._buttontarih = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 21;BA.debugLine="Private WebView1 As WebView";
biyokimyasallistele.mostCurrent._webview1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.WebViewWrapper");
 //BA.debugLineNum = 22;BA.debugLine="Private ButtonBiyokimyasalEkle As Button";
biyokimyasallistele.mostCurrent._buttonbiyokimyasalekle = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 23;BA.debugLine="Private ButtonBiyokimyasalSil As Button";
biyokimyasallistele.mostCurrent._buttonbiyokimyasalsil = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 24;BA.debugLine="Private ButtonAnasayfa As Button";
biyokimyasallistele.mostCurrent._buttonanasayfa = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 25;BA.debugLine="Private LabelCarpi As Label";
biyokimyasallistele.mostCurrent._labelcarpi = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 26;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _htmlgosterdb() throws Exception{
try {
		Debug.PushSubsStack("HTMLGosterDB (biyokimyasallistele) ","biyokimyasallistele",34,biyokimyasallistele.mostCurrent.activityBA,biyokimyasallistele.mostCurrent,78);
if (RapidSub.canDelegate("htmlgosterdb")) { return b4a.example3.biyokimyasallistele.remoteMe.runUserSub(false, "biyokimyasallistele","htmlgosterdb");}
 BA.debugLineNum = 78;BA.debugLine="Sub HTMLGosterDB";
Debug.ShouldStop(8192);
 BA.debugLineNum = 80;BA.debugLine="WebView1.LoadHtml(DBUtils.ExecuteHtml(Main.sql,\"S";
Debug.ShouldStop(32768);
biyokimyasallistele.mostCurrent._webview1.runVoidMethod ("LoadHtml",(Object)(biyokimyasallistele.mostCurrent._dbutils.runMethod(true,"_executehtml" /*RemoteObject*/ ,biyokimyasallistele.mostCurrent.activityBA,(Object)(biyokimyasallistele.mostCurrent._main._sql /*RemoteObject*/ ),(Object)(BA.ObjectToString("SELECT denek_tc As [Denek TC], denek_isim As [Denek İSİM], biyokimyasal_tarih  As [TARİH],biyokimyasal_saat As [SAAT], biyokimyasal_aciklama As [BİYOKİMYASAL AÇIKLAMA] FROM Biyokimyasal,Denek WHERE Biyokimyasal.denek_id = Denek.denek_id ORDER BY biyokimyasal_id DESC ")),(Object)((biyokimyasallistele.mostCurrent.__c.getField(false,"Null"))),(Object)(BA.numberCast(int.class, -(double) (0 + 1))),(Object)(biyokimyasallistele.mostCurrent.__c.getField(true,"False")))));
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
public static RemoteObject  _labelcarpi_click() throws Exception{
try {
		Debug.PushSubsStack("LabelCarpi_Click (biyokimyasallistele) ","biyokimyasallistele",34,biyokimyasallistele.mostCurrent.activityBA,biyokimyasallistele.mostCurrent,126);
if (RapidSub.canDelegate("labelcarpi_click")) { return b4a.example3.biyokimyasallistele.remoteMe.runUserSub(false, "biyokimyasallistele","labelcarpi_click");}
 BA.debugLineNum = 126;BA.debugLine="Sub LabelCarpi_Click";
Debug.ShouldStop(536870912);
 BA.debugLineNum = 127;BA.debugLine="EditTextAra.SelectAll";
Debug.ShouldStop(1073741824);
biyokimyasallistele.mostCurrent._edittextara.runVoidMethod ("SelectAll");
 BA.debugLineNum = 128;BA.debugLine="EditTextAra.Text = \"\"";
Debug.ShouldStop(-2147483648);
biyokimyasallistele.mostCurrent._edittextara.runMethodAndSync(true,"setText",BA.ObjectToCharSequence(""));
 BA.debugLineNum = 129;BA.debugLine="HTMLGosterDB";
Debug.ShouldStop(1);
_htmlgosterdb();
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
public static RemoteObject  _process_globals() throws Exception{
 //BA.debugLineNum = 6;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 10;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
}