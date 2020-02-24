package b4a.example3;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class surattestayar_subs_0 {


public static RemoteObject  _activity_create(RemoteObject _firsttime) throws Exception{
try {
		Debug.PushSubsStack("Activity_Create (surattestayar) ","surattestayar",18,surattestayar.mostCurrent.activityBA,surattestayar.mostCurrent,37);
if (RapidSub.canDelegate("activity_create")) { return b4a.example3.surattestayar.remoteMe.runUserSub(false, "surattestayar","activity_create", _firsttime);}
Debug.locals.put("FirstTime", _firsttime);
 BA.debugLineNum = 37;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
Debug.ShouldStop(16);
 BA.debugLineNum = 39;BA.debugLine="Activity.LoadLayout(\"SuratTestAyarPage\")";
Debug.ShouldStop(64);
surattestayar.mostCurrent._activity.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("SuratTestAyarPage")),surattestayar.mostCurrent.activityBA);
 BA.debugLineNum = 42;BA.debugLine="SpinnerMode.DropdownBackgroundColor = Colors.Whit";
Debug.ShouldStop(512);
surattestayar.mostCurrent._spinnermode.runMethod(true,"setDropdownBackgroundColor",surattestayar.mostCurrent.__c.getField(false,"Colors").getField(true,"White"));
 BA.debugLineNum = 43;BA.debugLine="SpinnerMode.DropdownTextColor = Color.koyuMavi";
Debug.ShouldStop(1024);
surattestayar.mostCurrent._spinnermode.runMethod(true,"setDropdownTextColor",surattestayar.mostCurrent._color._koyumavi /*RemoteObject*/ );
 BA.debugLineNum = 44;BA.debugLine="SpinnerMode.TextColor= Colors.White";
Debug.ShouldStop(2048);
surattestayar.mostCurrent._spinnermode.runMethod(true,"setTextColor",surattestayar.mostCurrent.__c.getField(false,"Colors").getField(true,"White"));
 BA.debugLineNum = 45;BA.debugLine="SpinnerMode.TextSize = 20";
Debug.ShouldStop(4096);
surattestayar.mostCurrent._spinnermode.runMethod(true,"setTextSize",BA.numberCast(float.class, 20));
 BA.debugLineNum = 47;BA.debugLine="SpinnerGate.DropdownBackgroundColor= Colors.White";
Debug.ShouldStop(16384);
surattestayar.mostCurrent._spinnergate.runMethod(true,"setDropdownBackgroundColor",surattestayar.mostCurrent.__c.getField(false,"Colors").getField(true,"White"));
 BA.debugLineNum = 48;BA.debugLine="SpinnerGate.DropdownTextColor= Color.koyuMavi";
Debug.ShouldStop(32768);
surattestayar.mostCurrent._spinnergate.runMethod(true,"setDropdownTextColor",surattestayar.mostCurrent._color._koyumavi /*RemoteObject*/ );
 BA.debugLineNum = 49;BA.debugLine="SpinnerGate.TextColor= Colors.White";
Debug.ShouldStop(65536);
surattestayar.mostCurrent._spinnergate.runMethod(true,"setTextColor",surattestayar.mostCurrent.__c.getField(false,"Colors").getField(true,"White"));
 BA.debugLineNum = 50;BA.debugLine="SpinnerGate.TextSize = 20";
Debug.ShouldStop(131072);
surattestayar.mostCurrent._spinnergate.runMethod(true,"setTextSize",BA.numberCast(float.class, 20));
 BA.debugLineNum = 52;BA.debugLine="SpinnerSet.DropdownBackgroundColor= Colors.White";
Debug.ShouldStop(524288);
surattestayar.mostCurrent._spinnerset.runMethod(true,"setDropdownBackgroundColor",surattestayar.mostCurrent.__c.getField(false,"Colors").getField(true,"White"));
 BA.debugLineNum = 53;BA.debugLine="SpinnerSet.DropdownTextColor= Color.koyuMavi";
Debug.ShouldStop(1048576);
surattestayar.mostCurrent._spinnerset.runMethod(true,"setDropdownTextColor",surattestayar.mostCurrent._color._koyumavi /*RemoteObject*/ );
 BA.debugLineNum = 54;BA.debugLine="SpinnerSet.TextColor= Colors.White";
Debug.ShouldStop(2097152);
surattestayar.mostCurrent._spinnerset.runMethod(true,"setTextColor",surattestayar.mostCurrent.__c.getField(false,"Colors").getField(true,"White"));
 BA.debugLineNum = 55;BA.debugLine="SpinnerSet.TextSize = 20";
Debug.ShouldStop(4194304);
surattestayar.mostCurrent._spinnerset.runMethod(true,"setTextSize",BA.numberCast(float.class, 20));
 BA.debugLineNum = 57;BA.debugLine="LabelMode.TextColor = Colors.White";
Debug.ShouldStop(16777216);
surattestayar.mostCurrent._labelmode.runMethod(true,"setTextColor",surattestayar.mostCurrent.__c.getField(false,"Colors").getField(true,"White"));
 BA.debugLineNum = 58;BA.debugLine="LabelMode.TextSize = 20";
Debug.ShouldStop(33554432);
surattestayar.mostCurrent._labelmode.runMethod(true,"setTextSize",BA.numberCast(float.class, 20));
 BA.debugLineNum = 59;BA.debugLine="LabelMode.Typeface = Typeface.DEFAULT_BOLD";
Debug.ShouldStop(67108864);
surattestayar.mostCurrent._labelmode.runMethod(false,"setTypeface",surattestayar.mostCurrent.__c.getField(false,"Typeface").getField(false,"DEFAULT_BOLD"));
 BA.debugLineNum = 61;BA.debugLine="LabelGate.TextColor = Colors.White";
Debug.ShouldStop(268435456);
surattestayar.mostCurrent._labelgate.runMethod(true,"setTextColor",surattestayar.mostCurrent.__c.getField(false,"Colors").getField(true,"White"));
 BA.debugLineNum = 62;BA.debugLine="LabelGate.TextSize = 20";
Debug.ShouldStop(536870912);
surattestayar.mostCurrent._labelgate.runMethod(true,"setTextSize",BA.numberCast(float.class, 20));
 BA.debugLineNum = 63;BA.debugLine="LabelGate.Typeface = Typeface.DEFAULT_BOLD";
Debug.ShouldStop(1073741824);
surattestayar.mostCurrent._labelgate.runMethod(false,"setTypeface",surattestayar.mostCurrent.__c.getField(false,"Typeface").getField(false,"DEFAULT_BOLD"));
 BA.debugLineNum = 65;BA.debugLine="LabelSet.TextColor = Colors.White";
Debug.ShouldStop(1);
surattestayar.mostCurrent._labelset.runMethod(true,"setTextColor",surattestayar.mostCurrent.__c.getField(false,"Colors").getField(true,"White"));
 BA.debugLineNum = 66;BA.debugLine="LabelSet.TextSize = 20";
Debug.ShouldStop(2);
surattestayar.mostCurrent._labelset.runMethod(true,"setTextSize",BA.numberCast(float.class, 20));
 BA.debugLineNum = 67;BA.debugLine="LabelSet.Typeface = Typeface.DEFAULT_BOLD";
Debug.ShouldStop(4);
surattestayar.mostCurrent._labelset.runMethod(false,"setTypeface",surattestayar.mostCurrent.__c.getField(false,"Typeface").getField(false,"DEFAULT_BOLD"));
 BA.debugLineNum = 69;BA.debugLine="LabelDakika.TextColor = Colors.White";
Debug.ShouldStop(16);
surattestayar.mostCurrent._labeldakika.runMethod(true,"setTextColor",surattestayar.mostCurrent.__c.getField(false,"Colors").getField(true,"White"));
 BA.debugLineNum = 70;BA.debugLine="LabelDakika.TextSize = 20";
Debug.ShouldStop(32);
surattestayar.mostCurrent._labeldakika.runMethod(true,"setTextSize",BA.numberCast(float.class, 20));
 BA.debugLineNum = 71;BA.debugLine="LabelDakika.Typeface = Typeface.DEFAULT_BOLD";
Debug.ShouldStop(64);
surattestayar.mostCurrent._labeldakika.runMethod(false,"setTypeface",surattestayar.mostCurrent.__c.getField(false,"Typeface").getField(false,"DEFAULT_BOLD"));
 BA.debugLineNum = 73;BA.debugLine="LabelSaniye.TextColor = Colors.White";
Debug.ShouldStop(256);
surattestayar.mostCurrent._labelsaniye.runMethod(true,"setTextColor",surattestayar.mostCurrent.__c.getField(false,"Colors").getField(true,"White"));
 BA.debugLineNum = 74;BA.debugLine="LabelSaniye.TextSize = 20";
Debug.ShouldStop(512);
surattestayar.mostCurrent._labelsaniye.runMethod(true,"setTextSize",BA.numberCast(float.class, 20));
 BA.debugLineNum = 75;BA.debugLine="LabelSaniye.Typeface = Typeface.DEFAULT_BOLD";
Debug.ShouldStop(1024);
surattestayar.mostCurrent._labelsaniye.runMethod(false,"setTypeface",surattestayar.mostCurrent.__c.getField(false,"Typeface").getField(false,"DEFAULT_BOLD"));
 BA.debugLineNum = 77;BA.debugLine="EditTextDakika.TextSize = 20";
Debug.ShouldStop(4096);
surattestayar.mostCurrent._edittextdakika.runMethod(true,"setTextSize",BA.numberCast(float.class, 20));
 BA.debugLineNum = 78;BA.debugLine="EditTextDakika.TextColor = Colors.White";
Debug.ShouldStop(8192);
surattestayar.mostCurrent._edittextdakika.runMethod(true,"setTextColor",surattestayar.mostCurrent.__c.getField(false,"Colors").getField(true,"White"));
 BA.debugLineNum = 79;BA.debugLine="EditTextDakika.Typeface = Typeface.DEFAULT";
Debug.ShouldStop(16384);
surattestayar.mostCurrent._edittextdakika.runMethod(false,"setTypeface",surattestayar.mostCurrent.__c.getField(false,"Typeface").getField(false,"DEFAULT"));
 BA.debugLineNum = 80;BA.debugLine="EditTextDakika.Text = 0";
Debug.ShouldStop(32768);
surattestayar.mostCurrent._edittextdakika.runMethodAndSync(true,"setText",BA.ObjectToCharSequence(0));
 BA.debugLineNum = 82;BA.debugLine="EditTextSaniye.TextSize = 20";
Debug.ShouldStop(131072);
surattestayar.mostCurrent._edittextsaniye.runMethod(true,"setTextSize",BA.numberCast(float.class, 20));
 BA.debugLineNum = 83;BA.debugLine="EditTextSaniye.TextColor = Colors.White";
Debug.ShouldStop(262144);
surattestayar.mostCurrent._edittextsaniye.runMethod(true,"setTextColor",surattestayar.mostCurrent.__c.getField(false,"Colors").getField(true,"White"));
 BA.debugLineNum = 84;BA.debugLine="EditTextSaniye.Typeface = Typeface.DEFAULT";
Debug.ShouldStop(524288);
surattestayar.mostCurrent._edittextsaniye.runMethod(false,"setTypeface",surattestayar.mostCurrent.__c.getField(false,"Typeface").getField(false,"DEFAULT"));
 BA.debugLineNum = 85;BA.debugLine="EditTextSaniye.Text = 5";
Debug.ShouldStop(1048576);
surattestayar.mostCurrent._edittextsaniye.runMethodAndSync(true,"setText",BA.ObjectToCharSequence(5));
 BA.debugLineNum = 89;BA.debugLine="SpinnerMode.AddAll(Array As String(\"Lap Mode\",\"Sp";
Debug.ShouldStop(16777216);
surattestayar.mostCurrent._spinnermode.runVoidMethod ("AddAll",(Object)(surattestayar.mostCurrent.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("String",new int[] {3},new Object[] {BA.ObjectToString("Lap Mode"),BA.ObjectToString("Split Mode"),RemoteObject.createImmutable("Rest Mode")})))));
 BA.debugLineNum = 90;BA.debugLine="SpinnerGate.AddAll(Array As Int(0,2,3,4,5,6,7,8,9";
Debug.ShouldStop(33554432);
surattestayar.mostCurrent._spinnergate.runVoidMethod ("AddAll",(Object)(surattestayar.mostCurrent.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("int",new int[] {20},new Object[] {BA.numberCast(int.class, 0),BA.numberCast(int.class, 2),BA.numberCast(int.class, 3),BA.numberCast(int.class, 4),BA.numberCast(int.class, 5),BA.numberCast(int.class, 6),BA.numberCast(int.class, 7),BA.numberCast(int.class, 8),BA.numberCast(int.class, 9),BA.numberCast(int.class, 10),BA.numberCast(int.class, 11),BA.numberCast(int.class, 12),BA.numberCast(int.class, 13),BA.numberCast(int.class, 14),BA.numberCast(int.class, 15),BA.numberCast(int.class, 16),BA.numberCast(int.class, 17),BA.numberCast(int.class, 18),BA.numberCast(int.class, 19),BA.numberCast(int.class, 20)})))));
 BA.debugLineNum = 92;BA.debugLine="SpinnerSet.Visible = False";
Debug.ShouldStop(134217728);
surattestayar.mostCurrent._spinnerset.runMethod(true,"setVisible",surattestayar.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 93;BA.debugLine="LabelSet.Visible = False";
Debug.ShouldStop(268435456);
surattestayar.mostCurrent._labelset.runMethod(true,"setVisible",surattestayar.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 94;BA.debugLine="set = 1";
Debug.ShouldStop(536870912);
surattestayar._set = BA.numberCast(int.class, 1);
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
public static RemoteObject  _activity_pause(RemoteObject _userclosed) throws Exception{
try {
		Debug.PushSubsStack("Activity_Pause (surattestayar) ","surattestayar",18,surattestayar.mostCurrent.activityBA,surattestayar.mostCurrent,102);
if (RapidSub.canDelegate("activity_pause")) { return b4a.example3.surattestayar.remoteMe.runUserSub(false, "surattestayar","activity_pause", _userclosed);}
Debug.locals.put("UserClosed", _userclosed);
 BA.debugLineNum = 102;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
Debug.ShouldStop(32);
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
public static RemoteObject  _activity_resume() throws Exception{
try {
		Debug.PushSubsStack("Activity_Resume (surattestayar) ","surattestayar",18,surattestayar.mostCurrent.activityBA,surattestayar.mostCurrent,98);
if (RapidSub.canDelegate("activity_resume")) { return b4a.example3.surattestayar.remoteMe.runUserSub(false, "surattestayar","activity_resume");}
 BA.debugLineNum = 98;BA.debugLine="Sub Activity_Resume";
Debug.ShouldStop(2);
 BA.debugLineNum = 100;BA.debugLine="End Sub";
Debug.ShouldStop(8);
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
		Debug.PushSubsStack("ButtonOK_Click (surattestayar) ","surattestayar",18,surattestayar.mostCurrent.activityBA,surattestayar.mostCurrent,118);
if (RapidSub.canDelegate("buttonok_click")) { return b4a.example3.surattestayar.remoteMe.runUserSub(false, "surattestayar","buttonok_click");}
 BA.debugLineNum = 118;BA.debugLine="Sub ButtonOK_Click";
Debug.ShouldStop(2097152);
 BA.debugLineNum = 119;BA.debugLine="If gate == 0 Then";
Debug.ShouldStop(4194304);
if (RemoteObject.solveBoolean("=",surattestayar._gate,BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 120;BA.debugLine="Msgbox(\"Gate Sayısı boş bırakılamaz\",\"Bildirim M";
Debug.ShouldStop(8388608);
surattestayar.mostCurrent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToCharSequence("Gate Sayısı boş bırakılamaz")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Bildirim Mesajı"))),surattestayar.mostCurrent.activityBA);
 BA.debugLineNum = 121;BA.debugLine="Return";
Debug.ShouldStop(16777216);
if (true) return RemoteObject.createImmutable("");
 };
 BA.debugLineNum = 123;BA.debugLine="If set == 0 Then";
Debug.ShouldStop(67108864);
if (RemoteObject.solveBoolean("=",surattestayar._set,BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 124;BA.debugLine="Msgbox(\"Set sayısı boş bırakılamaz\",\"Bildirim Me";
Debug.ShouldStop(134217728);
surattestayar.mostCurrent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToCharSequence("Set sayısı boş bırakılamaz")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Bildirim Mesajı"))),surattestayar.mostCurrent.activityBA);
 BA.debugLineNum = 125;BA.debugLine="Return";
Debug.ShouldStop(268435456);
if (true) return RemoteObject.createImmutable("");
 };
 BA.debugLineNum = 127;BA.debugLine="If set <> 0 And gate <> 0 Then";
Debug.ShouldStop(1073741824);
if (RemoteObject.solveBoolean("!",surattestayar._set,BA.numberCast(double.class, 0)) && RemoteObject.solveBoolean("!",surattestayar._gate,BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 128;BA.debugLine="result = set * (gate -1)";
Debug.ShouldStop(-2147483648);
surattestayar._result = RemoteObject.solve(new RemoteObject[] {surattestayar._set,(RemoteObject.solve(new RemoteObject[] {surattestayar._gate,RemoteObject.createImmutable(1)}, "-",1, 1))}, "*",0, 1);
 BA.debugLineNum = 129;BA.debugLine="Log(\"result :\" &result)";
Debug.ShouldStop(1);
surattestayar.mostCurrent.__c.runVoidMethod ("LogImpl","226083339",RemoteObject.concat(RemoteObject.createImmutable("result :"),surattestayar._result),0);
 BA.debugLineNum = 130;BA.debugLine="restDegerBul = result/set";
Debug.ShouldStop(2);
surattestayar._restdegerbul = BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {surattestayar._result,surattestayar._set}, "/",0, 0));
 BA.debugLineNum = 131;BA.debugLine="Log(\"restDeger Bul:\" &restDegerBul)";
Debug.ShouldStop(4);
surattestayar.mostCurrent.__c.runVoidMethod ("LogImpl","226083341",RemoteObject.concat(RemoteObject.createImmutable("restDeger Bul:"),surattestayar._restdegerbul),0);
 BA.debugLineNum = 133;BA.debugLine="If EditTextDakika.Text > 59 Then";
Debug.ShouldStop(16);
if (RemoteObject.solveBoolean(">",BA.numberCast(double.class, surattestayar.mostCurrent._edittextdakika.runMethod(true,"getText")),BA.numberCast(double.class, 59))) { 
 BA.debugLineNum = 134;BA.debugLine="ToastMessageShow(\"Dakika değerini en fazla 59 y";
Debug.ShouldStop(32);
surattestayar.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("Dakika değerini en fazla 59 yapınız")),(Object)(surattestayar.mostCurrent.__c.getField(true,"True")));
 BA.debugLineNum = 135;BA.debugLine="Return";
Debug.ShouldStop(64);
if (true) return RemoteObject.createImmutable("");
 }else {
 BA.debugLineNum = 137;BA.debugLine="Log(\"burada\")";
Debug.ShouldStop(256);
surattestayar.mostCurrent.__c.runVoidMethod ("LogImpl","226083347",RemoteObject.createImmutable("burada"),0);
 BA.debugLineNum = 138;BA.debugLine="degerDakika = EditTextDakika.Text";
Debug.ShouldStop(512);
surattestayar._degerdakika = BA.numberCast(int.class, surattestayar.mostCurrent._edittextdakika.runMethod(true,"getText"));
 BA.debugLineNum = 139;BA.debugLine="degerSaniye = EditTextSaniye.Text";
Debug.ShouldStop(1024);
surattestayar._degersaniye = BA.numberCast(int.class, surattestayar.mostCurrent._edittextsaniye.runMethod(true,"getText"));
 };
 BA.debugLineNum = 142;BA.debugLine="StartActivity(SuratTestEkle)";
Debug.ShouldStop(8192);
surattestayar.mostCurrent.__c.runVoidMethod ("StartActivity",surattestayar.processBA,(Object)((surattestayar.mostCurrent._surattestekle.getObject())));
 BA.debugLineNum = 143;BA.debugLine="Activity.Finish";
Debug.ShouldStop(16384);
surattestayar.mostCurrent._activity.runVoidMethod ("Finish");
 };
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
public static RemoteObject  _globals() throws Exception{
 //BA.debugLineNum = 20;BA.debugLine="Sub Globals";
 //BA.debugLineNum = 23;BA.debugLine="Private LabelMode As Label";
surattestayar.mostCurrent._labelmode = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 24;BA.debugLine="Private SpinnerMode As Spinner";
surattestayar.mostCurrent._spinnermode = RemoteObject.createNew ("anywheresoftware.b4a.objects.SpinnerWrapper");
 //BA.debugLineNum = 25;BA.debugLine="Private LabelGate As Label";
surattestayar.mostCurrent._labelgate = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 26;BA.debugLine="Private LabelSet As Label";
surattestayar.mostCurrent._labelset = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 27;BA.debugLine="Private ButtonOK As Button";
surattestayar.mostCurrent._buttonok = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 28;BA.debugLine="Private SpinnerGate As Spinner";
surattestayar.mostCurrent._spinnergate = RemoteObject.createNew ("anywheresoftware.b4a.objects.SpinnerWrapper");
 //BA.debugLineNum = 29;BA.debugLine="Private SpinnerSet As Spinner";
surattestayar.mostCurrent._spinnerset = RemoteObject.createNew ("anywheresoftware.b4a.objects.SpinnerWrapper");
 //BA.debugLineNum = 30;BA.debugLine="Private LabelDakika As Label";
surattestayar.mostCurrent._labeldakika = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 31;BA.debugLine="Private LabelSaniye As Label";
surattestayar.mostCurrent._labelsaniye = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 32;BA.debugLine="Private EditTextDakika As EditText";
surattestayar.mostCurrent._edittextdakika = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
 //BA.debugLineNum = 33;BA.debugLine="Private EditTextSaniye As EditText";
surattestayar.mostCurrent._edittextsaniye = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
 //BA.debugLineNum = 35;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _process_globals() throws Exception{
 //BA.debugLineNum = 6;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 9;BA.debugLine="Dim secilenMode As String = \"Lap Mode\"";
surattestayar._secilenmode = BA.ObjectToString("Lap Mode");
 //BA.debugLineNum = 10;BA.debugLine="Dim gate As Int = 0";
surattestayar._gate = BA.numberCast(int.class, 0);
 //BA.debugLineNum = 11;BA.debugLine="Dim set As Int = 0";
surattestayar._set = BA.numberCast(int.class, 0);
 //BA.debugLineNum = 12;BA.debugLine="Dim result As Int";
surattestayar._result = RemoteObject.createImmutable(0);
 //BA.debugLineNum = 14;BA.debugLine="Dim degerDakika As Int";
surattestayar._degerdakika = RemoteObject.createImmutable(0);
 //BA.debugLineNum = 15;BA.debugLine="Dim degerSaniye As Int";
surattestayar._degersaniye = RemoteObject.createImmutable(0);
 //BA.debugLineNum = 17;BA.debugLine="Dim restDegerBul As Int";
surattestayar._restdegerbul = RemoteObject.createImmutable(0);
 //BA.debugLineNum = 18;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _spinnergate_itemclick(RemoteObject _position,RemoteObject _value) throws Exception{
try {
		Debug.PushSubsStack("SpinnerGate_ItemClick (surattestayar) ","surattestayar",18,surattestayar.mostCurrent.activityBA,surattestayar.mostCurrent,147);
if (RapidSub.canDelegate("spinnergate_itemclick")) { return b4a.example3.surattestayar.remoteMe.runUserSub(false, "surattestayar","spinnergate_itemclick", _position, _value);}
RemoteObject _setdizi = null;
int _i = 0;
Debug.locals.put("Position", _position);
Debug.locals.put("Value", _value);
 BA.debugLineNum = 147;BA.debugLine="Sub SpinnerGate_ItemClick (Position As Int, Value";
Debug.ShouldStop(262144);
 BA.debugLineNum = 148;BA.debugLine="gate = Value";
Debug.ShouldStop(524288);
surattestayar._gate = BA.numberCast(int.class, _value);
 BA.debugLineNum = 149;BA.debugLine="If gate == 0 Then";
Debug.ShouldStop(1048576);
if (RemoteObject.solveBoolean("=",surattestayar._gate,BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 150;BA.debugLine="ToastMessageShow(\"Varsayılan gate sayısı 2 olara";
Debug.ShouldStop(2097152);
surattestayar.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("Varsayılan gate sayısı 2 olarak ayarlandı")),(Object)(surattestayar.mostCurrent.__c.getField(true,"True")));
 BA.debugLineNum = 151;BA.debugLine="gate = 2";
Debug.ShouldStop(4194304);
surattestayar._gate = BA.numberCast(int.class, 2);
 };
 BA.debugLineNum = 155;BA.debugLine="If gate== 20 Or gate==19 Or gate==18 Then";
Debug.ShouldStop(67108864);
if (RemoteObject.solveBoolean("=",surattestayar._gate,BA.numberCast(double.class, 20)) || RemoteObject.solveBoolean("=",surattestayar._gate,BA.numberCast(double.class, 19)) || RemoteObject.solveBoolean("=",surattestayar._gate,BA.numberCast(double.class, 18))) { 
 BA.debugLineNum = 156;BA.debugLine="Dim setDizi(6) As Int";
Debug.ShouldStop(134217728);
_setdizi = RemoteObject.createNewArray ("int", new int[] {6}, new Object[]{});Debug.locals.put("setDizi", _setdizi);
 BA.debugLineNum = 157;BA.debugLine="For i=1 To 5";
Debug.ShouldStop(268435456);
{
final int step8 = 1;
final int limit8 = 5;
_i = 1 ;
for (;(step8 > 0 && _i <= limit8) || (step8 < 0 && _i >= limit8) ;_i = ((int)(0 + _i + step8))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 158;BA.debugLine="setDizi(i) = i";
Debug.ShouldStop(536870912);
_setdizi.setArrayElement (BA.numberCast(int.class, _i),BA.numberCast(int.class, _i));
 }
}Debug.locals.put("i", _i);
;
 }else 
{ BA.debugLineNum = 160;BA.debugLine="Else If gate== 16 Or gate ==17 Then";
Debug.ShouldStop(-2147483648);
if (RemoteObject.solveBoolean("=",surattestayar._gate,BA.numberCast(double.class, 16)) || RemoteObject.solveBoolean("=",surattestayar._gate,BA.numberCast(double.class, 17))) { 
 BA.debugLineNum = 161;BA.debugLine="Dim setDizi(7) As Int";
Debug.ShouldStop(1);
_setdizi = RemoteObject.createNewArray ("int", new int[] {7}, new Object[]{});Debug.locals.put("setDizi", _setdizi);
 BA.debugLineNum = 162;BA.debugLine="For i=1 To 6";
Debug.ShouldStop(2);
{
final int step13 = 1;
final int limit13 = 6;
_i = 1 ;
for (;(step13 > 0 && _i <= limit13) || (step13 < 0 && _i >= limit13) ;_i = ((int)(0 + _i + step13))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 163;BA.debugLine="setDizi(i) = i";
Debug.ShouldStop(4);
_setdizi.setArrayElement (BA.numberCast(int.class, _i),BA.numberCast(int.class, _i));
 }
}Debug.locals.put("i", _i);
;
 }else 
{ BA.debugLineNum = 165;BA.debugLine="Else if gate== 14 Or gate== 15 Then";
Debug.ShouldStop(16);
if (RemoteObject.solveBoolean("=",surattestayar._gate,BA.numberCast(double.class, 14)) || RemoteObject.solveBoolean("=",surattestayar._gate,BA.numberCast(double.class, 15))) { 
 BA.debugLineNum = 166;BA.debugLine="Dim setDizi(8) As Int";
Debug.ShouldStop(32);
_setdizi = RemoteObject.createNewArray ("int", new int[] {8}, new Object[]{});Debug.locals.put("setDizi", _setdizi);
 BA.debugLineNum = 167;BA.debugLine="For i=1 To 7";
Debug.ShouldStop(64);
{
final int step18 = 1;
final int limit18 = 7;
_i = 1 ;
for (;(step18 > 0 && _i <= limit18) || (step18 < 0 && _i >= limit18) ;_i = ((int)(0 + _i + step18))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 168;BA.debugLine="setDizi(i) = i";
Debug.ShouldStop(128);
_setdizi.setArrayElement (BA.numberCast(int.class, _i),BA.numberCast(int.class, _i));
 }
}Debug.locals.put("i", _i);
;
 }else 
{ BA.debugLineNum = 170;BA.debugLine="Else if gate == 13 Then";
Debug.ShouldStop(512);
if (RemoteObject.solveBoolean("=",surattestayar._gate,BA.numberCast(double.class, 13))) { 
 BA.debugLineNum = 171;BA.debugLine="Dim setDizi(9) As Int";
Debug.ShouldStop(1024);
_setdizi = RemoteObject.createNewArray ("int", new int[] {9}, new Object[]{});Debug.locals.put("setDizi", _setdizi);
 BA.debugLineNum = 172;BA.debugLine="For i=1 To 8";
Debug.ShouldStop(2048);
{
final int step23 = 1;
final int limit23 = 8;
_i = 1 ;
for (;(step23 > 0 && _i <= limit23) || (step23 < 0 && _i >= limit23) ;_i = ((int)(0 + _i + step23))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 173;BA.debugLine="setDizi(i) = i";
Debug.ShouldStop(4096);
_setdizi.setArrayElement (BA.numberCast(int.class, _i),BA.numberCast(int.class, _i));
 }
}Debug.locals.put("i", _i);
;
 }else 
{ BA.debugLineNum = 175;BA.debugLine="Else if gate == 12 Then";
Debug.ShouldStop(16384);
if (RemoteObject.solveBoolean("=",surattestayar._gate,BA.numberCast(double.class, 12))) { 
 BA.debugLineNum = 176;BA.debugLine="Dim setDizi(10) As Int";
Debug.ShouldStop(32768);
_setdizi = RemoteObject.createNewArray ("int", new int[] {10}, new Object[]{});Debug.locals.put("setDizi", _setdizi);
 BA.debugLineNum = 177;BA.debugLine="For i=1 To 9";
Debug.ShouldStop(65536);
{
final int step28 = 1;
final int limit28 = 9;
_i = 1 ;
for (;(step28 > 0 && _i <= limit28) || (step28 < 0 && _i >= limit28) ;_i = ((int)(0 + _i + step28))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 178;BA.debugLine="setDizi(i) = i";
Debug.ShouldStop(131072);
_setdizi.setArrayElement (BA.numberCast(int.class, _i),BA.numberCast(int.class, _i));
 }
}Debug.locals.put("i", _i);
;
 }else 
{ BA.debugLineNum = 180;BA.debugLine="else if gate== 11 Then";
Debug.ShouldStop(524288);
if (RemoteObject.solveBoolean("=",surattestayar._gate,BA.numberCast(double.class, 11))) { 
 BA.debugLineNum = 181;BA.debugLine="Dim setDizi(11) As Int";
Debug.ShouldStop(1048576);
_setdizi = RemoteObject.createNewArray ("int", new int[] {11}, new Object[]{});Debug.locals.put("setDizi", _setdizi);
 BA.debugLineNum = 182;BA.debugLine="For i=1 To 10";
Debug.ShouldStop(2097152);
{
final int step33 = 1;
final int limit33 = 10;
_i = 1 ;
for (;(step33 > 0 && _i <= limit33) || (step33 < 0 && _i >= limit33) ;_i = ((int)(0 + _i + step33))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 183;BA.debugLine="setDizi(i) = i";
Debug.ShouldStop(4194304);
_setdizi.setArrayElement (BA.numberCast(int.class, _i),BA.numberCast(int.class, _i));
 }
}Debug.locals.put("i", _i);
;
 }else 
{ BA.debugLineNum = 185;BA.debugLine="Else if gate==10 Then";
Debug.ShouldStop(16777216);
if (RemoteObject.solveBoolean("=",surattestayar._gate,BA.numberCast(double.class, 10))) { 
 BA.debugLineNum = 186;BA.debugLine="Dim setDizi(12) As Int";
Debug.ShouldStop(33554432);
_setdizi = RemoteObject.createNewArray ("int", new int[] {12}, new Object[]{});Debug.locals.put("setDizi", _setdizi);
 BA.debugLineNum = 187;BA.debugLine="For i=1 To 11";
Debug.ShouldStop(67108864);
{
final int step38 = 1;
final int limit38 = 11;
_i = 1 ;
for (;(step38 > 0 && _i <= limit38) || (step38 < 0 && _i >= limit38) ;_i = ((int)(0 + _i + step38))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 188;BA.debugLine="setDizi(i) = i";
Debug.ShouldStop(134217728);
_setdizi.setArrayElement (BA.numberCast(int.class, _i),BA.numberCast(int.class, _i));
 }
}Debug.locals.put("i", _i);
;
 }else 
{ BA.debugLineNum = 190;BA.debugLine="Else If gate== 9 Then";
Debug.ShouldStop(536870912);
if (RemoteObject.solveBoolean("=",surattestayar._gate,BA.numberCast(double.class, 9))) { 
 BA.debugLineNum = 191;BA.debugLine="Dim setDizi(13) As Int";
Debug.ShouldStop(1073741824);
_setdizi = RemoteObject.createNewArray ("int", new int[] {13}, new Object[]{});Debug.locals.put("setDizi", _setdizi);
 BA.debugLineNum = 192;BA.debugLine="For i=1 To 12";
Debug.ShouldStop(-2147483648);
{
final int step43 = 1;
final int limit43 = 12;
_i = 1 ;
for (;(step43 > 0 && _i <= limit43) || (step43 < 0 && _i >= limit43) ;_i = ((int)(0 + _i + step43))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 193;BA.debugLine="setDizi(i) = i";
Debug.ShouldStop(1);
_setdizi.setArrayElement (BA.numberCast(int.class, _i),BA.numberCast(int.class, _i));
 }
}Debug.locals.put("i", _i);
;
 }else 
{ BA.debugLineNum = 195;BA.debugLine="Else if gate == 8 Then";
Debug.ShouldStop(4);
if (RemoteObject.solveBoolean("=",surattestayar._gate,BA.numberCast(double.class, 8))) { 
 BA.debugLineNum = 196;BA.debugLine="Dim setDizi(15) As Int";
Debug.ShouldStop(8);
_setdizi = RemoteObject.createNewArray ("int", new int[] {15}, new Object[]{});Debug.locals.put("setDizi", _setdizi);
 BA.debugLineNum = 197;BA.debugLine="For i=1 To 14";
Debug.ShouldStop(16);
{
final int step48 = 1;
final int limit48 = 14;
_i = 1 ;
for (;(step48 > 0 && _i <= limit48) || (step48 < 0 && _i >= limit48) ;_i = ((int)(0 + _i + step48))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 198;BA.debugLine="setDizi(i) = i";
Debug.ShouldStop(32);
_setdizi.setArrayElement (BA.numberCast(int.class, _i),BA.numberCast(int.class, _i));
 }
}Debug.locals.put("i", _i);
;
 }else 
{ BA.debugLineNum = 200;BA.debugLine="Else if gate == 7 Then";
Debug.ShouldStop(128);
if (RemoteObject.solveBoolean("=",surattestayar._gate,BA.numberCast(double.class, 7))) { 
 BA.debugLineNum = 201;BA.debugLine="Dim setDizi(17) As Int";
Debug.ShouldStop(256);
_setdizi = RemoteObject.createNewArray ("int", new int[] {17}, new Object[]{});Debug.locals.put("setDizi", _setdizi);
 BA.debugLineNum = 202;BA.debugLine="For i=1 To 16";
Debug.ShouldStop(512);
{
final int step53 = 1;
final int limit53 = 16;
_i = 1 ;
for (;(step53 > 0 && _i <= limit53) || (step53 < 0 && _i >= limit53) ;_i = ((int)(0 + _i + step53))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 203;BA.debugLine="setDizi(i) = i";
Debug.ShouldStop(1024);
_setdizi.setArrayElement (BA.numberCast(int.class, _i),BA.numberCast(int.class, _i));
 }
}Debug.locals.put("i", _i);
;
 }else 
{ BA.debugLineNum = 205;BA.debugLine="Else if gate == 6 Then";
Debug.ShouldStop(4096);
if (RemoteObject.solveBoolean("=",surattestayar._gate,BA.numberCast(double.class, 6))) { 
 BA.debugLineNum = 206;BA.debugLine="Dim setDizi(21) As Int";
Debug.ShouldStop(8192);
_setdizi = RemoteObject.createNewArray ("int", new int[] {21}, new Object[]{});Debug.locals.put("setDizi", _setdizi);
 BA.debugLineNum = 207;BA.debugLine="For i=1 To 20";
Debug.ShouldStop(16384);
{
final int step58 = 1;
final int limit58 = 20;
_i = 1 ;
for (;(step58 > 0 && _i <= limit58) || (step58 < 0 && _i >= limit58) ;_i = ((int)(0 + _i + step58))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 208;BA.debugLine="setDizi(i) = i";
Debug.ShouldStop(32768);
_setdizi.setArrayElement (BA.numberCast(int.class, _i),BA.numberCast(int.class, _i));
 }
}Debug.locals.put("i", _i);
;
 }else 
{ BA.debugLineNum = 210;BA.debugLine="Else if gate== 5 Then";
Debug.ShouldStop(131072);
if (RemoteObject.solveBoolean("=",surattestayar._gate,BA.numberCast(double.class, 5))) { 
 BA.debugLineNum = 211;BA.debugLine="Dim setDizi(26) As Int";
Debug.ShouldStop(262144);
_setdizi = RemoteObject.createNewArray ("int", new int[] {26}, new Object[]{});Debug.locals.put("setDizi", _setdizi);
 BA.debugLineNum = 212;BA.debugLine="For i=1 To 25";
Debug.ShouldStop(524288);
{
final int step63 = 1;
final int limit63 = 25;
_i = 1 ;
for (;(step63 > 0 && _i <= limit63) || (step63 < 0 && _i >= limit63) ;_i = ((int)(0 + _i + step63))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 213;BA.debugLine="setDizi(i) = i";
Debug.ShouldStop(1048576);
_setdizi.setArrayElement (BA.numberCast(int.class, _i),BA.numberCast(int.class, _i));
 }
}Debug.locals.put("i", _i);
;
 }else 
{ BA.debugLineNum = 215;BA.debugLine="Else If gate==4 Then";
Debug.ShouldStop(4194304);
if (RemoteObject.solveBoolean("=",surattestayar._gate,BA.numberCast(double.class, 4))) { 
 BA.debugLineNum = 216;BA.debugLine="Dim setDizi(34) As Int";
Debug.ShouldStop(8388608);
_setdizi = RemoteObject.createNewArray ("int", new int[] {34}, new Object[]{});Debug.locals.put("setDizi", _setdizi);
 BA.debugLineNum = 217;BA.debugLine="For i=1 To 33";
Debug.ShouldStop(16777216);
{
final int step68 = 1;
final int limit68 = 33;
_i = 1 ;
for (;(step68 > 0 && _i <= limit68) || (step68 < 0 && _i >= limit68) ;_i = ((int)(0 + _i + step68))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 218;BA.debugLine="setDizi(i) = i";
Debug.ShouldStop(33554432);
_setdizi.setArrayElement (BA.numberCast(int.class, _i),BA.numberCast(int.class, _i));
 }
}Debug.locals.put("i", _i);
;
 }else 
{ BA.debugLineNum = 220;BA.debugLine="Else if gate==3 Then";
Debug.ShouldStop(134217728);
if (RemoteObject.solveBoolean("=",surattestayar._gate,BA.numberCast(double.class, 3))) { 
 BA.debugLineNum = 221;BA.debugLine="Dim setDizi(51) As Int";
Debug.ShouldStop(268435456);
_setdizi = RemoteObject.createNewArray ("int", new int[] {51}, new Object[]{});Debug.locals.put("setDizi", _setdizi);
 BA.debugLineNum = 222;BA.debugLine="For i=1 To 50";
Debug.ShouldStop(536870912);
{
final int step73 = 1;
final int limit73 = 50;
_i = 1 ;
for (;(step73 > 0 && _i <= limit73) || (step73 < 0 && _i >= limit73) ;_i = ((int)(0 + _i + step73))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 223;BA.debugLine="setDizi(i) = i";
Debug.ShouldStop(1073741824);
_setdizi.setArrayElement (BA.numberCast(int.class, _i),BA.numberCast(int.class, _i));
 }
}Debug.locals.put("i", _i);
;
 }else 
{ BA.debugLineNum = 225;BA.debugLine="Else if gate == 2 Then";
Debug.ShouldStop(1);
if (RemoteObject.solveBoolean("=",surattestayar._gate,BA.numberCast(double.class, 2))) { 
 BA.debugLineNum = 226;BA.debugLine="Dim setDizi(101) As Int";
Debug.ShouldStop(2);
_setdizi = RemoteObject.createNewArray ("int", new int[] {101}, new Object[]{});Debug.locals.put("setDizi", _setdizi);
 BA.debugLineNum = 227;BA.debugLine="For i=1 To 100";
Debug.ShouldStop(4);
{
final int step78 = 1;
final int limit78 = 100;
_i = 1 ;
for (;(step78 > 0 && _i <= limit78) || (step78 < 0 && _i >= limit78) ;_i = ((int)(0 + _i + step78))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 228;BA.debugLine="setDizi(i) = i";
Debug.ShouldStop(8);
_setdizi.setArrayElement (BA.numberCast(int.class, _i),BA.numberCast(int.class, _i));
 }
}Debug.locals.put("i", _i);
;
 }else {
 BA.debugLineNum = 231;BA.debugLine="ToastMessageShow(\"gate seçilmedi\",True)";
Debug.ShouldStop(64);
surattestayar.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("gate seçilmedi")),(Object)(surattestayar.mostCurrent.__c.getField(true,"True")));
 }}}}}}}}}}}}}}}
;
 BA.debugLineNum = 235;BA.debugLine="SpinnerSet.Clear";
Debug.ShouldStop(1024);
surattestayar.mostCurrent._spinnerset.runVoidMethod ("Clear");
 BA.debugLineNum = 236;BA.debugLine="SpinnerSet.AddAll(setDizi)";
Debug.ShouldStop(2048);
surattestayar.mostCurrent._spinnerset.runVoidMethod ("AddAll",(Object)(surattestayar.mostCurrent.__c.runMethod(false, "ArrayToList", (Object)(_setdizi))));
 BA.debugLineNum = 237;BA.debugLine="End Sub";
Debug.ShouldStop(4096);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _spinnermode_itemclick(RemoteObject _position,RemoteObject _value) throws Exception{
try {
		Debug.PushSubsStack("SpinnerMode_ItemClick (surattestayar) ","surattestayar",18,surattestayar.mostCurrent.activityBA,surattestayar.mostCurrent,106);
if (RapidSub.canDelegate("spinnermode_itemclick")) { return b4a.example3.surattestayar.remoteMe.runUserSub(false, "surattestayar","spinnermode_itemclick", _position, _value);}
Debug.locals.put("Position", _position);
Debug.locals.put("Value", _value);
 BA.debugLineNum = 106;BA.debugLine="Sub SpinnerMode_ItemClick (Position As Int, Value";
Debug.ShouldStop(512);
 BA.debugLineNum = 107;BA.debugLine="secilenMode = Value";
Debug.ShouldStop(1024);
surattestayar._secilenmode = BA.ObjectToString(_value);
 BA.debugLineNum = 108;BA.debugLine="If secilenMode = \"Rest Mode\" Then";
Debug.ShouldStop(2048);
if (RemoteObject.solveBoolean("=",surattestayar._secilenmode,BA.ObjectToString("Rest Mode"))) { 
 BA.debugLineNum = 109;BA.debugLine="SpinnerSet.Visible = True";
Debug.ShouldStop(4096);
surattestayar.mostCurrent._spinnerset.runMethod(true,"setVisible",surattestayar.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 110;BA.debugLine="LabelSet.Visible = True";
Debug.ShouldStop(8192);
surattestayar.mostCurrent._labelset.runMethod(true,"setVisible",surattestayar.mostCurrent.__c.getField(true,"True"));
 }else {
 BA.debugLineNum = 112;BA.debugLine="SpinnerSet.Visible = False";
Debug.ShouldStop(32768);
surattestayar.mostCurrent._spinnerset.runMethod(true,"setVisible",surattestayar.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 113;BA.debugLine="LabelSet.Visible = False";
Debug.ShouldStop(65536);
surattestayar.mostCurrent._labelset.runMethod(true,"setVisible",surattestayar.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 114;BA.debugLine="set = 1";
Debug.ShouldStop(131072);
surattestayar._set = BA.numberCast(int.class, 1);
 };
 BA.debugLineNum = 116;BA.debugLine="End Sub";
Debug.ShouldStop(524288);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _spinnerset_itemclick(RemoteObject _position,RemoteObject _value) throws Exception{
try {
		Debug.PushSubsStack("SpinnerSet_ItemClick (surattestayar) ","surattestayar",18,surattestayar.mostCurrent.activityBA,surattestayar.mostCurrent,239);
if (RapidSub.canDelegate("spinnerset_itemclick")) { return b4a.example3.surattestayar.remoteMe.runUserSub(false, "surattestayar","spinnerset_itemclick", _position, _value);}
Debug.locals.put("Position", _position);
Debug.locals.put("Value", _value);
 BA.debugLineNum = 239;BA.debugLine="Sub SpinnerSet_ItemClick (Position As Int, Value A";
Debug.ShouldStop(16384);
 BA.debugLineNum = 240;BA.debugLine="set = Value";
Debug.ShouldStop(32768);
surattestayar._set = BA.numberCast(int.class, _value);
 BA.debugLineNum = 241;BA.debugLine="End Sub";
Debug.ShouldStop(65536);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}