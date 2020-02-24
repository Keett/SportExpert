package b4a.example3;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class antropometriksil_subs_0 {


public static RemoteObject  _activity_create(RemoteObject _firsttime) throws Exception{
try {
		Debug.PushSubsStack("Activity_Create (antropometriksil) ","antropometriksil",38,antropometriksil.mostCurrent.activityBA,antropometriksil.mostCurrent,39);
if (RapidSub.canDelegate("activity_create")) { return b4a.example3.antropometriksil.remoteMe.runUserSub(false, "antropometriksil","activity_create", _firsttime);}
Debug.locals.put("FirstTime", _firsttime);
 BA.debugLineNum = 39;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
Debug.ShouldStop(64);
 BA.debugLineNum = 41;BA.debugLine="Activity.LoadLayout(\"AntropometrikSilPage\")";
Debug.ShouldStop(256);
antropometriksil.mostCurrent._activity.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("AntropometrikSilPage")),antropometriksil.mostCurrent.activityBA);
 BA.debugLineNum = 42;BA.debugLine="WebView1.Visible = False";
Debug.ShouldStop(512);
antropometriksil.mostCurrent._webview1.runMethod(true,"setVisible",antropometriksil.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 43;BA.debugLine="LabelCarpi.Visible = False";
Debug.ShouldStop(1024);
antropometriksil.mostCurrent._labelcarpi.runMethod(true,"setVisible",antropometriksil.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 46;BA.debugLine="ListView1.TwoLinesAndBitmap.Label.Visible = False";
Debug.ShouldStop(8192);
antropometriksil.mostCurrent._listview1.runMethod(false,"getTwoLinesAndBitmap").getField(false,"Label").runMethod(true,"setVisible",antropometriksil.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 47;BA.debugLine="ListView1.TwoLinesAndBitmap.SecondLabel.TextColor";
Debug.ShouldStop(16384);
antropometriksil.mostCurrent._listview1.runMethod(false,"getTwoLinesAndBitmap").getField(false,"SecondLabel").runMethod(true,"setTextColor",antropometriksil.mostCurrent._color._koyumavi /*RemoteObject*/ );
 BA.debugLineNum = 48;BA.debugLine="ListView1.TwoLinesAndBitmap.SecondLabel.TextSize";
Debug.ShouldStop(32768);
antropometriksil.mostCurrent._listview1.runMethod(false,"getTwoLinesAndBitmap").getField(false,"SecondLabel").runMethod(true,"setTextSize",BA.numberCast(float.class, 20));
 BA.debugLineNum = 49;BA.debugLine="SetDivider(ListView1,Color.acikMavi,3dip)";
Debug.ShouldStop(65536);
_setdivider(antropometriksil.mostCurrent._listview1,antropometriksil.mostCurrent._color._acikmavi /*RemoteObject*/ ,antropometriksil.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 3))));
 BA.debugLineNum = 51;BA.debugLine="EditTextAra.TextColor = Colors.White";
Debug.ShouldStop(262144);
antropometriksil.mostCurrent._edittextara.runMethod(true,"setTextColor",antropometriksil.mostCurrent.__c.getField(false,"Colors").getField(true,"White"));
 BA.debugLineNum = 52;BA.debugLine="EditTextAra.Hint = \"Bu alana yazarak aratabilirsi";
Debug.ShouldStop(524288);
antropometriksil.mostCurrent._edittextara.runMethod(true,"setHint",BA.ObjectToString("Bu alana yazarak aratabilirsiniz.."));
 BA.debugLineNum = 53;BA.debugLine="EditTextAra.HintColor = Color.hintColor";
Debug.ShouldStop(1048576);
antropometriksil.mostCurrent._edittextara.runMethod(true,"setHintColor",antropometriksil.mostCurrent._color._hintcolor /*RemoteObject*/ );
 BA.debugLineNum = 54;BA.debugLine="EditTextAra.TextSize = 20";
Debug.ShouldStop(2097152);
antropometriksil.mostCurrent._edittextara.runMethod(true,"setTextSize",BA.numberCast(float.class, 20));
 BA.debugLineNum = 55;BA.debugLine="EditTextAra.Typeface = Typeface.DEFAULT_BOLD";
Debug.ShouldStop(4194304);
antropometriksil.mostCurrent._edittextara.runMethod(false,"setTypeface",antropometriksil.mostCurrent.__c.getField(false,"Typeface").getField(false,"DEFAULT_BOLD"));
 BA.debugLineNum = 57;BA.debugLine="WebView1.JavaScriptEnabled = True";
Debug.ShouldStop(16777216);
antropometriksil.mostCurrent._webview1.runMethod(true,"setJavaScriptEnabled",antropometriksil.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 58;BA.debugLine="WebView1.ZoomEnabled = True";
Debug.ShouldStop(33554432);
antropometriksil.mostCurrent._webview1.runMethod(true,"setZoomEnabled",antropometriksil.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 60;BA.debugLine="ButtonDeriKivrimKalinligi.TextColor = Color.koyuM";
Debug.ShouldStop(134217728);
antropometriksil.mostCurrent._buttonderikivrimkalinligi.runMethod(true,"setTextColor",antropometriksil.mostCurrent._color._koyumavi /*RemoteObject*/ );
 BA.debugLineNum = 61;BA.debugLine="ButtonDeriKivrimKalinligi.Typeface = Typeface.DEF";
Debug.ShouldStop(268435456);
antropometriksil.mostCurrent._buttonderikivrimkalinligi.runMethod(false,"setTypeface",antropometriksil.mostCurrent.__c.getField(false,"Typeface").getField(false,"DEFAULT_BOLD"));
 BA.debugLineNum = 62;BA.debugLine="ButtonDeriKivrimKalinligi.Text = \"DERİ KIVRIM KAL";
Debug.ShouldStop(536870912);
antropometriksil.mostCurrent._buttonderikivrimkalinligi.runMethod(true,"setText",BA.ObjectToCharSequence("DERİ KIVRIM KALINLIĞI"));
 BA.debugLineNum = 63;BA.debugLine="ButtonDeriKivrimKalinligi.TextSize = 14";
Debug.ShouldStop(1073741824);
antropometriksil.mostCurrent._buttonderikivrimkalinligi.runMethod(true,"setTextSize",BA.numberCast(float.class, 14));
 BA.debugLineNum = 64;BA.debugLine="ButtonDeriKivrimKalinligi.SingleLine = True";
Debug.ShouldStop(-2147483648);
antropometriksil.mostCurrent._buttonderikivrimkalinligi.runVoidMethod ("setSingleLine",antropometriksil.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 66;BA.debugLine="ButtonAyakUzunlugu.TextColor = Color.koyuMavi";
Debug.ShouldStop(2);
antropometriksil.mostCurrent._buttonayakuzunlugu.runMethod(true,"setTextColor",antropometriksil.mostCurrent._color._koyumavi /*RemoteObject*/ );
 BA.debugLineNum = 67;BA.debugLine="ButtonAyakUzunlugu.Typeface = Typeface.DEFAULT_BO";
Debug.ShouldStop(4);
antropometriksil.mostCurrent._buttonayakuzunlugu.runMethod(false,"setTypeface",antropometriksil.mostCurrent.__c.getField(false,"Typeface").getField(false,"DEFAULT_BOLD"));
 BA.debugLineNum = 68;BA.debugLine="ButtonAyakUzunlugu.Text = \"AYAK UZUNLUĞU\"";
Debug.ShouldStop(8);
antropometriksil.mostCurrent._buttonayakuzunlugu.runMethod(true,"setText",BA.ObjectToCharSequence("AYAK UZUNLUĞU"));
 BA.debugLineNum = 69;BA.debugLine="ButtonAyakUzunlugu.TextSize = 14";
Debug.ShouldStop(16);
antropometriksil.mostCurrent._buttonayakuzunlugu.runMethod(true,"setTextSize",BA.numberCast(float.class, 14));
 BA.debugLineNum = 70;BA.debugLine="ButtonAyakUzunlugu.SingleLine = True";
Debug.ShouldStop(32);
antropometriksil.mostCurrent._buttonayakuzunlugu.runVoidMethod ("setSingleLine",antropometriksil.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 72;BA.debugLine="ButtonKulacUzunlugu.TextColor = Color.koyuMavi";
Debug.ShouldStop(128);
antropometriksil.mostCurrent._buttonkulacuzunlugu.runMethod(true,"setTextColor",antropometriksil.mostCurrent._color._koyumavi /*RemoteObject*/ );
 BA.debugLineNum = 73;BA.debugLine="ButtonKulacUzunlugu.Typeface = Typeface.DEFAULT_B";
Debug.ShouldStop(256);
antropometriksil.mostCurrent._buttonkulacuzunlugu.runMethod(false,"setTypeface",antropometriksil.mostCurrent.__c.getField(false,"Typeface").getField(false,"DEFAULT_BOLD"));
 BA.debugLineNum = 74;BA.debugLine="ButtonKulacUzunlugu.Text = \"KULAÇ UZUNLUĞU\"";
Debug.ShouldStop(512);
antropometriksil.mostCurrent._buttonkulacuzunlugu.runMethod(true,"setText",BA.ObjectToCharSequence("KULAÇ UZUNLUĞU"));
 BA.debugLineNum = 75;BA.debugLine="ButtonKulacUzunlugu.TextSize = 14";
Debug.ShouldStop(1024);
antropometriksil.mostCurrent._buttonkulacuzunlugu.runMethod(true,"setTextSize",BA.numberCast(float.class, 14));
 BA.debugLineNum = 76;BA.debugLine="ButtonKulacUzunlugu.SingleLine = True";
Debug.ShouldStop(2048);
antropometriksil.mostCurrent._buttonkulacuzunlugu.runVoidMethod ("setSingleLine",antropometriksil.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 78;BA.debugLine="ButtonOturmaYuksekligi.TextColor = Color.koyuMavi";
Debug.ShouldStop(8192);
antropometriksil.mostCurrent._buttonoturmayuksekligi.runMethod(true,"setTextColor",antropometriksil.mostCurrent._color._koyumavi /*RemoteObject*/ );
 BA.debugLineNum = 79;BA.debugLine="ButtonOturmaYuksekligi.Typeface = Typeface.DEFAUL";
Debug.ShouldStop(16384);
antropometriksil.mostCurrent._buttonoturmayuksekligi.runMethod(false,"setTypeface",antropometriksil.mostCurrent.__c.getField(false,"Typeface").getField(false,"DEFAULT_BOLD"));
 BA.debugLineNum = 80;BA.debugLine="ButtonOturmaYuksekligi.Text = \"OTURMA YÜKSEKLİĞİ\"";
Debug.ShouldStop(32768);
antropometriksil.mostCurrent._buttonoturmayuksekligi.runMethod(true,"setText",BA.ObjectToCharSequence("OTURMA YÜKSEKLİĞİ"));
 BA.debugLineNum = 81;BA.debugLine="ButtonOturmaYuksekligi.TextSize = 14";
Debug.ShouldStop(65536);
antropometriksil.mostCurrent._buttonoturmayuksekligi.runMethod(true,"setTextSize",BA.numberCast(float.class, 14));
 BA.debugLineNum = 82;BA.debugLine="ButtonOturmaYuksekligi.SingleLine = True";
Debug.ShouldStop(131072);
antropometriksil.mostCurrent._buttonoturmayuksekligi.runVoidMethod ("setSingleLine",antropometriksil.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 84;BA.debugLine="ButtonElUzunlugu.TextColor = Color.koyuMavi";
Debug.ShouldStop(524288);
antropometriksil.mostCurrent._buttoneluzunlugu.runMethod(true,"setTextColor",antropometriksil.mostCurrent._color._koyumavi /*RemoteObject*/ );
 BA.debugLineNum = 85;BA.debugLine="ButtonElUzunlugu.Typeface = Typeface.DEFAULT_BOLD";
Debug.ShouldStop(1048576);
antropometriksil.mostCurrent._buttoneluzunlugu.runMethod(false,"setTypeface",antropometriksil.mostCurrent.__c.getField(false,"Typeface").getField(false,"DEFAULT_BOLD"));
 BA.debugLineNum = 86;BA.debugLine="ButtonElUzunlugu.Text = \"EL UZUNLUĞU\"";
Debug.ShouldStop(2097152);
antropometriksil.mostCurrent._buttoneluzunlugu.runMethod(true,"setText",BA.ObjectToCharSequence("EL UZUNLUĞU"));
 BA.debugLineNum = 87;BA.debugLine="ButtonElUzunlugu.TextSize = 14";
Debug.ShouldStop(4194304);
antropometriksil.mostCurrent._buttoneluzunlugu.runMethod(true,"setTextSize",BA.numberCast(float.class, 14));
 BA.debugLineNum = 88;BA.debugLine="ButtonElUzunlugu.SingleLine = True";
Debug.ShouldStop(8388608);
antropometriksil.mostCurrent._buttoneluzunlugu.runVoidMethod ("setSingleLine",antropometriksil.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 90;BA.debugLine="ButtonKilo.TextColor = Color.koyuMavi";
Debug.ShouldStop(33554432);
antropometriksil.mostCurrent._buttonkilo.runMethod(true,"setTextColor",antropometriksil.mostCurrent._color._koyumavi /*RemoteObject*/ );
 BA.debugLineNum = 91;BA.debugLine="ButtonKilo.Typeface = Typeface.DEFAULT_BOLD";
Debug.ShouldStop(67108864);
antropometriksil.mostCurrent._buttonkilo.runMethod(false,"setTypeface",antropometriksil.mostCurrent.__c.getField(false,"Typeface").getField(false,"DEFAULT_BOLD"));
 BA.debugLineNum = 92;BA.debugLine="ButtonKilo.Text = \"KİLO\"";
Debug.ShouldStop(134217728);
antropometriksil.mostCurrent._buttonkilo.runMethod(true,"setText",BA.ObjectToCharSequence("KİLO"));
 BA.debugLineNum = 93;BA.debugLine="ButtonKilo.TextSize = 14";
Debug.ShouldStop(268435456);
antropometriksil.mostCurrent._buttonkilo.runMethod(true,"setTextSize",BA.numberCast(float.class, 14));
 BA.debugLineNum = 94;BA.debugLine="ButtonKilo.SingleLine = True";
Debug.ShouldStop(536870912);
antropometriksil.mostCurrent._buttonkilo.runVoidMethod ("setSingleLine",antropometriksil.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 96;BA.debugLine="ButtonTc.TextColor = Color.koyuMavi";
Debug.ShouldStop(-2147483648);
antropometriksil.mostCurrent._buttontc.runMethod(true,"setTextColor",antropometriksil.mostCurrent._color._koyumavi /*RemoteObject*/ );
 BA.debugLineNum = 97;BA.debugLine="ButtonTc.Typeface = Typeface.DEFAULT_BOLD";
Debug.ShouldStop(1);
antropometriksil.mostCurrent._buttontc.runMethod(false,"setTypeface",antropometriksil.mostCurrent.__c.getField(false,"Typeface").getField(false,"DEFAULT_BOLD"));
 BA.debugLineNum = 98;BA.debugLine="ButtonTc.Text = \"TC\"";
Debug.ShouldStop(2);
antropometriksil.mostCurrent._buttontc.runMethod(true,"setText",BA.ObjectToCharSequence("TC"));
 BA.debugLineNum = 99;BA.debugLine="ButtonTc.TextSize = 14";
Debug.ShouldStop(4);
antropometriksil.mostCurrent._buttontc.runMethod(true,"setTextSize",BA.numberCast(float.class, 14));
 BA.debugLineNum = 100;BA.debugLine="ButtonTc.SingleLine = True";
Debug.ShouldStop(8);
antropometriksil.mostCurrent._buttontc.runVoidMethod ("setSingleLine",antropometriksil.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 102;BA.debugLine="ButtonTarih.TextColor = Color.koyuMavi";
Debug.ShouldStop(32);
antropometriksil.mostCurrent._buttontarih.runMethod(true,"setTextColor",antropometriksil.mostCurrent._color._koyumavi /*RemoteObject*/ );
 BA.debugLineNum = 103;BA.debugLine="ButtonTarih.Typeface = Typeface.DEFAULT_BOLD";
Debug.ShouldStop(64);
antropometriksil.mostCurrent._buttontarih.runMethod(false,"setTypeface",antropometriksil.mostCurrent.__c.getField(false,"Typeface").getField(false,"DEFAULT_BOLD"));
 BA.debugLineNum = 104;BA.debugLine="ButtonTarih.Text = \"TARİH\"";
Debug.ShouldStop(128);
antropometriksil.mostCurrent._buttontarih.runMethod(true,"setText",BA.ObjectToCharSequence("TARİH"));
 BA.debugLineNum = 105;BA.debugLine="ButtonTarih.TextSize = 14";
Debug.ShouldStop(256);
antropometriksil.mostCurrent._buttontarih.runMethod(true,"setTextSize",BA.numberCast(float.class, 14));
 BA.debugLineNum = 106;BA.debugLine="ButtonTc.SingleLine = True";
Debug.ShouldStop(512);
antropometriksil.mostCurrent._buttontc.runVoidMethod ("setSingleLine",antropometriksil.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 108;BA.debugLine="ButtonBoy.TextColor = Color.koyuMavi";
Debug.ShouldStop(2048);
antropometriksil.mostCurrent._buttonboy.runMethod(true,"setTextColor",antropometriksil.mostCurrent._color._koyumavi /*RemoteObject*/ );
 BA.debugLineNum = 109;BA.debugLine="ButtonBoy.Typeface = Typeface.DEFAULT_BOLD";
Debug.ShouldStop(4096);
antropometriksil.mostCurrent._buttonboy.runMethod(false,"setTypeface",antropometriksil.mostCurrent.__c.getField(false,"Typeface").getField(false,"DEFAULT_BOLD"));
 BA.debugLineNum = 110;BA.debugLine="ButtonBoy.Text = \"BOY\"";
Debug.ShouldStop(8192);
antropometriksil.mostCurrent._buttonboy.runMethod(true,"setText",BA.ObjectToCharSequence("BOY"));
 BA.debugLineNum = 111;BA.debugLine="ButtonBoy.TextSize = 14";
Debug.ShouldStop(16384);
antropometriksil.mostCurrent._buttonboy.runMethod(true,"setTextSize",BA.numberCast(float.class, 14));
 BA.debugLineNum = 112;BA.debugLine="ButtonBoy.SingleLine = True";
Debug.ShouldStop(32768);
antropometriksil.mostCurrent._buttonboy.runVoidMethod ("setSingleLine",antropometriksil.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 116;BA.debugLine="ListViewGosterDB";
Debug.ShouldStop(524288);
_listviewgosterdb();
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
public static RemoteObject  _activity_pause(RemoteObject _userclosed) throws Exception{
try {
		Debug.PushSubsStack("Activity_Pause (antropometriksil) ","antropometriksil",38,antropometriksil.mostCurrent.activityBA,antropometriksil.mostCurrent,124);
if (RapidSub.canDelegate("activity_pause")) { return b4a.example3.antropometriksil.remoteMe.runUserSub(false, "antropometriksil","activity_pause", _userclosed);}
Debug.locals.put("UserClosed", _userclosed);
 BA.debugLineNum = 124;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
Debug.ShouldStop(134217728);
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
public static RemoteObject  _activity_resume() throws Exception{
try {
		Debug.PushSubsStack("Activity_Resume (antropometriksil) ","antropometriksil",38,antropometriksil.mostCurrent.activityBA,antropometriksil.mostCurrent,120);
if (RapidSub.canDelegate("activity_resume")) { return b4a.example3.antropometriksil.remoteMe.runUserSub(false, "antropometriksil","activity_resume");}
 BA.debugLineNum = 120;BA.debugLine="Sub Activity_Resume";
Debug.ShouldStop(8388608);
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
public static RemoteObject  _buttonanasayfa_click() throws Exception{
try {
		Debug.PushSubsStack("ButtonAnasayfa_Click (antropometriksil) ","antropometriksil",38,antropometriksil.mostCurrent.activityBA,antropometriksil.mostCurrent,340);
if (RapidSub.canDelegate("buttonanasayfa_click")) { return b4a.example3.antropometriksil.remoteMe.runUserSub(false, "antropometriksil","buttonanasayfa_click");}
 BA.debugLineNum = 340;BA.debugLine="Sub ButtonAnasayfa_Click";
Debug.ShouldStop(524288);
 BA.debugLineNum = 341;BA.debugLine="StartActivity(AnaMenu)";
Debug.ShouldStop(1048576);
antropometriksil.mostCurrent.__c.runVoidMethod ("StartActivity",antropometriksil.processBA,(Object)((antropometriksil.mostCurrent._anamenu.getObject())));
 BA.debugLineNum = 342;BA.debugLine="Activity.Finish";
Debug.ShouldStop(2097152);
antropometriksil.mostCurrent._activity.runVoidMethod ("Finish");
 BA.debugLineNum = 343;BA.debugLine="End Sub";
Debug.ShouldStop(4194304);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _buttonantropometrikekle_click() throws Exception{
try {
		Debug.PushSubsStack("ButtonAntropometrikEkle_Click (antropometriksil) ","antropometriksil",38,antropometriksil.mostCurrent.activityBA,antropometriksil.mostCurrent,319);
if (RapidSub.canDelegate("buttonantropometrikekle_click")) { return b4a.example3.antropometriksil.remoteMe.runUserSub(false, "antropometriksil","buttonantropometrikekle_click");}
 BA.debugLineNum = 319;BA.debugLine="Sub ButtonAntropometrikEkle_Click";
Debug.ShouldStop(1073741824);
 BA.debugLineNum = 320;BA.debugLine="WebView1.Visible = False";
Debug.ShouldStop(-2147483648);
antropometriksil.mostCurrent._webview1.runMethod(true,"setVisible",antropometriksil.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 321;BA.debugLine="StartActivity(AntropometrikEkle)";
Debug.ShouldStop(1);
antropometriksil.mostCurrent.__c.runVoidMethod ("StartActivity",antropometriksil.processBA,(Object)((antropometriksil.mostCurrent._antropometrikekle.getObject())));
 BA.debugLineNum = 322;BA.debugLine="Activity.Finish";
Debug.ShouldStop(2);
antropometriksil.mostCurrent._activity.runVoidMethod ("Finish");
 BA.debugLineNum = 323;BA.debugLine="End Sub";
Debug.ShouldStop(4);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _buttonayakuzunlugu_click() throws Exception{
try {
		Debug.PushSubsStack("ButtonAyakUzunlugu_Click (antropometriksil) ","antropometriksil",38,antropometriksil.mostCurrent.activityBA,antropometriksil.mostCurrent,263);
if (RapidSub.canDelegate("buttonayakuzunlugu_click")) { return b4a.example3.antropometriksil.remoteMe.runUserSub(false, "antropometriksil","buttonayakuzunlugu_click");}
int _i = 0;
 BA.debugLineNum = 263;BA.debugLine="Sub ButtonAyakUzunlugu_Click";
Debug.ShouldStop(64);
 BA.debugLineNum = 264;BA.debugLine="WebView1.Visible = False";
Debug.ShouldStop(128);
antropometriksil.mostCurrent._webview1.runMethod(true,"setVisible",antropometriksil.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 265;BA.debugLine="ListView1.Clear";
Debug.ShouldStop(256);
antropometriksil.mostCurrent._listview1.runVoidMethod ("Clear");
 BA.debugLineNum = 266;BA.debugLine="rs = Main.sql.ExecQuery(\"SELECT * FROM Antropomet";
Debug.ShouldStop(512);
antropometriksil.mostCurrent._rs.setObject(antropometriksil.mostCurrent._main._sql /*RemoteObject*/ .runMethod(false,"ExecQuery",(Object)(RemoteObject.concat(RemoteObject.createImmutable("SELECT * FROM Antropometrik, Denek WHERE Antropometrik.denek_id = Denek.denek_id AND antropometrik_ayakUzunlugu LIKE '%"),antropometriksil.mostCurrent._edittextara.runMethod(true,"getText"),RemoteObject.createImmutable("%' ORDER BY antropometrik_id DESC")))));
 BA.debugLineNum = 268;BA.debugLine="For i=0 To rs.RowCount-1";
Debug.ShouldStop(2048);
{
final int step4 = 1;
final int limit4 = RemoteObject.solve(new RemoteObject[] {antropometriksil.mostCurrent._rs.runMethod(true,"getRowCount"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step4 > 0 && _i <= limit4) || (step4 < 0 && _i >= limit4) ;_i = ((int)(0 + _i + step4))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 269;BA.debugLine="rs.Position = i";
Debug.ShouldStop(4096);
antropometriksil.mostCurrent._rs.runMethod(true,"setPosition",BA.numberCast(int.class, _i));
 BA.debugLineNum = 270;BA.debugLine="VeriAl";
Debug.ShouldStop(8192);
_verial();
 BA.debugLineNum = 271;BA.debugLine="ListView1.AddTwoLinesAndBitmap(id,$\"TC: ${tc} //";
Debug.ShouldStop(16384);
antropometriksil.mostCurrent._listview1.runVoidMethod ("AddTwoLinesAndBitmap",(Object)(BA.ObjectToCharSequence(antropometriksil._id)),(Object)(BA.ObjectToCharSequence((RemoteObject.concat(RemoteObject.createImmutable("TC: "),antropometriksil.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((antropometriksil.mostCurrent._tc))),RemoteObject.createImmutable(" // Ad Soyad: "),antropometriksil.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((antropometriksil.mostCurrent._isim))),RemoteObject.createImmutable(" // Tarih: "),antropometriksil.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((antropometriksil.mostCurrent._tarih))),RemoteObject.createImmutable(" // Saat: "),antropometriksil.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((antropometriksil.mostCurrent._saat))),RemoteObject.createImmutable(" // Ayak Uzunluğu: "),antropometriksil.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((antropometriksil._ayak_uzunlugu))),RemoteObject.createImmutable(""))))),(Object)((antropometriksil.mostCurrent._bmp.getObject())));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 273;BA.debugLine="rs.Close";
Debug.ShouldStop(65536);
antropometriksil.mostCurrent._rs.runVoidMethod ("Close");
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
public static RemoteObject  _buttonboy_click() throws Exception{
try {
		Debug.PushSubsStack("ButtonBoy_Click (antropometriksil) ","antropometriksil",38,antropometriksil.mostCurrent.activityBA,antropometriksil.mostCurrent,198);
if (RapidSub.canDelegate("buttonboy_click")) { return b4a.example3.antropometriksil.remoteMe.runUserSub(false, "antropometriksil","buttonboy_click");}
int _i = 0;
 BA.debugLineNum = 198;BA.debugLine="Sub ButtonBoy_Click";
Debug.ShouldStop(32);
 BA.debugLineNum = 199;BA.debugLine="WebView1.Visible = False";
Debug.ShouldStop(64);
antropometriksil.mostCurrent._webview1.runMethod(true,"setVisible",antropometriksil.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 200;BA.debugLine="ListView1.Clear";
Debug.ShouldStop(128);
antropometriksil.mostCurrent._listview1.runVoidMethod ("Clear");
 BA.debugLineNum = 201;BA.debugLine="rs = Main.sql.ExecQuery(\"SELECT * FROM Antropomet";
Debug.ShouldStop(256);
antropometriksil.mostCurrent._rs.setObject(antropometriksil.mostCurrent._main._sql /*RemoteObject*/ .runMethod(false,"ExecQuery",(Object)(RemoteObject.concat(RemoteObject.createImmutable("SELECT * FROM Antropometrik, Denek WHERE Antropometrik.denek_id = Denek.denek_id AND antropometrik_boy LIKE '%"),antropometriksil.mostCurrent._edittextara.runMethod(true,"getText"),RemoteObject.createImmutable("%' ORDER BY antropometrik_id DESC ")))));
 BA.debugLineNum = 203;BA.debugLine="For i=0 To rs.RowCount-1";
Debug.ShouldStop(1024);
{
final int step4 = 1;
final int limit4 = RemoteObject.solve(new RemoteObject[] {antropometriksil.mostCurrent._rs.runMethod(true,"getRowCount"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step4 > 0 && _i <= limit4) || (step4 < 0 && _i >= limit4) ;_i = ((int)(0 + _i + step4))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 204;BA.debugLine="rs.Position = i";
Debug.ShouldStop(2048);
antropometriksil.mostCurrent._rs.runMethod(true,"setPosition",BA.numberCast(int.class, _i));
 BA.debugLineNum = 205;BA.debugLine="VeriAl";
Debug.ShouldStop(4096);
_verial();
 BA.debugLineNum = 206;BA.debugLine="ListView1.AddTwoLinesAndBitmap(id,$\"TC: ${tc} //";
Debug.ShouldStop(8192);
antropometriksil.mostCurrent._listview1.runVoidMethod ("AddTwoLinesAndBitmap",(Object)(BA.ObjectToCharSequence(antropometriksil._id)),(Object)(BA.ObjectToCharSequence((RemoteObject.concat(RemoteObject.createImmutable("TC: "),antropometriksil.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((antropometriksil.mostCurrent._tc))),RemoteObject.createImmutable(" // Ad Soyad: "),antropometriksil.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((antropometriksil.mostCurrent._isim))),RemoteObject.createImmutable(" // Tarih: "),antropometriksil.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((antropometriksil.mostCurrent._tarih))),RemoteObject.createImmutable(" // Saat: "),antropometriksil.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((antropometriksil.mostCurrent._saat))),RemoteObject.createImmutable(" // Boy: "),antropometriksil.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((antropometriksil._boy))),RemoteObject.createImmutable(""))))),(Object)((antropometriksil.mostCurrent._bmp.getObject())));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 208;BA.debugLine="rs.Close";
Debug.ShouldStop(32768);
antropometriksil.mostCurrent._rs.runVoidMethod ("Close");
 BA.debugLineNum = 209;BA.debugLine="End Sub";
Debug.ShouldStop(65536);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _buttonderikivrimkalinligi_click() throws Exception{
try {
		Debug.PushSubsStack("ButtonDeriKivrimKalinligi_Click (antropometriksil) ","antropometriksil",38,antropometriksil.mostCurrent.activityBA,antropometriksil.mostCurrent,276);
if (RapidSub.canDelegate("buttonderikivrimkalinligi_click")) { return b4a.example3.antropometriksil.remoteMe.runUserSub(false, "antropometriksil","buttonderikivrimkalinligi_click");}
int _i = 0;
 BA.debugLineNum = 276;BA.debugLine="Sub ButtonDeriKivrimKalinligi_Click";
Debug.ShouldStop(524288);
 BA.debugLineNum = 277;BA.debugLine="WebView1.Visible = False";
Debug.ShouldStop(1048576);
antropometriksil.mostCurrent._webview1.runMethod(true,"setVisible",antropometriksil.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 278;BA.debugLine="ListView1.Clear";
Debug.ShouldStop(2097152);
antropometriksil.mostCurrent._listview1.runVoidMethod ("Clear");
 BA.debugLineNum = 279;BA.debugLine="rs = Main.sql.ExecQuery(\"SELECT * FROM Antropomet";
Debug.ShouldStop(4194304);
antropometriksil.mostCurrent._rs.setObject(antropometriksil.mostCurrent._main._sql /*RemoteObject*/ .runMethod(false,"ExecQuery",(Object)(RemoteObject.concat(RemoteObject.createImmutable("SELECT * FROM Antropometrik, Denek WHERE Antropometrik.denek_id = Denek.denek_id  AND antropometrik_deriKivrimKalinligi  LIKE '%"),antropometriksil.mostCurrent._edittextara.runMethod(true,"getText"),RemoteObject.createImmutable("%' ORDER BY antropometrik_id DESC ")))));
 BA.debugLineNum = 281;BA.debugLine="For i=0 To rs.RowCount-1";
Debug.ShouldStop(16777216);
{
final int step4 = 1;
final int limit4 = RemoteObject.solve(new RemoteObject[] {antropometriksil.mostCurrent._rs.runMethod(true,"getRowCount"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step4 > 0 && _i <= limit4) || (step4 < 0 && _i >= limit4) ;_i = ((int)(0 + _i + step4))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 282;BA.debugLine="rs.Position = i";
Debug.ShouldStop(33554432);
antropometriksil.mostCurrent._rs.runMethod(true,"setPosition",BA.numberCast(int.class, _i));
 BA.debugLineNum = 283;BA.debugLine="VeriAl";
Debug.ShouldStop(67108864);
_verial();
 BA.debugLineNum = 284;BA.debugLine="ListView1.AddTwoLinesAndBitmap(id,$\"TC: ${tc} //";
Debug.ShouldStop(134217728);
antropometriksil.mostCurrent._listview1.runVoidMethod ("AddTwoLinesAndBitmap",(Object)(BA.ObjectToCharSequence(antropometriksil._id)),(Object)(BA.ObjectToCharSequence((RemoteObject.concat(RemoteObject.createImmutable("TC: "),antropometriksil.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((antropometriksil.mostCurrent._tc))),RemoteObject.createImmutable(" // Ad Soyad: "),antropometriksil.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((antropometriksil.mostCurrent._isim))),RemoteObject.createImmutable(" // Tarih: "),antropometriksil.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((antropometriksil.mostCurrent._tarih))),RemoteObject.createImmutable(" // Saat: "),antropometriksil.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((antropometriksil.mostCurrent._saat))),RemoteObject.createImmutable(" // Deri Kıvrım Kalınlığı: "),antropometriksil.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((antropometriksil._derikivrim_kalinligi))),RemoteObject.createImmutable(""))))),(Object)((antropometriksil.mostCurrent._bmp.getObject())));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 286;BA.debugLine="rs.Close";
Debug.ShouldStop(536870912);
antropometriksil.mostCurrent._rs.runVoidMethod ("Close");
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
public static RemoteObject  _buttoneluzunlugu_click() throws Exception{
try {
		Debug.PushSubsStack("ButtonElUzunlugu_Click (antropometriksil) ","antropometriksil",38,antropometriksil.mostCurrent.activityBA,antropometriksil.mostCurrent,224);
if (RapidSub.canDelegate("buttoneluzunlugu_click")) { return b4a.example3.antropometriksil.remoteMe.runUserSub(false, "antropometriksil","buttoneluzunlugu_click");}
int _i = 0;
 BA.debugLineNum = 224;BA.debugLine="Sub ButtonElUzunlugu_Click";
Debug.ShouldStop(-2147483648);
 BA.debugLineNum = 225;BA.debugLine="WebView1.Visible = False";
Debug.ShouldStop(1);
antropometriksil.mostCurrent._webview1.runMethod(true,"setVisible",antropometriksil.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 226;BA.debugLine="ListView1.Clear";
Debug.ShouldStop(2);
antropometriksil.mostCurrent._listview1.runVoidMethod ("Clear");
 BA.debugLineNum = 227;BA.debugLine="rs = Main.sql.ExecQuery(\"SELECT * FROM Antropomet";
Debug.ShouldStop(4);
antropometriksil.mostCurrent._rs.setObject(antropometriksil.mostCurrent._main._sql /*RemoteObject*/ .runMethod(false,"ExecQuery",(Object)(RemoteObject.concat(RemoteObject.createImmutable("SELECT * FROM Antropometrik, Denek WHERE Antropometrik.denek_id = Denek.denek_id AND antropometrik_elUzunlugu LIKE '%"),antropometriksil.mostCurrent._edittextara.runMethod(true,"getText"),RemoteObject.createImmutable("%' ORDER BY antropometrik_id DESC")))));
 BA.debugLineNum = 229;BA.debugLine="For i=0 To rs.RowCount-1";
Debug.ShouldStop(16);
{
final int step4 = 1;
final int limit4 = RemoteObject.solve(new RemoteObject[] {antropometriksil.mostCurrent._rs.runMethod(true,"getRowCount"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step4 > 0 && _i <= limit4) || (step4 < 0 && _i >= limit4) ;_i = ((int)(0 + _i + step4))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 230;BA.debugLine="rs.Position = i";
Debug.ShouldStop(32);
antropometriksil.mostCurrent._rs.runMethod(true,"setPosition",BA.numberCast(int.class, _i));
 BA.debugLineNum = 231;BA.debugLine="VeriAl";
Debug.ShouldStop(64);
_verial();
 BA.debugLineNum = 232;BA.debugLine="ListView1.AddTwoLinesAndBitmap(id,$\"TC: ${tc} //";
Debug.ShouldStop(128);
antropometriksil.mostCurrent._listview1.runVoidMethod ("AddTwoLinesAndBitmap",(Object)(BA.ObjectToCharSequence(antropometriksil._id)),(Object)(BA.ObjectToCharSequence((RemoteObject.concat(RemoteObject.createImmutable("TC: "),antropometriksil.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((antropometriksil.mostCurrent._tc))),RemoteObject.createImmutable(" // Ad Soyad: "),antropometriksil.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((antropometriksil.mostCurrent._isim))),RemoteObject.createImmutable(" // Tarih: "),antropometriksil.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((antropometriksil.mostCurrent._tarih))),RemoteObject.createImmutable(" // Saat: "),antropometriksil.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((antropometriksil.mostCurrent._saat))),RemoteObject.createImmutable(" // El Uzunluğu: "),antropometriksil.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((antropometriksil._el_uzunlugu))),RemoteObject.createImmutable(""))))),(Object)((antropometriksil.mostCurrent._bmp.getObject())));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 234;BA.debugLine="rs.Close";
Debug.ShouldStop(512);
antropometriksil.mostCurrent._rs.runVoidMethod ("Close");
 BA.debugLineNum = 235;BA.debugLine="End Sub";
Debug.ShouldStop(1024);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _buttonkilo_click() throws Exception{
try {
		Debug.PushSubsStack("ButtonKilo_Click (antropometriksil) ","antropometriksil",38,antropometriksil.mostCurrent.activityBA,antropometriksil.mostCurrent,211);
if (RapidSub.canDelegate("buttonkilo_click")) { return b4a.example3.antropometriksil.remoteMe.runUserSub(false, "antropometriksil","buttonkilo_click");}
int _i = 0;
 BA.debugLineNum = 211;BA.debugLine="Sub ButtonKilo_Click";
Debug.ShouldStop(262144);
 BA.debugLineNum = 212;BA.debugLine="WebView1.Visible = False";
Debug.ShouldStop(524288);
antropometriksil.mostCurrent._webview1.runMethod(true,"setVisible",antropometriksil.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 213;BA.debugLine="ListView1.Clear";
Debug.ShouldStop(1048576);
antropometriksil.mostCurrent._listview1.runVoidMethod ("Clear");
 BA.debugLineNum = 214;BA.debugLine="rs = Main.sql.ExecQuery(\"SELECT * FROM Antropomet";
Debug.ShouldStop(2097152);
antropometriksil.mostCurrent._rs.setObject(antropometriksil.mostCurrent._main._sql /*RemoteObject*/ .runMethod(false,"ExecQuery",(Object)(RemoteObject.concat(RemoteObject.createImmutable("SELECT * FROM Antropometrik, Denek WHERE Antropometrik.denek_id = Denek.denek_id AND antropometrik_kilo LIKE '%"),antropometriksil.mostCurrent._edittextara.runMethod(true,"getText"),RemoteObject.createImmutable("%' ORDER BY antropometrik_id DESC ")))));
 BA.debugLineNum = 216;BA.debugLine="For i=0 To rs.RowCount-1";
Debug.ShouldStop(8388608);
{
final int step4 = 1;
final int limit4 = RemoteObject.solve(new RemoteObject[] {antropometriksil.mostCurrent._rs.runMethod(true,"getRowCount"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step4 > 0 && _i <= limit4) || (step4 < 0 && _i >= limit4) ;_i = ((int)(0 + _i + step4))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 217;BA.debugLine="rs.Position = i";
Debug.ShouldStop(16777216);
antropometriksil.mostCurrent._rs.runMethod(true,"setPosition",BA.numberCast(int.class, _i));
 BA.debugLineNum = 218;BA.debugLine="VeriAl";
Debug.ShouldStop(33554432);
_verial();
 BA.debugLineNum = 219;BA.debugLine="ListView1.AddTwoLinesAndBitmap(id,$\"TC: ${tc} //";
Debug.ShouldStop(67108864);
antropometriksil.mostCurrent._listview1.runVoidMethod ("AddTwoLinesAndBitmap",(Object)(BA.ObjectToCharSequence(antropometriksil._id)),(Object)(BA.ObjectToCharSequence((RemoteObject.concat(RemoteObject.createImmutable("TC: "),antropometriksil.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((antropometriksil.mostCurrent._tc))),RemoteObject.createImmutable(" // Ad Soyad: "),antropometriksil.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((antropometriksil.mostCurrent._isim))),RemoteObject.createImmutable(" // Tarih: "),antropometriksil.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((antropometriksil.mostCurrent._tarih))),RemoteObject.createImmutable(" // Saat: "),antropometriksil.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((antropometriksil.mostCurrent._saat))),RemoteObject.createImmutable(" // Kilo: "),antropometriksil.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((antropometriksil._kilo))),RemoteObject.createImmutable(""))))),(Object)((antropometriksil.mostCurrent._bmp.getObject())));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 221;BA.debugLine="rs.Close";
Debug.ShouldStop(268435456);
antropometriksil.mostCurrent._rs.runVoidMethod ("Close");
 BA.debugLineNum = 222;BA.debugLine="End Sub";
Debug.ShouldStop(536870912);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _buttonkulacuzunlugu_click() throws Exception{
try {
		Debug.PushSubsStack("ButtonKulacUzunlugu_Click (antropometriksil) ","antropometriksil",38,antropometriksil.mostCurrent.activityBA,antropometriksil.mostCurrent,237);
if (RapidSub.canDelegate("buttonkulacuzunlugu_click")) { return b4a.example3.antropometriksil.remoteMe.runUserSub(false, "antropometriksil","buttonkulacuzunlugu_click");}
int _i = 0;
 BA.debugLineNum = 237;BA.debugLine="Sub ButtonKulacUzunlugu_Click";
Debug.ShouldStop(4096);
 BA.debugLineNum = 238;BA.debugLine="WebView1.Visible = False";
Debug.ShouldStop(8192);
antropometriksil.mostCurrent._webview1.runMethod(true,"setVisible",antropometriksil.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 239;BA.debugLine="ListView1.Clear";
Debug.ShouldStop(16384);
antropometriksil.mostCurrent._listview1.runVoidMethod ("Clear");
 BA.debugLineNum = 240;BA.debugLine="rs = Main.sql.ExecQuery(\"SELECT * FROM Antropomet";
Debug.ShouldStop(32768);
antropometriksil.mostCurrent._rs.setObject(antropometriksil.mostCurrent._main._sql /*RemoteObject*/ .runMethod(false,"ExecQuery",(Object)(RemoteObject.concat(RemoteObject.createImmutable("SELECT * FROM Antropometrik ,Denek WHERE Antropometrik.denek_id = Denek.denek_id AND antropometrik_kulacUzunlugu LIKE '%"),antropometriksil.mostCurrent._edittextara.runMethod(true,"getText"),RemoteObject.createImmutable("%' ORDER BY antropometrik_id DESC")))));
 BA.debugLineNum = 242;BA.debugLine="For i=0 To rs.RowCount-1";
Debug.ShouldStop(131072);
{
final int step4 = 1;
final int limit4 = RemoteObject.solve(new RemoteObject[] {antropometriksil.mostCurrent._rs.runMethod(true,"getRowCount"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step4 > 0 && _i <= limit4) || (step4 < 0 && _i >= limit4) ;_i = ((int)(0 + _i + step4))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 243;BA.debugLine="rs.Position = i";
Debug.ShouldStop(262144);
antropometriksil.mostCurrent._rs.runMethod(true,"setPosition",BA.numberCast(int.class, _i));
 BA.debugLineNum = 244;BA.debugLine="VeriAl";
Debug.ShouldStop(524288);
_verial();
 BA.debugLineNum = 245;BA.debugLine="ListView1.AddTwoLinesAndBitmap(id,$\"TC: ${tc} //";
Debug.ShouldStop(1048576);
antropometriksil.mostCurrent._listview1.runVoidMethod ("AddTwoLinesAndBitmap",(Object)(BA.ObjectToCharSequence(antropometriksil._id)),(Object)(BA.ObjectToCharSequence((RemoteObject.concat(RemoteObject.createImmutable("TC: "),antropometriksil.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((antropometriksil.mostCurrent._tc))),RemoteObject.createImmutable(" // Ad Soyad: "),antropometriksil.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((antropometriksil.mostCurrent._isim))),RemoteObject.createImmutable(" // Tarih: "),antropometriksil.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((antropometriksil.mostCurrent._tarih))),RemoteObject.createImmutable(" // Saat: "),antropometriksil.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((antropometriksil.mostCurrent._saat))),RemoteObject.createImmutable(" // Kulaç Uzunluğu: "),antropometriksil.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((antropometriksil._kulac_uzunlugu))),RemoteObject.createImmutable(""))))),(Object)((antropometriksil.mostCurrent._bmp.getObject())));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 247;BA.debugLine="rs.Close";
Debug.ShouldStop(4194304);
antropometriksil.mostCurrent._rs.runVoidMethod ("Close");
 BA.debugLineNum = 248;BA.debugLine="End Sub";
Debug.ShouldStop(8388608);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _buttonoturmayuksekligi_click() throws Exception{
try {
		Debug.PushSubsStack("ButtonOturmaYuksekligi_Click (antropometriksil) ","antropometriksil",38,antropometriksil.mostCurrent.activityBA,antropometriksil.mostCurrent,250);
if (RapidSub.canDelegate("buttonoturmayuksekligi_click")) { return b4a.example3.antropometriksil.remoteMe.runUserSub(false, "antropometriksil","buttonoturmayuksekligi_click");}
int _i = 0;
 BA.debugLineNum = 250;BA.debugLine="Sub ButtonOturmaYuksekligi_Click";
Debug.ShouldStop(33554432);
 BA.debugLineNum = 251;BA.debugLine="WebView1.Visible = False";
Debug.ShouldStop(67108864);
antropometriksil.mostCurrent._webview1.runMethod(true,"setVisible",antropometriksil.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 252;BA.debugLine="ListView1.Clear";
Debug.ShouldStop(134217728);
antropometriksil.mostCurrent._listview1.runVoidMethod ("Clear");
 BA.debugLineNum = 253;BA.debugLine="rs = Main.sql.ExecQuery(\"SELECT * FROM Antropomet";
Debug.ShouldStop(268435456);
antropometriksil.mostCurrent._rs.setObject(antropometriksil.mostCurrent._main._sql /*RemoteObject*/ .runMethod(false,"ExecQuery",(Object)(RemoteObject.concat(RemoteObject.createImmutable("SELECT * FROM Antropometrik, Denek WHERE Antropometrik.denek_id = Denek.denek_id AND antropometrik_oturmaYuksekligi LIKE '%"),antropometriksil.mostCurrent._edittextara.runMethod(true,"getText"),RemoteObject.createImmutable("%' ORDER BY antropometrik_id DESC ")))));
 BA.debugLineNum = 255;BA.debugLine="For i=0 To rs.RowCount-1";
Debug.ShouldStop(1073741824);
{
final int step4 = 1;
final int limit4 = RemoteObject.solve(new RemoteObject[] {antropometriksil.mostCurrent._rs.runMethod(true,"getRowCount"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step4 > 0 && _i <= limit4) || (step4 < 0 && _i >= limit4) ;_i = ((int)(0 + _i + step4))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 256;BA.debugLine="rs.Position = i";
Debug.ShouldStop(-2147483648);
antropometriksil.mostCurrent._rs.runMethod(true,"setPosition",BA.numberCast(int.class, _i));
 BA.debugLineNum = 257;BA.debugLine="VeriAl";
Debug.ShouldStop(1);
_verial();
 BA.debugLineNum = 258;BA.debugLine="ListView1.AddTwoLinesAndBitmap(id,$\"TC: ${tc} //";
Debug.ShouldStop(2);
antropometriksil.mostCurrent._listview1.runVoidMethod ("AddTwoLinesAndBitmap",(Object)(BA.ObjectToCharSequence(antropometriksil._id)),(Object)(BA.ObjectToCharSequence((RemoteObject.concat(RemoteObject.createImmutable("TC: "),antropometriksil.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((antropometriksil.mostCurrent._tc))),RemoteObject.createImmutable(" // Ad Soyad: "),antropometriksil.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((antropometriksil.mostCurrent._isim))),RemoteObject.createImmutable(" // Tarih: "),antropometriksil.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((antropometriksil.mostCurrent._tarih))),RemoteObject.createImmutable(" // Saat: "),antropometriksil.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((antropometriksil.mostCurrent._saat))),RemoteObject.createImmutable(" // Oturma Yüksekliği: "),antropometriksil.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((antropometriksil._oturma_yuksekligi))),RemoteObject.createImmutable(""))))),(Object)((antropometriksil.mostCurrent._bmp.getObject())));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 260;BA.debugLine="rs.Close";
Debug.ShouldStop(8);
antropometriksil.mostCurrent._rs.runVoidMethod ("Close");
 BA.debugLineNum = 261;BA.debugLine="End Sub";
Debug.ShouldStop(16);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _buttontabloveri_click() throws Exception{
try {
		Debug.PushSubsStack("ButtonTabloVeri_Click (antropometriksil) ","antropometriksil",38,antropometriksil.mostCurrent.activityBA,antropometriksil.mostCurrent,325);
if (RapidSub.canDelegate("buttontabloveri_click")) { return b4a.example3.antropometriksil.remoteMe.runUserSub(false, "antropometriksil","buttontabloveri_click");}
 BA.debugLineNum = 325;BA.debugLine="Sub ButtonTabloVeri_Click";
Debug.ShouldStop(16);
 BA.debugLineNum = 326;BA.debugLine="WebView1.Visible = False";
Debug.ShouldStop(32);
antropometriksil.mostCurrent._webview1.runMethod(true,"setVisible",antropometriksil.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 327;BA.debugLine="StartActivity(AntropometrikListele)";
Debug.ShouldStop(64);
antropometriksil.mostCurrent.__c.runVoidMethod ("StartActivity",antropometriksil.processBA,(Object)((antropometriksil.mostCurrent._antropometriklistele.getObject())));
 BA.debugLineNum = 328;BA.debugLine="Activity.Finish";
Debug.ShouldStop(128);
antropometriksil.mostCurrent._activity.runVoidMethod ("Finish");
 BA.debugLineNum = 329;BA.debugLine="End Sub";
Debug.ShouldStop(256);
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
		Debug.PushSubsStack("ButtonTarih_Click (antropometriksil) ","antropometriksil",38,antropometriksil.mostCurrent.activityBA,antropometriksil.mostCurrent,181);
if (RapidSub.canDelegate("buttontarih_click")) { return b4a.example3.antropometriksil.remoteMe.runUserSub(false, "antropometriksil","buttontarih_click");}
int _i = 0;
 BA.debugLineNum = 181;BA.debugLine="Sub ButtonTarih_Click";
Debug.ShouldStop(1048576);
 BA.debugLineNum = 182;BA.debugLine="WebView1.Visible = False";
Debug.ShouldStop(2097152);
antropometriksil.mostCurrent._webview1.runMethod(true,"setVisible",antropometriksil.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 183;BA.debugLine="ListView1.Clear";
Debug.ShouldStop(4194304);
antropometriksil.mostCurrent._listview1.runVoidMethod ("Clear");
 BA.debugLineNum = 184;BA.debugLine="rs = Main.sql.ExecQuery(\"SELECT * FROM Antropomet";
Debug.ShouldStop(8388608);
antropometriksil.mostCurrent._rs.setObject(antropometriksil.mostCurrent._main._sql /*RemoteObject*/ .runMethod(false,"ExecQuery",(Object)(RemoteObject.concat(RemoteObject.createImmutable("SELECT * FROM Antropometrik,Denek WHERE Antropometrik.denek_id = Denek.denek_id AND antropometrik_tarih LIKE '%"),antropometriksil.mostCurrent._edittextara.runMethod(true,"getText"),RemoteObject.createImmutable("%' ORDER BY antropometrik_id DESC")))));
 BA.debugLineNum = 186;BA.debugLine="For i=0 To rs.RowCount-1";
Debug.ShouldStop(33554432);
{
final int step4 = 1;
final int limit4 = RemoteObject.solve(new RemoteObject[] {antropometriksil.mostCurrent._rs.runMethod(true,"getRowCount"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step4 > 0 && _i <= limit4) || (step4 < 0 && _i >= limit4) ;_i = ((int)(0 + _i + step4))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 187;BA.debugLine="rs.Position = i";
Debug.ShouldStop(67108864);
antropometriksil.mostCurrent._rs.runMethod(true,"setPosition",BA.numberCast(int.class, _i));
 BA.debugLineNum = 188;BA.debugLine="VeriAl";
Debug.ShouldStop(134217728);
_verial();
 BA.debugLineNum = 189;BA.debugLine="ListView1.AddTwoLinesAndBitmap(id,$\"TC: ${tc} //";
Debug.ShouldStop(268435456);
antropometriksil.mostCurrent._listview1.runVoidMethod ("AddTwoLinesAndBitmap",(Object)(BA.ObjectToCharSequence(antropometriksil._id)),(Object)(BA.ObjectToCharSequence((RemoteObject.concat(RemoteObject.createImmutable("TC: "),antropometriksil.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((antropometriksil.mostCurrent._tc))),RemoteObject.createImmutable(" // Ad Soyad: "),antropometriksil.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((antropometriksil.mostCurrent._isim))),RemoteObject.createImmutable(" // Tarih: "),antropometriksil.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((antropometriksil.mostCurrent._tarih))),RemoteObject.createImmutable(" // Saat: "),antropometriksil.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((antropometriksil.mostCurrent._saat))),RemoteObject.createImmutable(""))))),(Object)((antropometriksil.mostCurrent._bmp.getObject())));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 191;BA.debugLine="rs.Close";
Debug.ShouldStop(1073741824);
antropometriksil.mostCurrent._rs.runVoidMethod ("Close");
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
public static RemoteObject  _buttontc_click() throws Exception{
try {
		Debug.PushSubsStack("ButtonTc_Click (antropometriksil) ","antropometriksil",38,antropometriksil.mostCurrent.activityBA,antropometriksil.mostCurrent,194);
if (RapidSub.canDelegate("buttontc_click")) { return b4a.example3.antropometriksil.remoteMe.runUserSub(false, "antropometriksil","buttontc_click");}
 BA.debugLineNum = 194;BA.debugLine="Sub ButtonTc_Click";
Debug.ShouldStop(2);
 BA.debugLineNum = 195;BA.debugLine="ButtonTarih_Click";
Debug.ShouldStop(4);
_buttontarih_click();
 BA.debugLineNum = 196;BA.debugLine="End Sub";
Debug.ShouldStop(8);
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
		Debug.PushSubsStack("EditTextAra_TextChanged (antropometriksil) ","antropometriksil",38,antropometriksil.mostCurrent.activityBA,antropometriksil.mostCurrent,163);
if (RapidSub.canDelegate("edittextara_textchanged")) { return b4a.example3.antropometriksil.remoteMe.runUserSub(false, "antropometriksil","edittextara_textchanged", _old, _new);}
int _i = 0;
Debug.locals.put("Old", _old);
Debug.locals.put("New", _new);
 BA.debugLineNum = 163;BA.debugLine="Sub EditTextAra_TextChanged (Old As String, New As";
Debug.ShouldStop(4);
 BA.debugLineNum = 164;BA.debugLine="WebView1.Visible = False";
Debug.ShouldStop(8);
antropometriksil.mostCurrent._webview1.runMethod(true,"setVisible",antropometriksil.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 165;BA.debugLine="LabelCarpi.Visible = True";
Debug.ShouldStop(16);
antropometriksil.mostCurrent._labelcarpi.runMethod(true,"setVisible",antropometriksil.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 166;BA.debugLine="ListView1.Clear";
Debug.ShouldStop(32);
antropometriksil.mostCurrent._listview1.runVoidMethod ("Clear");
 BA.debugLineNum = 167;BA.debugLine="rs = Main.sql.ExecQuery(\"SELECT * FROM Antropomet";
Debug.ShouldStop(64);
antropometriksil.mostCurrent._rs.setObject(antropometriksil.mostCurrent._main._sql /*RemoteObject*/ .runMethod(false,"ExecQuery",(Object)(RemoteObject.concat(RemoteObject.createImmutable("SELECT * FROM Antropometrik,Denek WHERE Antropometrik.denek_id = Denek.denek_id AND (denek_tc LIKE '%"),antropometriksil.mostCurrent._edittextara.runMethod(true,"getText"),RemoteObject.createImmutable("%' OR denek_isim LIKE '%"),antropometriksil.mostCurrent._edittextara.runMethod(true,"getText"),RemoteObject.createImmutable("%' OR antropometrik_tarih  LIKE '%"),antropometriksil.mostCurrent._edittextara.runMethod(true,"getText"),RemoteObject.createImmutable("%' OR antropometrik_boy  LIKE '%"),antropometriksil.mostCurrent._edittextara.runMethod(true,"getText"),RemoteObject.createImmutable("%' OR antropometrik_kilo  LIKE '%"),antropometriksil.mostCurrent._edittextara.runMethod(true,"getText"),RemoteObject.createImmutable("%' OR antropometrik_elUzunlugu  LIKE '%"),antropometriksil.mostCurrent._edittextara.runMethod(true,"getText"),RemoteObject.createImmutable("%' OR antropometrik_kulacUzunlugu  LIKE '%"),antropometriksil.mostCurrent._edittextara.runMethod(true,"getText"),RemoteObject.createImmutable("%' OR antropometrik_oturmaYuksekligi  LIKE '%"),antropometriksil.mostCurrent._edittextara.runMethod(true,"getText"),RemoteObject.createImmutable("%' OR antropometrik_ayakUzunlugu  LIKE '%"),antropometriksil.mostCurrent._edittextara.runMethod(true,"getText"),RemoteObject.createImmutable("%' OR antropometrik_deriKivrimKalinligi  LIKE '%"),antropometriksil.mostCurrent._edittextara.runMethod(true,"getText"),RemoteObject.createImmutable("%' ) ORDER BY antropometrik_id DESC")))));
 BA.debugLineNum = 169;BA.debugLine="For i=0 To rs.RowCount-1";
Debug.ShouldStop(256);
{
final int step5 = 1;
final int limit5 = RemoteObject.solve(new RemoteObject[] {antropometriksil.mostCurrent._rs.runMethod(true,"getRowCount"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step5 > 0 && _i <= limit5) || (step5 < 0 && _i >= limit5) ;_i = ((int)(0 + _i + step5))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 170;BA.debugLine="rs.Position = i";
Debug.ShouldStop(512);
antropometriksil.mostCurrent._rs.runMethod(true,"setPosition",BA.numberCast(int.class, _i));
 BA.debugLineNum = 171;BA.debugLine="VeriAl";
Debug.ShouldStop(1024);
_verial();
 BA.debugLineNum = 172;BA.debugLine="ListView1.AddTwoLinesAndBitmap(id,$\"TC: ${tc} //";
Debug.ShouldStop(2048);
antropometriksil.mostCurrent._listview1.runVoidMethod ("AddTwoLinesAndBitmap",(Object)(BA.ObjectToCharSequence(antropometriksil._id)),(Object)(BA.ObjectToCharSequence((RemoteObject.concat(RemoteObject.createImmutable("TC: "),antropometriksil.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((antropometriksil.mostCurrent._tc))),RemoteObject.createImmutable(" // Ad Soyad: "),antropometriksil.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((antropometriksil.mostCurrent._isim))),RemoteObject.createImmutable(" // Tarih: "),antropometriksil.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((antropometriksil.mostCurrent._tarih))),RemoteObject.createImmutable(" // Saat: "),antropometriksil.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((antropometriksil.mostCurrent._saat))),RemoteObject.createImmutable(" // Boy: "),antropometriksil.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((antropometriksil._boy))),RemoteObject.createImmutable(" // Kilo: "),antropometriksil.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((antropometriksil._kilo))),RemoteObject.createImmutable(""))))),(Object)((antropometriksil.mostCurrent._bmp.getObject())));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 174;BA.debugLine="rs.Close";
Debug.ShouldStop(8192);
antropometriksil.mostCurrent._rs.runVoidMethod ("Close");
 BA.debugLineNum = 175;BA.debugLine="If EditTextAra.Text = \"\" Then";
Debug.ShouldStop(16384);
if (RemoteObject.solveBoolean("=",antropometriksil.mostCurrent._edittextara.runMethod(true,"getText"),BA.ObjectToString(""))) { 
 BA.debugLineNum = 176;BA.debugLine="LabelCarpi.Visible = False";
Debug.ShouldStop(32768);
antropometriksil.mostCurrent._labelcarpi.runMethod(true,"setVisible",antropometriksil.mostCurrent.__c.getField(true,"False"));
 };
 BA.debugLineNum = 178;BA.debugLine="End Sub";
Debug.ShouldStop(131072);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _globals() throws Exception{
 //BA.debugLineNum = 11;BA.debugLine="Sub Globals";
 //BA.debugLineNum = 15;BA.debugLine="Private EditTextAra As EditText";
antropometriksil.mostCurrent._edittextara = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
 //BA.debugLineNum = 16;BA.debugLine="Private ListView1 As ListView";
antropometriksil.mostCurrent._listview1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.ListViewWrapper");
 //BA.debugLineNum = 17;BA.debugLine="Private WebView1 As WebView";
antropometriksil.mostCurrent._webview1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.WebViewWrapper");
 //BA.debugLineNum = 18;BA.debugLine="Private LabelCarpi As Label";
antropometriksil.mostCurrent._labelcarpi = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 19;BA.debugLine="Dim rs As ResultSet";
antropometriksil.mostCurrent._rs = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL.ResultSetWrapper");
 //BA.debugLineNum = 21;BA.debugLine="Private ButtonTc As Button";
antropometriksil.mostCurrent._buttontc = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 22;BA.debugLine="Private ButtonTarih As Button";
antropometriksil.mostCurrent._buttontarih = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 23;BA.debugLine="Private ButtonBoy As Button";
antropometriksil.mostCurrent._buttonboy = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 24;BA.debugLine="Private ButtonKilo As Button";
antropometriksil.mostCurrent._buttonkilo = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 25;BA.debugLine="Private ButtonElUzunlugu As Button";
antropometriksil.mostCurrent._buttoneluzunlugu = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 26;BA.debugLine="Private ButtonKulacUzunlugu As Button";
antropometriksil.mostCurrent._buttonkulacuzunlugu = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 27;BA.debugLine="Private ButtonOturmaYuksekligi As Button";
antropometriksil.mostCurrent._buttonoturmayuksekligi = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 28;BA.debugLine="Private ButtonAyakUzunlugu As Button";
antropometriksil.mostCurrent._buttonayakuzunlugu = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 29;BA.debugLine="Private ButtonDeriKivrimKalinligi As Button";
antropometriksil.mostCurrent._buttonderikivrimkalinligi = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 31;BA.debugLine="Dim tc,tarih,isim, saat As String";
antropometriksil.mostCurrent._tc = RemoteObject.createImmutable("");
antropometriksil.mostCurrent._tarih = RemoteObject.createImmutable("");
antropometriksil.mostCurrent._isim = RemoteObject.createImmutable("");
antropometriksil.mostCurrent._saat = RemoteObject.createImmutable("");
 //BA.debugLineNum = 32;BA.debugLine="Dim id,boy,kilo,el_uzunlugu,kulac_uzunlugu,oturma";
antropometriksil._id = RemoteObject.createImmutable(0);
antropometriksil._boy = RemoteObject.createImmutable(0);
antropometriksil._kilo = RemoteObject.createImmutable(0);
antropometriksil._el_uzunlugu = RemoteObject.createImmutable(0);
antropometriksil._kulac_uzunlugu = RemoteObject.createImmutable(0);
antropometriksil._oturma_yuksekligi = RemoteObject.createImmutable(0);
antropometriksil._ayak_uzunlugu = RemoteObject.createImmutable(0);
antropometriksil._derikivrim_kalinligi = RemoteObject.createImmutable(0);
 //BA.debugLineNum = 33;BA.debugLine="Dim resim() As Byte";
antropometriksil._resim = RemoteObject.createNewArray ("byte", new int[] {0}, new Object[]{});
 //BA.debugLineNum = 34;BA.debugLine="Dim bmp As Bitmap";
antropometriksil.mostCurrent._bmp = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper");
 //BA.debugLineNum = 36;BA.debugLine="Private ButtonAnasayfa As Button";
antropometriksil.mostCurrent._buttonanasayfa = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 37;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _labelcarpi_click() throws Exception{
try {
		Debug.PushSubsStack("LabelCarpi_Click (antropometriksil) ","antropometriksil",38,antropometriksil.mostCurrent.activityBA,antropometriksil.mostCurrent,345);
if (RapidSub.canDelegate("labelcarpi_click")) { return b4a.example3.antropometriksil.remoteMe.runUserSub(false, "antropometriksil","labelcarpi_click");}
 BA.debugLineNum = 345;BA.debugLine="Sub LabelCarpi_Click";
Debug.ShouldStop(16777216);
 BA.debugLineNum = 346;BA.debugLine="EditTextAra.SelectAll";
Debug.ShouldStop(33554432);
antropometriksil.mostCurrent._edittextara.runVoidMethod ("SelectAll");
 BA.debugLineNum = 347;BA.debugLine="EditTextAra.Text = \"\"";
Debug.ShouldStop(67108864);
antropometriksil.mostCurrent._edittextara.runMethodAndSync(true,"setText",BA.ObjectToCharSequence(""));
 BA.debugLineNum = 348;BA.debugLine="ListViewGosterDB";
Debug.ShouldStop(134217728);
_listviewgosterdb();
 BA.debugLineNum = 349;BA.debugLine="End Sub";
Debug.ShouldStop(268435456);
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
		Debug.PushSubsStack("ListView1_ItemClick (antropometriksil) ","antropometriksil",38,antropometriksil.mostCurrent.activityBA,antropometriksil.mostCurrent,313);
if (RapidSub.canDelegate("listview1_itemclick")) { return b4a.example3.antropometriksil.remoteMe.runUserSub(false, "antropometriksil","listview1_itemclick", _position, _value);}
Debug.locals.put("Position", _position);
Debug.locals.put("Value", _value);
 BA.debugLineNum = 313;BA.debugLine="Sub ListView1_ItemClick (Position As Int, Value As";
Debug.ShouldStop(16777216);
 BA.debugLineNum = 314;BA.debugLine="WebView1.Visible = True";
Debug.ShouldStop(33554432);
antropometriksil.mostCurrent._webview1.runMethod(true,"setVisible",antropometriksil.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 315;BA.debugLine="WebView1.LoadHtml(DBUtils.ExecuteHtml(Main.sql,\"S";
Debug.ShouldStop(67108864);
antropometriksil.mostCurrent._webview1.runVoidMethod ("LoadHtml",(Object)(antropometriksil.mostCurrent._dbutils.runMethod(true,"_executehtml" /*RemoteObject*/ ,antropometriksil.mostCurrent.activityBA,(Object)(antropometriksil.mostCurrent._main._sql /*RemoteObject*/ ),(Object)(RemoteObject.concat(RemoteObject.createImmutable("SELECT denek_tc As [Denek TC], denek_isim As [DENEK İSİM] , antropometrik_tarih As [TARİH], antropometrik_saat As [SAAT] ,antropometrik_boy As [BOY] , antropometrik_kilo As [KİLO],antropometrik_elUzunlugu As [EL UZUNLUĞU],antropometrik_kulacUzunlugu As [KULAÇ UZUNLUĞU],antropometrik_oturmaYuksekligi As [OTURMA YÜKSEKLİĞİ],antropometrik_ayakUzunlugu As [AYAK UZUNLUĞU],antropometrik_deriKivrimKalinligi As [DERİ KIVRIM KALINLIĞI] FROM Antropometrik,Denek WHERE Antropometrik.denek_id = Denek.denek_id AND antropometrik_id = '"),_value,RemoteObject.createImmutable("'"))),(Object)((antropometriksil.mostCurrent.__c.getField(false,"Null"))),(Object)(BA.numberCast(int.class, -(double) (0 + 1))),(Object)(antropometriksil.mostCurrent.__c.getField(true,"False")))));
 BA.debugLineNum = 316;BA.debugLine="Return";
Debug.ShouldStop(134217728);
if (true) return RemoteObject.createImmutable("");
 BA.debugLineNum = 317;BA.debugLine="End Sub";
Debug.ShouldStop(268435456);
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
		Debug.PushSubsStack("ListView1_ItemLongClick (antropometriksil) ","antropometriksil",38,antropometriksil.mostCurrent.activityBA,antropometriksil.mostCurrent,292);
if (RapidSub.canDelegate("listview1_itemlongclick")) { return b4a.example3.antropometriksil.remoteMe.runUserSub(false, "antropometriksil","listview1_itemlongclick", _position, _value);}
int _i = 0;
RemoteObject _result = RemoteObject.createImmutable(0);
Debug.locals.put("Position", _position);
Debug.locals.put("Value", _value);
 BA.debugLineNum = 292;BA.debugLine="Sub ListView1_ItemLongClick (Position As Int, Valu";
Debug.ShouldStop(8);
 BA.debugLineNum = 293;BA.debugLine="WebView1.Visible = False";
Debug.ShouldStop(16);
antropometriksil.mostCurrent._webview1.runMethod(true,"setVisible",antropometriksil.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 294;BA.debugLine="rs = Main.sql.ExecQuery(\"SELECT * FROM Antropomet";
Debug.ShouldStop(32);
antropometriksil.mostCurrent._rs.setObject(antropometriksil.mostCurrent._main._sql /*RemoteObject*/ .runMethod(false,"ExecQuery",(Object)(RemoteObject.concat(RemoteObject.createImmutable("SELECT * FROM Antropometrik WHERE antropometrik_id = '"),_value,RemoteObject.createImmutable("' ")))));
 BA.debugLineNum = 296;BA.debugLine="For i=0 To rs.RowCount-1";
Debug.ShouldStop(128);
{
final int step3 = 1;
final int limit3 = RemoteObject.solve(new RemoteObject[] {antropometriksil.mostCurrent._rs.runMethod(true,"getRowCount"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step3 > 0 && _i <= limit3) || (step3 < 0 && _i >= limit3) ;_i = ((int)(0 + _i + step3))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 297;BA.debugLine="rs.Position = i";
Debug.ShouldStop(256);
antropometriksil.mostCurrent._rs.runMethod(true,"setPosition",BA.numberCast(int.class, _i));
 BA.debugLineNum = 299;BA.debugLine="id = rs.GetInt(\"antropometrik_id\")";
Debug.ShouldStop(1024);
antropometriksil._id = antropometriksil.mostCurrent._rs.runMethod(true,"GetInt",(Object)(RemoteObject.createImmutable("antropometrik_id")));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 301;BA.debugLine="rs.Close";
Debug.ShouldStop(4096);
antropometriksil.mostCurrent._rs.runVoidMethod ("Close");
 BA.debugLineNum = 303;BA.debugLine="Dim result As Int";
Debug.ShouldStop(16384);
_result = RemoteObject.createImmutable(0);Debug.locals.put("result", _result);
 BA.debugLineNum = 304;BA.debugLine="result = Msgbox2(\"Antropometrik bilgiyi silmek is";
Debug.ShouldStop(32768);
_result = antropometriksil.mostCurrent.__c.runMethodAndSync(true,"Msgbox2",(Object)(BA.ObjectToCharSequence("Antropometrik bilgiyi silmek istediğinizden emin misiniz?:")),(Object)(BA.ObjectToCharSequence("Onay Mesajı")),(Object)(BA.ObjectToString("Evet")),(Object)(BA.ObjectToString("")),(Object)(BA.ObjectToString("Hayır")),(Object)((antropometriksil.mostCurrent.__c.getField(false,"Null"))),antropometriksil.mostCurrent.activityBA);Debug.locals.put("result", _result);
 BA.debugLineNum = 305;BA.debugLine="If result = DialogResponse.POSITIVE Then";
Debug.ShouldStop(65536);
if (RemoteObject.solveBoolean("=",_result,BA.numberCast(double.class, antropometriksil.mostCurrent.__c.getField(false,"DialogResponse").getField(true,"POSITIVE")))) { 
 BA.debugLineNum = 306;BA.debugLine="Main.sql.ExecNonQuery(\"DELETE FROM Antropometrik";
Debug.ShouldStop(131072);
antropometriksil.mostCurrent._main._sql /*RemoteObject*/ .runVoidMethod ("ExecNonQuery",(Object)(RemoteObject.concat(RemoteObject.createImmutable("DELETE FROM Antropometrik WHERE antropometrik_id = '"),antropometriksil._id,RemoteObject.createImmutable("' "))));
 BA.debugLineNum = 307;BA.debugLine="ToastMessageShow(\"Denek silindi...\",False)";
Debug.ShouldStop(262144);
antropometriksil.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("Denek silindi...")),(Object)(antropometriksil.mostCurrent.__c.getField(true,"False")));
 };
 BA.debugLineNum = 309;BA.debugLine="ListViewGosterDB";
Debug.ShouldStop(1048576);
_listviewgosterdb();
 BA.debugLineNum = 310;BA.debugLine="End Sub";
Debug.ShouldStop(2097152);
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
		Debug.PushSubsStack("ListViewGosterDB (antropometriksil) ","antropometriksil",38,antropometriksil.mostCurrent.activityBA,antropometriksil.mostCurrent,152);
if (RapidSub.canDelegate("listviewgosterdb")) { return b4a.example3.antropometriksil.remoteMe.runUserSub(false, "antropometriksil","listviewgosterdb");}
int _i = 0;
 BA.debugLineNum = 152;BA.debugLine="Sub ListViewGosterDB";
Debug.ShouldStop(8388608);
 BA.debugLineNum = 153;BA.debugLine="WebView1.Visible = False";
Debug.ShouldStop(16777216);
antropometriksil.mostCurrent._webview1.runMethod(true,"setVisible",antropometriksil.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 154;BA.debugLine="ListView1.Clear";
Debug.ShouldStop(33554432);
antropometriksil.mostCurrent._listview1.runVoidMethod ("Clear");
 BA.debugLineNum = 155;BA.debugLine="rs = Main.sql.ExecQuery(\"SELECT * FROM Antropomet";
Debug.ShouldStop(67108864);
antropometriksil.mostCurrent._rs.setObject(antropometriksil.mostCurrent._main._sql /*RemoteObject*/ .runMethod(false,"ExecQuery",(Object)(RemoteObject.createImmutable("SELECT * FROM Antropometrik,Denek WHERE Antropometrik.denek_id = Denek.denek_id ORDER BY antropometrik_id DESC"))));
 BA.debugLineNum = 156;BA.debugLine="For i=0 To rs.RowCount-1";
Debug.ShouldStop(134217728);
{
final int step4 = 1;
final int limit4 = RemoteObject.solve(new RemoteObject[] {antropometriksil.mostCurrent._rs.runMethod(true,"getRowCount"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step4 > 0 && _i <= limit4) || (step4 < 0 && _i >= limit4) ;_i = ((int)(0 + _i + step4))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 157;BA.debugLine="rs.Position = i";
Debug.ShouldStop(268435456);
antropometriksil.mostCurrent._rs.runMethod(true,"setPosition",BA.numberCast(int.class, _i));
 BA.debugLineNum = 158;BA.debugLine="VeriAl";
Debug.ShouldStop(536870912);
_verial();
 BA.debugLineNum = 159;BA.debugLine="ListView1.AddTwoLinesAndBitmap(id,$\"TC: ${tc} //";
Debug.ShouldStop(1073741824);
antropometriksil.mostCurrent._listview1.runVoidMethod ("AddTwoLinesAndBitmap",(Object)(BA.ObjectToCharSequence(antropometriksil._id)),(Object)(BA.ObjectToCharSequence((RemoteObject.concat(RemoteObject.createImmutable("TC: "),antropometriksil.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((antropometriksil.mostCurrent._tc))),RemoteObject.createImmutable(" // Ad Soyad: "),antropometriksil.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((antropometriksil.mostCurrent._isim))),RemoteObject.createImmutable(" // Tarih: "),antropometriksil.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((antropometriksil.mostCurrent._tarih))),RemoteObject.createImmutable(" // Saat: "),antropometriksil.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((antropometriksil.mostCurrent._saat))),RemoteObject.createImmutable(" // Boy: "),antropometriksil.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((antropometriksil._boy))),RemoteObject.createImmutable(" // Kilo: "),antropometriksil.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((antropometriksil._kilo))),RemoteObject.createImmutable(""))))),(Object)((antropometriksil.mostCurrent._bmp.getObject())));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 161;BA.debugLine="End Sub";
Debug.ShouldStop(1);
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
 //BA.debugLineNum = 9;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _setdivider(RemoteObject _lv,RemoteObject _renk,RemoteObject _height) throws Exception{
try {
		Debug.PushSubsStack("SetDivider (antropometriksil) ","antropometriksil",38,antropometriksil.mostCurrent.activityBA,antropometriksil.mostCurrent,331);
if (RapidSub.canDelegate("setdivider")) { return b4a.example3.antropometriksil.remoteMe.runUserSub(false, "antropometriksil","setdivider", _lv, _renk, _height);}
RemoteObject _r = RemoteObject.declareNull("anywheresoftware.b4a.agraham.reflection.Reflection");
RemoteObject _cd = RemoteObject.declareNull("anywheresoftware.b4a.objects.drawable.ColorDrawable");
Debug.locals.put("lv", _lv);
Debug.locals.put("Renk", _renk);
Debug.locals.put("Height", _height);
 BA.debugLineNum = 331;BA.debugLine="Sub SetDivider(lv As ListView, Renk As Int, Height";
Debug.ShouldStop(1024);
 BA.debugLineNum = 332;BA.debugLine="Dim r As Reflector";
Debug.ShouldStop(2048);
_r = RemoteObject.createNew ("anywheresoftware.b4a.agraham.reflection.Reflection");Debug.locals.put("r", _r);
 BA.debugLineNum = 333;BA.debugLine="r.Target = lv";
Debug.ShouldStop(4096);
_r.setField ("Target",(_lv.getObject()));
 BA.debugLineNum = 334;BA.debugLine="Dim CD As ColorDrawable";
Debug.ShouldStop(8192);
_cd = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.ColorDrawable");Debug.locals.put("CD", _cd);
 BA.debugLineNum = 335;BA.debugLine="CD.Initialize(Renk, 0)";
Debug.ShouldStop(16384);
_cd.runVoidMethod ("Initialize",(Object)(_renk),(Object)(BA.numberCast(int.class, 0)));
 BA.debugLineNum = 336;BA.debugLine="r.RunMethod4(\"setDivider\", Array As Object(CD), A";
Debug.ShouldStop(32768);
_r.runVoidMethod ("RunMethod4",(Object)(BA.ObjectToString("setDivider")),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(_cd.getObject())})),(Object)(RemoteObject.createNewArray("String",new int[] {1},new Object[] {RemoteObject.createImmutable("android.graphics.drawable.Drawable")})));
 BA.debugLineNum = 337;BA.debugLine="r.RunMethod2(\"setDividerHeight\", Height, \"java.la";
Debug.ShouldStop(65536);
_r.runVoidMethod ("RunMethod2",(Object)(BA.ObjectToString("setDividerHeight")),(Object)(BA.NumberToString(_height)),(Object)(RemoteObject.createImmutable("java.lang.int")));
 BA.debugLineNum = 338;BA.debugLine="End Sub";
Debug.ShouldStop(131072);
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
		Debug.PushSubsStack("VeriAl (antropometriksil) ","antropometriksil",38,antropometriksil.mostCurrent.activityBA,antropometriksil.mostCurrent,128);
if (RapidSub.canDelegate("verial")) { return b4a.example3.antropometriksil.remoteMe.runUserSub(false, "antropometriksil","verial");}
RemoteObject _inputstream = RemoteObject.declareNull("anywheresoftware.b4a.objects.streams.File.InputStreamWrapper");
 BA.debugLineNum = 128;BA.debugLine="Public Sub VeriAl";
Debug.ShouldStop(-2147483648);
 BA.debugLineNum = 129;BA.debugLine="id = rs.GetInt(\"antropometrik_id\")";
Debug.ShouldStop(1);
antropometriksil._id = antropometriksil.mostCurrent._rs.runMethod(true,"GetInt",(Object)(RemoteObject.createImmutable("antropometrik_id")));
 BA.debugLineNum = 130;BA.debugLine="tc = rs.GetString(\"denek_tc\")";
Debug.ShouldStop(2);
antropometriksil.mostCurrent._tc = antropometriksil.mostCurrent._rs.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("denek_tc")));
 BA.debugLineNum = 131;BA.debugLine="isim = rs.GetString(\"denek_isim\")";
Debug.ShouldStop(4);
antropometriksil.mostCurrent._isim = antropometriksil.mostCurrent._rs.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("denek_isim")));
 BA.debugLineNum = 132;BA.debugLine="tarih = rs.GetString(\"antropometrik_tarih\")";
Debug.ShouldStop(8);
antropometriksil.mostCurrent._tarih = antropometriksil.mostCurrent._rs.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("antropometrik_tarih")));
 BA.debugLineNum = 133;BA.debugLine="saat = rs.GetString(\"antropometrik_saat\")";
Debug.ShouldStop(16);
antropometriksil.mostCurrent._saat = antropometriksil.mostCurrent._rs.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("antropometrik_saat")));
 BA.debugLineNum = 134;BA.debugLine="boy = rs.GetInt(\"antropometrik_boy\")";
Debug.ShouldStop(32);
antropometriksil._boy = antropometriksil.mostCurrent._rs.runMethod(true,"GetInt",(Object)(RemoteObject.createImmutable("antropometrik_boy")));
 BA.debugLineNum = 135;BA.debugLine="kilo = rs.GetInt(\"antropometrik_kilo\")";
Debug.ShouldStop(64);
antropometriksil._kilo = antropometriksil.mostCurrent._rs.runMethod(true,"GetInt",(Object)(RemoteObject.createImmutable("antropometrik_kilo")));
 BA.debugLineNum = 136;BA.debugLine="el_uzunlugu = rs.GetInt(\"antropometrik_elUzunlugu";
Debug.ShouldStop(128);
antropometriksil._el_uzunlugu = antropometriksil.mostCurrent._rs.runMethod(true,"GetInt",(Object)(RemoteObject.createImmutable("antropometrik_elUzunlugu")));
 BA.debugLineNum = 137;BA.debugLine="kulac_uzunlugu = rs.GetInt(\"antropometrik_kulacUz";
Debug.ShouldStop(256);
antropometriksil._kulac_uzunlugu = antropometriksil.mostCurrent._rs.runMethod(true,"GetInt",(Object)(RemoteObject.createImmutable("antropometrik_kulacUzunlugu")));
 BA.debugLineNum = 138;BA.debugLine="oturma_yuksekligi = rs.GetInt(\"antropometrik_otur";
Debug.ShouldStop(512);
antropometriksil._oturma_yuksekligi = antropometriksil.mostCurrent._rs.runMethod(true,"GetInt",(Object)(RemoteObject.createImmutable("antropometrik_oturmaYuksekligi")));
 BA.debugLineNum = 139;BA.debugLine="ayak_uzunlugu = rs.GetInt(\"antropometrik_ayakUzun";
Debug.ShouldStop(1024);
antropometriksil._ayak_uzunlugu = antropometriksil.mostCurrent._rs.runMethod(true,"GetInt",(Object)(RemoteObject.createImmutable("antropometrik_ayakUzunlugu")));
 BA.debugLineNum = 140;BA.debugLine="deriKivrim_kalinligi = rs.GetInt(\"antropometrik_d";
Debug.ShouldStop(2048);
antropometriksil._derikivrim_kalinligi = antropometriksil.mostCurrent._rs.runMethod(true,"GetInt",(Object)(RemoteObject.createImmutable("antropometrik_deriKivrimKalinligi")));
 BA.debugLineNum = 141;BA.debugLine="resim = rs.GetBlob(\"denek_image\")";
Debug.ShouldStop(4096);
antropometriksil._resim = antropometriksil.mostCurrent._rs.runMethod(false,"GetBlob",(Object)(RemoteObject.createImmutable("denek_image")));
 BA.debugLineNum = 142;BA.debugLine="Try";
Debug.ShouldStop(8192);
try { BA.debugLineNum = 143;BA.debugLine="Dim inputStream As InputStream";
Debug.ShouldStop(16384);
_inputstream = RemoteObject.createNew ("anywheresoftware.b4a.objects.streams.File.InputStreamWrapper");Debug.locals.put("inputStream", _inputstream);
 BA.debugLineNum = 144;BA.debugLine="inputStream.InitializeFromBytesArray(resim, 0, r";
Debug.ShouldStop(32768);
_inputstream.runVoidMethod ("InitializeFromBytesArray",(Object)(antropometriksil._resim),(Object)(BA.numberCast(int.class, 0)),(Object)(antropometriksil._resim.getField(true,"length")));
 BA.debugLineNum = 145;BA.debugLine="bmp.Initialize2(inputStream)";
Debug.ShouldStop(65536);
antropometriksil.mostCurrent._bmp.runVoidMethod ("Initialize2",(Object)((_inputstream.getObject())));
 BA.debugLineNum = 146;BA.debugLine="inputStream.Close";
Debug.ShouldStop(131072);
_inputstream.runVoidMethod ("Close");
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e20) {
			BA.rdebugUtils.runVoidMethod("setLastException",antropometriksil.processBA, e20.toString()); BA.debugLineNum = 148;BA.debugLine="bmp = LoadBitmap(File.DirAssets, \"FotoKisi.png\")";
Debug.ShouldStop(524288);
antropometriksil.mostCurrent._bmp = antropometriksil.mostCurrent.__c.runMethod(false,"LoadBitmap",(Object)(antropometriksil.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(RemoteObject.createImmutable("FotoKisi.png")));
 };
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
}