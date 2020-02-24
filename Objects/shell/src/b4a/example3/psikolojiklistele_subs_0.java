package b4a.example3;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class psikolojiklistele_subs_0 {


public static RemoteObject  _activity_create(RemoteObject _firsttime) throws Exception{
try {
		Debug.PushSubsStack("Activity_Create (psikolojiklistele) ","psikolojiklistele",37,psikolojiklistele.mostCurrent.activityBA,psikolojiklistele.mostCurrent,32);
if (RapidSub.canDelegate("activity_create")) { return b4a.example3.psikolojiklistele.remoteMe.runUserSub(false, "psikolojiklistele","activity_create", _firsttime);}
Debug.locals.put("FirstTime", _firsttime);
 BA.debugLineNum = 32;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
Debug.ShouldStop(-2147483648);
 BA.debugLineNum = 34;BA.debugLine="Activity.LoadLayout(\"PsikolojikListelePage\")";
Debug.ShouldStop(2);
psikolojiklistele.mostCurrent._activity.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("PsikolojikListelePage")),psikolojiklistele.mostCurrent.activityBA);
 BA.debugLineNum = 35;BA.debugLine="LabelCarpi.Visible = False";
Debug.ShouldStop(4);
psikolojiklistele.mostCurrent._labelcarpi.runMethod(true,"setVisible",psikolojiklistele.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 37;BA.debugLine="ButtonIsim.TextColor = Color.koyuMavi";
Debug.ShouldStop(16);
psikolojiklistele.mostCurrent._buttonisim.runMethod(true,"setTextColor",psikolojiklistele.mostCurrent._color._koyumavi /*RemoteObject*/ );
 BA.debugLineNum = 38;BA.debugLine="ButtonIsim.Typeface = Typeface.DEFAULT_BOLD";
Debug.ShouldStop(32);
psikolojiklistele.mostCurrent._buttonisim.runMethod(false,"setTypeface",psikolojiklistele.mostCurrent.__c.getField(false,"Typeface").getField(false,"DEFAULT_BOLD"));
 BA.debugLineNum = 39;BA.debugLine="ButtonIsim.Text = \"İSİM\"";
Debug.ShouldStop(64);
psikolojiklistele.mostCurrent._buttonisim.runMethod(true,"setText",BA.ObjectToCharSequence("İSİM"));
 BA.debugLineNum = 40;BA.debugLine="ButtonIsim.TextSize = 14";
Debug.ShouldStop(128);
psikolojiklistele.mostCurrent._buttonisim.runMethod(true,"setTextSize",BA.numberCast(float.class, 14));
 BA.debugLineNum = 41;BA.debugLine="ButtonIsim.SingleLine  = True";
Debug.ShouldStop(256);
psikolojiklistele.mostCurrent._buttonisim.runVoidMethod ("setSingleLine",psikolojiklistele.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 43;BA.debugLine="ButtonTc.TextColor = Color.koyuMavi";
Debug.ShouldStop(1024);
psikolojiklistele.mostCurrent._buttontc.runMethod(true,"setTextColor",psikolojiklistele.mostCurrent._color._koyumavi /*RemoteObject*/ );
 BA.debugLineNum = 44;BA.debugLine="ButtonTc.Typeface = Typeface.DEFAULT_BOLD";
Debug.ShouldStop(2048);
psikolojiklistele.mostCurrent._buttontc.runMethod(false,"setTypeface",psikolojiklistele.mostCurrent.__c.getField(false,"Typeface").getField(false,"DEFAULT_BOLD"));
 BA.debugLineNum = 45;BA.debugLine="ButtonTc.Text = \"TC\"";
Debug.ShouldStop(4096);
psikolojiklistele.mostCurrent._buttontc.runMethod(true,"setText",BA.ObjectToCharSequence("TC"));
 BA.debugLineNum = 46;BA.debugLine="ButtonTc.TextSize = 14";
Debug.ShouldStop(8192);
psikolojiklistele.mostCurrent._buttontc.runMethod(true,"setTextSize",BA.numberCast(float.class, 14));
 BA.debugLineNum = 47;BA.debugLine="ButtonTc.SingleLine = True";
Debug.ShouldStop(16384);
psikolojiklistele.mostCurrent._buttontc.runVoidMethod ("setSingleLine",psikolojiklistele.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 49;BA.debugLine="ButtonPsikolojikAciklama.TextColor = Color.koyuMa";
Debug.ShouldStop(65536);
psikolojiklistele.mostCurrent._buttonpsikolojikaciklama.runMethod(true,"setTextColor",psikolojiklistele.mostCurrent._color._koyumavi /*RemoteObject*/ );
 BA.debugLineNum = 50;BA.debugLine="ButtonPsikolojikAciklama.Typeface = Typeface.DEFA";
Debug.ShouldStop(131072);
psikolojiklistele.mostCurrent._buttonpsikolojikaciklama.runMethod(false,"setTypeface",psikolojiklistele.mostCurrent.__c.getField(false,"Typeface").getField(false,"DEFAULT_BOLD"));
 BA.debugLineNum = 51;BA.debugLine="ButtonPsikolojikAciklama.TextSize = 14";
Debug.ShouldStop(262144);
psikolojiklistele.mostCurrent._buttonpsikolojikaciklama.runMethod(true,"setTextSize",BA.numberCast(float.class, 14));
 BA.debugLineNum = 52;BA.debugLine="ButtonPsikolojikAciklama.Text = \"PSİKOLOJİK AÇIKL";
Debug.ShouldStop(524288);
psikolojiklistele.mostCurrent._buttonpsikolojikaciklama.runMethod(true,"setText",BA.ObjectToCharSequence("PSİKOLOJİK AÇIKLAMA"));
 BA.debugLineNum = 53;BA.debugLine="ButtonPsikolojikAciklama.SingleLine = True";
Debug.ShouldStop(1048576);
psikolojiklistele.mostCurrent._buttonpsikolojikaciklama.runVoidMethod ("setSingleLine",psikolojiklistele.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 55;BA.debugLine="ButtonTarih.TextColor = Color.koyuMavi";
Debug.ShouldStop(4194304);
psikolojiklistele.mostCurrent._buttontarih.runMethod(true,"setTextColor",psikolojiklistele.mostCurrent._color._koyumavi /*RemoteObject*/ );
 BA.debugLineNum = 56;BA.debugLine="ButtonTarih.Typeface = Typeface.DEFAULT_BOLD";
Debug.ShouldStop(8388608);
psikolojiklistele.mostCurrent._buttontarih.runMethod(false,"setTypeface",psikolojiklistele.mostCurrent.__c.getField(false,"Typeface").getField(false,"DEFAULT_BOLD"));
 BA.debugLineNum = 57;BA.debugLine="ButtonTarih.Text = \"TARİH\"";
Debug.ShouldStop(16777216);
psikolojiklistele.mostCurrent._buttontarih.runMethod(true,"setText",BA.ObjectToCharSequence("TARİH"));
 BA.debugLineNum = 58;BA.debugLine="ButtonTarih.TextSize = 14";
Debug.ShouldStop(33554432);
psikolojiklistele.mostCurrent._buttontarih.runMethod(true,"setTextSize",BA.numberCast(float.class, 14));
 BA.debugLineNum = 59;BA.debugLine="ButtonTarih.SingleLine = True";
Debug.ShouldStop(67108864);
psikolojiklistele.mostCurrent._buttontarih.runVoidMethod ("setSingleLine",psikolojiklistele.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 61;BA.debugLine="WebView1.JavaScriptEnabled = True";
Debug.ShouldStop(268435456);
psikolojiklistele.mostCurrent._webview1.runMethod(true,"setJavaScriptEnabled",psikolojiklistele.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 62;BA.debugLine="WebView1.ZoomEnabled = True";
Debug.ShouldStop(536870912);
psikolojiklistele.mostCurrent._webview1.runMethod(true,"setZoomEnabled",psikolojiklistele.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 64;BA.debugLine="EditTextAra.TextColor = Colors.White";
Debug.ShouldStop(-2147483648);
psikolojiklistele.mostCurrent._edittextara.runMethod(true,"setTextColor",psikolojiklistele.mostCurrent.__c.getField(false,"Colors").getField(true,"White"));
 BA.debugLineNum = 65;BA.debugLine="EditTextAra.Hint = \"Bu alana yazarak aratabilirsi";
Debug.ShouldStop(1);
psikolojiklistele.mostCurrent._edittextara.runMethod(true,"setHint",BA.ObjectToString("Bu alana yazarak aratabilirsiniz.."));
 BA.debugLineNum = 66;BA.debugLine="EditTextAra.HintColor = Color.hintColor";
Debug.ShouldStop(2);
psikolojiklistele.mostCurrent._edittextara.runMethod(true,"setHintColor",psikolojiklistele.mostCurrent._color._hintcolor /*RemoteObject*/ );
 BA.debugLineNum = 67;BA.debugLine="EditTextAra.TextSize = 20";
Debug.ShouldStop(4);
psikolojiklistele.mostCurrent._edittextara.runMethod(true,"setTextSize",BA.numberCast(float.class, 20));
 BA.debugLineNum = 68;BA.debugLine="EditTextAra.Typeface = Typeface.DEFAULT_BOLD";
Debug.ShouldStop(8);
psikolojiklistele.mostCurrent._edittextara.runMethod(false,"setTypeface",psikolojiklistele.mostCurrent.__c.getField(false,"Typeface").getField(false,"DEFAULT_BOLD"));
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
		Debug.PushSubsStack("Activity_Pause (psikolojiklistele) ","psikolojiklistele",37,psikolojiklistele.mostCurrent.activityBA,psikolojiklistele.mostCurrent,79);
if (RapidSub.canDelegate("activity_pause")) { return b4a.example3.psikolojiklistele.remoteMe.runUserSub(false, "psikolojiklistele","activity_pause", _userclosed);}
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
		Debug.PushSubsStack("Activity_Resume (psikolojiklistele) ","psikolojiklistele",37,psikolojiklistele.mostCurrent.activityBA,psikolojiklistele.mostCurrent,75);
if (RapidSub.canDelegate("activity_resume")) { return b4a.example3.psikolojiklistele.remoteMe.runUserSub(false, "psikolojiklistele","activity_resume");}
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
		Debug.PushSubsStack("ButtonAnasayfa_Click (psikolojiklistele) ","psikolojiklistele",37,psikolojiklistele.mostCurrent.activityBA,psikolojiklistele.mostCurrent,126);
if (RapidSub.canDelegate("buttonanasayfa_click")) { return b4a.example3.psikolojiklistele.remoteMe.runUserSub(false, "psikolojiklistele","buttonanasayfa_click");}
 BA.debugLineNum = 126;BA.debugLine="Sub ButtonAnasayfa_Click";
Debug.ShouldStop(536870912);
 BA.debugLineNum = 127;BA.debugLine="StartActivity(AnaMenu)";
Debug.ShouldStop(1073741824);
psikolojiklistele.mostCurrent.__c.runVoidMethod ("StartActivity",psikolojiklistele.processBA,(Object)((psikolojiklistele.mostCurrent._anamenu.getObject())));
 BA.debugLineNum = 128;BA.debugLine="Activity.Finish";
Debug.ShouldStop(-2147483648);
psikolojiklistele.mostCurrent._activity.runVoidMethod ("Finish");
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
public static RemoteObject  _buttonisim_click() throws Exception{
try {
		Debug.PushSubsStack("ButtonIsim_Click (psikolojiklistele) ","psikolojiklistele",37,psikolojiklistele.mostCurrent.activityBA,psikolojiklistele.mostCurrent,97);
if (RapidSub.canDelegate("buttonisim_click")) { return b4a.example3.psikolojiklistele.remoteMe.runUserSub(false, "psikolojiklistele","buttonisim_click");}
 BA.debugLineNum = 97;BA.debugLine="Sub ButtonIsim_Click";
Debug.ShouldStop(1);
 BA.debugLineNum = 98;BA.debugLine="WebView1.LoadHtml(DBUtils.ExecuteHtml(Main.sql, \"";
Debug.ShouldStop(2);
psikolojiklistele.mostCurrent._webview1.runVoidMethod ("LoadHtml",(Object)(psikolojiklistele.mostCurrent._dbutils.runMethod(true,"_executehtml" /*RemoteObject*/ ,psikolojiklistele.mostCurrent.activityBA,(Object)(psikolojiklistele.mostCurrent._main._sql /*RemoteObject*/ ),(Object)(RemoteObject.concat(RemoteObject.createImmutable("SELECT  denek_isim As [DENEK İSİM], denek_tc As [Denek TC] FROM Psikolojik, Denek WHERE  Psikolojik.denek_id = Denek.denek_id AND denek_isim LIKE '%"),psikolojiklistele.mostCurrent._edittextara.runMethod(true,"getText"),RemoteObject.createImmutable("%' ORDER BY psikolojik_id DESC "))),(Object)((psikolojiklistele.mostCurrent.__c.getField(false,"Null"))),(Object)(BA.numberCast(int.class, -(double) (0 + 1))),(Object)(psikolojiklistele.mostCurrent.__c.getField(true,"False")))));
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
public static RemoteObject  _buttonpsikolojikaciklama_click() throws Exception{
try {
		Debug.PushSubsStack("ButtonPsikolojikAciklama_Click (psikolojiklistele) ","psikolojiklistele",37,psikolojiklistele.mostCurrent.activityBA,psikolojiklistele.mostCurrent,105);
if (RapidSub.canDelegate("buttonpsikolojikaciklama_click")) { return b4a.example3.psikolojiklistele.remoteMe.runUserSub(false, "psikolojiklistele","buttonpsikolojikaciklama_click");}
 BA.debugLineNum = 105;BA.debugLine="Sub ButtonPsikolojikAciklama_Click";
Debug.ShouldStop(256);
 BA.debugLineNum = 106;BA.debugLine="WebView1.LoadHtml(DBUtils.ExecuteHtml(Main.sql, \"";
Debug.ShouldStop(512);
psikolojiklistele.mostCurrent._webview1.runVoidMethod ("LoadHtml",(Object)(psikolojiklistele.mostCurrent._dbutils.runMethod(true,"_executehtml" /*RemoteObject*/ ,psikolojiklistele.mostCurrent.activityBA,(Object)(psikolojiklistele.mostCurrent._main._sql /*RemoteObject*/ ),(Object)(RemoteObject.concat(RemoteObject.createImmutable("SELECT denek_tc As [Denek TC], denek_isim As [DENEK İSİM], psikolojik_aciklama  As [PSİKOLOJİK AÇIKLAMA] FROM Psikolojik,Denek WHERE  Psikolojik.denek_id = Denek.denek_id AND psikolojik_aciklama  LIKE '%"),psikolojiklistele.mostCurrent._edittextara.runMethod(true,"getText"),RemoteObject.createImmutable("%' ORDER BY psikolojik_id DESC "))),(Object)((psikolojiklistele.mostCurrent.__c.getField(false,"Null"))),(Object)(BA.numberCast(int.class, -(double) (0 + 1))),(Object)(psikolojiklistele.mostCurrent.__c.getField(true,"False")))));
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
public static RemoteObject  _buttonpsikolojikekle_click() throws Exception{
try {
		Debug.PushSubsStack("ButtonPsikolojikEkle_Click (psikolojiklistele) ","psikolojiklistele",37,psikolojiklistele.mostCurrent.activityBA,psikolojiklistele.mostCurrent,120);
if (RapidSub.canDelegate("buttonpsikolojikekle_click")) { return b4a.example3.psikolojiklistele.remoteMe.runUserSub(false, "psikolojiklistele","buttonpsikolojikekle_click");}
 BA.debugLineNum = 120;BA.debugLine="Sub ButtonPsikolojikEkle_Click";
Debug.ShouldStop(8388608);
 BA.debugLineNum = 121;BA.debugLine="Main.Status = \"S\"";
Debug.ShouldStop(16777216);
psikolojiklistele.mostCurrent._main._status /*RemoteObject*/  = BA.ObjectToString("S");
 BA.debugLineNum = 122;BA.debugLine="StartActivity(TestDenekAra)";
Debug.ShouldStop(33554432);
psikolojiklistele.mostCurrent.__c.runVoidMethod ("StartActivity",psikolojiklistele.processBA,(Object)((psikolojiklistele.mostCurrent._testdenekara.getObject())));
 BA.debugLineNum = 123;BA.debugLine="Activity.Finish";
Debug.ShouldStop(67108864);
psikolojiklistele.mostCurrent._activity.runVoidMethod ("Finish");
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
public static RemoteObject  _buttonpsikolojiksil_click() throws Exception{
try {
		Debug.PushSubsStack("ButtonPsikolojikSil_Click (psikolojiklistele) ","psikolojiklistele",37,psikolojiklistele.mostCurrent.activityBA,psikolojiklistele.mostCurrent,115);
if (RapidSub.canDelegate("buttonpsikolojiksil_click")) { return b4a.example3.psikolojiklistele.remoteMe.runUserSub(false, "psikolojiklistele","buttonpsikolojiksil_click");}
 BA.debugLineNum = 115;BA.debugLine="Sub ButtonPsikolojikSil_Click";
Debug.ShouldStop(262144);
 BA.debugLineNum = 116;BA.debugLine="StartActivity(PsikolojikSil)";
Debug.ShouldStop(524288);
psikolojiklistele.mostCurrent.__c.runVoidMethod ("StartActivity",psikolojiklistele.processBA,(Object)((psikolojiklistele.mostCurrent._psikolojiksil.getObject())));
 BA.debugLineNum = 117;BA.debugLine="Activity.Finish";
Debug.ShouldStop(1048576);
psikolojiklistele.mostCurrent._activity.runVoidMethod ("Finish");
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
public static RemoteObject  _buttontarih_click() throws Exception{
try {
		Debug.PushSubsStack("ButtonTarih_Click (psikolojiklistele) ","psikolojiklistele",37,psikolojiklistele.mostCurrent.activityBA,psikolojiklistele.mostCurrent,109);
if (RapidSub.canDelegate("buttontarih_click")) { return b4a.example3.psikolojiklistele.remoteMe.runUserSub(false, "psikolojiklistele","buttontarih_click");}
 BA.debugLineNum = 109;BA.debugLine="Sub ButtonTarih_Click";
Debug.ShouldStop(4096);
 BA.debugLineNum = 110;BA.debugLine="WebView1.LoadHtml(DBUtils.ExecuteHtml(Main.sql, \"";
Debug.ShouldStop(8192);
psikolojiklistele.mostCurrent._webview1.runVoidMethod ("LoadHtml",(Object)(psikolojiklistele.mostCurrent._dbutils.runMethod(true,"_executehtml" /*RemoteObject*/ ,psikolojiklistele.mostCurrent.activityBA,(Object)(psikolojiklistele.mostCurrent._main._sql /*RemoteObject*/ ),(Object)(RemoteObject.concat(RemoteObject.createImmutable("SELECT denek_tc As [Denek TC], denek_isim As [DENEK İSİM], psikolojik_tarih As [TARİH], psikolojik_saat As [SAAT] FROM Psikolojik,Denek WHERE  Psikolojik.denek_id = Denek.denek_id AND psikolojik_tarih LIKE '%"),psikolojiklistele.mostCurrent._edittextara.runMethod(true,"getText"),RemoteObject.createImmutable("%' ORDER BY psikolojik_id DESC "))),(Object)((psikolojiklistele.mostCurrent.__c.getField(false,"Null"))),(Object)(BA.numberCast(int.class, -(double) (0 + 1))),(Object)(psikolojiklistele.mostCurrent.__c.getField(true,"False")))));
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
		Debug.PushSubsStack("ButtonTc_Click (psikolojiklistele) ","psikolojiklistele",37,psikolojiklistele.mostCurrent.activityBA,psikolojiklistele.mostCurrent,101);
if (RapidSub.canDelegate("buttontc_click")) { return b4a.example3.psikolojiklistele.remoteMe.runUserSub(false, "psikolojiklistele","buttontc_click");}
 BA.debugLineNum = 101;BA.debugLine="Sub ButtonTc_Click";
Debug.ShouldStop(16);
 BA.debugLineNum = 102;BA.debugLine="WebView1.LoadHtml(DBUtils.ExecuteHtml(Main.sql, \"";
Debug.ShouldStop(32);
psikolojiklistele.mostCurrent._webview1.runVoidMethod ("LoadHtml",(Object)(psikolojiklistele.mostCurrent._dbutils.runMethod(true,"_executehtml" /*RemoteObject*/ ,psikolojiklistele.mostCurrent.activityBA,(Object)(psikolojiklistele.mostCurrent._main._sql /*RemoteObject*/ ),(Object)(RemoteObject.concat(RemoteObject.createImmutable("SELECT denek_tc As [Denek TC],denek_isim As [DENEK İSİM] FROM Psikolojik,Denek WHERE  Psikolojik.denek_id = Denek.denek_id AND denek_tc LIKE '%"),psikolojiklistele.mostCurrent._edittextara.runMethod(true,"getText"),RemoteObject.createImmutable("%' ORDER BY psikolojik_id DESC "))),(Object)((psikolojiklistele.mostCurrent.__c.getField(false,"Null"))),(Object)(BA.numberCast(int.class, -(double) (0 + 1))),(Object)(psikolojiklistele.mostCurrent.__c.getField(true,"False")))));
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
		Debug.PushSubsStack("EditTextAra_TextChanged (psikolojiklistele) ","psikolojiklistele",37,psikolojiklistele.mostCurrent.activityBA,psikolojiklistele.mostCurrent,88);
if (RapidSub.canDelegate("edittextara_textchanged")) { return b4a.example3.psikolojiklistele.remoteMe.runUserSub(false, "psikolojiklistele","edittextara_textchanged", _old, _new);}
Debug.locals.put("Old", _old);
Debug.locals.put("New", _new);
 BA.debugLineNum = 88;BA.debugLine="Sub EditTextAra_TextChanged (Old As String, New As";
Debug.ShouldStop(8388608);
 BA.debugLineNum = 89;BA.debugLine="LabelCarpi.Visible = True";
Debug.ShouldStop(16777216);
psikolojiklistele.mostCurrent._labelcarpi.runMethod(true,"setVisible",psikolojiklistele.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 90;BA.debugLine="WebView1.LoadHtml(DBUtils.ExecuteHtml(Main.sql, \"";
Debug.ShouldStop(33554432);
psikolojiklistele.mostCurrent._webview1.runVoidMethod ("LoadHtml",(Object)(psikolojiklistele.mostCurrent._dbutils.runMethod(true,"_executehtml" /*RemoteObject*/ ,psikolojiklistele.mostCurrent.activityBA,(Object)(psikolojiklistele.mostCurrent._main._sql /*RemoteObject*/ ),(Object)(RemoteObject.concat(RemoteObject.createImmutable("SELECT  denek_tc As [Denek TC], denek_isim As [DENEK İSİM] ,psikolojik_tarih As [TARİH], psikolojik_aciklama As [PSİKOLOJİK AÇIKLAMA] FROM Psikolojik,Denek WHERE Psikolojik.denek_id = Denek.denek_id AND (denek_tc LIKE '%"),psikolojiklistele.mostCurrent._edittextara.runMethod(true,"getText"),RemoteObject.createImmutable("%' OR denek_isim LIKE '%"),psikolojiklistele.mostCurrent._edittextara.runMethod(true,"getText"),RemoteObject.createImmutable("%' OR psikolojik_tarih LIKE '%"),psikolojiklistele.mostCurrent._edittextara.runMethod(true,"getText"),RemoteObject.createImmutable("%' OR psikolojik_aciklama LIKE '%"),psikolojiklistele.mostCurrent._edittextara.runMethod(true,"getText"),RemoteObject.createImmutable("%' ) ORDER BY psikolojik_id DESC"))),(Object)((psikolojiklistele.mostCurrent.__c.getField(false,"Null"))),(Object)(BA.numberCast(int.class, -(double) (0 + 1))),(Object)(psikolojiklistele.mostCurrent.__c.getField(true,"False")))));
 BA.debugLineNum = 91;BA.debugLine="If EditTextAra.Text = \"\" Then";
Debug.ShouldStop(67108864);
if (RemoteObject.solveBoolean("=",psikolojiklistele.mostCurrent._edittextara.runMethod(true,"getText"),BA.ObjectToString(""))) { 
 BA.debugLineNum = 92;BA.debugLine="LabelCarpi.Visible = False";
Debug.ShouldStop(134217728);
psikolojiklistele.mostCurrent._labelcarpi.runMethod(true,"setVisible",psikolojiklistele.mostCurrent.__c.getField(true,"False"));
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
psikolojiklistele.mostCurrent._edittextara = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
 //BA.debugLineNum = 17;BA.debugLine="Private WebView1 As WebView";
psikolojiklistele.mostCurrent._webview1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.WebViewWrapper");
 //BA.debugLineNum = 19;BA.debugLine="Private ButtonPsikolojikEkle As Button";
psikolojiklistele.mostCurrent._buttonpsikolojikekle = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 20;BA.debugLine="Private ButtonPsikolojikSil As Button";
psikolojiklistele.mostCurrent._buttonpsikolojiksil = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 22;BA.debugLine="Private Label1 As Label";
psikolojiklistele.mostCurrent._label1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 24;BA.debugLine="Private ButtonIsim As Button";
psikolojiklistele.mostCurrent._buttonisim = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 25;BA.debugLine="Private ButtonTc As Button";
psikolojiklistele.mostCurrent._buttontc = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 26;BA.debugLine="Private ButtonPsikolojikAciklama As Button";
psikolojiklistele.mostCurrent._buttonpsikolojikaciklama = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 27;BA.debugLine="Private ButtonTarih As Button";
psikolojiklistele.mostCurrent._buttontarih = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 28;BA.debugLine="Private LabelCarpi As Label";
psikolojiklistele.mostCurrent._labelcarpi = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 29;BA.debugLine="Private ButtonAnasayfa As Button";
psikolojiklistele.mostCurrent._buttonanasayfa = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 30;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _htmlgosterdb() throws Exception{
try {
		Debug.PushSubsStack("HTMLGosterDB (psikolojiklistele) ","psikolojiklistele",37,psikolojiklistele.mostCurrent.activityBA,psikolojiklistele.mostCurrent,83);
if (RapidSub.canDelegate("htmlgosterdb")) { return b4a.example3.psikolojiklistele.remoteMe.runUserSub(false, "psikolojiklistele","htmlgosterdb");}
 BA.debugLineNum = 83;BA.debugLine="Sub HTMLGosterDB";
Debug.ShouldStop(262144);
 BA.debugLineNum = 85;BA.debugLine="WebView1.LoadHtml(DBUtils.ExecuteHtml(Main.sql,\"S";
Debug.ShouldStop(1048576);
psikolojiklistele.mostCurrent._webview1.runVoidMethod ("LoadHtml",(Object)(psikolojiklistele.mostCurrent._dbutils.runMethod(true,"_executehtml" /*RemoteObject*/ ,psikolojiklistele.mostCurrent.activityBA,(Object)(psikolojiklistele.mostCurrent._main._sql /*RemoteObject*/ ),(Object)(BA.ObjectToString("SELECT denek_tc As [Denek TC], denek_isim As [Denek İSİM], psikolojik_tarih  As [TARİH] ,psikolojik_saat  As [SAAT], psikolojik_aciklama As [PSİKOLOJİK AÇIKLAMA] FROM Psikolojik,Denek WHERE Psikolojik.denek_id = Denek.denek_id ORDER BY psikolojik_id DESC ")),(Object)((psikolojiklistele.mostCurrent.__c.getField(false,"Null"))),(Object)(BA.numberCast(int.class, -(double) (0 + 1))),(Object)(psikolojiklistele.mostCurrent.__c.getField(true,"False")))));
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
		Debug.PushSubsStack("LabelCarpi_Click (psikolojiklistele) ","psikolojiklistele",37,psikolojiklistele.mostCurrent.activityBA,psikolojiklistele.mostCurrent,130);
if (RapidSub.canDelegate("labelcarpi_click")) { return b4a.example3.psikolojiklistele.remoteMe.runUserSub(false, "psikolojiklistele","labelcarpi_click");}
 BA.debugLineNum = 130;BA.debugLine="Sub LabelCarpi_Click";
Debug.ShouldStop(2);
 BA.debugLineNum = 131;BA.debugLine="EditTextAra.SelectAll";
Debug.ShouldStop(4);
psikolojiklistele.mostCurrent._edittextara.runVoidMethod ("SelectAll");
 BA.debugLineNum = 132;BA.debugLine="EditTextAra.Text = \"\"";
Debug.ShouldStop(8);
psikolojiklistele.mostCurrent._edittextara.runMethodAndSync(true,"setText",BA.ObjectToCharSequence(""));
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