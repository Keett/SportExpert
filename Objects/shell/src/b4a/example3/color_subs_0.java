package b4a.example3;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class color_subs_0 {


public static RemoteObject  _process_globals() throws Exception{
 //BA.debugLineNum = 3;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 7;BA.debugLine="Dim koyuMavi As Int = Colors.RGB(9,48,71)		'#0930";
color._koyumavi = color.mostCurrent.__c.getField(false,"Colors").runMethod(true,"RGB",(Object)(BA.numberCast(int.class, 9)),(Object)(BA.numberCast(int.class, 48)),(Object)(BA.numberCast(int.class, 71)));
 //BA.debugLineNum = 8;BA.debugLine="Dim acikMavi As Int = Colors.RGB(33,94,132)		'#21";
color._acikmavi = color.mostCurrent.__c.getField(false,"Colors").runMethod(true,"RGB",(Object)(BA.numberCast(int.class, 33)),(Object)(BA.numberCast(int.class, 94)),(Object)(BA.numberCast(int.class, 132)));
 //BA.debugLineNum = 9;BA.debugLine="Dim hintColor As Int = Colors.RGB(204,204,255)		'";
color._hintcolor = color.mostCurrent.__c.getField(false,"Colors").runMethod(true,"RGB",(Object)(BA.numberCast(int.class, 204)),(Object)(BA.numberCast(int.class, 204)),(Object)(BA.numberCast(int.class, 255)));
 //BA.debugLineNum = 13;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
}