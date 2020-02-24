package b4a.example3;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class psikolojikekle_subs_0 {


public static RemoteObject  _activity_create(RemoteObject _firsttime) throws Exception{
try {
		Debug.PushSubsStack("Activity_Create (psikolojikekle) ","psikolojikekle",39,psikolojikekle.mostCurrent.activityBA,psikolojikekle.mostCurrent,28);
if (RapidSub.canDelegate("activity_create")) { return b4a.example3.psikolojikekle.remoteMe.runUserSub(false, "psikolojikekle","activity_create", _firsttime);}
Debug.locals.put("FirstTime", _firsttime);
 BA.debugLineNum = 28;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
Debug.ShouldStop(134217728);
 BA.debugLineNum = 30;BA.debugLine="Activity.LoadLayout(\"PsikolojikEklePage\")";
Debug.ShouldStop(536870912);
psikolojikekle.mostCurrent._activity.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("PsikolojikEklePage")),psikolojikekle.mostCurrent.activityBA);
 BA.debugLineNum = 33;BA.debugLine="WebView1.ZoomEnabled = True";
Debug.ShouldStop(1);
psikolojikekle.mostCurrent._webview1.runMethod(true,"setZoomEnabled",psikolojikekle.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 34;BA.debugLine="WebView1.JavaScriptEnabled = True";
Debug.ShouldStop(2);
psikolojikekle.mostCurrent._webview1.runMethod(true,"setJavaScriptEnabled",psikolojikekle.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 36;BA.debugLine="LabelPsikolojikAciklama.TextColor = Colors.White";
Debug.ShouldStop(8);
psikolojikekle.mostCurrent._labelpsikolojikaciklama.runMethod(true,"setTextColor",psikolojikekle.mostCurrent.__c.getField(false,"Colors").getField(true,"White"));
 BA.debugLineNum = 37;BA.debugLine="LabelPsikolojikAciklama.TextSize = 20";
Debug.ShouldStop(16);
psikolojikekle.mostCurrent._labelpsikolojikaciklama.runMethod(true,"setTextSize",BA.numberCast(float.class, 20));
 BA.debugLineNum = 38;BA.debugLine="LabelPsikolojikAciklama.Typeface = Typeface.DEFAU";
Debug.ShouldStop(32);
psikolojikekle.mostCurrent._labelpsikolojikaciklama.runMethod(false,"setTypeface",psikolojikekle.mostCurrent.__c.getField(false,"Typeface").getField(false,"DEFAULT_BOLD"));
 BA.debugLineNum = 40;BA.debugLine="EditTextPsikolojikAciklama.TextColor = Color.koyu";
Debug.ShouldStop(128);
psikolojikekle.mostCurrent._edittextpsikolojikaciklama.runMethod(true,"setTextColor",psikolojikekle.mostCurrent._color._koyumavi /*RemoteObject*/ );
 BA.debugLineNum = 41;BA.debugLine="EditTextPsikolojikAciklama.Hint = \"Psikolojik değ";
Debug.ShouldStop(256);
psikolojikekle.mostCurrent._edittextpsikolojikaciklama.runMethod(true,"setHint",BA.ObjectToString("Psikolojik değerlendirmenizi bu alana yazabilirsiniz.."));
 BA.debugLineNum = 42;BA.debugLine="EditTextPsikolojikAciklama.HintColor = Color.acik";
Debug.ShouldStop(512);
psikolojikekle.mostCurrent._edittextpsikolojikaciklama.runMethod(true,"setHintColor",psikolojikekle.mostCurrent._color._acikmavi /*RemoteObject*/ );
 BA.debugLineNum = 43;BA.debugLine="EditTextPsikolojikAciklama.TextSize = 20";
Debug.ShouldStop(1024);
psikolojikekle.mostCurrent._edittextpsikolojikaciklama.runMethod(true,"setTextSize",BA.numberCast(float.class, 20));
 BA.debugLineNum = 44;BA.debugLine="EditTextPsikolojikAciklama.Typeface = Typeface.DE";
Debug.ShouldStop(2048);
psikolojikekle.mostCurrent._edittextpsikolojikaciklama.runMethod(false,"setTypeface",psikolojikekle.mostCurrent.__c.getField(false,"Typeface").getField(false,"DEFAULT"));
 BA.debugLineNum = 48;BA.debugLine="HTMLGosterDB";
Debug.ShouldStop(32768);
_htmlgosterdb();
 BA.debugLineNum = 50;BA.debugLine="End Sub";
Debug.ShouldStop(131072);
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
		Debug.PushSubsStack("Activity_Pause (psikolojikekle) ","psikolojikekle",39,psikolojikekle.mostCurrent.activityBA,psikolojikekle.mostCurrent,56);
if (RapidSub.canDelegate("activity_pause")) { return b4a.example3.psikolojikekle.remoteMe.runUserSub(false, "psikolojikekle","activity_pause", _userclosed);}
Debug.locals.put("UserClosed", _userclosed);
 BA.debugLineNum = 56;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
Debug.ShouldStop(8388608);
 BA.debugLineNum = 58;BA.debugLine="End Sub";
Debug.ShouldStop(33554432);
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
		Debug.PushSubsStack("Activity_Resume (psikolojikekle) ","psikolojikekle",39,psikolojikekle.mostCurrent.activityBA,psikolojikekle.mostCurrent,52);
if (RapidSub.canDelegate("activity_resume")) { return b4a.example3.psikolojikekle.remoteMe.runUserSub(false, "psikolojikekle","activity_resume");}
 BA.debugLineNum = 52;BA.debugLine="Sub Activity_Resume";
Debug.ShouldStop(524288);
 BA.debugLineNum = 54;BA.debugLine="End Sub";
Debug.ShouldStop(2097152);
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
		Debug.PushSubsStack("ButtonPsikolojikEkle_Click (psikolojikekle) ","psikolojikekle",39,psikolojikekle.mostCurrent.activityBA,psikolojikekle.mostCurrent,79);
if (RapidSub.canDelegate("buttonpsikolojikekle_click")) { return b4a.example3.psikolojikekle.remoteMe.runUserSub(false, "psikolojikekle","buttonpsikolojikekle_click");}
RemoteObject _result = RemoteObject.createImmutable(0);
RemoteObject _now = RemoteObject.createImmutable(0L);
 BA.debugLineNum = 79;BA.debugLine="Sub ButtonPsikolojikEkle_Click";
Debug.ShouldStop(16384);
 BA.debugLineNum = 80;BA.debugLine="Dim result As Int";
Debug.ShouldStop(32768);
_result = RemoteObject.createImmutable(0);Debug.locals.put("result", _result);
 BA.debugLineNum = 81;BA.debugLine="result = Msgbox2(\"Psikolojik analiz verilerini ek";
Debug.ShouldStop(65536);
_result = psikolojikekle.mostCurrent.__c.runMethodAndSync(true,"Msgbox2",(Object)(BA.ObjectToCharSequence("Psikolojik analiz verilerini eklemek istiyor musunuz?:")),(Object)(BA.ObjectToCharSequence("Onay Mesajı")),(Object)(BA.ObjectToString("Evet")),(Object)(BA.ObjectToString("")),(Object)(BA.ObjectToString("Hayır")),(Object)((psikolojikekle.mostCurrent.__c.getField(false,"Null"))),psikolojikekle.mostCurrent.activityBA);Debug.locals.put("result", _result);
 BA.debugLineNum = 82;BA.debugLine="If result= DialogResponse.POSITIVE Then";
Debug.ShouldStop(131072);
if (RemoteObject.solveBoolean("=",_result,BA.numberCast(double.class, psikolojikekle.mostCurrent.__c.getField(false,"DialogResponse").getField(true,"POSITIVE")))) { 
 BA.debugLineNum = 83;BA.debugLine="Dim now As Long = DateTime.Now";
Debug.ShouldStop(262144);
_now = psikolojikekle.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"getNow");Debug.locals.put("now", _now);Debug.locals.put("now", _now);
 BA.debugLineNum = 84;BA.debugLine="DateTime.DateFormat = \"dd/MM/yyyy\"";
Debug.ShouldStop(524288);
psikolojikekle.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"setDateFormat",BA.ObjectToString("dd/MM/yyyy"));
 BA.debugLineNum = 85;BA.debugLine="Log(DateTime.Date(now))";
Debug.ShouldStop(1048576);
psikolojikekle.mostCurrent.__c.runVoidMethod ("LogImpl","245416454",psikolojikekle.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"Date",(Object)(_now)),0);
 BA.debugLineNum = 86;BA.debugLine="secilenTarih = DateTime.Date(now)";
Debug.ShouldStop(2097152);
psikolojikekle.mostCurrent._secilentarih = psikolojikekle.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"Date",(Object)(_now));
 BA.debugLineNum = 87;BA.debugLine="Log(DateTime.Time(now))";
Debug.ShouldStop(4194304);
psikolojikekle.mostCurrent.__c.runVoidMethod ("LogImpl","245416456",psikolojikekle.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"Time",(Object)(_now)),0);
 BA.debugLineNum = 88;BA.debugLine="secilenSaat = DateTime.Time(now)";
Debug.ShouldStop(8388608);
psikolojikekle.mostCurrent._secilensaat = psikolojikekle.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"Time",(Object)(_now));
 BA.debugLineNum = 89;BA.debugLine="ID";
Debug.ShouldStop(16777216);
_id();
 BA.debugLineNum = 90;BA.debugLine="Main.sql.ExecNonQuery2(\"INSERT INTO Psikolojik V";
Debug.ShouldStop(33554432);
psikolojikekle.mostCurrent._main._sql /*RemoteObject*/ .runVoidMethod ("ExecNonQuery2",(Object)(BA.ObjectToString("INSERT INTO Psikolojik VALUES(?,?,?,?,?)")),(Object)(psikolojikekle.mostCurrent.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("Object",new int[] {5},new Object[] {(psikolojikekle._psikolojikid),(psikolojikekle.mostCurrent._testdenekara._secilendenek /*RemoteObject*/ ),(psikolojikekle.mostCurrent._secilentarih),(psikolojikekle.mostCurrent._secilensaat),(psikolojikekle.mostCurrent._edittextpsikolojikaciklama.runMethod(true,"getText"))})))));
 BA.debugLineNum = 91;BA.debugLine="Log(\"PSİKOLOJİK VERİLER EKLENDİ\")";
Debug.ShouldStop(67108864);
psikolojikekle.mostCurrent.__c.runVoidMethod ("LogImpl","245416460",RemoteObject.createImmutable("PSİKOLOJİK VERİLER EKLENDİ"),0);
 BA.debugLineNum = 92;BA.debugLine="StartActivity(PsikolojikListele)";
Debug.ShouldStop(134217728);
psikolojikekle.mostCurrent.__c.runVoidMethod ("StartActivity",psikolojikekle.processBA,(Object)((psikolojikekle.mostCurrent._psikolojiklistele.getObject())));
 BA.debugLineNum = 93;BA.debugLine="Activity.Finish";
Debug.ShouldStop(268435456);
psikolojikekle.mostCurrent._activity.runVoidMethod ("Finish");
 }else 
{ BA.debugLineNum = 94;BA.debugLine="Else If result= DialogResponse.NEGATIVE Then";
Debug.ShouldStop(536870912);
if (RemoteObject.solveBoolean("=",_result,BA.numberCast(double.class, psikolojikekle.mostCurrent.__c.getField(false,"DialogResponse").getField(true,"NEGATIVE")))) { 
 BA.debugLineNum = 95;BA.debugLine="ToastMessageShow(\"Yönlendiriliyorsunuz...\",False";
Debug.ShouldStop(1073741824);
psikolojikekle.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("Yönlendiriliyorsunuz...")),(Object)(psikolojikekle.mostCurrent.__c.getField(true,"False")));
 BA.debugLineNum = 96;BA.debugLine="Return";
Debug.ShouldStop(-2147483648);
if (true) return RemoteObject.createImmutable("");
 }}
;
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
public static RemoteObject  _globals() throws Exception{
 //BA.debugLineNum = 12;BA.debugLine="Sub Globals";
 //BA.debugLineNum = 16;BA.debugLine="Private WebView1 As WebView";
psikolojikekle.mostCurrent._webview1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.WebViewWrapper");
 //BA.debugLineNum = 17;BA.debugLine="Private EditTextPsikolojikAciklama As EditText";
psikolojikekle.mostCurrent._edittextpsikolojikaciklama = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
 //BA.debugLineNum = 18;BA.debugLine="Private ButtonPsikolojikEkle As Button";
psikolojikekle.mostCurrent._buttonpsikolojikekle = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 19;BA.debugLine="Private LabelPsikolojikAciklama As Label";
psikolojikekle.mostCurrent._labelpsikolojikaciklama = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 21;BA.debugLine="Dim secilenTarih As String";
psikolojikekle.mostCurrent._secilentarih = RemoteObject.createImmutable("");
 //BA.debugLineNum = 22;BA.debugLine="Dim secilenSaat As String";
psikolojikekle.mostCurrent._secilensaat = RemoteObject.createImmutable("");
 //BA.debugLineNum = 23;BA.debugLine="Dim PsikolojikID As Int";
psikolojikekle._psikolojikid = RemoteObject.createImmutable(0);
 //BA.debugLineNum = 24;BA.debugLine="Dim rs As ResultSet";
psikolojikekle.mostCurrent._rs = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL.ResultSetWrapper");
 //BA.debugLineNum = 26;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _htmlgosterdb() throws Exception{
try {
		Debug.PushSubsStack("HTMLGosterDB (psikolojikekle) ","psikolojikekle",39,psikolojikekle.mostCurrent.activityBA,psikolojikekle.mostCurrent,60);
if (RapidSub.canDelegate("htmlgosterdb")) { return b4a.example3.psikolojikekle.remoteMe.runUserSub(false, "psikolojikekle","htmlgosterdb");}
 BA.debugLineNum = 60;BA.debugLine="Sub HTMLGosterDB";
Debug.ShouldStop(134217728);
 BA.debugLineNum = 62;BA.debugLine="WebView1.LoadHtml(DBUtils.ExecuteHtml(Main.sql,\"S";
Debug.ShouldStop(536870912);
psikolojikekle.mostCurrent._webview1.runVoidMethod ("LoadHtml",(Object)(psikolojikekle.mostCurrent._dbutils.runMethod(true,"_executehtml" /*RemoteObject*/ ,psikolojikekle.mostCurrent.activityBA,(Object)(psikolojikekle.mostCurrent._main._sql /*RemoteObject*/ ),(Object)(RemoteObject.concat(RemoteObject.createImmutable("SELECT denek_tc As [DENEK TC], denek_isim As [DENEK İSİM],cinsiyet_adi As [CİNSİYET],denek_dogumTarihi As[DENEK DOĞUM TARİHİ],il_adi As [DOĞUM YERİ],denek_babaAdi As [DENEK BABA ADI],denek_engelDurumu As [DENEK ENGEL DURUMU],denek_takimOkul As [TAKIM/OKUL],denek_bransSinif As [BRANŞ/SINIF],denek_mevki As [MEVKİ] FROM Denek WHERE denek_id = '"),psikolojikekle.mostCurrent._testdenekara._secilendenek /*RemoteObject*/ ,RemoteObject.createImmutable("' "))),(Object)((psikolojikekle.mostCurrent.__c.getField(false,"Null"))),(Object)(BA.numberCast(int.class, -(double) (0 + 1))),(Object)(psikolojikekle.mostCurrent.__c.getField(true,"False")))));
 BA.debugLineNum = 63;BA.debugLine="End Sub";
Debug.ShouldStop(1073741824);
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
		Debug.PushSubsStack("ID (psikolojikekle) ","psikolojikekle",39,psikolojikekle.mostCurrent.activityBA,psikolojikekle.mostCurrent,65);
if (RapidSub.canDelegate("id")) { return b4a.example3.psikolojikekle.remoteMe.runUserSub(false, "psikolojikekle","id");}
RemoteObject _sf = RemoteObject.declareNull("adr.stringfunctions.stringfunctions");
 BA.debugLineNum = 65;BA.debugLine="Sub ID";
Debug.ShouldStop(1);
 BA.debugLineNum = 66;BA.debugLine="Dim sf As StringFunctions";
Debug.ShouldStop(2);
_sf = RemoteObject.createNew ("adr.stringfunctions.stringfunctions");Debug.locals.put("sf", _sf);
 BA.debugLineNum = 67;BA.debugLine="sf.initialize";
Debug.ShouldStop(4);
_sf.runVoidMethod ("_initialize",psikolojikekle.processBA);
 BA.debugLineNum = 69;BA.debugLine="rs= Main.sql.ExecQuery(\"SELECT * FROM Psikolojik";
Debug.ShouldStop(16);
psikolojikekle.mostCurrent._rs.setObject(psikolojikekle.mostCurrent._main._sql /*RemoteObject*/ .runMethod(false,"ExecQuery",(Object)(RemoteObject.createImmutable("SELECT * FROM Psikolojik ORDER BY psikolojik_id DESC"))));
 BA.debugLineNum = 70;BA.debugLine="If rs.RowCount>0 Then";
Debug.ShouldStop(32);
if (RemoteObject.solveBoolean(">",psikolojikekle.mostCurrent._rs.runMethod(true,"getRowCount"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 71;BA.debugLine="rs.Position=0";
Debug.ShouldStop(64);
psikolojikekle.mostCurrent._rs.runMethod(true,"setPosition",BA.numberCast(int.class, 0));
 BA.debugLineNum = 72;BA.debugLine="PsikolojikID = sf.Right(\"00\" &sf.Trim(sf.Val(sf.";
Debug.ShouldStop(128);
psikolojikekle._psikolojikid = BA.numberCast(int.class, _sf.runMethod(true,"_vvvvv7",(Object)(RemoteObject.concat(RemoteObject.createImmutable("00"),_sf.runMethod(true,"_vvvvvvv4",(Object)(BA.NumberToString(RemoteObject.solve(new RemoteObject[] {_sf.runMethod(true,"_vvvvvvv6",(Object)(_sf.runMethod(true,"_vvvvv7",(Object)(psikolojikekle.mostCurrent._rs.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("psikolojik_id")))),(Object)(BA.numberCast(long.class, 3))))),RemoteObject.createImmutable(1)}, "+",1, 0)))))),(Object)(BA.numberCast(long.class, 3))));
 }else {
 BA.debugLineNum = 74;BA.debugLine="PsikolojikID=\"001\"";
Debug.ShouldStop(512);
psikolojikekle._psikolojikid = BA.numberCast(int.class, "001");
 };
 BA.debugLineNum = 76;BA.debugLine="rs.Close";
Debug.ShouldStop(2048);
psikolojikekle.mostCurrent._rs.runVoidMethod ("Close");
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
public static RemoteObject  _process_globals() throws Exception{
 //BA.debugLineNum = 6;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 10;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
}