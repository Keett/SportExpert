package b4a.example3;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class surattestlistele_subs_0 {


public static RemoteObject  _activity_create(RemoteObject _firsttime) throws Exception{
try {
		Debug.PushSubsStack("Activity_Create (surattestlistele) ","surattestlistele",8,surattestlistele.mostCurrent.activityBA,surattestlistele.mostCurrent,34);
if (RapidSub.canDelegate("activity_create")) { return b4a.example3.surattestlistele.remoteMe.runUserSub(false, "surattestlistele","activity_create", _firsttime);}
Debug.locals.put("FirstTime", _firsttime);
 BA.debugLineNum = 34;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
Debug.ShouldStop(2);
 BA.debugLineNum = 36;BA.debugLine="Activity.LoadLayout(\"SuratTestListelePage\")";
Debug.ShouldStop(8);
surattestlistele.mostCurrent._activity.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("SuratTestListelePage")),surattestlistele.mostCurrent.activityBA);
 BA.debugLineNum = 37;BA.debugLine="LabelCarpi.Visible = False";
Debug.ShouldStop(16);
surattestlistele.mostCurrent._labelcarpi.runMethod(true,"setVisible",surattestlistele.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 40;BA.debugLine="EditTextAra.TextColor = Colors.White";
Debug.ShouldStop(128);
surattestlistele.mostCurrent._edittextara.runMethod(true,"setTextColor",surattestlistele.mostCurrent.__c.getField(false,"Colors").getField(true,"White"));
 BA.debugLineNum = 41;BA.debugLine="EditTextAra.Hint = \"Bu alana yazarak aratabilirsi";
Debug.ShouldStop(256);
surattestlistele.mostCurrent._edittextara.runMethod(true,"setHint",BA.ObjectToString("Bu alana yazarak aratabilirsiniz.."));
 BA.debugLineNum = 42;BA.debugLine="EditTextAra.HintColor = Color.hintColor";
Debug.ShouldStop(512);
surattestlistele.mostCurrent._edittextara.runMethod(true,"setHintColor",surattestlistele.mostCurrent._color._hintcolor /*RemoteObject*/ );
 BA.debugLineNum = 43;BA.debugLine="EditTextAra.TextSize = 20";
Debug.ShouldStop(1024);
surattestlistele.mostCurrent._edittextara.runMethod(true,"setTextSize",BA.numberCast(float.class, 20));
 BA.debugLineNum = 44;BA.debugLine="EditTextAra.Typeface = Typeface.DEFAULT_BOLD";
Debug.ShouldStop(2048);
surattestlistele.mostCurrent._edittextara.runMethod(false,"setTypeface",surattestlistele.mostCurrent.__c.getField(false,"Typeface").getField(false,"DEFAULT_BOLD"));
 BA.debugLineNum = 46;BA.debugLine="ButtonTc.TextColor = Color.koyuMavi";
Debug.ShouldStop(8192);
surattestlistele.mostCurrent._buttontc.runMethod(true,"setTextColor",surattestlistele.mostCurrent._color._koyumavi /*RemoteObject*/ );
 BA.debugLineNum = 47;BA.debugLine="ButtonTc.Typeface = Typeface.DEFAULT_BOLD";
Debug.ShouldStop(16384);
surattestlistele.mostCurrent._buttontc.runMethod(false,"setTypeface",surattestlistele.mostCurrent.__c.getField(false,"Typeface").getField(false,"DEFAULT_BOLD"));
 BA.debugLineNum = 48;BA.debugLine="ButtonTc.Text = \"TC\"";
Debug.ShouldStop(32768);
surattestlistele.mostCurrent._buttontc.runMethod(true,"setText",BA.ObjectToCharSequence("TC"));
 BA.debugLineNum = 49;BA.debugLine="ButtonTc.TextSize = 14";
Debug.ShouldStop(65536);
surattestlistele.mostCurrent._buttontc.runMethod(true,"setTextSize",BA.numberCast(float.class, 14));
 BA.debugLineNum = 50;BA.debugLine="ButtonTc.SingleLine = True";
Debug.ShouldStop(131072);
surattestlistele.mostCurrent._buttontc.runVoidMethod ("setSingleLine",surattestlistele.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 52;BA.debugLine="ButtonIsim.TextColor = Color.koyuMavi";
Debug.ShouldStop(524288);
surattestlistele.mostCurrent._buttonisim.runMethod(true,"setTextColor",surattestlistele.mostCurrent._color._koyumavi /*RemoteObject*/ );
 BA.debugLineNum = 53;BA.debugLine="ButtonIsim.Typeface = Typeface.DEFAULT_BOLD";
Debug.ShouldStop(1048576);
surattestlistele.mostCurrent._buttonisim.runMethod(false,"setTypeface",surattestlistele.mostCurrent.__c.getField(false,"Typeface").getField(false,"DEFAULT_BOLD"));
 BA.debugLineNum = 54;BA.debugLine="ButtonIsim.Text = \"İSİM\"";
Debug.ShouldStop(2097152);
surattestlistele.mostCurrent._buttonisim.runMethod(true,"setText",BA.ObjectToCharSequence("İSİM"));
 BA.debugLineNum = 55;BA.debugLine="ButtonIsim.TextSize = 14";
Debug.ShouldStop(4194304);
surattestlistele.mostCurrent._buttonisim.runMethod(true,"setTextSize",BA.numberCast(float.class, 14));
 BA.debugLineNum = 56;BA.debugLine="ButtonIsim.SingleLine = True";
Debug.ShouldStop(8388608);
surattestlistele.mostCurrent._buttonisim.runVoidMethod ("setSingleLine",surattestlistele.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 58;BA.debugLine="ButtonTarih.TextColor = Color.koyuMavi";
Debug.ShouldStop(33554432);
surattestlistele.mostCurrent._buttontarih.runMethod(true,"setTextColor",surattestlistele.mostCurrent._color._koyumavi /*RemoteObject*/ );
 BA.debugLineNum = 59;BA.debugLine="ButtonTarih.Typeface = Typeface.DEFAULT_BOLD";
Debug.ShouldStop(67108864);
surattestlistele.mostCurrent._buttontarih.runMethod(false,"setTypeface",surattestlistele.mostCurrent.__c.getField(false,"Typeface").getField(false,"DEFAULT_BOLD"));
 BA.debugLineNum = 60;BA.debugLine="ButtonTarih.Text = \"TARİH\"";
Debug.ShouldStop(134217728);
surattestlistele.mostCurrent._buttontarih.runMethod(true,"setText",BA.ObjectToCharSequence("TARİH"));
 BA.debugLineNum = 61;BA.debugLine="ButtonTarih.TextSize = 14";
Debug.ShouldStop(268435456);
surattestlistele.mostCurrent._buttontarih.runMethod(true,"setTextSize",BA.numberCast(float.class, 14));
 BA.debugLineNum = 62;BA.debugLine="ButtonTarih.SingleLine = True";
Debug.ShouldStop(536870912);
surattestlistele.mostCurrent._buttontarih.runVoidMethod ("setSingleLine",surattestlistele.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 64;BA.debugLine="ButtonMod.TextColor = Color.koyuMavi";
Debug.ShouldStop(-2147483648);
surattestlistele.mostCurrent._buttonmod.runMethod(true,"setTextColor",surattestlistele.mostCurrent._color._koyumavi /*RemoteObject*/ );
 BA.debugLineNum = 65;BA.debugLine="ButtonMod.Typeface = Typeface.DEFAULT_BOLD";
Debug.ShouldStop(1);
surattestlistele.mostCurrent._buttonmod.runMethod(false,"setTypeface",surattestlistele.mostCurrent.__c.getField(false,"Typeface").getField(false,"DEFAULT_BOLD"));
 BA.debugLineNum = 66;BA.debugLine="ButtonMod.Text = \"MOD\"";
Debug.ShouldStop(2);
surattestlistele.mostCurrent._buttonmod.runMethod(true,"setText",BA.ObjectToCharSequence("MOD"));
 BA.debugLineNum = 67;BA.debugLine="ButtonMod.TextSize = 14";
Debug.ShouldStop(4);
surattestlistele.mostCurrent._buttonmod.runMethod(true,"setTextSize",BA.numberCast(float.class, 14));
 BA.debugLineNum = 68;BA.debugLine="ButtonMod.SingleLine = True";
Debug.ShouldStop(8);
surattestlistele.mostCurrent._buttonmod.runVoidMethod ("setSingleLine",surattestlistele.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 70;BA.debugLine="ButtonGateSayisi.TextColor = Color.koyuMavi";
Debug.ShouldStop(32);
surattestlistele.mostCurrent._buttongatesayisi.runMethod(true,"setTextColor",surattestlistele.mostCurrent._color._koyumavi /*RemoteObject*/ );
 BA.debugLineNum = 71;BA.debugLine="ButtonGateSayisi.Typeface = Typeface.DEFAULT_BOLD";
Debug.ShouldStop(64);
surattestlistele.mostCurrent._buttongatesayisi.runMethod(false,"setTypeface",surattestlistele.mostCurrent.__c.getField(false,"Typeface").getField(false,"DEFAULT_BOLD"));
 BA.debugLineNum = 72;BA.debugLine="ButtonGateSayisi.Text = \"GATE SAYISI\"";
Debug.ShouldStop(128);
surattestlistele.mostCurrent._buttongatesayisi.runMethod(true,"setText",BA.ObjectToCharSequence("GATE SAYISI"));
 BA.debugLineNum = 73;BA.debugLine="ButtonGateSayisi.TextSize = 14";
Debug.ShouldStop(256);
surattestlistele.mostCurrent._buttongatesayisi.runMethod(true,"setTextSize",BA.numberCast(float.class, 14));
 BA.debugLineNum = 74;BA.debugLine="ButtonGateSayisi.SingleLine = True";
Debug.ShouldStop(512);
surattestlistele.mostCurrent._buttongatesayisi.runVoidMethod ("setSingleLine",surattestlistele.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 76;BA.debugLine="ButtonSetSayisi.TextColor = Color.koyuMavi";
Debug.ShouldStop(2048);
surattestlistele.mostCurrent._buttonsetsayisi.runMethod(true,"setTextColor",surattestlistele.mostCurrent._color._koyumavi /*RemoteObject*/ );
 BA.debugLineNum = 77;BA.debugLine="ButtonSetSayisi.Typeface = Typeface.DEFAULT_BOLD";
Debug.ShouldStop(4096);
surattestlistele.mostCurrent._buttonsetsayisi.runMethod(false,"setTypeface",surattestlistele.mostCurrent.__c.getField(false,"Typeface").getField(false,"DEFAULT_BOLD"));
 BA.debugLineNum = 78;BA.debugLine="ButtonSetSayisi.Text = \"SET SAYISI\"";
Debug.ShouldStop(8192);
surattestlistele.mostCurrent._buttonsetsayisi.runMethod(true,"setText",BA.ObjectToCharSequence("SET SAYISI"));
 BA.debugLineNum = 79;BA.debugLine="ButtonSetSayisi.TextSize = 14";
Debug.ShouldStop(16384);
surattestlistele.mostCurrent._buttonsetsayisi.runMethod(true,"setTextSize",BA.numberCast(float.class, 14));
 BA.debugLineNum = 80;BA.debugLine="ButtonSetSayisi.SingleLine = True";
Debug.ShouldStop(32768);
surattestlistele.mostCurrent._buttonsetsayisi.runVoidMethod ("setSingleLine",surattestlistele.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 82;BA.debugLine="WebView1.JavaScriptEnabled = True";
Debug.ShouldStop(131072);
surattestlistele.mostCurrent._webview1.runMethod(true,"setJavaScriptEnabled",surattestlistele.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 83;BA.debugLine="WebView1.ZoomEnabled = True";
Debug.ShouldStop(262144);
surattestlistele.mostCurrent._webview1.runMethod(true,"setZoomEnabled",surattestlistele.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 86;BA.debugLine="HTMLGosterDB";
Debug.ShouldStop(2097152);
_htmlgosterdb();
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
public static RemoteObject  _activity_pause(RemoteObject _userclosed) throws Exception{
try {
		Debug.PushSubsStack("Activity_Pause (surattestlistele) ","surattestlistele",8,surattestlistele.mostCurrent.activityBA,surattestlistele.mostCurrent,93);
if (RapidSub.canDelegate("activity_pause")) { return b4a.example3.surattestlistele.remoteMe.runUserSub(false, "surattestlistele","activity_pause", _userclosed);}
Debug.locals.put("UserClosed", _userclosed);
 BA.debugLineNum = 93;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
Debug.ShouldStop(268435456);
 BA.debugLineNum = 95;BA.debugLine="End Sub";
Debug.ShouldStop(1073741824);
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
		Debug.PushSubsStack("Activity_Resume (surattestlistele) ","surattestlistele",8,surattestlistele.mostCurrent.activityBA,surattestlistele.mostCurrent,89);
if (RapidSub.canDelegate("activity_resume")) { return b4a.example3.surattestlistele.remoteMe.runUserSub(false, "surattestlistele","activity_resume");}
 BA.debugLineNum = 89;BA.debugLine="Sub Activity_Resume";
Debug.ShouldStop(16777216);
 BA.debugLineNum = 91;BA.debugLine="End Sub";
Debug.ShouldStop(67108864);
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
		Debug.PushSubsStack("ButtonAnasayfa_Click (surattestlistele) ","surattestlistele",8,surattestlistele.mostCurrent.activityBA,surattestlistele.mostCurrent,111);
if (RapidSub.canDelegate("buttonanasayfa_click")) { return b4a.example3.surattestlistele.remoteMe.runUserSub(false, "surattestlistele","buttonanasayfa_click");}
 BA.debugLineNum = 111;BA.debugLine="Sub ButtonAnasayfa_Click";
Debug.ShouldStop(16384);
 BA.debugLineNum = 112;BA.debugLine="StartActivity(AnaMenu)";
Debug.ShouldStop(32768);
surattestlistele.mostCurrent.__c.runVoidMethod ("StartActivity",surattestlistele.processBA,(Object)((surattestlistele.mostCurrent._anamenu.getObject())));
 BA.debugLineNum = 113;BA.debugLine="Activity.Finish";
Debug.ShouldStop(65536);
surattestlistele.mostCurrent._activity.runVoidMethod ("Finish");
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
public static RemoteObject  _buttongatesayisi_click() throws Exception{
try {
		Debug.PushSubsStack("ButtonGateSayisi_Click (surattestlistele) ","surattestlistele",8,surattestlistele.mostCurrent.activityBA,surattestlistele.mostCurrent,147);
if (RapidSub.canDelegate("buttongatesayisi_click")) { return b4a.example3.surattestlistele.remoteMe.runUserSub(false, "surattestlistele","buttongatesayisi_click");}
 BA.debugLineNum = 147;BA.debugLine="Sub ButtonGateSayisi_Click";
Debug.ShouldStop(262144);
 BA.debugLineNum = 148;BA.debugLine="WebView1.LoadHtml(DBUtils.ExecuteHtml(Main.sql,\"S";
Debug.ShouldStop(524288);
surattestlistele.mostCurrent._webview1.runVoidMethod ("LoadHtml",(Object)(surattestlistele.mostCurrent._dbutils.runMethod(true,"_executehtml" /*RemoteObject*/ ,surattestlistele.mostCurrent.activityBA,(Object)(surattestlistele.mostCurrent._main._sql /*RemoteObject*/ ),(Object)(RemoteObject.concat(RemoteObject.createImmutable("SELECT denek_tc As [Denek TC], denek_isim As [DENEK İSİM] ,gateSayisi As [BAĞLI GATE SAYISI] , mod As [SEÇİLEN MOD], surat_tarih As [TARİH], surat_saat As [SAAT], rest_dakika  As [REST DK.], rest_saniye As [REST SN.], result As [RESULT] , setSayisi As [SET SAYISI], veri1 As [LAP1], veri2 As [LAP2], veri3 As [LAP], veri4 As [LAP], veri5 As [LAP], veri6 As [LAP],veri7 As [LAP7],veri8 As [LAP8],veri9 As [LAP9],veri10 As [LAP10],veri11 As [LAP11],veri12 As [LAP12],veri13 As [LAP13],veri14 As [LAP14],veri15 As [LAP15],veri16 As [LAP16],veri17 As [LAP17],veri18 As [LAP18],veri19 As [LAP19],veri20 As [LAP20],veri21 As [LAP21],veri22 As [LAP22],veri23 As [LAP23],veri24 As [LAP24],veri25 As [LAP25],veri26 As [LAP26],veri27 As [LAP27],veri28 As [LAP28],veri29 As [LAP29],veri30 As [LAP30],veri31 As [LAP31],veri32 As [LAP32],veri33 As [LAP33],veri34 As [LAP34],veri35 As [LAP35],veri36 As [LAP36],veri37 As [LAP37],veri38 As [LAP38],veri39 As [LAP39],veri40 As [LAP40],veri41 As [LAP41],veri42 As [LAP42],veri43 As [LAP43],veri44 As [LAP44],veri45 As [LAP45],veri46 As [LAP46],veri47 As [LAP47],veri48 As [LAP48],veri49 As [LAP49],veri50 As [LAP50],veri51 As [LAP51],veri52 As [LAP52],veri53 As [LAP53],veri54 As [LAP54],veri55 As [LAP55],veri56 As [LAP56],veri57 As [LAP57],veri58 As [LAP58],veri59 As [LAP59],veri60 As [LAP60],veri61 As [LAP61],veri62 As [LAP62],veri63 As [LAP63],veri64 As [LAP64],veri65 As [LAP65],veri66 As [LAP66],veri67 As [LAP67],veri68 As [LAP68],veri69 As [LAP69],veri70 As [LAP70],veri71 As [LAP71],veri72 As [LAP72],veri73 As [LAP73],veri74 As [LAP74],veri75 As [LAP75],veri76 As [LAP76],veri77 As [LAP77],veri78 As [LAP78],veri79 As [LAP79],veri80 As [LAP80],veri81 As [LAP81],veri82 As [LAP82],veri83 As [LAP83],veri84 As [LAP84],veri85 As [LAP85],veri86 As [LAP86],veri87 As [LAP87],veri88 As [LAP88],veri89 As [LAP89],veri90 As [LAP90],veri91 As [LAP91],veri92 As [LAP92],veri93 As [LAP93],veri94 As [LAP94],veri95 As [LAP95],veri96 As [LAP96],veri97 As [LAP97],veri98 As [LAP98],veri99 As [LAP99],veri100 As [LAP100] FROM SuratTest,Denek WHERE SuratTest.denek_id = Denek.denek_id AND gateSayisi LIKE '%"),surattestlistele.mostCurrent._edittextara.runMethod(true,"getText"),RemoteObject.createImmutable("%' ORDER BY surat_id DESC "))),(Object)((surattestlistele.mostCurrent.__c.getField(false,"Null"))),(Object)(BA.numberCast(int.class, -(double) (0 + 1))),(Object)(surattestlistele.mostCurrent.__c.getField(true,"False")))));
 BA.debugLineNum = 149;BA.debugLine="End Sub";
Debug.ShouldStop(1048576);
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
		Debug.PushSubsStack("ButtonIsim_Click (surattestlistele) ","surattestlistele",8,surattestlistele.mostCurrent.activityBA,surattestlistele.mostCurrent,139);
if (RapidSub.canDelegate("buttonisim_click")) { return b4a.example3.surattestlistele.remoteMe.runUserSub(false, "surattestlistele","buttonisim_click");}
 BA.debugLineNum = 139;BA.debugLine="Sub ButtonIsim_Click";
Debug.ShouldStop(1024);
 BA.debugLineNum = 140;BA.debugLine="WebView1.LoadHtml(DBUtils.ExecuteHtml(Main.sql,\"S";
Debug.ShouldStop(2048);
surattestlistele.mostCurrent._webview1.runVoidMethod ("LoadHtml",(Object)(surattestlistele.mostCurrent._dbutils.runMethod(true,"_executehtml" /*RemoteObject*/ ,surattestlistele.mostCurrent.activityBA,(Object)(surattestlistele.mostCurrent._main._sql /*RemoteObject*/ ),(Object)(RemoteObject.concat(RemoteObject.createImmutable("SELECT denek_isim As [DENEK İSİM] ,denek_tc As [Denek TC], mod As [SEÇİLEN MOD], surat_tarih As [TARİH], surat_saat As [SAAT], rest_dakika  As [REST DK.], rest_saniye As [REST SN.], result As [RESULT] , gateSayisi As [BAĞLI GATE SAYISI] ,setSayisi As [SET SAYISI], veri1 As [LAP1], veri2 As [LAP2], veri3 As [LAP], veri4 As [LAP], veri5 As [LAP], veri6 As [LAP],veri7 As [LAP7],veri8 As [LAP8],veri9 As [LAP9],veri10 As [LAP10],veri11 As [LAP11],veri12 As [LAP12],veri13 As [LAP13],veri14 As [LAP14],veri15 As [LAP15],veri16 As [LAP16],veri17 As [LAP17],veri18 As [LAP18],veri19 As [LAP19],veri20 As [LAP20],veri21 As [LAP21],veri22 As [LAP22],veri23 As [LAP23],veri24 As [LAP24],veri25 As [LAP25],veri26 As [LAP26],veri27 As [LAP27],veri28 As [LAP28],veri29 As [LAP29],veri30 As [LAP30],veri31 As [LAP31],veri32 As [LAP32],veri33 As [LAP33],veri34 As [LAP34],veri35 As [LAP35],veri36 As [LAP36],veri37 As [LAP37],veri38 As [LAP38],veri39 As [LAP39],veri40 As [LAP40],veri41 As [LAP41],veri42 As [LAP42],veri43 As [LAP43],veri44 As [LAP44],veri45 As [LAP45],veri46 As [LAP46],veri47 As [LAP47],veri48 As [LAP48],veri49 As [LAP49],veri50 As [LAP50],veri51 As [LAP51],veri52 As [LAP52],veri53 As [LAP53],veri54 As [LAP54],veri55 As [LAP55],veri56 As [LAP56],veri57 As [LAP57],veri58 As [LAP58],veri59 As [LAP59],veri60 As [LAP60],veri61 As [LAP61],veri62 As [LAP62],veri63 As [LAP63],veri64 As [LAP64],veri65 As [LAP65],veri66 As [LAP66],veri67 As [LAP67],veri68 As [LAP68],veri69 As [LAP69],veri70 As [LAP70],veri71 As [LAP71],veri72 As [LAP72],veri73 As [LAP73],veri74 As [LAP74],veri75 As [LAP75],veri76 As [LAP76],veri77 As [LAP77],veri78 As [LAP78],veri79 As [LAP79],veri80 As [LAP80],veri81 As [LAP81],veri82 As [LAP82],veri83 As [LAP83],veri84 As [LAP84],veri85 As [LAP85],veri86 As [LAP86],veri87 As [LAP87],veri88 As [LAP88],veri89 As [LAP89],veri90 As [LAP90],veri91 As [LAP91],veri92 As [LAP92],veri93 As [LAP93],veri94 As [LAP94],veri95 As [LAP95],veri96 As [LAP96],veri97 As [LAP97],veri98 As [LAP98],veri99 As [LAP99],veri100 As [LAP100] FROM SuratTest,Denek WHERE SuratTest.denek_id = Denek.denek_id AND denek_isim LIKE '%"),surattestlistele.mostCurrent._edittextara.runMethod(true,"getText"),RemoteObject.createImmutable("%' ORDER BY surat_id DESC "))),(Object)((surattestlistele.mostCurrent.__c.getField(false,"Null"))),(Object)(BA.numberCast(int.class, -(double) (0 + 1))),(Object)(surattestlistele.mostCurrent.__c.getField(true,"False")))));
 BA.debugLineNum = 141;BA.debugLine="End Sub";
Debug.ShouldStop(4096);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _buttonmod_click() throws Exception{
try {
		Debug.PushSubsStack("ButtonMod_Click (surattestlistele) ","surattestlistele",8,surattestlistele.mostCurrent.activityBA,surattestlistele.mostCurrent,143);
if (RapidSub.canDelegate("buttonmod_click")) { return b4a.example3.surattestlistele.remoteMe.runUserSub(false, "surattestlistele","buttonmod_click");}
 BA.debugLineNum = 143;BA.debugLine="Sub ButtonMod_Click";
Debug.ShouldStop(16384);
 BA.debugLineNum = 144;BA.debugLine="WebView1.LoadHtml(DBUtils.ExecuteHtml(Main.sql,\"S";
Debug.ShouldStop(32768);
surattestlistele.mostCurrent._webview1.runVoidMethod ("LoadHtml",(Object)(surattestlistele.mostCurrent._dbutils.runMethod(true,"_executehtml" /*RemoteObject*/ ,surattestlistele.mostCurrent.activityBA,(Object)(surattestlistele.mostCurrent._main._sql /*RemoteObject*/ ),(Object)(RemoteObject.concat(RemoteObject.createImmutable("SELECT denek_tc As [Denek TC], denek_isim As [DENEK İSİM] , mod As [SEÇİLEN MOD],surat_tarih As [TARİH], surat_saat As [SAAT], rest_dakika  As [REST DK.], rest_saniye As [REST SN.], result As [RESULT] , gateSayisi As [BAĞLI GATE SAYISI] ,setSayisi As [SET SAYISI], veri1 As [LAP1], veri2 As [LAP2], veri3 As [LAP], veri4 As [LAP], veri5 As [LAP], veri6 As [LAP],veri7 As [LAP7],veri8 As [LAP8],veri9 As [LAP9],veri10 As [LAP10],veri11 As [LAP11],veri12 As [LAP12],veri13 As [LAP13],veri14 As [LAP14],veri15 As [LAP15],veri16 As [LAP16],veri17 As [LAP17],veri18 As [LAP18],veri19 As [LAP19],veri20 As [LAP20],veri21 As [LAP21],veri22 As [LAP22],veri23 As [LAP23],veri24 As [LAP24],veri25 As [LAP25],veri26 As [LAP26],veri27 As [LAP27],veri28 As [LAP28],veri29 As [LAP29],veri30 As [LAP30],veri31 As [LAP31],veri32 As [LAP32],veri33 As [LAP33],veri34 As [LAP34],veri35 As [LAP35],veri36 As [LAP36],veri37 As [LAP37],veri38 As [LAP38],veri39 As [LAP39],veri40 As [LAP40],veri41 As [LAP41],veri42 As [LAP42],veri43 As [LAP43],veri44 As [LAP44],veri45 As [LAP45],veri46 As [LAP46],veri47 As [LAP47],veri48 As [LAP48],veri49 As [LAP49],veri50 As [LAP50],veri51 As [LAP51],veri52 As [LAP52],veri53 As [LAP53],veri54 As [LAP54],veri55 As [LAP55],veri56 As [LAP56],veri57 As [LAP57],veri58 As [LAP58],veri59 As [LAP59],veri60 As [LAP60],veri61 As [LAP61],veri62 As [LAP62],veri63 As [LAP63],veri64 As [LAP64],veri65 As [LAP65],veri66 As [LAP66],veri67 As [LAP67],veri68 As [LAP68],veri69 As [LAP69],veri70 As [LAP70],veri71 As [LAP71],veri72 As [LAP72],veri73 As [LAP73],veri74 As [LAP74],veri75 As [LAP75],veri76 As [LAP76],veri77 As [LAP77],veri78 As [LAP78],veri79 As [LAP79],veri80 As [LAP80],veri81 As [LAP81],veri82 As [LAP82],veri83 As [LAP83],veri84 As [LAP84],veri85 As [LAP85],veri86 As [LAP86],veri87 As [LAP87],veri88 As [LAP88],veri89 As [LAP89],veri90 As [LAP90],veri91 As [LAP91],veri92 As [LAP92],veri93 As [LAP93],veri94 As [LAP94],veri95 As [LAP95],veri96 As [LAP96],veri97 As [LAP97],veri98 As [LAP98],veri99 As [LAP99],veri100 As [LAP100] FROM SuratTest,Denek WHERE SuratTest.denek_id = Denek.denek_id AND mod LIKE '%"),surattestlistele.mostCurrent._edittextara.runMethod(true,"getText"),RemoteObject.createImmutable("%' ORDER BY surat_id DESC "))),(Object)((surattestlistele.mostCurrent.__c.getField(false,"Null"))),(Object)(BA.numberCast(int.class, -(double) (0 + 1))),(Object)(surattestlistele.mostCurrent.__c.getField(true,"False")))));
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
public static RemoteObject  _buttonsetsayisi_click() throws Exception{
try {
		Debug.PushSubsStack("ButtonSetSayisi_Click (surattestlistele) ","surattestlistele",8,surattestlistele.mostCurrent.activityBA,surattestlistele.mostCurrent,151);
if (RapidSub.canDelegate("buttonsetsayisi_click")) { return b4a.example3.surattestlistele.remoteMe.runUserSub(false, "surattestlistele","buttonsetsayisi_click");}
 BA.debugLineNum = 151;BA.debugLine="Sub ButtonSetSayisi_Click";
Debug.ShouldStop(4194304);
 BA.debugLineNum = 152;BA.debugLine="WebView1.LoadHtml(DBUtils.ExecuteHtml(Main.sql,\"S";
Debug.ShouldStop(8388608);
surattestlistele.mostCurrent._webview1.runVoidMethod ("LoadHtml",(Object)(surattestlistele.mostCurrent._dbutils.runMethod(true,"_executehtml" /*RemoteObject*/ ,surattestlistele.mostCurrent.activityBA,(Object)(surattestlistele.mostCurrent._main._sql /*RemoteObject*/ ),(Object)(RemoteObject.concat(RemoteObject.createImmutable("SELECT denek_tc As [Denek TC], denek_isim As [DENEK İSİM] ,setSayisi As [SET SAYISI], mod As [SEÇİLEN MOD], surat_tarih As [TARİH], surat_saat As [SAAT], rest_dakika  As [REST DK.], rest_saniye As [REST SN.], result As [RESULT] , gateSayisi As [BAĞLI GATE SAYISI] , veri1 As [LAP1], veri2 As [LAP2], veri3 As [LAP], veri4 As [LAP], veri5 As [LAP], veri6 As [LAP],veri7 As [LAP7],veri8 As [LAP8],veri9 As [LAP9],veri10 As [LAP10],veri11 As [LAP11],veri12 As [LAP12],veri13 As [LAP13],veri14 As [LAP14],veri15 As [LAP15],veri16 As [LAP16],veri17 As [LAP17],veri18 As [LAP18],veri19 As [LAP19],veri20 As [LAP20],veri21 As [LAP21],veri22 As [LAP22],veri23 As [LAP23],veri24 As [LAP24],veri25 As [LAP25],veri26 As [LAP26],veri27 As [LAP27],veri28 As [LAP28],veri29 As [LAP29],veri30 As [LAP30],veri31 As [LAP31],veri32 As [LAP32],veri33 As [LAP33],veri34 As [LAP34],veri35 As [LAP35],veri36 As [LAP36],veri37 As [LAP37],veri38 As [LAP38],veri39 As [LAP39],veri40 As [LAP40],veri41 As [LAP41],veri42 As [LAP42],veri43 As [LAP43],veri44 As [LAP44],veri45 As [LAP45],veri46 As [LAP46],veri47 As [LAP47],veri48 As [LAP48],veri49 As [LAP49],veri50 As [LAP50],veri51 As [LAP51],veri52 As [LAP52],veri53 As [LAP53],veri54 As [LAP54],veri55 As [LAP55],veri56 As [LAP56],veri57 As [LAP57],veri58 As [LAP58],veri59 As [LAP59],veri60 As [LAP60],veri61 As [LAP61],veri62 As [LAP62],veri63 As [LAP63],veri64 As [LAP64],veri65 As [LAP65],veri66 As [LAP66],veri67 As [LAP67],veri68 As [LAP68],veri69 As [LAP69],veri70 As [LAP70],veri71 As [LAP71],veri72 As [LAP72],veri73 As [LAP73],veri74 As [LAP74],veri75 As [LAP75],veri76 As [LAP76],veri77 As [LAP77],veri78 As [LAP78],veri79 As [LAP79],veri80 As [LAP80],veri81 As [LAP81],veri82 As [LAP82],veri83 As [LAP83],veri84 As [LAP84],veri85 As [LAP85],veri86 As [LAP86],veri87 As [LAP87],veri88 As [LAP88],veri89 As [LAP89],veri90 As [LAP90],veri91 As [LAP91],veri92 As [LAP92],veri93 As [LAP93],veri94 As [LAP94],veri95 As [LAP95],veri96 As [LAP96],veri97 As [LAP97],veri98 As [LAP98],veri99 As [LAP99],veri100 As [LAP100] FROM SuratTest,Denek WHERE SuratTest.denek_id = Denek.denek_id AND setSayisi LIKE '%"),surattestlistele.mostCurrent._edittextara.runMethod(true,"getText"),RemoteObject.createImmutable("%' ORDER BY surat_id DESC "))),(Object)((surattestlistele.mostCurrent.__c.getField(false,"Null"))),(Object)(BA.numberCast(int.class, -(double) (0 + 1))),(Object)(surattestlistele.mostCurrent.__c.getField(true,"False")))));
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
public static RemoteObject  _buttonsil_click() throws Exception{
try {
		Debug.PushSubsStack("ButtonSil_Click (surattestlistele) ","surattestlistele",8,surattestlistele.mostCurrent.activityBA,surattestlistele.mostCurrent,106);
if (RapidSub.canDelegate("buttonsil_click")) { return b4a.example3.surattestlistele.remoteMe.runUserSub(false, "surattestlistele","buttonsil_click");}
 BA.debugLineNum = 106;BA.debugLine="Sub ButtonSil_Click";
Debug.ShouldStop(512);
 BA.debugLineNum = 107;BA.debugLine="StartActivity(SuratTestSil)";
Debug.ShouldStop(1024);
surattestlistele.mostCurrent.__c.runVoidMethod ("StartActivity",surattestlistele.processBA,(Object)((surattestlistele.mostCurrent._surattestsil.getObject())));
 BA.debugLineNum = 108;BA.debugLine="Activity.Finish";
Debug.ShouldStop(2048);
surattestlistele.mostCurrent._activity.runVoidMethod ("Finish");
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
public static RemoteObject  _buttonsurattestekle_click() throws Exception{
try {
		Debug.PushSubsStack("ButtonSuratTestEkle_Click (surattestlistele) ","surattestlistele",8,surattestlistele.mostCurrent.activityBA,surattestlistele.mostCurrent,101);
if (RapidSub.canDelegate("buttonsurattestekle_click")) { return b4a.example3.surattestlistele.remoteMe.runUserSub(false, "surattestlistele","buttonsurattestekle_click");}
 BA.debugLineNum = 101;BA.debugLine="Sub ButtonSuratTestEkle_Click";
Debug.ShouldStop(16);
 BA.debugLineNum = 102;BA.debugLine="StartActivity(TestDenekAra)";
Debug.ShouldStop(32);
surattestlistele.mostCurrent.__c.runVoidMethod ("StartActivity",surattestlistele.processBA,(Object)((surattestlistele.mostCurrent._testdenekara.getObject())));
 BA.debugLineNum = 103;BA.debugLine="Activity.Finish";
Debug.ShouldStop(64);
surattestlistele.mostCurrent._activity.runVoidMethod ("Finish");
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
public static RemoteObject  _buttontarih_click() throws Exception{
try {
		Debug.PushSubsStack("ButtonTarih_Click (surattestlistele) ","surattestlistele",8,surattestlistele.mostCurrent.activityBA,surattestlistele.mostCurrent,131);
if (RapidSub.canDelegate("buttontarih_click")) { return b4a.example3.surattestlistele.remoteMe.runUserSub(false, "surattestlistele","buttontarih_click");}
 BA.debugLineNum = 131;BA.debugLine="Sub ButtonTarih_Click";
Debug.ShouldStop(4);
 BA.debugLineNum = 132;BA.debugLine="WebView1.LoadHtml(DBUtils.ExecuteHtml(Main.sql,\"S";
Debug.ShouldStop(8);
surattestlistele.mostCurrent._webview1.runVoidMethod ("LoadHtml",(Object)(surattestlistele.mostCurrent._dbutils.runMethod(true,"_executehtml" /*RemoteObject*/ ,surattestlistele.mostCurrent.activityBA,(Object)(surattestlistele.mostCurrent._main._sql /*RemoteObject*/ ),(Object)(RemoteObject.concat(RemoteObject.createImmutable("SELECT denek_tc As [Denek TC], denek_isim As [DENEK İSİM] ,surat_tarih As [TARİH], surat_saat As [SAAT], mod As [SEÇİLEN MOD], rest_dakika  As [REST DK.], rest_saniye As [REST SN.], result As [RESULT] , gateSayisi As [BAĞLI GATE SAYISI] ,setSayisi As [SET SAYISI], veri1 As [LAP1], veri2 As [LAP2], veri3 As [LAP], veri4 As [LAP], veri5 As [LAP], veri6 As [LAP],veri7 As [LAP7],veri8 As [LAP8],veri9 As [LAP9],veri10 As [LAP10],veri11 As [LAP11],veri12 As [LAP12],veri13 As [LAP13],veri14 As [LAP14],veri15 As [LAP15],veri16 As [LAP16],veri17 As [LAP17],veri18 As [LAP18],veri19 As [LAP19],veri20 As [LAP20],veri21 As [LAP21],veri22 As [LAP22],veri23 As [LAP23],veri24 As [LAP24],veri25 As [LAP25],veri26 As [LAP26],veri27 As [LAP27],veri28 As [LAP28],veri29 As [LAP29],veri30 As [LAP30],veri31 As [LAP31],veri32 As [LAP32],veri33 As [LAP33],veri34 As [LAP34],veri35 As [LAP35],veri36 As [LAP36],veri37 As [LAP37],veri38 As [LAP38],veri39 As [LAP39],veri40 As [LAP40],veri41 As [LAP41],veri42 As [LAP42],veri43 As [LAP43],veri44 As [LAP44],veri45 As [LAP45],veri46 As [LAP46],veri47 As [LAP47],veri48 As [LAP48],veri49 As [LAP49],veri50 As [LAP50],veri51 As [LAP51],veri52 As [LAP52],veri53 As [LAP53],veri54 As [LAP54],veri55 As [LAP55],veri56 As [LAP56],veri57 As [LAP57],veri58 As [LAP58],veri59 As [LAP59],veri60 As [LAP60],veri61 As [LAP61],veri62 As [LAP62],veri63 As [LAP63],veri64 As [LAP64],veri65 As [LAP65],veri66 As [LAP66],veri67 As [LAP67],veri68 As [LAP68],veri69 As [LAP69],veri70 As [LAP70],veri71 As [LAP71],veri72 As [LAP72],veri73 As [LAP73],veri74 As [LAP74],veri75 As [LAP75],veri76 As [LAP76],veri77 As [LAP77],veri78 As [LAP78],veri79 As [LAP79],veri80 As [LAP80],veri81 As [LAP81],veri82 As [LAP82],veri83 As [LAP83],veri84 As [LAP84],veri85 As [LAP85],veri86 As [LAP86],veri87 As [LAP87],veri88 As [LAP88],veri89 As [LAP89],veri90 As [LAP90],veri91 As [LAP91],veri92 As [LAP92],veri93 As [LAP93],veri94 As [LAP94],veri95 As [LAP95],veri96 As [LAP96],veri97 As [LAP97],veri98 As [LAP98],veri99 As [LAP99],veri100 As [LAP100] FROM SuratTest,Denek WHERE SuratTest.denek_id = Denek.denek_id AND surat_tarih LIKE '%"),surattestlistele.mostCurrent._edittextara.runMethod(true,"getText"),RemoteObject.createImmutable("%' ORDER BY surat_id DESC "))),(Object)((surattestlistele.mostCurrent.__c.getField(false,"Null"))),(Object)(BA.numberCast(int.class, -(double) (0 + 1))),(Object)(surattestlistele.mostCurrent.__c.getField(true,"False")))));
 BA.debugLineNum = 133;BA.debugLine="End Sub";
Debug.ShouldStop(16);
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
		Debug.PushSubsStack("ButtonTc_Click (surattestlistele) ","surattestlistele",8,surattestlistele.mostCurrent.activityBA,surattestlistele.mostCurrent,135);
if (RapidSub.canDelegate("buttontc_click")) { return b4a.example3.surattestlistele.remoteMe.runUserSub(false, "surattestlistele","buttontc_click");}
 BA.debugLineNum = 135;BA.debugLine="Sub ButtonTc_Click";
Debug.ShouldStop(64);
 BA.debugLineNum = 136;BA.debugLine="WebView1.LoadHtml(DBUtils.ExecuteHtml(Main.sql,\"S";
Debug.ShouldStop(128);
surattestlistele.mostCurrent._webview1.runVoidMethod ("LoadHtml",(Object)(surattestlistele.mostCurrent._dbutils.runMethod(true,"_executehtml" /*RemoteObject*/ ,surattestlistele.mostCurrent.activityBA,(Object)(surattestlistele.mostCurrent._main._sql /*RemoteObject*/ ),(Object)(RemoteObject.concat(RemoteObject.createImmutable("SELECT denek_tc As [Denek TC], denek_isim As [DENEK İSİM] , mod As [SEÇİLEN MOD], surat_tarih As [TARİH], surat_saat As [SAAT], rest_dakika  As [REST DK.], rest_saniye As [REST SN.], result As [RESULT] , gateSayisi As [BAĞLI GATE SAYISI] ,setSayisi As [SET SAYISI], veri1 As [LAP1], veri2 As [LAP2], veri3 As [LAP], veri4 As [LAP], veri5 As [LAP], veri6 As [LAP],veri7 As [LAP7],veri8 As [LAP8],veri9 As [LAP9],veri10 As [LAP10],veri11 As [LAP11],veri12 As [LAP12],veri13 As [LAP13],veri14 As [LAP14],veri15 As [LAP15],veri16 As [LAP16],veri17 As [LAP17],veri18 As [LAP18],veri19 As [LAP19],veri20 As [LAP20],veri21 As [LAP21],veri22 As [LAP22],veri23 As [LAP23],veri24 As [LAP24],veri25 As [LAP25],veri26 As [LAP26],veri27 As [LAP27],veri28 As [LAP28],veri29 As [LAP29],veri30 As [LAP30],veri31 As [LAP31],veri32 As [LAP32],veri33 As [LAP33],veri34 As [LAP34],veri35 As [LAP35],veri36 As [LAP36],veri37 As [LAP37],veri38 As [LAP38],veri39 As [LAP39],veri40 As [LAP40],veri41 As [LAP41],veri42 As [LAP42],veri43 As [LAP43],veri44 As [LAP44],veri45 As [LAP45],veri46 As [LAP46],veri47 As [LAP47],veri48 As [LAP48],veri49 As [LAP49],veri50 As [LAP50],veri51 As [LAP51],veri52 As [LAP52],veri53 As [LAP53],veri54 As [LAP54],veri55 As [LAP55],veri56 As [LAP56],veri57 As [LAP57],veri58 As [LAP58],veri59 As [LAP59],veri60 As [LAP60],veri61 As [LAP61],veri62 As [LAP62],veri63 As [LAP63],veri64 As [LAP64],veri65 As [LAP65],veri66 As [LAP66],veri67 As [LAP67],veri68 As [LAP68],veri69 As [LAP69],veri70 As [LAP70],veri71 As [LAP71],veri72 As [LAP72],veri73 As [LAP73],veri74 As [LAP74],veri75 As [LAP75],veri76 As [LAP76],veri77 As [LAP77],veri78 As [LAP78],veri79 As [LAP79],veri80 As [LAP80],veri81 As [LAP81],veri82 As [LAP82],veri83 As [LAP83],veri84 As [LAP84],veri85 As [LAP85],veri86 As [LAP86],veri87 As [LAP87],veri88 As [LAP88],veri89 As [LAP89],veri90 As [LAP90],veri91 As [LAP91],veri92 As [LAP92],veri93 As [LAP93],veri94 As [LAP94],veri95 As [LAP95],veri96 As [LAP96],veri97 As [LAP97],veri98 As [LAP98],veri99 As [LAP99],veri100 As [LAP100] FROM SuratTest,Denek WHERE SuratTest.denek_id = Denek.denek_id AND denek_tc LIKE '%"),surattestlistele.mostCurrent._edittextara.runMethod(true,"getText"),RemoteObject.createImmutable("%' ORDER BY surat_id DESC "))),(Object)((surattestlistele.mostCurrent.__c.getField(false,"Null"))),(Object)(BA.numberCast(int.class, -(double) (0 + 1))),(Object)(surattestlistele.mostCurrent.__c.getField(true,"False")))));
 BA.debugLineNum = 137;BA.debugLine="End Sub";
Debug.ShouldStop(256);
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
		Debug.PushSubsStack("EditTextAra_TextChanged (surattestlistele) ","surattestlistele",8,surattestlistele.mostCurrent.activityBA,surattestlistele.mostCurrent,122);
if (RapidSub.canDelegate("edittextara_textchanged")) { return b4a.example3.surattestlistele.remoteMe.runUserSub(false, "surattestlistele","edittextara_textchanged", _old, _new);}
Debug.locals.put("Old", _old);
Debug.locals.put("New", _new);
 BA.debugLineNum = 122;BA.debugLine="Sub EditTextAra_TextChanged (Old As String, New As";
Debug.ShouldStop(33554432);
 BA.debugLineNum = 123;BA.debugLine="LabelCarpi.Visible = True";
Debug.ShouldStop(67108864);
surattestlistele.mostCurrent._labelcarpi.runMethod(true,"setVisible",surattestlistele.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 124;BA.debugLine="WebView1.LoadHtml(DBUtils.ExecuteHtml(Main.sql,\"S";
Debug.ShouldStop(134217728);
surattestlistele.mostCurrent._webview1.runVoidMethod ("LoadHtml",(Object)(surattestlistele.mostCurrent._dbutils.runMethod(true,"_executehtml" /*RemoteObject*/ ,surattestlistele.mostCurrent.activityBA,(Object)(surattestlistele.mostCurrent._main._sql /*RemoteObject*/ ),(Object)(RemoteObject.concat(RemoteObject.createImmutable("SELECT denek_tc As [Denek TC], denek_isim As [DENEK İSİM] , mod As [SEÇİLEN MOD], surat_tarih As [TARİH], surat_saat As [SAAT], rest_dakika  As [REST DK.], rest_saniye As [REST SN.], result As [RESULT] , gateSayisi As [BAĞLI GATE SAYISI] ,setSayisi As [SET SAYISI], veri1 As [LAP1], veri2 As [LAP2], veri3 As [LAP], veri4 As [LAP], veri5 As [LAP], veri6 As [LAP],veri7 As [LAP7],veri8 As [LAP8],veri9 As [LAP9],veri10 As [LAP10],veri11 As [LAP11],veri12 As [LAP12],veri13 As [LAP13],veri14 As [LAP14],veri15 As [LAP15],veri16 As [LAP16],veri17 As [LAP17],veri18 As [LAP18],veri19 As [LAP19],veri20 As [LAP20],veri21 As [LAP21],veri22 As [LAP22],veri23 As [LAP23],veri24 As [LAP24],veri25 As [LAP25],veri26 As [LAP26],veri27 As [LAP27],veri28 As [LAP28],veri29 As [LAP29],veri30 As [LAP30],veri31 As [LAP31],veri32 As [LAP32],veri33 As [LAP33],veri34 As [LAP34],veri35 As [LAP35],veri36 As [LAP36],veri37 As [LAP37],veri38 As [LAP38],veri39 As [LAP39],veri40 As [LAP40],veri41 As [LAP41],veri42 As [LAP42],veri43 As [LAP43],veri44 As [LAP44],veri45 As [LAP45],veri46 As [LAP46],veri47 As [LAP47],veri48 As [LAP48],veri49 As [LAP49],veri50 As [LAP50],veri51 As [LAP51],veri52 As [LAP52],veri53 As [LAP53],veri54 As [LAP54],veri55 As [LAP55],veri56 As [LAP56],veri57 As [LAP57],veri58 As [LAP58],veri59 As [LAP59],veri60 As [LAP60],veri61 As [LAP61],veri62 As [LAP62],veri63 As [LAP63],veri64 As [LAP64],veri65 As [LAP65],veri66 As [LAP66],veri67 As [LAP67],veri68 As [LAP68],veri69 As [LAP69],veri70 As [LAP70],veri71 As [LAP71],veri72 As [LAP72],veri73 As [LAP73],veri74 As [LAP74],veri75 As [LAP75],veri76 As [LAP76],veri77 As [LAP77],veri78 As [LAP78],veri79 As [LAP79],veri80 As [LAP80],veri81 As [LAP81],veri82 As [LAP82],veri83 As [LAP83],veri84 As [LAP84],veri85 As [LAP85],veri86 As [LAP86],veri87 As [LAP87],veri88 As [LAP88],veri89 As [LAP89],veri90 As [LAP90],veri91 As [LAP91],veri92 As [LAP92],veri93 As [LAP93],veri94 As [LAP94],veri95 As [LAP95],veri96 As [LAP96],veri97 As [LAP97],veri98 As [LAP98],veri99 As [LAP99],veri100 As [LAP100] FROM SuratTest,Denek WHERE SuratTest.denek_id = Denek.denek_id AND (denek_tc LIKE '%"),surattestlistele.mostCurrent._edittextara.runMethod(true,"getText"),RemoteObject.createImmutable("%' OR denek_isim LIKE '%"),surattestlistele.mostCurrent._edittextara.runMethod(true,"getText"),RemoteObject.createImmutable("%' OR mod LIKE '%"),surattestlistele.mostCurrent._edittextara.runMethod(true,"getText"),RemoteObject.createImmutable("%' OR surat_tarih LIKE '%"),surattestlistele.mostCurrent._edittextara.runMethod(true,"getText"),RemoteObject.createImmutable("%' OR gateSayisi LIKE '%"),surattestlistele.mostCurrent._edittextara.runMethod(true,"getText"),RemoteObject.createImmutable("%' OR setSayisi LIKE '%"),surattestlistele.mostCurrent._edittextara.runMethod(true,"getText"),RemoteObject.createImmutable("%') ORDER BY surat_id DESC "))),(Object)((surattestlistele.mostCurrent.__c.getField(false,"Null"))),(Object)(BA.numberCast(int.class, -(double) (0 + 1))),(Object)(surattestlistele.mostCurrent.__c.getField(true,"False")))));
 BA.debugLineNum = 125;BA.debugLine="If EditTextAra.Text = \"\" Then";
Debug.ShouldStop(268435456);
if (RemoteObject.solveBoolean("=",surattestlistele.mostCurrent._edittextara.runMethod(true,"getText"),BA.ObjectToString(""))) { 
 BA.debugLineNum = 126;BA.debugLine="LabelCarpi.Visible = False";
Debug.ShouldStop(536870912);
surattestlistele.mostCurrent._labelcarpi.runMethod(true,"setVisible",surattestlistele.mostCurrent.__c.getField(true,"False"));
 };
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
public static RemoteObject  _globals() throws Exception{
 //BA.debugLineNum = 12;BA.debugLine="Sub Globals";
 //BA.debugLineNum = 16;BA.debugLine="Private ButtonSuratTestEkle As Button";
surattestlistele.mostCurrent._buttonsurattestekle = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 17;BA.debugLine="Private ButtonSil As Button";
surattestlistele.mostCurrent._buttonsil = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 19;BA.debugLine="Private ButtonTarih As Button";
surattestlistele.mostCurrent._buttontarih = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 20;BA.debugLine="Private ButtonTc As Button";
surattestlistele.mostCurrent._buttontc = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 21;BA.debugLine="Private ButtonIsim As Button";
surattestlistele.mostCurrent._buttonisim = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 22;BA.debugLine="Private ButtonMod As Button";
surattestlistele.mostCurrent._buttonmod = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 23;BA.debugLine="Private ButtonGateSayisi As Button";
surattestlistele.mostCurrent._buttongatesayisi = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 24;BA.debugLine="Private ButtonSetSayisi As Button";
surattestlistele.mostCurrent._buttonsetsayisi = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 26;BA.debugLine="Private EditTextAra As EditText";
surattestlistele.mostCurrent._edittextara = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
 //BA.debugLineNum = 27;BA.debugLine="Private WebView1 As WebView";
surattestlistele.mostCurrent._webview1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.WebViewWrapper");
 //BA.debugLineNum = 28;BA.debugLine="Private ButtonAnasayfa As Button";
surattestlistele.mostCurrent._buttonanasayfa = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 29;BA.debugLine="Private LabelCarpi As Label";
surattestlistele.mostCurrent._labelcarpi = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 32;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _htmlgosterdb() throws Exception{
try {
		Debug.PushSubsStack("HTMLGosterDB (surattestlistele) ","surattestlistele",8,surattestlistele.mostCurrent.activityBA,surattestlistele.mostCurrent,97);
if (RapidSub.canDelegate("htmlgosterdb")) { return b4a.example3.surattestlistele.remoteMe.runUserSub(false, "surattestlistele","htmlgosterdb");}
 BA.debugLineNum = 97;BA.debugLine="Sub HTMLGosterDB";
Debug.ShouldStop(1);
 BA.debugLineNum = 98;BA.debugLine="WebView1.LoadHtml(DBUtils.ExecuteHtml(Main.sql,\"S";
Debug.ShouldStop(2);
surattestlistele.mostCurrent._webview1.runVoidMethod ("LoadHtml",(Object)(surattestlistele.mostCurrent._dbutils.runMethod(true,"_executehtml" /*RemoteObject*/ ,surattestlistele.mostCurrent.activityBA,(Object)(surattestlistele.mostCurrent._main._sql /*RemoteObject*/ ),(Object)(BA.ObjectToString("SELECT denek_tc As [Denek TC], denek_isim As [DENEK İSİM] , mod As [SEÇİLEN MOD], surat_tarih As [TARİH], surat_saat As [SAAT], rest_dakika  As [REST DK.], rest_saniye As [REST SN.], result As [RESULT] , gateSayisi As [BAĞLI GATE SAYISI] ,setSayisi As [SET SAYISI], veri1 As [LAP1], veri2 As [LAP2], veri3 As [LAP3], veri4 As [LAP4], veri5 As [LAP5], veri6 As [LAP6],veri7 As [LAP7],veri8 As [LAP8],veri9 As [LAP9],veri10 As [LAP10],veri11 As [LAP11],veri12 As [LAP12],veri13 As [LAP13],veri14 As [LAP14],veri15 As [LAP15],veri16 As [LAP16],veri17 As [LAP17],veri18 As [LAP18],veri19 As [LAP19],veri20 As [LAP20],veri21 As [LAP21],veri22 As [LAP22],veri23 As [LAP23],veri24 As [LAP24],veri25 As [LAP25],veri26 As [LAP26],veri27 As [LAP27],veri28 As [LAP28],veri29 As [LAP29],veri30 As [LAP30],veri31 As [LAP31],veri32 As [LAP32],veri33 As [LAP33],veri34 As [LAP34],veri35 As [LAP35],veri36 As [LAP36],veri37 As [LAP37],veri38 As [LAP38],veri39 As [LAP39],veri40 As [LAP40],veri41 As [LAP41],veri42 As [LAP42],veri43 As [LAP43],veri44 As [LAP44],veri45 As [LAP45],veri46 As [LAP46],veri47 As [LAP47],veri48 As [LAP48],veri49 As [LAP49],veri50 As [LAP50],veri51 As [LAP51],veri52 As [LAP52],veri53 As [LAP53],veri54 As [LAP54],veri55 As [LAP55],veri56 As [LAP56],veri57 As [LAP57],veri58 As [LAP58],veri59 As [LAP59],veri60 As [LAP60],veri61 As [LAP61],veri62 As [LAP62],veri63 As [LAP63],veri64 As [LAP64],veri65 As [LAP65],veri66 As [LAP66],veri67 As [LAP67],veri68 As [LAP68],veri69 As [LAP69],veri70 As [LAP70],veri71 As [LAP71],veri72 As [LAP72],veri73 As [LAP73],veri74 As [LAP74],veri75 As [LAP75],veri76 As [LAP76],veri77 As [LAP77],veri78 As [LAP78],veri79 As [LAP79],veri80 As [LAP80],veri81 As [LAP81],veri82 As [LAP82],veri83 As [LAP83],veri84 As [LAP84],veri85 As [LAP85],veri86 As [LAP86],veri87 As [LAP87],veri88 As [LAP88],veri89 As [LAP89],veri90 As [LAP90],veri91 As [LAP91],veri92 As [LAP92],veri93 As [LAP93],veri94 As [LAP94],veri95 As [LAP95],veri96 As [LAP96],veri97 As [LAP97],veri98 As [LAP98],veri99 As [LAP99],veri100 As [LAP100] FROM SuratTest,Denek WHERE SuratTest.denek_id = Denek.denek_id ")),(Object)((surattestlistele.mostCurrent.__c.getField(false,"Null"))),(Object)(BA.numberCast(int.class, -(double) (0 + 1))),(Object)(surattestlistele.mostCurrent.__c.getField(true,"False")))));
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
public static RemoteObject  _labelcarpi_click() throws Exception{
try {
		Debug.PushSubsStack("LabelCarpi_Click (surattestlistele) ","surattestlistele",8,surattestlistele.mostCurrent.activityBA,surattestlistele.mostCurrent,116);
if (RapidSub.canDelegate("labelcarpi_click")) { return b4a.example3.surattestlistele.remoteMe.runUserSub(false, "surattestlistele","labelcarpi_click");}
 BA.debugLineNum = 116;BA.debugLine="Sub LabelCarpi_Click";
Debug.ShouldStop(524288);
 BA.debugLineNum = 117;BA.debugLine="EditTextAra.SelectAll";
Debug.ShouldStop(1048576);
surattestlistele.mostCurrent._edittextara.runVoidMethod ("SelectAll");
 BA.debugLineNum = 118;BA.debugLine="EditTextAra.Text = \"\"";
Debug.ShouldStop(2097152);
surattestlistele.mostCurrent._edittextara.runMethodAndSync(true,"setText",BA.ObjectToCharSequence(""));
 BA.debugLineNum = 119;BA.debugLine="HTMLGosterDB";
Debug.ShouldStop(4194304);
_htmlgosterdb();
 BA.debugLineNum = 120;BA.debugLine="End Sub";
Debug.ShouldStop(8388608);
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