package b4a.example3;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class biyokimyasalsil_subs_0 {


public static RemoteObject  _activity_create(RemoteObject _firsttime) throws Exception{
try {
		Debug.PushSubsStack("Activity_Create (biyokimyasalsil) ","biyokimyasalsil",35,biyokimyasalsil.mostCurrent.activityBA,biyokimyasalsil.mostCurrent,37);
if (RapidSub.canDelegate("activity_create")) { return b4a.example3.biyokimyasalsil.remoteMe.runUserSub(false, "biyokimyasalsil","activity_create", _firsttime);}
Debug.locals.put("FirstTime", _firsttime);
 BA.debugLineNum = 37;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
Debug.ShouldStop(16);
 BA.debugLineNum = 39;BA.debugLine="Activity.LoadLayout(\"BiyokimyasalSilPage\")";
Debug.ShouldStop(64);
biyokimyasalsil.mostCurrent._activity.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("BiyokimyasalSilPage")),biyokimyasalsil.mostCurrent.activityBA);
 BA.debugLineNum = 40;BA.debugLine="WebView1.Visible = False";
Debug.ShouldStop(128);
biyokimyasalsil.mostCurrent._webview1.runMethod(true,"setVisible",biyokimyasalsil.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 41;BA.debugLine="LabelCarpi.Visible = False";
Debug.ShouldStop(256);
biyokimyasalsil.mostCurrent._labelcarpi.runMethod(true,"setVisible",biyokimyasalsil.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 44;BA.debugLine="ListView1.TwoLinesAndBitmap.Label.Visible = False";
Debug.ShouldStop(2048);
biyokimyasalsil.mostCurrent._listview1.runMethod(false,"getTwoLinesAndBitmap").getField(false,"Label").runMethod(true,"setVisible",biyokimyasalsil.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 45;BA.debugLine="ListView1.TwoLinesAndBitmap.SecondLabel.TextColor";
Debug.ShouldStop(4096);
biyokimyasalsil.mostCurrent._listview1.runMethod(false,"getTwoLinesAndBitmap").getField(false,"SecondLabel").runMethod(true,"setTextColor",biyokimyasalsil.mostCurrent._color._koyumavi /*RemoteObject*/ );
 BA.debugLineNum = 46;BA.debugLine="ListView1.TwoLinesAndBitmap.SecondLabel.TextSize";
Debug.ShouldStop(8192);
biyokimyasalsil.mostCurrent._listview1.runMethod(false,"getTwoLinesAndBitmap").getField(false,"SecondLabel").runMethod(true,"setTextSize",BA.numberCast(float.class, 20));
 BA.debugLineNum = 47;BA.debugLine="SetDivider(ListView1,Color.acikMavi,3dip)";
Debug.ShouldStop(16384);
_setdivider(biyokimyasalsil.mostCurrent._listview1,biyokimyasalsil.mostCurrent._color._acikmavi /*RemoteObject*/ ,biyokimyasalsil.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 3))));
 BA.debugLineNum = 49;BA.debugLine="EditTextAra.TextColor = Colors.White";
Debug.ShouldStop(65536);
biyokimyasalsil.mostCurrent._edittextara.runMethod(true,"setTextColor",biyokimyasalsil.mostCurrent.__c.getField(false,"Colors").getField(true,"White"));
 BA.debugLineNum = 50;BA.debugLine="EditTextAra.Hint = \"Bu alana yazarak aratabilirsi";
Debug.ShouldStop(131072);
biyokimyasalsil.mostCurrent._edittextara.runMethod(true,"setHint",BA.ObjectToString("Bu alana yazarak aratabilirsiniz.."));
 BA.debugLineNum = 51;BA.debugLine="EditTextAra.HintColor = Color.hintColor";
Debug.ShouldStop(262144);
biyokimyasalsil.mostCurrent._edittextara.runMethod(true,"setHintColor",biyokimyasalsil.mostCurrent._color._hintcolor /*RemoteObject*/ );
 BA.debugLineNum = 52;BA.debugLine="EditTextAra.TextSize = 20";
Debug.ShouldStop(524288);
biyokimyasalsil.mostCurrent._edittextara.runMethod(true,"setTextSize",BA.numberCast(float.class, 20));
 BA.debugLineNum = 53;BA.debugLine="EditTextAra.Typeface = Typeface.DEFAULT_BOLD";
Debug.ShouldStop(1048576);
biyokimyasalsil.mostCurrent._edittextara.runMethod(false,"setTypeface",biyokimyasalsil.mostCurrent.__c.getField(false,"Typeface").getField(false,"DEFAULT_BOLD"));
 BA.debugLineNum = 55;BA.debugLine="WebView1.JavaScriptEnabled = True";
Debug.ShouldStop(4194304);
biyokimyasalsil.mostCurrent._webview1.runMethod(true,"setJavaScriptEnabled",biyokimyasalsil.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 56;BA.debugLine="WebView1.ZoomEnabled = True";
Debug.ShouldStop(8388608);
biyokimyasalsil.mostCurrent._webview1.runMethod(true,"setZoomEnabled",biyokimyasalsil.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 58;BA.debugLine="ButtonTc.TextColor = Color.koyuMavi";
Debug.ShouldStop(33554432);
biyokimyasalsil.mostCurrent._buttontc.runMethod(true,"setTextColor",biyokimyasalsil.mostCurrent._color._koyumavi /*RemoteObject*/ );
 BA.debugLineNum = 59;BA.debugLine="ButtonTc.Typeface = Typeface.DEFAULT_BOLD";
Debug.ShouldStop(67108864);
biyokimyasalsil.mostCurrent._buttontc.runMethod(false,"setTypeface",biyokimyasalsil.mostCurrent.__c.getField(false,"Typeface").getField(false,"DEFAULT_BOLD"));
 BA.debugLineNum = 60;BA.debugLine="ButtonTc.Text = \"TC\"";
Debug.ShouldStop(134217728);
biyokimyasalsil.mostCurrent._buttontc.runMethod(true,"setText",BA.ObjectToCharSequence("TC"));
 BA.debugLineNum = 61;BA.debugLine="ButtonTc.TextSize = 14";
Debug.ShouldStop(268435456);
biyokimyasalsil.mostCurrent._buttontc.runMethod(true,"setTextSize",BA.numberCast(float.class, 14));
 BA.debugLineNum = 62;BA.debugLine="ButtonTc.SingleLine = True";
Debug.ShouldStop(536870912);
biyokimyasalsil.mostCurrent._buttontc.runVoidMethod ("setSingleLine",biyokimyasalsil.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 64;BA.debugLine="ButtonTarih.TextColor = Color.koyuMavi";
Debug.ShouldStop(-2147483648);
biyokimyasalsil.mostCurrent._buttontarih.runMethod(true,"setTextColor",biyokimyasalsil.mostCurrent._color._koyumavi /*RemoteObject*/ );
 BA.debugLineNum = 65;BA.debugLine="ButtonTarih.Typeface = Typeface.DEFAULT_BOLD";
Debug.ShouldStop(1);
biyokimyasalsil.mostCurrent._buttontarih.runMethod(false,"setTypeface",biyokimyasalsil.mostCurrent.__c.getField(false,"Typeface").getField(false,"DEFAULT_BOLD"));
 BA.debugLineNum = 66;BA.debugLine="ButtonTarih.Text = \"TARİH\"";
Debug.ShouldStop(2);
biyokimyasalsil.mostCurrent._buttontarih.runMethod(true,"setText",BA.ObjectToCharSequence("TARİH"));
 BA.debugLineNum = 67;BA.debugLine="ButtonTarih.TextSize = 14";
Debug.ShouldStop(4);
biyokimyasalsil.mostCurrent._buttontarih.runMethod(true,"setTextSize",BA.numberCast(float.class, 14));
 BA.debugLineNum = 68;BA.debugLine="ButtonTc.SingleLine = True";
Debug.ShouldStop(8);
biyokimyasalsil.mostCurrent._buttontc.runVoidMethod ("setSingleLine",biyokimyasalsil.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 70;BA.debugLine="ButtonIsim.TextColor = Color.koyuMavi";
Debug.ShouldStop(32);
biyokimyasalsil.mostCurrent._buttonisim.runMethod(true,"setTextColor",biyokimyasalsil.mostCurrent._color._koyumavi /*RemoteObject*/ );
 BA.debugLineNum = 71;BA.debugLine="ButtonIsim.Typeface = Typeface.DEFAULT_BOLD";
Debug.ShouldStop(64);
biyokimyasalsil.mostCurrent._buttonisim.runMethod(false,"setTypeface",biyokimyasalsil.mostCurrent.__c.getField(false,"Typeface").getField(false,"DEFAULT_BOLD"));
 BA.debugLineNum = 72;BA.debugLine="ButtonIsim.Text = \"İSİM\"";
Debug.ShouldStop(128);
biyokimyasalsil.mostCurrent._buttonisim.runMethod(true,"setText",BA.ObjectToCharSequence("İSİM"));
 BA.debugLineNum = 73;BA.debugLine="ButtonIsim.TextSize = 14";
Debug.ShouldStop(256);
biyokimyasalsil.mostCurrent._buttonisim.runMethod(true,"setTextSize",BA.numberCast(float.class, 14));
 BA.debugLineNum = 74;BA.debugLine="ButtonIsim.SingleLine = True";
Debug.ShouldStop(512);
biyokimyasalsil.mostCurrent._buttonisim.runVoidMethod ("setSingleLine",biyokimyasalsil.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 76;BA.debugLine="ButtonBiyokimyasalAciklama.TextColor = Color.koyu";
Debug.ShouldStop(2048);
biyokimyasalsil.mostCurrent._buttonbiyokimyasalaciklama.runMethod(true,"setTextColor",biyokimyasalsil.mostCurrent._color._koyumavi /*RemoteObject*/ );
 BA.debugLineNum = 77;BA.debugLine="ButtonBiyokimyasalAciklama.Typeface = Typeface.DE";
Debug.ShouldStop(4096);
biyokimyasalsil.mostCurrent._buttonbiyokimyasalaciklama.runMethod(false,"setTypeface",biyokimyasalsil.mostCurrent.__c.getField(false,"Typeface").getField(false,"DEFAULT_BOLD"));
 BA.debugLineNum = 78;BA.debugLine="ButtonBiyokimyasalAciklama.Text = \"BİYOKİMYASAL A";
Debug.ShouldStop(8192);
biyokimyasalsil.mostCurrent._buttonbiyokimyasalaciklama.runMethod(true,"setText",BA.ObjectToCharSequence("BİYOKİMYASAL ANALİZLER"));
 BA.debugLineNum = 79;BA.debugLine="ButtonBiyokimyasalAciklama.TextSize = 14";
Debug.ShouldStop(16384);
biyokimyasalsil.mostCurrent._buttonbiyokimyasalaciklama.runMethod(true,"setTextSize",BA.numberCast(float.class, 14));
 BA.debugLineNum = 80;BA.debugLine="ButtonBiyokimyasalAciklama.SingleLine = True";
Debug.ShouldStop(32768);
biyokimyasalsil.mostCurrent._buttonbiyokimyasalaciklama.runVoidMethod ("setSingleLine",biyokimyasalsil.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 84;BA.debugLine="ListViewGosterDB";
Debug.ShouldStop(524288);
_listviewgosterdb();
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
public static RemoteObject  _activity_pause(RemoteObject _userclosed) throws Exception{
try {
		Debug.PushSubsStack("Activity_Pause (biyokimyasalsil) ","biyokimyasalsil",35,biyokimyasalsil.mostCurrent.activityBA,biyokimyasalsil.mostCurrent,92);
if (RapidSub.canDelegate("activity_pause")) { return b4a.example3.biyokimyasalsil.remoteMe.runUserSub(false, "biyokimyasalsil","activity_pause", _userclosed);}
Debug.locals.put("UserClosed", _userclosed);
 BA.debugLineNum = 92;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
Debug.ShouldStop(134217728);
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
public static RemoteObject  _activity_resume() throws Exception{
try {
		Debug.PushSubsStack("Activity_Resume (biyokimyasalsil) ","biyokimyasalsil",35,biyokimyasalsil.mostCurrent.activityBA,biyokimyasalsil.mostCurrent,88);
if (RapidSub.canDelegate("activity_resume")) { return b4a.example3.biyokimyasalsil.remoteMe.runUserSub(false, "biyokimyasalsil","activity_resume");}
 BA.debugLineNum = 88;BA.debugLine="Sub Activity_Resume";
Debug.ShouldStop(8388608);
 BA.debugLineNum = 90;BA.debugLine="End Sub";
Debug.ShouldStop(33554432);
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
		Debug.PushSubsStack("ButtonAnasayfa_Click (biyokimyasalsil) ","biyokimyasalsil",35,biyokimyasalsil.mostCurrent.activityBA,biyokimyasalsil.mostCurrent,242);
if (RapidSub.canDelegate("buttonanasayfa_click")) { return b4a.example3.biyokimyasalsil.remoteMe.runUserSub(false, "biyokimyasalsil","buttonanasayfa_click");}
 BA.debugLineNum = 242;BA.debugLine="Sub ButtonAnasayfa_Click";
Debug.ShouldStop(131072);
 BA.debugLineNum = 243;BA.debugLine="StartActivity(AnaMenu)";
Debug.ShouldStop(262144);
biyokimyasalsil.mostCurrent.__c.runVoidMethod ("StartActivity",biyokimyasalsil.processBA,(Object)((biyokimyasalsil.mostCurrent._anamenu.getObject())));
 BA.debugLineNum = 244;BA.debugLine="Activity.Finish";
Debug.ShouldStop(524288);
biyokimyasalsil.mostCurrent._activity.runVoidMethod ("Finish");
 BA.debugLineNum = 245;BA.debugLine="End Sub";
Debug.ShouldStop(1048576);
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
		Debug.PushSubsStack("ButtonBiyokimyasalAciklama_Click (biyokimyasalsil) ","biyokimyasalsil",35,biyokimyasalsil.mostCurrent.activityBA,biyokimyasalsil.mostCurrent,182);
if (RapidSub.canDelegate("buttonbiyokimyasalaciklama_click")) { return b4a.example3.biyokimyasalsil.remoteMe.runUserSub(false, "biyokimyasalsil","buttonbiyokimyasalaciklama_click");}
int _i = 0;
 BA.debugLineNum = 182;BA.debugLine="Sub ButtonBiyokimyasalAciklama_Click";
Debug.ShouldStop(2097152);
 BA.debugLineNum = 183;BA.debugLine="WebView1.Visible = False";
Debug.ShouldStop(4194304);
biyokimyasalsil.mostCurrent._webview1.runMethod(true,"setVisible",biyokimyasalsil.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 184;BA.debugLine="ListView1.Clear";
Debug.ShouldStop(8388608);
biyokimyasalsil.mostCurrent._listview1.runVoidMethod ("Clear");
 BA.debugLineNum = 185;BA.debugLine="rs = Main.sql.ExecQuery(\"SELECT * FROM Biyokimyas";
Debug.ShouldStop(16777216);
biyokimyasalsil.mostCurrent._rs.setObject(biyokimyasalsil.mostCurrent._main._sql /*RemoteObject*/ .runMethod(false,"ExecQuery",(Object)(RemoteObject.concat(RemoteObject.createImmutable("SELECT * FROM Biyokimyasal,Denek WHERE Biyokimyasal.denek_id = Denek.denek_id AND biyokimyasal_aciklama  LIKE '%"),biyokimyasalsil.mostCurrent._edittextara.runMethod(true,"getText"),RemoteObject.createImmutable("%' ORDER BY biyokimyasal_id DESC")))));
 BA.debugLineNum = 187;BA.debugLine="For i=0 To rs.RowCount-1";
Debug.ShouldStop(67108864);
{
final int step4 = 1;
final int limit4 = RemoteObject.solve(new RemoteObject[] {biyokimyasalsil.mostCurrent._rs.runMethod(true,"getRowCount"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step4 > 0 && _i <= limit4) || (step4 < 0 && _i >= limit4) ;_i = ((int)(0 + _i + step4))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 188;BA.debugLine="rs.Position = i";
Debug.ShouldStop(134217728);
biyokimyasalsil.mostCurrent._rs.runMethod(true,"setPosition",BA.numberCast(int.class, _i));
 BA.debugLineNum = 189;BA.debugLine="VeriAl";
Debug.ShouldStop(268435456);
_verial();
 BA.debugLineNum = 190;BA.debugLine="ListView1.AddTwoLinesAndBitmap(id,$\"TC: ${tc} //";
Debug.ShouldStop(536870912);
biyokimyasalsil.mostCurrent._listview1.runVoidMethod ("AddTwoLinesAndBitmap",(Object)(BA.ObjectToCharSequence(biyokimyasalsil._id)),(Object)(BA.ObjectToCharSequence((RemoteObject.concat(RemoteObject.createImmutable("TC: "),biyokimyasalsil.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((biyokimyasalsil.mostCurrent._tc))),RemoteObject.createImmutable(" // Ad Soyad: "),biyokimyasalsil.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((biyokimyasalsil.mostCurrent._isim))),RemoteObject.createImmutable(" // Tarih: "),biyokimyasalsil.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((biyokimyasalsil.mostCurrent._tarih))),RemoteObject.createImmutable(" // Saat: "),biyokimyasalsil.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((biyokimyasalsil.mostCurrent._saat))),RemoteObject.createImmutable(" // Açıklama: "),biyokimyasalsil.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((biyokimyasalsil.mostCurrent._aciklama))),RemoteObject.createImmutable(""))))),(Object)((biyokimyasalsil.mostCurrent._bmp.getObject())));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 192;BA.debugLine="rs.Close";
Debug.ShouldStop(-2147483648);
biyokimyasalsil.mostCurrent._rs.runVoidMethod ("Close");
 BA.debugLineNum = 193;BA.debugLine="End Sub";
Debug.ShouldStop(1);
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
		Debug.PushSubsStack("ButtonBiyokimyasalEkle_Click (biyokimyasalsil) ","biyokimyasalsil",35,biyokimyasalsil.mostCurrent.activityBA,biyokimyasalsil.mostCurrent,197);
if (RapidSub.canDelegate("buttonbiyokimyasalekle_click")) { return b4a.example3.biyokimyasalsil.remoteMe.runUserSub(false, "biyokimyasalsil","buttonbiyokimyasalekle_click");}
 BA.debugLineNum = 197;BA.debugLine="Sub ButtonBiyokimyasalEkle_Click";
Debug.ShouldStop(16);
 BA.debugLineNum = 198;BA.debugLine="WebView1.Visible = False";
Debug.ShouldStop(32);
biyokimyasalsil.mostCurrent._webview1.runMethod(true,"setVisible",biyokimyasalsil.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 199;BA.debugLine="StartActivity(BiyokimyasalEkle)";
Debug.ShouldStop(64);
biyokimyasalsil.mostCurrent.__c.runVoidMethod ("StartActivity",biyokimyasalsil.processBA,(Object)((biyokimyasalsil.mostCurrent._biyokimyasalekle.getObject())));
 BA.debugLineNum = 200;BA.debugLine="Activity.Finish";
Debug.ShouldStop(128);
biyokimyasalsil.mostCurrent._activity.runVoidMethod ("Finish");
 BA.debugLineNum = 201;BA.debugLine="End Sub";
Debug.ShouldStop(256);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _buttonbiyokimyasaltabloveri_click() throws Exception{
try {
		Debug.PushSubsStack("ButtonBiyokimyasalTabloVeri_Click (biyokimyasalsil) ","biyokimyasalsil",35,biyokimyasalsil.mostCurrent.activityBA,biyokimyasalsil.mostCurrent,203);
if (RapidSub.canDelegate("buttonbiyokimyasaltabloveri_click")) { return b4a.example3.biyokimyasalsil.remoteMe.runUserSub(false, "biyokimyasalsil","buttonbiyokimyasaltabloveri_click");}
 BA.debugLineNum = 203;BA.debugLine="Sub ButtonBiyokimyasalTabloVeri_Click";
Debug.ShouldStop(1024);
 BA.debugLineNum = 204;BA.debugLine="WebView1.Visible = False";
Debug.ShouldStop(2048);
biyokimyasalsil.mostCurrent._webview1.runMethod(true,"setVisible",biyokimyasalsil.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 205;BA.debugLine="StartActivity(BiyokimyasalListele)";
Debug.ShouldStop(4096);
biyokimyasalsil.mostCurrent.__c.runVoidMethod ("StartActivity",biyokimyasalsil.processBA,(Object)((biyokimyasalsil.mostCurrent._biyokimyasallistele.getObject())));
 BA.debugLineNum = 206;BA.debugLine="Activity.Finish";
Debug.ShouldStop(8192);
biyokimyasalsil.mostCurrent._activity.runVoidMethod ("Finish");
 BA.debugLineNum = 207;BA.debugLine="End Sub";
Debug.ShouldStop(16384);
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
		Debug.PushSubsStack("ButtonIsim_Click (biyokimyasalsil) ","biyokimyasalsil",35,biyokimyasalsil.mostCurrent.activityBA,biyokimyasalsil.mostCurrent,143);
if (RapidSub.canDelegate("buttonisim_click")) { return b4a.example3.biyokimyasalsil.remoteMe.runUserSub(false, "biyokimyasalsil","buttonisim_click");}
int _i = 0;
 BA.debugLineNum = 143;BA.debugLine="Sub ButtonIsim_Click";
Debug.ShouldStop(16384);
 BA.debugLineNum = 144;BA.debugLine="WebView1.Visible = False";
Debug.ShouldStop(32768);
biyokimyasalsil.mostCurrent._webview1.runMethod(true,"setVisible",biyokimyasalsil.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 145;BA.debugLine="ListView1.Clear";
Debug.ShouldStop(65536);
biyokimyasalsil.mostCurrent._listview1.runVoidMethod ("Clear");
 BA.debugLineNum = 146;BA.debugLine="rs = Main.sql.ExecQuery(\"SELECT * FROM Biyokimyas";
Debug.ShouldStop(131072);
biyokimyasalsil.mostCurrent._rs.setObject(biyokimyasalsil.mostCurrent._main._sql /*RemoteObject*/ .runMethod(false,"ExecQuery",(Object)(RemoteObject.concat(RemoteObject.createImmutable("SELECT * FROM Biyokimyasal,Denek WHERE Biyokimyasal.denek_id = Denek.denek_id AND denek_isim LIKE '%"),biyokimyasalsil.mostCurrent._edittextara.runMethod(true,"getText"),RemoteObject.createImmutable("%' ORDER BY biyokimyasal_id DESC")))));
 BA.debugLineNum = 148;BA.debugLine="For i=0 To rs.RowCount-1";
Debug.ShouldStop(524288);
{
final int step4 = 1;
final int limit4 = RemoteObject.solve(new RemoteObject[] {biyokimyasalsil.mostCurrent._rs.runMethod(true,"getRowCount"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step4 > 0 && _i <= limit4) || (step4 < 0 && _i >= limit4) ;_i = ((int)(0 + _i + step4))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 149;BA.debugLine="rs.Position = i";
Debug.ShouldStop(1048576);
biyokimyasalsil.mostCurrent._rs.runMethod(true,"setPosition",BA.numberCast(int.class, _i));
 BA.debugLineNum = 150;BA.debugLine="VeriAl";
Debug.ShouldStop(2097152);
_verial();
 BA.debugLineNum = 151;BA.debugLine="ListView1.AddTwoLinesAndBitmap(id,$\"TC: ${tc} //";
Debug.ShouldStop(4194304);
biyokimyasalsil.mostCurrent._listview1.runVoidMethod ("AddTwoLinesAndBitmap",(Object)(BA.ObjectToCharSequence(biyokimyasalsil._id)),(Object)(BA.ObjectToCharSequence((RemoteObject.concat(RemoteObject.createImmutable("TC: "),biyokimyasalsil.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((biyokimyasalsil.mostCurrent._tc))),RemoteObject.createImmutable(" // Ad Soyad: "),biyokimyasalsil.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((biyokimyasalsil.mostCurrent._isim))),RemoteObject.createImmutable(" // Tarih: "),biyokimyasalsil.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((biyokimyasalsil.mostCurrent._tarih))),RemoteObject.createImmutable(" // Saat: "),biyokimyasalsil.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((biyokimyasalsil.mostCurrent._saat))),RemoteObject.createImmutable(""))))),(Object)((biyokimyasalsil.mostCurrent._bmp.getObject())));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 153;BA.debugLine="rs.Close";
Debug.ShouldStop(16777216);
biyokimyasalsil.mostCurrent._rs.runVoidMethod ("Close");
 BA.debugLineNum = 154;BA.debugLine="End Sub";
Debug.ShouldStop(33554432);
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
		Debug.PushSubsStack("ButtonTarih_Click (biyokimyasalsil) ","biyokimyasalsil",35,biyokimyasalsil.mostCurrent.activityBA,biyokimyasalsil.mostCurrent,169);
if (RapidSub.canDelegate("buttontarih_click")) { return b4a.example3.biyokimyasalsil.remoteMe.runUserSub(false, "biyokimyasalsil","buttontarih_click");}
int _i = 0;
 BA.debugLineNum = 169;BA.debugLine="Sub ButtonTarih_Click";
Debug.ShouldStop(256);
 BA.debugLineNum = 170;BA.debugLine="WebView1.Visible = False";
Debug.ShouldStop(512);
biyokimyasalsil.mostCurrent._webview1.runMethod(true,"setVisible",biyokimyasalsil.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 171;BA.debugLine="ListView1.Clear";
Debug.ShouldStop(1024);
biyokimyasalsil.mostCurrent._listview1.runVoidMethod ("Clear");
 BA.debugLineNum = 172;BA.debugLine="rs = Main.sql.ExecQuery(\"SELECT * FROM Biyokimyas";
Debug.ShouldStop(2048);
biyokimyasalsil.mostCurrent._rs.setObject(biyokimyasalsil.mostCurrent._main._sql /*RemoteObject*/ .runMethod(false,"ExecQuery",(Object)(RemoteObject.concat(RemoteObject.createImmutable("SELECT * FROM Biyokimyasal,Denek WHERE Biyokimyasal.denek_id = Denek.denek_id AND biyokimyasal_tarih LIKE '%"),biyokimyasalsil.mostCurrent._edittextara.runMethod(true,"getText"),RemoteObject.createImmutable("%' ORDER BY biyokimyasal_id DESC")))));
 BA.debugLineNum = 174;BA.debugLine="For i=0 To rs.RowCount-1";
Debug.ShouldStop(8192);
{
final int step4 = 1;
final int limit4 = RemoteObject.solve(new RemoteObject[] {biyokimyasalsil.mostCurrent._rs.runMethod(true,"getRowCount"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step4 > 0 && _i <= limit4) || (step4 < 0 && _i >= limit4) ;_i = ((int)(0 + _i + step4))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 175;BA.debugLine="rs.Position = i";
Debug.ShouldStop(16384);
biyokimyasalsil.mostCurrent._rs.runMethod(true,"setPosition",BA.numberCast(int.class, _i));
 BA.debugLineNum = 176;BA.debugLine="VeriAl";
Debug.ShouldStop(32768);
_verial();
 BA.debugLineNum = 177;BA.debugLine="ListView1.AddTwoLinesAndBitmap(id,$\"TC: ${tc} //";
Debug.ShouldStop(65536);
biyokimyasalsil.mostCurrent._listview1.runVoidMethod ("AddTwoLinesAndBitmap",(Object)(BA.ObjectToCharSequence(biyokimyasalsil._id)),(Object)(BA.ObjectToCharSequence((RemoteObject.concat(RemoteObject.createImmutable("TC: "),biyokimyasalsil.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((biyokimyasalsil.mostCurrent._tc))),RemoteObject.createImmutable(" // Ad Soyad: "),biyokimyasalsil.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((biyokimyasalsil.mostCurrent._isim))),RemoteObject.createImmutable(" // Tarih: "),biyokimyasalsil.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((biyokimyasalsil.mostCurrent._tarih))),RemoteObject.createImmutable(" // Saat: "),biyokimyasalsil.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((biyokimyasalsil.mostCurrent._saat))),RemoteObject.createImmutable(""))))),(Object)((biyokimyasalsil.mostCurrent._bmp.getObject())));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 179;BA.debugLine="rs.Close";
Debug.ShouldStop(262144);
biyokimyasalsil.mostCurrent._rs.runVoidMethod ("Close");
 BA.debugLineNum = 180;BA.debugLine="End Sub";
Debug.ShouldStop(524288);
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
		Debug.PushSubsStack("ButtonTc_Click (biyokimyasalsil) ","biyokimyasalsil",35,biyokimyasalsil.mostCurrent.activityBA,biyokimyasalsil.mostCurrent,156);
if (RapidSub.canDelegate("buttontc_click")) { return b4a.example3.biyokimyasalsil.remoteMe.runUserSub(false, "biyokimyasalsil","buttontc_click");}
int _i = 0;
 BA.debugLineNum = 156;BA.debugLine="Sub ButtonTc_Click";
Debug.ShouldStop(134217728);
 BA.debugLineNum = 157;BA.debugLine="WebView1.Visible = False";
Debug.ShouldStop(268435456);
biyokimyasalsil.mostCurrent._webview1.runMethod(true,"setVisible",biyokimyasalsil.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 158;BA.debugLine="ListView1.Clear";
Debug.ShouldStop(536870912);
biyokimyasalsil.mostCurrent._listview1.runVoidMethod ("Clear");
 BA.debugLineNum = 159;BA.debugLine="rs = Main.sql.ExecQuery(\"SELECT * FROM Biyokimyas";
Debug.ShouldStop(1073741824);
biyokimyasalsil.mostCurrent._rs.setObject(biyokimyasalsil.mostCurrent._main._sql /*RemoteObject*/ .runMethod(false,"ExecQuery",(Object)(RemoteObject.concat(RemoteObject.createImmutable("SELECT * FROM Biyokimyasal,Denek WHERE Biyokimyasal.denek_id = Denek.denek_id AND denek_tc LIKE '%"),biyokimyasalsil.mostCurrent._edittextara.runMethod(true,"getText"),RemoteObject.createImmutable("%' ORDER BY biyokimyasal_id DESC")))));
 BA.debugLineNum = 161;BA.debugLine="For i=0 To rs.RowCount-1";
Debug.ShouldStop(1);
{
final int step4 = 1;
final int limit4 = RemoteObject.solve(new RemoteObject[] {biyokimyasalsil.mostCurrent._rs.runMethod(true,"getRowCount"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step4 > 0 && _i <= limit4) || (step4 < 0 && _i >= limit4) ;_i = ((int)(0 + _i + step4))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 162;BA.debugLine="rs.Position = i";
Debug.ShouldStop(2);
biyokimyasalsil.mostCurrent._rs.runMethod(true,"setPosition",BA.numberCast(int.class, _i));
 BA.debugLineNum = 163;BA.debugLine="VeriAl";
Debug.ShouldStop(4);
_verial();
 BA.debugLineNum = 164;BA.debugLine="ListView1.AddTwoLinesAndBitmap(id,$\"TC: ${tc} //";
Debug.ShouldStop(8);
biyokimyasalsil.mostCurrent._listview1.runVoidMethod ("AddTwoLinesAndBitmap",(Object)(BA.ObjectToCharSequence(biyokimyasalsil._id)),(Object)(BA.ObjectToCharSequence((RemoteObject.concat(RemoteObject.createImmutable("TC: "),biyokimyasalsil.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((biyokimyasalsil.mostCurrent._tc))),RemoteObject.createImmutable(" // Ad Soyad: "),biyokimyasalsil.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((biyokimyasalsil.mostCurrent._isim))),RemoteObject.createImmutable(" // Tarih: "),biyokimyasalsil.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((biyokimyasalsil.mostCurrent._tarih))),RemoteObject.createImmutable(" // Saat: "),biyokimyasalsil.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((biyokimyasalsil.mostCurrent._saat))),RemoteObject.createImmutable(""))))),(Object)((biyokimyasalsil.mostCurrent._bmp.getObject())));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 166;BA.debugLine="rs.Close";
Debug.ShouldStop(32);
biyokimyasalsil.mostCurrent._rs.runVoidMethod ("Close");
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
public static RemoteObject  _edittextara_textchanged(RemoteObject _old,RemoteObject _new) throws Exception{
try {
		Debug.PushSubsStack("EditTextAra_TextChanged (biyokimyasalsil) ","biyokimyasalsil",35,biyokimyasalsil.mostCurrent.activityBA,biyokimyasalsil.mostCurrent,125);
if (RapidSub.canDelegate("edittextara_textchanged")) { return b4a.example3.biyokimyasalsil.remoteMe.runUserSub(false, "biyokimyasalsil","edittextara_textchanged", _old, _new);}
int _i = 0;
Debug.locals.put("Old", _old);
Debug.locals.put("New", _new);
 BA.debugLineNum = 125;BA.debugLine="Sub EditTextAra_TextChanged (Old As String, New As";
Debug.ShouldStop(268435456);
 BA.debugLineNum = 126;BA.debugLine="WebView1.Visible = False";
Debug.ShouldStop(536870912);
biyokimyasalsil.mostCurrent._webview1.runMethod(true,"setVisible",biyokimyasalsil.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 127;BA.debugLine="LabelCarpi.Visible = True";
Debug.ShouldStop(1073741824);
biyokimyasalsil.mostCurrent._labelcarpi.runMethod(true,"setVisible",biyokimyasalsil.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 128;BA.debugLine="ListView1.Clear";
Debug.ShouldStop(-2147483648);
biyokimyasalsil.mostCurrent._listview1.runVoidMethod ("Clear");
 BA.debugLineNum = 129;BA.debugLine="rs = Main.sql.ExecQuery( \"SELECT * FROM Biyokimya";
Debug.ShouldStop(1);
biyokimyasalsil.mostCurrent._rs.setObject(biyokimyasalsil.mostCurrent._main._sql /*RemoteObject*/ .runMethod(false,"ExecQuery",(Object)(RemoteObject.concat(RemoteObject.createImmutable("SELECT * FROM Biyokimyasal,Denek WHERE Biyokimyasal.denek_id = Denek.denek_id AND (denek_tc LIKE '%"),biyokimyasalsil.mostCurrent._edittextara.runMethod(true,"getText"),RemoteObject.createImmutable("%' OR denek_isim LIKE '%"),biyokimyasalsil.mostCurrent._edittextara.runMethod(true,"getText"),RemoteObject.createImmutable("%' OR biyokimyasal_tarih  LIKE '%"),biyokimyasalsil.mostCurrent._edittextara.runMethod(true,"getText"),RemoteObject.createImmutable("%' OR biyokimyasal_aciklama  LIKE '%"),biyokimyasalsil.mostCurrent._edittextara.runMethod(true,"getText"),RemoteObject.createImmutable("%') ORDER BY biyokimyasal_id DESC")))));
 BA.debugLineNum = 131;BA.debugLine="For i=0 To rs.RowCount-1";
Debug.ShouldStop(4);
{
final int step5 = 1;
final int limit5 = RemoteObject.solve(new RemoteObject[] {biyokimyasalsil.mostCurrent._rs.runMethod(true,"getRowCount"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step5 > 0 && _i <= limit5) || (step5 < 0 && _i >= limit5) ;_i = ((int)(0 + _i + step5))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 132;BA.debugLine="rs.Position = i";
Debug.ShouldStop(8);
biyokimyasalsil.mostCurrent._rs.runMethod(true,"setPosition",BA.numberCast(int.class, _i));
 BA.debugLineNum = 133;BA.debugLine="VeriAl";
Debug.ShouldStop(16);
_verial();
 BA.debugLineNum = 134;BA.debugLine="ListView1.AddTwoLinesAndBitmap(id,$\"TC: ${tc} //";
Debug.ShouldStop(32);
biyokimyasalsil.mostCurrent._listview1.runVoidMethod ("AddTwoLinesAndBitmap",(Object)(BA.ObjectToCharSequence(biyokimyasalsil._id)),(Object)(BA.ObjectToCharSequence((RemoteObject.concat(RemoteObject.createImmutable("TC: "),biyokimyasalsil.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((biyokimyasalsil.mostCurrent._tc))),RemoteObject.createImmutable(" // Ad Soyad: "),biyokimyasalsil.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((biyokimyasalsil.mostCurrent._isim))),RemoteObject.createImmutable(" // Tarih: "),biyokimyasalsil.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((biyokimyasalsil.mostCurrent._tarih))),RemoteObject.createImmutable(" // Saat: "),biyokimyasalsil.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((biyokimyasalsil.mostCurrent._saat))),RemoteObject.createImmutable(" "))))),(Object)((biyokimyasalsil.mostCurrent._bmp.getObject())));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 136;BA.debugLine="rs.Close";
Debug.ShouldStop(128);
biyokimyasalsil.mostCurrent._rs.runVoidMethod ("Close");
 BA.debugLineNum = 137;BA.debugLine="If EditTextAra.Text = \"\" Then";
Debug.ShouldStop(256);
if (RemoteObject.solveBoolean("=",biyokimyasalsil.mostCurrent._edittextara.runMethod(true,"getText"),BA.ObjectToString(""))) { 
 BA.debugLineNum = 138;BA.debugLine="LabelCarpi.Visible = False";
Debug.ShouldStop(512);
biyokimyasalsil.mostCurrent._labelcarpi.runMethod(true,"setVisible",biyokimyasalsil.mostCurrent.__c.getField(true,"False"));
 };
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
public static RemoteObject  _globals() throws Exception{
 //BA.debugLineNum = 12;BA.debugLine="Sub Globals";
 //BA.debugLineNum = 16;BA.debugLine="Private EditTextAra As EditText";
biyokimyasalsil.mostCurrent._edittextara = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
 //BA.debugLineNum = 17;BA.debugLine="Private ButtonIsim As Button";
biyokimyasalsil.mostCurrent._buttonisim = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 18;BA.debugLine="Private ButtonTc As Button";
biyokimyasalsil.mostCurrent._buttontc = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 19;BA.debugLine="Private ButtonBiyokimyasalAciklama As Button";
biyokimyasalsil.mostCurrent._buttonbiyokimyasalaciklama = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 20;BA.debugLine="Private ButtonTarih As Button";
biyokimyasalsil.mostCurrent._buttontarih = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 22;BA.debugLine="Private ListView1 As ListView";
biyokimyasalsil.mostCurrent._listview1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.ListViewWrapper");
 //BA.debugLineNum = 23;BA.debugLine="Dim rs As ResultSet";
biyokimyasalsil.mostCurrent._rs = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL.ResultSetWrapper");
 //BA.debugLineNum = 24;BA.debugLine="Dim id As Int";
biyokimyasalsil._id = RemoteObject.createImmutable(0);
 //BA.debugLineNum = 25;BA.debugLine="Private WebView1 As WebView";
biyokimyasalsil.mostCurrent._webview1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.WebViewWrapper");
 //BA.debugLineNum = 26;BA.debugLine="Private ButtonBiyokimyasalTabloVeri As Button";
biyokimyasalsil.mostCurrent._buttonbiyokimyasaltabloveri = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 27;BA.debugLine="Private ButtonBiyokimyasalEkle As Button";
biyokimyasalsil.mostCurrent._buttonbiyokimyasalekle = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 29;BA.debugLine="Dim tc,tarih,isim, saat, aciklama As String";
biyokimyasalsil.mostCurrent._tc = RemoteObject.createImmutable("");
biyokimyasalsil.mostCurrent._tarih = RemoteObject.createImmutable("");
biyokimyasalsil.mostCurrent._isim = RemoteObject.createImmutable("");
biyokimyasalsil.mostCurrent._saat = RemoteObject.createImmutable("");
biyokimyasalsil.mostCurrent._aciklama = RemoteObject.createImmutable("");
 //BA.debugLineNum = 30;BA.debugLine="Dim id As Int";
biyokimyasalsil._id = RemoteObject.createImmutable(0);
 //BA.debugLineNum = 31;BA.debugLine="Dim resim() As Byte";
biyokimyasalsil._resim = RemoteObject.createNewArray ("byte", new int[] {0}, new Object[]{});
 //BA.debugLineNum = 32;BA.debugLine="Dim bmp As Bitmap";
biyokimyasalsil.mostCurrent._bmp = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper");
 //BA.debugLineNum = 33;BA.debugLine="Private LabelCarpi As Label";
biyokimyasalsil.mostCurrent._labelcarpi = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 34;BA.debugLine="Private ButtonAnasayfa As Button";
biyokimyasalsil.mostCurrent._buttonanasayfa = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 35;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _labelcarpi_click() throws Exception{
try {
		Debug.PushSubsStack("LabelCarpi_Click (biyokimyasalsil) ","biyokimyasalsil",35,biyokimyasalsil.mostCurrent.activityBA,biyokimyasalsil.mostCurrent,247);
if (RapidSub.canDelegate("labelcarpi_click")) { return b4a.example3.biyokimyasalsil.remoteMe.runUserSub(false, "biyokimyasalsil","labelcarpi_click");}
 BA.debugLineNum = 247;BA.debugLine="Sub LabelCarpi_Click";
Debug.ShouldStop(4194304);
 BA.debugLineNum = 248;BA.debugLine="EditTextAra.SelectAll";
Debug.ShouldStop(8388608);
biyokimyasalsil.mostCurrent._edittextara.runVoidMethod ("SelectAll");
 BA.debugLineNum = 249;BA.debugLine="EditTextAra.Text = \"\"";
Debug.ShouldStop(16777216);
biyokimyasalsil.mostCurrent._edittextara.runMethodAndSync(true,"setText",BA.ObjectToCharSequence(""));
 BA.debugLineNum = 250;BA.debugLine="ListViewGosterDB";
Debug.ShouldStop(33554432);
_listviewgosterdb();
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
public static RemoteObject  _listview1_itemclick(RemoteObject _position,RemoteObject _value) throws Exception{
try {
		Debug.PushSubsStack("ListView1_ItemClick (biyokimyasalsil) ","biyokimyasalsil",35,biyokimyasalsil.mostCurrent.activityBA,biyokimyasalsil.mostCurrent,209);
if (RapidSub.canDelegate("listview1_itemclick")) { return b4a.example3.biyokimyasalsil.remoteMe.runUserSub(false, "biyokimyasalsil","listview1_itemclick", _position, _value);}
Debug.locals.put("Position", _position);
Debug.locals.put("Value", _value);
 BA.debugLineNum = 209;BA.debugLine="Sub ListView1_ItemClick (Position As Int, Value As";
Debug.ShouldStop(65536);
 BA.debugLineNum = 210;BA.debugLine="WebView1.Visible = True";
Debug.ShouldStop(131072);
biyokimyasalsil.mostCurrent._webview1.runMethod(true,"setVisible",biyokimyasalsil.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 211;BA.debugLine="WebView1.LoadHtml(DBUtils.ExecuteHtml(Main.sql,\"S";
Debug.ShouldStop(262144);
biyokimyasalsil.mostCurrent._webview1.runVoidMethod ("LoadHtml",(Object)(biyokimyasalsil.mostCurrent._dbutils.runMethod(true,"_executehtml" /*RemoteObject*/ ,biyokimyasalsil.mostCurrent.activityBA,(Object)(biyokimyasalsil.mostCurrent._main._sql /*RemoteObject*/ ),(Object)(RemoteObject.concat(RemoteObject.createImmutable("SELECT denek_tc As [Denek TC], denek_isim As [Denek İSİM],biyokimyasal_tarih  As [TARİH], biyokimyasal_saat As [SAAT], biyokimyasal_aciklama  As [BİYOKİMYASAL AÇIKLAMA] FROM Biyokimyasal,Denek WHERE Biyokimyasal.denek_id = Denek.denek_id AND biyokimyasal_id = '"),_value,RemoteObject.createImmutable("' "))),(Object)((biyokimyasalsil.mostCurrent.__c.getField(false,"Null"))),(Object)(BA.numberCast(int.class, -(double) (0 + 1))),(Object)(biyokimyasalsil.mostCurrent.__c.getField(true,"False")))));
 BA.debugLineNum = 212;BA.debugLine="Return";
Debug.ShouldStop(524288);
if (true) return RemoteObject.createImmutable("");
 BA.debugLineNum = 213;BA.debugLine="End Sub";
Debug.ShouldStop(1048576);
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
		Debug.PushSubsStack("ListView1_ItemLongClick (biyokimyasalsil) ","biyokimyasalsil",35,biyokimyasalsil.mostCurrent.activityBA,biyokimyasalsil.mostCurrent,215);
if (RapidSub.canDelegate("listview1_itemlongclick")) { return b4a.example3.biyokimyasalsil.remoteMe.runUserSub(false, "biyokimyasalsil","listview1_itemlongclick", _position, _value);}
int _i = 0;
RemoteObject _result = RemoteObject.createImmutable(0);
Debug.locals.put("Position", _position);
Debug.locals.put("Value", _value);
 BA.debugLineNum = 215;BA.debugLine="Sub ListView1_ItemLongClick (Position As Int, Valu";
Debug.ShouldStop(4194304);
 BA.debugLineNum = 216;BA.debugLine="rs = Main.sql.ExecQuery(\"SELECT * FROM Biyokimyas";
Debug.ShouldStop(8388608);
biyokimyasalsil.mostCurrent._rs.setObject(biyokimyasalsil.mostCurrent._main._sql /*RemoteObject*/ .runMethod(false,"ExecQuery",(Object)(RemoteObject.concat(RemoteObject.createImmutable("SELECT * FROM Biyokimyasal WHERE biyokimyasal_id = '"),_value,RemoteObject.createImmutable("' ")))));
 BA.debugLineNum = 218;BA.debugLine="For i=0 To rs.RowCount-1";
Debug.ShouldStop(33554432);
{
final int step2 = 1;
final int limit2 = RemoteObject.solve(new RemoteObject[] {biyokimyasalsil.mostCurrent._rs.runMethod(true,"getRowCount"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step2 > 0 && _i <= limit2) || (step2 < 0 && _i >= limit2) ;_i = ((int)(0 + _i + step2))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 219;BA.debugLine="rs.Position = i";
Debug.ShouldStop(67108864);
biyokimyasalsil.mostCurrent._rs.runMethod(true,"setPosition",BA.numberCast(int.class, _i));
 BA.debugLineNum = 220;BA.debugLine="id = rs.GetInt(\"biyokimyasal_id\")";
Debug.ShouldStop(134217728);
biyokimyasalsil._id = biyokimyasalsil.mostCurrent._rs.runMethod(true,"GetInt",(Object)(RemoteObject.createImmutable("biyokimyasal_id")));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 222;BA.debugLine="rs.Close";
Debug.ShouldStop(536870912);
biyokimyasalsil.mostCurrent._rs.runVoidMethod ("Close");
 BA.debugLineNum = 224;BA.debugLine="Dim result As Int";
Debug.ShouldStop(-2147483648);
_result = RemoteObject.createImmutable(0);Debug.locals.put("result", _result);
 BA.debugLineNum = 225;BA.debugLine="result = Msgbox2(\"Biyokimyasal analiz verilerini";
Debug.ShouldStop(1);
_result = biyokimyasalsil.mostCurrent.__c.runMethodAndSync(true,"Msgbox2",(Object)(BA.ObjectToCharSequence("Biyokimyasal analiz verilerini silmek istediğinizden emin misiniz?:")),(Object)(BA.ObjectToCharSequence("Onay Mesajı")),(Object)(BA.ObjectToString("Evet")),(Object)(BA.ObjectToString("")),(Object)(BA.ObjectToString("Hayır")),(Object)((biyokimyasalsil.mostCurrent.__c.getField(false,"Null"))),biyokimyasalsil.mostCurrent.activityBA);Debug.locals.put("result", _result);
 BA.debugLineNum = 226;BA.debugLine="If result = DialogResponse.POSITIVE Then";
Debug.ShouldStop(2);
if (RemoteObject.solveBoolean("=",_result,BA.numberCast(double.class, biyokimyasalsil.mostCurrent.__c.getField(false,"DialogResponse").getField(true,"POSITIVE")))) { 
 BA.debugLineNum = 227;BA.debugLine="Main.sql.ExecNonQuery(\"DELETE FROM Biyokimyasal";
Debug.ShouldStop(4);
biyokimyasalsil.mostCurrent._main._sql /*RemoteObject*/ .runVoidMethod ("ExecNonQuery",(Object)(RemoteObject.concat(RemoteObject.createImmutable("DELETE FROM Biyokimyasal WHERE biyokimyasal_id = '"),biyokimyasalsil._id,RemoteObject.createImmutable("' "))));
 BA.debugLineNum = 228;BA.debugLine="ToastMessageShow(\"Biyokimyasal veriler silindi..";
Debug.ShouldStop(8);
biyokimyasalsil.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("Biyokimyasal veriler silindi...")),(Object)(biyokimyasalsil.mostCurrent.__c.getField(true,"False")));
 };
 BA.debugLineNum = 230;BA.debugLine="ListViewGosterDB";
Debug.ShouldStop(32);
_listviewgosterdb();
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
public static RemoteObject  _listviewgosterdb() throws Exception{
try {
		Debug.PushSubsStack("ListViewGosterDB (biyokimyasalsil) ","biyokimyasalsil",35,biyokimyasalsil.mostCurrent.activityBA,biyokimyasalsil.mostCurrent,114);
if (RapidSub.canDelegate("listviewgosterdb")) { return b4a.example3.biyokimyasalsil.remoteMe.runUserSub(false, "biyokimyasalsil","listviewgosterdb");}
int _i = 0;
 BA.debugLineNum = 114;BA.debugLine="Sub ListViewGosterDB";
Debug.ShouldStop(131072);
 BA.debugLineNum = 115;BA.debugLine="WebView1.Visible = False";
Debug.ShouldStop(262144);
biyokimyasalsil.mostCurrent._webview1.runMethod(true,"setVisible",biyokimyasalsil.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 116;BA.debugLine="ListView1.Clear";
Debug.ShouldStop(524288);
biyokimyasalsil.mostCurrent._listview1.runVoidMethod ("Clear");
 BA.debugLineNum = 117;BA.debugLine="rs = Main.sql.ExecQuery(\"SELECT * FROM Biyokimyas";
Debug.ShouldStop(1048576);
biyokimyasalsil.mostCurrent._rs.setObject(biyokimyasalsil.mostCurrent._main._sql /*RemoteObject*/ .runMethod(false,"ExecQuery",(Object)(RemoteObject.createImmutable("SELECT * FROM Biyokimyasal,Denek WHERE Biyokimyasal.denek_id = Denek.denek_id ORDER BY biyokimyasal_id DESC"))));
 BA.debugLineNum = 118;BA.debugLine="For i=0 To rs.RowCount-1";
Debug.ShouldStop(2097152);
{
final int step4 = 1;
final int limit4 = RemoteObject.solve(new RemoteObject[] {biyokimyasalsil.mostCurrent._rs.runMethod(true,"getRowCount"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step4 > 0 && _i <= limit4) || (step4 < 0 && _i >= limit4) ;_i = ((int)(0 + _i + step4))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 119;BA.debugLine="rs.Position = i";
Debug.ShouldStop(4194304);
biyokimyasalsil.mostCurrent._rs.runMethod(true,"setPosition",BA.numberCast(int.class, _i));
 BA.debugLineNum = 120;BA.debugLine="VeriAl";
Debug.ShouldStop(8388608);
_verial();
 BA.debugLineNum = 121;BA.debugLine="ListView1.AddTwoLinesAndBitmap(id,$\"TC: ${tc} //";
Debug.ShouldStop(16777216);
biyokimyasalsil.mostCurrent._listview1.runVoidMethod ("AddTwoLinesAndBitmap",(Object)(BA.ObjectToCharSequence(biyokimyasalsil._id)),(Object)(BA.ObjectToCharSequence((RemoteObject.concat(RemoteObject.createImmutable("TC: "),biyokimyasalsil.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((biyokimyasalsil.mostCurrent._tc))),RemoteObject.createImmutable(" // Ad Soyad: "),biyokimyasalsil.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((biyokimyasalsil.mostCurrent._isim))),RemoteObject.createImmutable(" // Tarih: "),biyokimyasalsil.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((biyokimyasalsil.mostCurrent._tarih))),RemoteObject.createImmutable(" // Saat: "),biyokimyasalsil.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((biyokimyasalsil.mostCurrent._saat))),RemoteObject.createImmutable(" "))))),(Object)((biyokimyasalsil.mostCurrent._bmp.getObject())));
 }
}Debug.locals.put("i", _i);
;
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
public static RemoteObject  _process_globals() throws Exception{
 //BA.debugLineNum = 6;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 10;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _setdivider(RemoteObject _lv,RemoteObject _renk,RemoteObject _height) throws Exception{
try {
		Debug.PushSubsStack("SetDivider (biyokimyasalsil) ","biyokimyasalsil",35,biyokimyasalsil.mostCurrent.activityBA,biyokimyasalsil.mostCurrent,233);
if (RapidSub.canDelegate("setdivider")) { return b4a.example3.biyokimyasalsil.remoteMe.runUserSub(false, "biyokimyasalsil","setdivider", _lv, _renk, _height);}
RemoteObject _r = RemoteObject.declareNull("anywheresoftware.b4a.agraham.reflection.Reflection");
RemoteObject _cd = RemoteObject.declareNull("anywheresoftware.b4a.objects.drawable.ColorDrawable");
Debug.locals.put("lv", _lv);
Debug.locals.put("Renk", _renk);
Debug.locals.put("Height", _height);
 BA.debugLineNum = 233;BA.debugLine="Sub SetDivider(lv As ListView, Renk As Int, Height";
Debug.ShouldStop(256);
 BA.debugLineNum = 234;BA.debugLine="Dim r As Reflector";
Debug.ShouldStop(512);
_r = RemoteObject.createNew ("anywheresoftware.b4a.agraham.reflection.Reflection");Debug.locals.put("r", _r);
 BA.debugLineNum = 235;BA.debugLine="r.Target = lv";
Debug.ShouldStop(1024);
_r.setField ("Target",(_lv.getObject()));
 BA.debugLineNum = 236;BA.debugLine="Dim CD As ColorDrawable";
Debug.ShouldStop(2048);
_cd = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.ColorDrawable");Debug.locals.put("CD", _cd);
 BA.debugLineNum = 237;BA.debugLine="CD.Initialize(Renk, 0)";
Debug.ShouldStop(4096);
_cd.runVoidMethod ("Initialize",(Object)(_renk),(Object)(BA.numberCast(int.class, 0)));
 BA.debugLineNum = 238;BA.debugLine="r.RunMethod4(\"setDivider\", Array As Object(CD), A";
Debug.ShouldStop(8192);
_r.runVoidMethod ("RunMethod4",(Object)(BA.ObjectToString("setDivider")),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(_cd.getObject())})),(Object)(RemoteObject.createNewArray("String",new int[] {1},new Object[] {RemoteObject.createImmutable("android.graphics.drawable.Drawable")})));
 BA.debugLineNum = 239;BA.debugLine="r.RunMethod2(\"setDividerHeight\", Height, \"java.la";
Debug.ShouldStop(16384);
_r.runVoidMethod ("RunMethod2",(Object)(BA.ObjectToString("setDividerHeight")),(Object)(BA.NumberToString(_height)),(Object)(RemoteObject.createImmutable("java.lang.int")));
 BA.debugLineNum = 240;BA.debugLine="End Sub";
Debug.ShouldStop(32768);
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
		Debug.PushSubsStack("VeriAl (biyokimyasalsil) ","biyokimyasalsil",35,biyokimyasalsil.mostCurrent.activityBA,biyokimyasalsil.mostCurrent,96);
if (RapidSub.canDelegate("verial")) { return b4a.example3.biyokimyasalsil.remoteMe.runUserSub(false, "biyokimyasalsil","verial");}
RemoteObject _inputstream = RemoteObject.declareNull("anywheresoftware.b4a.objects.streams.File.InputStreamWrapper");
 BA.debugLineNum = 96;BA.debugLine="Public Sub VeriAl";
Debug.ShouldStop(-2147483648);
 BA.debugLineNum = 97;BA.debugLine="id = rs.GetInt(\"biyokimyasal_id\")";
Debug.ShouldStop(1);
biyokimyasalsil._id = biyokimyasalsil.mostCurrent._rs.runMethod(true,"GetInt",(Object)(RemoteObject.createImmutable("biyokimyasal_id")));
 BA.debugLineNum = 98;BA.debugLine="tc = rs.GetString(\"denek_tc\")";
Debug.ShouldStop(2);
biyokimyasalsil.mostCurrent._tc = biyokimyasalsil.mostCurrent._rs.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("denek_tc")));
 BA.debugLineNum = 99;BA.debugLine="isim = rs.GetString(\"denek_isim\")";
Debug.ShouldStop(4);
biyokimyasalsil.mostCurrent._isim = biyokimyasalsil.mostCurrent._rs.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("denek_isim")));
 BA.debugLineNum = 100;BA.debugLine="tarih = rs.GetString(\"biyokimyasal_tarih\")";
Debug.ShouldStop(8);
biyokimyasalsil.mostCurrent._tarih = biyokimyasalsil.mostCurrent._rs.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("biyokimyasal_tarih")));
 BA.debugLineNum = 101;BA.debugLine="saat = rs.GetString(\"biyokimyasal_saat\")";
Debug.ShouldStop(16);
biyokimyasalsil.mostCurrent._saat = biyokimyasalsil.mostCurrent._rs.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("biyokimyasal_saat")));
 BA.debugLineNum = 102;BA.debugLine="aciklama = rs.GetString(\"biyokimyasal_aciklama\")";
Debug.ShouldStop(32);
biyokimyasalsil.mostCurrent._aciklama = biyokimyasalsil.mostCurrent._rs.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("biyokimyasal_aciklama")));
 BA.debugLineNum = 103;BA.debugLine="resim = rs.GetBlob(\"denek_image\")";
Debug.ShouldStop(64);
biyokimyasalsil._resim = biyokimyasalsil.mostCurrent._rs.runMethod(false,"GetBlob",(Object)(RemoteObject.createImmutable("denek_image")));
 BA.debugLineNum = 104;BA.debugLine="Try";
Debug.ShouldStop(128);
try { BA.debugLineNum = 105;BA.debugLine="Dim inputStream As InputStream";
Debug.ShouldStop(256);
_inputstream = RemoteObject.createNew ("anywheresoftware.b4a.objects.streams.File.InputStreamWrapper");Debug.locals.put("inputStream", _inputstream);
 BA.debugLineNum = 106;BA.debugLine="inputStream.InitializeFromBytesArray(resim, 0, r";
Debug.ShouldStop(512);
_inputstream.runVoidMethod ("InitializeFromBytesArray",(Object)(biyokimyasalsil._resim),(Object)(BA.numberCast(int.class, 0)),(Object)(biyokimyasalsil._resim.getField(true,"length")));
 BA.debugLineNum = 107;BA.debugLine="bmp.Initialize2(inputStream)";
Debug.ShouldStop(1024);
biyokimyasalsil.mostCurrent._bmp.runVoidMethod ("Initialize2",(Object)((_inputstream.getObject())));
 BA.debugLineNum = 108;BA.debugLine="inputStream.Close";
Debug.ShouldStop(2048);
_inputstream.runVoidMethod ("Close");
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e14) {
			BA.rdebugUtils.runVoidMethod("setLastException",biyokimyasalsil.processBA, e14.toString()); BA.debugLineNum = 110;BA.debugLine="bmp = LoadBitmap(File.DirAssets, \"FotoKisi.png\")";
Debug.ShouldStop(8192);
biyokimyasalsil.mostCurrent._bmp = biyokimyasalsil.mostCurrent.__c.runMethod(false,"LoadBitmap",(Object)(biyokimyasalsil.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(RemoteObject.createImmutable("FotoKisi.png")));
 };
 BA.debugLineNum = 112;BA.debugLine="End Sub";
Debug.ShouldStop(32768);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}