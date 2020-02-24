package b4a.example3;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class antropometrikekle_subs_0 {


public static RemoteObject  _activity_create(RemoteObject _firsttime) throws Exception{
try {
		Debug.PushSubsStack("Activity_Create (antropometrikekle) ","antropometrikekle",29,antropometrikekle.mostCurrent.activityBA,antropometrikekle.mostCurrent,39);
if (RapidSub.canDelegate("activity_create")) { return b4a.example3.antropometrikekle.remoteMe.runUserSub(false, "antropometrikekle","activity_create", _firsttime);}
Debug.locals.put("FirstTime", _firsttime);
 BA.debugLineNum = 39;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
Debug.ShouldStop(64);
 BA.debugLineNum = 41;BA.debugLine="Activity.LoadLayout(\"AntropometrikEklePage\")";
Debug.ShouldStop(256);
antropometrikekle.mostCurrent._activity.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("AntropometrikEklePage")),antropometrikekle.mostCurrent.activityBA);
 BA.debugLineNum = 45;BA.debugLine="LabelAntropometrikBoy.TextColor = Colors.White";
Debug.ShouldStop(4096);
antropometrikekle.mostCurrent._labelantropometrikboy.runMethod(true,"setTextColor",antropometrikekle.mostCurrent.__c.getField(false,"Colors").getField(true,"White"));
 BA.debugLineNum = 46;BA.debugLine="LabelAntropometrikBoy.TextSize = 20";
Debug.ShouldStop(8192);
antropometrikekle.mostCurrent._labelantropometrikboy.runMethod(true,"setTextSize",BA.numberCast(float.class, 20));
 BA.debugLineNum = 47;BA.debugLine="LabelAntropometrikBoy.Typeface = Typeface.DEFAULT";
Debug.ShouldStop(16384);
antropometrikekle.mostCurrent._labelantropometrikboy.runMethod(false,"setTypeface",antropometrikekle.mostCurrent.__c.getField(false,"Typeface").getField(false,"DEFAULT_BOLD"));
 BA.debugLineNum = 49;BA.debugLine="LabelAntropometrikKilo.TextColor = Colors.White";
Debug.ShouldStop(65536);
antropometrikekle.mostCurrent._labelantropometrikkilo.runMethod(true,"setTextColor",antropometrikekle.mostCurrent.__c.getField(false,"Colors").getField(true,"White"));
 BA.debugLineNum = 50;BA.debugLine="LabelAntropometrikKilo.TextSize = 20";
Debug.ShouldStop(131072);
antropometrikekle.mostCurrent._labelantropometrikkilo.runMethod(true,"setTextSize",BA.numberCast(float.class, 20));
 BA.debugLineNum = 51;BA.debugLine="LabelAntropometrikKilo.Typeface = Typeface.DEFAUL";
Debug.ShouldStop(262144);
antropometrikekle.mostCurrent._labelantropometrikkilo.runMethod(false,"setTypeface",antropometrikekle.mostCurrent.__c.getField(false,"Typeface").getField(false,"DEFAULT_BOLD"));
 BA.debugLineNum = 53;BA.debugLine="LabelElUzunlugu.TextColor = Colors.White";
Debug.ShouldStop(1048576);
antropometrikekle.mostCurrent._labeleluzunlugu.runMethod(true,"setTextColor",antropometrikekle.mostCurrent.__c.getField(false,"Colors").getField(true,"White"));
 BA.debugLineNum = 54;BA.debugLine="LabelElUzunlugu.TextSize = 20";
Debug.ShouldStop(2097152);
antropometrikekle.mostCurrent._labeleluzunlugu.runMethod(true,"setTextSize",BA.numberCast(float.class, 20));
 BA.debugLineNum = 55;BA.debugLine="LabelElUzunlugu.Typeface = Typeface.DEFAULT_BOLD";
Debug.ShouldStop(4194304);
antropometrikekle.mostCurrent._labeleluzunlugu.runMethod(false,"setTypeface",antropometrikekle.mostCurrent.__c.getField(false,"Typeface").getField(false,"DEFAULT_BOLD"));
 BA.debugLineNum = 57;BA.debugLine="LabelKulacUzunlugu.TextColor = Colors.White";
Debug.ShouldStop(16777216);
antropometrikekle.mostCurrent._labelkulacuzunlugu.runMethod(true,"setTextColor",antropometrikekle.mostCurrent.__c.getField(false,"Colors").getField(true,"White"));
 BA.debugLineNum = 58;BA.debugLine="LabelKulacUzunlugu.TextSize = 20";
Debug.ShouldStop(33554432);
antropometrikekle.mostCurrent._labelkulacuzunlugu.runMethod(true,"setTextSize",BA.numberCast(float.class, 20));
 BA.debugLineNum = 59;BA.debugLine="LabelKulacUzunlugu.Typeface = Typeface.DEFAULT_BO";
Debug.ShouldStop(67108864);
antropometrikekle.mostCurrent._labelkulacuzunlugu.runMethod(false,"setTypeface",antropometrikekle.mostCurrent.__c.getField(false,"Typeface").getField(false,"DEFAULT_BOLD"));
 BA.debugLineNum = 61;BA.debugLine="LabelOturmaYuksekligi.TextColor = Colors.White";
Debug.ShouldStop(268435456);
antropometrikekle.mostCurrent._labeloturmayuksekligi.runMethod(true,"setTextColor",antropometrikekle.mostCurrent.__c.getField(false,"Colors").getField(true,"White"));
 BA.debugLineNum = 62;BA.debugLine="LabelOturmaYuksekligi.TextSize = 20";
Debug.ShouldStop(536870912);
antropometrikekle.mostCurrent._labeloturmayuksekligi.runMethod(true,"setTextSize",BA.numberCast(float.class, 20));
 BA.debugLineNum = 63;BA.debugLine="LabelOturmaYuksekligi.Typeface = Typeface.DEFAULT";
Debug.ShouldStop(1073741824);
antropometrikekle.mostCurrent._labeloturmayuksekligi.runMethod(false,"setTypeface",antropometrikekle.mostCurrent.__c.getField(false,"Typeface").getField(false,"DEFAULT_BOLD"));
 BA.debugLineNum = 65;BA.debugLine="LabelAyakUzunlugu.TextColor = Colors.White";
Debug.ShouldStop(1);
antropometrikekle.mostCurrent._labelayakuzunlugu.runMethod(true,"setTextColor",antropometrikekle.mostCurrent.__c.getField(false,"Colors").getField(true,"White"));
 BA.debugLineNum = 66;BA.debugLine="LabelAyakUzunlugu.TextSize = 20";
Debug.ShouldStop(2);
antropometrikekle.mostCurrent._labelayakuzunlugu.runMethod(true,"setTextSize",BA.numberCast(float.class, 20));
 BA.debugLineNum = 67;BA.debugLine="LabelAyakUzunlugu.Typeface = Typeface.DEFAULT_BOL";
Debug.ShouldStop(4);
antropometrikekle.mostCurrent._labelayakuzunlugu.runMethod(false,"setTypeface",antropometrikekle.mostCurrent.__c.getField(false,"Typeface").getField(false,"DEFAULT_BOLD"));
 BA.debugLineNum = 69;BA.debugLine="LabelDeriKivrimKalinligi.TextColor = Colors.White";
Debug.ShouldStop(16);
antropometrikekle.mostCurrent._labelderikivrimkalinligi.runMethod(true,"setTextColor",antropometrikekle.mostCurrent.__c.getField(false,"Colors").getField(true,"White"));
 BA.debugLineNum = 70;BA.debugLine="LabelDeriKivrimKalinligi.TextSize = 20";
Debug.ShouldStop(32);
antropometrikekle.mostCurrent._labelderikivrimkalinligi.runMethod(true,"setTextSize",BA.numberCast(float.class, 20));
 BA.debugLineNum = 71;BA.debugLine="LabelDeriKivrimKalinligi.Typeface = Typeface.DEFA";
Debug.ShouldStop(64);
antropometrikekle.mostCurrent._labelderikivrimkalinligi.runMethod(false,"setTypeface",antropometrikekle.mostCurrent.__c.getField(false,"Typeface").getField(false,"DEFAULT_BOLD"));
 BA.debugLineNum = 73;BA.debugLine="WebView1.JavaScriptEnabled = True";
Debug.ShouldStop(256);
antropometrikekle.mostCurrent._webview1.runMethod(true,"setJavaScriptEnabled",antropometrikekle.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 74;BA.debugLine="WebView1.ZoomEnabled = True";
Debug.ShouldStop(512);
antropometrikekle.mostCurrent._webview1.runMethod(true,"setZoomEnabled",antropometrikekle.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 76;BA.debugLine="EditTextAntropometrikBoy.TextColor = Colors.White";
Debug.ShouldStop(2048);
antropometrikekle.mostCurrent._edittextantropometrikboy.runMethod(true,"setTextColor",antropometrikekle.mostCurrent.__c.getField(false,"Colors").getField(true,"White"));
 BA.debugLineNum = 77;BA.debugLine="EditTextAntropometrikBoy.Hint = \"Boy değerini cm";
Debug.ShouldStop(4096);
antropometrikekle.mostCurrent._edittextantropometrikboy.runMethod(true,"setHint",BA.ObjectToString("Boy değerini cm cinsinden giriniz.."));
 BA.debugLineNum = 78;BA.debugLine="EditTextAntropometrikBoy.HintColor = Color.hintCo";
Debug.ShouldStop(8192);
antropometrikekle.mostCurrent._edittextantropometrikboy.runMethod(true,"setHintColor",antropometrikekle.mostCurrent._color._hintcolor /*RemoteObject*/ );
 BA.debugLineNum = 79;BA.debugLine="EditTextAntropometrikBoy.TextSize = 20";
Debug.ShouldStop(16384);
antropometrikekle.mostCurrent._edittextantropometrikboy.runMethod(true,"setTextSize",BA.numberCast(float.class, 20));
 BA.debugLineNum = 80;BA.debugLine="EditTextAntropometrikBoy.Typeface = Typeface.DEFA";
Debug.ShouldStop(32768);
antropometrikekle.mostCurrent._edittextantropometrikboy.runMethod(false,"setTypeface",antropometrikekle.mostCurrent.__c.getField(false,"Typeface").getField(false,"DEFAULT"));
 BA.debugLineNum = 82;BA.debugLine="EditTextAntropometrikKilo.TextColor = Colors.Whit";
Debug.ShouldStop(131072);
antropometrikekle.mostCurrent._edittextantropometrikkilo.runMethod(true,"setTextColor",antropometrikekle.mostCurrent.__c.getField(false,"Colors").getField(true,"White"));
 BA.debugLineNum = 83;BA.debugLine="EditTextAntropometrikKilo.Hint = \"Kilo değerini g";
Debug.ShouldStop(262144);
antropometrikekle.mostCurrent._edittextantropometrikkilo.runMethod(true,"setHint",BA.ObjectToString("Kilo değerini giriniz.."));
 BA.debugLineNum = 84;BA.debugLine="EditTextAntropometrikKilo.HintColor = Color.hintC";
Debug.ShouldStop(524288);
antropometrikekle.mostCurrent._edittextantropometrikkilo.runMethod(true,"setHintColor",antropometrikekle.mostCurrent._color._hintcolor /*RemoteObject*/ );
 BA.debugLineNum = 85;BA.debugLine="EditTextAntropometrikKilo.TextSize = 20";
Debug.ShouldStop(1048576);
antropometrikekle.mostCurrent._edittextantropometrikkilo.runMethod(true,"setTextSize",BA.numberCast(float.class, 20));
 BA.debugLineNum = 86;BA.debugLine="EditTextAntropometrikKilo.Typeface = Typeface.DEF";
Debug.ShouldStop(2097152);
antropometrikekle.mostCurrent._edittextantropometrikkilo.runMethod(false,"setTypeface",antropometrikekle.mostCurrent.__c.getField(false,"Typeface").getField(false,"DEFAULT"));
 BA.debugLineNum = 88;BA.debugLine="EditTextElUzunlugu.TextColor = Colors.White";
Debug.ShouldStop(8388608);
antropometrikekle.mostCurrent._edittexteluzunlugu.runMethod(true,"setTextColor",antropometrikekle.mostCurrent.__c.getField(false,"Colors").getField(true,"White"));
 BA.debugLineNum = 89;BA.debugLine="EditTextElUzunlugu.Hint = \"El uzunluk değerini cm";
Debug.ShouldStop(16777216);
antropometrikekle.mostCurrent._edittexteluzunlugu.runMethod(true,"setHint",BA.ObjectToString("El uzunluk değerini cm cinsinden giriniz.."));
 BA.debugLineNum = 90;BA.debugLine="EditTextElUzunlugu.HintColor = Color.hintColor";
Debug.ShouldStop(33554432);
antropometrikekle.mostCurrent._edittexteluzunlugu.runMethod(true,"setHintColor",antropometrikekle.mostCurrent._color._hintcolor /*RemoteObject*/ );
 BA.debugLineNum = 91;BA.debugLine="EditTextElUzunlugu.TextSize = 20";
Debug.ShouldStop(67108864);
antropometrikekle.mostCurrent._edittexteluzunlugu.runMethod(true,"setTextSize",BA.numberCast(float.class, 20));
 BA.debugLineNum = 92;BA.debugLine="EditTextElUzunlugu.Typeface = Typeface.DEFAULT";
Debug.ShouldStop(134217728);
antropometrikekle.mostCurrent._edittexteluzunlugu.runMethod(false,"setTypeface",antropometrikekle.mostCurrent.__c.getField(false,"Typeface").getField(false,"DEFAULT"));
 BA.debugLineNum = 94;BA.debugLine="EditTextKulacUzunlugu.TextColor = Colors.White";
Debug.ShouldStop(536870912);
antropometrikekle.mostCurrent._edittextkulacuzunlugu.runMethod(true,"setTextColor",antropometrikekle.mostCurrent.__c.getField(false,"Colors").getField(true,"White"));
 BA.debugLineNum = 95;BA.debugLine="EditTextKulacUzunlugu.Hint = \"Kulaç uzunluk değer";
Debug.ShouldStop(1073741824);
antropometrikekle.mostCurrent._edittextkulacuzunlugu.runMethod(true,"setHint",BA.ObjectToString("Kulaç uzunluk değerini cm cinsinden giriniz.."));
 BA.debugLineNum = 96;BA.debugLine="EditTextKulacUzunlugu.HintColor = Color.hintColor";
Debug.ShouldStop(-2147483648);
antropometrikekle.mostCurrent._edittextkulacuzunlugu.runMethod(true,"setHintColor",antropometrikekle.mostCurrent._color._hintcolor /*RemoteObject*/ );
 BA.debugLineNum = 97;BA.debugLine="EditTextKulacUzunlugu.TextSize = 20";
Debug.ShouldStop(1);
antropometrikekle.mostCurrent._edittextkulacuzunlugu.runMethod(true,"setTextSize",BA.numberCast(float.class, 20));
 BA.debugLineNum = 98;BA.debugLine="EditTextKulacUzunlugu.Typeface = Typeface.DEFAULT";
Debug.ShouldStop(2);
antropometrikekle.mostCurrent._edittextkulacuzunlugu.runMethod(false,"setTypeface",antropometrikekle.mostCurrent.__c.getField(false,"Typeface").getField(false,"DEFAULT"));
 BA.debugLineNum = 100;BA.debugLine="EditTextOturmaYuksekligi.TextColor = Colors.White";
Debug.ShouldStop(8);
antropometrikekle.mostCurrent._edittextoturmayuksekligi.runMethod(true,"setTextColor",antropometrikekle.mostCurrent.__c.getField(false,"Colors").getField(true,"White"));
 BA.debugLineNum = 101;BA.debugLine="EditTextOturmaYuksekligi.Hint = \"Oturma yükseklik";
Debug.ShouldStop(16);
antropometrikekle.mostCurrent._edittextoturmayuksekligi.runMethod(true,"setHint",BA.ObjectToString("Oturma yükseklik değerini cm cinsinden giriniz.."));
 BA.debugLineNum = 102;BA.debugLine="EditTextOturmaYuksekligi.HintColor = Color.hintCo";
Debug.ShouldStop(32);
antropometrikekle.mostCurrent._edittextoturmayuksekligi.runMethod(true,"setHintColor",antropometrikekle.mostCurrent._color._hintcolor /*RemoteObject*/ );
 BA.debugLineNum = 103;BA.debugLine="EditTextOturmaYuksekligi.TextSize = 20";
Debug.ShouldStop(64);
antropometrikekle.mostCurrent._edittextoturmayuksekligi.runMethod(true,"setTextSize",BA.numberCast(float.class, 20));
 BA.debugLineNum = 104;BA.debugLine="EditTextOturmaYuksekligi.Typeface = Typeface.DEFA";
Debug.ShouldStop(128);
antropometrikekle.mostCurrent._edittextoturmayuksekligi.runMethod(false,"setTypeface",antropometrikekle.mostCurrent.__c.getField(false,"Typeface").getField(false,"DEFAULT"));
 BA.debugLineNum = 106;BA.debugLine="EditTextAyakUzunlugu.TextColor = Colors.White";
Debug.ShouldStop(512);
antropometrikekle.mostCurrent._edittextayakuzunlugu.runMethod(true,"setTextColor",antropometrikekle.mostCurrent.__c.getField(false,"Colors").getField(true,"White"));
 BA.debugLineNum = 107;BA.debugLine="EditTextAyakUzunlugu.Hint = \"Ayak uzunluk değerin";
Debug.ShouldStop(1024);
antropometrikekle.mostCurrent._edittextayakuzunlugu.runMethod(true,"setHint",BA.ObjectToString("Ayak uzunluk değerini cm cinsinden giriniz.."));
 BA.debugLineNum = 108;BA.debugLine="EditTextAyakUzunlugu.HintColor = Color.hintColor";
Debug.ShouldStop(2048);
antropometrikekle.mostCurrent._edittextayakuzunlugu.runMethod(true,"setHintColor",antropometrikekle.mostCurrent._color._hintcolor /*RemoteObject*/ );
 BA.debugLineNum = 109;BA.debugLine="EditTextAyakUzunlugu.TextSize = 20";
Debug.ShouldStop(4096);
antropometrikekle.mostCurrent._edittextayakuzunlugu.runMethod(true,"setTextSize",BA.numberCast(float.class, 20));
 BA.debugLineNum = 110;BA.debugLine="EditTextAyakUzunlugu.Typeface = Typeface.DEFAULT";
Debug.ShouldStop(8192);
antropometrikekle.mostCurrent._edittextayakuzunlugu.runMethod(false,"setTypeface",antropometrikekle.mostCurrent.__c.getField(false,"Typeface").getField(false,"DEFAULT"));
 BA.debugLineNum = 112;BA.debugLine="EditText5DeriKivrimKalinligi.TextColor = Colors.W";
Debug.ShouldStop(32768);
antropometrikekle.mostCurrent._edittext5derikivrimkalinligi.runMethod(true,"setTextColor",antropometrikekle.mostCurrent.__c.getField(false,"Colors").getField(true,"White"));
 BA.debugLineNum = 113;BA.debugLine="EditText5DeriKivrimKalinligi.Hint = \"Deri kıvrım";
Debug.ShouldStop(65536);
antropometrikekle.mostCurrent._edittext5derikivrimkalinligi.runMethod(true,"setHint",BA.ObjectToString("Deri kıvrım kalınlık değerini cm cinsinden giriniz.."));
 BA.debugLineNum = 114;BA.debugLine="EditText5DeriKivrimKalinligi.HintColor = Color.hi";
Debug.ShouldStop(131072);
antropometrikekle.mostCurrent._edittext5derikivrimkalinligi.runMethod(true,"setHintColor",antropometrikekle.mostCurrent._color._hintcolor /*RemoteObject*/ );
 BA.debugLineNum = 115;BA.debugLine="EditText5DeriKivrimKalinligi.TextSize = 20";
Debug.ShouldStop(262144);
antropometrikekle.mostCurrent._edittext5derikivrimkalinligi.runMethod(true,"setTextSize",BA.numberCast(float.class, 20));
 BA.debugLineNum = 116;BA.debugLine="EditText5DeriKivrimKalinligi.Typeface = Typeface.";
Debug.ShouldStop(524288);
antropometrikekle.mostCurrent._edittext5derikivrimkalinligi.runMethod(false,"setTypeface",antropometrikekle.mostCurrent.__c.getField(false,"Typeface").getField(false,"DEFAULT"));
 BA.debugLineNum = 120;BA.debugLine="HTMLGosterDB";
Debug.ShouldStop(8388608);
_htmlgosterdb();
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
public static RemoteObject  _activity_pause(RemoteObject _userclosed) throws Exception{
try {
		Debug.PushSubsStack("Activity_Pause (antropometrikekle) ","antropometrikekle",29,antropometrikekle.mostCurrent.activityBA,antropometrikekle.mostCurrent,127);
if (RapidSub.canDelegate("activity_pause")) { return b4a.example3.antropometrikekle.remoteMe.runUserSub(false, "antropometrikekle","activity_pause", _userclosed);}
Debug.locals.put("UserClosed", _userclosed);
 BA.debugLineNum = 127;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
Debug.ShouldStop(1073741824);
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
public static RemoteObject  _activity_resume() throws Exception{
try {
		Debug.PushSubsStack("Activity_Resume (antropometrikekle) ","antropometrikekle",29,antropometrikekle.mostCurrent.activityBA,antropometrikekle.mostCurrent,123);
if (RapidSub.canDelegate("activity_resume")) { return b4a.example3.antropometrikekle.remoteMe.runUserSub(false, "antropometrikekle","activity_resume");}
 BA.debugLineNum = 123;BA.debugLine="Sub Activity_Resume";
Debug.ShouldStop(67108864);
 BA.debugLineNum = 125;BA.debugLine="End Sub";
Debug.ShouldStop(268435456);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _buttonok_click() throws Exception{
try {
		Debug.PushSubsStack("ButtonOk_Click (antropometrikekle) ","antropometrikekle",29,antropometrikekle.mostCurrent.activityBA,antropometrikekle.mostCurrent,150);
if (RapidSub.canDelegate("buttonok_click")) { return b4a.example3.antropometrikekle.remoteMe.runUserSub(false, "antropometrikekle","buttonok_click");}
RemoteObject _result = RemoteObject.createImmutable(0);
RemoteObject _now = RemoteObject.createImmutable(0L);
 BA.debugLineNum = 150;BA.debugLine="Sub ButtonOk_Click";
Debug.ShouldStop(2097152);
 BA.debugLineNum = 151;BA.debugLine="Dim result As Int";
Debug.ShouldStop(4194304);
_result = RemoteObject.createImmutable(0);Debug.locals.put("result", _result);
 BA.debugLineNum = 152;BA.debugLine="result = Msgbox2(\"Antropometrik analiz verilerini";
Debug.ShouldStop(8388608);
_result = antropometrikekle.mostCurrent.__c.runMethodAndSync(true,"Msgbox2",(Object)(BA.ObjectToCharSequence("Antropometrik analiz verilerini eklemek istiyor musunuz?:")),(Object)(BA.ObjectToCharSequence("Onay Mesajı")),(Object)(BA.ObjectToString("Evet")),(Object)(BA.ObjectToString("")),(Object)(BA.ObjectToString("Hayır")),(Object)((antropometrikekle.mostCurrent.__c.getField(false,"Null"))),antropometrikekle.mostCurrent.activityBA);Debug.locals.put("result", _result);
 BA.debugLineNum = 153;BA.debugLine="If result= DialogResponse.POSITIVE Then";
Debug.ShouldStop(16777216);
if (RemoteObject.solveBoolean("=",_result,BA.numberCast(double.class, antropometrikekle.mostCurrent.__c.getField(false,"DialogResponse").getField(true,"POSITIVE")))) { 
 BA.debugLineNum = 154;BA.debugLine="Dim now As Long = DateTime.Now";
Debug.ShouldStop(33554432);
_now = antropometrikekle.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"getNow");Debug.locals.put("now", _now);Debug.locals.put("now", _now);
 BA.debugLineNum = 155;BA.debugLine="DateTime.DateFormat = \"dd/MM/yyyy\"";
Debug.ShouldStop(67108864);
antropometrikekle.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"setDateFormat",BA.ObjectToString("dd/MM/yyyy"));
 BA.debugLineNum = 156;BA.debugLine="Log(DateTime.Date(now))";
Debug.ShouldStop(134217728);
antropometrikekle.mostCurrent.__c.runVoidMethod ("LogImpl","237421062",antropometrikekle.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"Date",(Object)(_now)),0);
 BA.debugLineNum = 157;BA.debugLine="secilenTarih = DateTime.Date(now)";
Debug.ShouldStop(268435456);
antropometrikekle.mostCurrent._secilentarih = antropometrikekle.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"Date",(Object)(_now));
 BA.debugLineNum = 158;BA.debugLine="Log(DateTime.Time(now))";
Debug.ShouldStop(536870912);
antropometrikekle.mostCurrent.__c.runVoidMethod ("LogImpl","237421064",antropometrikekle.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"Time",(Object)(_now)),0);
 BA.debugLineNum = 159;BA.debugLine="secilenSaat = DateTime.Time(now)";
Debug.ShouldStop(1073741824);
antropometrikekle.mostCurrent._secilensaat = antropometrikekle.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"Time",(Object)(_now));
 BA.debugLineNum = 160;BA.debugLine="ID";
Debug.ShouldStop(-2147483648);
_id();
 BA.debugLineNum = 162;BA.debugLine="Main.sql.ExecNonQuery2(\"INSERT INTO Antropometri";
Debug.ShouldStop(2);
antropometrikekle.mostCurrent._main._sql /*RemoteObject*/ .runVoidMethod ("ExecNonQuery2",(Object)(BA.ObjectToString("INSERT INTO Antropometrik VALUES(?,?,?,?,?,?,?,?,?,?,?)")),(Object)(antropometrikekle.mostCurrent.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("Object",new int[] {11},new Object[] {(antropometrikekle._antropometrikid),(antropometrikekle.mostCurrent._testdenekara._secilendenek /*RemoteObject*/ ),(antropometrikekle.mostCurrent._secilentarih),(antropometrikekle.mostCurrent._secilensaat),(antropometrikekle.mostCurrent._edittextantropometrikboy.runMethod(true,"getText")),(antropometrikekle.mostCurrent._edittextantropometrikkilo.runMethod(true,"getText")),(antropometrikekle.mostCurrent._edittexteluzunlugu.runMethod(true,"getText")),(antropometrikekle.mostCurrent._edittextkulacuzunlugu.runMethod(true,"getText")),(antropometrikekle.mostCurrent._edittextoturmayuksekligi.runMethod(true,"getText")),(antropometrikekle.mostCurrent._edittextayakuzunlugu.runMethod(true,"getText")),(antropometrikekle.mostCurrent._edittext5derikivrimkalinligi.runMethod(true,"getText"))})))));
 BA.debugLineNum = 163;BA.debugLine="Log(\"ANTROPOMETRİK VERİLER EKLENDİ\")";
Debug.ShouldStop(4);
antropometrikekle.mostCurrent.__c.runVoidMethod ("LogImpl","237421069",RemoteObject.createImmutable("ANTROPOMETRİK VERİLER EKLENDİ"),0);
 BA.debugLineNum = 164;BA.debugLine="StartActivity(AntropometrikListele)";
Debug.ShouldStop(8);
antropometrikekle.mostCurrent.__c.runVoidMethod ("StartActivity",antropometrikekle.processBA,(Object)((antropometrikekle.mostCurrent._antropometriklistele.getObject())));
 BA.debugLineNum = 165;BA.debugLine="Activity.Finish";
Debug.ShouldStop(16);
antropometrikekle.mostCurrent._activity.runVoidMethod ("Finish");
 }else 
{ BA.debugLineNum = 166;BA.debugLine="Else If result= DialogResponse.NEGATIVE Then";
Debug.ShouldStop(32);
if (RemoteObject.solveBoolean("=",_result,BA.numberCast(double.class, antropometrikekle.mostCurrent.__c.getField(false,"DialogResponse").getField(true,"NEGATIVE")))) { 
 BA.debugLineNum = 167;BA.debugLine="ToastMessageShow(\"Yönlendiriliyorsunuz...\",False";
Debug.ShouldStop(64);
antropometrikekle.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("Yönlendiriliyorsunuz...")),(Object)(antropometrikekle.mostCurrent.__c.getField(true,"False")));
 BA.debugLineNum = 168;BA.debugLine="Return";
Debug.ShouldStop(128);
if (true) return RemoteObject.createImmutable("");
 }}
;
 BA.debugLineNum = 170;BA.debugLine="End Sub";
Debug.ShouldStop(512);
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
 //BA.debugLineNum = 16;BA.debugLine="Private ButtonOk As Button";
antropometrikekle.mostCurrent._buttonok = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 17;BA.debugLine="Private EditTextAntropometrikBoy As EditText";
antropometrikekle.mostCurrent._edittextantropometrikboy = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
 //BA.debugLineNum = 18;BA.debugLine="Private EditTextAntropometrikKilo As EditText";
antropometrikekle.mostCurrent._edittextantropometrikkilo = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
 //BA.debugLineNum = 19;BA.debugLine="Private EditTextElUzunlugu As EditText";
antropometrikekle.mostCurrent._edittexteluzunlugu = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
 //BA.debugLineNum = 20;BA.debugLine="Private EditTextKulacUzunlugu As EditText";
antropometrikekle.mostCurrent._edittextkulacuzunlugu = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
 //BA.debugLineNum = 21;BA.debugLine="Private EditTextOturmaYuksekligi As EditText";
antropometrikekle.mostCurrent._edittextoturmayuksekligi = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
 //BA.debugLineNum = 22;BA.debugLine="Private EditTextAyakUzunlugu As EditText";
antropometrikekle.mostCurrent._edittextayakuzunlugu = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
 //BA.debugLineNum = 23;BA.debugLine="Private EditText5DeriKivrimKalinligi As EditText";
antropometrikekle.mostCurrent._edittext5derikivrimkalinligi = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
 //BA.debugLineNum = 24;BA.debugLine="Private WebView1 As WebView";
antropometrikekle.mostCurrent._webview1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.WebViewWrapper");
 //BA.debugLineNum = 25;BA.debugLine="Private LabelAntropometrikBoy As Label";
antropometrikekle.mostCurrent._labelantropometrikboy = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 26;BA.debugLine="Private LabelAntropometrikKilo As Label";
antropometrikekle.mostCurrent._labelantropometrikkilo = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 27;BA.debugLine="Private LabelElUzunlugu As Label";
antropometrikekle.mostCurrent._labeleluzunlugu = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 28;BA.debugLine="Private LabelKulacUzunlugu As Label";
antropometrikekle.mostCurrent._labelkulacuzunlugu = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 29;BA.debugLine="Private LabelOturmaYuksekligi As Label";
antropometrikekle.mostCurrent._labeloturmayuksekligi = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 30;BA.debugLine="Private LabelAyakUzunlugu As Label";
antropometrikekle.mostCurrent._labelayakuzunlugu = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 31;BA.debugLine="Private LabelDeriKivrimKalinligi As Label";
antropometrikekle.mostCurrent._labelderikivrimkalinligi = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 33;BA.debugLine="Dim AntropometrikID As Int";
antropometrikekle._antropometrikid = RemoteObject.createImmutable(0);
 //BA.debugLineNum = 34;BA.debugLine="Dim rs As ResultSet";
antropometrikekle.mostCurrent._rs = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL.ResultSetWrapper");
 //BA.debugLineNum = 35;BA.debugLine="Dim secilenTarih As String";
antropometrikekle.mostCurrent._secilentarih = RemoteObject.createImmutable("");
 //BA.debugLineNum = 36;BA.debugLine="Dim secilenSaat As String";
antropometrikekle.mostCurrent._secilensaat = RemoteObject.createImmutable("");
 //BA.debugLineNum = 37;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _htmlgosterdb() throws Exception{
try {
		Debug.PushSubsStack("HTMLGosterDB (antropometrikekle) ","antropometrikekle",29,antropometrikekle.mostCurrent.activityBA,antropometrikekle.mostCurrent,131);
if (RapidSub.canDelegate("htmlgosterdb")) { return b4a.example3.antropometrikekle.remoteMe.runUserSub(false, "antropometrikekle","htmlgosterdb");}
 BA.debugLineNum = 131;BA.debugLine="Sub HTMLGosterDB";
Debug.ShouldStop(4);
 BA.debugLineNum = 133;BA.debugLine="WebView1.LoadHtml(DBUtils.ExecuteHtml(Main.sql,\"S";
Debug.ShouldStop(16);
antropometrikekle.mostCurrent._webview1.runVoidMethod ("LoadHtml",(Object)(antropometrikekle.mostCurrent._dbutils.runMethod(true,"_executehtml" /*RemoteObject*/ ,antropometrikekle.mostCurrent.activityBA,(Object)(antropometrikekle.mostCurrent._main._sql /*RemoteObject*/ ),(Object)(RemoteObject.concat(RemoteObject.createImmutable("SELECT denek_id As [ID], denek_tc As [DENEK TC], denek_isim As [DENEK İSİM],cinsiyet_adi As [CİNSİYET],denek_dogumTarihi As[DENEK DOĞUM TARİHİ],il_adi As [DOĞUM YERİ],denek_babaAdi As [DENEK BABA ADI],denek_engelDurumu As [DENEK ENGEL DURUMU],denek_takimOkul As [TAKIM/OKUL],denek_bransSinif As [BRANŞ/SINIF],denek_mevki As [MEVKİ] FROM Denek WHERE denek_id = '"),antropometrikekle.mostCurrent._testdenekara._secilendenek /*RemoteObject*/ ,RemoteObject.createImmutable("' "))),(Object)((antropometrikekle.mostCurrent.__c.getField(false,"Null"))),(Object)(BA.numberCast(int.class, -(double) (0 + 1))),(Object)(antropometrikekle.mostCurrent.__c.getField(true,"False")))));
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
public static RemoteObject  _id() throws Exception{
try {
		Debug.PushSubsStack("ID (antropometrikekle) ","antropometrikekle",29,antropometrikekle.mostCurrent.activityBA,antropometrikekle.mostCurrent,136);
if (RapidSub.canDelegate("id")) { return b4a.example3.antropometrikekle.remoteMe.runUserSub(false, "antropometrikekle","id");}
RemoteObject _sf = RemoteObject.declareNull("adr.stringfunctions.stringfunctions");
 BA.debugLineNum = 136;BA.debugLine="Sub ID";
Debug.ShouldStop(128);
 BA.debugLineNum = 137;BA.debugLine="Dim sf As StringFunctions";
Debug.ShouldStop(256);
_sf = RemoteObject.createNew ("adr.stringfunctions.stringfunctions");Debug.locals.put("sf", _sf);
 BA.debugLineNum = 138;BA.debugLine="sf.initialize";
Debug.ShouldStop(512);
_sf.runVoidMethod ("_initialize",antropometrikekle.processBA);
 BA.debugLineNum = 140;BA.debugLine="rs= Main.sql.ExecQuery(\"SELECT * FROM Antropometr";
Debug.ShouldStop(2048);
antropometrikekle.mostCurrent._rs.setObject(antropometrikekle.mostCurrent._main._sql /*RemoteObject*/ .runMethod(false,"ExecQuery",(Object)(RemoteObject.createImmutable("SELECT * FROM Antropometrik ORDER BY antropometrik_id DESC"))));
 BA.debugLineNum = 141;BA.debugLine="If rs.RowCount>0 Then";
Debug.ShouldStop(4096);
if (RemoteObject.solveBoolean(">",antropometrikekle.mostCurrent._rs.runMethod(true,"getRowCount"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 142;BA.debugLine="rs.Position=0";
Debug.ShouldStop(8192);
antropometrikekle.mostCurrent._rs.runMethod(true,"setPosition",BA.numberCast(int.class, 0));
 BA.debugLineNum = 143;BA.debugLine="AntropometrikID = sf.Right(\"00\" &sf.Trim(sf.Val(";
Debug.ShouldStop(16384);
antropometrikekle._antropometrikid = BA.numberCast(int.class, _sf.runMethod(true,"_vvvvv7",(Object)(RemoteObject.concat(RemoteObject.createImmutable("00"),_sf.runMethod(true,"_vvvvvvv4",(Object)(BA.NumberToString(RemoteObject.solve(new RemoteObject[] {_sf.runMethod(true,"_vvvvvvv6",(Object)(_sf.runMethod(true,"_vvvvv7",(Object)(antropometrikekle.mostCurrent._rs.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("antropometrik_id")))),(Object)(BA.numberCast(long.class, 3))))),RemoteObject.createImmutable(1)}, "+",1, 0)))))),(Object)(BA.numberCast(long.class, 3))));
 }else {
 BA.debugLineNum = 145;BA.debugLine="AntropometrikID=\"001\"";
Debug.ShouldStop(65536);
antropometrikekle._antropometrikid = BA.numberCast(int.class, "001");
 };
 BA.debugLineNum = 147;BA.debugLine="rs.Close";
Debug.ShouldStop(262144);
antropometrikekle.mostCurrent._rs.runVoidMethod ("Close");
 BA.debugLineNum = 148;BA.debugLine="End Sub";
Debug.ShouldStop(524288);
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