package b4a.example3;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class biyokimyasalekle_subs_0 {


public static RemoteObject  _activity_create(RemoteObject _firsttime) throws Exception{
try {
		Debug.PushSubsStack("Activity_Create (biyokimyasalekle) ","biyokimyasalekle",28,biyokimyasalekle.mostCurrent.activityBA,biyokimyasalekle.mostCurrent,28);
if (RapidSub.canDelegate("activity_create")) { return b4a.example3.biyokimyasalekle.remoteMe.runUserSub(false, "biyokimyasalekle","activity_create", _firsttime);}
Debug.locals.put("FirstTime", _firsttime);
 BA.debugLineNum = 28;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
Debug.ShouldStop(134217728);
 BA.debugLineNum = 30;BA.debugLine="Activity.LoadLayout(\"BiyokimyasalEklePage\")";
Debug.ShouldStop(536870912);
biyokimyasalekle.mostCurrent._activity.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("BiyokimyasalEklePage")),biyokimyasalekle.mostCurrent.activityBA);
 BA.debugLineNum = 33;BA.debugLine="EditTextBiyokimyasalAciklama.TextColor = Color.ko";
Debug.ShouldStop(1);
biyokimyasalekle.mostCurrent._edittextbiyokimyasalaciklama.runMethod(true,"setTextColor",biyokimyasalekle.mostCurrent._color._koyumavi /*RemoteObject*/ );
 BA.debugLineNum = 34;BA.debugLine="EditTextBiyokimyasalAciklama.Hint = \"Biyokimyasal";
Debug.ShouldStop(2);
biyokimyasalekle.mostCurrent._edittextbiyokimyasalaciklama.runMethod(true,"setHint",BA.ObjectToString("Biyokimyasal analizlerinizi bu alana yazabilirsiniz.."));
 BA.debugLineNum = 35;BA.debugLine="EditTextBiyokimyasalAciklama.HintColor = Color.ac";
Debug.ShouldStop(4);
biyokimyasalekle.mostCurrent._edittextbiyokimyasalaciklama.runMethod(true,"setHintColor",biyokimyasalekle.mostCurrent._color._acikmavi /*RemoteObject*/ );
 BA.debugLineNum = 36;BA.debugLine="EditTextBiyokimyasalAciklama.TextSize = 20";
Debug.ShouldStop(8);
biyokimyasalekle.mostCurrent._edittextbiyokimyasalaciklama.runMethod(true,"setTextSize",BA.numberCast(float.class, 20));
 BA.debugLineNum = 37;BA.debugLine="EditTextBiyokimyasalAciklama.Typeface = Typeface.";
Debug.ShouldStop(16);
biyokimyasalekle.mostCurrent._edittextbiyokimyasalaciklama.runMethod(false,"setTypeface",biyokimyasalekle.mostCurrent.__c.getField(false,"Typeface").getField(false,"DEFAULT"));
 BA.debugLineNum = 39;BA.debugLine="WebView1.ZoomEnabled = True";
Debug.ShouldStop(64);
biyokimyasalekle.mostCurrent._webview1.runMethod(true,"setZoomEnabled",biyokimyasalekle.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 40;BA.debugLine="WebView1.JavaScriptEnabled = True";
Debug.ShouldStop(128);
biyokimyasalekle.mostCurrent._webview1.runMethod(true,"setJavaScriptEnabled",biyokimyasalekle.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 42;BA.debugLine="LabelBiyokimyasalAciklama.TextColor = Colors.Whit";
Debug.ShouldStop(512);
biyokimyasalekle.mostCurrent._labelbiyokimyasalaciklama.runMethod(true,"setTextColor",biyokimyasalekle.mostCurrent.__c.getField(false,"Colors").getField(true,"White"));
 BA.debugLineNum = 43;BA.debugLine="LabelBiyokimyasalAciklama.TextSize = 20";
Debug.ShouldStop(1024);
biyokimyasalekle.mostCurrent._labelbiyokimyasalaciklama.runMethod(true,"setTextSize",BA.numberCast(float.class, 20));
 BA.debugLineNum = 44;BA.debugLine="LabelBiyokimyasalAciklama.Typeface = Typeface.DEF";
Debug.ShouldStop(2048);
biyokimyasalekle.mostCurrent._labelbiyokimyasalaciklama.runMethod(false,"setTypeface",biyokimyasalekle.mostCurrent.__c.getField(false,"Typeface").getField(false,"DEFAULT_BOLD"));
 BA.debugLineNum = 47;BA.debugLine="HTMLGosterDB";
Debug.ShouldStop(16384);
_htmlgosterdb();
 BA.debugLineNum = 48;BA.debugLine="End Sub";
Debug.ShouldStop(32768);
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
		Debug.PushSubsStack("Activity_Pause (biyokimyasalekle) ","biyokimyasalekle",28,biyokimyasalekle.mostCurrent.activityBA,biyokimyasalekle.mostCurrent,54);
if (RapidSub.canDelegate("activity_pause")) { return b4a.example3.biyokimyasalekle.remoteMe.runUserSub(false, "biyokimyasalekle","activity_pause", _userclosed);}
Debug.locals.put("UserClosed", _userclosed);
 BA.debugLineNum = 54;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
Debug.ShouldStop(2097152);
 BA.debugLineNum = 56;BA.debugLine="End Sub";
Debug.ShouldStop(8388608);
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
		Debug.PushSubsStack("Activity_Resume (biyokimyasalekle) ","biyokimyasalekle",28,biyokimyasalekle.mostCurrent.activityBA,biyokimyasalekle.mostCurrent,50);
if (RapidSub.canDelegate("activity_resume")) { return b4a.example3.biyokimyasalekle.remoteMe.runUserSub(false, "biyokimyasalekle","activity_resume");}
 BA.debugLineNum = 50;BA.debugLine="Sub Activity_Resume";
Debug.ShouldStop(131072);
 BA.debugLineNum = 52;BA.debugLine="End Sub";
Debug.ShouldStop(524288);
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
		Debug.PushSubsStack("ButtonBiyokimyasalEkle_Click (biyokimyasalekle) ","biyokimyasalekle",28,biyokimyasalekle.mostCurrent.activityBA,biyokimyasalekle.mostCurrent,77);
if (RapidSub.canDelegate("buttonbiyokimyasalekle_click")) { return b4a.example3.biyokimyasalekle.remoteMe.runUserSub(false, "biyokimyasalekle","buttonbiyokimyasalekle_click");}
RemoteObject _result = RemoteObject.createImmutable(0);
RemoteObject _now = RemoteObject.createImmutable(0L);
 BA.debugLineNum = 77;BA.debugLine="Sub ButtonBiyokimyasalEkle_Click";
Debug.ShouldStop(4096);
 BA.debugLineNum = 78;BA.debugLine="Dim result As Int";
Debug.ShouldStop(8192);
_result = RemoteObject.createImmutable(0);Debug.locals.put("result", _result);
 BA.debugLineNum = 79;BA.debugLine="result = Msgbox2(\"Biyokimyasal analiz verilerini";
Debug.ShouldStop(16384);
_result = biyokimyasalekle.mostCurrent.__c.runMethodAndSync(true,"Msgbox2",(Object)(BA.ObjectToCharSequence("Biyokimyasal analiz verilerini eklemek istiyor musunuz?:")),(Object)(BA.ObjectToCharSequence("Onay Mesajı")),(Object)(BA.ObjectToString("Evet")),(Object)(BA.ObjectToString("")),(Object)(BA.ObjectToString("Hayır")),(Object)((biyokimyasalekle.mostCurrent.__c.getField(false,"Null"))),biyokimyasalekle.mostCurrent.activityBA);Debug.locals.put("result", _result);
 BA.debugLineNum = 80;BA.debugLine="If result= DialogResponse.POSITIVE Then";
Debug.ShouldStop(32768);
if (RemoteObject.solveBoolean("=",_result,BA.numberCast(double.class, biyokimyasalekle.mostCurrent.__c.getField(false,"DialogResponse").getField(true,"POSITIVE")))) { 
 BA.debugLineNum = 81;BA.debugLine="Dim now As Long = DateTime.Now";
Debug.ShouldStop(65536);
_now = biyokimyasalekle.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"getNow");Debug.locals.put("now", _now);Debug.locals.put("now", _now);
 BA.debugLineNum = 82;BA.debugLine="DateTime.DateFormat = \"dd/MM/yyyy\"";
Debug.ShouldStop(131072);
biyokimyasalekle.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"setDateFormat",BA.ObjectToString("dd/MM/yyyy"));
 BA.debugLineNum = 83;BA.debugLine="secilenTarih = DateTime.Date(now)";
Debug.ShouldStop(262144);
biyokimyasalekle.mostCurrent._secilentarih = biyokimyasalekle.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"Date",(Object)(_now));
 BA.debugLineNum = 84;BA.debugLine="secilenSaat = DateTime.Time(now)";
Debug.ShouldStop(524288);
biyokimyasalekle.mostCurrent._secilensaat = biyokimyasalekle.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"Time",(Object)(_now));
 BA.debugLineNum = 86;BA.debugLine="ID";
Debug.ShouldStop(2097152);
_id();
 BA.debugLineNum = 87;BA.debugLine="Main.sql.ExecNonQuery2(\"INSERT INTO Biyokimyasal";
Debug.ShouldStop(4194304);
biyokimyasalekle.mostCurrent._main._sql /*RemoteObject*/ .runVoidMethod ("ExecNonQuery2",(Object)(BA.ObjectToString("INSERT INTO Biyokimyasal VALUES(?,?,?,?,?)")),(Object)(biyokimyasalekle.mostCurrent.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("Object",new int[] {5},new Object[] {(biyokimyasalekle._biyokimyasalid),(biyokimyasalekle.mostCurrent._testdenekara._secilendenek /*RemoteObject*/ ),(biyokimyasalekle.mostCurrent._secilentarih),(biyokimyasalekle.mostCurrent._secilensaat),(biyokimyasalekle.mostCurrent._edittextbiyokimyasalaciklama.runMethod(true,"getText"))})))));
 BA.debugLineNum = 88;BA.debugLine="Log(\"BİYOKİMYASAL VERİLER EKLENDİ\")";
Debug.ShouldStop(8388608);
biyokimyasalekle.mostCurrent.__c.runVoidMethod ("LogImpl","236896779",RemoteObject.createImmutable("BİYOKİMYASAL VERİLER EKLENDİ"),0);
 BA.debugLineNum = 89;BA.debugLine="StartActivity(BiyokimyasalListele)";
Debug.ShouldStop(16777216);
biyokimyasalekle.mostCurrent.__c.runVoidMethod ("StartActivity",biyokimyasalekle.processBA,(Object)((biyokimyasalekle.mostCurrent._biyokimyasallistele.getObject())));
 BA.debugLineNum = 90;BA.debugLine="Activity.Finish";
Debug.ShouldStop(33554432);
biyokimyasalekle.mostCurrent._activity.runVoidMethod ("Finish");
 }else 
{ BA.debugLineNum = 91;BA.debugLine="Else If result= DialogResponse.NEGATIVE Then";
Debug.ShouldStop(67108864);
if (RemoteObject.solveBoolean("=",_result,BA.numberCast(double.class, biyokimyasalekle.mostCurrent.__c.getField(false,"DialogResponse").getField(true,"NEGATIVE")))) { 
 BA.debugLineNum = 92;BA.debugLine="ToastMessageShow(\"Yönlendiriliyorsunuz...\",False";
Debug.ShouldStop(134217728);
biyokimyasalekle.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("Yönlendiriliyorsunuz...")),(Object)(biyokimyasalekle.mostCurrent.__c.getField(true,"False")));
 BA.debugLineNum = 93;BA.debugLine="Return";
Debug.ShouldStop(268435456);
if (true) return RemoteObject.createImmutable("");
 }}
;
 BA.debugLineNum = 96;BA.debugLine="End Sub";
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
 //BA.debugLineNum = 16;BA.debugLine="Private EditTextBiyokimyasalAciklama As EditText";
biyokimyasalekle.mostCurrent._edittextbiyokimyasalaciklama = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
 //BA.debugLineNum = 17;BA.debugLine="Private ButtonBiyokimyasalEkle As Button";
biyokimyasalekle.mostCurrent._buttonbiyokimyasalekle = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 18;BA.debugLine="Private WebView1 As WebView";
biyokimyasalekle.mostCurrent._webview1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.WebViewWrapper");
 //BA.debugLineNum = 19;BA.debugLine="Private LabelBiyokimyasalAciklama As Label";
biyokimyasalekle.mostCurrent._labelbiyokimyasalaciklama = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 21;BA.debugLine="Dim BiyokimyasalID As Int";
biyokimyasalekle._biyokimyasalid = RemoteObject.createImmutable(0);
 //BA.debugLineNum = 22;BA.debugLine="Dim rs As ResultSet";
biyokimyasalekle.mostCurrent._rs = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL.ResultSetWrapper");
 //BA.debugLineNum = 23;BA.debugLine="Dim secilenTarih As String";
biyokimyasalekle.mostCurrent._secilentarih = RemoteObject.createImmutable("");
 //BA.debugLineNum = 24;BA.debugLine="Dim secilenSaat As String";
biyokimyasalekle.mostCurrent._secilensaat = RemoteObject.createImmutable("");
 //BA.debugLineNum = 26;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _htmlgosterdb() throws Exception{
try {
		Debug.PushSubsStack("HTMLGosterDB (biyokimyasalekle) ","biyokimyasalekle",28,biyokimyasalekle.mostCurrent.activityBA,biyokimyasalekle.mostCurrent,58);
if (RapidSub.canDelegate("htmlgosterdb")) { return b4a.example3.biyokimyasalekle.remoteMe.runUserSub(false, "biyokimyasalekle","htmlgosterdb");}
 BA.debugLineNum = 58;BA.debugLine="Sub HTMLGosterDB";
Debug.ShouldStop(33554432);
 BA.debugLineNum = 60;BA.debugLine="WebView1.LoadHtml(DBUtils.ExecuteHtml(Main.sql,\"S";
Debug.ShouldStop(134217728);
biyokimyasalekle.mostCurrent._webview1.runVoidMethod ("LoadHtml",(Object)(biyokimyasalekle.mostCurrent._dbutils.runMethod(true,"_executehtml" /*RemoteObject*/ ,biyokimyasalekle.mostCurrent.activityBA,(Object)(biyokimyasalekle.mostCurrent._main._sql /*RemoteObject*/ ),(Object)(RemoteObject.concat(RemoteObject.createImmutable("SELECT denek_id As [ID], denek_tc As [DENEK TC], denek_isim As [DENEK İSİM],cinsiyet_adi As [CİNSİYET],denek_dogumTarihi As[DENEK DOĞUM TARİHİ],il_adi As [DOĞUM YERİ],denek_babaAdi As [DENEK BABA ADI],denek_engelDurumu As [DENEK ENGEL DURUMU],denek_takimOkul As [TAKIM/OKUL],denek_bransSinif As [BRANŞ/SINIF],denek_mevki As [MEVKİ] FROM Denek WHERE denek_id = '"),biyokimyasalekle.mostCurrent._testdenekara._secilendenek /*RemoteObject*/ ,RemoteObject.createImmutable("' "))),(Object)((biyokimyasalekle.mostCurrent.__c.getField(false,"Null"))),(Object)(BA.numberCast(int.class, -(double) (0 + 1))),(Object)(biyokimyasalekle.mostCurrent.__c.getField(true,"False")))));
 BA.debugLineNum = 61;BA.debugLine="End Sub";
Debug.ShouldStop(268435456);
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
		Debug.PushSubsStack("ID (biyokimyasalekle) ","biyokimyasalekle",28,biyokimyasalekle.mostCurrent.activityBA,biyokimyasalekle.mostCurrent,63);
if (RapidSub.canDelegate("id")) { return b4a.example3.biyokimyasalekle.remoteMe.runUserSub(false, "biyokimyasalekle","id");}
RemoteObject _sf = RemoteObject.declareNull("adr.stringfunctions.stringfunctions");
 BA.debugLineNum = 63;BA.debugLine="Sub ID";
Debug.ShouldStop(1073741824);
 BA.debugLineNum = 64;BA.debugLine="Dim sf As StringFunctions";
Debug.ShouldStop(-2147483648);
_sf = RemoteObject.createNew ("adr.stringfunctions.stringfunctions");Debug.locals.put("sf", _sf);
 BA.debugLineNum = 65;BA.debugLine="sf.initialize";
Debug.ShouldStop(1);
_sf.runVoidMethod ("_initialize",biyokimyasalekle.processBA);
 BA.debugLineNum = 67;BA.debugLine="rs= Main.sql.ExecQuery(\"SELECT * FROM Biyokimyasa";
Debug.ShouldStop(4);
biyokimyasalekle.mostCurrent._rs.setObject(biyokimyasalekle.mostCurrent._main._sql /*RemoteObject*/ .runMethod(false,"ExecQuery",(Object)(RemoteObject.createImmutable("SELECT * FROM Biyokimyasal ORDER BY biyokimyasal_id DESC"))));
 BA.debugLineNum = 68;BA.debugLine="If rs.RowCount>0 Then";
Debug.ShouldStop(8);
if (RemoteObject.solveBoolean(">",biyokimyasalekle.mostCurrent._rs.runMethod(true,"getRowCount"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 69;BA.debugLine="rs.Position=0";
Debug.ShouldStop(16);
biyokimyasalekle.mostCurrent._rs.runMethod(true,"setPosition",BA.numberCast(int.class, 0));
 BA.debugLineNum = 70;BA.debugLine="BiyokimyasalID = sf.Right(\"00\" &sf.Trim(sf.Val(s";
Debug.ShouldStop(32);
biyokimyasalekle._biyokimyasalid = BA.numberCast(int.class, _sf.runMethod(true,"_vvvvv7",(Object)(RemoteObject.concat(RemoteObject.createImmutable("00"),_sf.runMethod(true,"_vvvvvvv4",(Object)(BA.NumberToString(RemoteObject.solve(new RemoteObject[] {_sf.runMethod(true,"_vvvvvvv6",(Object)(_sf.runMethod(true,"_vvvvv7",(Object)(biyokimyasalekle.mostCurrent._rs.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("biyokimyasal_id")))),(Object)(BA.numberCast(long.class, 3))))),RemoteObject.createImmutable(1)}, "+",1, 0)))))),(Object)(BA.numberCast(long.class, 3))));
 }else {
 BA.debugLineNum = 72;BA.debugLine="BiyokimyasalID=\"001\"";
Debug.ShouldStop(128);
biyokimyasalekle._biyokimyasalid = BA.numberCast(int.class, "001");
 };
 BA.debugLineNum = 74;BA.debugLine="rs.Close";
Debug.ShouldStop(512);
biyokimyasalekle.mostCurrent._rs.runVoidMethod ("Close");
 BA.debugLineNum = 75;BA.debugLine="End Sub";
Debug.ShouldStop(1024);
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