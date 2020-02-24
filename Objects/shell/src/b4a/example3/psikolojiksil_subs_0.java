package b4a.example3;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class psikolojiksil_subs_0 {


public static RemoteObject  _activity_create(RemoteObject _firsttime) throws Exception{
try {
		Debug.PushSubsStack("Activity_Create (psikolojiksil) ","psikolojiksil",36,psikolojiksil.mostCurrent.activityBA,psikolojiksil.mostCurrent,35);
if (RapidSub.canDelegate("activity_create")) { return b4a.example3.psikolojiksil.remoteMe.runUserSub(false, "psikolojiksil","activity_create", _firsttime);}
Debug.locals.put("FirstTime", _firsttime);
 BA.debugLineNum = 35;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
Debug.ShouldStop(4);
 BA.debugLineNum = 37;BA.debugLine="Activity.LoadLayout(\"PsikolojikSilPage\")";
Debug.ShouldStop(16);
psikolojiksil.mostCurrent._activity.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("PsikolojikSilPage")),psikolojiksil.mostCurrent.activityBA);
 BA.debugLineNum = 38;BA.debugLine="WebView1.Visible = False";
Debug.ShouldStop(32);
psikolojiksil.mostCurrent._webview1.runMethod(true,"setVisible",psikolojiksil.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 39;BA.debugLine="LabelCarpi.Visible = False";
Debug.ShouldStop(64);
psikolojiksil.mostCurrent._labelcarpi.runMethod(true,"setVisible",psikolojiksil.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 42;BA.debugLine="ListView1.TwoLinesAndBitmap.Label.Visible = False";
Debug.ShouldStop(512);
psikolojiksil.mostCurrent._listview1.runMethod(false,"getTwoLinesAndBitmap").getField(false,"Label").runMethod(true,"setVisible",psikolojiksil.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 43;BA.debugLine="ListView1.TwoLinesAndBitmap.SecondLabel.TextColor";
Debug.ShouldStop(1024);
psikolojiksil.mostCurrent._listview1.runMethod(false,"getTwoLinesAndBitmap").getField(false,"SecondLabel").runMethod(true,"setTextColor",psikolojiksil.mostCurrent._color._koyumavi /*RemoteObject*/ );
 BA.debugLineNum = 44;BA.debugLine="ListView1.TwoLinesAndBitmap.SecondLabel.TextSize";
Debug.ShouldStop(2048);
psikolojiksil.mostCurrent._listview1.runMethod(false,"getTwoLinesAndBitmap").getField(false,"SecondLabel").runMethod(true,"setTextSize",BA.numberCast(float.class, 20));
 BA.debugLineNum = 45;BA.debugLine="SetDivider(ListView1,Color.acikMavi,3dip)";
Debug.ShouldStop(4096);
_setdivider(psikolojiksil.mostCurrent._listview1,psikolojiksil.mostCurrent._color._acikmavi /*RemoteObject*/ ,psikolojiksil.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 3))));
 BA.debugLineNum = 47;BA.debugLine="EditTextAra.TextColor = Colors.White";
Debug.ShouldStop(16384);
psikolojiksil.mostCurrent._edittextara.runMethod(true,"setTextColor",psikolojiksil.mostCurrent.__c.getField(false,"Colors").getField(true,"White"));
 BA.debugLineNum = 48;BA.debugLine="EditTextAra.Hint = \"Bu alana yazarak aratabilirsi";
Debug.ShouldStop(32768);
psikolojiksil.mostCurrent._edittextara.runMethod(true,"setHint",BA.ObjectToString("Bu alana yazarak aratabilirsiniz.."));
 BA.debugLineNum = 49;BA.debugLine="EditTextAra.HintColor = Color.hintColor";
Debug.ShouldStop(65536);
psikolojiksil.mostCurrent._edittextara.runMethod(true,"setHintColor",psikolojiksil.mostCurrent._color._hintcolor /*RemoteObject*/ );
 BA.debugLineNum = 50;BA.debugLine="EditTextAra.TextSize = 20";
Debug.ShouldStop(131072);
psikolojiksil.mostCurrent._edittextara.runMethod(true,"setTextSize",BA.numberCast(float.class, 20));
 BA.debugLineNum = 51;BA.debugLine="EditTextAra.Typeface = Typeface.DEFAULT_BOLD";
Debug.ShouldStop(262144);
psikolojiksil.mostCurrent._edittextara.runMethod(false,"setTypeface",psikolojiksil.mostCurrent.__c.getField(false,"Typeface").getField(false,"DEFAULT_BOLD"));
 BA.debugLineNum = 53;BA.debugLine="WebView1.JavaScriptEnabled = True";
Debug.ShouldStop(1048576);
psikolojiksil.mostCurrent._webview1.runMethod(true,"setJavaScriptEnabled",psikolojiksil.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 54;BA.debugLine="WebView1.ZoomEnabled = True";
Debug.ShouldStop(2097152);
psikolojiksil.mostCurrent._webview1.runMethod(true,"setZoomEnabled",psikolojiksil.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 56;BA.debugLine="ButtonIsim.TextColor = Color.koyuMavi";
Debug.ShouldStop(8388608);
psikolojiksil.mostCurrent._buttonisim.runMethod(true,"setTextColor",psikolojiksil.mostCurrent._color._koyumavi /*RemoteObject*/ );
 BA.debugLineNum = 57;BA.debugLine="ButtonIsim.Typeface = Typeface.DEFAULT_BOLD";
Debug.ShouldStop(16777216);
psikolojiksil.mostCurrent._buttonisim.runMethod(false,"setTypeface",psikolojiksil.mostCurrent.__c.getField(false,"Typeface").getField(false,"DEFAULT_BOLD"));
 BA.debugLineNum = 58;BA.debugLine="ButtonIsim.Text = \"İSİM\"";
Debug.ShouldStop(33554432);
psikolojiksil.mostCurrent._buttonisim.runMethod(true,"setText",BA.ObjectToCharSequence("İSİM"));
 BA.debugLineNum = 59;BA.debugLine="ButtonIsim.TextSize = 14";
Debug.ShouldStop(67108864);
psikolojiksil.mostCurrent._buttonisim.runMethod(true,"setTextSize",BA.numberCast(float.class, 14));
 BA.debugLineNum = 60;BA.debugLine="ButtonIsim.SingleLine  = True";
Debug.ShouldStop(134217728);
psikolojiksil.mostCurrent._buttonisim.runVoidMethod ("setSingleLine",psikolojiksil.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 62;BA.debugLine="ButtonTc.TextColor = Color.koyuMavi";
Debug.ShouldStop(536870912);
psikolojiksil.mostCurrent._buttontc.runMethod(true,"setTextColor",psikolojiksil.mostCurrent._color._koyumavi /*RemoteObject*/ );
 BA.debugLineNum = 63;BA.debugLine="ButtonTc.Typeface = Typeface.DEFAULT_BOLD";
Debug.ShouldStop(1073741824);
psikolojiksil.mostCurrent._buttontc.runMethod(false,"setTypeface",psikolojiksil.mostCurrent.__c.getField(false,"Typeface").getField(false,"DEFAULT_BOLD"));
 BA.debugLineNum = 64;BA.debugLine="ButtonTc.Text = \"TC\"";
Debug.ShouldStop(-2147483648);
psikolojiksil.mostCurrent._buttontc.runMethod(true,"setText",BA.ObjectToCharSequence("TC"));
 BA.debugLineNum = 65;BA.debugLine="ButtonTc.TextSize = 14";
Debug.ShouldStop(1);
psikolojiksil.mostCurrent._buttontc.runMethod(true,"setTextSize",BA.numberCast(float.class, 14));
 BA.debugLineNum = 66;BA.debugLine="ButtonTc.SingleLine = True";
Debug.ShouldStop(2);
psikolojiksil.mostCurrent._buttontc.runVoidMethod ("setSingleLine",psikolojiksil.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 68;BA.debugLine="ButtonPsikolojikAciklama.TextColor = Color.koyuMa";
Debug.ShouldStop(8);
psikolojiksil.mostCurrent._buttonpsikolojikaciklama.runMethod(true,"setTextColor",psikolojiksil.mostCurrent._color._koyumavi /*RemoteObject*/ );
 BA.debugLineNum = 69;BA.debugLine="ButtonPsikolojikAciklama.Typeface = Typeface.DEFA";
Debug.ShouldStop(16);
psikolojiksil.mostCurrent._buttonpsikolojikaciklama.runMethod(false,"setTypeface",psikolojiksil.mostCurrent.__c.getField(false,"Typeface").getField(false,"DEFAULT_BOLD"));
 BA.debugLineNum = 70;BA.debugLine="ButtonPsikolojikAciklama.TextSize = 14";
Debug.ShouldStop(32);
psikolojiksil.mostCurrent._buttonpsikolojikaciklama.runMethod(true,"setTextSize",BA.numberCast(float.class, 14));
 BA.debugLineNum = 71;BA.debugLine="ButtonPsikolojikAciklama.Text = \"PSİKOLOJİK AÇIKL";
Debug.ShouldStop(64);
psikolojiksil.mostCurrent._buttonpsikolojikaciklama.runMethod(true,"setText",BA.ObjectToCharSequence("PSİKOLOJİK AÇIKLAMA"));
 BA.debugLineNum = 72;BA.debugLine="ButtonPsikolojikAciklama.SingleLine = True";
Debug.ShouldStop(128);
psikolojiksil.mostCurrent._buttonpsikolojikaciklama.runVoidMethod ("setSingleLine",psikolojiksil.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 74;BA.debugLine="ButtonTarih.TextColor = Color.koyuMavi";
Debug.ShouldStop(512);
psikolojiksil.mostCurrent._buttontarih.runMethod(true,"setTextColor",psikolojiksil.mostCurrent._color._koyumavi /*RemoteObject*/ );
 BA.debugLineNum = 75;BA.debugLine="ButtonTarih.Typeface = Typeface.DEFAULT_BOLD";
Debug.ShouldStop(1024);
psikolojiksil.mostCurrent._buttontarih.runMethod(false,"setTypeface",psikolojiksil.mostCurrent.__c.getField(false,"Typeface").getField(false,"DEFAULT_BOLD"));
 BA.debugLineNum = 76;BA.debugLine="ButtonTarih.Text = \"TARİH\"";
Debug.ShouldStop(2048);
psikolojiksil.mostCurrent._buttontarih.runMethod(true,"setText",BA.ObjectToCharSequence("TARİH"));
 BA.debugLineNum = 77;BA.debugLine="ButtonTarih.TextSize = 14";
Debug.ShouldStop(4096);
psikolojiksil.mostCurrent._buttontarih.runMethod(true,"setTextSize",BA.numberCast(float.class, 14));
 BA.debugLineNum = 78;BA.debugLine="ButtonTarih.SingleLine = True";
Debug.ShouldStop(8192);
psikolojiksil.mostCurrent._buttontarih.runVoidMethod ("setSingleLine",psikolojiksil.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 82;BA.debugLine="ListViewGosterDB";
Debug.ShouldStop(131072);
_listviewgosterdb();
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
		Debug.PushSubsStack("Activity_Pause (psikolojiksil) ","psikolojiksil",36,psikolojiksil.mostCurrent.activityBA,psikolojiksil.mostCurrent,91);
if (RapidSub.canDelegate("activity_pause")) { return b4a.example3.psikolojiksil.remoteMe.runUserSub(false, "psikolojiksil","activity_pause", _userclosed);}
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
		Debug.PushSubsStack("Activity_Resume (psikolojiksil) ","psikolojiksil",36,psikolojiksil.mostCurrent.activityBA,psikolojiksil.mostCurrent,87);
if (RapidSub.canDelegate("activity_resume")) { return b4a.example3.psikolojiksil.remoteMe.runUserSub(false, "psikolojiksil","activity_resume");}
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
		Debug.PushSubsStack("ButtonAnasayfa_Click (psikolojiksil) ","psikolojiksil",36,psikolojiksil.mostCurrent.activityBA,psikolojiksil.mostCurrent,240);
if (RapidSub.canDelegate("buttonanasayfa_click")) { return b4a.example3.psikolojiksil.remoteMe.runUserSub(false, "psikolojiksil","buttonanasayfa_click");}
 BA.debugLineNum = 240;BA.debugLine="Sub ButtonAnasayfa_Click";
Debug.ShouldStop(32768);
 BA.debugLineNum = 241;BA.debugLine="StartActivity(AnaMenu)";
Debug.ShouldStop(65536);
psikolojiksil.mostCurrent.__c.runVoidMethod ("StartActivity",psikolojiksil.processBA,(Object)((psikolojiksil.mostCurrent._anamenu.getObject())));
 BA.debugLineNum = 242;BA.debugLine="Activity.Finish";
Debug.ShouldStop(131072);
psikolojiksil.mostCurrent._activity.runVoidMethod ("Finish");
 BA.debugLineNum = 243;BA.debugLine="End Sub";
Debug.ShouldStop(262144);
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
		Debug.PushSubsStack("ButtonIsim_Click (psikolojiksil) ","psikolojiksil",36,psikolojiksil.mostCurrent.activityBA,psikolojiksil.mostCurrent,181);
if (RapidSub.canDelegate("buttonisim_click")) { return b4a.example3.psikolojiksil.remoteMe.runUserSub(false, "psikolojiksil","buttonisim_click");}
int _i = 0;
 BA.debugLineNum = 181;BA.debugLine="Sub ButtonIsim_Click";
Debug.ShouldStop(1048576);
 BA.debugLineNum = 182;BA.debugLine="WebView1.Visible = False";
Debug.ShouldStop(2097152);
psikolojiksil.mostCurrent._webview1.runMethod(true,"setVisible",psikolojiksil.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 183;BA.debugLine="ListView1.Clear";
Debug.ShouldStop(4194304);
psikolojiksil.mostCurrent._listview1.runVoidMethod ("Clear");
 BA.debugLineNum = 184;BA.debugLine="rs = Main.sql.ExecQuery(\"SELECT * FROM Psikolojik";
Debug.ShouldStop(8388608);
psikolojiksil.mostCurrent._rs.setObject(psikolojiksil.mostCurrent._main._sql /*RemoteObject*/ .runMethod(false,"ExecQuery",(Object)(RemoteObject.concat(RemoteObject.createImmutable("SELECT * FROM Psikolojik,Denek WHERE Psikolojik.denek_id = Denek.denek_id AND denek_isim LIKE '%"),psikolojiksil.mostCurrent._edittextara.runMethod(true,"getText"),RemoteObject.createImmutable("%' ORDER BY psikolojik_id DESC")))));
 BA.debugLineNum = 186;BA.debugLine="For i=0 To rs.RowCount-1";
Debug.ShouldStop(33554432);
{
final int step4 = 1;
final int limit4 = RemoteObject.solve(new RemoteObject[] {psikolojiksil.mostCurrent._rs.runMethod(true,"getRowCount"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step4 > 0 && _i <= limit4) || (step4 < 0 && _i >= limit4) ;_i = ((int)(0 + _i + step4))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 187;BA.debugLine="rs.Position = i";
Debug.ShouldStop(67108864);
psikolojiksil.mostCurrent._rs.runMethod(true,"setPosition",BA.numberCast(int.class, _i));
 BA.debugLineNum = 188;BA.debugLine="VeriAl";
Debug.ShouldStop(134217728);
_verial();
 BA.debugLineNum = 189;BA.debugLine="ListView1.AddTwoLinesAndBitmap(id,$\"TC: ${tc} //";
Debug.ShouldStop(268435456);
psikolojiksil.mostCurrent._listview1.runVoidMethod ("AddTwoLinesAndBitmap",(Object)(BA.ObjectToCharSequence(psikolojiksil._id)),(Object)(BA.ObjectToCharSequence((RemoteObject.concat(RemoteObject.createImmutable("TC: "),psikolojiksil.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((psikolojiksil.mostCurrent._tc))),RemoteObject.createImmutable(" // Ad Soyad: "),psikolojiksil.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((psikolojiksil.mostCurrent._isim))),RemoteObject.createImmutable(" // Tarih: "),psikolojiksil.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((psikolojiksil.mostCurrent._tarih))),RemoteObject.createImmutable(" // Saat: "),psikolojiksil.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((psikolojiksil.mostCurrent._saat))),RemoteObject.createImmutable(""))))),(Object)((psikolojiksil.mostCurrent._bmp.getObject())));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 191;BA.debugLine="rs.Close";
Debug.ShouldStop(1073741824);
psikolojiksil.mostCurrent._rs.runVoidMethod ("Close");
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
public static RemoteObject  _buttonpsikolojikaciklama_click() throws Exception{
try {
		Debug.PushSubsStack("ButtonPsikolojikAciklama_Click (psikolojiksil) ","psikolojiksil",36,psikolojiksil.mostCurrent.activityBA,psikolojiksil.mostCurrent,155);
if (RapidSub.canDelegate("buttonpsikolojikaciklama_click")) { return b4a.example3.psikolojiksil.remoteMe.runUserSub(false, "psikolojiksil","buttonpsikolojikaciklama_click");}
int _i = 0;
 BA.debugLineNum = 155;BA.debugLine="Sub ButtonPsikolojikAciklama_Click";
Debug.ShouldStop(67108864);
 BA.debugLineNum = 156;BA.debugLine="WebView1.Visible = False";
Debug.ShouldStop(134217728);
psikolojiksil.mostCurrent._webview1.runMethod(true,"setVisible",psikolojiksil.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 157;BA.debugLine="ListView1.Clear";
Debug.ShouldStop(268435456);
psikolojiksil.mostCurrent._listview1.runVoidMethod ("Clear");
 BA.debugLineNum = 158;BA.debugLine="rs = Main.sql.ExecQuery(\"SELECT * FROM Psikolojik";
Debug.ShouldStop(536870912);
psikolojiksil.mostCurrent._rs.setObject(psikolojiksil.mostCurrent._main._sql /*RemoteObject*/ .runMethod(false,"ExecQuery",(Object)(RemoteObject.concat(RemoteObject.createImmutable("SELECT * FROM Psikolojik,Denek WHERE Psikolojik.denek_id = Denek.denek_id AND psikolojik_aciklama LIKE '%"),psikolojiksil.mostCurrent._edittextara.runMethod(true,"getText"),RemoteObject.createImmutable("%' ORDER BY psikolojik_id DESC")))));
 BA.debugLineNum = 160;BA.debugLine="For i=0 To rs.RowCount-1";
Debug.ShouldStop(-2147483648);
{
final int step4 = 1;
final int limit4 = RemoteObject.solve(new RemoteObject[] {psikolojiksil.mostCurrent._rs.runMethod(true,"getRowCount"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step4 > 0 && _i <= limit4) || (step4 < 0 && _i >= limit4) ;_i = ((int)(0 + _i + step4))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 161;BA.debugLine="rs.Position = i";
Debug.ShouldStop(1);
psikolojiksil.mostCurrent._rs.runMethod(true,"setPosition",BA.numberCast(int.class, _i));
 BA.debugLineNum = 162;BA.debugLine="VeriAl";
Debug.ShouldStop(2);
_verial();
 BA.debugLineNum = 163;BA.debugLine="ListView1.AddTwoLinesAndBitmap(id,$\"TC: ${tc} //";
Debug.ShouldStop(4);
psikolojiksil.mostCurrent._listview1.runVoidMethod ("AddTwoLinesAndBitmap",(Object)(BA.ObjectToCharSequence(psikolojiksil._id)),(Object)(BA.ObjectToCharSequence((RemoteObject.concat(RemoteObject.createImmutable("TC: "),psikolojiksil.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((psikolojiksil.mostCurrent._tc))),RemoteObject.createImmutable(" // Ad Soyad: "),psikolojiksil.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((psikolojiksil.mostCurrent._isim))),RemoteObject.createImmutable(" // Tarih: "),psikolojiksil.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((psikolojiksil.mostCurrent._tarih))),RemoteObject.createImmutable(" // Saat: "),psikolojiksil.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((psikolojiksil.mostCurrent._saat))),RemoteObject.createImmutable(" // Açıklama: "),psikolojiksil.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((psikolojiksil.mostCurrent._psikolojik_aciklama))),RemoteObject.createImmutable(""))))),(Object)((psikolojiksil.mostCurrent._bmp.getObject())));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 165;BA.debugLine="rs.Close";
Debug.ShouldStop(16);
psikolojiksil.mostCurrent._rs.runVoidMethod ("Close");
 BA.debugLineNum = 166;BA.debugLine="End Sub";
Debug.ShouldStop(32);
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
		Debug.PushSubsStack("ButtonPsikolojikEkle_Click (psikolojiksil) ","psikolojiksil",36,psikolojiksil.mostCurrent.activityBA,psikolojiksil.mostCurrent,195);
if (RapidSub.canDelegate("buttonpsikolojikekle_click")) { return b4a.example3.psikolojiksil.remoteMe.runUserSub(false, "psikolojiksil","buttonpsikolojikekle_click");}
 BA.debugLineNum = 195;BA.debugLine="Sub ButtonPsikolojikEkle_Click";
Debug.ShouldStop(4);
 BA.debugLineNum = 196;BA.debugLine="WebView1.Visible = False";
Debug.ShouldStop(8);
psikolojiksil.mostCurrent._webview1.runMethod(true,"setVisible",psikolojiksil.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 197;BA.debugLine="StartActivity(PsikolojikEkle)";
Debug.ShouldStop(16);
psikolojiksil.mostCurrent.__c.runVoidMethod ("StartActivity",psikolojiksil.processBA,(Object)((psikolojiksil.mostCurrent._psikolojikekle.getObject())));
 BA.debugLineNum = 198;BA.debugLine="Activity.Finish";
Debug.ShouldStop(32);
psikolojiksil.mostCurrent._activity.runVoidMethod ("Finish");
 BA.debugLineNum = 199;BA.debugLine="End Sub";
Debug.ShouldStop(64);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _buttonpsikolojiktabloveri_click() throws Exception{
try {
		Debug.PushSubsStack("ButtonPsikolojikTabloVeri_Click (psikolojiksil) ","psikolojiksil",36,psikolojiksil.mostCurrent.activityBA,psikolojiksil.mostCurrent,201);
if (RapidSub.canDelegate("buttonpsikolojiktabloveri_click")) { return b4a.example3.psikolojiksil.remoteMe.runUserSub(false, "psikolojiksil","buttonpsikolojiktabloveri_click");}
 BA.debugLineNum = 201;BA.debugLine="Sub ButtonPsikolojikTabloVeri_Click";
Debug.ShouldStop(256);
 BA.debugLineNum = 202;BA.debugLine="WebView1.Visible = False";
Debug.ShouldStop(512);
psikolojiksil.mostCurrent._webview1.runMethod(true,"setVisible",psikolojiksil.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 203;BA.debugLine="StartActivity(PsikolojikListele)";
Debug.ShouldStop(1024);
psikolojiksil.mostCurrent.__c.runVoidMethod ("StartActivity",psikolojiksil.processBA,(Object)((psikolojiksil.mostCurrent._psikolojiklistele.getObject())));
 BA.debugLineNum = 204;BA.debugLine="Activity.Finish";
Debug.ShouldStop(2048);
psikolojiksil.mostCurrent._activity.runVoidMethod ("Finish");
 BA.debugLineNum = 205;BA.debugLine="End Sub";
Debug.ShouldStop(4096);
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
		Debug.PushSubsStack("ButtonTarih_Click (psikolojiksil) ","psikolojiksil",36,psikolojiksil.mostCurrent.activityBA,psikolojiksil.mostCurrent,142);
if (RapidSub.canDelegate("buttontarih_click")) { return b4a.example3.psikolojiksil.remoteMe.runUserSub(false, "psikolojiksil","buttontarih_click");}
int _i = 0;
 BA.debugLineNum = 142;BA.debugLine="Sub ButtonTarih_Click";
Debug.ShouldStop(8192);
 BA.debugLineNum = 143;BA.debugLine="WebView1.Visible = False";
Debug.ShouldStop(16384);
psikolojiksil.mostCurrent._webview1.runMethod(true,"setVisible",psikolojiksil.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 144;BA.debugLine="ListView1.Clear";
Debug.ShouldStop(32768);
psikolojiksil.mostCurrent._listview1.runVoidMethod ("Clear");
 BA.debugLineNum = 145;BA.debugLine="rs = Main.sql.ExecQuery(\"SELECT * FROM Psikolojik";
Debug.ShouldStop(65536);
psikolojiksil.mostCurrent._rs.setObject(psikolojiksil.mostCurrent._main._sql /*RemoteObject*/ .runMethod(false,"ExecQuery",(Object)(RemoteObject.concat(RemoteObject.createImmutable("SELECT * FROM Psikolojik ,Denek WHERE Psikolojik.denek_id = Denek.denek_id AND psikolojik_tarih LIKE '%"),psikolojiksil.mostCurrent._edittextara.runMethod(true,"getText"),RemoteObject.createImmutable("%' ORDER BY psikolojik_id DESC")))));
 BA.debugLineNum = 147;BA.debugLine="For i=0 To rs.RowCount-1";
Debug.ShouldStop(262144);
{
final int step4 = 1;
final int limit4 = RemoteObject.solve(new RemoteObject[] {psikolojiksil.mostCurrent._rs.runMethod(true,"getRowCount"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step4 > 0 && _i <= limit4) || (step4 < 0 && _i >= limit4) ;_i = ((int)(0 + _i + step4))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 148;BA.debugLine="rs.Position = i";
Debug.ShouldStop(524288);
psikolojiksil.mostCurrent._rs.runMethod(true,"setPosition",BA.numberCast(int.class, _i));
 BA.debugLineNum = 149;BA.debugLine="VeriAl";
Debug.ShouldStop(1048576);
_verial();
 BA.debugLineNum = 150;BA.debugLine="ListView1.AddTwoLinesAndBitmap(id,$\"TC: ${tc} //";
Debug.ShouldStop(2097152);
psikolojiksil.mostCurrent._listview1.runVoidMethod ("AddTwoLinesAndBitmap",(Object)(BA.ObjectToCharSequence(psikolojiksil._id)),(Object)(BA.ObjectToCharSequence((RemoteObject.concat(RemoteObject.createImmutable("TC: "),psikolojiksil.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((psikolojiksil.mostCurrent._tc))),RemoteObject.createImmutable(" // Ad Soyad: "),psikolojiksil.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((psikolojiksil.mostCurrent._isim))),RemoteObject.createImmutable(" // Tarih: "),psikolojiksil.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((psikolojiksil.mostCurrent._tarih))),RemoteObject.createImmutable(" // Saat: "),psikolojiksil.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((psikolojiksil.mostCurrent._saat))),RemoteObject.createImmutable(""))))),(Object)((psikolojiksil.mostCurrent._bmp.getObject())));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 152;BA.debugLine="rs.Close";
Debug.ShouldStop(8388608);
psikolojiksil.mostCurrent._rs.runVoidMethod ("Close");
 BA.debugLineNum = 153;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("ButtonTc_Click (psikolojiksil) ","psikolojiksil",36,psikolojiksil.mostCurrent.activityBA,psikolojiksil.mostCurrent,168);
if (RapidSub.canDelegate("buttontc_click")) { return b4a.example3.psikolojiksil.remoteMe.runUserSub(false, "psikolojiksil","buttontc_click");}
int _i = 0;
 BA.debugLineNum = 168;BA.debugLine="Sub ButtonTc_Click";
Debug.ShouldStop(128);
 BA.debugLineNum = 169;BA.debugLine="WebView1.Visible = False";
Debug.ShouldStop(256);
psikolojiksil.mostCurrent._webview1.runMethod(true,"setVisible",psikolojiksil.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 170;BA.debugLine="ListView1.Clear";
Debug.ShouldStop(512);
psikolojiksil.mostCurrent._listview1.runVoidMethod ("Clear");
 BA.debugLineNum = 171;BA.debugLine="rs = Main.sql.ExecQuery(\"SELECT * FROM Psikolojik";
Debug.ShouldStop(1024);
psikolojiksil.mostCurrent._rs.setObject(psikolojiksil.mostCurrent._main._sql /*RemoteObject*/ .runMethod(false,"ExecQuery",(Object)(RemoteObject.concat(RemoteObject.createImmutable("SELECT * FROM Psikolojik,Denek WHERE Psikolojik.denek_id = Denek.denek_id AND denek_tc LIKE '%"),psikolojiksil.mostCurrent._edittextara.runMethod(true,"getText"),RemoteObject.createImmutable("%' ORDER BY psikolojik_id DESC")))));
 BA.debugLineNum = 173;BA.debugLine="For i=0 To rs.RowCount-1";
Debug.ShouldStop(4096);
{
final int step4 = 1;
final int limit4 = RemoteObject.solve(new RemoteObject[] {psikolojiksil.mostCurrent._rs.runMethod(true,"getRowCount"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step4 > 0 && _i <= limit4) || (step4 < 0 && _i >= limit4) ;_i = ((int)(0 + _i + step4))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 174;BA.debugLine="rs.Position = i";
Debug.ShouldStop(8192);
psikolojiksil.mostCurrent._rs.runMethod(true,"setPosition",BA.numberCast(int.class, _i));
 BA.debugLineNum = 175;BA.debugLine="VeriAl";
Debug.ShouldStop(16384);
_verial();
 BA.debugLineNum = 176;BA.debugLine="ListView1.AddTwoLinesAndBitmap(id,$\"TC: ${tc} //";
Debug.ShouldStop(32768);
psikolojiksil.mostCurrent._listview1.runVoidMethod ("AddTwoLinesAndBitmap",(Object)(BA.ObjectToCharSequence(psikolojiksil._id)),(Object)(BA.ObjectToCharSequence((RemoteObject.concat(RemoteObject.createImmutable("TC: "),psikolojiksil.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((psikolojiksil.mostCurrent._tc))),RemoteObject.createImmutable(" // Tarih: "),psikolojiksil.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((psikolojiksil.mostCurrent._tarih))),RemoteObject.createImmutable(" // Saat: "),psikolojiksil.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((psikolojiksil.mostCurrent._saat))),RemoteObject.createImmutable(""))))),(Object)((psikolojiksil.mostCurrent._bmp.getObject())));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 178;BA.debugLine="rs.Close";
Debug.ShouldStop(131072);
psikolojiksil.mostCurrent._rs.runVoidMethod ("Close");
 BA.debugLineNum = 179;BA.debugLine="End Sub";
Debug.ShouldStop(262144);
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
		Debug.PushSubsStack("EditTextAra_TextChanged (psikolojiksil) ","psikolojiksil",36,psikolojiksil.mostCurrent.activityBA,psikolojiksil.mostCurrent,124);
if (RapidSub.canDelegate("edittextara_textchanged")) { return b4a.example3.psikolojiksil.remoteMe.runUserSub(false, "psikolojiksil","edittextara_textchanged", _old, _new);}
int _i = 0;
Debug.locals.put("Old", _old);
Debug.locals.put("New", _new);
 BA.debugLineNum = 124;BA.debugLine="Sub EditTextAra_TextChanged (Old As String, New As";
Debug.ShouldStop(134217728);
 BA.debugLineNum = 125;BA.debugLine="WebView1.Visible = False";
Debug.ShouldStop(268435456);
psikolojiksil.mostCurrent._webview1.runMethod(true,"setVisible",psikolojiksil.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 126;BA.debugLine="LabelCarpi.Visible = True";
Debug.ShouldStop(536870912);
psikolojiksil.mostCurrent._labelcarpi.runMethod(true,"setVisible",psikolojiksil.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 127;BA.debugLine="ListView1.Clear";
Debug.ShouldStop(1073741824);
psikolojiksil.mostCurrent._listview1.runVoidMethod ("Clear");
 BA.debugLineNum = 128;BA.debugLine="rs = Main.sql.ExecQuery(\"SELECT * FROM Psikolojik";
Debug.ShouldStop(-2147483648);
psikolojiksil.mostCurrent._rs.setObject(psikolojiksil.mostCurrent._main._sql /*RemoteObject*/ .runMethod(false,"ExecQuery",(Object)(RemoteObject.concat(RemoteObject.createImmutable("SELECT * FROM Psikolojik,Denek WHERE Psikolojik.denek_id = Denek.denek_id AND (denek_tc LIKE '%"),psikolojiksil.mostCurrent._edittextara.runMethod(true,"getText"),RemoteObject.createImmutable("%' OR denek_isim LIKE '%"),psikolojiksil.mostCurrent._edittextara.runMethod(true,"getText"),RemoteObject.createImmutable("%' OR psikolojik_tarih LIKE '%"),psikolojiksil.mostCurrent._edittextara.runMethod(true,"getText"),RemoteObject.createImmutable("%' OR psikolojik_aciklama   LIKE '%"),psikolojiksil.mostCurrent._edittextara.runMethod(true,"getText"),RemoteObject.createImmutable("%') ORDER BY psikolojik_id DESC")))));
 BA.debugLineNum = 130;BA.debugLine="For i=0 To rs.RowCount-1";
Debug.ShouldStop(2);
{
final int step5 = 1;
final int limit5 = RemoteObject.solve(new RemoteObject[] {psikolojiksil.mostCurrent._rs.runMethod(true,"getRowCount"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step5 > 0 && _i <= limit5) || (step5 < 0 && _i >= limit5) ;_i = ((int)(0 + _i + step5))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 131;BA.debugLine="rs.Position = i";
Debug.ShouldStop(4);
psikolojiksil.mostCurrent._rs.runMethod(true,"setPosition",BA.numberCast(int.class, _i));
 BA.debugLineNum = 132;BA.debugLine="VeriAl";
Debug.ShouldStop(8);
_verial();
 BA.debugLineNum = 133;BA.debugLine="ListView1.AddTwoLinesAndBitmap(id,$\"TC: ${tc} //";
Debug.ShouldStop(16);
psikolojiksil.mostCurrent._listview1.runVoidMethod ("AddTwoLinesAndBitmap",(Object)(BA.ObjectToCharSequence(psikolojiksil._id)),(Object)(BA.ObjectToCharSequence((RemoteObject.concat(RemoteObject.createImmutable("TC: "),psikolojiksil.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((psikolojiksil.mostCurrent._tc))),RemoteObject.createImmutable(" // Ad Soyad: "),psikolojiksil.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((psikolojiksil.mostCurrent._isim))),RemoteObject.createImmutable(" // Tarih: "),psikolojiksil.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((psikolojiksil.mostCurrent._tarih))),RemoteObject.createImmutable(" // Saat: "),psikolojiksil.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((psikolojiksil.mostCurrent._saat))),RemoteObject.createImmutable(""))))),(Object)((psikolojiksil.mostCurrent._bmp.getObject())));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 135;BA.debugLine="rs.Close";
Debug.ShouldStop(64);
psikolojiksil.mostCurrent._rs.runVoidMethod ("Close");
 BA.debugLineNum = 136;BA.debugLine="If EditTextAra.Text = \"\" Then";
Debug.ShouldStop(128);
if (RemoteObject.solveBoolean("=",psikolojiksil.mostCurrent._edittextara.runMethod(true,"getText"),BA.ObjectToString(""))) { 
 BA.debugLineNum = 137;BA.debugLine="LabelCarpi.Visible = False";
Debug.ShouldStop(256);
psikolojiksil.mostCurrent._labelcarpi.runMethod(true,"setVisible",psikolojiksil.mostCurrent.__c.getField(true,"False"));
 };
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
public static RemoteObject  _globals() throws Exception{
 //BA.debugLineNum = 12;BA.debugLine="Sub Globals";
 //BA.debugLineNum = 16;BA.debugLine="Private EditTextAra As EditText";
psikolojiksil.mostCurrent._edittextara = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
 //BA.debugLineNum = 17;BA.debugLine="Private WebView1 As WebView";
psikolojiksil.mostCurrent._webview1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.WebViewWrapper");
 //BA.debugLineNum = 18;BA.debugLine="Private ListView1 As ListView";
psikolojiksil.mostCurrent._listview1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.ListViewWrapper");
 //BA.debugLineNum = 19;BA.debugLine="Dim rs As ResultSet";
psikolojiksil.mostCurrent._rs = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL.ResultSetWrapper");
 //BA.debugLineNum = 20;BA.debugLine="Dim id As Int";
psikolojiksil._id = RemoteObject.createImmutable(0);
 //BA.debugLineNum = 21;BA.debugLine="Private ButtonIsim As Button";
psikolojiksil.mostCurrent._buttonisim = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 22;BA.debugLine="Private ButtonTc As Button";
psikolojiksil.mostCurrent._buttontc = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 23;BA.debugLine="Private ButtonPsikolojikAciklama As Button";
psikolojiksil.mostCurrent._buttonpsikolojikaciklama = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 24;BA.debugLine="Private ButtonTarih As Button";
psikolojiksil.mostCurrent._buttontarih = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 26;BA.debugLine="Dim tc,tarih,isim, saat, psikolojik_aciklama As S";
psikolojiksil.mostCurrent._tc = RemoteObject.createImmutable("");
psikolojiksil.mostCurrent._tarih = RemoteObject.createImmutable("");
psikolojiksil.mostCurrent._isim = RemoteObject.createImmutable("");
psikolojiksil.mostCurrent._saat = RemoteObject.createImmutable("");
psikolojiksil.mostCurrent._psikolojik_aciklama = RemoteObject.createImmutable("");
 //BA.debugLineNum = 27;BA.debugLine="Dim id As Int";
psikolojiksil._id = RemoteObject.createImmutable(0);
 //BA.debugLineNum = 28;BA.debugLine="Dim resim() As Byte";
psikolojiksil._resim = RemoteObject.createNewArray ("byte", new int[] {0}, new Object[]{});
 //BA.debugLineNum = 29;BA.debugLine="Dim bmp As Bitmap";
psikolojiksil.mostCurrent._bmp = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper");
 //BA.debugLineNum = 31;BA.debugLine="Private ButtonAnasayfa As Button";
psikolojiksil.mostCurrent._buttonanasayfa = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 32;BA.debugLine="Private LabelCarpi As Label";
psikolojiksil.mostCurrent._labelcarpi = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 33;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _labelcarpi_click() throws Exception{
try {
		Debug.PushSubsStack("LabelCarpi_Click (psikolojiksil) ","psikolojiksil",36,psikolojiksil.mostCurrent.activityBA,psikolojiksil.mostCurrent,245);
if (RapidSub.canDelegate("labelcarpi_click")) { return b4a.example3.psikolojiksil.remoteMe.runUserSub(false, "psikolojiksil","labelcarpi_click");}
 BA.debugLineNum = 245;BA.debugLine="Sub LabelCarpi_Click";
Debug.ShouldStop(1048576);
 BA.debugLineNum = 246;BA.debugLine="EditTextAra.SelectAll";
Debug.ShouldStop(2097152);
psikolojiksil.mostCurrent._edittextara.runVoidMethod ("SelectAll");
 BA.debugLineNum = 247;BA.debugLine="EditTextAra.Text=\"\"";
Debug.ShouldStop(4194304);
psikolojiksil.mostCurrent._edittextara.runMethodAndSync(true,"setText",BA.ObjectToCharSequence(""));
 BA.debugLineNum = 248;BA.debugLine="ListViewGosterDB";
Debug.ShouldStop(8388608);
_listviewgosterdb();
 BA.debugLineNum = 249;BA.debugLine="End Sub";
Debug.ShouldStop(16777216);
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
		Debug.PushSubsStack("ListView1_ItemClick (psikolojiksil) ","psikolojiksil",36,psikolojiksil.mostCurrent.activityBA,psikolojiksil.mostCurrent,207);
if (RapidSub.canDelegate("listview1_itemclick")) { return b4a.example3.psikolojiksil.remoteMe.runUserSub(false, "psikolojiksil","listview1_itemclick", _position, _value);}
Debug.locals.put("Position", _position);
Debug.locals.put("Value", _value);
 BA.debugLineNum = 207;BA.debugLine="Sub ListView1_ItemClick (Position As Int, Value As";
Debug.ShouldStop(16384);
 BA.debugLineNum = 208;BA.debugLine="WebView1.Visible = True";
Debug.ShouldStop(32768);
psikolojiksil.mostCurrent._webview1.runMethod(true,"setVisible",psikolojiksil.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 209;BA.debugLine="WebView1.LoadHtml(DBUtils.ExecuteHtml(Main.sql,\"S";
Debug.ShouldStop(65536);
psikolojiksil.mostCurrent._webview1.runVoidMethod ("LoadHtml",(Object)(psikolojiksil.mostCurrent._dbutils.runMethod(true,"_executehtml" /*RemoteObject*/ ,psikolojiksil.mostCurrent.activityBA,(Object)(psikolojiksil.mostCurrent._main._sql /*RemoteObject*/ ),(Object)(RemoteObject.concat(RemoteObject.createImmutable("SELECT denek_tc As [Denek TC], denek_isim As [Denek İSİM], psikolojik_tarih As [TARİH] ,psikolojik_saat As [SAAT], psikolojik_aciklama  As [PSİKOLOJİK AÇIKLAMA]  FROM Psikolojik,Denek WHERE Psikolojik.denek_id = Denek.denek_id AND psikolojik_id = '"),_value,RemoteObject.createImmutable("' "))),(Object)((psikolojiksil.mostCurrent.__c.getField(false,"Null"))),(Object)(BA.numberCast(int.class, -(double) (0 + 1))),(Object)(psikolojiksil.mostCurrent.__c.getField(true,"False")))));
 BA.debugLineNum = 210;BA.debugLine="Return";
Debug.ShouldStop(131072);
if (true) return RemoteObject.createImmutable("");
 BA.debugLineNum = 211;BA.debugLine="End Sub";
Debug.ShouldStop(262144);
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
		Debug.PushSubsStack("ListView1_ItemLongClick (psikolojiksil) ","psikolojiksil",36,psikolojiksil.mostCurrent.activityBA,psikolojiksil.mostCurrent,213);
if (RapidSub.canDelegate("listview1_itemlongclick")) { return b4a.example3.psikolojiksil.remoteMe.runUserSub(false, "psikolojiksil","listview1_itemlongclick", _position, _value);}
int _i = 0;
RemoteObject _result = RemoteObject.createImmutable(0);
Debug.locals.put("Position", _position);
Debug.locals.put("Value", _value);
 BA.debugLineNum = 213;BA.debugLine="Sub ListView1_ItemLongClick (Position As Int, Valu";
Debug.ShouldStop(1048576);
 BA.debugLineNum = 214;BA.debugLine="rs = Main.sql.ExecQuery(\"SELECT * FROM Psikolojik";
Debug.ShouldStop(2097152);
psikolojiksil.mostCurrent._rs.setObject(psikolojiksil.mostCurrent._main._sql /*RemoteObject*/ .runMethod(false,"ExecQuery",(Object)(RemoteObject.concat(RemoteObject.createImmutable("SELECT * FROM Psikolojik WHERE psikolojik_id = '"),_value,RemoteObject.createImmutable("' ")))));
 BA.debugLineNum = 216;BA.debugLine="For i=0 To rs.RowCount-1";
Debug.ShouldStop(8388608);
{
final int step2 = 1;
final int limit2 = RemoteObject.solve(new RemoteObject[] {psikolojiksil.mostCurrent._rs.runMethod(true,"getRowCount"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step2 > 0 && _i <= limit2) || (step2 < 0 && _i >= limit2) ;_i = ((int)(0 + _i + step2))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 217;BA.debugLine="rs.Position = i";
Debug.ShouldStop(16777216);
psikolojiksil.mostCurrent._rs.runMethod(true,"setPosition",BA.numberCast(int.class, _i));
 BA.debugLineNum = 218;BA.debugLine="id = rs.GetInt(\"psikolojik_id\")";
Debug.ShouldStop(33554432);
psikolojiksil._id = psikolojiksil.mostCurrent._rs.runMethod(true,"GetInt",(Object)(RemoteObject.createImmutable("psikolojik_id")));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 220;BA.debugLine="rs.Close";
Debug.ShouldStop(134217728);
psikolojiksil.mostCurrent._rs.runVoidMethod ("Close");
 BA.debugLineNum = 222;BA.debugLine="Dim result As Int";
Debug.ShouldStop(536870912);
_result = RemoteObject.createImmutable(0);Debug.locals.put("result", _result);
 BA.debugLineNum = 223;BA.debugLine="result = Msgbox2(\"Psikolojik analiz verilerini si";
Debug.ShouldStop(1073741824);
_result = psikolojiksil.mostCurrent.__c.runMethodAndSync(true,"Msgbox2",(Object)(BA.ObjectToCharSequence("Psikolojik analiz verilerini silmek istediğinizden emin misiniz?:")),(Object)(BA.ObjectToCharSequence("Onay Mesajı")),(Object)(BA.ObjectToString("Evet")),(Object)(BA.ObjectToString("")),(Object)(BA.ObjectToString("Hayır")),(Object)((psikolojiksil.mostCurrent.__c.getField(false,"Null"))),psikolojiksil.mostCurrent.activityBA);Debug.locals.put("result", _result);
 BA.debugLineNum = 224;BA.debugLine="If result = DialogResponse.POSITIVE Then";
Debug.ShouldStop(-2147483648);
if (RemoteObject.solveBoolean("=",_result,BA.numberCast(double.class, psikolojiksil.mostCurrent.__c.getField(false,"DialogResponse").getField(true,"POSITIVE")))) { 
 BA.debugLineNum = 225;BA.debugLine="Main.sql.ExecNonQuery(\"DELETE FROM Psikolojik WH";
Debug.ShouldStop(1);
psikolojiksil.mostCurrent._main._sql /*RemoteObject*/ .runVoidMethod ("ExecNonQuery",(Object)(RemoteObject.concat(RemoteObject.createImmutable("DELETE FROM Psikolojik WHERE psikolojik_id = '"),psikolojiksil._id,RemoteObject.createImmutable("' "))));
 BA.debugLineNum = 226;BA.debugLine="ToastMessageShow(\"Psikolojik veriler silindi...\"";
Debug.ShouldStop(2);
psikolojiksil.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("Psikolojik veriler silindi...")),(Object)(psikolojiksil.mostCurrent.__c.getField(true,"False")));
 };
 BA.debugLineNum = 228;BA.debugLine="ListViewGosterDB";
Debug.ShouldStop(8);
_listviewgosterdb();
 BA.debugLineNum = 229;BA.debugLine="End Sub";
Debug.ShouldStop(16);
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
		Debug.PushSubsStack("ListViewGosterDB (psikolojiksil) ","psikolojiksil",36,psikolojiksil.mostCurrent.activityBA,psikolojiksil.mostCurrent,113);
if (RapidSub.canDelegate("listviewgosterdb")) { return b4a.example3.psikolojiksil.remoteMe.runUserSub(false, "psikolojiksil","listviewgosterdb");}
int _i = 0;
 BA.debugLineNum = 113;BA.debugLine="Sub ListViewGosterDB";
Debug.ShouldStop(65536);
 BA.debugLineNum = 114;BA.debugLine="WebView1.Visible = False";
Debug.ShouldStop(131072);
psikolojiksil.mostCurrent._webview1.runMethod(true,"setVisible",psikolojiksil.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 115;BA.debugLine="ListView1.Clear";
Debug.ShouldStop(262144);
psikolojiksil.mostCurrent._listview1.runVoidMethod ("Clear");
 BA.debugLineNum = 116;BA.debugLine="rs = Main.sql.ExecQuery(\"SELECT * FROM Psikolojik";
Debug.ShouldStop(524288);
psikolojiksil.mostCurrent._rs.setObject(psikolojiksil.mostCurrent._main._sql /*RemoteObject*/ .runMethod(false,"ExecQuery",(Object)(RemoteObject.createImmutable("SELECT * FROM Psikolojik,Denek WHERE Psikolojik.denek_id = Denek.denek_id ORDER BY psikolojik_id DESC"))));
 BA.debugLineNum = 117;BA.debugLine="For i=0 To rs.RowCount-1";
Debug.ShouldStop(1048576);
{
final int step4 = 1;
final int limit4 = RemoteObject.solve(new RemoteObject[] {psikolojiksil.mostCurrent._rs.runMethod(true,"getRowCount"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step4 > 0 && _i <= limit4) || (step4 < 0 && _i >= limit4) ;_i = ((int)(0 + _i + step4))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 118;BA.debugLine="rs.Position = i";
Debug.ShouldStop(2097152);
psikolojiksil.mostCurrent._rs.runMethod(true,"setPosition",BA.numberCast(int.class, _i));
 BA.debugLineNum = 119;BA.debugLine="VeriAl";
Debug.ShouldStop(4194304);
_verial();
 BA.debugLineNum = 120;BA.debugLine="ListView1.AddTwoLinesAndBitmap(id,$\"TC: ${tc} //";
Debug.ShouldStop(8388608);
psikolojiksil.mostCurrent._listview1.runVoidMethod ("AddTwoLinesAndBitmap",(Object)(BA.ObjectToCharSequence(psikolojiksil._id)),(Object)(BA.ObjectToCharSequence((RemoteObject.concat(RemoteObject.createImmutable("TC: "),psikolojiksil.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((psikolojiksil.mostCurrent._tc))),RemoteObject.createImmutable(" // Ad Soyad: "),psikolojiksil.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((psikolojiksil.mostCurrent._isim))),RemoteObject.createImmutable(" // Tarih: "),psikolojiksil.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((psikolojiksil.mostCurrent._tarih))),RemoteObject.createImmutable(" // Saat: "),psikolojiksil.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((psikolojiksil.mostCurrent._saat))),RemoteObject.createImmutable(" "))))),(Object)((psikolojiksil.mostCurrent._bmp.getObject())));
 }
}Debug.locals.put("i", _i);
;
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
public static RemoteObject  _process_globals() throws Exception{
 //BA.debugLineNum = 6;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 10;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _setdivider(RemoteObject _lv,RemoteObject _renk,RemoteObject _height) throws Exception{
try {
		Debug.PushSubsStack("SetDivider (psikolojiksil) ","psikolojiksil",36,psikolojiksil.mostCurrent.activityBA,psikolojiksil.mostCurrent,231);
if (RapidSub.canDelegate("setdivider")) { return b4a.example3.psikolojiksil.remoteMe.runUserSub(false, "psikolojiksil","setdivider", _lv, _renk, _height);}
RemoteObject _r = RemoteObject.declareNull("anywheresoftware.b4a.agraham.reflection.Reflection");
RemoteObject _cd = RemoteObject.declareNull("anywheresoftware.b4a.objects.drawable.ColorDrawable");
Debug.locals.put("lv", _lv);
Debug.locals.put("Renk", _renk);
Debug.locals.put("Height", _height);
 BA.debugLineNum = 231;BA.debugLine="Sub SetDivider(lv As ListView, Renk As Int, Height";
Debug.ShouldStop(64);
 BA.debugLineNum = 232;BA.debugLine="Dim r As Reflector";
Debug.ShouldStop(128);
_r = RemoteObject.createNew ("anywheresoftware.b4a.agraham.reflection.Reflection");Debug.locals.put("r", _r);
 BA.debugLineNum = 233;BA.debugLine="r.Target = lv";
Debug.ShouldStop(256);
_r.setField ("Target",(_lv.getObject()));
 BA.debugLineNum = 234;BA.debugLine="Dim CD As ColorDrawable";
Debug.ShouldStop(512);
_cd = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.ColorDrawable");Debug.locals.put("CD", _cd);
 BA.debugLineNum = 235;BA.debugLine="CD.Initialize(Renk, 0)";
Debug.ShouldStop(1024);
_cd.runVoidMethod ("Initialize",(Object)(_renk),(Object)(BA.numberCast(int.class, 0)));
 BA.debugLineNum = 236;BA.debugLine="r.RunMethod4(\"setDivider\", Array As Object(CD), A";
Debug.ShouldStop(2048);
_r.runVoidMethod ("RunMethod4",(Object)(BA.ObjectToString("setDivider")),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(_cd.getObject())})),(Object)(RemoteObject.createNewArray("String",new int[] {1},new Object[] {RemoteObject.createImmutable("android.graphics.drawable.Drawable")})));
 BA.debugLineNum = 237;BA.debugLine="r.RunMethod2(\"setDividerHeight\", Height, \"java.la";
Debug.ShouldStop(4096);
_r.runVoidMethod ("RunMethod2",(Object)(BA.ObjectToString("setDividerHeight")),(Object)(BA.NumberToString(_height)),(Object)(RemoteObject.createImmutable("java.lang.int")));
 BA.debugLineNum = 238;BA.debugLine="End Sub";
Debug.ShouldStop(8192);
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
		Debug.PushSubsStack("VeriAl (psikolojiksil) ","psikolojiksil",36,psikolojiksil.mostCurrent.activityBA,psikolojiksil.mostCurrent,95);
if (RapidSub.canDelegate("verial")) { return b4a.example3.psikolojiksil.remoteMe.runUserSub(false, "psikolojiksil","verial");}
RemoteObject _inputstream = RemoteObject.declareNull("anywheresoftware.b4a.objects.streams.File.InputStreamWrapper");
 BA.debugLineNum = 95;BA.debugLine="Public Sub VeriAl";
Debug.ShouldStop(1073741824);
 BA.debugLineNum = 96;BA.debugLine="id = rs.GetInt(\"psikolojik_id\")";
Debug.ShouldStop(-2147483648);
psikolojiksil._id = psikolojiksil.mostCurrent._rs.runMethod(true,"GetInt",(Object)(RemoteObject.createImmutable("psikolojik_id")));
 BA.debugLineNum = 97;BA.debugLine="tc = rs.GetString(\"denek_tc\")";
Debug.ShouldStop(1);
psikolojiksil.mostCurrent._tc = psikolojiksil.mostCurrent._rs.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("denek_tc")));
 BA.debugLineNum = 98;BA.debugLine="isim = rs.GetString(\"denek_isim\")";
Debug.ShouldStop(2);
psikolojiksil.mostCurrent._isim = psikolojiksil.mostCurrent._rs.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("denek_isim")));
 BA.debugLineNum = 99;BA.debugLine="tarih = rs.GetString(\"psikolojik_tarih\")";
Debug.ShouldStop(4);
psikolojiksil.mostCurrent._tarih = psikolojiksil.mostCurrent._rs.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("psikolojik_tarih")));
 BA.debugLineNum = 100;BA.debugLine="saat = rs.GetString(\"psikolojik_saat\")";
Debug.ShouldStop(8);
psikolojiksil.mostCurrent._saat = psikolojiksil.mostCurrent._rs.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("psikolojik_saat")));
 BA.debugLineNum = 101;BA.debugLine="psikolojik_aciklama = rs.GetString(\"psikolojik_ac";
Debug.ShouldStop(16);
psikolojiksil.mostCurrent._psikolojik_aciklama = psikolojiksil.mostCurrent._rs.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("psikolojik_aciklama")));
 BA.debugLineNum = 102;BA.debugLine="resim = rs.GetBlob(\"denek_image\")";
Debug.ShouldStop(32);
psikolojiksil._resim = psikolojiksil.mostCurrent._rs.runMethod(false,"GetBlob",(Object)(RemoteObject.createImmutable("denek_image")));
 BA.debugLineNum = 103;BA.debugLine="Try";
Debug.ShouldStop(64);
try { BA.debugLineNum = 104;BA.debugLine="Dim inputStream As InputStream";
Debug.ShouldStop(128);
_inputstream = RemoteObject.createNew ("anywheresoftware.b4a.objects.streams.File.InputStreamWrapper");Debug.locals.put("inputStream", _inputstream);
 BA.debugLineNum = 105;BA.debugLine="inputStream.InitializeFromBytesArray(resim, 0, r";
Debug.ShouldStop(256);
_inputstream.runVoidMethod ("InitializeFromBytesArray",(Object)(psikolojiksil._resim),(Object)(BA.numberCast(int.class, 0)),(Object)(psikolojiksil._resim.getField(true,"length")));
 BA.debugLineNum = 106;BA.debugLine="bmp.Initialize2(inputStream)";
Debug.ShouldStop(512);
psikolojiksil.mostCurrent._bmp.runVoidMethod ("Initialize2",(Object)((_inputstream.getObject())));
 BA.debugLineNum = 107;BA.debugLine="inputStream.Close";
Debug.ShouldStop(1024);
_inputstream.runVoidMethod ("Close");
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e14) {
			BA.rdebugUtils.runVoidMethod("setLastException",psikolojiksil.processBA, e14.toString()); BA.debugLineNum = 109;BA.debugLine="bmp = LoadBitmap(File.DirAssets, \"FotoKisi.png\")";
Debug.ShouldStop(4096);
psikolojiksil.mostCurrent._bmp = psikolojiksil.mostCurrent.__c.runMethod(false,"LoadBitmap",(Object)(psikolojiksil.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(RemoteObject.createImmutable("FotoKisi.png")));
 };
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
}