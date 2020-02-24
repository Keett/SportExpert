package b4a.example3;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class testmenu_subs_0 {


public static RemoteObject  _activity_create(RemoteObject _firsttime) throws Exception{
try {
		Debug.PushSubsStack("Activity_Create (testmenu) ","testmenu",25,testmenu.mostCurrent.activityBA,testmenu.mostCurrent,30);
if (RapidSub.canDelegate("activity_create")) { return b4a.example3.testmenu.remoteMe.runUserSub(false, "testmenu","activity_create", _firsttime);}
Debug.locals.put("FirstTime", _firsttime);
 BA.debugLineNum = 30;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
Debug.ShouldStop(536870912);
 BA.debugLineNum = 32;BA.debugLine="Activity.LoadLayout(\"TestMenuPage\")";
Debug.ShouldStop(-2147483648);
testmenu.mostCurrent._activity.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("TestMenuPage")),testmenu.mostCurrent.activityBA);
 BA.debugLineNum = 33;BA.debugLine="End Sub";
Debug.ShouldStop(1);
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
		Debug.PushSubsStack("Activity_Pause (testmenu) ","testmenu",25,testmenu.mostCurrent.activityBA,testmenu.mostCurrent,39);
if (RapidSub.canDelegate("activity_pause")) { return b4a.example3.testmenu.remoteMe.runUserSub(false, "testmenu","activity_pause", _userclosed);}
Debug.locals.put("UserClosed", _userclosed);
 BA.debugLineNum = 39;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
Debug.ShouldStop(64);
 BA.debugLineNum = 41;BA.debugLine="End Sub";
Debug.ShouldStop(256);
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
		Debug.PushSubsStack("Activity_Resume (testmenu) ","testmenu",25,testmenu.mostCurrent.activityBA,testmenu.mostCurrent,35);
if (RapidSub.canDelegate("activity_resume")) { return b4a.example3.testmenu.remoteMe.runUserSub(false, "testmenu","activity_resume");}
 BA.debugLineNum = 35;BA.debugLine="Sub Activity_Resume";
Debug.ShouldStop(4);
 BA.debugLineNum = 37;BA.debugLine="End Sub";
Debug.ShouldStop(16);
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
		Debug.PushSubsStack("ButtonAnasayfa_Click (testmenu) ","testmenu",25,testmenu.mostCurrent.activityBA,testmenu.mostCurrent,74);
if (RapidSub.canDelegate("buttonanasayfa_click")) { return b4a.example3.testmenu.remoteMe.runUserSub(false, "testmenu","buttonanasayfa_click");}
 BA.debugLineNum = 74;BA.debugLine="Sub ButtonAnasayfa_Click";
Debug.ShouldStop(512);
 BA.debugLineNum = 75;BA.debugLine="StartActivity(AnaMenu)";
Debug.ShouldStop(1024);
testmenu.mostCurrent.__c.runVoidMethod ("StartActivity",testmenu.processBA,(Object)((testmenu.mostCurrent._anamenu.getObject())));
 BA.debugLineNum = 76;BA.debugLine="Activity.Finish";
Debug.ShouldStop(2048);
testmenu.mostCurrent._activity.runVoidMethod ("Finish");
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
public static RemoteObject  _buttonantranorgorusleri_click() throws Exception{
try {
		Debug.PushSubsStack("ButtonAntranorGorusleri_Click (testmenu) ","testmenu",25,testmenu.mostCurrent.activityBA,testmenu.mostCurrent,64);
if (RapidSub.canDelegate("buttonantranorgorusleri_click")) { return b4a.example3.testmenu.remoteMe.runUserSub(false, "testmenu","buttonantranorgorusleri_click");}
 BA.debugLineNum = 64;BA.debugLine="Sub ButtonAntranorGorusleri_Click";
Debug.ShouldStop(-2147483648);
 BA.debugLineNum = 65;BA.debugLine="yapilacakTest = \"AntranorGorusleri\"";
Debug.ShouldStop(1);
testmenu._yapilacaktest = BA.ObjectToString("AntranorGorusleri");
 BA.debugLineNum = 66;BA.debugLine="StartActivity(AntranorGorusListele)";
Debug.ShouldStop(2);
testmenu.mostCurrent.__c.runVoidMethod ("StartActivity",testmenu.processBA,(Object)((testmenu.mostCurrent._antranorgoruslistele.getObject())));
 BA.debugLineNum = 67;BA.debugLine="End Sub";
Debug.ShouldStop(4);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _buttonantropometrik_click() throws Exception{
try {
		Debug.PushSubsStack("ButtonAntropometrik_Click (testmenu) ","testmenu",25,testmenu.mostCurrent.activityBA,testmenu.mostCurrent,43);
if (RapidSub.canDelegate("buttonantropometrik_click")) { return b4a.example3.testmenu.remoteMe.runUserSub(false, "testmenu","buttonantropometrik_click");}
 BA.debugLineNum = 43;BA.debugLine="Sub ButtonAntropometrik_Click";
Debug.ShouldStop(1024);
 BA.debugLineNum = 44;BA.debugLine="yapilacakTest = \"Antropometrik\"";
Debug.ShouldStop(2048);
testmenu._yapilacaktest = BA.ObjectToString("Antropometrik");
 BA.debugLineNum = 45;BA.debugLine="StartActivity(AntropometrikListele)";
Debug.ShouldStop(4096);
testmenu.mostCurrent.__c.runVoidMethod ("StartActivity",testmenu.processBA,(Object)((testmenu.mostCurrent._antropometriklistele.getObject())));
 BA.debugLineNum = 47;BA.debugLine="End Sub";
Debug.ShouldStop(16384);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _buttonbiyokimyasal_click() throws Exception{
try {
		Debug.PushSubsStack("ButtonBiyokimyasal_Click (testmenu) ","testmenu",25,testmenu.mostCurrent.activityBA,testmenu.mostCurrent,54);
if (RapidSub.canDelegate("buttonbiyokimyasal_click")) { return b4a.example3.testmenu.remoteMe.runUserSub(false, "testmenu","buttonbiyokimyasal_click");}
 BA.debugLineNum = 54;BA.debugLine="Sub ButtonBiyokimyasal_Click";
Debug.ShouldStop(2097152);
 BA.debugLineNum = 55;BA.debugLine="yapilacakTest = \"Biyokimyasal\"";
Debug.ShouldStop(4194304);
testmenu._yapilacaktest = BA.ObjectToString("Biyokimyasal");
 BA.debugLineNum = 56;BA.debugLine="StartActivity(BiyokimyasalListele)";
Debug.ShouldStop(8388608);
testmenu.mostCurrent.__c.runVoidMethod ("StartActivity",testmenu.processBA,(Object)((testmenu.mostCurrent._biyokimyasallistele.getObject())));
 BA.debugLineNum = 57;BA.debugLine="End Sub";
Debug.ShouldStop(16777216);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _buttonmotorozellik_click() throws Exception{
try {
		Debug.PushSubsStack("ButtonMotorOzellik_Click (testmenu) ","testmenu",25,testmenu.mostCurrent.activityBA,testmenu.mostCurrent,59);
if (RapidSub.canDelegate("buttonmotorozellik_click")) { return b4a.example3.testmenu.remoteMe.runUserSub(false, "testmenu","buttonmotorozellik_click");}
 BA.debugLineNum = 59;BA.debugLine="Sub ButtonMotorOzellik_Click";
Debug.ShouldStop(67108864);
 BA.debugLineNum = 60;BA.debugLine="yapilacakTest = \"MotorOzellik\"";
Debug.ShouldStop(134217728);
testmenu._yapilacaktest = BA.ObjectToString("MotorOzellik");
 BA.debugLineNum = 61;BA.debugLine="StartActivity(MotorOzellikMenu)";
Debug.ShouldStop(268435456);
testmenu.mostCurrent.__c.runVoidMethod ("StartActivity",testmenu.processBA,(Object)((testmenu.mostCurrent._motorozellikmenu.getObject())));
 BA.debugLineNum = 62;BA.debugLine="End Sub";
Debug.ShouldStop(536870912);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _buttonpsikolojik_click() throws Exception{
try {
		Debug.PushSubsStack("ButtonPsikolojik_Click (testmenu) ","testmenu",25,testmenu.mostCurrent.activityBA,testmenu.mostCurrent,49);
if (RapidSub.canDelegate("buttonpsikolojik_click")) { return b4a.example3.testmenu.remoteMe.runUserSub(false, "testmenu","buttonpsikolojik_click");}
 BA.debugLineNum = 49;BA.debugLine="Sub ButtonPsikolojik_Click";
Debug.ShouldStop(65536);
 BA.debugLineNum = 50;BA.debugLine="yapilacakTest = \"Psikolojik\"";
Debug.ShouldStop(131072);
testmenu._yapilacaktest = BA.ObjectToString("Psikolojik");
 BA.debugLineNum = 51;BA.debugLine="StartActivity(PsikolojikListele)";
Debug.ShouldStop(262144);
testmenu.mostCurrent.__c.runVoidMethod ("StartActivity",testmenu.processBA,(Object)((testmenu.mostCurrent._psikolojiklistele.getObject())));
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
public static RemoteObject  _buttonsaglikbilgileri_click() throws Exception{
try {
		Debug.PushSubsStack("ButtonSaglikBilgileri_Click (testmenu) ","testmenu",25,testmenu.mostCurrent.activityBA,testmenu.mostCurrent,69);
if (RapidSub.canDelegate("buttonsaglikbilgileri_click")) { return b4a.example3.testmenu.remoteMe.runUserSub(false, "testmenu","buttonsaglikbilgileri_click");}
 BA.debugLineNum = 69;BA.debugLine="Sub ButtonSaglikBilgileri_Click";
Debug.ShouldStop(16);
 BA.debugLineNum = 70;BA.debugLine="yapilacakTest = \"SaglikBilgileri\"";
Debug.ShouldStop(32);
testmenu._yapilacaktest = BA.ObjectToString("SaglikBilgileri");
 BA.debugLineNum = 71;BA.debugLine="StartActivity(SaglikBilgileriListele)";
Debug.ShouldStop(64);
testmenu.mostCurrent.__c.runVoidMethod ("StartActivity",testmenu.processBA,(Object)((testmenu.mostCurrent._saglikbilgilerilistele.getObject())));
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
public static RemoteObject  _globals() throws Exception{
 //BA.debugLineNum = 14;BA.debugLine="Sub Globals";
 //BA.debugLineNum = 19;BA.debugLine="Private ButtonAntropometrik As Button";
testmenu.mostCurrent._buttonantropometrik = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 20;BA.debugLine="Private ButtonPsikolojik As Button";
testmenu.mostCurrent._buttonpsikolojik = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 21;BA.debugLine="Private ButtonBiyokimyasal As Button";
testmenu.mostCurrent._buttonbiyokimyasal = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 22;BA.debugLine="Private ButtonMotorOzellik As Button";
testmenu.mostCurrent._buttonmotorozellik = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 23;BA.debugLine="Private ButtonSaglikBilgileri As Button";
testmenu.mostCurrent._buttonsaglikbilgileri = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 24;BA.debugLine="Private LabelSaglikBilgileri As Label";
testmenu.mostCurrent._labelsaglikbilgileri = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 25;BA.debugLine="Private ButtonAntranorGorusleri As Button";
testmenu.mostCurrent._buttonantranorgorusleri = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 26;BA.debugLine="Private LabelAntranorGorusleri As Label";
testmenu.mostCurrent._labelantranorgorusleri = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 27;BA.debugLine="Private ButtonAnasayfa As Button";
testmenu.mostCurrent._buttonanasayfa = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 28;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _process_globals() throws Exception{
 //BA.debugLineNum = 6;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 10;BA.debugLine="Dim yapilacakTest As String = \"\"";
testmenu._yapilacaktest = BA.ObjectToString("");
 //BA.debugLineNum = 12;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
}