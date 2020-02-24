package b4a.example3;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class programveri_subs_0 {


public static RemoteObject  _activity_create(RemoteObject _firsttime) throws Exception{
try {
		Debug.PushSubsStack("Activity_Create (programveri) ","programveri",12,programveri.mostCurrent.activityBA,programveri.mostCurrent,308);
if (RapidSub.canDelegate("activity_create")) { return b4a.example3.programveri.remoteMe.runUserSub(false, "programveri","activity_create", _firsttime);}
Debug.locals.put("FirstTime", _firsttime);
 BA.debugLineNum = 308;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
Debug.ShouldStop(524288);
 BA.debugLineNum = 310;BA.debugLine="Activity.LoadLayout(\"ProgramAyar1Page\")";
Debug.ShouldStop(2097152);
programveri.mostCurrent._activity.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("ProgramAyar1Page")),programveri.mostCurrent.activityBA);
 BA.debugLineNum = 312;BA.debugLine="ScrollView1.Panel.LoadLayout(\"ProgramVeriPage\")";
Debug.ShouldStop(8388608);
programveri.mostCurrent._scrollview1.runMethod(false,"getPanel").runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("ProgramVeriPage")),programveri.mostCurrent.activityBA);
 BA.debugLineNum = 313;BA.debugLine="ScrollView1.Panel.Width = 2000dip";
Debug.ShouldStop(16777216);
programveri.mostCurrent._scrollview1.runMethod(false,"getPanel").runMethod(true,"setWidth",programveri.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 2000))));
 BA.debugLineNum = 314;BA.debugLine="ScrollView1.Panel.Height = 2030dip";
Debug.ShouldStop(33554432);
programveri.mostCurrent._scrollview1.runMethod(false,"getPanel").runMethod(true,"setHeight",programveri.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 2030))));
 BA.debugLineNum = 316;BA.debugLine="levelPanelGoster";
Debug.ShouldStop(134217728);
_levelpanelgoster();
 BA.debugLineNum = 321;BA.debugLine="EditTextKoniMesafesi1.TextSize = 20";
Debug.ShouldStop(1);
programveri.mostCurrent._edittextkonimesafesi1.runMethod(true,"setTextSize",BA.numberCast(float.class, 20));
 BA.debugLineNum = 322;BA.debugLine="EditTextKoniMesafesi1.TextColor = Colors.White";
Debug.ShouldStop(2);
programveri.mostCurrent._edittextkonimesafesi1.runMethod(true,"setTextColor",programveri.mostCurrent.__c.getField(false,"Colors").getField(true,"White"));
 BA.debugLineNum = 323;BA.debugLine="EditTextKoniMesafesi1.Typeface = Typeface.DEFAULT";
Debug.ShouldStop(4);
programveri.mostCurrent._edittextkonimesafesi1.runMethod(false,"setTypeface",programveri.mostCurrent.__c.getField(false,"Typeface").getField(false,"DEFAULT"));
 BA.debugLineNum = 324;BA.debugLine="EditTextKoniMesafesi1.InputType = EditTextKoniMes";
Debug.ShouldStop(8);
programveri.mostCurrent._edittextkonimesafesi1.runMethod(true,"setInputType",programveri.mostCurrent._edittextkonimesafesi1.getField(true,"INPUT_TYPE_DECIMAL_NUMBERS"));
 BA.debugLineNum = 326;BA.debugLine="EditTextKoniMesafesi2.TextSize = 20";
Debug.ShouldStop(32);
programveri.mostCurrent._edittextkonimesafesi2.runMethod(true,"setTextSize",BA.numberCast(float.class, 20));
 BA.debugLineNum = 327;BA.debugLine="EditTextKoniMesafesi2.TextColor = Colors.White";
Debug.ShouldStop(64);
programveri.mostCurrent._edittextkonimesafesi2.runMethod(true,"setTextColor",programveri.mostCurrent.__c.getField(false,"Colors").getField(true,"White"));
 BA.debugLineNum = 328;BA.debugLine="EditTextKoniMesafesi2.Typeface = Typeface.DEFAULT";
Debug.ShouldStop(128);
programveri.mostCurrent._edittextkonimesafesi2.runMethod(false,"setTypeface",programveri.mostCurrent.__c.getField(false,"Typeface").getField(false,"DEFAULT"));
 BA.debugLineNum = 329;BA.debugLine="EditTextKoniMesafesi2.InputType = EditTextKoniMes";
Debug.ShouldStop(256);
programveri.mostCurrent._edittextkonimesafesi2.runMethod(true,"setInputType",programveri.mostCurrent._edittextkonimesafesi2.getField(true,"INPUT_TYPE_DECIMAL_NUMBERS"));
 BA.debugLineNum = 331;BA.debugLine="EditTextKoniMesafesi3.TextSize = 20";
Debug.ShouldStop(1024);
programveri.mostCurrent._edittextkonimesafesi3.runMethod(true,"setTextSize",BA.numberCast(float.class, 20));
 BA.debugLineNum = 332;BA.debugLine="EditTextKoniMesafesi3.TextColor = Colors.White";
Debug.ShouldStop(2048);
programveri.mostCurrent._edittextkonimesafesi3.runMethod(true,"setTextColor",programveri.mostCurrent.__c.getField(false,"Colors").getField(true,"White"));
 BA.debugLineNum = 333;BA.debugLine="EditTextKoniMesafesi3.Typeface = Typeface.DEFAULT";
Debug.ShouldStop(4096);
programveri.mostCurrent._edittextkonimesafesi3.runMethod(false,"setTypeface",programveri.mostCurrent.__c.getField(false,"Typeface").getField(false,"DEFAULT"));
 BA.debugLineNum = 334;BA.debugLine="EditTextKoniMesafesi3.InputType = EditTextKoniMes";
Debug.ShouldStop(8192);
programveri.mostCurrent._edittextkonimesafesi3.runMethod(true,"setInputType",programveri.mostCurrent._edittextkonimesafesi3.getField(true,"INPUT_TYPE_DECIMAL_NUMBERS"));
 BA.debugLineNum = 336;BA.debugLine="EditTextKoniMesafesi4.TextSize = 20";
Debug.ShouldStop(32768);
programveri.mostCurrent._edittextkonimesafesi4.runMethod(true,"setTextSize",BA.numberCast(float.class, 20));
 BA.debugLineNum = 337;BA.debugLine="EditTextKoniMesafesi4.TextColor = Colors.White";
Debug.ShouldStop(65536);
programveri.mostCurrent._edittextkonimesafesi4.runMethod(true,"setTextColor",programveri.mostCurrent.__c.getField(false,"Colors").getField(true,"White"));
 BA.debugLineNum = 338;BA.debugLine="EditTextKoniMesafesi4.Typeface = Typeface.DEFAULT";
Debug.ShouldStop(131072);
programveri.mostCurrent._edittextkonimesafesi4.runMethod(false,"setTypeface",programveri.mostCurrent.__c.getField(false,"Typeface").getField(false,"DEFAULT"));
 BA.debugLineNum = 339;BA.debugLine="EditTextKoniMesafesi4.InputType = EditTextKoniMes";
Debug.ShouldStop(262144);
programveri.mostCurrent._edittextkonimesafesi4.runMethod(true,"setInputType",programveri.mostCurrent._edittextkonimesafesi4.getField(true,"INPUT_TYPE_DECIMAL_NUMBERS"));
 BA.debugLineNum = 341;BA.debugLine="EditTextKoniMesafesi5.TextSize = 20";
Debug.ShouldStop(1048576);
programveri.mostCurrent._edittextkonimesafesi5.runMethod(true,"setTextSize",BA.numberCast(float.class, 20));
 BA.debugLineNum = 342;BA.debugLine="EditTextKoniMesafesi5.TextColor = Colors.White";
Debug.ShouldStop(2097152);
programveri.mostCurrent._edittextkonimesafesi5.runMethod(true,"setTextColor",programveri.mostCurrent.__c.getField(false,"Colors").getField(true,"White"));
 BA.debugLineNum = 343;BA.debugLine="EditTextKoniMesafesi5.Typeface = Typeface.DEFAULT";
Debug.ShouldStop(4194304);
programveri.mostCurrent._edittextkonimesafesi5.runMethod(false,"setTypeface",programveri.mostCurrent.__c.getField(false,"Typeface").getField(false,"DEFAULT"));
 BA.debugLineNum = 344;BA.debugLine="EditTextKoniMesafesi5.InputType = EditTextKoniMes";
Debug.ShouldStop(8388608);
programveri.mostCurrent._edittextkonimesafesi5.runMethod(true,"setInputType",programveri.mostCurrent._edittextkonimesafesi5.getField(true,"INPUT_TYPE_DECIMAL_NUMBERS"));
 BA.debugLineNum = 346;BA.debugLine="EditTextKoniMesafesi6.TextSize = 20";
Debug.ShouldStop(33554432);
programveri.mostCurrent._edittextkonimesafesi6.runMethod(true,"setTextSize",BA.numberCast(float.class, 20));
 BA.debugLineNum = 347;BA.debugLine="EditTextKoniMesafesi6.TextColor = Colors.White";
Debug.ShouldStop(67108864);
programveri.mostCurrent._edittextkonimesafesi6.runMethod(true,"setTextColor",programveri.mostCurrent.__c.getField(false,"Colors").getField(true,"White"));
 BA.debugLineNum = 348;BA.debugLine="EditTextKoniMesafesi6.Typeface = Typeface.DEFAULT";
Debug.ShouldStop(134217728);
programveri.mostCurrent._edittextkonimesafesi6.runMethod(false,"setTypeface",programveri.mostCurrent.__c.getField(false,"Typeface").getField(false,"DEFAULT"));
 BA.debugLineNum = 349;BA.debugLine="EditTextKoniMesafesi6.InputType = EditTextKoniMes";
Debug.ShouldStop(268435456);
programveri.mostCurrent._edittextkonimesafesi6.runMethod(true,"setInputType",programveri.mostCurrent._edittextkonimesafesi6.getField(true,"INPUT_TYPE_DECIMAL_NUMBERS"));
 BA.debugLineNum = 351;BA.debugLine="EditTextKoniMesafesi7.TextSize = 20";
Debug.ShouldStop(1073741824);
programveri.mostCurrent._edittextkonimesafesi7.runMethod(true,"setTextSize",BA.numberCast(float.class, 20));
 BA.debugLineNum = 352;BA.debugLine="EditTextKoniMesafesi7.TextColor = Colors.White";
Debug.ShouldStop(-2147483648);
programveri.mostCurrent._edittextkonimesafesi7.runMethod(true,"setTextColor",programveri.mostCurrent.__c.getField(false,"Colors").getField(true,"White"));
 BA.debugLineNum = 353;BA.debugLine="EditTextKoniMesafesi7.Typeface = Typeface.DEFAULT";
Debug.ShouldStop(1);
programveri.mostCurrent._edittextkonimesafesi7.runMethod(false,"setTypeface",programveri.mostCurrent.__c.getField(false,"Typeface").getField(false,"DEFAULT"));
 BA.debugLineNum = 354;BA.debugLine="EditTextKoniMesafesi7.InputType = EditTextKoniMes";
Debug.ShouldStop(2);
programveri.mostCurrent._edittextkonimesafesi7.runMethod(true,"setInputType",programveri.mostCurrent._edittextkonimesafesi7.getField(true,"INPUT_TYPE_DECIMAL_NUMBERS"));
 BA.debugLineNum = 356;BA.debugLine="EditTextKoniMesafesi8.TextSize = 20";
Debug.ShouldStop(8);
programveri.mostCurrent._edittextkonimesafesi8.runMethod(true,"setTextSize",BA.numberCast(float.class, 20));
 BA.debugLineNum = 357;BA.debugLine="EditTextKoniMesafesi8.TextColor = Colors.White";
Debug.ShouldStop(16);
programveri.mostCurrent._edittextkonimesafesi8.runMethod(true,"setTextColor",programveri.mostCurrent.__c.getField(false,"Colors").getField(true,"White"));
 BA.debugLineNum = 358;BA.debugLine="EditTextKoniMesafesi8.Typeface = Typeface.DEFAULT";
Debug.ShouldStop(32);
programveri.mostCurrent._edittextkonimesafesi8.runMethod(false,"setTypeface",programveri.mostCurrent.__c.getField(false,"Typeface").getField(false,"DEFAULT"));
 BA.debugLineNum = 359;BA.debugLine="EditTextKoniMesafesi8.InputType = EditTextKoniMes";
Debug.ShouldStop(64);
programveri.mostCurrent._edittextkonimesafesi8.runMethod(true,"setInputType",programveri.mostCurrent._edittextkonimesafesi8.getField(true,"INPUT_TYPE_DECIMAL_NUMBERS"));
 BA.debugLineNum = 361;BA.debugLine="EditTextKoniMesafesi9.TextSize = 20";
Debug.ShouldStop(256);
programveri.mostCurrent._edittextkonimesafesi9.runMethod(true,"setTextSize",BA.numberCast(float.class, 20));
 BA.debugLineNum = 362;BA.debugLine="EditTextKoniMesafesi9.TextColor = Colors.White";
Debug.ShouldStop(512);
programveri.mostCurrent._edittextkonimesafesi9.runMethod(true,"setTextColor",programveri.mostCurrent.__c.getField(false,"Colors").getField(true,"White"));
 BA.debugLineNum = 363;BA.debugLine="EditTextKoniMesafesi9.Typeface = Typeface.DEFAULT";
Debug.ShouldStop(1024);
programveri.mostCurrent._edittextkonimesafesi9.runMethod(false,"setTypeface",programveri.mostCurrent.__c.getField(false,"Typeface").getField(false,"DEFAULT"));
 BA.debugLineNum = 364;BA.debugLine="EditTextKoniMesafesi9.InputType = EditTextKoniMes";
Debug.ShouldStop(2048);
programveri.mostCurrent._edittextkonimesafesi9.runMethod(true,"setInputType",programveri.mostCurrent._edittextkonimesafesi9.getField(true,"INPUT_TYPE_DECIMAL_NUMBERS"));
 BA.debugLineNum = 366;BA.debugLine="EditTextKoniMesafesi10.TextSize = 20";
Debug.ShouldStop(8192);
programveri.mostCurrent._edittextkonimesafesi10.runMethod(true,"setTextSize",BA.numberCast(float.class, 20));
 BA.debugLineNum = 367;BA.debugLine="EditTextKoniMesafesi10.TextColor = Colors.White";
Debug.ShouldStop(16384);
programveri.mostCurrent._edittextkonimesafesi10.runMethod(true,"setTextColor",programveri.mostCurrent.__c.getField(false,"Colors").getField(true,"White"));
 BA.debugLineNum = 368;BA.debugLine="EditTextKoniMesafesi10.Typeface = Typeface.DEFAUL";
Debug.ShouldStop(32768);
programveri.mostCurrent._edittextkonimesafesi10.runMethod(false,"setTypeface",programveri.mostCurrent.__c.getField(false,"Typeface").getField(false,"DEFAULT"));
 BA.debugLineNum = 369;BA.debugLine="EditTextKoniMesafesi10.InputType = EditTextKoniMe";
Debug.ShouldStop(65536);
programveri.mostCurrent._edittextkonimesafesi10.runMethod(true,"setInputType",programveri.mostCurrent._edittextkonimesafesi10.getField(true,"INPUT_TYPE_DECIMAL_NUMBERS"));
 BA.debugLineNum = 371;BA.debugLine="EditTextKoniMesafesi11.TextSize = 20";
Debug.ShouldStop(262144);
programveri.mostCurrent._edittextkonimesafesi11.runMethod(true,"setTextSize",BA.numberCast(float.class, 20));
 BA.debugLineNum = 372;BA.debugLine="EditTextKoniMesafesi11.TextColor = Colors.White";
Debug.ShouldStop(524288);
programveri.mostCurrent._edittextkonimesafesi11.runMethod(true,"setTextColor",programveri.mostCurrent.__c.getField(false,"Colors").getField(true,"White"));
 BA.debugLineNum = 373;BA.debugLine="EditTextKoniMesafesi11.Typeface = Typeface.DEFAUL";
Debug.ShouldStop(1048576);
programveri.mostCurrent._edittextkonimesafesi11.runMethod(false,"setTypeface",programveri.mostCurrent.__c.getField(false,"Typeface").getField(false,"DEFAULT"));
 BA.debugLineNum = 374;BA.debugLine="EditTextKoniMesafesi11.InputType = EditTextKoniMe";
Debug.ShouldStop(2097152);
programveri.mostCurrent._edittextkonimesafesi11.runMethod(true,"setInputType",programveri.mostCurrent._edittextkonimesafesi11.getField(true,"INPUT_TYPE_DECIMAL_NUMBERS"));
 BA.debugLineNum = 376;BA.debugLine="EditTextKoniMesafesi12.TextSize = 20";
Debug.ShouldStop(8388608);
programveri.mostCurrent._edittextkonimesafesi12.runMethod(true,"setTextSize",BA.numberCast(float.class, 20));
 BA.debugLineNum = 377;BA.debugLine="EditTextKoniMesafesi12.TextColor = Colors.White";
Debug.ShouldStop(16777216);
programveri.mostCurrent._edittextkonimesafesi12.runMethod(true,"setTextColor",programveri.mostCurrent.__c.getField(false,"Colors").getField(true,"White"));
 BA.debugLineNum = 378;BA.debugLine="EditTextKoniMesafesi12.Typeface = Typeface.DEFAUL";
Debug.ShouldStop(33554432);
programveri.mostCurrent._edittextkonimesafesi12.runMethod(false,"setTypeface",programveri.mostCurrent.__c.getField(false,"Typeface").getField(false,"DEFAULT"));
 BA.debugLineNum = 379;BA.debugLine="EditTextKoniMesafesi12.InputType = EditTextKoniMe";
Debug.ShouldStop(67108864);
programveri.mostCurrent._edittextkonimesafesi12.runMethod(true,"setInputType",programveri.mostCurrent._edittextkonimesafesi12.getField(true,"INPUT_TYPE_DECIMAL_NUMBERS"));
 BA.debugLineNum = 381;BA.debugLine="EditTextKoniMesafesi13.TextSize = 20";
Debug.ShouldStop(268435456);
programveri.mostCurrent._edittextkonimesafesi13.runMethod(true,"setTextSize",BA.numberCast(float.class, 20));
 BA.debugLineNum = 382;BA.debugLine="EditTextKoniMesafesi13.TextColor = Colors.White";
Debug.ShouldStop(536870912);
programveri.mostCurrent._edittextkonimesafesi13.runMethod(true,"setTextColor",programveri.mostCurrent.__c.getField(false,"Colors").getField(true,"White"));
 BA.debugLineNum = 383;BA.debugLine="EditTextKoniMesafesi13.Typeface = Typeface.DEFAUL";
Debug.ShouldStop(1073741824);
programveri.mostCurrent._edittextkonimesafesi13.runMethod(false,"setTypeface",programveri.mostCurrent.__c.getField(false,"Typeface").getField(false,"DEFAULT"));
 BA.debugLineNum = 384;BA.debugLine="EditTextKoniMesafesi13.InputType = EditTextKoniMe";
Debug.ShouldStop(-2147483648);
programveri.mostCurrent._edittextkonimesafesi13.runMethod(true,"setInputType",programveri.mostCurrent._edittextkonimesafesi13.getField(true,"INPUT_TYPE_DECIMAL_NUMBERS"));
 BA.debugLineNum = 386;BA.debugLine="EditTextKoniMesafesi14.TextSize = 20";
Debug.ShouldStop(2);
programveri.mostCurrent._edittextkonimesafesi14.runMethod(true,"setTextSize",BA.numberCast(float.class, 20));
 BA.debugLineNum = 387;BA.debugLine="EditTextKoniMesafesi14.TextColor = Colors.White";
Debug.ShouldStop(4);
programveri.mostCurrent._edittextkonimesafesi14.runMethod(true,"setTextColor",programveri.mostCurrent.__c.getField(false,"Colors").getField(true,"White"));
 BA.debugLineNum = 388;BA.debugLine="EditTextKoniMesafesi14.Typeface = Typeface.DEFAUL";
Debug.ShouldStop(8);
programveri.mostCurrent._edittextkonimesafesi14.runMethod(false,"setTypeface",programveri.mostCurrent.__c.getField(false,"Typeface").getField(false,"DEFAULT"));
 BA.debugLineNum = 389;BA.debugLine="EditTextKoniMesafesi14.InputType = EditTextKoniMe";
Debug.ShouldStop(16);
programveri.mostCurrent._edittextkonimesafesi14.runMethod(true,"setInputType",programveri.mostCurrent._edittextkonimesafesi14.getField(true,"INPUT_TYPE_DECIMAL_NUMBERS"));
 BA.debugLineNum = 391;BA.debugLine="EditTextKoniMesafesi15.TextSize = 20";
Debug.ShouldStop(64);
programveri.mostCurrent._edittextkonimesafesi15.runMethod(true,"setTextSize",BA.numberCast(float.class, 20));
 BA.debugLineNum = 392;BA.debugLine="EditTextKoniMesafesi15.TextColor = Colors.White";
Debug.ShouldStop(128);
programveri.mostCurrent._edittextkonimesafesi15.runMethod(true,"setTextColor",programveri.mostCurrent.__c.getField(false,"Colors").getField(true,"White"));
 BA.debugLineNum = 393;BA.debugLine="EditTextKoniMesafesi15.Typeface = Typeface.DEFAUL";
Debug.ShouldStop(256);
programveri.mostCurrent._edittextkonimesafesi15.runMethod(false,"setTypeface",programveri.mostCurrent.__c.getField(false,"Typeface").getField(false,"DEFAULT"));
 BA.debugLineNum = 394;BA.debugLine="EditTextKoniMesafesi15.InputType = EditTextKoniMe";
Debug.ShouldStop(512);
programveri.mostCurrent._edittextkonimesafesi15.runMethod(true,"setInputType",programveri.mostCurrent._edittextkonimesafesi15.getField(true,"INPUT_TYPE_DECIMAL_NUMBERS"));
 BA.debugLineNum = 396;BA.debugLine="EditTextKoniMesafesi16.TextSize = 20";
Debug.ShouldStop(2048);
programveri.mostCurrent._edittextkonimesafesi16.runMethod(true,"setTextSize",BA.numberCast(float.class, 20));
 BA.debugLineNum = 397;BA.debugLine="EditTextKoniMesafesi16.TextColor = Colors.White";
Debug.ShouldStop(4096);
programveri.mostCurrent._edittextkonimesafesi16.runMethod(true,"setTextColor",programveri.mostCurrent.__c.getField(false,"Colors").getField(true,"White"));
 BA.debugLineNum = 398;BA.debugLine="EditTextKoniMesafesi16.Typeface = Typeface.DEFAUL";
Debug.ShouldStop(8192);
programveri.mostCurrent._edittextkonimesafesi16.runMethod(false,"setTypeface",programveri.mostCurrent.__c.getField(false,"Typeface").getField(false,"DEFAULT"));
 BA.debugLineNum = 399;BA.debugLine="EditTextKoniMesafesi16.InputType = EditTextKoniMe";
Debug.ShouldStop(16384);
programveri.mostCurrent._edittextkonimesafesi16.runMethod(true,"setInputType",programveri.mostCurrent._edittextkonimesafesi16.getField(true,"INPUT_TYPE_DECIMAL_NUMBERS"));
 BA.debugLineNum = 401;BA.debugLine="EditTextKoniMesafesi17.TextSize = 20";
Debug.ShouldStop(65536);
programveri.mostCurrent._edittextkonimesafesi17.runMethod(true,"setTextSize",BA.numberCast(float.class, 20));
 BA.debugLineNum = 402;BA.debugLine="EditTextKoniMesafesi17.TextColor = Colors.White";
Debug.ShouldStop(131072);
programveri.mostCurrent._edittextkonimesafesi17.runMethod(true,"setTextColor",programveri.mostCurrent.__c.getField(false,"Colors").getField(true,"White"));
 BA.debugLineNum = 403;BA.debugLine="EditTextKoniMesafesi17.Typeface = Typeface.DEFAUL";
Debug.ShouldStop(262144);
programveri.mostCurrent._edittextkonimesafesi17.runMethod(false,"setTypeface",programveri.mostCurrent.__c.getField(false,"Typeface").getField(false,"DEFAULT"));
 BA.debugLineNum = 404;BA.debugLine="EditTextKoniMesafesi17.InputType = EditTextKoniMe";
Debug.ShouldStop(524288);
programveri.mostCurrent._edittextkonimesafesi17.runMethod(true,"setInputType",programveri.mostCurrent._edittextkonimesafesi17.getField(true,"INPUT_TYPE_DECIMAL_NUMBERS"));
 BA.debugLineNum = 406;BA.debugLine="EditTextKoniMesafesi18.TextSize = 20";
Debug.ShouldStop(2097152);
programveri.mostCurrent._edittextkonimesafesi18.runMethod(true,"setTextSize",BA.numberCast(float.class, 20));
 BA.debugLineNum = 407;BA.debugLine="EditTextKoniMesafesi18.TextColor = Colors.White";
Debug.ShouldStop(4194304);
programveri.mostCurrent._edittextkonimesafesi18.runMethod(true,"setTextColor",programveri.mostCurrent.__c.getField(false,"Colors").getField(true,"White"));
 BA.debugLineNum = 408;BA.debugLine="EditTextKoniMesafesi18.Typeface = Typeface.DEFAUL";
Debug.ShouldStop(8388608);
programveri.mostCurrent._edittextkonimesafesi18.runMethod(false,"setTypeface",programveri.mostCurrent.__c.getField(false,"Typeface").getField(false,"DEFAULT"));
 BA.debugLineNum = 409;BA.debugLine="EditTextKoniMesafesi18.InputType = EditTextKoniMe";
Debug.ShouldStop(16777216);
programveri.mostCurrent._edittextkonimesafesi18.runMethod(true,"setInputType",programveri.mostCurrent._edittextkonimesafesi18.getField(true,"INPUT_TYPE_DECIMAL_NUMBERS"));
 BA.debugLineNum = 411;BA.debugLine="EditTextKoniMesafesi19.TextSize = 20";
Debug.ShouldStop(67108864);
programveri.mostCurrent._edittextkonimesafesi19.runMethod(true,"setTextSize",BA.numberCast(float.class, 20));
 BA.debugLineNum = 412;BA.debugLine="EditTextKoniMesafesi19.TextColor = Colors.White";
Debug.ShouldStop(134217728);
programveri.mostCurrent._edittextkonimesafesi19.runMethod(true,"setTextColor",programveri.mostCurrent.__c.getField(false,"Colors").getField(true,"White"));
 BA.debugLineNum = 413;BA.debugLine="EditTextKoniMesafesi19.Typeface = Typeface.DEFAUL";
Debug.ShouldStop(268435456);
programveri.mostCurrent._edittextkonimesafesi19.runMethod(false,"setTypeface",programveri.mostCurrent.__c.getField(false,"Typeface").getField(false,"DEFAULT"));
 BA.debugLineNum = 414;BA.debugLine="EditTextKoniMesafesi19.InputType = EditTextKoniMe";
Debug.ShouldStop(536870912);
programveri.mostCurrent._edittextkonimesafesi19.runMethod(true,"setInputType",programveri.mostCurrent._edittextkonimesafesi19.getField(true,"INPUT_TYPE_DECIMAL_NUMBERS"));
 BA.debugLineNum = 416;BA.debugLine="EditTextKoniMesafesi20.TextSize = 20";
Debug.ShouldStop(-2147483648);
programveri.mostCurrent._edittextkonimesafesi20.runMethod(true,"setTextSize",BA.numberCast(float.class, 20));
 BA.debugLineNum = 417;BA.debugLine="EditTextKoniMesafesi20.TextColor = Colors.White";
Debug.ShouldStop(1);
programveri.mostCurrent._edittextkonimesafesi20.runMethod(true,"setTextColor",programveri.mostCurrent.__c.getField(false,"Colors").getField(true,"White"));
 BA.debugLineNum = 418;BA.debugLine="EditTextKoniMesafesi20.Typeface = Typeface.DEFAUL";
Debug.ShouldStop(2);
programveri.mostCurrent._edittextkonimesafesi20.runMethod(false,"setTypeface",programveri.mostCurrent.__c.getField(false,"Typeface").getField(false,"DEFAULT"));
 BA.debugLineNum = 419;BA.debugLine="EditTextKoniMesafesi20.InputType = EditTextKoniMe";
Debug.ShouldStop(4);
programveri.mostCurrent._edittextkonimesafesi20.runMethod(true,"setInputType",programveri.mostCurrent._edittextkonimesafesi20.getField(true,"INPUT_TYPE_DECIMAL_NUMBERS"));
 BA.debugLineNum = 421;BA.debugLine="EditTextKoniMesafesi21.TextSize = 20";
Debug.ShouldStop(16);
programveri.mostCurrent._edittextkonimesafesi21.runMethod(true,"setTextSize",BA.numberCast(float.class, 20));
 BA.debugLineNum = 422;BA.debugLine="EditTextKoniMesafesi21.TextColor = Colors.White";
Debug.ShouldStop(32);
programveri.mostCurrent._edittextkonimesafesi21.runMethod(true,"setTextColor",programveri.mostCurrent.__c.getField(false,"Colors").getField(true,"White"));
 BA.debugLineNum = 423;BA.debugLine="EditTextKoniMesafesi21.Typeface = Typeface.DEFAUL";
Debug.ShouldStop(64);
programveri.mostCurrent._edittextkonimesafesi21.runMethod(false,"setTypeface",programveri.mostCurrent.__c.getField(false,"Typeface").getField(false,"DEFAULT"));
 BA.debugLineNum = 424;BA.debugLine="EditTextKoniMesafesi21.InputType = EditTextKoniMe";
Debug.ShouldStop(128);
programveri.mostCurrent._edittextkonimesafesi21.runMethod(true,"setInputType",programveri.mostCurrent._edittextkonimesafesi21.getField(true,"INPUT_TYPE_DECIMAL_NUMBERS"));
 BA.debugLineNum = 426;BA.debugLine="EditTextKoniMesafesi22.TextSize = 20";
Debug.ShouldStop(512);
programveri.mostCurrent._edittextkonimesafesi22.runMethod(true,"setTextSize",BA.numberCast(float.class, 20));
 BA.debugLineNum = 427;BA.debugLine="EditTextKoniMesafesi22.TextColor = Colors.White";
Debug.ShouldStop(1024);
programveri.mostCurrent._edittextkonimesafesi22.runMethod(true,"setTextColor",programveri.mostCurrent.__c.getField(false,"Colors").getField(true,"White"));
 BA.debugLineNum = 428;BA.debugLine="EditTextKoniMesafesi22.Typeface = Typeface.DEFAUL";
Debug.ShouldStop(2048);
programveri.mostCurrent._edittextkonimesafesi22.runMethod(false,"setTypeface",programveri.mostCurrent.__c.getField(false,"Typeface").getField(false,"DEFAULT"));
 BA.debugLineNum = 429;BA.debugLine="EditTextKoniMesafesi22.InputType = EditTextKoniMe";
Debug.ShouldStop(4096);
programveri.mostCurrent._edittextkonimesafesi22.runMethod(true,"setInputType",programveri.mostCurrent._edittextkonimesafesi22.getField(true,"INPUT_TYPE_DECIMAL_NUMBERS"));
 BA.debugLineNum = 431;BA.debugLine="EditTextKoniMesafesi23.TextSize = 20";
Debug.ShouldStop(16384);
programveri.mostCurrent._edittextkonimesafesi23.runMethod(true,"setTextSize",BA.numberCast(float.class, 20));
 BA.debugLineNum = 432;BA.debugLine="EditTextKoniMesafesi23.TextColor = Colors.White";
Debug.ShouldStop(32768);
programveri.mostCurrent._edittextkonimesafesi23.runMethod(true,"setTextColor",programveri.mostCurrent.__c.getField(false,"Colors").getField(true,"White"));
 BA.debugLineNum = 433;BA.debugLine="EditTextKoniMesafesi23.Typeface = Typeface.DEFAUL";
Debug.ShouldStop(65536);
programveri.mostCurrent._edittextkonimesafesi23.runMethod(false,"setTypeface",programveri.mostCurrent.__c.getField(false,"Typeface").getField(false,"DEFAULT"));
 BA.debugLineNum = 434;BA.debugLine="EditTextKoniMesafesi23.InputType = EditTextKoniMe";
Debug.ShouldStop(131072);
programveri.mostCurrent._edittextkonimesafesi23.runMethod(true,"setInputType",programveri.mostCurrent._edittextkonimesafesi23.getField(true,"INPUT_TYPE_DECIMAL_NUMBERS"));
 BA.debugLineNum = 436;BA.debugLine="EditTextKoniMesafesi24.TextSize = 20";
Debug.ShouldStop(524288);
programveri.mostCurrent._edittextkonimesafesi24.runMethod(true,"setTextSize",BA.numberCast(float.class, 20));
 BA.debugLineNum = 437;BA.debugLine="EditTextKoniMesafesi24.TextColor = Colors.White";
Debug.ShouldStop(1048576);
programveri.mostCurrent._edittextkonimesafesi24.runMethod(true,"setTextColor",programveri.mostCurrent.__c.getField(false,"Colors").getField(true,"White"));
 BA.debugLineNum = 438;BA.debugLine="EditTextKoniMesafesi24.Typeface = Typeface.DEFAUL";
Debug.ShouldStop(2097152);
programveri.mostCurrent._edittextkonimesafesi24.runMethod(false,"setTypeface",programveri.mostCurrent.__c.getField(false,"Typeface").getField(false,"DEFAULT"));
 BA.debugLineNum = 439;BA.debugLine="EditTextKoniMesafesi24.InputType = EditTextKoniMe";
Debug.ShouldStop(4194304);
programveri.mostCurrent._edittextkonimesafesi24.runMethod(true,"setInputType",programveri.mostCurrent._edittextkonimesafesi24.getField(true,"INPUT_TYPE_DECIMAL_NUMBERS"));
 BA.debugLineNum = 441;BA.debugLine="EditTextKoniMesafesi25.TextSize = 20";
Debug.ShouldStop(16777216);
programveri.mostCurrent._edittextkonimesafesi25.runMethod(true,"setTextSize",BA.numberCast(float.class, 20));
 BA.debugLineNum = 442;BA.debugLine="EditTextKoniMesafesi25.TextColor = Colors.White";
Debug.ShouldStop(33554432);
programveri.mostCurrent._edittextkonimesafesi25.runMethod(true,"setTextColor",programveri.mostCurrent.__c.getField(false,"Colors").getField(true,"White"));
 BA.debugLineNum = 443;BA.debugLine="EditTextKoniMesafesi25.Typeface = Typeface.DEFAUL";
Debug.ShouldStop(67108864);
programveri.mostCurrent._edittextkonimesafesi25.runMethod(false,"setTypeface",programveri.mostCurrent.__c.getField(false,"Typeface").getField(false,"DEFAULT"));
 BA.debugLineNum = 444;BA.debugLine="EditTextKoniMesafesi25.InputType = EditTextKoniMe";
Debug.ShouldStop(134217728);
programveri.mostCurrent._edittextkonimesafesi25.runMethod(true,"setInputType",programveri.mostCurrent._edittextkonimesafesi25.getField(true,"INPUT_TYPE_DECIMAL_NUMBERS"));
 BA.debugLineNum = 449;BA.debugLine="EditTextDakika1.TextSize = 20";
Debug.ShouldStop(1);
programveri.mostCurrent._edittextdakika1.runMethod(true,"setTextSize",BA.numberCast(float.class, 20));
 BA.debugLineNum = 450;BA.debugLine="EditTextDakika1.TextColor = Colors.White";
Debug.ShouldStop(2);
programveri.mostCurrent._edittextdakika1.runMethod(true,"setTextColor",programveri.mostCurrent.__c.getField(false,"Colors").getField(true,"White"));
 BA.debugLineNum = 451;BA.debugLine="EditTextDakika1.Typeface = Typeface.DEFAULT";
Debug.ShouldStop(4);
programveri.mostCurrent._edittextdakika1.runMethod(false,"setTypeface",programveri.mostCurrent.__c.getField(false,"Typeface").getField(false,"DEFAULT"));
 BA.debugLineNum = 452;BA.debugLine="EditTextDakika1.InputType = EditTextDakika1.INPUT";
Debug.ShouldStop(8);
programveri.mostCurrent._edittextdakika1.runMethod(true,"setInputType",programveri.mostCurrent._edittextdakika1.getField(true,"INPUT_TYPE_NUMBERS"));
 BA.debugLineNum = 454;BA.debugLine="EditTextDakika2.TextSize = 20";
Debug.ShouldStop(32);
programveri.mostCurrent._edittextdakika2.runMethod(true,"setTextSize",BA.numberCast(float.class, 20));
 BA.debugLineNum = 455;BA.debugLine="EditTextDakika2.TextColor = Colors.White";
Debug.ShouldStop(64);
programveri.mostCurrent._edittextdakika2.runMethod(true,"setTextColor",programveri.mostCurrent.__c.getField(false,"Colors").getField(true,"White"));
 BA.debugLineNum = 456;BA.debugLine="EditTextDakika2.Typeface = Typeface.DEFAULT";
Debug.ShouldStop(128);
programveri.mostCurrent._edittextdakika2.runMethod(false,"setTypeface",programveri.mostCurrent.__c.getField(false,"Typeface").getField(false,"DEFAULT"));
 BA.debugLineNum = 457;BA.debugLine="EditTextDakika2.InputType = EditTextDakika2.INPUT";
Debug.ShouldStop(256);
programveri.mostCurrent._edittextdakika2.runMethod(true,"setInputType",programveri.mostCurrent._edittextdakika2.getField(true,"INPUT_TYPE_NUMBERS"));
 BA.debugLineNum = 459;BA.debugLine="EditTextDakika3.TextSize = 20";
Debug.ShouldStop(1024);
programveri.mostCurrent._edittextdakika3.runMethod(true,"setTextSize",BA.numberCast(float.class, 20));
 BA.debugLineNum = 460;BA.debugLine="EditTextDakika3.TextColor = Colors.White";
Debug.ShouldStop(2048);
programveri.mostCurrent._edittextdakika3.runMethod(true,"setTextColor",programveri.mostCurrent.__c.getField(false,"Colors").getField(true,"White"));
 BA.debugLineNum = 461;BA.debugLine="EditTextDakika3.Typeface = Typeface.DEFAULT";
Debug.ShouldStop(4096);
programveri.mostCurrent._edittextdakika3.runMethod(false,"setTypeface",programveri.mostCurrent.__c.getField(false,"Typeface").getField(false,"DEFAULT"));
 BA.debugLineNum = 462;BA.debugLine="EditTextDakika3.InputType = EditTextDakika3.INPUT";
Debug.ShouldStop(8192);
programveri.mostCurrent._edittextdakika3.runMethod(true,"setInputType",programveri.mostCurrent._edittextdakika3.getField(true,"INPUT_TYPE_NUMBERS"));
 BA.debugLineNum = 464;BA.debugLine="EditTextDakika4.TextSize = 20";
Debug.ShouldStop(32768);
programveri.mostCurrent._edittextdakika4.runMethod(true,"setTextSize",BA.numberCast(float.class, 20));
 BA.debugLineNum = 465;BA.debugLine="EditTextDakika4.TextColor = Colors.White";
Debug.ShouldStop(65536);
programveri.mostCurrent._edittextdakika4.runMethod(true,"setTextColor",programveri.mostCurrent.__c.getField(false,"Colors").getField(true,"White"));
 BA.debugLineNum = 466;BA.debugLine="EditTextDakika4.Typeface = Typeface.DEFAULT";
Debug.ShouldStop(131072);
programveri.mostCurrent._edittextdakika4.runMethod(false,"setTypeface",programveri.mostCurrent.__c.getField(false,"Typeface").getField(false,"DEFAULT"));
 BA.debugLineNum = 467;BA.debugLine="EditTextDakika4.InputType = EditTextDakika4.INPUT";
Debug.ShouldStop(262144);
programveri.mostCurrent._edittextdakika4.runMethod(true,"setInputType",programveri.mostCurrent._edittextdakika4.getField(true,"INPUT_TYPE_NUMBERS"));
 BA.debugLineNum = 469;BA.debugLine="EditTextDakika5.TextSize = 20";
Debug.ShouldStop(1048576);
programveri.mostCurrent._edittextdakika5.runMethod(true,"setTextSize",BA.numberCast(float.class, 20));
 BA.debugLineNum = 470;BA.debugLine="EditTextDakika5.TextColor = Colors.White";
Debug.ShouldStop(2097152);
programveri.mostCurrent._edittextdakika5.runMethod(true,"setTextColor",programveri.mostCurrent.__c.getField(false,"Colors").getField(true,"White"));
 BA.debugLineNum = 471;BA.debugLine="EditTextDakika5.Typeface = Typeface.DEFAULT";
Debug.ShouldStop(4194304);
programveri.mostCurrent._edittextdakika5.runMethod(false,"setTypeface",programveri.mostCurrent.__c.getField(false,"Typeface").getField(false,"DEFAULT"));
 BA.debugLineNum = 472;BA.debugLine="EditTextDakika5.InputType = EditTextDakika5.INPUT";
Debug.ShouldStop(8388608);
programveri.mostCurrent._edittextdakika5.runMethod(true,"setInputType",programveri.mostCurrent._edittextdakika5.getField(true,"INPUT_TYPE_NUMBERS"));
 BA.debugLineNum = 474;BA.debugLine="EditTextDakika6.TextSize = 20";
Debug.ShouldStop(33554432);
programveri.mostCurrent._edittextdakika6.runMethod(true,"setTextSize",BA.numberCast(float.class, 20));
 BA.debugLineNum = 475;BA.debugLine="EditTextDakika6.TextColor = Colors.White";
Debug.ShouldStop(67108864);
programveri.mostCurrent._edittextdakika6.runMethod(true,"setTextColor",programveri.mostCurrent.__c.getField(false,"Colors").getField(true,"White"));
 BA.debugLineNum = 476;BA.debugLine="EditTextDakika6.Typeface = Typeface.DEFAULT";
Debug.ShouldStop(134217728);
programveri.mostCurrent._edittextdakika6.runMethod(false,"setTypeface",programveri.mostCurrent.__c.getField(false,"Typeface").getField(false,"DEFAULT"));
 BA.debugLineNum = 477;BA.debugLine="EditTextDakika6.InputType = EditTextDakika6.INPUT";
Debug.ShouldStop(268435456);
programveri.mostCurrent._edittextdakika6.runMethod(true,"setInputType",programveri.mostCurrent._edittextdakika6.getField(true,"INPUT_TYPE_NUMBERS"));
 BA.debugLineNum = 479;BA.debugLine="EditTextDakika7.TextSize = 20";
Debug.ShouldStop(1073741824);
programveri.mostCurrent._edittextdakika7.runMethod(true,"setTextSize",BA.numberCast(float.class, 20));
 BA.debugLineNum = 480;BA.debugLine="EditTextDakika7.TextColor = Colors.White";
Debug.ShouldStop(-2147483648);
programveri.mostCurrent._edittextdakika7.runMethod(true,"setTextColor",programveri.mostCurrent.__c.getField(false,"Colors").getField(true,"White"));
 BA.debugLineNum = 481;BA.debugLine="EditTextDakika7.Typeface = Typeface.DEFAULT";
Debug.ShouldStop(1);
programveri.mostCurrent._edittextdakika7.runMethod(false,"setTypeface",programveri.mostCurrent.__c.getField(false,"Typeface").getField(false,"DEFAULT"));
 BA.debugLineNum = 482;BA.debugLine="EditTextDakika7.InputType = EditTextDakika7.INPUT";
Debug.ShouldStop(2);
programveri.mostCurrent._edittextdakika7.runMethod(true,"setInputType",programveri.mostCurrent._edittextdakika7.getField(true,"INPUT_TYPE_NUMBERS"));
 BA.debugLineNum = 484;BA.debugLine="EditTextDakika8.TextSize = 20";
Debug.ShouldStop(8);
programveri.mostCurrent._edittextdakika8.runMethod(true,"setTextSize",BA.numberCast(float.class, 20));
 BA.debugLineNum = 485;BA.debugLine="EditTextDakika8.TextColor = Colors.White";
Debug.ShouldStop(16);
programveri.mostCurrent._edittextdakika8.runMethod(true,"setTextColor",programveri.mostCurrent.__c.getField(false,"Colors").getField(true,"White"));
 BA.debugLineNum = 486;BA.debugLine="EditTextDakika8.Typeface = Typeface.DEFAULT";
Debug.ShouldStop(32);
programveri.mostCurrent._edittextdakika8.runMethod(false,"setTypeface",programveri.mostCurrent.__c.getField(false,"Typeface").getField(false,"DEFAULT"));
 BA.debugLineNum = 487;BA.debugLine="EditTextDakika8.InputType = EditTextDakika8.INPUT";
Debug.ShouldStop(64);
programveri.mostCurrent._edittextdakika8.runMethod(true,"setInputType",programveri.mostCurrent._edittextdakika8.getField(true,"INPUT_TYPE_NUMBERS"));
 BA.debugLineNum = 489;BA.debugLine="EditTextDakika9.TextSize = 20";
Debug.ShouldStop(256);
programveri.mostCurrent._edittextdakika9.runMethod(true,"setTextSize",BA.numberCast(float.class, 20));
 BA.debugLineNum = 490;BA.debugLine="EditTextDakika9.TextColor = Colors.White";
Debug.ShouldStop(512);
programveri.mostCurrent._edittextdakika9.runMethod(true,"setTextColor",programveri.mostCurrent.__c.getField(false,"Colors").getField(true,"White"));
 BA.debugLineNum = 491;BA.debugLine="EditTextDakika9.Typeface = Typeface.DEFAULT";
Debug.ShouldStop(1024);
programveri.mostCurrent._edittextdakika9.runMethod(false,"setTypeface",programveri.mostCurrent.__c.getField(false,"Typeface").getField(false,"DEFAULT"));
 BA.debugLineNum = 492;BA.debugLine="EditTextDakika9.InputType = EditTextDakika9.INPUT";
Debug.ShouldStop(2048);
programveri.mostCurrent._edittextdakika9.runMethod(true,"setInputType",programveri.mostCurrent._edittextdakika9.getField(true,"INPUT_TYPE_NUMBERS"));
 BA.debugLineNum = 494;BA.debugLine="EditTextDakika10.TextSize = 20";
Debug.ShouldStop(8192);
programveri.mostCurrent._edittextdakika10.runMethod(true,"setTextSize",BA.numberCast(float.class, 20));
 BA.debugLineNum = 495;BA.debugLine="EditTextDakika10.TextColor = Colors.White";
Debug.ShouldStop(16384);
programveri.mostCurrent._edittextdakika10.runMethod(true,"setTextColor",programveri.mostCurrent.__c.getField(false,"Colors").getField(true,"White"));
 BA.debugLineNum = 496;BA.debugLine="EditTextDakika10.Typeface = Typeface.DEFAULT";
Debug.ShouldStop(32768);
programveri.mostCurrent._edittextdakika10.runMethod(false,"setTypeface",programveri.mostCurrent.__c.getField(false,"Typeface").getField(false,"DEFAULT"));
 BA.debugLineNum = 497;BA.debugLine="EditTextDakika10.InputType = EditTextDakika10.INP";
Debug.ShouldStop(65536);
programveri.mostCurrent._edittextdakika10.runMethod(true,"setInputType",programveri.mostCurrent._edittextdakika10.getField(true,"INPUT_TYPE_NUMBERS"));
 BA.debugLineNum = 499;BA.debugLine="EditTextDakika11.TextSize = 20";
Debug.ShouldStop(262144);
programveri.mostCurrent._edittextdakika11.runMethod(true,"setTextSize",BA.numberCast(float.class, 20));
 BA.debugLineNum = 500;BA.debugLine="EditTextDakika11.TextColor = Colors.White";
Debug.ShouldStop(524288);
programveri.mostCurrent._edittextdakika11.runMethod(true,"setTextColor",programveri.mostCurrent.__c.getField(false,"Colors").getField(true,"White"));
 BA.debugLineNum = 501;BA.debugLine="EditTextDakika11.Typeface = Typeface.DEFAULT";
Debug.ShouldStop(1048576);
programveri.mostCurrent._edittextdakika11.runMethod(false,"setTypeface",programveri.mostCurrent.__c.getField(false,"Typeface").getField(false,"DEFAULT"));
 BA.debugLineNum = 502;BA.debugLine="EditTextDakika11.InputType = EditTextDakika11.INP";
Debug.ShouldStop(2097152);
programveri.mostCurrent._edittextdakika11.runMethod(true,"setInputType",programveri.mostCurrent._edittextdakika11.getField(true,"INPUT_TYPE_NUMBERS"));
 BA.debugLineNum = 504;BA.debugLine="EditTextDakika12.TextSize = 20";
Debug.ShouldStop(8388608);
programveri.mostCurrent._edittextdakika12.runMethod(true,"setTextSize",BA.numberCast(float.class, 20));
 BA.debugLineNum = 505;BA.debugLine="EditTextDakika12.TextColor = Colors.White";
Debug.ShouldStop(16777216);
programveri.mostCurrent._edittextdakika12.runMethod(true,"setTextColor",programveri.mostCurrent.__c.getField(false,"Colors").getField(true,"White"));
 BA.debugLineNum = 506;BA.debugLine="EditTextDakika12.Typeface = Typeface.DEFAULT";
Debug.ShouldStop(33554432);
programveri.mostCurrent._edittextdakika12.runMethod(false,"setTypeface",programveri.mostCurrent.__c.getField(false,"Typeface").getField(false,"DEFAULT"));
 BA.debugLineNum = 507;BA.debugLine="EditTextDakika12.InputType = EditTextDakika12.INP";
Debug.ShouldStop(67108864);
programveri.mostCurrent._edittextdakika12.runMethod(true,"setInputType",programveri.mostCurrent._edittextdakika12.getField(true,"INPUT_TYPE_NUMBERS"));
 BA.debugLineNum = 509;BA.debugLine="EditTextDakika13.TextSize = 20";
Debug.ShouldStop(268435456);
programveri.mostCurrent._edittextdakika13.runMethod(true,"setTextSize",BA.numberCast(float.class, 20));
 BA.debugLineNum = 510;BA.debugLine="EditTextDakika13.TextColor = Colors.White";
Debug.ShouldStop(536870912);
programveri.mostCurrent._edittextdakika13.runMethod(true,"setTextColor",programveri.mostCurrent.__c.getField(false,"Colors").getField(true,"White"));
 BA.debugLineNum = 511;BA.debugLine="EditTextDakika13.Typeface = Typeface.DEFAULT";
Debug.ShouldStop(1073741824);
programveri.mostCurrent._edittextdakika13.runMethod(false,"setTypeface",programveri.mostCurrent.__c.getField(false,"Typeface").getField(false,"DEFAULT"));
 BA.debugLineNum = 512;BA.debugLine="EditTextDakika13.InputType = EditTextDakika13.INP";
Debug.ShouldStop(-2147483648);
programveri.mostCurrent._edittextdakika13.runMethod(true,"setInputType",programveri.mostCurrent._edittextdakika13.getField(true,"INPUT_TYPE_NUMBERS"));
 BA.debugLineNum = 514;BA.debugLine="EditTextDakika14.TextSize = 20";
Debug.ShouldStop(2);
programveri.mostCurrent._edittextdakika14.runMethod(true,"setTextSize",BA.numberCast(float.class, 20));
 BA.debugLineNum = 515;BA.debugLine="EditTextDakika14.TextColor = Colors.White";
Debug.ShouldStop(4);
programveri.mostCurrent._edittextdakika14.runMethod(true,"setTextColor",programveri.mostCurrent.__c.getField(false,"Colors").getField(true,"White"));
 BA.debugLineNum = 516;BA.debugLine="EditTextDakika14.Typeface = Typeface.DEFAULT";
Debug.ShouldStop(8);
programveri.mostCurrent._edittextdakika14.runMethod(false,"setTypeface",programveri.mostCurrent.__c.getField(false,"Typeface").getField(false,"DEFAULT"));
 BA.debugLineNum = 517;BA.debugLine="EditTextDakika14.InputType = EditTextDakika14.INP";
Debug.ShouldStop(16);
programveri.mostCurrent._edittextdakika14.runMethod(true,"setInputType",programveri.mostCurrent._edittextdakika14.getField(true,"INPUT_TYPE_NUMBERS"));
 BA.debugLineNum = 519;BA.debugLine="EditTextDakika15.TextSize = 20";
Debug.ShouldStop(64);
programveri.mostCurrent._edittextdakika15.runMethod(true,"setTextSize",BA.numberCast(float.class, 20));
 BA.debugLineNum = 520;BA.debugLine="EditTextDakika15.TextColor = Colors.White";
Debug.ShouldStop(128);
programveri.mostCurrent._edittextdakika15.runMethod(true,"setTextColor",programveri.mostCurrent.__c.getField(false,"Colors").getField(true,"White"));
 BA.debugLineNum = 521;BA.debugLine="EditTextDakika15.Typeface = Typeface.DEFAULT";
Debug.ShouldStop(256);
programveri.mostCurrent._edittextdakika15.runMethod(false,"setTypeface",programveri.mostCurrent.__c.getField(false,"Typeface").getField(false,"DEFAULT"));
 BA.debugLineNum = 522;BA.debugLine="EditTextDakika15.InputType = EditTextDakika15.INP";
Debug.ShouldStop(512);
programveri.mostCurrent._edittextdakika15.runMethod(true,"setInputType",programveri.mostCurrent._edittextdakika15.getField(true,"INPUT_TYPE_NUMBERS"));
 BA.debugLineNum = 524;BA.debugLine="EditTextDakika16.TextSize = 20";
Debug.ShouldStop(2048);
programveri.mostCurrent._edittextdakika16.runMethod(true,"setTextSize",BA.numberCast(float.class, 20));
 BA.debugLineNum = 525;BA.debugLine="EditTextDakika16.TextColor = Colors.White";
Debug.ShouldStop(4096);
programveri.mostCurrent._edittextdakika16.runMethod(true,"setTextColor",programveri.mostCurrent.__c.getField(false,"Colors").getField(true,"White"));
 BA.debugLineNum = 526;BA.debugLine="EditTextDakika16.Typeface = Typeface.DEFAULT";
Debug.ShouldStop(8192);
programveri.mostCurrent._edittextdakika16.runMethod(false,"setTypeface",programveri.mostCurrent.__c.getField(false,"Typeface").getField(false,"DEFAULT"));
 BA.debugLineNum = 527;BA.debugLine="EditTextDakika16.InputType = EditTextDakika16.INP";
Debug.ShouldStop(16384);
programveri.mostCurrent._edittextdakika16.runMethod(true,"setInputType",programveri.mostCurrent._edittextdakika16.getField(true,"INPUT_TYPE_NUMBERS"));
 BA.debugLineNum = 529;BA.debugLine="EditTextDakika17.TextSize = 20";
Debug.ShouldStop(65536);
programveri.mostCurrent._edittextdakika17.runMethod(true,"setTextSize",BA.numberCast(float.class, 20));
 BA.debugLineNum = 530;BA.debugLine="EditTextDakika17.TextColor = Colors.White";
Debug.ShouldStop(131072);
programveri.mostCurrent._edittextdakika17.runMethod(true,"setTextColor",programveri.mostCurrent.__c.getField(false,"Colors").getField(true,"White"));
 BA.debugLineNum = 531;BA.debugLine="EditTextDakika17.Typeface = Typeface.DEFAULT";
Debug.ShouldStop(262144);
programveri.mostCurrent._edittextdakika17.runMethod(false,"setTypeface",programveri.mostCurrent.__c.getField(false,"Typeface").getField(false,"DEFAULT"));
 BA.debugLineNum = 532;BA.debugLine="EditTextDakika17.InputType = EditTextDakika17.INP";
Debug.ShouldStop(524288);
programveri.mostCurrent._edittextdakika17.runMethod(true,"setInputType",programveri.mostCurrent._edittextdakika17.getField(true,"INPUT_TYPE_NUMBERS"));
 BA.debugLineNum = 534;BA.debugLine="EditTextDakika18.TextSize = 20";
Debug.ShouldStop(2097152);
programveri.mostCurrent._edittextdakika18.runMethod(true,"setTextSize",BA.numberCast(float.class, 20));
 BA.debugLineNum = 535;BA.debugLine="EditTextDakika18.TextColor = Colors.White";
Debug.ShouldStop(4194304);
programveri.mostCurrent._edittextdakika18.runMethod(true,"setTextColor",programveri.mostCurrent.__c.getField(false,"Colors").getField(true,"White"));
 BA.debugLineNum = 536;BA.debugLine="EditTextDakika18.Typeface = Typeface.DEFAULT";
Debug.ShouldStop(8388608);
programveri.mostCurrent._edittextdakika18.runMethod(false,"setTypeface",programveri.mostCurrent.__c.getField(false,"Typeface").getField(false,"DEFAULT"));
 BA.debugLineNum = 537;BA.debugLine="EditTextDakika18.InputType = EditTextDakika18.INP";
Debug.ShouldStop(16777216);
programveri.mostCurrent._edittextdakika18.runMethod(true,"setInputType",programveri.mostCurrent._edittextdakika18.getField(true,"INPUT_TYPE_NUMBERS"));
 BA.debugLineNum = 539;BA.debugLine="EditTextDakika19.TextSize = 20";
Debug.ShouldStop(67108864);
programveri.mostCurrent._edittextdakika19.runMethod(true,"setTextSize",BA.numberCast(float.class, 20));
 BA.debugLineNum = 540;BA.debugLine="EditTextDakika19.TextColor = Colors.White";
Debug.ShouldStop(134217728);
programveri.mostCurrent._edittextdakika19.runMethod(true,"setTextColor",programveri.mostCurrent.__c.getField(false,"Colors").getField(true,"White"));
 BA.debugLineNum = 541;BA.debugLine="EditTextDakika19.Typeface = Typeface.DEFAULT";
Debug.ShouldStop(268435456);
programveri.mostCurrent._edittextdakika19.runMethod(false,"setTypeface",programveri.mostCurrent.__c.getField(false,"Typeface").getField(false,"DEFAULT"));
 BA.debugLineNum = 542;BA.debugLine="EditTextDakika19.InputType = EditTextDakika19.INP";
Debug.ShouldStop(536870912);
programveri.mostCurrent._edittextdakika19.runMethod(true,"setInputType",programveri.mostCurrent._edittextdakika19.getField(true,"INPUT_TYPE_NUMBERS"));
 BA.debugLineNum = 544;BA.debugLine="EditTextDakika20.TextSize = 20";
Debug.ShouldStop(-2147483648);
programveri.mostCurrent._edittextdakika20.runMethod(true,"setTextSize",BA.numberCast(float.class, 20));
 BA.debugLineNum = 545;BA.debugLine="EditTextDakika20.TextColor = Colors.White";
Debug.ShouldStop(1);
programveri.mostCurrent._edittextdakika20.runMethod(true,"setTextColor",programveri.mostCurrent.__c.getField(false,"Colors").getField(true,"White"));
 BA.debugLineNum = 546;BA.debugLine="EditTextDakika20.Typeface = Typeface.DEFAULT";
Debug.ShouldStop(2);
programveri.mostCurrent._edittextdakika20.runMethod(false,"setTypeface",programveri.mostCurrent.__c.getField(false,"Typeface").getField(false,"DEFAULT"));
 BA.debugLineNum = 547;BA.debugLine="EditTextDakika20.InputType = EditTextDakika20.INP";
Debug.ShouldStop(4);
programveri.mostCurrent._edittextdakika20.runMethod(true,"setInputType",programveri.mostCurrent._edittextdakika20.getField(true,"INPUT_TYPE_NUMBERS"));
 BA.debugLineNum = 549;BA.debugLine="EditTextDakika21.TextSize = 20";
Debug.ShouldStop(16);
programveri.mostCurrent._edittextdakika21.runMethod(true,"setTextSize",BA.numberCast(float.class, 20));
 BA.debugLineNum = 550;BA.debugLine="EditTextDakika21.TextColor = Colors.White";
Debug.ShouldStop(32);
programveri.mostCurrent._edittextdakika21.runMethod(true,"setTextColor",programveri.mostCurrent.__c.getField(false,"Colors").getField(true,"White"));
 BA.debugLineNum = 551;BA.debugLine="EditTextDakika21.Typeface = Typeface.DEFAULT";
Debug.ShouldStop(64);
programveri.mostCurrent._edittextdakika21.runMethod(false,"setTypeface",programveri.mostCurrent.__c.getField(false,"Typeface").getField(false,"DEFAULT"));
 BA.debugLineNum = 552;BA.debugLine="EditTextDakika21.InputType = EditTextDakika21.INP";
Debug.ShouldStop(128);
programveri.mostCurrent._edittextdakika21.runMethod(true,"setInputType",programveri.mostCurrent._edittextdakika21.getField(true,"INPUT_TYPE_NUMBERS"));
 BA.debugLineNum = 554;BA.debugLine="EditTextDakika22.TextSize = 20";
Debug.ShouldStop(512);
programveri.mostCurrent._edittextdakika22.runMethod(true,"setTextSize",BA.numberCast(float.class, 20));
 BA.debugLineNum = 555;BA.debugLine="EditTextDakika22.TextColor = Colors.White";
Debug.ShouldStop(1024);
programveri.mostCurrent._edittextdakika22.runMethod(true,"setTextColor",programveri.mostCurrent.__c.getField(false,"Colors").getField(true,"White"));
 BA.debugLineNum = 556;BA.debugLine="EditTextDakika22.Typeface = Typeface.DEFAULT";
Debug.ShouldStop(2048);
programveri.mostCurrent._edittextdakika22.runMethod(false,"setTypeface",programveri.mostCurrent.__c.getField(false,"Typeface").getField(false,"DEFAULT"));
 BA.debugLineNum = 557;BA.debugLine="EditTextDakika22.InputType = EditTextDakika22.INP";
Debug.ShouldStop(4096);
programveri.mostCurrent._edittextdakika22.runMethod(true,"setInputType",programveri.mostCurrent._edittextdakika22.getField(true,"INPUT_TYPE_NUMBERS"));
 BA.debugLineNum = 559;BA.debugLine="EditTextDakika23.TextSize = 20";
Debug.ShouldStop(16384);
programveri.mostCurrent._edittextdakika23.runMethod(true,"setTextSize",BA.numberCast(float.class, 20));
 BA.debugLineNum = 560;BA.debugLine="EditTextDakika23.TextColor = Colors.White";
Debug.ShouldStop(32768);
programveri.mostCurrent._edittextdakika23.runMethod(true,"setTextColor",programveri.mostCurrent.__c.getField(false,"Colors").getField(true,"White"));
 BA.debugLineNum = 561;BA.debugLine="EditTextDakika23.Typeface = Typeface.DEFAULT";
Debug.ShouldStop(65536);
programveri.mostCurrent._edittextdakika23.runMethod(false,"setTypeface",programveri.mostCurrent.__c.getField(false,"Typeface").getField(false,"DEFAULT"));
 BA.debugLineNum = 562;BA.debugLine="EditTextDakika23.InputType = EditTextDakika23.INP";
Debug.ShouldStop(131072);
programveri.mostCurrent._edittextdakika23.runMethod(true,"setInputType",programveri.mostCurrent._edittextdakika23.getField(true,"INPUT_TYPE_NUMBERS"));
 BA.debugLineNum = 564;BA.debugLine="EditTextDakika24.TextSize = 20";
Debug.ShouldStop(524288);
programveri.mostCurrent._edittextdakika24.runMethod(true,"setTextSize",BA.numberCast(float.class, 20));
 BA.debugLineNum = 565;BA.debugLine="EditTextDakika24.TextColor = Colors.White";
Debug.ShouldStop(1048576);
programveri.mostCurrent._edittextdakika24.runMethod(true,"setTextColor",programveri.mostCurrent.__c.getField(false,"Colors").getField(true,"White"));
 BA.debugLineNum = 566;BA.debugLine="EditTextDakika24.Typeface = Typeface.DEFAULT";
Debug.ShouldStop(2097152);
programveri.mostCurrent._edittextdakika24.runMethod(false,"setTypeface",programveri.mostCurrent.__c.getField(false,"Typeface").getField(false,"DEFAULT"));
 BA.debugLineNum = 567;BA.debugLine="EditTextDakika24.InputType = EditTextDakika24.INP";
Debug.ShouldStop(4194304);
programveri.mostCurrent._edittextdakika24.runMethod(true,"setInputType",programveri.mostCurrent._edittextdakika24.getField(true,"INPUT_TYPE_NUMBERS"));
 BA.debugLineNum = 569;BA.debugLine="EditTextDakika25.TextSize = 20";
Debug.ShouldStop(16777216);
programveri.mostCurrent._edittextdakika25.runMethod(true,"setTextSize",BA.numberCast(float.class, 20));
 BA.debugLineNum = 570;BA.debugLine="EditTextDakika25.TextColor = Colors.White";
Debug.ShouldStop(33554432);
programveri.mostCurrent._edittextdakika25.runMethod(true,"setTextColor",programveri.mostCurrent.__c.getField(false,"Colors").getField(true,"White"));
 BA.debugLineNum = 571;BA.debugLine="EditTextDakika25.Typeface = Typeface.DEFAULT";
Debug.ShouldStop(67108864);
programveri.mostCurrent._edittextdakika25.runMethod(false,"setTypeface",programveri.mostCurrent.__c.getField(false,"Typeface").getField(false,"DEFAULT"));
 BA.debugLineNum = 572;BA.debugLine="EditTextDakika25.InputType = EditTextDakika25.INP";
Debug.ShouldStop(134217728);
programveri.mostCurrent._edittextdakika25.runMethod(true,"setInputType",programveri.mostCurrent._edittextdakika25.getField(true,"INPUT_TYPE_NUMBERS"));
 BA.debugLineNum = 576;BA.debugLine="EditTextSaniye1.TextSize = 20";
Debug.ShouldStop(-2147483648);
programveri.mostCurrent._edittextsaniye1.runMethod(true,"setTextSize",BA.numberCast(float.class, 20));
 BA.debugLineNum = 577;BA.debugLine="EditTextSaniye1.TextColor = Colors.White";
Debug.ShouldStop(1);
programveri.mostCurrent._edittextsaniye1.runMethod(true,"setTextColor",programveri.mostCurrent.__c.getField(false,"Colors").getField(true,"White"));
 BA.debugLineNum = 578;BA.debugLine="EditTextSaniye1.Typeface = Typeface.DEFAULT";
Debug.ShouldStop(2);
programveri.mostCurrent._edittextsaniye1.runMethod(false,"setTypeface",programveri.mostCurrent.__c.getField(false,"Typeface").getField(false,"DEFAULT"));
 BA.debugLineNum = 579;BA.debugLine="EditTextSaniye1.InputType = EditTextSaniye1.INPUT";
Debug.ShouldStop(4);
programveri.mostCurrent._edittextsaniye1.runMethod(true,"setInputType",programveri.mostCurrent._edittextsaniye1.getField(true,"INPUT_TYPE_NUMBERS"));
 BA.debugLineNum = 581;BA.debugLine="EditTextSaniye2.TextSize = 20";
Debug.ShouldStop(16);
programveri.mostCurrent._edittextsaniye2.runMethod(true,"setTextSize",BA.numberCast(float.class, 20));
 BA.debugLineNum = 582;BA.debugLine="EditTextSaniye2.TextColor = Colors.White";
Debug.ShouldStop(32);
programveri.mostCurrent._edittextsaniye2.runMethod(true,"setTextColor",programveri.mostCurrent.__c.getField(false,"Colors").getField(true,"White"));
 BA.debugLineNum = 583;BA.debugLine="EditTextSaniye2.Typeface = Typeface.DEFAULT";
Debug.ShouldStop(64);
programveri.mostCurrent._edittextsaniye2.runMethod(false,"setTypeface",programveri.mostCurrent.__c.getField(false,"Typeface").getField(false,"DEFAULT"));
 BA.debugLineNum = 584;BA.debugLine="EditTextSaniye2.InputType = EditTextSaniye2.INPUT";
Debug.ShouldStop(128);
programveri.mostCurrent._edittextsaniye2.runMethod(true,"setInputType",programveri.mostCurrent._edittextsaniye2.getField(true,"INPUT_TYPE_NUMBERS"));
 BA.debugLineNum = 586;BA.debugLine="EditTextSaniye3.TextSize = 20";
Debug.ShouldStop(512);
programveri.mostCurrent._edittextsaniye3.runMethod(true,"setTextSize",BA.numberCast(float.class, 20));
 BA.debugLineNum = 587;BA.debugLine="EditTextSaniye3.TextColor = Colors.White";
Debug.ShouldStop(1024);
programveri.mostCurrent._edittextsaniye3.runMethod(true,"setTextColor",programveri.mostCurrent.__c.getField(false,"Colors").getField(true,"White"));
 BA.debugLineNum = 588;BA.debugLine="EditTextSaniye3.Typeface = Typeface.DEFAULT";
Debug.ShouldStop(2048);
programveri.mostCurrent._edittextsaniye3.runMethod(false,"setTypeface",programveri.mostCurrent.__c.getField(false,"Typeface").getField(false,"DEFAULT"));
 BA.debugLineNum = 589;BA.debugLine="EditTextSaniye3.InputType = EditTextSaniye3.INPUT";
Debug.ShouldStop(4096);
programveri.mostCurrent._edittextsaniye3.runMethod(true,"setInputType",programveri.mostCurrent._edittextsaniye3.getField(true,"INPUT_TYPE_NUMBERS"));
 BA.debugLineNum = 591;BA.debugLine="EditTextSaniye4.TextSize = 20";
Debug.ShouldStop(16384);
programveri.mostCurrent._edittextsaniye4.runMethod(true,"setTextSize",BA.numberCast(float.class, 20));
 BA.debugLineNum = 592;BA.debugLine="EditTextSaniye4.TextColor = Colors.White";
Debug.ShouldStop(32768);
programveri.mostCurrent._edittextsaniye4.runMethod(true,"setTextColor",programveri.mostCurrent.__c.getField(false,"Colors").getField(true,"White"));
 BA.debugLineNum = 593;BA.debugLine="EditTextSaniye4.Typeface = Typeface.DEFAULT";
Debug.ShouldStop(65536);
programveri.mostCurrent._edittextsaniye4.runMethod(false,"setTypeface",programveri.mostCurrent.__c.getField(false,"Typeface").getField(false,"DEFAULT"));
 BA.debugLineNum = 594;BA.debugLine="EditTextSaniye4.InputType = EditTextSaniye4.INPUT";
Debug.ShouldStop(131072);
programveri.mostCurrent._edittextsaniye4.runMethod(true,"setInputType",programveri.mostCurrent._edittextsaniye4.getField(true,"INPUT_TYPE_NUMBERS"));
 BA.debugLineNum = 596;BA.debugLine="EditTextSaniye5.TextSize = 20";
Debug.ShouldStop(524288);
programveri.mostCurrent._edittextsaniye5.runMethod(true,"setTextSize",BA.numberCast(float.class, 20));
 BA.debugLineNum = 597;BA.debugLine="EditTextSaniye5.TextColor = Colors.White";
Debug.ShouldStop(1048576);
programveri.mostCurrent._edittextsaniye5.runMethod(true,"setTextColor",programveri.mostCurrent.__c.getField(false,"Colors").getField(true,"White"));
 BA.debugLineNum = 598;BA.debugLine="EditTextSaniye5.Typeface = Typeface.DEFAULT";
Debug.ShouldStop(2097152);
programveri.mostCurrent._edittextsaniye5.runMethod(false,"setTypeface",programveri.mostCurrent.__c.getField(false,"Typeface").getField(false,"DEFAULT"));
 BA.debugLineNum = 599;BA.debugLine="EditTextSaniye5.InputType = EditTextSaniye5.INPUT";
Debug.ShouldStop(4194304);
programveri.mostCurrent._edittextsaniye5.runMethod(true,"setInputType",programveri.mostCurrent._edittextsaniye5.getField(true,"INPUT_TYPE_NUMBERS"));
 BA.debugLineNum = 601;BA.debugLine="EditTextSaniye6.TextSize = 20";
Debug.ShouldStop(16777216);
programveri.mostCurrent._edittextsaniye6.runMethod(true,"setTextSize",BA.numberCast(float.class, 20));
 BA.debugLineNum = 602;BA.debugLine="EditTextSaniye6.TextColor = Colors.White";
Debug.ShouldStop(33554432);
programveri.mostCurrent._edittextsaniye6.runMethod(true,"setTextColor",programveri.mostCurrent.__c.getField(false,"Colors").getField(true,"White"));
 BA.debugLineNum = 603;BA.debugLine="EditTextSaniye6.Typeface = Typeface.DEFAULT";
Debug.ShouldStop(67108864);
programveri.mostCurrent._edittextsaniye6.runMethod(false,"setTypeface",programveri.mostCurrent.__c.getField(false,"Typeface").getField(false,"DEFAULT"));
 BA.debugLineNum = 604;BA.debugLine="EditTextSaniye6.InputType = EditTextSaniye6.INPUT";
Debug.ShouldStop(134217728);
programveri.mostCurrent._edittextsaniye6.runMethod(true,"setInputType",programveri.mostCurrent._edittextsaniye6.getField(true,"INPUT_TYPE_NUMBERS"));
 BA.debugLineNum = 606;BA.debugLine="EditTextSaniye7.TextSize = 20";
Debug.ShouldStop(536870912);
programveri.mostCurrent._edittextsaniye7.runMethod(true,"setTextSize",BA.numberCast(float.class, 20));
 BA.debugLineNum = 607;BA.debugLine="EditTextSaniye7.TextColor = Colors.White";
Debug.ShouldStop(1073741824);
programveri.mostCurrent._edittextsaniye7.runMethod(true,"setTextColor",programveri.mostCurrent.__c.getField(false,"Colors").getField(true,"White"));
 BA.debugLineNum = 608;BA.debugLine="EditTextSaniye7.Typeface = Typeface.DEFAULT";
Debug.ShouldStop(-2147483648);
programveri.mostCurrent._edittextsaniye7.runMethod(false,"setTypeface",programveri.mostCurrent.__c.getField(false,"Typeface").getField(false,"DEFAULT"));
 BA.debugLineNum = 609;BA.debugLine="EditTextSaniye7.InputType = EditTextSaniye7.INPUT";
Debug.ShouldStop(1);
programveri.mostCurrent._edittextsaniye7.runMethod(true,"setInputType",programveri.mostCurrent._edittextsaniye7.getField(true,"INPUT_TYPE_NUMBERS"));
 BA.debugLineNum = 611;BA.debugLine="EditTextSaniye8.TextSize = 20";
Debug.ShouldStop(4);
programveri.mostCurrent._edittextsaniye8.runMethod(true,"setTextSize",BA.numberCast(float.class, 20));
 BA.debugLineNum = 612;BA.debugLine="EditTextSaniye8.TextColor = Colors.White";
Debug.ShouldStop(8);
programveri.mostCurrent._edittextsaniye8.runMethod(true,"setTextColor",programveri.mostCurrent.__c.getField(false,"Colors").getField(true,"White"));
 BA.debugLineNum = 613;BA.debugLine="EditTextSaniye8.Typeface = Typeface.DEFAULT";
Debug.ShouldStop(16);
programveri.mostCurrent._edittextsaniye8.runMethod(false,"setTypeface",programveri.mostCurrent.__c.getField(false,"Typeface").getField(false,"DEFAULT"));
 BA.debugLineNum = 614;BA.debugLine="EditTextSaniye8.InputType = EditTextSaniye8.INPUT";
Debug.ShouldStop(32);
programveri.mostCurrent._edittextsaniye8.runMethod(true,"setInputType",programveri.mostCurrent._edittextsaniye8.getField(true,"INPUT_TYPE_NUMBERS"));
 BA.debugLineNum = 616;BA.debugLine="EditTextSaniye9.TextSize = 20";
Debug.ShouldStop(128);
programveri.mostCurrent._edittextsaniye9.runMethod(true,"setTextSize",BA.numberCast(float.class, 20));
 BA.debugLineNum = 617;BA.debugLine="EditTextSaniye9.TextColor = Colors.White";
Debug.ShouldStop(256);
programveri.mostCurrent._edittextsaniye9.runMethod(true,"setTextColor",programveri.mostCurrent.__c.getField(false,"Colors").getField(true,"White"));
 BA.debugLineNum = 618;BA.debugLine="EditTextSaniye9.Typeface = Typeface.DEFAULT";
Debug.ShouldStop(512);
programveri.mostCurrent._edittextsaniye9.runMethod(false,"setTypeface",programveri.mostCurrent.__c.getField(false,"Typeface").getField(false,"DEFAULT"));
 BA.debugLineNum = 619;BA.debugLine="EditTextSaniye9.InputType = EditTextSaniye9.INPUT";
Debug.ShouldStop(1024);
programveri.mostCurrent._edittextsaniye9.runMethod(true,"setInputType",programveri.mostCurrent._edittextsaniye9.getField(true,"INPUT_TYPE_NUMBERS"));
 BA.debugLineNum = 621;BA.debugLine="EditTextSaniye10.TextSize = 20";
Debug.ShouldStop(4096);
programveri.mostCurrent._edittextsaniye10.runMethod(true,"setTextSize",BA.numberCast(float.class, 20));
 BA.debugLineNum = 622;BA.debugLine="EditTextSaniye10.TextColor = Colors.White";
Debug.ShouldStop(8192);
programveri.mostCurrent._edittextsaniye10.runMethod(true,"setTextColor",programveri.mostCurrent.__c.getField(false,"Colors").getField(true,"White"));
 BA.debugLineNum = 623;BA.debugLine="EditTextSaniye10.Typeface = Typeface.DEFAULT";
Debug.ShouldStop(16384);
programveri.mostCurrent._edittextsaniye10.runMethod(false,"setTypeface",programveri.mostCurrent.__c.getField(false,"Typeface").getField(false,"DEFAULT"));
 BA.debugLineNum = 624;BA.debugLine="EditTextSaniye10.InputType = EditTextSaniye10.INP";
Debug.ShouldStop(32768);
programveri.mostCurrent._edittextsaniye10.runMethod(true,"setInputType",programveri.mostCurrent._edittextsaniye10.getField(true,"INPUT_TYPE_NUMBERS"));
 BA.debugLineNum = 626;BA.debugLine="EditTextSaniye11.TextSize = 20";
Debug.ShouldStop(131072);
programveri.mostCurrent._edittextsaniye11.runMethod(true,"setTextSize",BA.numberCast(float.class, 20));
 BA.debugLineNum = 627;BA.debugLine="EditTextSaniye11.TextColor = Colors.White";
Debug.ShouldStop(262144);
programveri.mostCurrent._edittextsaniye11.runMethod(true,"setTextColor",programveri.mostCurrent.__c.getField(false,"Colors").getField(true,"White"));
 BA.debugLineNum = 628;BA.debugLine="EditTextSaniye11.Typeface = Typeface.DEFAULT";
Debug.ShouldStop(524288);
programveri.mostCurrent._edittextsaniye11.runMethod(false,"setTypeface",programveri.mostCurrent.__c.getField(false,"Typeface").getField(false,"DEFAULT"));
 BA.debugLineNum = 629;BA.debugLine="EditTextSaniye11.InputType = EditTextSaniye11.INP";
Debug.ShouldStop(1048576);
programveri.mostCurrent._edittextsaniye11.runMethod(true,"setInputType",programveri.mostCurrent._edittextsaniye11.getField(true,"INPUT_TYPE_NUMBERS"));
 BA.debugLineNum = 631;BA.debugLine="EditTextSaniye12.TextSize = 20";
Debug.ShouldStop(4194304);
programveri.mostCurrent._edittextsaniye12.runMethod(true,"setTextSize",BA.numberCast(float.class, 20));
 BA.debugLineNum = 632;BA.debugLine="EditTextSaniye12.TextColor = Colors.White";
Debug.ShouldStop(8388608);
programveri.mostCurrent._edittextsaniye12.runMethod(true,"setTextColor",programveri.mostCurrent.__c.getField(false,"Colors").getField(true,"White"));
 BA.debugLineNum = 633;BA.debugLine="EditTextSaniye12.Typeface = Typeface.DEFAULT";
Debug.ShouldStop(16777216);
programveri.mostCurrent._edittextsaniye12.runMethod(false,"setTypeface",programveri.mostCurrent.__c.getField(false,"Typeface").getField(false,"DEFAULT"));
 BA.debugLineNum = 634;BA.debugLine="EditTextSaniye12.InputType = EditTextSaniye12.INP";
Debug.ShouldStop(33554432);
programveri.mostCurrent._edittextsaniye12.runMethod(true,"setInputType",programveri.mostCurrent._edittextsaniye12.getField(true,"INPUT_TYPE_NUMBERS"));
 BA.debugLineNum = 636;BA.debugLine="EditTextSaniye13.TextSize = 20";
Debug.ShouldStop(134217728);
programveri.mostCurrent._edittextsaniye13.runMethod(true,"setTextSize",BA.numberCast(float.class, 20));
 BA.debugLineNum = 637;BA.debugLine="EditTextSaniye13.TextColor = Colors.White";
Debug.ShouldStop(268435456);
programveri.mostCurrent._edittextsaniye13.runMethod(true,"setTextColor",programveri.mostCurrent.__c.getField(false,"Colors").getField(true,"White"));
 BA.debugLineNum = 638;BA.debugLine="EditTextSaniye13.Typeface = Typeface.DEFAULT";
Debug.ShouldStop(536870912);
programveri.mostCurrent._edittextsaniye13.runMethod(false,"setTypeface",programveri.mostCurrent.__c.getField(false,"Typeface").getField(false,"DEFAULT"));
 BA.debugLineNum = 639;BA.debugLine="EditTextSaniye13.InputType = EditTextSaniye13.INP";
Debug.ShouldStop(1073741824);
programveri.mostCurrent._edittextsaniye13.runMethod(true,"setInputType",programveri.mostCurrent._edittextsaniye13.getField(true,"INPUT_TYPE_NUMBERS"));
 BA.debugLineNum = 641;BA.debugLine="EditTextSaniye14.TextSize = 20";
Debug.ShouldStop(1);
programveri.mostCurrent._edittextsaniye14.runMethod(true,"setTextSize",BA.numberCast(float.class, 20));
 BA.debugLineNum = 642;BA.debugLine="EditTextSaniye14.TextColor = Colors.White";
Debug.ShouldStop(2);
programveri.mostCurrent._edittextsaniye14.runMethod(true,"setTextColor",programveri.mostCurrent.__c.getField(false,"Colors").getField(true,"White"));
 BA.debugLineNum = 643;BA.debugLine="EditTextSaniye14.Typeface = Typeface.DEFAULT";
Debug.ShouldStop(4);
programveri.mostCurrent._edittextsaniye14.runMethod(false,"setTypeface",programveri.mostCurrent.__c.getField(false,"Typeface").getField(false,"DEFAULT"));
 BA.debugLineNum = 644;BA.debugLine="EditTextSaniye14.InputType = EditTextSaniye14.INP";
Debug.ShouldStop(8);
programveri.mostCurrent._edittextsaniye14.runMethod(true,"setInputType",programveri.mostCurrent._edittextsaniye14.getField(true,"INPUT_TYPE_NUMBERS"));
 BA.debugLineNum = 646;BA.debugLine="EditTextSaniye15.TextSize = 20";
Debug.ShouldStop(32);
programveri.mostCurrent._edittextsaniye15.runMethod(true,"setTextSize",BA.numberCast(float.class, 20));
 BA.debugLineNum = 647;BA.debugLine="EditTextSaniye15.TextColor = Colors.White";
Debug.ShouldStop(64);
programveri.mostCurrent._edittextsaniye15.runMethod(true,"setTextColor",programveri.mostCurrent.__c.getField(false,"Colors").getField(true,"White"));
 BA.debugLineNum = 648;BA.debugLine="EditTextSaniye15.Typeface = Typeface.DEFAULT";
Debug.ShouldStop(128);
programveri.mostCurrent._edittextsaniye15.runMethod(false,"setTypeface",programveri.mostCurrent.__c.getField(false,"Typeface").getField(false,"DEFAULT"));
 BA.debugLineNum = 649;BA.debugLine="EditTextSaniye15.InputType = EditTextSaniye15.INP";
Debug.ShouldStop(256);
programveri.mostCurrent._edittextsaniye15.runMethod(true,"setInputType",programveri.mostCurrent._edittextsaniye15.getField(true,"INPUT_TYPE_NUMBERS"));
 BA.debugLineNum = 651;BA.debugLine="EditTextSaniye16.TextSize = 20";
Debug.ShouldStop(1024);
programveri.mostCurrent._edittextsaniye16.runMethod(true,"setTextSize",BA.numberCast(float.class, 20));
 BA.debugLineNum = 652;BA.debugLine="EditTextSaniye16.TextColor = Colors.White";
Debug.ShouldStop(2048);
programveri.mostCurrent._edittextsaniye16.runMethod(true,"setTextColor",programveri.mostCurrent.__c.getField(false,"Colors").getField(true,"White"));
 BA.debugLineNum = 653;BA.debugLine="EditTextSaniye16.Typeface = Typeface.DEFAULT";
Debug.ShouldStop(4096);
programveri.mostCurrent._edittextsaniye16.runMethod(false,"setTypeface",programveri.mostCurrent.__c.getField(false,"Typeface").getField(false,"DEFAULT"));
 BA.debugLineNum = 654;BA.debugLine="EditTextSaniye16.InputType = EditTextSaniye16.INP";
Debug.ShouldStop(8192);
programveri.mostCurrent._edittextsaniye16.runMethod(true,"setInputType",programveri.mostCurrent._edittextsaniye16.getField(true,"INPUT_TYPE_NUMBERS"));
 BA.debugLineNum = 656;BA.debugLine="EditTextSaniye17.TextSize = 20";
Debug.ShouldStop(32768);
programveri.mostCurrent._edittextsaniye17.runMethod(true,"setTextSize",BA.numberCast(float.class, 20));
 BA.debugLineNum = 657;BA.debugLine="EditTextSaniye17.TextColor = Colors.White";
Debug.ShouldStop(65536);
programveri.mostCurrent._edittextsaniye17.runMethod(true,"setTextColor",programveri.mostCurrent.__c.getField(false,"Colors").getField(true,"White"));
 BA.debugLineNum = 658;BA.debugLine="EditTextSaniye17.Typeface = Typeface.DEFAULT";
Debug.ShouldStop(131072);
programveri.mostCurrent._edittextsaniye17.runMethod(false,"setTypeface",programveri.mostCurrent.__c.getField(false,"Typeface").getField(false,"DEFAULT"));
 BA.debugLineNum = 659;BA.debugLine="EditTextSaniye17.InputType = EditTextSaniye17.INP";
Debug.ShouldStop(262144);
programveri.mostCurrent._edittextsaniye17.runMethod(true,"setInputType",programveri.mostCurrent._edittextsaniye17.getField(true,"INPUT_TYPE_NUMBERS"));
 BA.debugLineNum = 661;BA.debugLine="EditTextSaniye18.TextSize = 20";
Debug.ShouldStop(1048576);
programveri.mostCurrent._edittextsaniye18.runMethod(true,"setTextSize",BA.numberCast(float.class, 20));
 BA.debugLineNum = 662;BA.debugLine="EditTextSaniye18.TextColor = Colors.White";
Debug.ShouldStop(2097152);
programveri.mostCurrent._edittextsaniye18.runMethod(true,"setTextColor",programveri.mostCurrent.__c.getField(false,"Colors").getField(true,"White"));
 BA.debugLineNum = 663;BA.debugLine="EditTextSaniye18.Typeface = Typeface.DEFAULT";
Debug.ShouldStop(4194304);
programveri.mostCurrent._edittextsaniye18.runMethod(false,"setTypeface",programveri.mostCurrent.__c.getField(false,"Typeface").getField(false,"DEFAULT"));
 BA.debugLineNum = 664;BA.debugLine="EditTextSaniye18.InputType = EditTextSaniye18.INP";
Debug.ShouldStop(8388608);
programveri.mostCurrent._edittextsaniye18.runMethod(true,"setInputType",programveri.mostCurrent._edittextsaniye18.getField(true,"INPUT_TYPE_NUMBERS"));
 BA.debugLineNum = 666;BA.debugLine="EditTextSaniye19.TextSize = 20";
Debug.ShouldStop(33554432);
programveri.mostCurrent._edittextsaniye19.runMethod(true,"setTextSize",BA.numberCast(float.class, 20));
 BA.debugLineNum = 667;BA.debugLine="EditTextSaniye19.TextColor = Colors.White";
Debug.ShouldStop(67108864);
programveri.mostCurrent._edittextsaniye19.runMethod(true,"setTextColor",programveri.mostCurrent.__c.getField(false,"Colors").getField(true,"White"));
 BA.debugLineNum = 668;BA.debugLine="EditTextSaniye19.Typeface = Typeface.DEFAULT";
Debug.ShouldStop(134217728);
programveri.mostCurrent._edittextsaniye19.runMethod(false,"setTypeface",programveri.mostCurrent.__c.getField(false,"Typeface").getField(false,"DEFAULT"));
 BA.debugLineNum = 669;BA.debugLine="EditTextSaniye19.InputType = EditTextSaniye19.INP";
Debug.ShouldStop(268435456);
programveri.mostCurrent._edittextsaniye19.runMethod(true,"setInputType",programveri.mostCurrent._edittextsaniye19.getField(true,"INPUT_TYPE_NUMBERS"));
 BA.debugLineNum = 671;BA.debugLine="EditTextSaniye20.TextSize = 20";
Debug.ShouldStop(1073741824);
programveri.mostCurrent._edittextsaniye20.runMethod(true,"setTextSize",BA.numberCast(float.class, 20));
 BA.debugLineNum = 672;BA.debugLine="EditTextSaniye20.TextColor = Colors.White";
Debug.ShouldStop(-2147483648);
programveri.mostCurrent._edittextsaniye20.runMethod(true,"setTextColor",programveri.mostCurrent.__c.getField(false,"Colors").getField(true,"White"));
 BA.debugLineNum = 673;BA.debugLine="EditTextSaniye20.Typeface = Typeface.DEFAULT";
Debug.ShouldStop(1);
programveri.mostCurrent._edittextsaniye20.runMethod(false,"setTypeface",programveri.mostCurrent.__c.getField(false,"Typeface").getField(false,"DEFAULT"));
 BA.debugLineNum = 674;BA.debugLine="EditTextSaniye20.InputType = EditTextSaniye20.INP";
Debug.ShouldStop(2);
programveri.mostCurrent._edittextsaniye20.runMethod(true,"setInputType",programveri.mostCurrent._edittextsaniye20.getField(true,"INPUT_TYPE_NUMBERS"));
 BA.debugLineNum = 676;BA.debugLine="EditTextSaniye21.TextSize = 20";
Debug.ShouldStop(8);
programveri.mostCurrent._edittextsaniye21.runMethod(true,"setTextSize",BA.numberCast(float.class, 20));
 BA.debugLineNum = 677;BA.debugLine="EditTextSaniye21.TextColor = Colors.White";
Debug.ShouldStop(16);
programveri.mostCurrent._edittextsaniye21.runMethod(true,"setTextColor",programveri.mostCurrent.__c.getField(false,"Colors").getField(true,"White"));
 BA.debugLineNum = 678;BA.debugLine="EditTextSaniye21.Typeface = Typeface.DEFAULT";
Debug.ShouldStop(32);
programveri.mostCurrent._edittextsaniye21.runMethod(false,"setTypeface",programveri.mostCurrent.__c.getField(false,"Typeface").getField(false,"DEFAULT"));
 BA.debugLineNum = 679;BA.debugLine="EditTextSaniye21.InputType = EditTextSaniye21.INP";
Debug.ShouldStop(64);
programveri.mostCurrent._edittextsaniye21.runMethod(true,"setInputType",programveri.mostCurrent._edittextsaniye21.getField(true,"INPUT_TYPE_NUMBERS"));
 BA.debugLineNum = 681;BA.debugLine="EditTextSaniye22.TextSize = 20";
Debug.ShouldStop(256);
programveri.mostCurrent._edittextsaniye22.runMethod(true,"setTextSize",BA.numberCast(float.class, 20));
 BA.debugLineNum = 682;BA.debugLine="EditTextSaniye22.TextColor = Colors.White";
Debug.ShouldStop(512);
programveri.mostCurrent._edittextsaniye22.runMethod(true,"setTextColor",programveri.mostCurrent.__c.getField(false,"Colors").getField(true,"White"));
 BA.debugLineNum = 683;BA.debugLine="EditTextSaniye22.Typeface = Typeface.DEFAULT";
Debug.ShouldStop(1024);
programveri.mostCurrent._edittextsaniye22.runMethod(false,"setTypeface",programveri.mostCurrent.__c.getField(false,"Typeface").getField(false,"DEFAULT"));
 BA.debugLineNum = 684;BA.debugLine="EditTextSaniye22.InputType = EditTextSaniye22.INP";
Debug.ShouldStop(2048);
programveri.mostCurrent._edittextsaniye22.runMethod(true,"setInputType",programveri.mostCurrent._edittextsaniye22.getField(true,"INPUT_TYPE_NUMBERS"));
 BA.debugLineNum = 686;BA.debugLine="EditTextSaniye23.TextSize = 20";
Debug.ShouldStop(8192);
programveri.mostCurrent._edittextsaniye23.runMethod(true,"setTextSize",BA.numberCast(float.class, 20));
 BA.debugLineNum = 687;BA.debugLine="EditTextSaniye23.TextColor = Colors.White";
Debug.ShouldStop(16384);
programveri.mostCurrent._edittextsaniye23.runMethod(true,"setTextColor",programveri.mostCurrent.__c.getField(false,"Colors").getField(true,"White"));
 BA.debugLineNum = 688;BA.debugLine="EditTextSaniye23.Typeface = Typeface.DEFAULT";
Debug.ShouldStop(32768);
programveri.mostCurrent._edittextsaniye23.runMethod(false,"setTypeface",programveri.mostCurrent.__c.getField(false,"Typeface").getField(false,"DEFAULT"));
 BA.debugLineNum = 689;BA.debugLine="EditTextSaniye23.InputType = EditTextSaniye23.INP";
Debug.ShouldStop(65536);
programveri.mostCurrent._edittextsaniye23.runMethod(true,"setInputType",programveri.mostCurrent._edittextsaniye23.getField(true,"INPUT_TYPE_NUMBERS"));
 BA.debugLineNum = 691;BA.debugLine="EditTextSaniye24.TextSize = 20";
Debug.ShouldStop(262144);
programveri.mostCurrent._edittextsaniye24.runMethod(true,"setTextSize",BA.numberCast(float.class, 20));
 BA.debugLineNum = 692;BA.debugLine="EditTextSaniye24.TextColor = Colors.White";
Debug.ShouldStop(524288);
programveri.mostCurrent._edittextsaniye24.runMethod(true,"setTextColor",programveri.mostCurrent.__c.getField(false,"Colors").getField(true,"White"));
 BA.debugLineNum = 693;BA.debugLine="EditTextSaniye24.Typeface = Typeface.DEFAULT";
Debug.ShouldStop(1048576);
programveri.mostCurrent._edittextsaniye24.runMethod(false,"setTypeface",programveri.mostCurrent.__c.getField(false,"Typeface").getField(false,"DEFAULT"));
 BA.debugLineNum = 694;BA.debugLine="EditTextSaniye24.InputType = EditTextSaniye24.INP";
Debug.ShouldStop(2097152);
programveri.mostCurrent._edittextsaniye24.runMethod(true,"setInputType",programveri.mostCurrent._edittextsaniye24.getField(true,"INPUT_TYPE_NUMBERS"));
 BA.debugLineNum = 696;BA.debugLine="EditTextSaniye25.TextSize = 20";
Debug.ShouldStop(8388608);
programveri.mostCurrent._edittextsaniye25.runMethod(true,"setTextSize",BA.numberCast(float.class, 20));
 BA.debugLineNum = 697;BA.debugLine="EditTextSaniye25.TextColor = Colors.White";
Debug.ShouldStop(16777216);
programveri.mostCurrent._edittextsaniye25.runMethod(true,"setTextColor",programveri.mostCurrent.__c.getField(false,"Colors").getField(true,"White"));
 BA.debugLineNum = 698;BA.debugLine="EditTextSaniye25.Typeface = Typeface.DEFAULT";
Debug.ShouldStop(33554432);
programveri.mostCurrent._edittextsaniye25.runMethod(false,"setTypeface",programveri.mostCurrent.__c.getField(false,"Typeface").getField(false,"DEFAULT"));
 BA.debugLineNum = 699;BA.debugLine="EditTextSaniye25.InputType = EditTextSaniye25.INP";
Debug.ShouldStop(67108864);
programveri.mostCurrent._edittextsaniye25.runMethod(true,"setInputType",programveri.mostCurrent._edittextsaniye25.getField(true,"INPUT_TYPE_NUMBERS"));
 BA.debugLineNum = 704;BA.debugLine="EditTextHiz1.TextSize = 20";
Debug.ShouldStop(-2147483648);
programveri.mostCurrent._edittexthiz1.runMethod(true,"setTextSize",BA.numberCast(float.class, 20));
 BA.debugLineNum = 705;BA.debugLine="EditTextHiz1.TextColor = Colors.White";
Debug.ShouldStop(1);
programveri.mostCurrent._edittexthiz1.runMethod(true,"setTextColor",programveri.mostCurrent.__c.getField(false,"Colors").getField(true,"White"));
 BA.debugLineNum = 706;BA.debugLine="EditTextHiz1.Typeface = Typeface.DEFAULT";
Debug.ShouldStop(2);
programveri.mostCurrent._edittexthiz1.runMethod(false,"setTypeface",programveri.mostCurrent.__c.getField(false,"Typeface").getField(false,"DEFAULT"));
 BA.debugLineNum = 707;BA.debugLine="EditTextHiz1.InputType = EditTextHiz1.INPUT_TYPE_";
Debug.ShouldStop(4);
programveri.mostCurrent._edittexthiz1.runMethod(true,"setInputType",programveri.mostCurrent._edittexthiz1.getField(true,"INPUT_TYPE_DECIMAL_NUMBERS"));
 BA.debugLineNum = 709;BA.debugLine="EditTextHiz2.TextSize = 20";
Debug.ShouldStop(16);
programveri.mostCurrent._edittexthiz2.runMethod(true,"setTextSize",BA.numberCast(float.class, 20));
 BA.debugLineNum = 710;BA.debugLine="EditTextHiz2.TextColor = Colors.White";
Debug.ShouldStop(32);
programveri.mostCurrent._edittexthiz2.runMethod(true,"setTextColor",programveri.mostCurrent.__c.getField(false,"Colors").getField(true,"White"));
 BA.debugLineNum = 711;BA.debugLine="EditTextHiz2.Typeface = Typeface.DEFAULT";
Debug.ShouldStop(64);
programveri.mostCurrent._edittexthiz2.runMethod(false,"setTypeface",programveri.mostCurrent.__c.getField(false,"Typeface").getField(false,"DEFAULT"));
 BA.debugLineNum = 712;BA.debugLine="EditTextHiz2.InputType = EditTextHiz2.INPUT_TYPE_";
Debug.ShouldStop(128);
programveri.mostCurrent._edittexthiz2.runMethod(true,"setInputType",programveri.mostCurrent._edittexthiz2.getField(true,"INPUT_TYPE_DECIMAL_NUMBERS"));
 BA.debugLineNum = 714;BA.debugLine="EditTextHiz3.TextSize = 20";
Debug.ShouldStop(512);
programveri.mostCurrent._edittexthiz3.runMethod(true,"setTextSize",BA.numberCast(float.class, 20));
 BA.debugLineNum = 715;BA.debugLine="EditTextHiz3.TextColor = Colors.White";
Debug.ShouldStop(1024);
programveri.mostCurrent._edittexthiz3.runMethod(true,"setTextColor",programveri.mostCurrent.__c.getField(false,"Colors").getField(true,"White"));
 BA.debugLineNum = 716;BA.debugLine="EditTextHiz3.Typeface = Typeface.DEFAULT";
Debug.ShouldStop(2048);
programveri.mostCurrent._edittexthiz3.runMethod(false,"setTypeface",programveri.mostCurrent.__c.getField(false,"Typeface").getField(false,"DEFAULT"));
 BA.debugLineNum = 717;BA.debugLine="EditTextHiz3.InputType = EditTextHiz3.INPUT_TYPE_";
Debug.ShouldStop(4096);
programveri.mostCurrent._edittexthiz3.runMethod(true,"setInputType",programveri.mostCurrent._edittexthiz3.getField(true,"INPUT_TYPE_DECIMAL_NUMBERS"));
 BA.debugLineNum = 719;BA.debugLine="EditTextHiz4.TextSize = 20";
Debug.ShouldStop(16384);
programveri.mostCurrent._edittexthiz4.runMethod(true,"setTextSize",BA.numberCast(float.class, 20));
 BA.debugLineNum = 720;BA.debugLine="EditTextHiz4.TextColor = Colors.White";
Debug.ShouldStop(32768);
programveri.mostCurrent._edittexthiz4.runMethod(true,"setTextColor",programveri.mostCurrent.__c.getField(false,"Colors").getField(true,"White"));
 BA.debugLineNum = 721;BA.debugLine="EditTextHiz4.Typeface = Typeface.DEFAULT";
Debug.ShouldStop(65536);
programveri.mostCurrent._edittexthiz4.runMethod(false,"setTypeface",programveri.mostCurrent.__c.getField(false,"Typeface").getField(false,"DEFAULT"));
 BA.debugLineNum = 722;BA.debugLine="EditTextHiz4.InputType = EditTextHiz4.INPUT_TYPE_";
Debug.ShouldStop(131072);
programveri.mostCurrent._edittexthiz4.runMethod(true,"setInputType",programveri.mostCurrent._edittexthiz4.getField(true,"INPUT_TYPE_DECIMAL_NUMBERS"));
 BA.debugLineNum = 724;BA.debugLine="EditTextHiz5.TextSize = 20";
Debug.ShouldStop(524288);
programveri.mostCurrent._edittexthiz5.runMethod(true,"setTextSize",BA.numberCast(float.class, 20));
 BA.debugLineNum = 725;BA.debugLine="EditTextHiz5.TextColor = Colors.White";
Debug.ShouldStop(1048576);
programveri.mostCurrent._edittexthiz5.runMethod(true,"setTextColor",programveri.mostCurrent.__c.getField(false,"Colors").getField(true,"White"));
 BA.debugLineNum = 726;BA.debugLine="EditTextHiz5.Typeface = Typeface.DEFAULT";
Debug.ShouldStop(2097152);
programveri.mostCurrent._edittexthiz5.runMethod(false,"setTypeface",programveri.mostCurrent.__c.getField(false,"Typeface").getField(false,"DEFAULT"));
 BA.debugLineNum = 727;BA.debugLine="EditTextHiz5.InputType = EditTextHiz5.INPUT_TYPE_";
Debug.ShouldStop(4194304);
programveri.mostCurrent._edittexthiz5.runMethod(true,"setInputType",programveri.mostCurrent._edittexthiz5.getField(true,"INPUT_TYPE_DECIMAL_NUMBERS"));
 BA.debugLineNum = 729;BA.debugLine="EditTextHiz6.TextSize = 20";
Debug.ShouldStop(16777216);
programveri.mostCurrent._edittexthiz6.runMethod(true,"setTextSize",BA.numberCast(float.class, 20));
 BA.debugLineNum = 730;BA.debugLine="EditTextHiz6.TextColor = Colors.White";
Debug.ShouldStop(33554432);
programveri.mostCurrent._edittexthiz6.runMethod(true,"setTextColor",programveri.mostCurrent.__c.getField(false,"Colors").getField(true,"White"));
 BA.debugLineNum = 731;BA.debugLine="EditTextHiz6.Typeface = Typeface.DEFAULT";
Debug.ShouldStop(67108864);
programveri.mostCurrent._edittexthiz6.runMethod(false,"setTypeface",programveri.mostCurrent.__c.getField(false,"Typeface").getField(false,"DEFAULT"));
 BA.debugLineNum = 732;BA.debugLine="EditTextHiz6.InputType = EditTextHiz6.INPUT_TYPE_";
Debug.ShouldStop(134217728);
programveri.mostCurrent._edittexthiz6.runMethod(true,"setInputType",programveri.mostCurrent._edittexthiz6.getField(true,"INPUT_TYPE_DECIMAL_NUMBERS"));
 BA.debugLineNum = 734;BA.debugLine="EditTextHiz7.TextSize = 20";
Debug.ShouldStop(536870912);
programveri.mostCurrent._edittexthiz7.runMethod(true,"setTextSize",BA.numberCast(float.class, 20));
 BA.debugLineNum = 735;BA.debugLine="EditTextHiz7.TextColor = Colors.White";
Debug.ShouldStop(1073741824);
programveri.mostCurrent._edittexthiz7.runMethod(true,"setTextColor",programveri.mostCurrent.__c.getField(false,"Colors").getField(true,"White"));
 BA.debugLineNum = 736;BA.debugLine="EditTextHiz7.Typeface = Typeface.DEFAULT";
Debug.ShouldStop(-2147483648);
programveri.mostCurrent._edittexthiz7.runMethod(false,"setTypeface",programveri.mostCurrent.__c.getField(false,"Typeface").getField(false,"DEFAULT"));
 BA.debugLineNum = 737;BA.debugLine="EditTextHiz7.InputType = EditTextHiz7.INPUT_TYPE_";
Debug.ShouldStop(1);
programveri.mostCurrent._edittexthiz7.runMethod(true,"setInputType",programveri.mostCurrent._edittexthiz7.getField(true,"INPUT_TYPE_DECIMAL_NUMBERS"));
 BA.debugLineNum = 739;BA.debugLine="EditTextHiz8.TextSize = 20";
Debug.ShouldStop(4);
programveri.mostCurrent._edittexthiz8.runMethod(true,"setTextSize",BA.numberCast(float.class, 20));
 BA.debugLineNum = 740;BA.debugLine="EditTextHiz8.TextColor = Colors.White";
Debug.ShouldStop(8);
programveri.mostCurrent._edittexthiz8.runMethod(true,"setTextColor",programveri.mostCurrent.__c.getField(false,"Colors").getField(true,"White"));
 BA.debugLineNum = 741;BA.debugLine="EditTextHiz8.Typeface = Typeface.DEFAULT";
Debug.ShouldStop(16);
programveri.mostCurrent._edittexthiz8.runMethod(false,"setTypeface",programveri.mostCurrent.__c.getField(false,"Typeface").getField(false,"DEFAULT"));
 BA.debugLineNum = 742;BA.debugLine="EditTextHiz8.InputType = EditTextHiz8.INPUT_TYPE_";
Debug.ShouldStop(32);
programveri.mostCurrent._edittexthiz8.runMethod(true,"setInputType",programveri.mostCurrent._edittexthiz8.getField(true,"INPUT_TYPE_DECIMAL_NUMBERS"));
 BA.debugLineNum = 744;BA.debugLine="EditTextHiz9.TextSize = 20";
Debug.ShouldStop(128);
programveri.mostCurrent._edittexthiz9.runMethod(true,"setTextSize",BA.numberCast(float.class, 20));
 BA.debugLineNum = 745;BA.debugLine="EditTextHiz9.TextColor = Colors.White";
Debug.ShouldStop(256);
programveri.mostCurrent._edittexthiz9.runMethod(true,"setTextColor",programveri.mostCurrent.__c.getField(false,"Colors").getField(true,"White"));
 BA.debugLineNum = 746;BA.debugLine="EditTextHiz9.Typeface = Typeface.DEFAULT";
Debug.ShouldStop(512);
programveri.mostCurrent._edittexthiz9.runMethod(false,"setTypeface",programveri.mostCurrent.__c.getField(false,"Typeface").getField(false,"DEFAULT"));
 BA.debugLineNum = 747;BA.debugLine="EditTextHiz9.InputType = EditTextHiz9.INPUT_TYPE_";
Debug.ShouldStop(1024);
programveri.mostCurrent._edittexthiz9.runMethod(true,"setInputType",programveri.mostCurrent._edittexthiz9.getField(true,"INPUT_TYPE_DECIMAL_NUMBERS"));
 BA.debugLineNum = 749;BA.debugLine="EditTextHiz10.TextSize = 20";
Debug.ShouldStop(4096);
programveri.mostCurrent._edittexthiz10.runMethod(true,"setTextSize",BA.numberCast(float.class, 20));
 BA.debugLineNum = 750;BA.debugLine="EditTextHiz10.TextColor = Colors.White";
Debug.ShouldStop(8192);
programveri.mostCurrent._edittexthiz10.runMethod(true,"setTextColor",programveri.mostCurrent.__c.getField(false,"Colors").getField(true,"White"));
 BA.debugLineNum = 751;BA.debugLine="EditTextHiz10.Typeface = Typeface.DEFAULT";
Debug.ShouldStop(16384);
programveri.mostCurrent._edittexthiz10.runMethod(false,"setTypeface",programveri.mostCurrent.__c.getField(false,"Typeface").getField(false,"DEFAULT"));
 BA.debugLineNum = 752;BA.debugLine="EditTextHiz10.InputType = EditTextHiz10.INPUT_TYP";
Debug.ShouldStop(32768);
programveri.mostCurrent._edittexthiz10.runMethod(true,"setInputType",programveri.mostCurrent._edittexthiz10.getField(true,"INPUT_TYPE_DECIMAL_NUMBERS"));
 BA.debugLineNum = 754;BA.debugLine="EditTextHiz11.TextSize = 20";
Debug.ShouldStop(131072);
programveri.mostCurrent._edittexthiz11.runMethod(true,"setTextSize",BA.numberCast(float.class, 20));
 BA.debugLineNum = 755;BA.debugLine="EditTextHiz11.TextColor = Colors.White";
Debug.ShouldStop(262144);
programveri.mostCurrent._edittexthiz11.runMethod(true,"setTextColor",programveri.mostCurrent.__c.getField(false,"Colors").getField(true,"White"));
 BA.debugLineNum = 756;BA.debugLine="EditTextHiz11.Typeface = Typeface.DEFAULT";
Debug.ShouldStop(524288);
programveri.mostCurrent._edittexthiz11.runMethod(false,"setTypeface",programveri.mostCurrent.__c.getField(false,"Typeface").getField(false,"DEFAULT"));
 BA.debugLineNum = 757;BA.debugLine="EditTextHiz11.InputType = EditTextHiz11.INPUT_TYP";
Debug.ShouldStop(1048576);
programveri.mostCurrent._edittexthiz11.runMethod(true,"setInputType",programveri.mostCurrent._edittexthiz11.getField(true,"INPUT_TYPE_DECIMAL_NUMBERS"));
 BA.debugLineNum = 759;BA.debugLine="EditTextHiz12.TextSize = 20";
Debug.ShouldStop(4194304);
programveri.mostCurrent._edittexthiz12.runMethod(true,"setTextSize",BA.numberCast(float.class, 20));
 BA.debugLineNum = 760;BA.debugLine="EditTextHiz12.TextColor = Colors.White";
Debug.ShouldStop(8388608);
programveri.mostCurrent._edittexthiz12.runMethod(true,"setTextColor",programveri.mostCurrent.__c.getField(false,"Colors").getField(true,"White"));
 BA.debugLineNum = 761;BA.debugLine="EditTextHiz12.Typeface = Typeface.DEFAULT";
Debug.ShouldStop(16777216);
programveri.mostCurrent._edittexthiz12.runMethod(false,"setTypeface",programveri.mostCurrent.__c.getField(false,"Typeface").getField(false,"DEFAULT"));
 BA.debugLineNum = 762;BA.debugLine="EditTextHiz12.InputType = EditTextHiz12.INPUT_TYP";
Debug.ShouldStop(33554432);
programveri.mostCurrent._edittexthiz12.runMethod(true,"setInputType",programveri.mostCurrent._edittexthiz12.getField(true,"INPUT_TYPE_DECIMAL_NUMBERS"));
 BA.debugLineNum = 764;BA.debugLine="EditTextHiz13.TextSize = 20";
Debug.ShouldStop(134217728);
programveri.mostCurrent._edittexthiz13.runMethod(true,"setTextSize",BA.numberCast(float.class, 20));
 BA.debugLineNum = 765;BA.debugLine="EditTextHiz13.TextColor = Colors.White";
Debug.ShouldStop(268435456);
programveri.mostCurrent._edittexthiz13.runMethod(true,"setTextColor",programveri.mostCurrent.__c.getField(false,"Colors").getField(true,"White"));
 BA.debugLineNum = 766;BA.debugLine="EditTextHiz13.Typeface = Typeface.DEFAULT";
Debug.ShouldStop(536870912);
programveri.mostCurrent._edittexthiz13.runMethod(false,"setTypeface",programveri.mostCurrent.__c.getField(false,"Typeface").getField(false,"DEFAULT"));
 BA.debugLineNum = 767;BA.debugLine="EditTextHiz13.InputType = EditTextHiz13.INPUT_TYP";
Debug.ShouldStop(1073741824);
programveri.mostCurrent._edittexthiz13.runMethod(true,"setInputType",programveri.mostCurrent._edittexthiz13.getField(true,"INPUT_TYPE_DECIMAL_NUMBERS"));
 BA.debugLineNum = 769;BA.debugLine="EditTextHiz14.TextSize = 20";
Debug.ShouldStop(1);
programveri.mostCurrent._edittexthiz14.runMethod(true,"setTextSize",BA.numberCast(float.class, 20));
 BA.debugLineNum = 770;BA.debugLine="EditTextHiz14.TextColor = Colors.White";
Debug.ShouldStop(2);
programveri.mostCurrent._edittexthiz14.runMethod(true,"setTextColor",programveri.mostCurrent.__c.getField(false,"Colors").getField(true,"White"));
 BA.debugLineNum = 771;BA.debugLine="EditTextHiz14.Typeface = Typeface.DEFAULT";
Debug.ShouldStop(4);
programveri.mostCurrent._edittexthiz14.runMethod(false,"setTypeface",programveri.mostCurrent.__c.getField(false,"Typeface").getField(false,"DEFAULT"));
 BA.debugLineNum = 772;BA.debugLine="EditTextHiz14.InputType = EditTextHiz14.INPUT_TYP";
Debug.ShouldStop(8);
programveri.mostCurrent._edittexthiz14.runMethod(true,"setInputType",programveri.mostCurrent._edittexthiz14.getField(true,"INPUT_TYPE_DECIMAL_NUMBERS"));
 BA.debugLineNum = 774;BA.debugLine="EditTextHiz15.TextSize = 20";
Debug.ShouldStop(32);
programveri.mostCurrent._edittexthiz15.runMethod(true,"setTextSize",BA.numberCast(float.class, 20));
 BA.debugLineNum = 775;BA.debugLine="EditTextHiz15.TextColor = Colors.White";
Debug.ShouldStop(64);
programveri.mostCurrent._edittexthiz15.runMethod(true,"setTextColor",programveri.mostCurrent.__c.getField(false,"Colors").getField(true,"White"));
 BA.debugLineNum = 776;BA.debugLine="EditTextHiz15.Typeface = Typeface.DEFAULT";
Debug.ShouldStop(128);
programveri.mostCurrent._edittexthiz15.runMethod(false,"setTypeface",programveri.mostCurrent.__c.getField(false,"Typeface").getField(false,"DEFAULT"));
 BA.debugLineNum = 777;BA.debugLine="EditTextHiz15.InputType = EditTextHiz15.INPUT_TYP";
Debug.ShouldStop(256);
programveri.mostCurrent._edittexthiz15.runMethod(true,"setInputType",programveri.mostCurrent._edittexthiz15.getField(true,"INPUT_TYPE_DECIMAL_NUMBERS"));
 BA.debugLineNum = 779;BA.debugLine="EditTextHiz16.TextSize = 20";
Debug.ShouldStop(1024);
programveri.mostCurrent._edittexthiz16.runMethod(true,"setTextSize",BA.numberCast(float.class, 20));
 BA.debugLineNum = 780;BA.debugLine="EditTextHiz16.TextColor = Colors.White";
Debug.ShouldStop(2048);
programveri.mostCurrent._edittexthiz16.runMethod(true,"setTextColor",programveri.mostCurrent.__c.getField(false,"Colors").getField(true,"White"));
 BA.debugLineNum = 781;BA.debugLine="EditTextHiz16.Typeface = Typeface.DEFAULT";
Debug.ShouldStop(4096);
programveri.mostCurrent._edittexthiz16.runMethod(false,"setTypeface",programveri.mostCurrent.__c.getField(false,"Typeface").getField(false,"DEFAULT"));
 BA.debugLineNum = 782;BA.debugLine="EditTextHiz16.InputType = EditTextHiz16.INPUT_TYP";
Debug.ShouldStop(8192);
programveri.mostCurrent._edittexthiz16.runMethod(true,"setInputType",programveri.mostCurrent._edittexthiz16.getField(true,"INPUT_TYPE_DECIMAL_NUMBERS"));
 BA.debugLineNum = 784;BA.debugLine="EditTextHiz17.TextSize = 20";
Debug.ShouldStop(32768);
programveri.mostCurrent._edittexthiz17.runMethod(true,"setTextSize",BA.numberCast(float.class, 20));
 BA.debugLineNum = 785;BA.debugLine="EditTextHiz17.TextColor = Colors.White";
Debug.ShouldStop(65536);
programveri.mostCurrent._edittexthiz17.runMethod(true,"setTextColor",programveri.mostCurrent.__c.getField(false,"Colors").getField(true,"White"));
 BA.debugLineNum = 786;BA.debugLine="EditTextHiz17.Typeface = Typeface.DEFAULT";
Debug.ShouldStop(131072);
programveri.mostCurrent._edittexthiz17.runMethod(false,"setTypeface",programveri.mostCurrent.__c.getField(false,"Typeface").getField(false,"DEFAULT"));
 BA.debugLineNum = 787;BA.debugLine="EditTextHiz17.InputType = EditTextHiz17.INPUT_TYP";
Debug.ShouldStop(262144);
programveri.mostCurrent._edittexthiz17.runMethod(true,"setInputType",programveri.mostCurrent._edittexthiz17.getField(true,"INPUT_TYPE_DECIMAL_NUMBERS"));
 BA.debugLineNum = 789;BA.debugLine="EditTextHiz18.TextSize = 20";
Debug.ShouldStop(1048576);
programveri.mostCurrent._edittexthiz18.runMethod(true,"setTextSize",BA.numberCast(float.class, 20));
 BA.debugLineNum = 790;BA.debugLine="EditTextHiz18.TextColor = Colors.White";
Debug.ShouldStop(2097152);
programveri.mostCurrent._edittexthiz18.runMethod(true,"setTextColor",programveri.mostCurrent.__c.getField(false,"Colors").getField(true,"White"));
 BA.debugLineNum = 791;BA.debugLine="EditTextHiz18.Typeface = Typeface.DEFAULT";
Debug.ShouldStop(4194304);
programveri.mostCurrent._edittexthiz18.runMethod(false,"setTypeface",programveri.mostCurrent.__c.getField(false,"Typeface").getField(false,"DEFAULT"));
 BA.debugLineNum = 792;BA.debugLine="EditTextHiz18.InputType = EditTextHiz18.INPUT_TYP";
Debug.ShouldStop(8388608);
programveri.mostCurrent._edittexthiz18.runMethod(true,"setInputType",programveri.mostCurrent._edittexthiz18.getField(true,"INPUT_TYPE_DECIMAL_NUMBERS"));
 BA.debugLineNum = 794;BA.debugLine="EditTextHiz19.TextSize = 20";
Debug.ShouldStop(33554432);
programveri.mostCurrent._edittexthiz19.runMethod(true,"setTextSize",BA.numberCast(float.class, 20));
 BA.debugLineNum = 795;BA.debugLine="EditTextHiz19.TextColor = Colors.White";
Debug.ShouldStop(67108864);
programveri.mostCurrent._edittexthiz19.runMethod(true,"setTextColor",programveri.mostCurrent.__c.getField(false,"Colors").getField(true,"White"));
 BA.debugLineNum = 796;BA.debugLine="EditTextHiz19.Typeface = Typeface.DEFAULT";
Debug.ShouldStop(134217728);
programveri.mostCurrent._edittexthiz19.runMethod(false,"setTypeface",programveri.mostCurrent.__c.getField(false,"Typeface").getField(false,"DEFAULT"));
 BA.debugLineNum = 797;BA.debugLine="EditTextHiz19.InputType = EditTextHiz19.INPUT_TYP";
Debug.ShouldStop(268435456);
programveri.mostCurrent._edittexthiz19.runMethod(true,"setInputType",programveri.mostCurrent._edittexthiz19.getField(true,"INPUT_TYPE_DECIMAL_NUMBERS"));
 BA.debugLineNum = 799;BA.debugLine="EditTextHiz20.TextSize = 20";
Debug.ShouldStop(1073741824);
programveri.mostCurrent._edittexthiz20.runMethod(true,"setTextSize",BA.numberCast(float.class, 20));
 BA.debugLineNum = 800;BA.debugLine="EditTextHiz20.TextColor = Colors.White";
Debug.ShouldStop(-2147483648);
programveri.mostCurrent._edittexthiz20.runMethod(true,"setTextColor",programveri.mostCurrent.__c.getField(false,"Colors").getField(true,"White"));
 BA.debugLineNum = 801;BA.debugLine="EditTextHiz20.Typeface = Typeface.DEFAULT";
Debug.ShouldStop(1);
programveri.mostCurrent._edittexthiz20.runMethod(false,"setTypeface",programveri.mostCurrent.__c.getField(false,"Typeface").getField(false,"DEFAULT"));
 BA.debugLineNum = 802;BA.debugLine="EditTextHiz20.InputType = EditTextHiz20.INPUT_TYP";
Debug.ShouldStop(2);
programveri.mostCurrent._edittexthiz20.runMethod(true,"setInputType",programveri.mostCurrent._edittexthiz20.getField(true,"INPUT_TYPE_DECIMAL_NUMBERS"));
 BA.debugLineNum = 804;BA.debugLine="EditTextHiz21.TextSize = 20";
Debug.ShouldStop(8);
programveri.mostCurrent._edittexthiz21.runMethod(true,"setTextSize",BA.numberCast(float.class, 20));
 BA.debugLineNum = 805;BA.debugLine="EditTextHiz21.TextColor = Colors.White";
Debug.ShouldStop(16);
programveri.mostCurrent._edittexthiz21.runMethod(true,"setTextColor",programveri.mostCurrent.__c.getField(false,"Colors").getField(true,"White"));
 BA.debugLineNum = 806;BA.debugLine="EditTextHiz21.Typeface = Typeface.DEFAULT";
Debug.ShouldStop(32);
programveri.mostCurrent._edittexthiz21.runMethod(false,"setTypeface",programveri.mostCurrent.__c.getField(false,"Typeface").getField(false,"DEFAULT"));
 BA.debugLineNum = 807;BA.debugLine="EditTextHiz21.InputType = EditTextHiz21.INPUT_TYP";
Debug.ShouldStop(64);
programveri.mostCurrent._edittexthiz21.runMethod(true,"setInputType",programveri.mostCurrent._edittexthiz21.getField(true,"INPUT_TYPE_DECIMAL_NUMBERS"));
 BA.debugLineNum = 809;BA.debugLine="EditTextHiz22.TextSize = 20";
Debug.ShouldStop(256);
programveri.mostCurrent._edittexthiz22.runMethod(true,"setTextSize",BA.numberCast(float.class, 20));
 BA.debugLineNum = 810;BA.debugLine="EditTextHiz22.TextColor = Colors.White";
Debug.ShouldStop(512);
programveri.mostCurrent._edittexthiz22.runMethod(true,"setTextColor",programveri.mostCurrent.__c.getField(false,"Colors").getField(true,"White"));
 BA.debugLineNum = 811;BA.debugLine="EditTextHiz22.Typeface = Typeface.DEFAULT";
Debug.ShouldStop(1024);
programveri.mostCurrent._edittexthiz22.runMethod(false,"setTypeface",programveri.mostCurrent.__c.getField(false,"Typeface").getField(false,"DEFAULT"));
 BA.debugLineNum = 812;BA.debugLine="EditTextHiz22.InputType = EditTextHiz22.INPUT_TYP";
Debug.ShouldStop(2048);
programveri.mostCurrent._edittexthiz22.runMethod(true,"setInputType",programveri.mostCurrent._edittexthiz22.getField(true,"INPUT_TYPE_DECIMAL_NUMBERS"));
 BA.debugLineNum = 814;BA.debugLine="EditTextHiz23.TextSize = 20";
Debug.ShouldStop(8192);
programveri.mostCurrent._edittexthiz23.runMethod(true,"setTextSize",BA.numberCast(float.class, 20));
 BA.debugLineNum = 815;BA.debugLine="EditTextHiz23.TextColor = Colors.White";
Debug.ShouldStop(16384);
programveri.mostCurrent._edittexthiz23.runMethod(true,"setTextColor",programveri.mostCurrent.__c.getField(false,"Colors").getField(true,"White"));
 BA.debugLineNum = 816;BA.debugLine="EditTextHiz23.Typeface = Typeface.DEFAULT";
Debug.ShouldStop(32768);
programveri.mostCurrent._edittexthiz23.runMethod(false,"setTypeface",programveri.mostCurrent.__c.getField(false,"Typeface").getField(false,"DEFAULT"));
 BA.debugLineNum = 817;BA.debugLine="EditTextHiz23.InputType = EditTextHiz23.INPUT_TYP";
Debug.ShouldStop(65536);
programveri.mostCurrent._edittexthiz23.runMethod(true,"setInputType",programveri.mostCurrent._edittexthiz23.getField(true,"INPUT_TYPE_DECIMAL_NUMBERS"));
 BA.debugLineNum = 819;BA.debugLine="EditTextHiz24.TextSize = 20";
Debug.ShouldStop(262144);
programveri.mostCurrent._edittexthiz24.runMethod(true,"setTextSize",BA.numberCast(float.class, 20));
 BA.debugLineNum = 820;BA.debugLine="EditTextHiz24.TextColor = Colors.White";
Debug.ShouldStop(524288);
programveri.mostCurrent._edittexthiz24.runMethod(true,"setTextColor",programveri.mostCurrent.__c.getField(false,"Colors").getField(true,"White"));
 BA.debugLineNum = 821;BA.debugLine="EditTextHiz24.Typeface = Typeface.DEFAULT";
Debug.ShouldStop(1048576);
programveri.mostCurrent._edittexthiz24.runMethod(false,"setTypeface",programveri.mostCurrent.__c.getField(false,"Typeface").getField(false,"DEFAULT"));
 BA.debugLineNum = 822;BA.debugLine="EditTextHiz24.InputType = EditTextHiz24.INPUT_TYP";
Debug.ShouldStop(2097152);
programveri.mostCurrent._edittexthiz24.runMethod(true,"setInputType",programveri.mostCurrent._edittexthiz24.getField(true,"INPUT_TYPE_DECIMAL_NUMBERS"));
 BA.debugLineNum = 824;BA.debugLine="EditTextHiz25.TextSize = 20";
Debug.ShouldStop(8388608);
programveri.mostCurrent._edittexthiz25.runMethod(true,"setTextSize",BA.numberCast(float.class, 20));
 BA.debugLineNum = 825;BA.debugLine="EditTextHiz25.TextColor = Colors.White";
Debug.ShouldStop(16777216);
programveri.mostCurrent._edittexthiz25.runMethod(true,"setTextColor",programveri.mostCurrent.__c.getField(false,"Colors").getField(true,"White"));
 BA.debugLineNum = 826;BA.debugLine="EditTextHiz25.Typeface = Typeface.DEFAULT";
Debug.ShouldStop(33554432);
programveri.mostCurrent._edittexthiz25.runMethod(false,"setTypeface",programveri.mostCurrent.__c.getField(false,"Typeface").getField(false,"DEFAULT"));
 BA.debugLineNum = 827;BA.debugLine="EditTextHiz25.InputType = EditTextHiz25.INPUT_TYP";
Debug.ShouldStop(67108864);
programveri.mostCurrent._edittexthiz25.runMethod(true,"setInputType",programveri.mostCurrent._edittexthiz25.getField(true,"INPUT_TYPE_DECIMAL_NUMBERS"));
 BA.debugLineNum = 955;BA.debugLine="LabelSeviyeIsmi1.TextColor = Colors.White";
Debug.ShouldStop(67108864);
programveri.mostCurrent._labelseviyeismi1.runMethod(true,"setTextColor",programveri.mostCurrent.__c.getField(false,"Colors").getField(true,"White"));
 BA.debugLineNum = 956;BA.debugLine="LabelSeviyeIsmi1.TextSize = 20";
Debug.ShouldStop(134217728);
programveri.mostCurrent._labelseviyeismi1.runMethod(true,"setTextSize",BA.numberCast(float.class, 20));
 BA.debugLineNum = 957;BA.debugLine="LabelSeviyeIsmi1.Typeface = Typeface.DEFAULT_BOLD";
Debug.ShouldStop(268435456);
programveri.mostCurrent._labelseviyeismi1.runMethod(false,"setTypeface",programveri.mostCurrent.__c.getField(false,"Typeface").getField(false,"DEFAULT_BOLD"));
 BA.debugLineNum = 959;BA.debugLine="LabelSeviyeIsmi2.TextColor = Colors.White";
Debug.ShouldStop(1073741824);
programveri.mostCurrent._labelseviyeismi2.runMethod(true,"setTextColor",programveri.mostCurrent.__c.getField(false,"Colors").getField(true,"White"));
 BA.debugLineNum = 960;BA.debugLine="LabelSeviyeIsmi2.TextSize = 20";
Debug.ShouldStop(-2147483648);
programveri.mostCurrent._labelseviyeismi2.runMethod(true,"setTextSize",BA.numberCast(float.class, 20));
 BA.debugLineNum = 961;BA.debugLine="LabelSeviyeIsmi2.Typeface = Typeface.DEFAULT_BOLD";
Debug.ShouldStop(1);
programveri.mostCurrent._labelseviyeismi2.runMethod(false,"setTypeface",programveri.mostCurrent.__c.getField(false,"Typeface").getField(false,"DEFAULT_BOLD"));
 BA.debugLineNum = 963;BA.debugLine="LabelSeviyeIsmi3.TextColor = Colors.White";
Debug.ShouldStop(4);
programveri.mostCurrent._labelseviyeismi3.runMethod(true,"setTextColor",programveri.mostCurrent.__c.getField(false,"Colors").getField(true,"White"));
 BA.debugLineNum = 964;BA.debugLine="LabelSeviyeIsmi3.TextSize = 20";
Debug.ShouldStop(8);
programveri.mostCurrent._labelseviyeismi3.runMethod(true,"setTextSize",BA.numberCast(float.class, 20));
 BA.debugLineNum = 965;BA.debugLine="LabelSeviyeIsmi3.Typeface = Typeface.DEFAULT_BOLD";
Debug.ShouldStop(16);
programveri.mostCurrent._labelseviyeismi3.runMethod(false,"setTypeface",programveri.mostCurrent.__c.getField(false,"Typeface").getField(false,"DEFAULT_BOLD"));
 BA.debugLineNum = 967;BA.debugLine="LabelSeviyeIsmi4.TextColor = Colors.White";
Debug.ShouldStop(64);
programveri.mostCurrent._labelseviyeismi4.runMethod(true,"setTextColor",programveri.mostCurrent.__c.getField(false,"Colors").getField(true,"White"));
 BA.debugLineNum = 968;BA.debugLine="LabelSeviyeIsmi4.TextSize = 20";
Debug.ShouldStop(128);
programveri.mostCurrent._labelseviyeismi4.runMethod(true,"setTextSize",BA.numberCast(float.class, 20));
 BA.debugLineNum = 969;BA.debugLine="LabelSeviyeIsmi4.Typeface = Typeface.DEFAULT_BOLD";
Debug.ShouldStop(256);
programveri.mostCurrent._labelseviyeismi4.runMethod(false,"setTypeface",programveri.mostCurrent.__c.getField(false,"Typeface").getField(false,"DEFAULT_BOLD"));
 BA.debugLineNum = 971;BA.debugLine="LabelSeviyeIsmi5.TextColor = Colors.White";
Debug.ShouldStop(1024);
programveri.mostCurrent._labelseviyeismi5.runMethod(true,"setTextColor",programveri.mostCurrent.__c.getField(false,"Colors").getField(true,"White"));
 BA.debugLineNum = 972;BA.debugLine="LabelSeviyeIsmi5.TextSize = 20";
Debug.ShouldStop(2048);
programveri.mostCurrent._labelseviyeismi5.runMethod(true,"setTextSize",BA.numberCast(float.class, 20));
 BA.debugLineNum = 973;BA.debugLine="LabelSeviyeIsmi5.Typeface = Typeface.DEFAULT_BOLD";
Debug.ShouldStop(4096);
programveri.mostCurrent._labelseviyeismi5.runMethod(false,"setTypeface",programveri.mostCurrent.__c.getField(false,"Typeface").getField(false,"DEFAULT_BOLD"));
 BA.debugLineNum = 975;BA.debugLine="LabelSeviyeIsmi6.TextColor = Colors.White";
Debug.ShouldStop(16384);
programveri.mostCurrent._labelseviyeismi6.runMethod(true,"setTextColor",programveri.mostCurrent.__c.getField(false,"Colors").getField(true,"White"));
 BA.debugLineNum = 976;BA.debugLine="LabelSeviyeIsmi6.TextSize = 20";
Debug.ShouldStop(32768);
programveri.mostCurrent._labelseviyeismi6.runMethod(true,"setTextSize",BA.numberCast(float.class, 20));
 BA.debugLineNum = 977;BA.debugLine="LabelSeviyeIsmi6.Typeface = Typeface.DEFAULT_BOLD";
Debug.ShouldStop(65536);
programveri.mostCurrent._labelseviyeismi6.runMethod(false,"setTypeface",programveri.mostCurrent.__c.getField(false,"Typeface").getField(false,"DEFAULT_BOLD"));
 BA.debugLineNum = 979;BA.debugLine="LabelSeviyeIsmi7.TextColor = Colors.White";
Debug.ShouldStop(262144);
programveri.mostCurrent._labelseviyeismi7.runMethod(true,"setTextColor",programveri.mostCurrent.__c.getField(false,"Colors").getField(true,"White"));
 BA.debugLineNum = 980;BA.debugLine="LabelSeviyeIsmi7.TextSize = 20";
Debug.ShouldStop(524288);
programveri.mostCurrent._labelseviyeismi7.runMethod(true,"setTextSize",BA.numberCast(float.class, 20));
 BA.debugLineNum = 981;BA.debugLine="LabelSeviyeIsmi7.Typeface = Typeface.DEFAULT_BOLD";
Debug.ShouldStop(1048576);
programveri.mostCurrent._labelseviyeismi7.runMethod(false,"setTypeface",programveri.mostCurrent.__c.getField(false,"Typeface").getField(false,"DEFAULT_BOLD"));
 BA.debugLineNum = 983;BA.debugLine="LabelSeviyeIsmi8.TextColor = Colors.White";
Debug.ShouldStop(4194304);
programveri.mostCurrent._labelseviyeismi8.runMethod(true,"setTextColor",programveri.mostCurrent.__c.getField(false,"Colors").getField(true,"White"));
 BA.debugLineNum = 984;BA.debugLine="LabelSeviyeIsmi8.TextSize = 20";
Debug.ShouldStop(8388608);
programveri.mostCurrent._labelseviyeismi8.runMethod(true,"setTextSize",BA.numberCast(float.class, 20));
 BA.debugLineNum = 985;BA.debugLine="LabelSeviyeIsmi8.Typeface = Typeface.DEFAULT_BOLD";
Debug.ShouldStop(16777216);
programveri.mostCurrent._labelseviyeismi8.runMethod(false,"setTypeface",programveri.mostCurrent.__c.getField(false,"Typeface").getField(false,"DEFAULT_BOLD"));
 BA.debugLineNum = 987;BA.debugLine="LabelSeviyeIsmi9.TextColor = Colors.White";
Debug.ShouldStop(67108864);
programveri.mostCurrent._labelseviyeismi9.runMethod(true,"setTextColor",programveri.mostCurrent.__c.getField(false,"Colors").getField(true,"White"));
 BA.debugLineNum = 988;BA.debugLine="LabelSeviyeIsmi9.TextSize = 20";
Debug.ShouldStop(134217728);
programveri.mostCurrent._labelseviyeismi9.runMethod(true,"setTextSize",BA.numberCast(float.class, 20));
 BA.debugLineNum = 989;BA.debugLine="LabelSeviyeIsmi9.Typeface = Typeface.DEFAULT_BOLD";
Debug.ShouldStop(268435456);
programveri.mostCurrent._labelseviyeismi9.runMethod(false,"setTypeface",programveri.mostCurrent.__c.getField(false,"Typeface").getField(false,"DEFAULT_BOLD"));
 BA.debugLineNum = 991;BA.debugLine="LabelSeviyeIsmi10.TextColor = Colors.White";
Debug.ShouldStop(1073741824);
programveri.mostCurrent._labelseviyeismi10.runMethod(true,"setTextColor",programveri.mostCurrent.__c.getField(false,"Colors").getField(true,"White"));
 BA.debugLineNum = 992;BA.debugLine="LabelSeviyeIsmi10.TextSize = 20";
Debug.ShouldStop(-2147483648);
programveri.mostCurrent._labelseviyeismi10.runMethod(true,"setTextSize",BA.numberCast(float.class, 20));
 BA.debugLineNum = 993;BA.debugLine="LabelSeviyeIsmi10.Typeface = Typeface.DEFAULT_BOL";
Debug.ShouldStop(1);
programveri.mostCurrent._labelseviyeismi10.runMethod(false,"setTypeface",programveri.mostCurrent.__c.getField(false,"Typeface").getField(false,"DEFAULT_BOLD"));
 BA.debugLineNum = 995;BA.debugLine="LabelSeviyeIsmi11.TextColor = Colors.White";
Debug.ShouldStop(4);
programveri.mostCurrent._labelseviyeismi11.runMethod(true,"setTextColor",programveri.mostCurrent.__c.getField(false,"Colors").getField(true,"White"));
 BA.debugLineNum = 996;BA.debugLine="LabelSeviyeIsmi11.TextSize = 20";
Debug.ShouldStop(8);
programveri.mostCurrent._labelseviyeismi11.runMethod(true,"setTextSize",BA.numberCast(float.class, 20));
 BA.debugLineNum = 997;BA.debugLine="LabelSeviyeIsmi11.Typeface = Typeface.DEFAULT_BOL";
Debug.ShouldStop(16);
programveri.mostCurrent._labelseviyeismi11.runMethod(false,"setTypeface",programveri.mostCurrent.__c.getField(false,"Typeface").getField(false,"DEFAULT_BOLD"));
 BA.debugLineNum = 999;BA.debugLine="LabelSeviyeIsmi12.TextColor = Colors.White";
Debug.ShouldStop(64);
programveri.mostCurrent._labelseviyeismi12.runMethod(true,"setTextColor",programveri.mostCurrent.__c.getField(false,"Colors").getField(true,"White"));
 BA.debugLineNum = 1000;BA.debugLine="LabelSeviyeIsmi12.TextSize = 20";
Debug.ShouldStop(128);
programveri.mostCurrent._labelseviyeismi12.runMethod(true,"setTextSize",BA.numberCast(float.class, 20));
 BA.debugLineNum = 1001;BA.debugLine="LabelSeviyeIsmi12.Typeface = Typeface.DEFAULT_BOL";
Debug.ShouldStop(256);
programveri.mostCurrent._labelseviyeismi12.runMethod(false,"setTypeface",programveri.mostCurrent.__c.getField(false,"Typeface").getField(false,"DEFAULT_BOLD"));
 BA.debugLineNum = 1003;BA.debugLine="LabelSeviyeIsmi13.TextColor = Colors.White";
Debug.ShouldStop(1024);
programveri.mostCurrent._labelseviyeismi13.runMethod(true,"setTextColor",programveri.mostCurrent.__c.getField(false,"Colors").getField(true,"White"));
 BA.debugLineNum = 1004;BA.debugLine="LabelSeviyeIsmi13.TextSize = 20";
Debug.ShouldStop(2048);
programveri.mostCurrent._labelseviyeismi13.runMethod(true,"setTextSize",BA.numberCast(float.class, 20));
 BA.debugLineNum = 1005;BA.debugLine="LabelSeviyeIsmi13.Typeface = Typeface.DEFAULT_BOL";
Debug.ShouldStop(4096);
programveri.mostCurrent._labelseviyeismi13.runMethod(false,"setTypeface",programveri.mostCurrent.__c.getField(false,"Typeface").getField(false,"DEFAULT_BOLD"));
 BA.debugLineNum = 1007;BA.debugLine="LabelSeviyeIsmi14.TextColor = Colors.White";
Debug.ShouldStop(16384);
programveri.mostCurrent._labelseviyeismi14.runMethod(true,"setTextColor",programveri.mostCurrent.__c.getField(false,"Colors").getField(true,"White"));
 BA.debugLineNum = 1008;BA.debugLine="LabelSeviyeIsmi14.TextSize = 20";
Debug.ShouldStop(32768);
programveri.mostCurrent._labelseviyeismi14.runMethod(true,"setTextSize",BA.numberCast(float.class, 20));
 BA.debugLineNum = 1009;BA.debugLine="LabelSeviyeIsmi14.Typeface = Typeface.DEFAULT_BOL";
Debug.ShouldStop(65536);
programveri.mostCurrent._labelseviyeismi14.runMethod(false,"setTypeface",programveri.mostCurrent.__c.getField(false,"Typeface").getField(false,"DEFAULT_BOLD"));
 BA.debugLineNum = 1011;BA.debugLine="LabelSeviyeIsmi15.TextColor = Colors.White";
Debug.ShouldStop(262144);
programveri.mostCurrent._labelseviyeismi15.runMethod(true,"setTextColor",programveri.mostCurrent.__c.getField(false,"Colors").getField(true,"White"));
 BA.debugLineNum = 1012;BA.debugLine="LabelSeviyeIsmi15.TextSize = 20";
Debug.ShouldStop(524288);
programveri.mostCurrent._labelseviyeismi15.runMethod(true,"setTextSize",BA.numberCast(float.class, 20));
 BA.debugLineNum = 1013;BA.debugLine="LabelSeviyeIsmi15.Typeface = Typeface.DEFAULT_BOL";
Debug.ShouldStop(1048576);
programveri.mostCurrent._labelseviyeismi15.runMethod(false,"setTypeface",programveri.mostCurrent.__c.getField(false,"Typeface").getField(false,"DEFAULT_BOLD"));
 BA.debugLineNum = 1015;BA.debugLine="LabelSeviyeIsmi16.TextColor = Colors.White";
Debug.ShouldStop(4194304);
programveri.mostCurrent._labelseviyeismi16.runMethod(true,"setTextColor",programveri.mostCurrent.__c.getField(false,"Colors").getField(true,"White"));
 BA.debugLineNum = 1016;BA.debugLine="LabelSeviyeIsmi16.TextSize = 20";
Debug.ShouldStop(8388608);
programveri.mostCurrent._labelseviyeismi16.runMethod(true,"setTextSize",BA.numberCast(float.class, 20));
 BA.debugLineNum = 1017;BA.debugLine="LabelSeviyeIsmi16.Typeface = Typeface.DEFAULT_BOL";
Debug.ShouldStop(16777216);
programveri.mostCurrent._labelseviyeismi16.runMethod(false,"setTypeface",programveri.mostCurrent.__c.getField(false,"Typeface").getField(false,"DEFAULT_BOLD"));
 BA.debugLineNum = 1019;BA.debugLine="LabelSeviyeIsmi17.TextColor = Colors.White";
Debug.ShouldStop(67108864);
programveri.mostCurrent._labelseviyeismi17.runMethod(true,"setTextColor",programveri.mostCurrent.__c.getField(false,"Colors").getField(true,"White"));
 BA.debugLineNum = 1020;BA.debugLine="LabelSeviyeIsmi17.TextSize = 20";
Debug.ShouldStop(134217728);
programveri.mostCurrent._labelseviyeismi17.runMethod(true,"setTextSize",BA.numberCast(float.class, 20));
 BA.debugLineNum = 1021;BA.debugLine="LabelSeviyeIsmi17.Typeface = Typeface.DEFAULT_BOL";
Debug.ShouldStop(268435456);
programveri.mostCurrent._labelseviyeismi17.runMethod(false,"setTypeface",programveri.mostCurrent.__c.getField(false,"Typeface").getField(false,"DEFAULT_BOLD"));
 BA.debugLineNum = 1023;BA.debugLine="LabelSeviyeIsmi18.TextColor = Colors.White";
Debug.ShouldStop(1073741824);
programveri.mostCurrent._labelseviyeismi18.runMethod(true,"setTextColor",programveri.mostCurrent.__c.getField(false,"Colors").getField(true,"White"));
 BA.debugLineNum = 1024;BA.debugLine="LabelSeviyeIsmi18.TextSize = 20";
Debug.ShouldStop(-2147483648);
programveri.mostCurrent._labelseviyeismi18.runMethod(true,"setTextSize",BA.numberCast(float.class, 20));
 BA.debugLineNum = 1025;BA.debugLine="LabelSeviyeIsmi18.Typeface = Typeface.DEFAULT_BOL";
Debug.ShouldStop(1);
programveri.mostCurrent._labelseviyeismi18.runMethod(false,"setTypeface",programveri.mostCurrent.__c.getField(false,"Typeface").getField(false,"DEFAULT_BOLD"));
 BA.debugLineNum = 1027;BA.debugLine="LabelSeviyeIsmi19.TextColor = Colors.White";
Debug.ShouldStop(4);
programveri.mostCurrent._labelseviyeismi19.runMethod(true,"setTextColor",programveri.mostCurrent.__c.getField(false,"Colors").getField(true,"White"));
 BA.debugLineNum = 1028;BA.debugLine="LabelSeviyeIsmi19.TextSize = 20";
Debug.ShouldStop(8);
programveri.mostCurrent._labelseviyeismi19.runMethod(true,"setTextSize",BA.numberCast(float.class, 20));
 BA.debugLineNum = 1029;BA.debugLine="LabelSeviyeIsmi19.Typeface = Typeface.DEFAULT_BOL";
Debug.ShouldStop(16);
programveri.mostCurrent._labelseviyeismi19.runMethod(false,"setTypeface",programveri.mostCurrent.__c.getField(false,"Typeface").getField(false,"DEFAULT_BOLD"));
 BA.debugLineNum = 1031;BA.debugLine="LabelSeviyeIsmi20.TextColor = Colors.White";
Debug.ShouldStop(64);
programveri.mostCurrent._labelseviyeismi20.runMethod(true,"setTextColor",programveri.mostCurrent.__c.getField(false,"Colors").getField(true,"White"));
 BA.debugLineNum = 1032;BA.debugLine="LabelSeviyeIsmi20.TextSize = 20";
Debug.ShouldStop(128);
programveri.mostCurrent._labelseviyeismi20.runMethod(true,"setTextSize",BA.numberCast(float.class, 20));
 BA.debugLineNum = 1033;BA.debugLine="LabelSeviyeIsmi20.Typeface = Typeface.DEFAULT_BOL";
Debug.ShouldStop(256);
programveri.mostCurrent._labelseviyeismi20.runMethod(false,"setTypeface",programveri.mostCurrent.__c.getField(false,"Typeface").getField(false,"DEFAULT_BOLD"));
 BA.debugLineNum = 1035;BA.debugLine="LabelSeviyeIsmi21.TextColor = Colors.White";
Debug.ShouldStop(1024);
programveri.mostCurrent._labelseviyeismi21.runMethod(true,"setTextColor",programveri.mostCurrent.__c.getField(false,"Colors").getField(true,"White"));
 BA.debugLineNum = 1036;BA.debugLine="LabelSeviyeIsmi21.TextSize = 20";
Debug.ShouldStop(2048);
programveri.mostCurrent._labelseviyeismi21.runMethod(true,"setTextSize",BA.numberCast(float.class, 20));
 BA.debugLineNum = 1037;BA.debugLine="LabelSeviyeIsmi21.Typeface = Typeface.DEFAULT_BOL";
Debug.ShouldStop(4096);
programveri.mostCurrent._labelseviyeismi21.runMethod(false,"setTypeface",programveri.mostCurrent.__c.getField(false,"Typeface").getField(false,"DEFAULT_BOLD"));
 BA.debugLineNum = 1039;BA.debugLine="LabelSeviyeIsmi22.TextColor = Colors.White";
Debug.ShouldStop(16384);
programveri.mostCurrent._labelseviyeismi22.runMethod(true,"setTextColor",programveri.mostCurrent.__c.getField(false,"Colors").getField(true,"White"));
 BA.debugLineNum = 1040;BA.debugLine="LabelSeviyeIsmi22.TextSize = 20";
Debug.ShouldStop(32768);
programveri.mostCurrent._labelseviyeismi22.runMethod(true,"setTextSize",BA.numberCast(float.class, 20));
 BA.debugLineNum = 1041;BA.debugLine="LabelSeviyeIsmi22.Typeface = Typeface.DEFAULT_BOL";
Debug.ShouldStop(65536);
programveri.mostCurrent._labelseviyeismi22.runMethod(false,"setTypeface",programveri.mostCurrent.__c.getField(false,"Typeface").getField(false,"DEFAULT_BOLD"));
 BA.debugLineNum = 1043;BA.debugLine="LabelSeviyeIsmi23.TextColor = Colors.White";
Debug.ShouldStop(262144);
programveri.mostCurrent._labelseviyeismi23.runMethod(true,"setTextColor",programveri.mostCurrent.__c.getField(false,"Colors").getField(true,"White"));
 BA.debugLineNum = 1044;BA.debugLine="LabelSeviyeIsmi23.TextSize = 20";
Debug.ShouldStop(524288);
programveri.mostCurrent._labelseviyeismi23.runMethod(true,"setTextSize",BA.numberCast(float.class, 20));
 BA.debugLineNum = 1045;BA.debugLine="LabelSeviyeIsmi23.Typeface = Typeface.DEFAULT_BOL";
Debug.ShouldStop(1048576);
programveri.mostCurrent._labelseviyeismi23.runMethod(false,"setTypeface",programveri.mostCurrent.__c.getField(false,"Typeface").getField(false,"DEFAULT_BOLD"));
 BA.debugLineNum = 1047;BA.debugLine="LabelSeviyeIsmi24.TextColor = Colors.White";
Debug.ShouldStop(4194304);
programveri.mostCurrent._labelseviyeismi24.runMethod(true,"setTextColor",programveri.mostCurrent.__c.getField(false,"Colors").getField(true,"White"));
 BA.debugLineNum = 1048;BA.debugLine="LabelSeviyeIsmi24.TextSize = 20";
Debug.ShouldStop(8388608);
programveri.mostCurrent._labelseviyeismi24.runMethod(true,"setTextSize",BA.numberCast(float.class, 20));
 BA.debugLineNum = 1049;BA.debugLine="LabelSeviyeIsmi24.Typeface = Typeface.DEFAULT_BOL";
Debug.ShouldStop(16777216);
programveri.mostCurrent._labelseviyeismi24.runMethod(false,"setTypeface",programveri.mostCurrent.__c.getField(false,"Typeface").getField(false,"DEFAULT_BOLD"));
 BA.debugLineNum = 1051;BA.debugLine="LabelSeviyeIsmi25.TextColor = Colors.White";
Debug.ShouldStop(67108864);
programveri.mostCurrent._labelseviyeismi25.runMethod(true,"setTextColor",programveri.mostCurrent.__c.getField(false,"Colors").getField(true,"White"));
 BA.debugLineNum = 1052;BA.debugLine="LabelSeviyeIsmi25.TextSize = 20";
Debug.ShouldStop(134217728);
programveri.mostCurrent._labelseviyeismi25.runMethod(true,"setTextSize",BA.numberCast(float.class, 20));
 BA.debugLineNum = 1053;BA.debugLine="LabelSeviyeIsmi25.Typeface = Typeface.DEFAULT_BOL";
Debug.ShouldStop(268435456);
programveri.mostCurrent._labelseviyeismi25.runMethod(false,"setTypeface",programveri.mostCurrent.__c.getField(false,"Typeface").getField(false,"DEFAULT_BOLD"));
 BA.debugLineNum = 1057;BA.debugLine="LabelHiz1.TextColor = Colors.White";
Debug.ShouldStop(1);
programveri.mostCurrent._labelhiz1.runMethod(true,"setTextColor",programveri.mostCurrent.__c.getField(false,"Colors").getField(true,"White"));
 BA.debugLineNum = 1058;BA.debugLine="LabelHiz1.TextSize = 20";
Debug.ShouldStop(2);
programveri.mostCurrent._labelhiz1.runMethod(true,"setTextSize",BA.numberCast(float.class, 20));
 BA.debugLineNum = 1059;BA.debugLine="LabelHiz1.Typeface = Typeface.DEFAULT_BOLD";
Debug.ShouldStop(4);
programveri.mostCurrent._labelhiz1.runMethod(false,"setTypeface",programveri.mostCurrent.__c.getField(false,"Typeface").getField(false,"DEFAULT_BOLD"));
 BA.debugLineNum = 1061;BA.debugLine="LabelHiz2.TextColor = Colors.White";
Debug.ShouldStop(16);
programveri.mostCurrent._labelhiz2.runMethod(true,"setTextColor",programveri.mostCurrent.__c.getField(false,"Colors").getField(true,"White"));
 BA.debugLineNum = 1062;BA.debugLine="LabelHiz2.TextSize = 20";
Debug.ShouldStop(32);
programveri.mostCurrent._labelhiz2.runMethod(true,"setTextSize",BA.numberCast(float.class, 20));
 BA.debugLineNum = 1063;BA.debugLine="LabelHiz2.Typeface = Typeface.DEFAULT_BOLD";
Debug.ShouldStop(64);
programveri.mostCurrent._labelhiz2.runMethod(false,"setTypeface",programveri.mostCurrent.__c.getField(false,"Typeface").getField(false,"DEFAULT_BOLD"));
 BA.debugLineNum = 1065;BA.debugLine="LabelHiz3.TextColor = Colors.White";
Debug.ShouldStop(256);
programveri.mostCurrent._labelhiz3.runMethod(true,"setTextColor",programveri.mostCurrent.__c.getField(false,"Colors").getField(true,"White"));
 BA.debugLineNum = 1066;BA.debugLine="LabelHiz3.TextSize = 20";
Debug.ShouldStop(512);
programveri.mostCurrent._labelhiz3.runMethod(true,"setTextSize",BA.numberCast(float.class, 20));
 BA.debugLineNum = 1067;BA.debugLine="LabelHiz3.Typeface = Typeface.DEFAULT_BOLD";
Debug.ShouldStop(1024);
programveri.mostCurrent._labelhiz3.runMethod(false,"setTypeface",programveri.mostCurrent.__c.getField(false,"Typeface").getField(false,"DEFAULT_BOLD"));
 BA.debugLineNum = 1069;BA.debugLine="LabelHiz4.TextColor = Colors.White";
Debug.ShouldStop(4096);
programveri.mostCurrent._labelhiz4.runMethod(true,"setTextColor",programveri.mostCurrent.__c.getField(false,"Colors").getField(true,"White"));
 BA.debugLineNum = 1070;BA.debugLine="LabelHiz4.TextSize = 20";
Debug.ShouldStop(8192);
programveri.mostCurrent._labelhiz4.runMethod(true,"setTextSize",BA.numberCast(float.class, 20));
 BA.debugLineNum = 1071;BA.debugLine="LabelHiz4.Typeface = Typeface.DEFAULT_BOLD";
Debug.ShouldStop(16384);
programveri.mostCurrent._labelhiz4.runMethod(false,"setTypeface",programveri.mostCurrent.__c.getField(false,"Typeface").getField(false,"DEFAULT_BOLD"));
 BA.debugLineNum = 1073;BA.debugLine="LabelHiz5.TextColor = Colors.White";
Debug.ShouldStop(65536);
programveri.mostCurrent._labelhiz5.runMethod(true,"setTextColor",programveri.mostCurrent.__c.getField(false,"Colors").getField(true,"White"));
 BA.debugLineNum = 1074;BA.debugLine="LabelHiz5.TextSize = 20";
Debug.ShouldStop(131072);
programveri.mostCurrent._labelhiz5.runMethod(true,"setTextSize",BA.numberCast(float.class, 20));
 BA.debugLineNum = 1075;BA.debugLine="LabelHiz5.Typeface = Typeface.DEFAULT_BOLD";
Debug.ShouldStop(262144);
programveri.mostCurrent._labelhiz5.runMethod(false,"setTypeface",programveri.mostCurrent.__c.getField(false,"Typeface").getField(false,"DEFAULT_BOLD"));
 BA.debugLineNum = 1077;BA.debugLine="LabelHiz6.TextColor = Colors.White";
Debug.ShouldStop(1048576);
programveri.mostCurrent._labelhiz6.runMethod(true,"setTextColor",programveri.mostCurrent.__c.getField(false,"Colors").getField(true,"White"));
 BA.debugLineNum = 1078;BA.debugLine="LabelHiz6.TextSize = 20";
Debug.ShouldStop(2097152);
programveri.mostCurrent._labelhiz6.runMethod(true,"setTextSize",BA.numberCast(float.class, 20));
 BA.debugLineNum = 1079;BA.debugLine="LabelHiz6.Typeface = Typeface.DEFAULT_BOLD";
Debug.ShouldStop(4194304);
programveri.mostCurrent._labelhiz6.runMethod(false,"setTypeface",programveri.mostCurrent.__c.getField(false,"Typeface").getField(false,"DEFAULT_BOLD"));
 BA.debugLineNum = 1081;BA.debugLine="LabelHiz7.TextColor = Colors.White";
Debug.ShouldStop(16777216);
programveri.mostCurrent._labelhiz7.runMethod(true,"setTextColor",programveri.mostCurrent.__c.getField(false,"Colors").getField(true,"White"));
 BA.debugLineNum = 1082;BA.debugLine="LabelHiz7.TextSize = 20";
Debug.ShouldStop(33554432);
programveri.mostCurrent._labelhiz7.runMethod(true,"setTextSize",BA.numberCast(float.class, 20));
 BA.debugLineNum = 1083;BA.debugLine="LabelHiz7.Typeface = Typeface.DEFAULT_BOLD";
Debug.ShouldStop(67108864);
programveri.mostCurrent._labelhiz7.runMethod(false,"setTypeface",programveri.mostCurrent.__c.getField(false,"Typeface").getField(false,"DEFAULT_BOLD"));
 BA.debugLineNum = 1085;BA.debugLine="LabelHiz8.TextColor = Colors.White";
Debug.ShouldStop(268435456);
programveri.mostCurrent._labelhiz8.runMethod(true,"setTextColor",programveri.mostCurrent.__c.getField(false,"Colors").getField(true,"White"));
 BA.debugLineNum = 1086;BA.debugLine="LabelHiz8.TextSize = 20";
Debug.ShouldStop(536870912);
programveri.mostCurrent._labelhiz8.runMethod(true,"setTextSize",BA.numberCast(float.class, 20));
 BA.debugLineNum = 1087;BA.debugLine="LabelHiz8.Typeface = Typeface.DEFAULT_BOLD";
Debug.ShouldStop(1073741824);
programveri.mostCurrent._labelhiz8.runMethod(false,"setTypeface",programveri.mostCurrent.__c.getField(false,"Typeface").getField(false,"DEFAULT_BOLD"));
 BA.debugLineNum = 1089;BA.debugLine="LabelHiz9.TextColor = Colors.White";
Debug.ShouldStop(1);
programveri.mostCurrent._labelhiz9.runMethod(true,"setTextColor",programveri.mostCurrent.__c.getField(false,"Colors").getField(true,"White"));
 BA.debugLineNum = 1090;BA.debugLine="LabelHiz9.TextSize = 20";
Debug.ShouldStop(2);
programveri.mostCurrent._labelhiz9.runMethod(true,"setTextSize",BA.numberCast(float.class, 20));
 BA.debugLineNum = 1091;BA.debugLine="LabelHiz9.Typeface = Typeface.DEFAULT_BOLD";
Debug.ShouldStop(4);
programveri.mostCurrent._labelhiz9.runMethod(false,"setTypeface",programveri.mostCurrent.__c.getField(false,"Typeface").getField(false,"DEFAULT_BOLD"));
 BA.debugLineNum = 1093;BA.debugLine="LabelHiz10.TextColor = Colors.White";
Debug.ShouldStop(16);
programveri.mostCurrent._labelhiz10.runMethod(true,"setTextColor",programveri.mostCurrent.__c.getField(false,"Colors").getField(true,"White"));
 BA.debugLineNum = 1094;BA.debugLine="LabelHiz10.TextSize = 20";
Debug.ShouldStop(32);
programveri.mostCurrent._labelhiz10.runMethod(true,"setTextSize",BA.numberCast(float.class, 20));
 BA.debugLineNum = 1095;BA.debugLine="LabelHiz10.Typeface = Typeface.DEFAULT_BOLD";
Debug.ShouldStop(64);
programveri.mostCurrent._labelhiz10.runMethod(false,"setTypeface",programveri.mostCurrent.__c.getField(false,"Typeface").getField(false,"DEFAULT_BOLD"));
 BA.debugLineNum = 1097;BA.debugLine="LabelHiz11.TextColor = Colors.White";
Debug.ShouldStop(256);
programveri.mostCurrent._labelhiz11.runMethod(true,"setTextColor",programveri.mostCurrent.__c.getField(false,"Colors").getField(true,"White"));
 BA.debugLineNum = 1098;BA.debugLine="LabelHiz11.TextSize = 20";
Debug.ShouldStop(512);
programveri.mostCurrent._labelhiz11.runMethod(true,"setTextSize",BA.numberCast(float.class, 20));
 BA.debugLineNum = 1099;BA.debugLine="LabelHiz11.Typeface = Typeface.DEFAULT_BOLD";
Debug.ShouldStop(1024);
programveri.mostCurrent._labelhiz11.runMethod(false,"setTypeface",programveri.mostCurrent.__c.getField(false,"Typeface").getField(false,"DEFAULT_BOLD"));
 BA.debugLineNum = 1101;BA.debugLine="LabelHiz12.TextColor = Colors.White";
Debug.ShouldStop(4096);
programveri.mostCurrent._labelhiz12.runMethod(true,"setTextColor",programveri.mostCurrent.__c.getField(false,"Colors").getField(true,"White"));
 BA.debugLineNum = 1102;BA.debugLine="LabelHiz12.TextSize = 20";
Debug.ShouldStop(8192);
programveri.mostCurrent._labelhiz12.runMethod(true,"setTextSize",BA.numberCast(float.class, 20));
 BA.debugLineNum = 1103;BA.debugLine="LabelHiz12.Typeface = Typeface.DEFAULT_BOLD";
Debug.ShouldStop(16384);
programveri.mostCurrent._labelhiz12.runMethod(false,"setTypeface",programveri.mostCurrent.__c.getField(false,"Typeface").getField(false,"DEFAULT_BOLD"));
 BA.debugLineNum = 1105;BA.debugLine="LabelHiz13.TextColor = Colors.White";
Debug.ShouldStop(65536);
programveri.mostCurrent._labelhiz13.runMethod(true,"setTextColor",programveri.mostCurrent.__c.getField(false,"Colors").getField(true,"White"));
 BA.debugLineNum = 1106;BA.debugLine="LabelHiz13.TextSize = 20";
Debug.ShouldStop(131072);
programveri.mostCurrent._labelhiz13.runMethod(true,"setTextSize",BA.numberCast(float.class, 20));
 BA.debugLineNum = 1107;BA.debugLine="LabelHiz13.Typeface = Typeface.DEFAULT_BOLD";
Debug.ShouldStop(262144);
programveri.mostCurrent._labelhiz13.runMethod(false,"setTypeface",programveri.mostCurrent.__c.getField(false,"Typeface").getField(false,"DEFAULT_BOLD"));
 BA.debugLineNum = 1109;BA.debugLine="LabelHiz14.TextColor = Colors.White";
Debug.ShouldStop(1048576);
programveri.mostCurrent._labelhiz14.runMethod(true,"setTextColor",programveri.mostCurrent.__c.getField(false,"Colors").getField(true,"White"));
 BA.debugLineNum = 1110;BA.debugLine="LabelHiz14.TextSize = 20";
Debug.ShouldStop(2097152);
programveri.mostCurrent._labelhiz14.runMethod(true,"setTextSize",BA.numberCast(float.class, 20));
 BA.debugLineNum = 1111;BA.debugLine="LabelHiz14.Typeface = Typeface.DEFAULT_BOLD";
Debug.ShouldStop(4194304);
programveri.mostCurrent._labelhiz14.runMethod(false,"setTypeface",programveri.mostCurrent.__c.getField(false,"Typeface").getField(false,"DEFAULT_BOLD"));
 BA.debugLineNum = 1113;BA.debugLine="LabelHiz15.TextColor = Colors.White";
Debug.ShouldStop(16777216);
programveri.mostCurrent._labelhiz15.runMethod(true,"setTextColor",programveri.mostCurrent.__c.getField(false,"Colors").getField(true,"White"));
 BA.debugLineNum = 1114;BA.debugLine="LabelHiz15.TextSize = 20";
Debug.ShouldStop(33554432);
programveri.mostCurrent._labelhiz15.runMethod(true,"setTextSize",BA.numberCast(float.class, 20));
 BA.debugLineNum = 1115;BA.debugLine="LabelHiz15.Typeface = Typeface.DEFAULT_BOLD";
Debug.ShouldStop(67108864);
programveri.mostCurrent._labelhiz15.runMethod(false,"setTypeface",programveri.mostCurrent.__c.getField(false,"Typeface").getField(false,"DEFAULT_BOLD"));
 BA.debugLineNum = 1117;BA.debugLine="LabelHiz16.TextColor = Colors.White";
Debug.ShouldStop(268435456);
programveri.mostCurrent._labelhiz16.runMethod(true,"setTextColor",programveri.mostCurrent.__c.getField(false,"Colors").getField(true,"White"));
 BA.debugLineNum = 1118;BA.debugLine="LabelHiz16.TextSize = 20";
Debug.ShouldStop(536870912);
programveri.mostCurrent._labelhiz16.runMethod(true,"setTextSize",BA.numberCast(float.class, 20));
 BA.debugLineNum = 1119;BA.debugLine="LabelHiz16.Typeface = Typeface.DEFAULT_BOLD";
Debug.ShouldStop(1073741824);
programveri.mostCurrent._labelhiz16.runMethod(false,"setTypeface",programveri.mostCurrent.__c.getField(false,"Typeface").getField(false,"DEFAULT_BOLD"));
 BA.debugLineNum = 1121;BA.debugLine="LabelHiz17.TextColor = Colors.White";
Debug.ShouldStop(1);
programveri.mostCurrent._labelhiz17.runMethod(true,"setTextColor",programveri.mostCurrent.__c.getField(false,"Colors").getField(true,"White"));
 BA.debugLineNum = 1122;BA.debugLine="LabelHiz17.TextSize = 20";
Debug.ShouldStop(2);
programveri.mostCurrent._labelhiz17.runMethod(true,"setTextSize",BA.numberCast(float.class, 20));
 BA.debugLineNum = 1123;BA.debugLine="LabelHiz17.Typeface = Typeface.DEFAULT_BOLD";
Debug.ShouldStop(4);
programveri.mostCurrent._labelhiz17.runMethod(false,"setTypeface",programveri.mostCurrent.__c.getField(false,"Typeface").getField(false,"DEFAULT_BOLD"));
 BA.debugLineNum = 1125;BA.debugLine="LabelHiz18.TextColor = Colors.White";
Debug.ShouldStop(16);
programveri.mostCurrent._labelhiz18.runMethod(true,"setTextColor",programveri.mostCurrent.__c.getField(false,"Colors").getField(true,"White"));
 BA.debugLineNum = 1126;BA.debugLine="LabelHiz18.TextSize = 20";
Debug.ShouldStop(32);
programveri.mostCurrent._labelhiz18.runMethod(true,"setTextSize",BA.numberCast(float.class, 20));
 BA.debugLineNum = 1127;BA.debugLine="LabelHiz18.Typeface = Typeface.DEFAULT_BOLD";
Debug.ShouldStop(64);
programveri.mostCurrent._labelhiz18.runMethod(false,"setTypeface",programveri.mostCurrent.__c.getField(false,"Typeface").getField(false,"DEFAULT_BOLD"));
 BA.debugLineNum = 1129;BA.debugLine="LabelHiz19.TextColor = Colors.White";
Debug.ShouldStop(256);
programveri.mostCurrent._labelhiz19.runMethod(true,"setTextColor",programveri.mostCurrent.__c.getField(false,"Colors").getField(true,"White"));
 BA.debugLineNum = 1130;BA.debugLine="LabelHiz19.TextSize = 20";
Debug.ShouldStop(512);
programveri.mostCurrent._labelhiz19.runMethod(true,"setTextSize",BA.numberCast(float.class, 20));
 BA.debugLineNum = 1131;BA.debugLine="LabelHiz19.Typeface = Typeface.DEFAULT_BOLD";
Debug.ShouldStop(1024);
programveri.mostCurrent._labelhiz19.runMethod(false,"setTypeface",programveri.mostCurrent.__c.getField(false,"Typeface").getField(false,"DEFAULT_BOLD"));
 BA.debugLineNum = 1133;BA.debugLine="LabelHiz20.TextColor = Colors.White";
Debug.ShouldStop(4096);
programveri.mostCurrent._labelhiz20.runMethod(true,"setTextColor",programveri.mostCurrent.__c.getField(false,"Colors").getField(true,"White"));
 BA.debugLineNum = 1134;BA.debugLine="LabelHiz20.TextSize = 20";
Debug.ShouldStop(8192);
programveri.mostCurrent._labelhiz20.runMethod(true,"setTextSize",BA.numberCast(float.class, 20));
 BA.debugLineNum = 1135;BA.debugLine="LabelHiz20.Typeface = Typeface.DEFAULT_BOLD";
Debug.ShouldStop(16384);
programveri.mostCurrent._labelhiz20.runMethod(false,"setTypeface",programveri.mostCurrent.__c.getField(false,"Typeface").getField(false,"DEFAULT_BOLD"));
 BA.debugLineNum = 1137;BA.debugLine="LabelHiz21.TextColor = Colors.White";
Debug.ShouldStop(65536);
programveri.mostCurrent._labelhiz21.runMethod(true,"setTextColor",programveri.mostCurrent.__c.getField(false,"Colors").getField(true,"White"));
 BA.debugLineNum = 1138;BA.debugLine="LabelHiz21.TextSize = 20";
Debug.ShouldStop(131072);
programveri.mostCurrent._labelhiz21.runMethod(true,"setTextSize",BA.numberCast(float.class, 20));
 BA.debugLineNum = 1139;BA.debugLine="LabelHiz21.Typeface = Typeface.DEFAULT_BOLD";
Debug.ShouldStop(262144);
programveri.mostCurrent._labelhiz21.runMethod(false,"setTypeface",programveri.mostCurrent.__c.getField(false,"Typeface").getField(false,"DEFAULT_BOLD"));
 BA.debugLineNum = 1141;BA.debugLine="LabelHiz22.TextColor = Colors.White";
Debug.ShouldStop(1048576);
programveri.mostCurrent._labelhiz22.runMethod(true,"setTextColor",programveri.mostCurrent.__c.getField(false,"Colors").getField(true,"White"));
 BA.debugLineNum = 1142;BA.debugLine="LabelHiz22.TextSize = 20";
Debug.ShouldStop(2097152);
programveri.mostCurrent._labelhiz22.runMethod(true,"setTextSize",BA.numberCast(float.class, 20));
 BA.debugLineNum = 1143;BA.debugLine="LabelHiz22.Typeface = Typeface.DEFAULT_BOLD";
Debug.ShouldStop(4194304);
programveri.mostCurrent._labelhiz22.runMethod(false,"setTypeface",programveri.mostCurrent.__c.getField(false,"Typeface").getField(false,"DEFAULT_BOLD"));
 BA.debugLineNum = 1145;BA.debugLine="LabelHiz23.TextColor = Colors.White";
Debug.ShouldStop(16777216);
programveri.mostCurrent._labelhiz23.runMethod(true,"setTextColor",programveri.mostCurrent.__c.getField(false,"Colors").getField(true,"White"));
 BA.debugLineNum = 1146;BA.debugLine="LabelHiz23.TextSize = 20";
Debug.ShouldStop(33554432);
programveri.mostCurrent._labelhiz23.runMethod(true,"setTextSize",BA.numberCast(float.class, 20));
 BA.debugLineNum = 1147;BA.debugLine="LabelHiz23.Typeface = Typeface.DEFAULT_BOLD";
Debug.ShouldStop(67108864);
programveri.mostCurrent._labelhiz23.runMethod(false,"setTypeface",programveri.mostCurrent.__c.getField(false,"Typeface").getField(false,"DEFAULT_BOLD"));
 BA.debugLineNum = 1149;BA.debugLine="LabelHiz24.TextColor = Colors.White";
Debug.ShouldStop(268435456);
programveri.mostCurrent._labelhiz24.runMethod(true,"setTextColor",programveri.mostCurrent.__c.getField(false,"Colors").getField(true,"White"));
 BA.debugLineNum = 1150;BA.debugLine="LabelHiz24.TextSize = 20";
Debug.ShouldStop(536870912);
programveri.mostCurrent._labelhiz24.runMethod(true,"setTextSize",BA.numberCast(float.class, 20));
 BA.debugLineNum = 1151;BA.debugLine="LabelHiz24.Typeface = Typeface.DEFAULT_BOLD";
Debug.ShouldStop(1073741824);
programveri.mostCurrent._labelhiz24.runMethod(false,"setTypeface",programveri.mostCurrent.__c.getField(false,"Typeface").getField(false,"DEFAULT_BOLD"));
 BA.debugLineNum = 1153;BA.debugLine="LabelHiz25.TextColor = Colors.White";
Debug.ShouldStop(1);
programveri.mostCurrent._labelhiz25.runMethod(true,"setTextColor",programveri.mostCurrent.__c.getField(false,"Colors").getField(true,"White"));
 BA.debugLineNum = 1154;BA.debugLine="LabelHiz25.TextSize = 20";
Debug.ShouldStop(2);
programveri.mostCurrent._labelhiz25.runMethod(true,"setTextSize",BA.numberCast(float.class, 20));
 BA.debugLineNum = 1155;BA.debugLine="LabelHiz25.Typeface = Typeface.DEFAULT_BOLD";
Debug.ShouldStop(4);
programveri.mostCurrent._labelhiz25.runMethod(false,"setTypeface",programveri.mostCurrent.__c.getField(false,"Typeface").getField(false,"DEFAULT_BOLD"));
 BA.debugLineNum = 1159;BA.debugLine="LabelDakika1.TextColor = Colors.White";
Debug.ShouldStop(64);
programveri.mostCurrent._labeldakika1.runMethod(true,"setTextColor",programveri.mostCurrent.__c.getField(false,"Colors").getField(true,"White"));
 BA.debugLineNum = 1160;BA.debugLine="LabelDakika1.TextSize = 20";
Debug.ShouldStop(128);
programveri.mostCurrent._labeldakika1.runMethod(true,"setTextSize",BA.numberCast(float.class, 20));
 BA.debugLineNum = 1161;BA.debugLine="LabelDakika1.Typeface = Typeface.DEFAULT_BOLD";
Debug.ShouldStop(256);
programveri.mostCurrent._labeldakika1.runMethod(false,"setTypeface",programveri.mostCurrent.__c.getField(false,"Typeface").getField(false,"DEFAULT_BOLD"));
 BA.debugLineNum = 1163;BA.debugLine="LabelDakika2.TextColor = Colors.White";
Debug.ShouldStop(1024);
programveri.mostCurrent._labeldakika2.runMethod(true,"setTextColor",programveri.mostCurrent.__c.getField(false,"Colors").getField(true,"White"));
 BA.debugLineNum = 1164;BA.debugLine="LabelDakika2.TextSize = 20";
Debug.ShouldStop(2048);
programveri.mostCurrent._labeldakika2.runMethod(true,"setTextSize",BA.numberCast(float.class, 20));
 BA.debugLineNum = 1165;BA.debugLine="LabelDakika2.Typeface = Typeface.DEFAULT_BOLD";
Debug.ShouldStop(4096);
programveri.mostCurrent._labeldakika2.runMethod(false,"setTypeface",programveri.mostCurrent.__c.getField(false,"Typeface").getField(false,"DEFAULT_BOLD"));
 BA.debugLineNum = 1167;BA.debugLine="LabelDakika3.TextColor = Colors.White";
Debug.ShouldStop(16384);
programveri.mostCurrent._labeldakika3.runMethod(true,"setTextColor",programveri.mostCurrent.__c.getField(false,"Colors").getField(true,"White"));
 BA.debugLineNum = 1168;BA.debugLine="LabelDakika3.TextSize = 20";
Debug.ShouldStop(32768);
programveri.mostCurrent._labeldakika3.runMethod(true,"setTextSize",BA.numberCast(float.class, 20));
 BA.debugLineNum = 1169;BA.debugLine="LabelDakika3.Typeface = Typeface.DEFAULT_BOLD";
Debug.ShouldStop(65536);
programveri.mostCurrent._labeldakika3.runMethod(false,"setTypeface",programveri.mostCurrent.__c.getField(false,"Typeface").getField(false,"DEFAULT_BOLD"));
 BA.debugLineNum = 1171;BA.debugLine="LabelDakika4.TextColor = Colors.White";
Debug.ShouldStop(262144);
programveri.mostCurrent._labeldakika4.runMethod(true,"setTextColor",programveri.mostCurrent.__c.getField(false,"Colors").getField(true,"White"));
 BA.debugLineNum = 1172;BA.debugLine="LabelDakika4.TextSize = 20";
Debug.ShouldStop(524288);
programveri.mostCurrent._labeldakika4.runMethod(true,"setTextSize",BA.numberCast(float.class, 20));
 BA.debugLineNum = 1173;BA.debugLine="LabelDakika4.Typeface = Typeface.DEFAULT_BOLD";
Debug.ShouldStop(1048576);
programveri.mostCurrent._labeldakika4.runMethod(false,"setTypeface",programveri.mostCurrent.__c.getField(false,"Typeface").getField(false,"DEFAULT_BOLD"));
 BA.debugLineNum = 1175;BA.debugLine="LabelDakika5.TextColor = Colors.White";
Debug.ShouldStop(4194304);
programveri.mostCurrent._labeldakika5.runMethod(true,"setTextColor",programveri.mostCurrent.__c.getField(false,"Colors").getField(true,"White"));
 BA.debugLineNum = 1176;BA.debugLine="LabelDakika5.TextSize = 20";
Debug.ShouldStop(8388608);
programveri.mostCurrent._labeldakika5.runMethod(true,"setTextSize",BA.numberCast(float.class, 20));
 BA.debugLineNum = 1177;BA.debugLine="LabelDakika5.Typeface = Typeface.DEFAULT_BOLD";
Debug.ShouldStop(16777216);
programveri.mostCurrent._labeldakika5.runMethod(false,"setTypeface",programveri.mostCurrent.__c.getField(false,"Typeface").getField(false,"DEFAULT_BOLD"));
 BA.debugLineNum = 1179;BA.debugLine="LabelDakika6.TextColor = Colors.White";
Debug.ShouldStop(67108864);
programveri.mostCurrent._labeldakika6.runMethod(true,"setTextColor",programveri.mostCurrent.__c.getField(false,"Colors").getField(true,"White"));
 BA.debugLineNum = 1180;BA.debugLine="LabelDakika6.TextSize = 20";
Debug.ShouldStop(134217728);
programveri.mostCurrent._labeldakika6.runMethod(true,"setTextSize",BA.numberCast(float.class, 20));
 BA.debugLineNum = 1181;BA.debugLine="LabelDakika6.Typeface = Typeface.DEFAULT_BOLD";
Debug.ShouldStop(268435456);
programveri.mostCurrent._labeldakika6.runMethod(false,"setTypeface",programveri.mostCurrent.__c.getField(false,"Typeface").getField(false,"DEFAULT_BOLD"));
 BA.debugLineNum = 1183;BA.debugLine="LabelDakika7.TextColor = Colors.White";
Debug.ShouldStop(1073741824);
programveri.mostCurrent._labeldakika7.runMethod(true,"setTextColor",programveri.mostCurrent.__c.getField(false,"Colors").getField(true,"White"));
 BA.debugLineNum = 1184;BA.debugLine="LabelDakika7.TextSize = 20";
Debug.ShouldStop(-2147483648);
programveri.mostCurrent._labeldakika7.runMethod(true,"setTextSize",BA.numberCast(float.class, 20));
 BA.debugLineNum = 1185;BA.debugLine="LabelDakika7.Typeface = Typeface.DEFAULT_BOLD";
Debug.ShouldStop(1);
programveri.mostCurrent._labeldakika7.runMethod(false,"setTypeface",programveri.mostCurrent.__c.getField(false,"Typeface").getField(false,"DEFAULT_BOLD"));
 BA.debugLineNum = 1187;BA.debugLine="LabelDakika8.TextColor = Colors.White";
Debug.ShouldStop(4);
programveri.mostCurrent._labeldakika8.runMethod(true,"setTextColor",programveri.mostCurrent.__c.getField(false,"Colors").getField(true,"White"));
 BA.debugLineNum = 1188;BA.debugLine="LabelDakika8.TextSize = 20";
Debug.ShouldStop(8);
programveri.mostCurrent._labeldakika8.runMethod(true,"setTextSize",BA.numberCast(float.class, 20));
 BA.debugLineNum = 1189;BA.debugLine="LabelDakika8.Typeface = Typeface.DEFAULT_BOLD";
Debug.ShouldStop(16);
programveri.mostCurrent._labeldakika8.runMethod(false,"setTypeface",programveri.mostCurrent.__c.getField(false,"Typeface").getField(false,"DEFAULT_BOLD"));
 BA.debugLineNum = 1191;BA.debugLine="LabelDakika9.TextColor = Colors.White";
Debug.ShouldStop(64);
programveri.mostCurrent._labeldakika9.runMethod(true,"setTextColor",programveri.mostCurrent.__c.getField(false,"Colors").getField(true,"White"));
 BA.debugLineNum = 1192;BA.debugLine="LabelDakika9.TextSize = 20";
Debug.ShouldStop(128);
programveri.mostCurrent._labeldakika9.runMethod(true,"setTextSize",BA.numberCast(float.class, 20));
 BA.debugLineNum = 1193;BA.debugLine="LabelDakika9.Typeface = Typeface.DEFAULT_BOLD";
Debug.ShouldStop(256);
programveri.mostCurrent._labeldakika9.runMethod(false,"setTypeface",programveri.mostCurrent.__c.getField(false,"Typeface").getField(false,"DEFAULT_BOLD"));
 BA.debugLineNum = 1195;BA.debugLine="LabelDakika10.TextColor = Colors.White";
Debug.ShouldStop(1024);
programveri.mostCurrent._labeldakika10.runMethod(true,"setTextColor",programveri.mostCurrent.__c.getField(false,"Colors").getField(true,"White"));
 BA.debugLineNum = 1196;BA.debugLine="LabelDakika10.TextSize = 20";
Debug.ShouldStop(2048);
programveri.mostCurrent._labeldakika10.runMethod(true,"setTextSize",BA.numberCast(float.class, 20));
 BA.debugLineNum = 1197;BA.debugLine="LabelDakika10.Typeface = Typeface.DEFAULT_BOLD";
Debug.ShouldStop(4096);
programveri.mostCurrent._labeldakika10.runMethod(false,"setTypeface",programveri.mostCurrent.__c.getField(false,"Typeface").getField(false,"DEFAULT_BOLD"));
 BA.debugLineNum = 1199;BA.debugLine="LabelDakika11.TextColor = Colors.White";
Debug.ShouldStop(16384);
programveri.mostCurrent._labeldakika11.runMethod(true,"setTextColor",programveri.mostCurrent.__c.getField(false,"Colors").getField(true,"White"));
 BA.debugLineNum = 1200;BA.debugLine="LabelDakika11.TextSize = 20";
Debug.ShouldStop(32768);
programveri.mostCurrent._labeldakika11.runMethod(true,"setTextSize",BA.numberCast(float.class, 20));
 BA.debugLineNum = 1201;BA.debugLine="LabelDakika11.Typeface = Typeface.DEFAULT_BOLD";
Debug.ShouldStop(65536);
programveri.mostCurrent._labeldakika11.runMethod(false,"setTypeface",programveri.mostCurrent.__c.getField(false,"Typeface").getField(false,"DEFAULT_BOLD"));
 BA.debugLineNum = 1203;BA.debugLine="LabelDakika12.TextColor = Colors.White";
Debug.ShouldStop(262144);
programveri.mostCurrent._labeldakika12.runMethod(true,"setTextColor",programveri.mostCurrent.__c.getField(false,"Colors").getField(true,"White"));
 BA.debugLineNum = 1204;BA.debugLine="LabelDakika12.TextSize = 20";
Debug.ShouldStop(524288);
programveri.mostCurrent._labeldakika12.runMethod(true,"setTextSize",BA.numberCast(float.class, 20));
 BA.debugLineNum = 1205;BA.debugLine="LabelDakika12.Typeface = Typeface.DEFAULT_BOLD";
Debug.ShouldStop(1048576);
programveri.mostCurrent._labeldakika12.runMethod(false,"setTypeface",programveri.mostCurrent.__c.getField(false,"Typeface").getField(false,"DEFAULT_BOLD"));
 BA.debugLineNum = 1207;BA.debugLine="LabelDakika13.TextColor = Colors.White";
Debug.ShouldStop(4194304);
programveri.mostCurrent._labeldakika13.runMethod(true,"setTextColor",programveri.mostCurrent.__c.getField(false,"Colors").getField(true,"White"));
 BA.debugLineNum = 1208;BA.debugLine="LabelDakika13.TextSize = 20";
Debug.ShouldStop(8388608);
programveri.mostCurrent._labeldakika13.runMethod(true,"setTextSize",BA.numberCast(float.class, 20));
 BA.debugLineNum = 1209;BA.debugLine="LabelDakika13.Typeface = Typeface.DEFAULT_BOLD";
Debug.ShouldStop(16777216);
programveri.mostCurrent._labeldakika13.runMethod(false,"setTypeface",programveri.mostCurrent.__c.getField(false,"Typeface").getField(false,"DEFAULT_BOLD"));
 BA.debugLineNum = 1211;BA.debugLine="LabelDakika14.TextColor = Colors.White";
Debug.ShouldStop(67108864);
programveri.mostCurrent._labeldakika14.runMethod(true,"setTextColor",programveri.mostCurrent.__c.getField(false,"Colors").getField(true,"White"));
 BA.debugLineNum = 1212;BA.debugLine="LabelDakika14.TextSize = 20";
Debug.ShouldStop(134217728);
programveri.mostCurrent._labeldakika14.runMethod(true,"setTextSize",BA.numberCast(float.class, 20));
 BA.debugLineNum = 1213;BA.debugLine="LabelDakika14.Typeface = Typeface.DEFAULT_BOLD";
Debug.ShouldStop(268435456);
programveri.mostCurrent._labeldakika14.runMethod(false,"setTypeface",programveri.mostCurrent.__c.getField(false,"Typeface").getField(false,"DEFAULT_BOLD"));
 BA.debugLineNum = 1215;BA.debugLine="LabelDakika15.TextColor = Colors.White";
Debug.ShouldStop(1073741824);
programveri.mostCurrent._labeldakika15.runMethod(true,"setTextColor",programveri.mostCurrent.__c.getField(false,"Colors").getField(true,"White"));
 BA.debugLineNum = 1216;BA.debugLine="LabelDakika15.TextSize = 20";
Debug.ShouldStop(-2147483648);
programveri.mostCurrent._labeldakika15.runMethod(true,"setTextSize",BA.numberCast(float.class, 20));
 BA.debugLineNum = 1217;BA.debugLine="LabelDakika15.Typeface = Typeface.DEFAULT_BOLD";
Debug.ShouldStop(1);
programveri.mostCurrent._labeldakika15.runMethod(false,"setTypeface",programveri.mostCurrent.__c.getField(false,"Typeface").getField(false,"DEFAULT_BOLD"));
 BA.debugLineNum = 1219;BA.debugLine="LabelDakika16.TextColor = Colors.White";
Debug.ShouldStop(4);
programveri.mostCurrent._labeldakika16.runMethod(true,"setTextColor",programveri.mostCurrent.__c.getField(false,"Colors").getField(true,"White"));
 BA.debugLineNum = 1220;BA.debugLine="LabelDakika16.TextSize = 20";
Debug.ShouldStop(8);
programveri.mostCurrent._labeldakika16.runMethod(true,"setTextSize",BA.numberCast(float.class, 20));
 BA.debugLineNum = 1221;BA.debugLine="LabelDakika16.Typeface = Typeface.DEFAULT_BOLD";
Debug.ShouldStop(16);
programveri.mostCurrent._labeldakika16.runMethod(false,"setTypeface",programveri.mostCurrent.__c.getField(false,"Typeface").getField(false,"DEFAULT_BOLD"));
 BA.debugLineNum = 1223;BA.debugLine="LabelDakika17.TextColor = Colors.White";
Debug.ShouldStop(64);
programveri.mostCurrent._labeldakika17.runMethod(true,"setTextColor",programveri.mostCurrent.__c.getField(false,"Colors").getField(true,"White"));
 BA.debugLineNum = 1224;BA.debugLine="LabelDakika17.TextSize = 20";
Debug.ShouldStop(128);
programveri.mostCurrent._labeldakika17.runMethod(true,"setTextSize",BA.numberCast(float.class, 20));
 BA.debugLineNum = 1225;BA.debugLine="LabelDakika17.Typeface = Typeface.DEFAULT_BOLD";
Debug.ShouldStop(256);
programveri.mostCurrent._labeldakika17.runMethod(false,"setTypeface",programveri.mostCurrent.__c.getField(false,"Typeface").getField(false,"DEFAULT_BOLD"));
 BA.debugLineNum = 1227;BA.debugLine="LabelDakika18.TextColor = Colors.White";
Debug.ShouldStop(1024);
programveri.mostCurrent._labeldakika18.runMethod(true,"setTextColor",programveri.mostCurrent.__c.getField(false,"Colors").getField(true,"White"));
 BA.debugLineNum = 1228;BA.debugLine="LabelDakika18.TextSize = 20";
Debug.ShouldStop(2048);
programveri.mostCurrent._labeldakika18.runMethod(true,"setTextSize",BA.numberCast(float.class, 20));
 BA.debugLineNum = 1229;BA.debugLine="LabelDakika18.Typeface = Typeface.DEFAULT_BOLD";
Debug.ShouldStop(4096);
programveri.mostCurrent._labeldakika18.runMethod(false,"setTypeface",programveri.mostCurrent.__c.getField(false,"Typeface").getField(false,"DEFAULT_BOLD"));
 BA.debugLineNum = 1231;BA.debugLine="LabelDakika19.TextColor = Colors.White";
Debug.ShouldStop(16384);
programveri.mostCurrent._labeldakika19.runMethod(true,"setTextColor",programveri.mostCurrent.__c.getField(false,"Colors").getField(true,"White"));
 BA.debugLineNum = 1232;BA.debugLine="LabelDakika19.TextSize = 20";
Debug.ShouldStop(32768);
programveri.mostCurrent._labeldakika19.runMethod(true,"setTextSize",BA.numberCast(float.class, 20));
 BA.debugLineNum = 1233;BA.debugLine="LabelDakika19.Typeface = Typeface.DEFAULT_BOLD";
Debug.ShouldStop(65536);
programveri.mostCurrent._labeldakika19.runMethod(false,"setTypeface",programveri.mostCurrent.__c.getField(false,"Typeface").getField(false,"DEFAULT_BOLD"));
 BA.debugLineNum = 1235;BA.debugLine="LabelDakika20.TextColor = Colors.White";
Debug.ShouldStop(262144);
programveri.mostCurrent._labeldakika20.runMethod(true,"setTextColor",programveri.mostCurrent.__c.getField(false,"Colors").getField(true,"White"));
 BA.debugLineNum = 1236;BA.debugLine="LabelDakika20.TextSize = 20";
Debug.ShouldStop(524288);
programveri.mostCurrent._labeldakika20.runMethod(true,"setTextSize",BA.numberCast(float.class, 20));
 BA.debugLineNum = 1237;BA.debugLine="LabelDakika20.Typeface = Typeface.DEFAULT_BOLD";
Debug.ShouldStop(1048576);
programveri.mostCurrent._labeldakika20.runMethod(false,"setTypeface",programveri.mostCurrent.__c.getField(false,"Typeface").getField(false,"DEFAULT_BOLD"));
 BA.debugLineNum = 1239;BA.debugLine="LabelDakika21.TextColor = Colors.White";
Debug.ShouldStop(4194304);
programveri.mostCurrent._labeldakika21.runMethod(true,"setTextColor",programveri.mostCurrent.__c.getField(false,"Colors").getField(true,"White"));
 BA.debugLineNum = 1240;BA.debugLine="LabelDakika21.TextSize = 20";
Debug.ShouldStop(8388608);
programveri.mostCurrent._labeldakika21.runMethod(true,"setTextSize",BA.numberCast(float.class, 20));
 BA.debugLineNum = 1241;BA.debugLine="LabelDakika21.Typeface = Typeface.DEFAULT_BOLD";
Debug.ShouldStop(16777216);
programveri.mostCurrent._labeldakika21.runMethod(false,"setTypeface",programveri.mostCurrent.__c.getField(false,"Typeface").getField(false,"DEFAULT_BOLD"));
 BA.debugLineNum = 1243;BA.debugLine="LabelDakika22.TextColor = Colors.White";
Debug.ShouldStop(67108864);
programveri.mostCurrent._labeldakika22.runMethod(true,"setTextColor",programveri.mostCurrent.__c.getField(false,"Colors").getField(true,"White"));
 BA.debugLineNum = 1244;BA.debugLine="LabelDakika22.TextSize = 20";
Debug.ShouldStop(134217728);
programveri.mostCurrent._labeldakika22.runMethod(true,"setTextSize",BA.numberCast(float.class, 20));
 BA.debugLineNum = 1245;BA.debugLine="LabelDakika22.Typeface = Typeface.DEFAULT_BOLD";
Debug.ShouldStop(268435456);
programveri.mostCurrent._labeldakika22.runMethod(false,"setTypeface",programveri.mostCurrent.__c.getField(false,"Typeface").getField(false,"DEFAULT_BOLD"));
 BA.debugLineNum = 1247;BA.debugLine="LabelDakika23.TextColor = Colors.White";
Debug.ShouldStop(1073741824);
programveri.mostCurrent._labeldakika23.runMethod(true,"setTextColor",programveri.mostCurrent.__c.getField(false,"Colors").getField(true,"White"));
 BA.debugLineNum = 1248;BA.debugLine="LabelDakika23.TextSize = 20";
Debug.ShouldStop(-2147483648);
programveri.mostCurrent._labeldakika23.runMethod(true,"setTextSize",BA.numberCast(float.class, 20));
 BA.debugLineNum = 1249;BA.debugLine="LabelDakika23.Typeface = Typeface.DEFAULT_BOLD";
Debug.ShouldStop(1);
programveri.mostCurrent._labeldakika23.runMethod(false,"setTypeface",programveri.mostCurrent.__c.getField(false,"Typeface").getField(false,"DEFAULT_BOLD"));
 BA.debugLineNum = 1251;BA.debugLine="LabelDakika24.TextColor = Colors.White";
Debug.ShouldStop(4);
programveri.mostCurrent._labeldakika24.runMethod(true,"setTextColor",programveri.mostCurrent.__c.getField(false,"Colors").getField(true,"White"));
 BA.debugLineNum = 1252;BA.debugLine="LabelDakika24.TextSize = 20";
Debug.ShouldStop(8);
programveri.mostCurrent._labeldakika24.runMethod(true,"setTextSize",BA.numberCast(float.class, 20));
 BA.debugLineNum = 1253;BA.debugLine="LabelDakika24.Typeface = Typeface.DEFAULT_BOLD";
Debug.ShouldStop(16);
programveri.mostCurrent._labeldakika24.runMethod(false,"setTypeface",programveri.mostCurrent.__c.getField(false,"Typeface").getField(false,"DEFAULT_BOLD"));
 BA.debugLineNum = 1255;BA.debugLine="LabelDakika25.TextColor = Colors.White";
Debug.ShouldStop(64);
programveri.mostCurrent._labeldakika25.runMethod(true,"setTextColor",programveri.mostCurrent.__c.getField(false,"Colors").getField(true,"White"));
 BA.debugLineNum = 1256;BA.debugLine="LabelDakika25.TextSize = 20";
Debug.ShouldStop(128);
programveri.mostCurrent._labeldakika25.runMethod(true,"setTextSize",BA.numberCast(float.class, 20));
 BA.debugLineNum = 1257;BA.debugLine="LabelDakika25.Typeface = Typeface.DEFAULT_BOLD";
Debug.ShouldStop(256);
programveri.mostCurrent._labeldakika25.runMethod(false,"setTypeface",programveri.mostCurrent.__c.getField(false,"Typeface").getField(false,"DEFAULT_BOLD"));
 BA.debugLineNum = 1261;BA.debugLine="LabelSaniye1.TextColor = Colors.White";
Debug.ShouldStop(4096);
programveri.mostCurrent._labelsaniye1.runMethod(true,"setTextColor",programveri.mostCurrent.__c.getField(false,"Colors").getField(true,"White"));
 BA.debugLineNum = 1262;BA.debugLine="LabelSaniye1.TextSize = 20";
Debug.ShouldStop(8192);
programveri.mostCurrent._labelsaniye1.runMethod(true,"setTextSize",BA.numberCast(float.class, 20));
 BA.debugLineNum = 1263;BA.debugLine="LabelSaniye1.Typeface = Typeface.DEFAULT_BOLD";
Debug.ShouldStop(16384);
programveri.mostCurrent._labelsaniye1.runMethod(false,"setTypeface",programveri.mostCurrent.__c.getField(false,"Typeface").getField(false,"DEFAULT_BOLD"));
 BA.debugLineNum = 1265;BA.debugLine="LabelSaniye2.TextColor = Colors.White";
Debug.ShouldStop(65536);
programveri.mostCurrent._labelsaniye2.runMethod(true,"setTextColor",programveri.mostCurrent.__c.getField(false,"Colors").getField(true,"White"));
 BA.debugLineNum = 1266;BA.debugLine="LabelSaniye2.TextSize = 20";
Debug.ShouldStop(131072);
programveri.mostCurrent._labelsaniye2.runMethod(true,"setTextSize",BA.numberCast(float.class, 20));
 BA.debugLineNum = 1267;BA.debugLine="LabelSaniye2.Typeface = Typeface.DEFAULT_BOLD";
Debug.ShouldStop(262144);
programveri.mostCurrent._labelsaniye2.runMethod(false,"setTypeface",programveri.mostCurrent.__c.getField(false,"Typeface").getField(false,"DEFAULT_BOLD"));
 BA.debugLineNum = 1269;BA.debugLine="LabelSaniye3.TextColor = Colors.White";
Debug.ShouldStop(1048576);
programveri.mostCurrent._labelsaniye3.runMethod(true,"setTextColor",programveri.mostCurrent.__c.getField(false,"Colors").getField(true,"White"));
 BA.debugLineNum = 1270;BA.debugLine="LabelSaniye3.TextSize = 20";
Debug.ShouldStop(2097152);
programveri.mostCurrent._labelsaniye3.runMethod(true,"setTextSize",BA.numberCast(float.class, 20));
 BA.debugLineNum = 1271;BA.debugLine="LabelSaniye3.Typeface = Typeface.DEFAULT_BOLD";
Debug.ShouldStop(4194304);
programveri.mostCurrent._labelsaniye3.runMethod(false,"setTypeface",programveri.mostCurrent.__c.getField(false,"Typeface").getField(false,"DEFAULT_BOLD"));
 BA.debugLineNum = 1273;BA.debugLine="LabelSaniye4.TextColor = Colors.White";
Debug.ShouldStop(16777216);
programveri.mostCurrent._labelsaniye4.runMethod(true,"setTextColor",programveri.mostCurrent.__c.getField(false,"Colors").getField(true,"White"));
 BA.debugLineNum = 1274;BA.debugLine="LabelSaniye4.TextSize = 20";
Debug.ShouldStop(33554432);
programveri.mostCurrent._labelsaniye4.runMethod(true,"setTextSize",BA.numberCast(float.class, 20));
 BA.debugLineNum = 1275;BA.debugLine="LabelSaniye4.Typeface = Typeface.DEFAULT_BOLD";
Debug.ShouldStop(67108864);
programveri.mostCurrent._labelsaniye4.runMethod(false,"setTypeface",programveri.mostCurrent.__c.getField(false,"Typeface").getField(false,"DEFAULT_BOLD"));
 BA.debugLineNum = 1277;BA.debugLine="LabelSaniye5.TextColor = Colors.White";
Debug.ShouldStop(268435456);
programveri.mostCurrent._labelsaniye5.runMethod(true,"setTextColor",programveri.mostCurrent.__c.getField(false,"Colors").getField(true,"White"));
 BA.debugLineNum = 1278;BA.debugLine="LabelSaniye5.TextSize = 20";
Debug.ShouldStop(536870912);
programveri.mostCurrent._labelsaniye5.runMethod(true,"setTextSize",BA.numberCast(float.class, 20));
 BA.debugLineNum = 1279;BA.debugLine="LabelSaniye5.Typeface = Typeface.DEFAULT_BOLD";
Debug.ShouldStop(1073741824);
programveri.mostCurrent._labelsaniye5.runMethod(false,"setTypeface",programveri.mostCurrent.__c.getField(false,"Typeface").getField(false,"DEFAULT_BOLD"));
 BA.debugLineNum = 1281;BA.debugLine="LabelSaniye6.TextColor = Colors.White";
Debug.ShouldStop(1);
programveri.mostCurrent._labelsaniye6.runMethod(true,"setTextColor",programveri.mostCurrent.__c.getField(false,"Colors").getField(true,"White"));
 BA.debugLineNum = 1282;BA.debugLine="LabelSaniye6.TextSize = 20";
Debug.ShouldStop(2);
programveri.mostCurrent._labelsaniye6.runMethod(true,"setTextSize",BA.numberCast(float.class, 20));
 BA.debugLineNum = 1283;BA.debugLine="LabelSaniye6.Typeface = Typeface.DEFAULT_BOLD";
Debug.ShouldStop(4);
programveri.mostCurrent._labelsaniye6.runMethod(false,"setTypeface",programveri.mostCurrent.__c.getField(false,"Typeface").getField(false,"DEFAULT_BOLD"));
 BA.debugLineNum = 1285;BA.debugLine="LabelSaniye7.TextColor = Colors.White";
Debug.ShouldStop(16);
programveri.mostCurrent._labelsaniye7.runMethod(true,"setTextColor",programveri.mostCurrent.__c.getField(false,"Colors").getField(true,"White"));
 BA.debugLineNum = 1286;BA.debugLine="LabelSaniye7.TextSize = 20";
Debug.ShouldStop(32);
programveri.mostCurrent._labelsaniye7.runMethod(true,"setTextSize",BA.numberCast(float.class, 20));
 BA.debugLineNum = 1287;BA.debugLine="LabelSaniye7.Typeface = Typeface.DEFAULT_BOLD";
Debug.ShouldStop(64);
programveri.mostCurrent._labelsaniye7.runMethod(false,"setTypeface",programveri.mostCurrent.__c.getField(false,"Typeface").getField(false,"DEFAULT_BOLD"));
 BA.debugLineNum = 1289;BA.debugLine="LabelSaniye8.TextColor = Colors.White";
Debug.ShouldStop(256);
programveri.mostCurrent._labelsaniye8.runMethod(true,"setTextColor",programveri.mostCurrent.__c.getField(false,"Colors").getField(true,"White"));
 BA.debugLineNum = 1290;BA.debugLine="LabelSaniye8.TextSize = 20";
Debug.ShouldStop(512);
programveri.mostCurrent._labelsaniye8.runMethod(true,"setTextSize",BA.numberCast(float.class, 20));
 BA.debugLineNum = 1291;BA.debugLine="LabelSaniye8.Typeface = Typeface.DEFAULT_BOLD";
Debug.ShouldStop(1024);
programveri.mostCurrent._labelsaniye8.runMethod(false,"setTypeface",programveri.mostCurrent.__c.getField(false,"Typeface").getField(false,"DEFAULT_BOLD"));
 BA.debugLineNum = 1293;BA.debugLine="LabelSaniye9.TextColor = Colors.White";
Debug.ShouldStop(4096);
programveri.mostCurrent._labelsaniye9.runMethod(true,"setTextColor",programveri.mostCurrent.__c.getField(false,"Colors").getField(true,"White"));
 BA.debugLineNum = 1294;BA.debugLine="LabelSaniye9.TextSize = 20";
Debug.ShouldStop(8192);
programveri.mostCurrent._labelsaniye9.runMethod(true,"setTextSize",BA.numberCast(float.class, 20));
 BA.debugLineNum = 1295;BA.debugLine="LabelSaniye9.Typeface = Typeface.DEFAULT_BOLD";
Debug.ShouldStop(16384);
programveri.mostCurrent._labelsaniye9.runMethod(false,"setTypeface",programveri.mostCurrent.__c.getField(false,"Typeface").getField(false,"DEFAULT_BOLD"));
 BA.debugLineNum = 1297;BA.debugLine="LabelSaniye10.TextColor = Colors.White";
Debug.ShouldStop(65536);
programveri.mostCurrent._labelsaniye10.runMethod(true,"setTextColor",programveri.mostCurrent.__c.getField(false,"Colors").getField(true,"White"));
 BA.debugLineNum = 1298;BA.debugLine="LabelSaniye10.TextSize = 20";
Debug.ShouldStop(131072);
programveri.mostCurrent._labelsaniye10.runMethod(true,"setTextSize",BA.numberCast(float.class, 20));
 BA.debugLineNum = 1299;BA.debugLine="LabelSaniye10.Typeface = Typeface.DEFAULT_BOLD";
Debug.ShouldStop(262144);
programveri.mostCurrent._labelsaniye10.runMethod(false,"setTypeface",programveri.mostCurrent.__c.getField(false,"Typeface").getField(false,"DEFAULT_BOLD"));
 BA.debugLineNum = 1301;BA.debugLine="LabelSaniye11.TextColor = Colors.White";
Debug.ShouldStop(1048576);
programveri.mostCurrent._labelsaniye11.runMethod(true,"setTextColor",programveri.mostCurrent.__c.getField(false,"Colors").getField(true,"White"));
 BA.debugLineNum = 1302;BA.debugLine="LabelSaniye11.TextSize = 20";
Debug.ShouldStop(2097152);
programveri.mostCurrent._labelsaniye11.runMethod(true,"setTextSize",BA.numberCast(float.class, 20));
 BA.debugLineNum = 1303;BA.debugLine="LabelSaniye11.Typeface = Typeface.DEFAULT_BOLD";
Debug.ShouldStop(4194304);
programveri.mostCurrent._labelsaniye11.runMethod(false,"setTypeface",programveri.mostCurrent.__c.getField(false,"Typeface").getField(false,"DEFAULT_BOLD"));
 BA.debugLineNum = 1305;BA.debugLine="LabelSaniye12.TextColor = Colors.White";
Debug.ShouldStop(16777216);
programveri.mostCurrent._labelsaniye12.runMethod(true,"setTextColor",programveri.mostCurrent.__c.getField(false,"Colors").getField(true,"White"));
 BA.debugLineNum = 1306;BA.debugLine="LabelSaniye12.TextSize = 20";
Debug.ShouldStop(33554432);
programveri.mostCurrent._labelsaniye12.runMethod(true,"setTextSize",BA.numberCast(float.class, 20));
 BA.debugLineNum = 1307;BA.debugLine="LabelSaniye12.Typeface = Typeface.DEFAULT_BOLD";
Debug.ShouldStop(67108864);
programveri.mostCurrent._labelsaniye12.runMethod(false,"setTypeface",programveri.mostCurrent.__c.getField(false,"Typeface").getField(false,"DEFAULT_BOLD"));
 BA.debugLineNum = 1309;BA.debugLine="LabelSaniye13.TextColor = Colors.White";
Debug.ShouldStop(268435456);
programveri.mostCurrent._labelsaniye13.runMethod(true,"setTextColor",programveri.mostCurrent.__c.getField(false,"Colors").getField(true,"White"));
 BA.debugLineNum = 1310;BA.debugLine="LabelSaniye13.TextSize = 20";
Debug.ShouldStop(536870912);
programveri.mostCurrent._labelsaniye13.runMethod(true,"setTextSize",BA.numberCast(float.class, 20));
 BA.debugLineNum = 1311;BA.debugLine="LabelSaniye13.Typeface = Typeface.DEFAULT_BOLD";
Debug.ShouldStop(1073741824);
programveri.mostCurrent._labelsaniye13.runMethod(false,"setTypeface",programveri.mostCurrent.__c.getField(false,"Typeface").getField(false,"DEFAULT_BOLD"));
 BA.debugLineNum = 1313;BA.debugLine="LabelSaniye14.TextColor = Colors.White";
Debug.ShouldStop(1);
programveri.mostCurrent._labelsaniye14.runMethod(true,"setTextColor",programveri.mostCurrent.__c.getField(false,"Colors").getField(true,"White"));
 BA.debugLineNum = 1314;BA.debugLine="LabelSaniye14.TextSize = 20";
Debug.ShouldStop(2);
programveri.mostCurrent._labelsaniye14.runMethod(true,"setTextSize",BA.numberCast(float.class, 20));
 BA.debugLineNum = 1315;BA.debugLine="LabelSaniye14.Typeface = Typeface.DEFAULT_BOLD";
Debug.ShouldStop(4);
programveri.mostCurrent._labelsaniye14.runMethod(false,"setTypeface",programveri.mostCurrent.__c.getField(false,"Typeface").getField(false,"DEFAULT_BOLD"));
 BA.debugLineNum = 1317;BA.debugLine="LabelSaniye15.TextColor = Colors.White";
Debug.ShouldStop(16);
programveri.mostCurrent._labelsaniye15.runMethod(true,"setTextColor",programveri.mostCurrent.__c.getField(false,"Colors").getField(true,"White"));
 BA.debugLineNum = 1318;BA.debugLine="LabelSaniye15.TextSize = 20";
Debug.ShouldStop(32);
programveri.mostCurrent._labelsaniye15.runMethod(true,"setTextSize",BA.numberCast(float.class, 20));
 BA.debugLineNum = 1319;BA.debugLine="LabelSaniye15.Typeface = Typeface.DEFAULT_BOLD";
Debug.ShouldStop(64);
programveri.mostCurrent._labelsaniye15.runMethod(false,"setTypeface",programveri.mostCurrent.__c.getField(false,"Typeface").getField(false,"DEFAULT_BOLD"));
 BA.debugLineNum = 1321;BA.debugLine="LabelSaniye16.TextColor = Colors.White";
Debug.ShouldStop(256);
programveri.mostCurrent._labelsaniye16.runMethod(true,"setTextColor",programveri.mostCurrent.__c.getField(false,"Colors").getField(true,"White"));
 BA.debugLineNum = 1322;BA.debugLine="LabelSaniye16.TextSize = 20";
Debug.ShouldStop(512);
programveri.mostCurrent._labelsaniye16.runMethod(true,"setTextSize",BA.numberCast(float.class, 20));
 BA.debugLineNum = 1323;BA.debugLine="LabelSaniye16.Typeface = Typeface.DEFAULT_BOLD";
Debug.ShouldStop(1024);
programveri.mostCurrent._labelsaniye16.runMethod(false,"setTypeface",programveri.mostCurrent.__c.getField(false,"Typeface").getField(false,"DEFAULT_BOLD"));
 BA.debugLineNum = 1325;BA.debugLine="LabelSaniye17.TextColor = Colors.White";
Debug.ShouldStop(4096);
programveri.mostCurrent._labelsaniye17.runMethod(true,"setTextColor",programveri.mostCurrent.__c.getField(false,"Colors").getField(true,"White"));
 BA.debugLineNum = 1326;BA.debugLine="LabelSaniye17.TextSize = 20";
Debug.ShouldStop(8192);
programveri.mostCurrent._labelsaniye17.runMethod(true,"setTextSize",BA.numberCast(float.class, 20));
 BA.debugLineNum = 1327;BA.debugLine="LabelSaniye17.Typeface = Typeface.DEFAULT_BOLD";
Debug.ShouldStop(16384);
programveri.mostCurrent._labelsaniye17.runMethod(false,"setTypeface",programveri.mostCurrent.__c.getField(false,"Typeface").getField(false,"DEFAULT_BOLD"));
 BA.debugLineNum = 1329;BA.debugLine="LabelSaniye18.TextColor = Colors.White";
Debug.ShouldStop(65536);
programveri.mostCurrent._labelsaniye18.runMethod(true,"setTextColor",programveri.mostCurrent.__c.getField(false,"Colors").getField(true,"White"));
 BA.debugLineNum = 1330;BA.debugLine="LabelSaniye18.TextSize = 20";
Debug.ShouldStop(131072);
programveri.mostCurrent._labelsaniye18.runMethod(true,"setTextSize",BA.numberCast(float.class, 20));
 BA.debugLineNum = 1331;BA.debugLine="LabelSaniye18.Typeface = Typeface.DEFAULT_BOLD";
Debug.ShouldStop(262144);
programveri.mostCurrent._labelsaniye18.runMethod(false,"setTypeface",programveri.mostCurrent.__c.getField(false,"Typeface").getField(false,"DEFAULT_BOLD"));
 BA.debugLineNum = 1333;BA.debugLine="LabelSaniye19.TextColor = Colors.White";
Debug.ShouldStop(1048576);
programveri.mostCurrent._labelsaniye19.runMethod(true,"setTextColor",programveri.mostCurrent.__c.getField(false,"Colors").getField(true,"White"));
 BA.debugLineNum = 1334;BA.debugLine="LabelSaniye19.TextSize = 20";
Debug.ShouldStop(2097152);
programveri.mostCurrent._labelsaniye19.runMethod(true,"setTextSize",BA.numberCast(float.class, 20));
 BA.debugLineNum = 1335;BA.debugLine="LabelSaniye19.Typeface = Typeface.DEFAULT_BOLD";
Debug.ShouldStop(4194304);
programveri.mostCurrent._labelsaniye19.runMethod(false,"setTypeface",programveri.mostCurrent.__c.getField(false,"Typeface").getField(false,"DEFAULT_BOLD"));
 BA.debugLineNum = 1337;BA.debugLine="LabelSaniye20.TextColor = Colors.White";
Debug.ShouldStop(16777216);
programveri.mostCurrent._labelsaniye20.runMethod(true,"setTextColor",programveri.mostCurrent.__c.getField(false,"Colors").getField(true,"White"));
 BA.debugLineNum = 1338;BA.debugLine="LabelSaniye20.TextSize = 20";
Debug.ShouldStop(33554432);
programveri.mostCurrent._labelsaniye20.runMethod(true,"setTextSize",BA.numberCast(float.class, 20));
 BA.debugLineNum = 1339;BA.debugLine="LabelSaniye20.Typeface = Typeface.DEFAULT_BOLD";
Debug.ShouldStop(67108864);
programveri.mostCurrent._labelsaniye20.runMethod(false,"setTypeface",programveri.mostCurrent.__c.getField(false,"Typeface").getField(false,"DEFAULT_BOLD"));
 BA.debugLineNum = 1341;BA.debugLine="LabelSaniye21.TextColor = Colors.White";
Debug.ShouldStop(268435456);
programveri.mostCurrent._labelsaniye21.runMethod(true,"setTextColor",programveri.mostCurrent.__c.getField(false,"Colors").getField(true,"White"));
 BA.debugLineNum = 1342;BA.debugLine="LabelSaniye21.TextSize = 20";
Debug.ShouldStop(536870912);
programveri.mostCurrent._labelsaniye21.runMethod(true,"setTextSize",BA.numberCast(float.class, 20));
 BA.debugLineNum = 1343;BA.debugLine="LabelSaniye21.Typeface = Typeface.DEFAULT_BOLD";
Debug.ShouldStop(1073741824);
programveri.mostCurrent._labelsaniye21.runMethod(false,"setTypeface",programveri.mostCurrent.__c.getField(false,"Typeface").getField(false,"DEFAULT_BOLD"));
 BA.debugLineNum = 1345;BA.debugLine="LabelSaniye22.TextColor = Colors.White";
Debug.ShouldStop(1);
programveri.mostCurrent._labelsaniye22.runMethod(true,"setTextColor",programveri.mostCurrent.__c.getField(false,"Colors").getField(true,"White"));
 BA.debugLineNum = 1346;BA.debugLine="LabelSaniye22.TextSize = 20";
Debug.ShouldStop(2);
programveri.mostCurrent._labelsaniye22.runMethod(true,"setTextSize",BA.numberCast(float.class, 20));
 BA.debugLineNum = 1347;BA.debugLine="LabelSaniye22.Typeface = Typeface.DEFAULT_BOLD";
Debug.ShouldStop(4);
programveri.mostCurrent._labelsaniye22.runMethod(false,"setTypeface",programveri.mostCurrent.__c.getField(false,"Typeface").getField(false,"DEFAULT_BOLD"));
 BA.debugLineNum = 1349;BA.debugLine="LabelSaniye23.TextColor = Colors.White";
Debug.ShouldStop(16);
programveri.mostCurrent._labelsaniye23.runMethod(true,"setTextColor",programveri.mostCurrent.__c.getField(false,"Colors").getField(true,"White"));
 BA.debugLineNum = 1350;BA.debugLine="LabelSaniye23.TextSize = 20";
Debug.ShouldStop(32);
programveri.mostCurrent._labelsaniye23.runMethod(true,"setTextSize",BA.numberCast(float.class, 20));
 BA.debugLineNum = 1351;BA.debugLine="LabelSaniye23.Typeface = Typeface.DEFAULT_BOLD";
Debug.ShouldStop(64);
programveri.mostCurrent._labelsaniye23.runMethod(false,"setTypeface",programveri.mostCurrent.__c.getField(false,"Typeface").getField(false,"DEFAULT_BOLD"));
 BA.debugLineNum = 1353;BA.debugLine="LabelSaniye24.TextColor = Colors.White";
Debug.ShouldStop(256);
programveri.mostCurrent._labelsaniye24.runMethod(true,"setTextColor",programveri.mostCurrent.__c.getField(false,"Colors").getField(true,"White"));
 BA.debugLineNum = 1354;BA.debugLine="LabelSaniye24.TextSize = 20";
Debug.ShouldStop(512);
programveri.mostCurrent._labelsaniye24.runMethod(true,"setTextSize",BA.numberCast(float.class, 20));
 BA.debugLineNum = 1355;BA.debugLine="LabelSaniye24.Typeface = Typeface.DEFAULT_BOLD";
Debug.ShouldStop(1024);
programveri.mostCurrent._labelsaniye24.runMethod(false,"setTypeface",programveri.mostCurrent.__c.getField(false,"Typeface").getField(false,"DEFAULT_BOLD"));
 BA.debugLineNum = 1357;BA.debugLine="LabelSaniye25.TextColor = Colors.White";
Debug.ShouldStop(4096);
programveri.mostCurrent._labelsaniye25.runMethod(true,"setTextColor",programveri.mostCurrent.__c.getField(false,"Colors").getField(true,"White"));
 BA.debugLineNum = 1358;BA.debugLine="LabelSaniye25.TextSize = 20";
Debug.ShouldStop(8192);
programveri.mostCurrent._labelsaniye25.runMethod(true,"setTextSize",BA.numberCast(float.class, 20));
 BA.debugLineNum = 1359;BA.debugLine="LabelSaniye25.Typeface = Typeface.DEFAULT_BOLD";
Debug.ShouldStop(16384);
programveri.mostCurrent._labelsaniye25.runMethod(false,"setTypeface",programveri.mostCurrent.__c.getField(false,"Typeface").getField(false,"DEFAULT_BOLD"));
 BA.debugLineNum = 1362;BA.debugLine="LabelKoniMesafesi1.TextColor = Colors.White";
Debug.ShouldStop(131072);
programveri.mostCurrent._labelkonimesafesi1.runMethod(true,"setTextColor",programveri.mostCurrent.__c.getField(false,"Colors").getField(true,"White"));
 BA.debugLineNum = 1363;BA.debugLine="LabelKoniMesafesi1.TextSize = 20";
Debug.ShouldStop(262144);
programveri.mostCurrent._labelkonimesafesi1.runMethod(true,"setTextSize",BA.numberCast(float.class, 20));
 BA.debugLineNum = 1364;BA.debugLine="LabelKoniMesafesi1.Typeface = Typeface.DEFAULT_BO";
Debug.ShouldStop(524288);
programveri.mostCurrent._labelkonimesafesi1.runMethod(false,"setTypeface",programveri.mostCurrent.__c.getField(false,"Typeface").getField(false,"DEFAULT_BOLD"));
 BA.debugLineNum = 1366;BA.debugLine="LabelKoniMesafesi2.TextColor = Colors.White";
Debug.ShouldStop(2097152);
programveri.mostCurrent._labelkonimesafesi2.runMethod(true,"setTextColor",programveri.mostCurrent.__c.getField(false,"Colors").getField(true,"White"));
 BA.debugLineNum = 1367;BA.debugLine="LabelKoniMesafesi2.TextSize = 20";
Debug.ShouldStop(4194304);
programveri.mostCurrent._labelkonimesafesi2.runMethod(true,"setTextSize",BA.numberCast(float.class, 20));
 BA.debugLineNum = 1368;BA.debugLine="LabelKoniMesafesi2.Typeface = Typeface.DEFAULT_BO";
Debug.ShouldStop(8388608);
programveri.mostCurrent._labelkonimesafesi2.runMethod(false,"setTypeface",programveri.mostCurrent.__c.getField(false,"Typeface").getField(false,"DEFAULT_BOLD"));
 BA.debugLineNum = 1370;BA.debugLine="LabelKoniMesafesi3.TextColor = Colors.White";
Debug.ShouldStop(33554432);
programveri.mostCurrent._labelkonimesafesi3.runMethod(true,"setTextColor",programveri.mostCurrent.__c.getField(false,"Colors").getField(true,"White"));
 BA.debugLineNum = 1371;BA.debugLine="LabelKoniMesafesi3.TextSize = 20";
Debug.ShouldStop(67108864);
programveri.mostCurrent._labelkonimesafesi3.runMethod(true,"setTextSize",BA.numberCast(float.class, 20));
 BA.debugLineNum = 1372;BA.debugLine="LabelKoniMesafesi3.Typeface = Typeface.DEFAULT_BO";
Debug.ShouldStop(134217728);
programveri.mostCurrent._labelkonimesafesi3.runMethod(false,"setTypeface",programveri.mostCurrent.__c.getField(false,"Typeface").getField(false,"DEFAULT_BOLD"));
 BA.debugLineNum = 1374;BA.debugLine="LabelKoniMesafesi4.TextColor = Colors.White";
Debug.ShouldStop(536870912);
programveri.mostCurrent._labelkonimesafesi4.runMethod(true,"setTextColor",programveri.mostCurrent.__c.getField(false,"Colors").getField(true,"White"));
 BA.debugLineNum = 1375;BA.debugLine="LabelKoniMesafesi4.TextSize = 20";
Debug.ShouldStop(1073741824);
programveri.mostCurrent._labelkonimesafesi4.runMethod(true,"setTextSize",BA.numberCast(float.class, 20));
 BA.debugLineNum = 1376;BA.debugLine="LabelKoniMesafesi4.Typeface = Typeface.DEFAULT_BO";
Debug.ShouldStop(-2147483648);
programveri.mostCurrent._labelkonimesafesi4.runMethod(false,"setTypeface",programveri.mostCurrent.__c.getField(false,"Typeface").getField(false,"DEFAULT_BOLD"));
 BA.debugLineNum = 1378;BA.debugLine="LabelKoniMesafesi5.TextColor = Colors.White";
Debug.ShouldStop(2);
programveri.mostCurrent._labelkonimesafesi5.runMethod(true,"setTextColor",programveri.mostCurrent.__c.getField(false,"Colors").getField(true,"White"));
 BA.debugLineNum = 1379;BA.debugLine="LabelKoniMesafesi5.TextSize = 20";
Debug.ShouldStop(4);
programveri.mostCurrent._labelkonimesafesi5.runMethod(true,"setTextSize",BA.numberCast(float.class, 20));
 BA.debugLineNum = 1380;BA.debugLine="LabelKoniMesafesi5.Typeface = Typeface.DEFAULT_BO";
Debug.ShouldStop(8);
programveri.mostCurrent._labelkonimesafesi5.runMethod(false,"setTypeface",programveri.mostCurrent.__c.getField(false,"Typeface").getField(false,"DEFAULT_BOLD"));
 BA.debugLineNum = 1382;BA.debugLine="LabelKoniMesafesi6.TextColor = Colors.White";
Debug.ShouldStop(32);
programveri.mostCurrent._labelkonimesafesi6.runMethod(true,"setTextColor",programveri.mostCurrent.__c.getField(false,"Colors").getField(true,"White"));
 BA.debugLineNum = 1383;BA.debugLine="LabelKoniMesafesi6.TextSize = 20";
Debug.ShouldStop(64);
programveri.mostCurrent._labelkonimesafesi6.runMethod(true,"setTextSize",BA.numberCast(float.class, 20));
 BA.debugLineNum = 1384;BA.debugLine="LabelKoniMesafesi6.Typeface = Typeface.DEFAULT_BO";
Debug.ShouldStop(128);
programveri.mostCurrent._labelkonimesafesi6.runMethod(false,"setTypeface",programveri.mostCurrent.__c.getField(false,"Typeface").getField(false,"DEFAULT_BOLD"));
 BA.debugLineNum = 1386;BA.debugLine="LabelKoniMesafesi7.TextColor = Colors.White";
Debug.ShouldStop(512);
programveri.mostCurrent._labelkonimesafesi7.runMethod(true,"setTextColor",programveri.mostCurrent.__c.getField(false,"Colors").getField(true,"White"));
 BA.debugLineNum = 1387;BA.debugLine="LabelKoniMesafesi7.TextSize = 20";
Debug.ShouldStop(1024);
programveri.mostCurrent._labelkonimesafesi7.runMethod(true,"setTextSize",BA.numberCast(float.class, 20));
 BA.debugLineNum = 1388;BA.debugLine="LabelKoniMesafesi7.Typeface = Typeface.DEFAULT_BO";
Debug.ShouldStop(2048);
programveri.mostCurrent._labelkonimesafesi7.runMethod(false,"setTypeface",programveri.mostCurrent.__c.getField(false,"Typeface").getField(false,"DEFAULT_BOLD"));
 BA.debugLineNum = 1390;BA.debugLine="LabelKoniMesafesi8.TextColor = Colors.White";
Debug.ShouldStop(8192);
programveri.mostCurrent._labelkonimesafesi8.runMethod(true,"setTextColor",programveri.mostCurrent.__c.getField(false,"Colors").getField(true,"White"));
 BA.debugLineNum = 1391;BA.debugLine="LabelKoniMesafesi8.TextSize = 20";
Debug.ShouldStop(16384);
programveri.mostCurrent._labelkonimesafesi8.runMethod(true,"setTextSize",BA.numberCast(float.class, 20));
 BA.debugLineNum = 1392;BA.debugLine="LabelKoniMesafesi8.Typeface = Typeface.DEFAULT_BO";
Debug.ShouldStop(32768);
programveri.mostCurrent._labelkonimesafesi8.runMethod(false,"setTypeface",programveri.mostCurrent.__c.getField(false,"Typeface").getField(false,"DEFAULT_BOLD"));
 BA.debugLineNum = 1394;BA.debugLine="LabelKoniMesafesi9.TextColor = Colors.White";
Debug.ShouldStop(131072);
programveri.mostCurrent._labelkonimesafesi9.runMethod(true,"setTextColor",programveri.mostCurrent.__c.getField(false,"Colors").getField(true,"White"));
 BA.debugLineNum = 1395;BA.debugLine="LabelKoniMesafesi9.TextSize = 20";
Debug.ShouldStop(262144);
programveri.mostCurrent._labelkonimesafesi9.runMethod(true,"setTextSize",BA.numberCast(float.class, 20));
 BA.debugLineNum = 1396;BA.debugLine="LabelKoniMesafesi9.Typeface = Typeface.DEFAULT_BO";
Debug.ShouldStop(524288);
programveri.mostCurrent._labelkonimesafesi9.runMethod(false,"setTypeface",programveri.mostCurrent.__c.getField(false,"Typeface").getField(false,"DEFAULT_BOLD"));
 BA.debugLineNum = 1398;BA.debugLine="LabelKoniMesafesi10.TextColor = Colors.White";
Debug.ShouldStop(2097152);
programveri.mostCurrent._labelkonimesafesi10.runMethod(true,"setTextColor",programveri.mostCurrent.__c.getField(false,"Colors").getField(true,"White"));
 BA.debugLineNum = 1399;BA.debugLine="LabelKoniMesafesi10.TextSize = 20";
Debug.ShouldStop(4194304);
programveri.mostCurrent._labelkonimesafesi10.runMethod(true,"setTextSize",BA.numberCast(float.class, 20));
 BA.debugLineNum = 1400;BA.debugLine="LabelKoniMesafesi10.Typeface = Typeface.DEFAULT_B";
Debug.ShouldStop(8388608);
programveri.mostCurrent._labelkonimesafesi10.runMethod(false,"setTypeface",programveri.mostCurrent.__c.getField(false,"Typeface").getField(false,"DEFAULT_BOLD"));
 BA.debugLineNum = 1402;BA.debugLine="LabelKoniMesafesi11.TextColor = Colors.White";
Debug.ShouldStop(33554432);
programveri.mostCurrent._labelkonimesafesi11.runMethod(true,"setTextColor",programveri.mostCurrent.__c.getField(false,"Colors").getField(true,"White"));
 BA.debugLineNum = 1403;BA.debugLine="LabelKoniMesafesi11.TextSize = 20";
Debug.ShouldStop(67108864);
programveri.mostCurrent._labelkonimesafesi11.runMethod(true,"setTextSize",BA.numberCast(float.class, 20));
 BA.debugLineNum = 1404;BA.debugLine="LabelKoniMesafesi11.Typeface = Typeface.DEFAULT_B";
Debug.ShouldStop(134217728);
programveri.mostCurrent._labelkonimesafesi11.runMethod(false,"setTypeface",programveri.mostCurrent.__c.getField(false,"Typeface").getField(false,"DEFAULT_BOLD"));
 BA.debugLineNum = 1406;BA.debugLine="LabelKoniMesafesi12.TextColor = Colors.White";
Debug.ShouldStop(536870912);
programveri.mostCurrent._labelkonimesafesi12.runMethod(true,"setTextColor",programveri.mostCurrent.__c.getField(false,"Colors").getField(true,"White"));
 BA.debugLineNum = 1407;BA.debugLine="LabelKoniMesafesi12.TextSize = 20";
Debug.ShouldStop(1073741824);
programveri.mostCurrent._labelkonimesafesi12.runMethod(true,"setTextSize",BA.numberCast(float.class, 20));
 BA.debugLineNum = 1408;BA.debugLine="LabelKoniMesafesi12.Typeface = Typeface.DEFAULT_B";
Debug.ShouldStop(-2147483648);
programveri.mostCurrent._labelkonimesafesi12.runMethod(false,"setTypeface",programveri.mostCurrent.__c.getField(false,"Typeface").getField(false,"DEFAULT_BOLD"));
 BA.debugLineNum = 1410;BA.debugLine="LabelKoniMesafesi13.TextColor = Colors.White";
Debug.ShouldStop(2);
programveri.mostCurrent._labelkonimesafesi13.runMethod(true,"setTextColor",programveri.mostCurrent.__c.getField(false,"Colors").getField(true,"White"));
 BA.debugLineNum = 1411;BA.debugLine="LabelKoniMesafesi13.TextSize = 20";
Debug.ShouldStop(4);
programveri.mostCurrent._labelkonimesafesi13.runMethod(true,"setTextSize",BA.numberCast(float.class, 20));
 BA.debugLineNum = 1412;BA.debugLine="LabelKoniMesafesi13.Typeface = Typeface.DEFAULT_B";
Debug.ShouldStop(8);
programveri.mostCurrent._labelkonimesafesi13.runMethod(false,"setTypeface",programveri.mostCurrent.__c.getField(false,"Typeface").getField(false,"DEFAULT_BOLD"));
 BA.debugLineNum = 1414;BA.debugLine="LabelKoniMesafesi14.TextColor = Colors.White";
Debug.ShouldStop(32);
programveri.mostCurrent._labelkonimesafesi14.runMethod(true,"setTextColor",programveri.mostCurrent.__c.getField(false,"Colors").getField(true,"White"));
 BA.debugLineNum = 1415;BA.debugLine="LabelKoniMesafesi14.TextSize = 20";
Debug.ShouldStop(64);
programveri.mostCurrent._labelkonimesafesi14.runMethod(true,"setTextSize",BA.numberCast(float.class, 20));
 BA.debugLineNum = 1416;BA.debugLine="LabelKoniMesafesi14.Typeface = Typeface.DEFAULT_B";
Debug.ShouldStop(128);
programveri.mostCurrent._labelkonimesafesi14.runMethod(false,"setTypeface",programveri.mostCurrent.__c.getField(false,"Typeface").getField(false,"DEFAULT_BOLD"));
 BA.debugLineNum = 1418;BA.debugLine="LabelKoniMesafesi15.TextColor = Colors.White";
Debug.ShouldStop(512);
programveri.mostCurrent._labelkonimesafesi15.runMethod(true,"setTextColor",programveri.mostCurrent.__c.getField(false,"Colors").getField(true,"White"));
 BA.debugLineNum = 1419;BA.debugLine="LabelKoniMesafesi15.TextSize = 20";
Debug.ShouldStop(1024);
programveri.mostCurrent._labelkonimesafesi15.runMethod(true,"setTextSize",BA.numberCast(float.class, 20));
 BA.debugLineNum = 1420;BA.debugLine="LabelKoniMesafesi15.Typeface = Typeface.DEFAULT_B";
Debug.ShouldStop(2048);
programveri.mostCurrent._labelkonimesafesi15.runMethod(false,"setTypeface",programveri.mostCurrent.__c.getField(false,"Typeface").getField(false,"DEFAULT_BOLD"));
 BA.debugLineNum = 1422;BA.debugLine="LabelKoniMesafesi16.TextColor = Colors.White";
Debug.ShouldStop(8192);
programveri.mostCurrent._labelkonimesafesi16.runMethod(true,"setTextColor",programveri.mostCurrent.__c.getField(false,"Colors").getField(true,"White"));
 BA.debugLineNum = 1423;BA.debugLine="LabelKoniMesafesi16.TextSize = 20";
Debug.ShouldStop(16384);
programveri.mostCurrent._labelkonimesafesi16.runMethod(true,"setTextSize",BA.numberCast(float.class, 20));
 BA.debugLineNum = 1424;BA.debugLine="LabelKoniMesafesi16.Typeface = Typeface.DEFAULT_B";
Debug.ShouldStop(32768);
programveri.mostCurrent._labelkonimesafesi16.runMethod(false,"setTypeface",programveri.mostCurrent.__c.getField(false,"Typeface").getField(false,"DEFAULT_BOLD"));
 BA.debugLineNum = 1426;BA.debugLine="LabelKoniMesafesi17.TextColor = Colors.White";
Debug.ShouldStop(131072);
programveri.mostCurrent._labelkonimesafesi17.runMethod(true,"setTextColor",programveri.mostCurrent.__c.getField(false,"Colors").getField(true,"White"));
 BA.debugLineNum = 1427;BA.debugLine="LabelKoniMesafesi17.TextSize = 20";
Debug.ShouldStop(262144);
programveri.mostCurrent._labelkonimesafesi17.runMethod(true,"setTextSize",BA.numberCast(float.class, 20));
 BA.debugLineNum = 1428;BA.debugLine="LabelKoniMesafesi17.Typeface = Typeface.DEFAULT_B";
Debug.ShouldStop(524288);
programveri.mostCurrent._labelkonimesafesi17.runMethod(false,"setTypeface",programveri.mostCurrent.__c.getField(false,"Typeface").getField(false,"DEFAULT_BOLD"));
 BA.debugLineNum = 1430;BA.debugLine="LabelKoniMesafesi18.TextColor = Colors.White";
Debug.ShouldStop(2097152);
programveri.mostCurrent._labelkonimesafesi18.runMethod(true,"setTextColor",programveri.mostCurrent.__c.getField(false,"Colors").getField(true,"White"));
 BA.debugLineNum = 1431;BA.debugLine="LabelKoniMesafesi18.TextSize = 20";
Debug.ShouldStop(4194304);
programveri.mostCurrent._labelkonimesafesi18.runMethod(true,"setTextSize",BA.numberCast(float.class, 20));
 BA.debugLineNum = 1432;BA.debugLine="LabelKoniMesafesi18.Typeface = Typeface.DEFAULT_B";
Debug.ShouldStop(8388608);
programveri.mostCurrent._labelkonimesafesi18.runMethod(false,"setTypeface",programveri.mostCurrent.__c.getField(false,"Typeface").getField(false,"DEFAULT_BOLD"));
 BA.debugLineNum = 1434;BA.debugLine="LabelKoniMesafesi19.TextColor = Colors.White";
Debug.ShouldStop(33554432);
programveri.mostCurrent._labelkonimesafesi19.runMethod(true,"setTextColor",programveri.mostCurrent.__c.getField(false,"Colors").getField(true,"White"));
 BA.debugLineNum = 1435;BA.debugLine="LabelKoniMesafesi19.TextSize = 20";
Debug.ShouldStop(67108864);
programveri.mostCurrent._labelkonimesafesi19.runMethod(true,"setTextSize",BA.numberCast(float.class, 20));
 BA.debugLineNum = 1436;BA.debugLine="LabelKoniMesafesi19.Typeface = Typeface.DEFAULT_B";
Debug.ShouldStop(134217728);
programveri.mostCurrent._labelkonimesafesi19.runMethod(false,"setTypeface",programveri.mostCurrent.__c.getField(false,"Typeface").getField(false,"DEFAULT_BOLD"));
 BA.debugLineNum = 1438;BA.debugLine="LabelKoniMesafesi20.TextColor = Colors.White";
Debug.ShouldStop(536870912);
programveri.mostCurrent._labelkonimesafesi20.runMethod(true,"setTextColor",programveri.mostCurrent.__c.getField(false,"Colors").getField(true,"White"));
 BA.debugLineNum = 1439;BA.debugLine="LabelKoniMesafesi20.TextSize = 20";
Debug.ShouldStop(1073741824);
programveri.mostCurrent._labelkonimesafesi20.runMethod(true,"setTextSize",BA.numberCast(float.class, 20));
 BA.debugLineNum = 1440;BA.debugLine="LabelKoniMesafesi20.Typeface = Typeface.DEFAULT_B";
Debug.ShouldStop(-2147483648);
programveri.mostCurrent._labelkonimesafesi20.runMethod(false,"setTypeface",programveri.mostCurrent.__c.getField(false,"Typeface").getField(false,"DEFAULT_BOLD"));
 BA.debugLineNum = 1442;BA.debugLine="LabelKoniMesafesi21.TextColor = Colors.White";
Debug.ShouldStop(2);
programveri.mostCurrent._labelkonimesafesi21.runMethod(true,"setTextColor",programveri.mostCurrent.__c.getField(false,"Colors").getField(true,"White"));
 BA.debugLineNum = 1443;BA.debugLine="LabelKoniMesafesi21.TextSize = 20";
Debug.ShouldStop(4);
programveri.mostCurrent._labelkonimesafesi21.runMethod(true,"setTextSize",BA.numberCast(float.class, 20));
 BA.debugLineNum = 1444;BA.debugLine="LabelKoniMesafesi21.Typeface = Typeface.DEFAULT_B";
Debug.ShouldStop(8);
programveri.mostCurrent._labelkonimesafesi21.runMethod(false,"setTypeface",programveri.mostCurrent.__c.getField(false,"Typeface").getField(false,"DEFAULT_BOLD"));
 BA.debugLineNum = 1446;BA.debugLine="LabelKoniMesafesi22.TextColor = Colors.White";
Debug.ShouldStop(32);
programveri.mostCurrent._labelkonimesafesi22.runMethod(true,"setTextColor",programveri.mostCurrent.__c.getField(false,"Colors").getField(true,"White"));
 BA.debugLineNum = 1447;BA.debugLine="LabelKoniMesafesi22.TextSize = 20";
Debug.ShouldStop(64);
programveri.mostCurrent._labelkonimesafesi22.runMethod(true,"setTextSize",BA.numberCast(float.class, 20));
 BA.debugLineNum = 1448;BA.debugLine="LabelKoniMesafesi22.Typeface = Typeface.DEFAULT_B";
Debug.ShouldStop(128);
programveri.mostCurrent._labelkonimesafesi22.runMethod(false,"setTypeface",programveri.mostCurrent.__c.getField(false,"Typeface").getField(false,"DEFAULT_BOLD"));
 BA.debugLineNum = 1450;BA.debugLine="LabelKoniMesafesi23.TextColor = Colors.White";
Debug.ShouldStop(512);
programveri.mostCurrent._labelkonimesafesi23.runMethod(true,"setTextColor",programveri.mostCurrent.__c.getField(false,"Colors").getField(true,"White"));
 BA.debugLineNum = 1451;BA.debugLine="LabelKoniMesafesi23.TextSize = 20";
Debug.ShouldStop(1024);
programveri.mostCurrent._labelkonimesafesi23.runMethod(true,"setTextSize",BA.numberCast(float.class, 20));
 BA.debugLineNum = 1452;BA.debugLine="LabelKoniMesafesi23.Typeface = Typeface.DEFAULT_B";
Debug.ShouldStop(2048);
programveri.mostCurrent._labelkonimesafesi23.runMethod(false,"setTypeface",programveri.mostCurrent.__c.getField(false,"Typeface").getField(false,"DEFAULT_BOLD"));
 BA.debugLineNum = 1454;BA.debugLine="LabelKoniMesafesi24.TextColor = Colors.White";
Debug.ShouldStop(8192);
programveri.mostCurrent._labelkonimesafesi24.runMethod(true,"setTextColor",programveri.mostCurrent.__c.getField(false,"Colors").getField(true,"White"));
 BA.debugLineNum = 1455;BA.debugLine="LabelKoniMesafesi24.TextSize = 20";
Debug.ShouldStop(16384);
programveri.mostCurrent._labelkonimesafesi24.runMethod(true,"setTextSize",BA.numberCast(float.class, 20));
 BA.debugLineNum = 1456;BA.debugLine="LabelKoniMesafesi24.Typeface = Typeface.DEFAULT_B";
Debug.ShouldStop(32768);
programveri.mostCurrent._labelkonimesafesi24.runMethod(false,"setTypeface",programveri.mostCurrent.__c.getField(false,"Typeface").getField(false,"DEFAULT_BOLD"));
 BA.debugLineNum = 1458;BA.debugLine="LabelKoniMesafesi25.TextColor = Colors.White";
Debug.ShouldStop(131072);
programveri.mostCurrent._labelkonimesafesi25.runMethod(true,"setTextColor",programveri.mostCurrent.__c.getField(false,"Colors").getField(true,"White"));
 BA.debugLineNum = 1459;BA.debugLine="LabelKoniMesafesi25.TextSize = 20";
Debug.ShouldStop(262144);
programveri.mostCurrent._labelkonimesafesi25.runMethod(true,"setTextSize",BA.numberCast(float.class, 20));
 BA.debugLineNum = 1460;BA.debugLine="LabelKoniMesafesi25.Typeface = Typeface.DEFAULT_B";
Debug.ShouldStop(524288);
programveri.mostCurrent._labelkonimesafesi25.runMethod(false,"setTypeface",programveri.mostCurrent.__c.getField(false,"Typeface").getField(false,"DEFAULT_BOLD"));
 BA.debugLineNum = 1465;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("Activity_Pause (programveri) ","programveri",12,programveri.mostCurrent.activityBA,programveri.mostCurrent,1471);
if (RapidSub.canDelegate("activity_pause")) { return b4a.example3.programveri.remoteMe.runUserSub(false, "programveri","activity_pause", _userclosed);}
Debug.locals.put("UserClosed", _userclosed);
 BA.debugLineNum = 1471;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
Debug.ShouldStop(1073741824);
 BA.debugLineNum = 1473;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("Activity_Resume (programveri) ","programveri",12,programveri.mostCurrent.activityBA,programveri.mostCurrent,1467);
if (RapidSub.canDelegate("activity_resume")) { return b4a.example3.programveri.remoteMe.runUserSub(false, "programveri","activity_resume");}
 BA.debugLineNum = 1467;BA.debugLine="Sub Activity_Resume";
Debug.ShouldStop(67108864);
 BA.debugLineNum = 1469;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("ButtonOK_Click (programveri) ","programveri",12,programveri.mostCurrent.activityBA,programveri.mostCurrent,1750);
if (RapidSub.canDelegate("buttonok_click")) { return b4a.example3.programveri.remoteMe.runUserSub(false, "programveri","buttonok_click");}
RemoteObject _result = RemoteObject.createImmutable(0);
RemoteObject _now = RemoteObject.createImmutable(0L);
 BA.debugLineNum = 1750;BA.debugLine="Sub ButtonOK_Click";
Debug.ShouldStop(2097152);
 BA.debugLineNum = 1751;BA.debugLine="VeriAl";
Debug.ShouldStop(4194304);
_verial();
 BA.debugLineNum = 1752;BA.debugLine="Dim result As Int";
Debug.ShouldStop(8388608);
_result = RemoteObject.createImmutable(0);Debug.locals.put("result", _result);
 BA.debugLineNum = 1753;BA.debugLine="result = Msgbox2(\"Programı eklemek istiyor musunu";
Debug.ShouldStop(16777216);
_result = programveri.mostCurrent.__c.runMethodAndSync(true,"Msgbox2",(Object)(BA.ObjectToCharSequence("Programı eklemek istiyor musunuz?:")),(Object)(BA.ObjectToCharSequence("Onay Mesajı")),(Object)(BA.ObjectToString("Evet")),(Object)(BA.ObjectToString("")),(Object)(BA.ObjectToString("Hayır")),(Object)((programveri.mostCurrent.__c.getField(false,"Null"))),programveri.mostCurrent.activityBA);Debug.locals.put("result", _result);
 BA.debugLineNum = 1754;BA.debugLine="If result= DialogResponse.POSITIVE Then";
Debug.ShouldStop(33554432);
if (RemoteObject.solveBoolean("=",_result,BA.numberCast(double.class, programveri.mostCurrent.__c.getField(false,"DialogResponse").getField(true,"POSITIVE")))) { 
 BA.debugLineNum = 1755;BA.debugLine="Dim now As Long = DateTime.Now";
Debug.ShouldStop(67108864);
_now = programveri.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"getNow");Debug.locals.put("now", _now);Debug.locals.put("now", _now);
 BA.debugLineNum = 1756;BA.debugLine="DateTime.DateFormat = \"dd/MM/yyyy\"";
Debug.ShouldStop(134217728);
programveri.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"setDateFormat",BA.ObjectToString("dd/MM/yyyy"));
 BA.debugLineNum = 1757;BA.debugLine="Log(DateTime.Date(now))";
Debug.ShouldStop(268435456);
programveri.mostCurrent.__c.runVoidMethod ("LogImpl","212582919",programveri.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"Date",(Object)(_now)),0);
 BA.debugLineNum = 1758;BA.debugLine="secilenTarih = DateTime.Date(now)";
Debug.ShouldStop(536870912);
programveri.mostCurrent._secilentarih = programveri.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"Date",(Object)(_now));
 BA.debugLineNum = 1759;BA.debugLine="Log(DateTime.Time(now))";
Debug.ShouldStop(1073741824);
programveri.mostCurrent.__c.runVoidMethod ("LogImpl","212582921",programveri.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"Time",(Object)(_now)),0);
 BA.debugLineNum = 1760;BA.debugLine="secilenSaat = DateTime.Time(now)";
Debug.ShouldStop(-2147483648);
programveri.mostCurrent._secilensaat = programveri.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"Time",(Object)(_now));
 BA.debugLineNum = 1761;BA.debugLine="ID";
Debug.ShouldStop(1);
_id();
 BA.debugLineNum = 1762;BA.debugLine="Main.sql.ExecNonQuery2(\"INSERT INTO Dayaniklilik";
Debug.ShouldStop(2);
programveri.mostCurrent._main._sql /*RemoteObject*/ .runVoidMethod ("ExecNonQuery2",(Object)(BA.ObjectToString("INSERT INTO DayaniklilikTestProgram VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)")),(Object)(programveri.mostCurrent.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("Object",new int[] {106},new Object[] {(programveri._programid),(programveri.mostCurrent._programayar._programadi /*RemoteObject*/ ),(programveri.mostCurrent._secilentarih),(programveri.mostCurrent._secilensaat),(programveri.mostCurrent._programayar._secilenlevel /*RemoteObject*/ ),(programveri.mostCurrent._programayar._secilentestturu /*RemoteObject*/ ),(programveri._konimesafesi1),(programveri._hiz1),(programveri._dakika1),(programveri._saniye1),(programveri._konimesafesi2),(programveri._hiz2),(programveri._dakika2),(programveri._saniye2),(programveri._konimesafesi3),(programveri._hiz3),(programveri._dakika3),(programveri._saniye3),(programveri._konimesafesi4),(programveri._hiz4),(programveri._dakika4),(programveri._saniye4),(programveri._konimesafesi5),(programveri._hiz5),(programveri._dakika5),(programveri._saniye5),(programveri._konimesafesi6),(programveri._hiz6),(programveri._dakika6),(programveri._saniye6),(programveri._konimesafesi7),(programveri._hiz7),(programveri._dakika7),(programveri._saniye7),(programveri._konimesafesi8),(programveri._hiz8),(programveri._dakika8),(programveri._saniye8),(programveri._konimesafesi9),(programveri._hiz9),(programveri._dakika9),(programveri._saniye9),(programveri._konimesafesi10),(programveri._hiz10),(programveri._dakika10),(programveri._saniye10),(programveri._konimesafesi11),(programveri._hiz11),(programveri._dakika11),(programveri._saniye11),(programveri._konimesafesi12),(programveri._hiz12),(programveri._dakika12),(programveri._saniye12),(programveri._konimesafesi13),(programveri._hiz13),(programveri._dakika13),(programveri._saniye13),(programveri._konimesafesi14),(programveri._hiz14),(programveri._dakika14),(programveri._saniye14),(programveri._konimesafesi15),(programveri._hiz15),(programveri._dakika15),(programveri._saniye15),(programveri._konimesafesi16),(programveri._hiz16),(programveri._dakika16),(programveri._saniye16),(programveri._konimesafesi17),(programveri._hiz17),(programveri._dakika17),(programveri._saniye17),(programveri._konimesafesi18),(programveri._hiz18),(programveri._dakika18),(programveri._saniye18),(programveri._konimesafesi19),(programveri._hiz19),(programveri._dakika19),(programveri._saniye19),(programveri._konimesafesi20),(programveri._hiz20),(programveri._dakika20),(programveri._saniye20),(programveri._konimesafesi21),(programveri._hiz21),(programveri._dakika21),(programveri._saniye21),(programveri._konimesafesi22),(programveri._hiz22),(programveri._dakika22),(programveri._saniye22),(programveri._konimesafesi23),(programveri._hiz23),(programveri._dakika23),(programveri._saniye23),(programveri._konimesafesi24),(programveri._hiz24),(programveri._dakika24),(programveri._saniye24),(programveri._konimesafesi25),(programveri._hiz25),(programveri._dakika25),(programveri._saniye25)})))));
 BA.debugLineNum = 1763;BA.debugLine="StartActivity(ProgramListele)";
Debug.ShouldStop(4);
programveri.mostCurrent.__c.runVoidMethod ("StartActivity",programveri.processBA,(Object)((programveri.mostCurrent._programlistele.getObject())));
 BA.debugLineNum = 1764;BA.debugLine="Activity.Finish";
Debug.ShouldStop(8);
programveri.mostCurrent._activity.runVoidMethod ("Finish");
 }else 
{ BA.debugLineNum = 1765;BA.debugLine="Else If result= DialogResponse.NEGATIVE Then";
Debug.ShouldStop(16);
if (RemoteObject.solveBoolean("=",_result,BA.numberCast(double.class, programveri.mostCurrent.__c.getField(false,"DialogResponse").getField(true,"NEGATIVE")))) { 
 BA.debugLineNum = 1766;BA.debugLine="ToastMessageShow(\"Yönlendiriliyorsunuz...\",False";
Debug.ShouldStop(32);
programveri.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("Yönlendiriliyorsunuz...")),(Object)(programveri.mostCurrent.__c.getField(true,"False")));
 BA.debugLineNum = 1767;BA.debugLine="Return";
Debug.ShouldStop(64);
if (true) return RemoteObject.createImmutable("");
 }}
;
 BA.debugLineNum = 1770;BA.debugLine="End Sub";
Debug.ShouldStop(512);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _edittextdakika1_textchanged(RemoteObject _old,RemoteObject _new) throws Exception{
try {
		Debug.PushSubsStack("EditTextDakika1_TextChanged (programveri) ","programveri",12,programveri.mostCurrent.activityBA,programveri.mostCurrent,1795);
if (RapidSub.canDelegate("edittextdakika1_textchanged")) { return b4a.example3.programveri.remoteMe.runUserSub(false, "programveri","edittextdakika1_textchanged", _old, _new);}
Debug.locals.put("Old", _old);
Debug.locals.put("New", _new);
 BA.debugLineNum = 1795;BA.debugLine="Sub EditTextDakika1_TextChanged (Old As String, Ne";
Debug.ShouldStop(4);
 BA.debugLineNum = 1796;BA.debugLine="If EditTextDakika1.Text.Length == 0 Then";
Debug.ShouldStop(8);
if (RemoteObject.solveBoolean("=",programveri.mostCurrent._edittextdakika1.runMethod(true,"getText").runMethod(true,"length"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 1797;BA.debugLine="dakika1 = Old";
Debug.ShouldStop(16);
programveri._dakika1 = BA.numberCast(int.class, _old);
 }else {
 BA.debugLineNum = 1799;BA.debugLine="dakika1 = New";
Debug.ShouldStop(64);
programveri._dakika1 = BA.numberCast(int.class, _new);
 };
 BA.debugLineNum = 1801;BA.debugLine="End Sub";
Debug.ShouldStop(256);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _edittextdakika10_textchanged(RemoteObject _old,RemoteObject _new) throws Exception{
try {
		Debug.PushSubsStack("EditTextDakika10_TextChanged (programveri) ","programveri",12,programveri.mostCurrent.activityBA,programveri.mostCurrent,2083);
if (RapidSub.canDelegate("edittextdakika10_textchanged")) { return b4a.example3.programveri.remoteMe.runUserSub(false, "programveri","edittextdakika10_textchanged", _old, _new);}
Debug.locals.put("Old", _old);
Debug.locals.put("New", _new);
 BA.debugLineNum = 2083;BA.debugLine="Sub EditTextDakika10_TextChanged (Old As String, N";
Debug.ShouldStop(4);
 BA.debugLineNum = 2084;BA.debugLine="If EditTextDakika10.Text.Length == 0 Then";
Debug.ShouldStop(8);
if (RemoteObject.solveBoolean("=",programveri.mostCurrent._edittextdakika10.runMethod(true,"getText").runMethod(true,"length"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 2085;BA.debugLine="dakika10 = Old";
Debug.ShouldStop(16);
programveri._dakika10 = BA.numberCast(int.class, _old);
 }else {
 BA.debugLineNum = 2087;BA.debugLine="dakika10 = New";
Debug.ShouldStop(64);
programveri._dakika10 = BA.numberCast(int.class, _new);
 };
 BA.debugLineNum = 2089;BA.debugLine="End Sub";
Debug.ShouldStop(256);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _edittextdakika11_textchanged(RemoteObject _old,RemoteObject _new) throws Exception{
try {
		Debug.PushSubsStack("EditTextDakika11_TextChanged (programveri) ","programveri",12,programveri.mostCurrent.activityBA,programveri.mostCurrent,2115);
if (RapidSub.canDelegate("edittextdakika11_textchanged")) { return b4a.example3.programveri.remoteMe.runUserSub(false, "programveri","edittextdakika11_textchanged", _old, _new);}
Debug.locals.put("Old", _old);
Debug.locals.put("New", _new);
 BA.debugLineNum = 2115;BA.debugLine="Sub EditTextDakika11_TextChanged (Old As String, N";
Debug.ShouldStop(4);
 BA.debugLineNum = 2116;BA.debugLine="If EditTextDakika11.Text.Length == 0 Then";
Debug.ShouldStop(8);
if (RemoteObject.solveBoolean("=",programveri.mostCurrent._edittextdakika11.runMethod(true,"getText").runMethod(true,"length"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 2117;BA.debugLine="dakika11 = Old";
Debug.ShouldStop(16);
programveri._dakika11 = BA.numberCast(int.class, _old);
 }else {
 BA.debugLineNum = 2119;BA.debugLine="dakika11 = New";
Debug.ShouldStop(64);
programveri._dakika11 = BA.numberCast(int.class, _new);
 };
 BA.debugLineNum = 2121;BA.debugLine="End Sub";
Debug.ShouldStop(256);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _edittextdakika12_textchanged(RemoteObject _old,RemoteObject _new) throws Exception{
try {
		Debug.PushSubsStack("EditTextDakika12_TextChanged (programveri) ","programveri",12,programveri.mostCurrent.activityBA,programveri.mostCurrent,2147);
if (RapidSub.canDelegate("edittextdakika12_textchanged")) { return b4a.example3.programveri.remoteMe.runUserSub(false, "programveri","edittextdakika12_textchanged", _old, _new);}
Debug.locals.put("Old", _old);
Debug.locals.put("New", _new);
 BA.debugLineNum = 2147;BA.debugLine="Sub EditTextDakika12_TextChanged (Old As String, N";
Debug.ShouldStop(4);
 BA.debugLineNum = 2148;BA.debugLine="If EditTextDakika12.Text.Length == 0 Then";
Debug.ShouldStop(8);
if (RemoteObject.solveBoolean("=",programveri.mostCurrent._edittextdakika12.runMethod(true,"getText").runMethod(true,"length"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 2149;BA.debugLine="dakika12 = Old";
Debug.ShouldStop(16);
programveri._dakika12 = BA.numberCast(int.class, _old);
 }else {
 BA.debugLineNum = 2151;BA.debugLine="dakika12 = New";
Debug.ShouldStop(64);
programveri._dakika12 = BA.numberCast(int.class, _new);
 };
 BA.debugLineNum = 2153;BA.debugLine="End Sub";
Debug.ShouldStop(256);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _edittextdakika13_textchanged(RemoteObject _old,RemoteObject _new) throws Exception{
try {
		Debug.PushSubsStack("EditTextDakika13_TextChanged (programveri) ","programveri",12,programveri.mostCurrent.activityBA,programveri.mostCurrent,2179);
if (RapidSub.canDelegate("edittextdakika13_textchanged")) { return b4a.example3.programveri.remoteMe.runUserSub(false, "programveri","edittextdakika13_textchanged", _old, _new);}
Debug.locals.put("Old", _old);
Debug.locals.put("New", _new);
 BA.debugLineNum = 2179;BA.debugLine="Sub EditTextDakika13_TextChanged (Old As String, N";
Debug.ShouldStop(4);
 BA.debugLineNum = 2180;BA.debugLine="If EditTextDakika13.Text.Length == 0 Then";
Debug.ShouldStop(8);
if (RemoteObject.solveBoolean("=",programveri.mostCurrent._edittextdakika13.runMethod(true,"getText").runMethod(true,"length"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 2181;BA.debugLine="dakika13 = Old";
Debug.ShouldStop(16);
programveri._dakika13 = BA.numberCast(int.class, _old);
 }else {
 BA.debugLineNum = 2183;BA.debugLine="dakika13 = New";
Debug.ShouldStop(64);
programveri._dakika13 = BA.numberCast(int.class, _new);
 };
 BA.debugLineNum = 2185;BA.debugLine="End Sub";
Debug.ShouldStop(256);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _edittextdakika14_textchanged(RemoteObject _old,RemoteObject _new) throws Exception{
try {
		Debug.PushSubsStack("EditTextDakika14_TextChanged (programveri) ","programveri",12,programveri.mostCurrent.activityBA,programveri.mostCurrent,2211);
if (RapidSub.canDelegate("edittextdakika14_textchanged")) { return b4a.example3.programveri.remoteMe.runUserSub(false, "programveri","edittextdakika14_textchanged", _old, _new);}
Debug.locals.put("Old", _old);
Debug.locals.put("New", _new);
 BA.debugLineNum = 2211;BA.debugLine="Sub EditTextDakika14_TextChanged (Old As String, N";
Debug.ShouldStop(4);
 BA.debugLineNum = 2212;BA.debugLine="If EditTextDakika14.Text.Length == 0 Then";
Debug.ShouldStop(8);
if (RemoteObject.solveBoolean("=",programveri.mostCurrent._edittextdakika14.runMethod(true,"getText").runMethod(true,"length"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 2213;BA.debugLine="dakika14 = Old";
Debug.ShouldStop(16);
programveri._dakika14 = BA.numberCast(int.class, _old);
 }else {
 BA.debugLineNum = 2215;BA.debugLine="dakika14 = New";
Debug.ShouldStop(64);
programveri._dakika14 = BA.numberCast(int.class, _new);
 };
 BA.debugLineNum = 2217;BA.debugLine="End Sub";
Debug.ShouldStop(256);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _edittextdakika15_textchanged(RemoteObject _old,RemoteObject _new) throws Exception{
try {
		Debug.PushSubsStack("EditTextDakika15_TextChanged (programveri) ","programveri",12,programveri.mostCurrent.activityBA,programveri.mostCurrent,2243);
if (RapidSub.canDelegate("edittextdakika15_textchanged")) { return b4a.example3.programveri.remoteMe.runUserSub(false, "programveri","edittextdakika15_textchanged", _old, _new);}
Debug.locals.put("Old", _old);
Debug.locals.put("New", _new);
 BA.debugLineNum = 2243;BA.debugLine="Sub EditTextDakika15_TextChanged (Old As String, N";
Debug.ShouldStop(4);
 BA.debugLineNum = 2244;BA.debugLine="If EditTextDakika15.Text.Length == 0 Then";
Debug.ShouldStop(8);
if (RemoteObject.solveBoolean("=",programveri.mostCurrent._edittextdakika15.runMethod(true,"getText").runMethod(true,"length"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 2245;BA.debugLine="dakika15 = Old";
Debug.ShouldStop(16);
programveri._dakika15 = BA.numberCast(int.class, _old);
 }else {
 BA.debugLineNum = 2247;BA.debugLine="dakika15 = New";
Debug.ShouldStop(64);
programveri._dakika15 = BA.numberCast(int.class, _new);
 };
 BA.debugLineNum = 2249;BA.debugLine="End Sub";
Debug.ShouldStop(256);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _edittextdakika16_textchanged(RemoteObject _old,RemoteObject _new) throws Exception{
try {
		Debug.PushSubsStack("EditTextDakika16_TextChanged (programveri) ","programveri",12,programveri.mostCurrent.activityBA,programveri.mostCurrent,2275);
if (RapidSub.canDelegate("edittextdakika16_textchanged")) { return b4a.example3.programveri.remoteMe.runUserSub(false, "programveri","edittextdakika16_textchanged", _old, _new);}
Debug.locals.put("Old", _old);
Debug.locals.put("New", _new);
 BA.debugLineNum = 2275;BA.debugLine="Sub EditTextDakika16_TextChanged (Old As String, N";
Debug.ShouldStop(4);
 BA.debugLineNum = 2276;BA.debugLine="If EditTextDakika16.Text.Length == 0 Then";
Debug.ShouldStop(8);
if (RemoteObject.solveBoolean("=",programveri.mostCurrent._edittextdakika16.runMethod(true,"getText").runMethod(true,"length"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 2277;BA.debugLine="dakika16 = Old";
Debug.ShouldStop(16);
programveri._dakika16 = BA.numberCast(int.class, _old);
 }else {
 BA.debugLineNum = 2279;BA.debugLine="dakika16 = New";
Debug.ShouldStop(64);
programveri._dakika16 = BA.numberCast(int.class, _new);
 };
 BA.debugLineNum = 2281;BA.debugLine="End Sub";
Debug.ShouldStop(256);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _edittextdakika17_textchanged(RemoteObject _old,RemoteObject _new) throws Exception{
try {
		Debug.PushSubsStack("EditTextDakika17_TextChanged (programveri) ","programveri",12,programveri.mostCurrent.activityBA,programveri.mostCurrent,2307);
if (RapidSub.canDelegate("edittextdakika17_textchanged")) { return b4a.example3.programveri.remoteMe.runUserSub(false, "programveri","edittextdakika17_textchanged", _old, _new);}
Debug.locals.put("Old", _old);
Debug.locals.put("New", _new);
 BA.debugLineNum = 2307;BA.debugLine="Sub EditTextDakika17_TextChanged (Old As String, N";
Debug.ShouldStop(4);
 BA.debugLineNum = 2308;BA.debugLine="If EditTextDakika17.Text.Length == 0 Then";
Debug.ShouldStop(8);
if (RemoteObject.solveBoolean("=",programveri.mostCurrent._edittextdakika17.runMethod(true,"getText").runMethod(true,"length"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 2309;BA.debugLine="dakika17 = Old";
Debug.ShouldStop(16);
programveri._dakika17 = BA.numberCast(int.class, _old);
 }else {
 BA.debugLineNum = 2311;BA.debugLine="dakika17 = New";
Debug.ShouldStop(64);
programveri._dakika17 = BA.numberCast(int.class, _new);
 };
 BA.debugLineNum = 2313;BA.debugLine="End Sub";
Debug.ShouldStop(256);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _edittextdakika18_textchanged(RemoteObject _old,RemoteObject _new) throws Exception{
try {
		Debug.PushSubsStack("EditTextDakika18_TextChanged (programveri) ","programveri",12,programveri.mostCurrent.activityBA,programveri.mostCurrent,2339);
if (RapidSub.canDelegate("edittextdakika18_textchanged")) { return b4a.example3.programveri.remoteMe.runUserSub(false, "programveri","edittextdakika18_textchanged", _old, _new);}
Debug.locals.put("Old", _old);
Debug.locals.put("New", _new);
 BA.debugLineNum = 2339;BA.debugLine="Sub EditTextDakika18_TextChanged (Old As String, N";
Debug.ShouldStop(4);
 BA.debugLineNum = 2340;BA.debugLine="If EditTextDakika18.Text.Length == 0 Then";
Debug.ShouldStop(8);
if (RemoteObject.solveBoolean("=",programveri.mostCurrent._edittextdakika18.runMethod(true,"getText").runMethod(true,"length"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 2341;BA.debugLine="dakika18 = Old";
Debug.ShouldStop(16);
programveri._dakika18 = BA.numberCast(int.class, _old);
 }else {
 BA.debugLineNum = 2343;BA.debugLine="dakika18 = New";
Debug.ShouldStop(64);
programveri._dakika18 = BA.numberCast(int.class, _new);
 };
 BA.debugLineNum = 2345;BA.debugLine="End Sub";
Debug.ShouldStop(256);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _edittextdakika19_textchanged(RemoteObject _old,RemoteObject _new) throws Exception{
try {
		Debug.PushSubsStack("EditTextDakika19_TextChanged (programveri) ","programveri",12,programveri.mostCurrent.activityBA,programveri.mostCurrent,2371);
if (RapidSub.canDelegate("edittextdakika19_textchanged")) { return b4a.example3.programveri.remoteMe.runUserSub(false, "programveri","edittextdakika19_textchanged", _old, _new);}
Debug.locals.put("Old", _old);
Debug.locals.put("New", _new);
 BA.debugLineNum = 2371;BA.debugLine="Sub EditTextDakika19_TextChanged (Old As String, N";
Debug.ShouldStop(4);
 BA.debugLineNum = 2372;BA.debugLine="If EditTextDakika19.Text.Length == 0 Then";
Debug.ShouldStop(8);
if (RemoteObject.solveBoolean("=",programveri.mostCurrent._edittextdakika19.runMethod(true,"getText").runMethod(true,"length"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 2373;BA.debugLine="dakika19 = Old";
Debug.ShouldStop(16);
programveri._dakika19 = BA.numberCast(int.class, _old);
 }else {
 BA.debugLineNum = 2375;BA.debugLine="dakika19 = New";
Debug.ShouldStop(64);
programveri._dakika19 = BA.numberCast(int.class, _new);
 };
 BA.debugLineNum = 2377;BA.debugLine="End Sub";
Debug.ShouldStop(256);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _edittextdakika2_textchanged(RemoteObject _old,RemoteObject _new) throws Exception{
try {
		Debug.PushSubsStack("EditTextDakika2_TextChanged (programveri) ","programveri",12,programveri.mostCurrent.activityBA,programveri.mostCurrent,1827);
if (RapidSub.canDelegate("edittextdakika2_textchanged")) { return b4a.example3.programveri.remoteMe.runUserSub(false, "programveri","edittextdakika2_textchanged", _old, _new);}
Debug.locals.put("Old", _old);
Debug.locals.put("New", _new);
 BA.debugLineNum = 1827;BA.debugLine="Sub EditTextDakika2_TextChanged (Old As String, Ne";
Debug.ShouldStop(4);
 BA.debugLineNum = 1828;BA.debugLine="If EditTextDakika2.Text.Length == 0 Then";
Debug.ShouldStop(8);
if (RemoteObject.solveBoolean("=",programveri.mostCurrent._edittextdakika2.runMethod(true,"getText").runMethod(true,"length"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 1829;BA.debugLine="dakika2 = Old";
Debug.ShouldStop(16);
programveri._dakika2 = BA.numberCast(int.class, _old);
 }else {
 BA.debugLineNum = 1831;BA.debugLine="dakika2 = New";
Debug.ShouldStop(64);
programveri._dakika2 = BA.numberCast(int.class, _new);
 };
 BA.debugLineNum = 1833;BA.debugLine="End Sub";
Debug.ShouldStop(256);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _edittextdakika20_textchanged(RemoteObject _old,RemoteObject _new) throws Exception{
try {
		Debug.PushSubsStack("EditTextDakika20_TextChanged (programveri) ","programveri",12,programveri.mostCurrent.activityBA,programveri.mostCurrent,2403);
if (RapidSub.canDelegate("edittextdakika20_textchanged")) { return b4a.example3.programveri.remoteMe.runUserSub(false, "programveri","edittextdakika20_textchanged", _old, _new);}
Debug.locals.put("Old", _old);
Debug.locals.put("New", _new);
 BA.debugLineNum = 2403;BA.debugLine="Sub EditTextDakika20_TextChanged (Old As String, N";
Debug.ShouldStop(4);
 BA.debugLineNum = 2404;BA.debugLine="If EditTextDakika20.Text.Length == 0 Then";
Debug.ShouldStop(8);
if (RemoteObject.solveBoolean("=",programveri.mostCurrent._edittextdakika20.runMethod(true,"getText").runMethod(true,"length"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 2405;BA.debugLine="dakika20 = Old";
Debug.ShouldStop(16);
programveri._dakika20 = BA.numberCast(int.class, _old);
 }else {
 BA.debugLineNum = 2407;BA.debugLine="dakika20 = New";
Debug.ShouldStop(64);
programveri._dakika20 = BA.numberCast(int.class, _new);
 };
 BA.debugLineNum = 2409;BA.debugLine="End Sub";
Debug.ShouldStop(256);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _edittextdakika21_textchanged(RemoteObject _old,RemoteObject _new) throws Exception{
try {
		Debug.PushSubsStack("EditTextDakika21_TextChanged (programveri) ","programveri",12,programveri.mostCurrent.activityBA,programveri.mostCurrent,2435);
if (RapidSub.canDelegate("edittextdakika21_textchanged")) { return b4a.example3.programveri.remoteMe.runUserSub(false, "programveri","edittextdakika21_textchanged", _old, _new);}
Debug.locals.put("Old", _old);
Debug.locals.put("New", _new);
 BA.debugLineNum = 2435;BA.debugLine="Sub EditTextDakika21_TextChanged (Old As String, N";
Debug.ShouldStop(4);
 BA.debugLineNum = 2436;BA.debugLine="If EditTextDakika21.Text.Length == 0 Then";
Debug.ShouldStop(8);
if (RemoteObject.solveBoolean("=",programveri.mostCurrent._edittextdakika21.runMethod(true,"getText").runMethod(true,"length"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 2437;BA.debugLine="dakika21 = Old";
Debug.ShouldStop(16);
programveri._dakika21 = BA.numberCast(int.class, _old);
 }else {
 BA.debugLineNum = 2439;BA.debugLine="dakika21 = New";
Debug.ShouldStop(64);
programveri._dakika21 = BA.numberCast(int.class, _new);
 };
 BA.debugLineNum = 2441;BA.debugLine="End Sub";
Debug.ShouldStop(256);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _edittextdakika22_textchanged(RemoteObject _old,RemoteObject _new) throws Exception{
try {
		Debug.PushSubsStack("EditTextDakika22_TextChanged (programveri) ","programveri",12,programveri.mostCurrent.activityBA,programveri.mostCurrent,2467);
if (RapidSub.canDelegate("edittextdakika22_textchanged")) { return b4a.example3.programveri.remoteMe.runUserSub(false, "programveri","edittextdakika22_textchanged", _old, _new);}
Debug.locals.put("Old", _old);
Debug.locals.put("New", _new);
 BA.debugLineNum = 2467;BA.debugLine="Sub EditTextDakika22_TextChanged (Old As String, N";
Debug.ShouldStop(4);
 BA.debugLineNum = 2468;BA.debugLine="If EditTextDakika22.Text.Length == 0 Then";
Debug.ShouldStop(8);
if (RemoteObject.solveBoolean("=",programveri.mostCurrent._edittextdakika22.runMethod(true,"getText").runMethod(true,"length"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 2469;BA.debugLine="dakika22 = Old";
Debug.ShouldStop(16);
programveri._dakika22 = BA.numberCast(int.class, _old);
 }else {
 BA.debugLineNum = 2471;BA.debugLine="dakika22 = New";
Debug.ShouldStop(64);
programveri._dakika22 = BA.numberCast(int.class, _new);
 };
 BA.debugLineNum = 2473;BA.debugLine="End Sub";
Debug.ShouldStop(256);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _edittextdakika23_textchanged(RemoteObject _old,RemoteObject _new) throws Exception{
try {
		Debug.PushSubsStack("EditTextDakika23_TextChanged (programveri) ","programveri",12,programveri.mostCurrent.activityBA,programveri.mostCurrent,2491);
if (RapidSub.canDelegate("edittextdakika23_textchanged")) { return b4a.example3.programveri.remoteMe.runUserSub(false, "programveri","edittextdakika23_textchanged", _old, _new);}
Debug.locals.put("Old", _old);
Debug.locals.put("New", _new);
 BA.debugLineNum = 2491;BA.debugLine="Sub EditTextDakika23_TextChanged (Old As String, N";
Debug.ShouldStop(67108864);
 BA.debugLineNum = 2492;BA.debugLine="If EditTextDakika23.Text.Length == 0 Then";
Debug.ShouldStop(134217728);
if (RemoteObject.solveBoolean("=",programveri.mostCurrent._edittextdakika23.runMethod(true,"getText").runMethod(true,"length"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 2493;BA.debugLine="dakika23 = Old";
Debug.ShouldStop(268435456);
programveri._dakika23 = BA.numberCast(int.class, _old);
 }else {
 BA.debugLineNum = 2495;BA.debugLine="dakika23 = New";
Debug.ShouldStop(1073741824);
programveri._dakika23 = BA.numberCast(int.class, _new);
 };
 BA.debugLineNum = 2497;BA.debugLine="End Sub";
Debug.ShouldStop(1);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _edittextdakika24_textchanged(RemoteObject _old,RemoteObject _new) throws Exception{
try {
		Debug.PushSubsStack("EditTextDakika24_TextChanged (programveri) ","programveri",12,programveri.mostCurrent.activityBA,programveri.mostCurrent,2531);
if (RapidSub.canDelegate("edittextdakika24_textchanged")) { return b4a.example3.programveri.remoteMe.runUserSub(false, "programveri","edittextdakika24_textchanged", _old, _new);}
Debug.locals.put("Old", _old);
Debug.locals.put("New", _new);
 BA.debugLineNum = 2531;BA.debugLine="Sub EditTextDakika24_TextChanged (Old As String, N";
Debug.ShouldStop(4);
 BA.debugLineNum = 2532;BA.debugLine="If EditTextDakika24.Text.Length == 0 Then";
Debug.ShouldStop(8);
if (RemoteObject.solveBoolean("=",programveri.mostCurrent._edittextdakika24.runMethod(true,"getText").runMethod(true,"length"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 2533;BA.debugLine="dakika24 = Old";
Debug.ShouldStop(16);
programveri._dakika24 = BA.numberCast(int.class, _old);
 }else {
 BA.debugLineNum = 2535;BA.debugLine="dakika24 = New";
Debug.ShouldStop(64);
programveri._dakika24 = BA.numberCast(int.class, _new);
 };
 BA.debugLineNum = 2537;BA.debugLine="End Sub";
Debug.ShouldStop(256);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _edittextdakika25_textchanged(RemoteObject _old,RemoteObject _new) throws Exception{
try {
		Debug.PushSubsStack("EditTextDakika25_TextChanged (programveri) ","programveri",12,programveri.mostCurrent.activityBA,programveri.mostCurrent,2555);
if (RapidSub.canDelegate("edittextdakika25_textchanged")) { return b4a.example3.programveri.remoteMe.runUserSub(false, "programveri","edittextdakika25_textchanged", _old, _new);}
Debug.locals.put("Old", _old);
Debug.locals.put("New", _new);
 BA.debugLineNum = 2555;BA.debugLine="Sub EditTextDakika25_TextChanged (Old As String, N";
Debug.ShouldStop(67108864);
 BA.debugLineNum = 2556;BA.debugLine="If EditTextDakika25.Text.Length == 0 Then";
Debug.ShouldStop(134217728);
if (RemoteObject.solveBoolean("=",programveri.mostCurrent._edittextdakika25.runMethod(true,"getText").runMethod(true,"length"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 2557;BA.debugLine="dakika25 = Old";
Debug.ShouldStop(268435456);
programveri._dakika25 = BA.numberCast(int.class, _old);
 }else {
 BA.debugLineNum = 2559;BA.debugLine="dakika25 = New";
Debug.ShouldStop(1073741824);
programveri._dakika25 = BA.numberCast(int.class, _new);
 };
 BA.debugLineNum = 2561;BA.debugLine="End Sub";
Debug.ShouldStop(1);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _edittextdakika3_textchanged(RemoteObject _old,RemoteObject _new) throws Exception{
try {
		Debug.PushSubsStack("EditTextDakika3_TextChanged (programveri) ","programveri",12,programveri.mostCurrent.activityBA,programveri.mostCurrent,1859);
if (RapidSub.canDelegate("edittextdakika3_textchanged")) { return b4a.example3.programveri.remoteMe.runUserSub(false, "programveri","edittextdakika3_textchanged", _old, _new);}
Debug.locals.put("Old", _old);
Debug.locals.put("New", _new);
 BA.debugLineNum = 1859;BA.debugLine="Sub EditTextDakika3_TextChanged (Old As String, Ne";
Debug.ShouldStop(4);
 BA.debugLineNum = 1860;BA.debugLine="If EditTextDakika3.Text.Length == 0 Then";
Debug.ShouldStop(8);
if (RemoteObject.solveBoolean("=",programveri.mostCurrent._edittextdakika3.runMethod(true,"getText").runMethod(true,"length"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 1861;BA.debugLine="dakika3 = Old";
Debug.ShouldStop(16);
programveri._dakika3 = BA.numberCast(int.class, _old);
 }else {
 BA.debugLineNum = 1863;BA.debugLine="dakika3 = New";
Debug.ShouldStop(64);
programveri._dakika3 = BA.numberCast(int.class, _new);
 };
 BA.debugLineNum = 1865;BA.debugLine="End Sub";
Debug.ShouldStop(256);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _edittextdakika4_textchanged(RemoteObject _old,RemoteObject _new) throws Exception{
try {
		Debug.PushSubsStack("EditTextDakika4_TextChanged (programveri) ","programveri",12,programveri.mostCurrent.activityBA,programveri.mostCurrent,1891);
if (RapidSub.canDelegate("edittextdakika4_textchanged")) { return b4a.example3.programveri.remoteMe.runUserSub(false, "programveri","edittextdakika4_textchanged", _old, _new);}
Debug.locals.put("Old", _old);
Debug.locals.put("New", _new);
 BA.debugLineNum = 1891;BA.debugLine="Sub EditTextDakika4_TextChanged (Old As String, Ne";
Debug.ShouldStop(4);
 BA.debugLineNum = 1892;BA.debugLine="If EditTextDakika4.Text.Length == 0 Then";
Debug.ShouldStop(8);
if (RemoteObject.solveBoolean("=",programveri.mostCurrent._edittextdakika4.runMethod(true,"getText").runMethod(true,"length"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 1893;BA.debugLine="dakika4 = Old";
Debug.ShouldStop(16);
programveri._dakika4 = BA.numberCast(int.class, _old);
 }else {
 BA.debugLineNum = 1895;BA.debugLine="dakika4 = New";
Debug.ShouldStop(64);
programveri._dakika4 = BA.numberCast(int.class, _new);
 };
 BA.debugLineNum = 1897;BA.debugLine="End Sub";
Debug.ShouldStop(256);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _edittextdakika5_textchanged(RemoteObject _old,RemoteObject _new) throws Exception{
try {
		Debug.PushSubsStack("EditTextDakika5_TextChanged (programveri) ","programveri",12,programveri.mostCurrent.activityBA,programveri.mostCurrent,1923);
if (RapidSub.canDelegate("edittextdakika5_textchanged")) { return b4a.example3.programveri.remoteMe.runUserSub(false, "programveri","edittextdakika5_textchanged", _old, _new);}
Debug.locals.put("Old", _old);
Debug.locals.put("New", _new);
 BA.debugLineNum = 1923;BA.debugLine="Sub EditTextDakika5_TextChanged (Old As String, Ne";
Debug.ShouldStop(4);
 BA.debugLineNum = 1924;BA.debugLine="If EditTextDakika5.Text.Length == 0 Then";
Debug.ShouldStop(8);
if (RemoteObject.solveBoolean("=",programveri.mostCurrent._edittextdakika5.runMethod(true,"getText").runMethod(true,"length"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 1925;BA.debugLine="dakika5 = Old";
Debug.ShouldStop(16);
programveri._dakika5 = BA.numberCast(int.class, _old);
 }else {
 BA.debugLineNum = 1927;BA.debugLine="dakika5 = New";
Debug.ShouldStop(64);
programveri._dakika5 = BA.numberCast(int.class, _new);
 };
 BA.debugLineNum = 1929;BA.debugLine="End Sub";
Debug.ShouldStop(256);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _edittextdakika6_textchanged(RemoteObject _old,RemoteObject _new) throws Exception{
try {
		Debug.PushSubsStack("EditTextDakika6_TextChanged (programveri) ","programveri",12,programveri.mostCurrent.activityBA,programveri.mostCurrent,1955);
if (RapidSub.canDelegate("edittextdakika6_textchanged")) { return b4a.example3.programveri.remoteMe.runUserSub(false, "programveri","edittextdakika6_textchanged", _old, _new);}
Debug.locals.put("Old", _old);
Debug.locals.put("New", _new);
 BA.debugLineNum = 1955;BA.debugLine="Sub EditTextDakika6_TextChanged (Old As String, Ne";
Debug.ShouldStop(4);
 BA.debugLineNum = 1956;BA.debugLine="If EditTextDakika6.Text.Length == 0 Then";
Debug.ShouldStop(8);
if (RemoteObject.solveBoolean("=",programveri.mostCurrent._edittextdakika6.runMethod(true,"getText").runMethod(true,"length"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 1957;BA.debugLine="dakika6 = Old";
Debug.ShouldStop(16);
programveri._dakika6 = BA.numberCast(int.class, _old);
 }else {
 BA.debugLineNum = 1959;BA.debugLine="dakika6 = New";
Debug.ShouldStop(64);
programveri._dakika6 = BA.numberCast(int.class, _new);
 };
 BA.debugLineNum = 1961;BA.debugLine="End Sub";
Debug.ShouldStop(256);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _edittextdakika7_textchanged(RemoteObject _old,RemoteObject _new) throws Exception{
try {
		Debug.PushSubsStack("EditTextDakika7_TextChanged (programveri) ","programveri",12,programveri.mostCurrent.activityBA,programveri.mostCurrent,1987);
if (RapidSub.canDelegate("edittextdakika7_textchanged")) { return b4a.example3.programveri.remoteMe.runUserSub(false, "programveri","edittextdakika7_textchanged", _old, _new);}
Debug.locals.put("Old", _old);
Debug.locals.put("New", _new);
 BA.debugLineNum = 1987;BA.debugLine="Sub EditTextDakika7_TextChanged (Old As String, Ne";
Debug.ShouldStop(4);
 BA.debugLineNum = 1988;BA.debugLine="If EditTextDakika7.Text.Length == 0 Then";
Debug.ShouldStop(8);
if (RemoteObject.solveBoolean("=",programveri.mostCurrent._edittextdakika7.runMethod(true,"getText").runMethod(true,"length"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 1989;BA.debugLine="dakika7 = Old";
Debug.ShouldStop(16);
programveri._dakika7 = BA.numberCast(int.class, _old);
 }else {
 BA.debugLineNum = 1991;BA.debugLine="dakika7 = New";
Debug.ShouldStop(64);
programveri._dakika7 = BA.numberCast(int.class, _new);
 };
 BA.debugLineNum = 1993;BA.debugLine="End Sub";
Debug.ShouldStop(256);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _edittextdakika8_textchanged(RemoteObject _old,RemoteObject _new) throws Exception{
try {
		Debug.PushSubsStack("EditTextDakika8_TextChanged (programveri) ","programveri",12,programveri.mostCurrent.activityBA,programveri.mostCurrent,2019);
if (RapidSub.canDelegate("edittextdakika8_textchanged")) { return b4a.example3.programveri.remoteMe.runUserSub(false, "programveri","edittextdakika8_textchanged", _old, _new);}
Debug.locals.put("Old", _old);
Debug.locals.put("New", _new);
 BA.debugLineNum = 2019;BA.debugLine="Sub EditTextDakika8_TextChanged (Old As String, Ne";
Debug.ShouldStop(4);
 BA.debugLineNum = 2020;BA.debugLine="If EditTextDakika8.Text.Length == 0 Then";
Debug.ShouldStop(8);
if (RemoteObject.solveBoolean("=",programveri.mostCurrent._edittextdakika8.runMethod(true,"getText").runMethod(true,"length"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 2021;BA.debugLine="dakika8 = Old";
Debug.ShouldStop(16);
programveri._dakika8 = BA.numberCast(int.class, _old);
 }else {
 BA.debugLineNum = 2023;BA.debugLine="dakika8 = New";
Debug.ShouldStop(64);
programveri._dakika8 = BA.numberCast(int.class, _new);
 };
 BA.debugLineNum = 2025;BA.debugLine="End Sub";
Debug.ShouldStop(256);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _edittextdakika9_textchanged(RemoteObject _old,RemoteObject _new) throws Exception{
try {
		Debug.PushSubsStack("EditTextDakika9_TextChanged (programveri) ","programveri",12,programveri.mostCurrent.activityBA,programveri.mostCurrent,2051);
if (RapidSub.canDelegate("edittextdakika9_textchanged")) { return b4a.example3.programveri.remoteMe.runUserSub(false, "programveri","edittextdakika9_textchanged", _old, _new);}
Debug.locals.put("Old", _old);
Debug.locals.put("New", _new);
 BA.debugLineNum = 2051;BA.debugLine="Sub EditTextDakika9_TextChanged (Old As String, Ne";
Debug.ShouldStop(4);
 BA.debugLineNum = 2052;BA.debugLine="If EditTextDakika9.Text.Length == 0 Then";
Debug.ShouldStop(8);
if (RemoteObject.solveBoolean("=",programveri.mostCurrent._edittextdakika9.runMethod(true,"getText").runMethod(true,"length"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 2053;BA.debugLine="dakika9 = Old";
Debug.ShouldStop(16);
programveri._dakika9 = BA.numberCast(int.class, _old);
 }else {
 BA.debugLineNum = 2055;BA.debugLine="dakika9 = New";
Debug.ShouldStop(64);
programveri._dakika9 = BA.numberCast(int.class, _new);
 };
 BA.debugLineNum = 2057;BA.debugLine="End Sub";
Debug.ShouldStop(256);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _edittexthiz1_textchanged(RemoteObject _old,RemoteObject _new) throws Exception{
try {
		Debug.PushSubsStack("EditTextHiz1_TextChanged (programveri) ","programveri",12,programveri.mostCurrent.activityBA,programveri.mostCurrent,1787);
if (RapidSub.canDelegate("edittexthiz1_textchanged")) { return b4a.example3.programveri.remoteMe.runUserSub(false, "programveri","edittexthiz1_textchanged", _old, _new);}
Debug.locals.put("Old", _old);
Debug.locals.put("New", _new);
 BA.debugLineNum = 1787;BA.debugLine="Sub EditTextHiz1_TextChanged (Old As String, New A";
Debug.ShouldStop(67108864);
 BA.debugLineNum = 1788;BA.debugLine="If EditTextHiz1.Text.Length == 0 Then";
Debug.ShouldStop(134217728);
if (RemoteObject.solveBoolean("=",programveri.mostCurrent._edittexthiz1.runMethod(true,"getText").runMethod(true,"length"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 1789;BA.debugLine="hiz1 = Old";
Debug.ShouldStop(268435456);
programveri._hiz1 = BA.numberCast(float.class, _old);
 }else {
 BA.debugLineNum = 1791;BA.debugLine="hiz1 = New";
Debug.ShouldStop(1073741824);
programveri._hiz1 = BA.numberCast(float.class, _new);
 };
 BA.debugLineNum = 1793;BA.debugLine="End Sub";
Debug.ShouldStop(1);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _edittexthiz10_textchanged(RemoteObject _old,RemoteObject _new) throws Exception{
try {
		Debug.PushSubsStack("EditTextHiz10_TextChanged (programveri) ","programveri",12,programveri.mostCurrent.activityBA,programveri.mostCurrent,2075);
if (RapidSub.canDelegate("edittexthiz10_textchanged")) { return b4a.example3.programveri.remoteMe.runUserSub(false, "programveri","edittexthiz10_textchanged", _old, _new);}
Debug.locals.put("Old", _old);
Debug.locals.put("New", _new);
 BA.debugLineNum = 2075;BA.debugLine="Sub EditTextHiz10_TextChanged (Old As String, New";
Debug.ShouldStop(67108864);
 BA.debugLineNum = 2076;BA.debugLine="If EditTextHiz10.Text.Length == 0 Then";
Debug.ShouldStop(134217728);
if (RemoteObject.solveBoolean("=",programveri.mostCurrent._edittexthiz10.runMethod(true,"getText").runMethod(true,"length"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 2077;BA.debugLine="hiz10 = Old";
Debug.ShouldStop(268435456);
programveri._hiz10 = BA.numberCast(float.class, _old);
 }else {
 BA.debugLineNum = 2079;BA.debugLine="hiz10 = New";
Debug.ShouldStop(1073741824);
programveri._hiz10 = BA.numberCast(float.class, _new);
 };
 BA.debugLineNum = 2081;BA.debugLine="End Sub";
Debug.ShouldStop(1);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _edittexthiz11_textchanged(RemoteObject _old,RemoteObject _new) throws Exception{
try {
		Debug.PushSubsStack("EditTextHiz11_TextChanged (programveri) ","programveri",12,programveri.mostCurrent.activityBA,programveri.mostCurrent,2107);
if (RapidSub.canDelegate("edittexthiz11_textchanged")) { return b4a.example3.programveri.remoteMe.runUserSub(false, "programveri","edittexthiz11_textchanged", _old, _new);}
Debug.locals.put("Old", _old);
Debug.locals.put("New", _new);
 BA.debugLineNum = 2107;BA.debugLine="Sub EditTextHiz11_TextChanged (Old As String, New";
Debug.ShouldStop(67108864);
 BA.debugLineNum = 2108;BA.debugLine="If EditTextHiz11.Text.Length == 0 Then";
Debug.ShouldStop(134217728);
if (RemoteObject.solveBoolean("=",programveri.mostCurrent._edittexthiz11.runMethod(true,"getText").runMethod(true,"length"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 2109;BA.debugLine="hiz11 = Old";
Debug.ShouldStop(268435456);
programveri._hiz11 = BA.numberCast(float.class, _old);
 }else {
 BA.debugLineNum = 2111;BA.debugLine="hiz11 = New";
Debug.ShouldStop(1073741824);
programveri._hiz11 = BA.numberCast(float.class, _new);
 };
 BA.debugLineNum = 2113;BA.debugLine="End Sub";
Debug.ShouldStop(1);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _edittexthiz12_textchanged(RemoteObject _old,RemoteObject _new) throws Exception{
try {
		Debug.PushSubsStack("EditTextHiz12_TextChanged (programveri) ","programveri",12,programveri.mostCurrent.activityBA,programveri.mostCurrent,2139);
if (RapidSub.canDelegate("edittexthiz12_textchanged")) { return b4a.example3.programveri.remoteMe.runUserSub(false, "programveri","edittexthiz12_textchanged", _old, _new);}
Debug.locals.put("Old", _old);
Debug.locals.put("New", _new);
 BA.debugLineNum = 2139;BA.debugLine="Sub EditTextHiz12_TextChanged (Old As String, New";
Debug.ShouldStop(67108864);
 BA.debugLineNum = 2140;BA.debugLine="If EditTextHiz12.Text.Length == 0 Then";
Debug.ShouldStop(134217728);
if (RemoteObject.solveBoolean("=",programveri.mostCurrent._edittexthiz12.runMethod(true,"getText").runMethod(true,"length"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 2141;BA.debugLine="hiz12 = Old";
Debug.ShouldStop(268435456);
programveri._hiz12 = BA.numberCast(float.class, _old);
 }else {
 BA.debugLineNum = 2143;BA.debugLine="hiz12 = New";
Debug.ShouldStop(1073741824);
programveri._hiz12 = BA.numberCast(float.class, _new);
 };
 BA.debugLineNum = 2145;BA.debugLine="End Sub";
Debug.ShouldStop(1);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _edittexthiz13_textchanged(RemoteObject _old,RemoteObject _new) throws Exception{
try {
		Debug.PushSubsStack("EditTextHiz13_TextChanged (programveri) ","programveri",12,programveri.mostCurrent.activityBA,programveri.mostCurrent,2171);
if (RapidSub.canDelegate("edittexthiz13_textchanged")) { return b4a.example3.programveri.remoteMe.runUserSub(false, "programveri","edittexthiz13_textchanged", _old, _new);}
Debug.locals.put("Old", _old);
Debug.locals.put("New", _new);
 BA.debugLineNum = 2171;BA.debugLine="Sub EditTextHiz13_TextChanged (Old As String, New";
Debug.ShouldStop(67108864);
 BA.debugLineNum = 2172;BA.debugLine="If EditTextHiz13.Text.Length == 0 Then";
Debug.ShouldStop(134217728);
if (RemoteObject.solveBoolean("=",programveri.mostCurrent._edittexthiz13.runMethod(true,"getText").runMethod(true,"length"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 2173;BA.debugLine="hiz13 = Old";
Debug.ShouldStop(268435456);
programveri._hiz13 = BA.numberCast(float.class, _old);
 }else {
 BA.debugLineNum = 2175;BA.debugLine="hiz13 = New";
Debug.ShouldStop(1073741824);
programveri._hiz13 = BA.numberCast(float.class, _new);
 };
 BA.debugLineNum = 2177;BA.debugLine="End Sub";
Debug.ShouldStop(1);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _edittexthiz14_textchanged(RemoteObject _old,RemoteObject _new) throws Exception{
try {
		Debug.PushSubsStack("EditTextHiz14_TextChanged (programveri) ","programveri",12,programveri.mostCurrent.activityBA,programveri.mostCurrent,2203);
if (RapidSub.canDelegate("edittexthiz14_textchanged")) { return b4a.example3.programveri.remoteMe.runUserSub(false, "programveri","edittexthiz14_textchanged", _old, _new);}
Debug.locals.put("Old", _old);
Debug.locals.put("New", _new);
 BA.debugLineNum = 2203;BA.debugLine="Sub EditTextHiz14_TextChanged (Old As String, New";
Debug.ShouldStop(67108864);
 BA.debugLineNum = 2204;BA.debugLine="If EditTextHiz14.Text.Length == 0 Then";
Debug.ShouldStop(134217728);
if (RemoteObject.solveBoolean("=",programveri.mostCurrent._edittexthiz14.runMethod(true,"getText").runMethod(true,"length"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 2205;BA.debugLine="hiz14 = Old";
Debug.ShouldStop(268435456);
programveri._hiz14 = BA.numberCast(float.class, _old);
 }else {
 BA.debugLineNum = 2207;BA.debugLine="hiz14 = New";
Debug.ShouldStop(1073741824);
programveri._hiz14 = BA.numberCast(float.class, _new);
 };
 BA.debugLineNum = 2209;BA.debugLine="End Sub";
Debug.ShouldStop(1);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _edittexthiz15_textchanged(RemoteObject _old,RemoteObject _new) throws Exception{
try {
		Debug.PushSubsStack("EditTextHiz15_TextChanged (programveri) ","programveri",12,programveri.mostCurrent.activityBA,programveri.mostCurrent,2235);
if (RapidSub.canDelegate("edittexthiz15_textchanged")) { return b4a.example3.programveri.remoteMe.runUserSub(false, "programveri","edittexthiz15_textchanged", _old, _new);}
Debug.locals.put("Old", _old);
Debug.locals.put("New", _new);
 BA.debugLineNum = 2235;BA.debugLine="Sub EditTextHiz15_TextChanged (Old As String, New";
Debug.ShouldStop(67108864);
 BA.debugLineNum = 2236;BA.debugLine="If EditTextHiz15.Text.Length == 0 Then";
Debug.ShouldStop(134217728);
if (RemoteObject.solveBoolean("=",programveri.mostCurrent._edittexthiz15.runMethod(true,"getText").runMethod(true,"length"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 2237;BA.debugLine="hiz15 = Old";
Debug.ShouldStop(268435456);
programveri._hiz15 = BA.numberCast(float.class, _old);
 }else {
 BA.debugLineNum = 2239;BA.debugLine="hiz15 = New";
Debug.ShouldStop(1073741824);
programveri._hiz15 = BA.numberCast(float.class, _new);
 };
 BA.debugLineNum = 2241;BA.debugLine="End Sub";
Debug.ShouldStop(1);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _edittexthiz16_textchanged(RemoteObject _old,RemoteObject _new) throws Exception{
try {
		Debug.PushSubsStack("EditTextHiz16_TextChanged (programveri) ","programveri",12,programveri.mostCurrent.activityBA,programveri.mostCurrent,2267);
if (RapidSub.canDelegate("edittexthiz16_textchanged")) { return b4a.example3.programveri.remoteMe.runUserSub(false, "programveri","edittexthiz16_textchanged", _old, _new);}
Debug.locals.put("Old", _old);
Debug.locals.put("New", _new);
 BA.debugLineNum = 2267;BA.debugLine="Sub EditTextHiz16_TextChanged (Old As String, New";
Debug.ShouldStop(67108864);
 BA.debugLineNum = 2268;BA.debugLine="If EditTextHiz16.Text.Length == 0 Then";
Debug.ShouldStop(134217728);
if (RemoteObject.solveBoolean("=",programveri.mostCurrent._edittexthiz16.runMethod(true,"getText").runMethod(true,"length"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 2269;BA.debugLine="hiz16 = Old";
Debug.ShouldStop(268435456);
programveri._hiz16 = BA.numberCast(float.class, _old);
 }else {
 BA.debugLineNum = 2271;BA.debugLine="hiz16 = New";
Debug.ShouldStop(1073741824);
programveri._hiz16 = BA.numberCast(float.class, _new);
 };
 BA.debugLineNum = 2273;BA.debugLine="End Sub";
Debug.ShouldStop(1);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _edittexthiz17_textchanged(RemoteObject _old,RemoteObject _new) throws Exception{
try {
		Debug.PushSubsStack("EditTextHiz17_TextChanged (programveri) ","programveri",12,programveri.mostCurrent.activityBA,programveri.mostCurrent,2299);
if (RapidSub.canDelegate("edittexthiz17_textchanged")) { return b4a.example3.programveri.remoteMe.runUserSub(false, "programveri","edittexthiz17_textchanged", _old, _new);}
Debug.locals.put("Old", _old);
Debug.locals.put("New", _new);
 BA.debugLineNum = 2299;BA.debugLine="Sub EditTextHiz17_TextChanged (Old As String, New";
Debug.ShouldStop(67108864);
 BA.debugLineNum = 2300;BA.debugLine="If EditTextHiz17.Text.Length == 0 Then";
Debug.ShouldStop(134217728);
if (RemoteObject.solveBoolean("=",programveri.mostCurrent._edittexthiz17.runMethod(true,"getText").runMethod(true,"length"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 2301;BA.debugLine="hiz17 = Old";
Debug.ShouldStop(268435456);
programveri._hiz17 = BA.numberCast(float.class, _old);
 }else {
 BA.debugLineNum = 2303;BA.debugLine="hiz17 = New";
Debug.ShouldStop(1073741824);
programveri._hiz17 = BA.numberCast(float.class, _new);
 };
 BA.debugLineNum = 2305;BA.debugLine="End Sub";
Debug.ShouldStop(1);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _edittexthiz18_textchanged(RemoteObject _old,RemoteObject _new) throws Exception{
try {
		Debug.PushSubsStack("EditTextHiz18_TextChanged (programveri) ","programveri",12,programveri.mostCurrent.activityBA,programveri.mostCurrent,2331);
if (RapidSub.canDelegate("edittexthiz18_textchanged")) { return b4a.example3.programveri.remoteMe.runUserSub(false, "programveri","edittexthiz18_textchanged", _old, _new);}
Debug.locals.put("Old", _old);
Debug.locals.put("New", _new);
 BA.debugLineNum = 2331;BA.debugLine="Sub EditTextHiz18_TextChanged (Old As String, New";
Debug.ShouldStop(67108864);
 BA.debugLineNum = 2332;BA.debugLine="If EditTextHiz18.Text.Length == 0 Then";
Debug.ShouldStop(134217728);
if (RemoteObject.solveBoolean("=",programveri.mostCurrent._edittexthiz18.runMethod(true,"getText").runMethod(true,"length"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 2333;BA.debugLine="hiz18 = Old";
Debug.ShouldStop(268435456);
programveri._hiz18 = BA.numberCast(float.class, _old);
 }else {
 BA.debugLineNum = 2335;BA.debugLine="hiz18 = New";
Debug.ShouldStop(1073741824);
programveri._hiz18 = BA.numberCast(float.class, _new);
 };
 BA.debugLineNum = 2337;BA.debugLine="End Sub";
Debug.ShouldStop(1);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _edittexthiz19_textchanged(RemoteObject _old,RemoteObject _new) throws Exception{
try {
		Debug.PushSubsStack("EditTextHiz19_TextChanged (programveri) ","programveri",12,programveri.mostCurrent.activityBA,programveri.mostCurrent,2363);
if (RapidSub.canDelegate("edittexthiz19_textchanged")) { return b4a.example3.programveri.remoteMe.runUserSub(false, "programveri","edittexthiz19_textchanged", _old, _new);}
Debug.locals.put("Old", _old);
Debug.locals.put("New", _new);
 BA.debugLineNum = 2363;BA.debugLine="Sub EditTextHiz19_TextChanged (Old As String, New";
Debug.ShouldStop(67108864);
 BA.debugLineNum = 2364;BA.debugLine="If EditTextHiz19.Text.Length == 0 Then";
Debug.ShouldStop(134217728);
if (RemoteObject.solveBoolean("=",programveri.mostCurrent._edittexthiz19.runMethod(true,"getText").runMethod(true,"length"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 2365;BA.debugLine="hiz19 = Old";
Debug.ShouldStop(268435456);
programveri._hiz19 = BA.numberCast(float.class, _old);
 }else {
 BA.debugLineNum = 2367;BA.debugLine="hiz19 = New";
Debug.ShouldStop(1073741824);
programveri._hiz19 = BA.numberCast(float.class, _new);
 };
 BA.debugLineNum = 2369;BA.debugLine="End Sub";
Debug.ShouldStop(1);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _edittexthiz2_textchanged(RemoteObject _old,RemoteObject _new) throws Exception{
try {
		Debug.PushSubsStack("EditTextHiz2_TextChanged (programveri) ","programveri",12,programveri.mostCurrent.activityBA,programveri.mostCurrent,1819);
if (RapidSub.canDelegate("edittexthiz2_textchanged")) { return b4a.example3.programveri.remoteMe.runUserSub(false, "programveri","edittexthiz2_textchanged", _old, _new);}
Debug.locals.put("Old", _old);
Debug.locals.put("New", _new);
 BA.debugLineNum = 1819;BA.debugLine="Sub EditTextHiz2_TextChanged (Old As String, New A";
Debug.ShouldStop(67108864);
 BA.debugLineNum = 1820;BA.debugLine="If EditTextHiz2.Text.Length == 0 Then";
Debug.ShouldStop(134217728);
if (RemoteObject.solveBoolean("=",programveri.mostCurrent._edittexthiz2.runMethod(true,"getText").runMethod(true,"length"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 1821;BA.debugLine="hiz2 = Old";
Debug.ShouldStop(268435456);
programveri._hiz2 = BA.numberCast(float.class, _old);
 }else {
 BA.debugLineNum = 1823;BA.debugLine="hiz2 = New";
Debug.ShouldStop(1073741824);
programveri._hiz2 = BA.numberCast(float.class, _new);
 };
 BA.debugLineNum = 1825;BA.debugLine="End Sub";
Debug.ShouldStop(1);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _edittexthiz20_textchanged(RemoteObject _old,RemoteObject _new) throws Exception{
try {
		Debug.PushSubsStack("EditTextHiz20_TextChanged (programveri) ","programveri",12,programveri.mostCurrent.activityBA,programveri.mostCurrent,2395);
if (RapidSub.canDelegate("edittexthiz20_textchanged")) { return b4a.example3.programveri.remoteMe.runUserSub(false, "programveri","edittexthiz20_textchanged", _old, _new);}
Debug.locals.put("Old", _old);
Debug.locals.put("New", _new);
 BA.debugLineNum = 2395;BA.debugLine="Sub EditTextHiz20_TextChanged (Old As String, New";
Debug.ShouldStop(67108864);
 BA.debugLineNum = 2396;BA.debugLine="If EditTextHiz20.Text.Length == 0 Then";
Debug.ShouldStop(134217728);
if (RemoteObject.solveBoolean("=",programveri.mostCurrent._edittexthiz20.runMethod(true,"getText").runMethod(true,"length"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 2397;BA.debugLine="hiz20 = Old";
Debug.ShouldStop(268435456);
programveri._hiz20 = BA.numberCast(float.class, _old);
 }else {
 BA.debugLineNum = 2399;BA.debugLine="hiz20 = New";
Debug.ShouldStop(1073741824);
programveri._hiz20 = BA.numberCast(float.class, _new);
 };
 BA.debugLineNum = 2401;BA.debugLine="End Sub";
Debug.ShouldStop(1);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _edittexthiz21_textchanged(RemoteObject _old,RemoteObject _new) throws Exception{
try {
		Debug.PushSubsStack("EditTextHiz21_TextChanged (programveri) ","programveri",12,programveri.mostCurrent.activityBA,programveri.mostCurrent,2427);
if (RapidSub.canDelegate("edittexthiz21_textchanged")) { return b4a.example3.programveri.remoteMe.runUserSub(false, "programveri","edittexthiz21_textchanged", _old, _new);}
Debug.locals.put("Old", _old);
Debug.locals.put("New", _new);
 BA.debugLineNum = 2427;BA.debugLine="Sub EditTextHiz21_TextChanged (Old As String, New";
Debug.ShouldStop(67108864);
 BA.debugLineNum = 2428;BA.debugLine="If EditTextHiz21.Text.Length == 0 Then";
Debug.ShouldStop(134217728);
if (RemoteObject.solveBoolean("=",programveri.mostCurrent._edittexthiz21.runMethod(true,"getText").runMethod(true,"length"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 2429;BA.debugLine="hiz21 = Old";
Debug.ShouldStop(268435456);
programveri._hiz21 = BA.numberCast(float.class, _old);
 }else {
 BA.debugLineNum = 2431;BA.debugLine="hiz21 = New";
Debug.ShouldStop(1073741824);
programveri._hiz21 = BA.numberCast(float.class, _new);
 };
 BA.debugLineNum = 2433;BA.debugLine="End Sub";
Debug.ShouldStop(1);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _edittexthiz22_textchanged(RemoteObject _old,RemoteObject _new) throws Exception{
try {
		Debug.PushSubsStack("EditTextHiz22_TextChanged (programveri) ","programveri",12,programveri.mostCurrent.activityBA,programveri.mostCurrent,2459);
if (RapidSub.canDelegate("edittexthiz22_textchanged")) { return b4a.example3.programveri.remoteMe.runUserSub(false, "programveri","edittexthiz22_textchanged", _old, _new);}
Debug.locals.put("Old", _old);
Debug.locals.put("New", _new);
 BA.debugLineNum = 2459;BA.debugLine="Sub EditTextHiz22_TextChanged (Old As String, New";
Debug.ShouldStop(67108864);
 BA.debugLineNum = 2460;BA.debugLine="If EditTextHiz22.Text.Length == 0 Then";
Debug.ShouldStop(134217728);
if (RemoteObject.solveBoolean("=",programveri.mostCurrent._edittexthiz22.runMethod(true,"getText").runMethod(true,"length"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 2461;BA.debugLine="hiz22 = Old";
Debug.ShouldStop(268435456);
programveri._hiz22 = BA.numberCast(float.class, _old);
 }else {
 BA.debugLineNum = 2463;BA.debugLine="hiz22 = New";
Debug.ShouldStop(1073741824);
programveri._hiz22 = BA.numberCast(float.class, _new);
 };
 BA.debugLineNum = 2465;BA.debugLine="End Sub";
Debug.ShouldStop(1);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _edittexthiz23_textchanged(RemoteObject _old,RemoteObject _new) throws Exception{
try {
		Debug.PushSubsStack("EditTextHiz23_TextChanged (programveri) ","programveri",12,programveri.mostCurrent.activityBA,programveri.mostCurrent,2499);
if (RapidSub.canDelegate("edittexthiz23_textchanged")) { return b4a.example3.programveri.remoteMe.runUserSub(false, "programveri","edittexthiz23_textchanged", _old, _new);}
Debug.locals.put("Old", _old);
Debug.locals.put("New", _new);
 BA.debugLineNum = 2499;BA.debugLine="Sub EditTextHiz23_TextChanged (Old As String, New";
Debug.ShouldStop(4);
 BA.debugLineNum = 2500;BA.debugLine="If EditTextHiz23.Text.Length == 0 Then";
Debug.ShouldStop(8);
if (RemoteObject.solveBoolean("=",programveri.mostCurrent._edittexthiz23.runMethod(true,"getText").runMethod(true,"length"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 2501;BA.debugLine="hiz23 = Old";
Debug.ShouldStop(16);
programveri._hiz23 = BA.numberCast(float.class, _old);
 }else {
 BA.debugLineNum = 2503;BA.debugLine="hiz23 = New";
Debug.ShouldStop(64);
programveri._hiz23 = BA.numberCast(float.class, _new);
 };
 BA.debugLineNum = 2505;BA.debugLine="End Sub";
Debug.ShouldStop(256);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _edittexthiz24_textchanged(RemoteObject _old,RemoteObject _new) throws Exception{
try {
		Debug.PushSubsStack("EditTextHiz24_TextChanged (programveri) ","programveri",12,programveri.mostCurrent.activityBA,programveri.mostCurrent,2523);
if (RapidSub.canDelegate("edittexthiz24_textchanged")) { return b4a.example3.programveri.remoteMe.runUserSub(false, "programveri","edittexthiz24_textchanged", _old, _new);}
Debug.locals.put("Old", _old);
Debug.locals.put("New", _new);
 BA.debugLineNum = 2523;BA.debugLine="Sub EditTextHiz24_TextChanged (Old As String, New";
Debug.ShouldStop(67108864);
 BA.debugLineNum = 2524;BA.debugLine="If EditTextHiz24.Text.Length == 0 Then";
Debug.ShouldStop(134217728);
if (RemoteObject.solveBoolean("=",programveri.mostCurrent._edittexthiz24.runMethod(true,"getText").runMethod(true,"length"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 2525;BA.debugLine="hiz24 = Old";
Debug.ShouldStop(268435456);
programveri._hiz24 = BA.numberCast(float.class, _old);
 }else {
 BA.debugLineNum = 2527;BA.debugLine="hiz24 = New";
Debug.ShouldStop(1073741824);
programveri._hiz24 = BA.numberCast(float.class, _new);
 };
 BA.debugLineNum = 2529;BA.debugLine="End Sub";
Debug.ShouldStop(1);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _edittexthiz25_textchanged(RemoteObject _old,RemoteObject _new) throws Exception{
try {
		Debug.PushSubsStack("EditTextHiz25_TextChanged (programveri) ","programveri",12,programveri.mostCurrent.activityBA,programveri.mostCurrent,2563);
if (RapidSub.canDelegate("edittexthiz25_textchanged")) { return b4a.example3.programveri.remoteMe.runUserSub(false, "programveri","edittexthiz25_textchanged", _old, _new);}
Debug.locals.put("Old", _old);
Debug.locals.put("New", _new);
 BA.debugLineNum = 2563;BA.debugLine="Sub EditTextHiz25_TextChanged (Old As String, New";
Debug.ShouldStop(4);
 BA.debugLineNum = 2564;BA.debugLine="If EditTextHiz25.Text.Length == 0 Then";
Debug.ShouldStop(8);
if (RemoteObject.solveBoolean("=",programveri.mostCurrent._edittexthiz25.runMethod(true,"getText").runMethod(true,"length"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 2565;BA.debugLine="hiz25 = Old";
Debug.ShouldStop(16);
programveri._hiz25 = BA.numberCast(float.class, _old);
 }else {
 BA.debugLineNum = 2567;BA.debugLine="hiz25 = New";
Debug.ShouldStop(64);
programveri._hiz25 = BA.numberCast(float.class, _new);
 };
 BA.debugLineNum = 2569;BA.debugLine="End Sub";
Debug.ShouldStop(256);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _edittexthiz3_textchanged(RemoteObject _old,RemoteObject _new) throws Exception{
try {
		Debug.PushSubsStack("EditTextHiz3_TextChanged (programveri) ","programveri",12,programveri.mostCurrent.activityBA,programveri.mostCurrent,1851);
if (RapidSub.canDelegate("edittexthiz3_textchanged")) { return b4a.example3.programveri.remoteMe.runUserSub(false, "programveri","edittexthiz3_textchanged", _old, _new);}
Debug.locals.put("Old", _old);
Debug.locals.put("New", _new);
 BA.debugLineNum = 1851;BA.debugLine="Sub EditTextHiz3_TextChanged (Old As String, New A";
Debug.ShouldStop(67108864);
 BA.debugLineNum = 1852;BA.debugLine="If EditTextHiz3.Text.Length == 0 Then";
Debug.ShouldStop(134217728);
if (RemoteObject.solveBoolean("=",programveri.mostCurrent._edittexthiz3.runMethod(true,"getText").runMethod(true,"length"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 1853;BA.debugLine="hiz3 = Old";
Debug.ShouldStop(268435456);
programveri._hiz3 = BA.numberCast(float.class, _old);
 }else {
 BA.debugLineNum = 1855;BA.debugLine="hiz3 = New";
Debug.ShouldStop(1073741824);
programveri._hiz3 = BA.numberCast(float.class, _new);
 };
 BA.debugLineNum = 1857;BA.debugLine="End Sub";
Debug.ShouldStop(1);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _edittexthiz4_textchanged(RemoteObject _old,RemoteObject _new) throws Exception{
try {
		Debug.PushSubsStack("EditTextHiz4_TextChanged (programveri) ","programveri",12,programveri.mostCurrent.activityBA,programveri.mostCurrent,1883);
if (RapidSub.canDelegate("edittexthiz4_textchanged")) { return b4a.example3.programveri.remoteMe.runUserSub(false, "programveri","edittexthiz4_textchanged", _old, _new);}
Debug.locals.put("Old", _old);
Debug.locals.put("New", _new);
 BA.debugLineNum = 1883;BA.debugLine="Sub EditTextHiz4_TextChanged (Old As String, New A";
Debug.ShouldStop(67108864);
 BA.debugLineNum = 1884;BA.debugLine="If EditTextHiz4.Text.Length == 0 Then";
Debug.ShouldStop(134217728);
if (RemoteObject.solveBoolean("=",programveri.mostCurrent._edittexthiz4.runMethod(true,"getText").runMethod(true,"length"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 1885;BA.debugLine="hiz4 = Old";
Debug.ShouldStop(268435456);
programveri._hiz4 = BA.numberCast(float.class, _old);
 }else {
 BA.debugLineNum = 1887;BA.debugLine="hiz4 = New";
Debug.ShouldStop(1073741824);
programveri._hiz4 = BA.numberCast(float.class, _new);
 };
 BA.debugLineNum = 1889;BA.debugLine="End Sub";
Debug.ShouldStop(1);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _edittexthiz5_textchanged(RemoteObject _old,RemoteObject _new) throws Exception{
try {
		Debug.PushSubsStack("EditTextHiz5_TextChanged (programveri) ","programveri",12,programveri.mostCurrent.activityBA,programveri.mostCurrent,1915);
if (RapidSub.canDelegate("edittexthiz5_textchanged")) { return b4a.example3.programveri.remoteMe.runUserSub(false, "programveri","edittexthiz5_textchanged", _old, _new);}
Debug.locals.put("Old", _old);
Debug.locals.put("New", _new);
 BA.debugLineNum = 1915;BA.debugLine="Sub EditTextHiz5_TextChanged (Old As String, New A";
Debug.ShouldStop(67108864);
 BA.debugLineNum = 1916;BA.debugLine="If EditTextHiz5.Text.Length == 0 Then";
Debug.ShouldStop(134217728);
if (RemoteObject.solveBoolean("=",programveri.mostCurrent._edittexthiz5.runMethod(true,"getText").runMethod(true,"length"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 1917;BA.debugLine="hiz5 = Old";
Debug.ShouldStop(268435456);
programveri._hiz5 = BA.numberCast(float.class, _old);
 }else {
 BA.debugLineNum = 1919;BA.debugLine="hiz5 = New";
Debug.ShouldStop(1073741824);
programveri._hiz5 = BA.numberCast(float.class, _new);
 };
 BA.debugLineNum = 1921;BA.debugLine="End Sub";
Debug.ShouldStop(1);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _edittexthiz6_textchanged(RemoteObject _old,RemoteObject _new) throws Exception{
try {
		Debug.PushSubsStack("EditTextHiz6_TextChanged (programveri) ","programveri",12,programveri.mostCurrent.activityBA,programveri.mostCurrent,1947);
if (RapidSub.canDelegate("edittexthiz6_textchanged")) { return b4a.example3.programveri.remoteMe.runUserSub(false, "programveri","edittexthiz6_textchanged", _old, _new);}
Debug.locals.put("Old", _old);
Debug.locals.put("New", _new);
 BA.debugLineNum = 1947;BA.debugLine="Sub EditTextHiz6_TextChanged (Old As String, New A";
Debug.ShouldStop(67108864);
 BA.debugLineNum = 1948;BA.debugLine="If EditTextHiz6.Text.Length == 0 Then";
Debug.ShouldStop(134217728);
if (RemoteObject.solveBoolean("=",programveri.mostCurrent._edittexthiz6.runMethod(true,"getText").runMethod(true,"length"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 1949;BA.debugLine="hiz6 = Old";
Debug.ShouldStop(268435456);
programveri._hiz6 = BA.numberCast(float.class, _old);
 }else {
 BA.debugLineNum = 1951;BA.debugLine="hiz6 = New";
Debug.ShouldStop(1073741824);
programveri._hiz6 = BA.numberCast(float.class, _new);
 };
 BA.debugLineNum = 1953;BA.debugLine="End Sub";
Debug.ShouldStop(1);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _edittexthiz7_textchanged(RemoteObject _old,RemoteObject _new) throws Exception{
try {
		Debug.PushSubsStack("EditTextHiz7_TextChanged (programveri) ","programveri",12,programveri.mostCurrent.activityBA,programveri.mostCurrent,1979);
if (RapidSub.canDelegate("edittexthiz7_textchanged")) { return b4a.example3.programveri.remoteMe.runUserSub(false, "programveri","edittexthiz7_textchanged", _old, _new);}
Debug.locals.put("Old", _old);
Debug.locals.put("New", _new);
 BA.debugLineNum = 1979;BA.debugLine="Sub EditTextHiz7_TextChanged (Old As String, New A";
Debug.ShouldStop(67108864);
 BA.debugLineNum = 1980;BA.debugLine="If EditTextHiz7.Text.Length == 0 Then";
Debug.ShouldStop(134217728);
if (RemoteObject.solveBoolean("=",programveri.mostCurrent._edittexthiz7.runMethod(true,"getText").runMethod(true,"length"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 1981;BA.debugLine="hiz7 = Old";
Debug.ShouldStop(268435456);
programveri._hiz7 = BA.numberCast(float.class, _old);
 }else {
 BA.debugLineNum = 1983;BA.debugLine="hiz7 = New";
Debug.ShouldStop(1073741824);
programveri._hiz7 = BA.numberCast(float.class, _new);
 };
 BA.debugLineNum = 1985;BA.debugLine="End Sub";
Debug.ShouldStop(1);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _edittexthiz8_textchanged(RemoteObject _old,RemoteObject _new) throws Exception{
try {
		Debug.PushSubsStack("EditTextHiz8_TextChanged (programveri) ","programveri",12,programveri.mostCurrent.activityBA,programveri.mostCurrent,2011);
if (RapidSub.canDelegate("edittexthiz8_textchanged")) { return b4a.example3.programveri.remoteMe.runUserSub(false, "programveri","edittexthiz8_textchanged", _old, _new);}
Debug.locals.put("Old", _old);
Debug.locals.put("New", _new);
 BA.debugLineNum = 2011;BA.debugLine="Sub EditTextHiz8_TextChanged (Old As String, New A";
Debug.ShouldStop(67108864);
 BA.debugLineNum = 2012;BA.debugLine="If EditTextHiz8.Text.Length == 0 Then";
Debug.ShouldStop(134217728);
if (RemoteObject.solveBoolean("=",programveri.mostCurrent._edittexthiz8.runMethod(true,"getText").runMethod(true,"length"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 2013;BA.debugLine="hiz8 = Old";
Debug.ShouldStop(268435456);
programveri._hiz8 = BA.numberCast(float.class, _old);
 }else {
 BA.debugLineNum = 2015;BA.debugLine="hiz8 = New";
Debug.ShouldStop(1073741824);
programveri._hiz8 = BA.numberCast(float.class, _new);
 };
 BA.debugLineNum = 2017;BA.debugLine="End Sub";
Debug.ShouldStop(1);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _edittexthiz9_textchanged(RemoteObject _old,RemoteObject _new) throws Exception{
try {
		Debug.PushSubsStack("EditTextHiz9_TextChanged (programveri) ","programveri",12,programveri.mostCurrent.activityBA,programveri.mostCurrent,2043);
if (RapidSub.canDelegate("edittexthiz9_textchanged")) { return b4a.example3.programveri.remoteMe.runUserSub(false, "programveri","edittexthiz9_textchanged", _old, _new);}
Debug.locals.put("Old", _old);
Debug.locals.put("New", _new);
 BA.debugLineNum = 2043;BA.debugLine="Sub EditTextHiz9_TextChanged (Old As String, New A";
Debug.ShouldStop(67108864);
 BA.debugLineNum = 2044;BA.debugLine="If EditTextHiz9.Text.Length == 0 Then";
Debug.ShouldStop(134217728);
if (RemoteObject.solveBoolean("=",programveri.mostCurrent._edittexthiz9.runMethod(true,"getText").runMethod(true,"length"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 2045;BA.debugLine="hiz9 = Old";
Debug.ShouldStop(268435456);
programveri._hiz9 = BA.numberCast(float.class, _old);
 }else {
 BA.debugLineNum = 2047;BA.debugLine="hiz9 = New";
Debug.ShouldStop(1073741824);
programveri._hiz9 = BA.numberCast(float.class, _new);
 };
 BA.debugLineNum = 2049;BA.debugLine="End Sub";
Debug.ShouldStop(1);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _edittextkonimesafesi1_textchanged(RemoteObject _old,RemoteObject _new) throws Exception{
try {
		Debug.PushSubsStack("EditTextKoniMesafesi1_TextChanged (programveri) ","programveri",12,programveri.mostCurrent.activityBA,programveri.mostCurrent,1774);
if (RapidSub.canDelegate("edittextkonimesafesi1_textchanged")) { return b4a.example3.programveri.remoteMe.runUserSub(false, "programveri","edittextkonimesafesi1_textchanged", _old, _new);}
Debug.locals.put("Old", _old);
Debug.locals.put("New", _new);
 BA.debugLineNum = 1774;BA.debugLine="Sub EditTextKoniMesafesi1_TextChanged (Old As Stri";
Debug.ShouldStop(8192);
 BA.debugLineNum = 1781;BA.debugLine="If New.Length <> 0 Then";
Debug.ShouldStop(1048576);
if (RemoteObject.solveBoolean("!",_new.runMethod(true,"length"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 1782;BA.debugLine="koniMesafesi1 = New";
Debug.ShouldStop(2097152);
programveri._konimesafesi1 = BA.numberCast(float.class, _new);
 };
 BA.debugLineNum = 1785;BA.debugLine="End Sub";
Debug.ShouldStop(16777216);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _edittextkonimesafesi10_textchanged(RemoteObject _old,RemoteObject _new) throws Exception{
try {
		Debug.PushSubsStack("EditTextKoniMesafesi10_TextChanged (programveri) ","programveri",12,programveri.mostCurrent.activityBA,programveri.mostCurrent,2067);
if (RapidSub.canDelegate("edittextkonimesafesi10_textchanged")) { return b4a.example3.programveri.remoteMe.runUserSub(false, "programveri","edittextkonimesafesi10_textchanged", _old, _new);}
Debug.locals.put("Old", _old);
Debug.locals.put("New", _new);
 BA.debugLineNum = 2067;BA.debugLine="Sub EditTextKoniMesafesi10_TextChanged (Old As Str";
Debug.ShouldStop(262144);
 BA.debugLineNum = 2068;BA.debugLine="If EditTextKoniMesafesi10.Text.Length == 0 Then";
Debug.ShouldStop(524288);
if (RemoteObject.solveBoolean("=",programveri.mostCurrent._edittextkonimesafesi10.runMethod(true,"getText").runMethod(true,"length"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 2069;BA.debugLine="koniMesafesi10 = Old";
Debug.ShouldStop(1048576);
programveri._konimesafesi10 = BA.numberCast(float.class, _old);
 }else {
 BA.debugLineNum = 2071;BA.debugLine="koniMesafesi10 = New";
Debug.ShouldStop(4194304);
programveri._konimesafesi10 = BA.numberCast(float.class, _new);
 };
 BA.debugLineNum = 2073;BA.debugLine="End Sub";
Debug.ShouldStop(16777216);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _edittextkonimesafesi11_textchanged(RemoteObject _old,RemoteObject _new) throws Exception{
try {
		Debug.PushSubsStack("EditTextKoniMesafesi11_TextChanged (programveri) ","programveri",12,programveri.mostCurrent.activityBA,programveri.mostCurrent,2099);
if (RapidSub.canDelegate("edittextkonimesafesi11_textchanged")) { return b4a.example3.programveri.remoteMe.runUserSub(false, "programveri","edittextkonimesafesi11_textchanged", _old, _new);}
Debug.locals.put("Old", _old);
Debug.locals.put("New", _new);
 BA.debugLineNum = 2099;BA.debugLine="Sub EditTextKoniMesafesi11_TextChanged (Old As Str";
Debug.ShouldStop(262144);
 BA.debugLineNum = 2100;BA.debugLine="If EditTextKoniMesafesi11.Text.Length == 0 Then";
Debug.ShouldStop(524288);
if (RemoteObject.solveBoolean("=",programveri.mostCurrent._edittextkonimesafesi11.runMethod(true,"getText").runMethod(true,"length"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 2101;BA.debugLine="koniMesafesi11 = Old";
Debug.ShouldStop(1048576);
programveri._konimesafesi11 = BA.numberCast(float.class, _old);
 }else {
 BA.debugLineNum = 2103;BA.debugLine="koniMesafesi11 = New";
Debug.ShouldStop(4194304);
programveri._konimesafesi11 = BA.numberCast(float.class, _new);
 };
 BA.debugLineNum = 2105;BA.debugLine="End Sub";
Debug.ShouldStop(16777216);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _edittextkonimesafesi12_textchanged(RemoteObject _old,RemoteObject _new) throws Exception{
try {
		Debug.PushSubsStack("EditTextKoniMesafesi12_TextChanged (programveri) ","programveri",12,programveri.mostCurrent.activityBA,programveri.mostCurrent,2131);
if (RapidSub.canDelegate("edittextkonimesafesi12_textchanged")) { return b4a.example3.programveri.remoteMe.runUserSub(false, "programveri","edittextkonimesafesi12_textchanged", _old, _new);}
Debug.locals.put("Old", _old);
Debug.locals.put("New", _new);
 BA.debugLineNum = 2131;BA.debugLine="Sub EditTextKoniMesafesi12_TextChanged (Old As Str";
Debug.ShouldStop(262144);
 BA.debugLineNum = 2132;BA.debugLine="If EditTextKoniMesafesi12.Text.Length == 0 Then";
Debug.ShouldStop(524288);
if (RemoteObject.solveBoolean("=",programveri.mostCurrent._edittextkonimesafesi12.runMethod(true,"getText").runMethod(true,"length"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 2133;BA.debugLine="koniMesafesi12 = Old";
Debug.ShouldStop(1048576);
programveri._konimesafesi12 = BA.numberCast(float.class, _old);
 }else {
 BA.debugLineNum = 2135;BA.debugLine="koniMesafesi12 = New";
Debug.ShouldStop(4194304);
programveri._konimesafesi12 = BA.numberCast(float.class, _new);
 };
 BA.debugLineNum = 2137;BA.debugLine="End Sub";
Debug.ShouldStop(16777216);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _edittextkonimesafesi13_textchanged(RemoteObject _old,RemoteObject _new) throws Exception{
try {
		Debug.PushSubsStack("EditTextKoniMesafesi13_TextChanged (programveri) ","programveri",12,programveri.mostCurrent.activityBA,programveri.mostCurrent,2163);
if (RapidSub.canDelegate("edittextkonimesafesi13_textchanged")) { return b4a.example3.programveri.remoteMe.runUserSub(false, "programveri","edittextkonimesafesi13_textchanged", _old, _new);}
Debug.locals.put("Old", _old);
Debug.locals.put("New", _new);
 BA.debugLineNum = 2163;BA.debugLine="Sub EditTextKoniMesafesi13_TextChanged (Old As Str";
Debug.ShouldStop(262144);
 BA.debugLineNum = 2164;BA.debugLine="If EditTextKoniMesafesi13.Text.Length == 0 Then";
Debug.ShouldStop(524288);
if (RemoteObject.solveBoolean("=",programveri.mostCurrent._edittextkonimesafesi13.runMethod(true,"getText").runMethod(true,"length"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 2165;BA.debugLine="koniMesafesi13 = Old";
Debug.ShouldStop(1048576);
programveri._konimesafesi13 = BA.numberCast(float.class, _old);
 }else {
 BA.debugLineNum = 2167;BA.debugLine="koniMesafesi13 = New";
Debug.ShouldStop(4194304);
programveri._konimesafesi13 = BA.numberCast(float.class, _new);
 };
 BA.debugLineNum = 2169;BA.debugLine="End Sub";
Debug.ShouldStop(16777216);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _edittextkonimesafesi14_textchanged(RemoteObject _old,RemoteObject _new) throws Exception{
try {
		Debug.PushSubsStack("EditTextKoniMesafesi14_TextChanged (programveri) ","programveri",12,programveri.mostCurrent.activityBA,programveri.mostCurrent,2195);
if (RapidSub.canDelegate("edittextkonimesafesi14_textchanged")) { return b4a.example3.programveri.remoteMe.runUserSub(false, "programveri","edittextkonimesafesi14_textchanged", _old, _new);}
Debug.locals.put("Old", _old);
Debug.locals.put("New", _new);
 BA.debugLineNum = 2195;BA.debugLine="Sub EditTextKoniMesafesi14_TextChanged (Old As Str";
Debug.ShouldStop(262144);
 BA.debugLineNum = 2196;BA.debugLine="If EditTextKoniMesafesi14.Text.Length == 0 Then";
Debug.ShouldStop(524288);
if (RemoteObject.solveBoolean("=",programveri.mostCurrent._edittextkonimesafesi14.runMethod(true,"getText").runMethod(true,"length"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 2197;BA.debugLine="koniMesafesi14 = Old";
Debug.ShouldStop(1048576);
programveri._konimesafesi14 = BA.numberCast(float.class, _old);
 }else {
 BA.debugLineNum = 2199;BA.debugLine="koniMesafesi14 = New";
Debug.ShouldStop(4194304);
programveri._konimesafesi14 = BA.numberCast(float.class, _new);
 };
 BA.debugLineNum = 2201;BA.debugLine="End Sub";
Debug.ShouldStop(16777216);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _edittextkonimesafesi15_textchanged(RemoteObject _old,RemoteObject _new) throws Exception{
try {
		Debug.PushSubsStack("EditTextKoniMesafesi15_TextChanged (programveri) ","programveri",12,programveri.mostCurrent.activityBA,programveri.mostCurrent,2227);
if (RapidSub.canDelegate("edittextkonimesafesi15_textchanged")) { return b4a.example3.programveri.remoteMe.runUserSub(false, "programveri","edittextkonimesafesi15_textchanged", _old, _new);}
Debug.locals.put("Old", _old);
Debug.locals.put("New", _new);
 BA.debugLineNum = 2227;BA.debugLine="Sub EditTextKoniMesafesi15_TextChanged (Old As Str";
Debug.ShouldStop(262144);
 BA.debugLineNum = 2228;BA.debugLine="If EditTextKoniMesafesi15.Text.Length == 0 Then";
Debug.ShouldStop(524288);
if (RemoteObject.solveBoolean("=",programveri.mostCurrent._edittextkonimesafesi15.runMethod(true,"getText").runMethod(true,"length"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 2229;BA.debugLine="koniMesafesi15 = Old";
Debug.ShouldStop(1048576);
programveri._konimesafesi15 = BA.numberCast(float.class, _old);
 }else {
 BA.debugLineNum = 2231;BA.debugLine="koniMesafesi15 = New";
Debug.ShouldStop(4194304);
programveri._konimesafesi15 = BA.numberCast(float.class, _new);
 };
 BA.debugLineNum = 2233;BA.debugLine="End Sub";
Debug.ShouldStop(16777216);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _edittextkonimesafesi16_textchanged(RemoteObject _old,RemoteObject _new) throws Exception{
try {
		Debug.PushSubsStack("EditTextKoniMesafesi16_TextChanged (programveri) ","programveri",12,programveri.mostCurrent.activityBA,programveri.mostCurrent,2259);
if (RapidSub.canDelegate("edittextkonimesafesi16_textchanged")) { return b4a.example3.programveri.remoteMe.runUserSub(false, "programveri","edittextkonimesafesi16_textchanged", _old, _new);}
Debug.locals.put("Old", _old);
Debug.locals.put("New", _new);
 BA.debugLineNum = 2259;BA.debugLine="Sub EditTextKoniMesafesi16_TextChanged (Old As Str";
Debug.ShouldStop(262144);
 BA.debugLineNum = 2260;BA.debugLine="If EditTextKoniMesafesi16.Text.Length == 0 Then";
Debug.ShouldStop(524288);
if (RemoteObject.solveBoolean("=",programveri.mostCurrent._edittextkonimesafesi16.runMethod(true,"getText").runMethod(true,"length"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 2261;BA.debugLine="koniMesafesi16 = Old";
Debug.ShouldStop(1048576);
programveri._konimesafesi16 = BA.numberCast(float.class, _old);
 }else {
 BA.debugLineNum = 2263;BA.debugLine="koniMesafesi16 = New";
Debug.ShouldStop(4194304);
programveri._konimesafesi16 = BA.numberCast(float.class, _new);
 };
 BA.debugLineNum = 2265;BA.debugLine="End Sub";
Debug.ShouldStop(16777216);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _edittextkonimesafesi17_textchanged(RemoteObject _old,RemoteObject _new) throws Exception{
try {
		Debug.PushSubsStack("EditTextKoniMesafesi17_TextChanged (programveri) ","programveri",12,programveri.mostCurrent.activityBA,programveri.mostCurrent,2291);
if (RapidSub.canDelegate("edittextkonimesafesi17_textchanged")) { return b4a.example3.programveri.remoteMe.runUserSub(false, "programveri","edittextkonimesafesi17_textchanged", _old, _new);}
Debug.locals.put("Old", _old);
Debug.locals.put("New", _new);
 BA.debugLineNum = 2291;BA.debugLine="Sub EditTextKoniMesafesi17_TextChanged (Old As Str";
Debug.ShouldStop(262144);
 BA.debugLineNum = 2292;BA.debugLine="If EditTextKoniMesafesi17.Text.Length == 0 Then";
Debug.ShouldStop(524288);
if (RemoteObject.solveBoolean("=",programveri.mostCurrent._edittextkonimesafesi17.runMethod(true,"getText").runMethod(true,"length"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 2293;BA.debugLine="koniMesafesi17 = Old";
Debug.ShouldStop(1048576);
programveri._konimesafesi17 = BA.numberCast(float.class, _old);
 }else {
 BA.debugLineNum = 2295;BA.debugLine="koniMesafesi17 = New";
Debug.ShouldStop(4194304);
programveri._konimesafesi17 = BA.numberCast(float.class, _new);
 };
 BA.debugLineNum = 2297;BA.debugLine="End Sub";
Debug.ShouldStop(16777216);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _edittextkonimesafesi18_textchanged(RemoteObject _old,RemoteObject _new) throws Exception{
try {
		Debug.PushSubsStack("EditTextKoniMesafesi18_TextChanged (programveri) ","programveri",12,programveri.mostCurrent.activityBA,programveri.mostCurrent,2323);
if (RapidSub.canDelegate("edittextkonimesafesi18_textchanged")) { return b4a.example3.programveri.remoteMe.runUserSub(false, "programveri","edittextkonimesafesi18_textchanged", _old, _new);}
Debug.locals.put("Old", _old);
Debug.locals.put("New", _new);
 BA.debugLineNum = 2323;BA.debugLine="Sub EditTextKoniMesafesi18_TextChanged (Old As Str";
Debug.ShouldStop(262144);
 BA.debugLineNum = 2324;BA.debugLine="If EditTextKoniMesafesi18.Text.Length == 0 Then";
Debug.ShouldStop(524288);
if (RemoteObject.solveBoolean("=",programveri.mostCurrent._edittextkonimesafesi18.runMethod(true,"getText").runMethod(true,"length"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 2325;BA.debugLine="koniMesafesi18 = Old";
Debug.ShouldStop(1048576);
programveri._konimesafesi18 = BA.numberCast(float.class, _old);
 }else {
 BA.debugLineNum = 2327;BA.debugLine="koniMesafesi18 = New";
Debug.ShouldStop(4194304);
programveri._konimesafesi18 = BA.numberCast(float.class, _new);
 };
 BA.debugLineNum = 2329;BA.debugLine="End Sub";
Debug.ShouldStop(16777216);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _edittextkonimesafesi19_textchanged(RemoteObject _old,RemoteObject _new) throws Exception{
try {
		Debug.PushSubsStack("EditTextKoniMesafesi19_TextChanged (programveri) ","programveri",12,programveri.mostCurrent.activityBA,programveri.mostCurrent,2355);
if (RapidSub.canDelegate("edittextkonimesafesi19_textchanged")) { return b4a.example3.programveri.remoteMe.runUserSub(false, "programveri","edittextkonimesafesi19_textchanged", _old, _new);}
Debug.locals.put("Old", _old);
Debug.locals.put("New", _new);
 BA.debugLineNum = 2355;BA.debugLine="Sub EditTextKoniMesafesi19_TextChanged (Old As Str";
Debug.ShouldStop(262144);
 BA.debugLineNum = 2356;BA.debugLine="If EditTextKoniMesafesi19.Text.Length == 0 Then";
Debug.ShouldStop(524288);
if (RemoteObject.solveBoolean("=",programveri.mostCurrent._edittextkonimesafesi19.runMethod(true,"getText").runMethod(true,"length"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 2357;BA.debugLine="koniMesafesi19 = Old";
Debug.ShouldStop(1048576);
programveri._konimesafesi19 = BA.numberCast(float.class, _old);
 }else {
 BA.debugLineNum = 2359;BA.debugLine="koniMesafesi19 = New";
Debug.ShouldStop(4194304);
programveri._konimesafesi19 = BA.numberCast(float.class, _new);
 };
 BA.debugLineNum = 2361;BA.debugLine="End Sub";
Debug.ShouldStop(16777216);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _edittextkonimesafesi2_textchanged(RemoteObject _old,RemoteObject _new) throws Exception{
try {
		Debug.PushSubsStack("EditTextKoniMesafesi2_TextChanged (programveri) ","programveri",12,programveri.mostCurrent.activityBA,programveri.mostCurrent,1811);
if (RapidSub.canDelegate("edittextkonimesafesi2_textchanged")) { return b4a.example3.programveri.remoteMe.runUserSub(false, "programveri","edittextkonimesafesi2_textchanged", _old, _new);}
Debug.locals.put("Old", _old);
Debug.locals.put("New", _new);
 BA.debugLineNum = 1811;BA.debugLine="Sub EditTextKoniMesafesi2_TextChanged (Old As Stri";
Debug.ShouldStop(262144);
 BA.debugLineNum = 1812;BA.debugLine="If EditTextKoniMesafesi2.Text.Length == 0 Then";
Debug.ShouldStop(524288);
if (RemoteObject.solveBoolean("=",programveri.mostCurrent._edittextkonimesafesi2.runMethod(true,"getText").runMethod(true,"length"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 1813;BA.debugLine="koniMesafesi2 = Old";
Debug.ShouldStop(1048576);
programveri._konimesafesi2 = BA.numberCast(float.class, _old);
 }else {
 BA.debugLineNum = 1815;BA.debugLine="koniMesafesi2 = New";
Debug.ShouldStop(4194304);
programveri._konimesafesi2 = BA.numberCast(float.class, _new);
 };
 BA.debugLineNum = 1817;BA.debugLine="End Sub";
Debug.ShouldStop(16777216);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _edittextkonimesafesi20_textchanged(RemoteObject _old,RemoteObject _new) throws Exception{
try {
		Debug.PushSubsStack("EditTextKoniMesafesi20_TextChanged (programveri) ","programveri",12,programveri.mostCurrent.activityBA,programveri.mostCurrent,2387);
if (RapidSub.canDelegate("edittextkonimesafesi20_textchanged")) { return b4a.example3.programveri.remoteMe.runUserSub(false, "programveri","edittextkonimesafesi20_textchanged", _old, _new);}
Debug.locals.put("Old", _old);
Debug.locals.put("New", _new);
 BA.debugLineNum = 2387;BA.debugLine="Sub EditTextKoniMesafesi20_TextChanged (Old As Str";
Debug.ShouldStop(262144);
 BA.debugLineNum = 2388;BA.debugLine="If EditTextKoniMesafesi20.Text.Length == 0 Then";
Debug.ShouldStop(524288);
if (RemoteObject.solveBoolean("=",programveri.mostCurrent._edittextkonimesafesi20.runMethod(true,"getText").runMethod(true,"length"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 2389;BA.debugLine="koniMesafesi20 = Old";
Debug.ShouldStop(1048576);
programveri._konimesafesi20 = BA.numberCast(float.class, _old);
 }else {
 BA.debugLineNum = 2391;BA.debugLine="koniMesafesi20 = New";
Debug.ShouldStop(4194304);
programveri._konimesafesi20 = BA.numberCast(float.class, _new);
 };
 BA.debugLineNum = 2393;BA.debugLine="End Sub";
Debug.ShouldStop(16777216);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _edittextkonimesafesi21_textchanged(RemoteObject _old,RemoteObject _new) throws Exception{
try {
		Debug.PushSubsStack("EditTextKoniMesafesi21_TextChanged (programveri) ","programveri",12,programveri.mostCurrent.activityBA,programveri.mostCurrent,2419);
if (RapidSub.canDelegate("edittextkonimesafesi21_textchanged")) { return b4a.example3.programveri.remoteMe.runUserSub(false, "programveri","edittextkonimesafesi21_textchanged", _old, _new);}
Debug.locals.put("Old", _old);
Debug.locals.put("New", _new);
 BA.debugLineNum = 2419;BA.debugLine="Sub EditTextKoniMesafesi21_TextChanged (Old As Str";
Debug.ShouldStop(262144);
 BA.debugLineNum = 2420;BA.debugLine="If EditTextKoniMesafesi21.Text.Length == 0 Then";
Debug.ShouldStop(524288);
if (RemoteObject.solveBoolean("=",programveri.mostCurrent._edittextkonimesafesi21.runMethod(true,"getText").runMethod(true,"length"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 2421;BA.debugLine="koniMesafesi21 = Old";
Debug.ShouldStop(1048576);
programveri._konimesafesi21 = BA.numberCast(float.class, _old);
 }else {
 BA.debugLineNum = 2423;BA.debugLine="koniMesafesi21 = New";
Debug.ShouldStop(4194304);
programveri._konimesafesi21 = BA.numberCast(float.class, _new);
 };
 BA.debugLineNum = 2425;BA.debugLine="End Sub";
Debug.ShouldStop(16777216);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _edittextkonimesafesi22_textchanged(RemoteObject _old,RemoteObject _new) throws Exception{
try {
		Debug.PushSubsStack("EditTextKoniMesafesi22_TextChanged (programveri) ","programveri",12,programveri.mostCurrent.activityBA,programveri.mostCurrent,2451);
if (RapidSub.canDelegate("edittextkonimesafesi22_textchanged")) { return b4a.example3.programveri.remoteMe.runUserSub(false, "programveri","edittextkonimesafesi22_textchanged", _old, _new);}
Debug.locals.put("Old", _old);
Debug.locals.put("New", _new);
 BA.debugLineNum = 2451;BA.debugLine="Sub EditTextKoniMesafesi22_TextChanged (Old As Str";
Debug.ShouldStop(262144);
 BA.debugLineNum = 2452;BA.debugLine="If EditTextKoniMesafesi22.Text.Length == 0 Then";
Debug.ShouldStop(524288);
if (RemoteObject.solveBoolean("=",programveri.mostCurrent._edittextkonimesafesi22.runMethod(true,"getText").runMethod(true,"length"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 2453;BA.debugLine="koniMesafesi22 = Old";
Debug.ShouldStop(1048576);
programveri._konimesafesi22 = BA.numberCast(float.class, _old);
 }else {
 BA.debugLineNum = 2455;BA.debugLine="koniMesafesi22 = New";
Debug.ShouldStop(4194304);
programveri._konimesafesi22 = BA.numberCast(float.class, _new);
 };
 BA.debugLineNum = 2457;BA.debugLine="End Sub";
Debug.ShouldStop(16777216);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _edittextkonimesafesi23_textchanged(RemoteObject _old,RemoteObject _new) throws Exception{
try {
		Debug.PushSubsStack("EditTextKoniMesafesi23_TextChanged (programveri) ","programveri",12,programveri.mostCurrent.activityBA,programveri.mostCurrent,2507);
if (RapidSub.canDelegate("edittextkonimesafesi23_textchanged")) { return b4a.example3.programveri.remoteMe.runUserSub(false, "programveri","edittextkonimesafesi23_textchanged", _old, _new);}
Debug.locals.put("Old", _old);
Debug.locals.put("New", _new);
 BA.debugLineNum = 2507;BA.debugLine="Sub EditTextKoniMesafesi23_TextChanged (Old As Str";
Debug.ShouldStop(1024);
 BA.debugLineNum = 2508;BA.debugLine="If EditTextKoniMesafesi23.Text.Length == 0 Then";
Debug.ShouldStop(2048);
if (RemoteObject.solveBoolean("=",programveri.mostCurrent._edittextkonimesafesi23.runMethod(true,"getText").runMethod(true,"length"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 2509;BA.debugLine="koniMesafesi23 = Old";
Debug.ShouldStop(4096);
programveri._konimesafesi23 = BA.numberCast(float.class, _old);
 }else {
 BA.debugLineNum = 2511;BA.debugLine="koniMesafesi23 = New";
Debug.ShouldStop(16384);
programveri._konimesafesi23 = BA.numberCast(float.class, _new);
 };
 BA.debugLineNum = 2513;BA.debugLine="End Sub";
Debug.ShouldStop(65536);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _edittextkonimesafesi24_textchanged(RemoteObject _old,RemoteObject _new) throws Exception{
try {
		Debug.PushSubsStack("EditTextKoniMesafesi24_TextChanged (programveri) ","programveri",12,programveri.mostCurrent.activityBA,programveri.mostCurrent,2515);
if (RapidSub.canDelegate("edittextkonimesafesi24_textchanged")) { return b4a.example3.programveri.remoteMe.runUserSub(false, "programveri","edittextkonimesafesi24_textchanged", _old, _new);}
Debug.locals.put("Old", _old);
Debug.locals.put("New", _new);
 BA.debugLineNum = 2515;BA.debugLine="Sub EditTextKoniMesafesi24_TextChanged (Old As Str";
Debug.ShouldStop(262144);
 BA.debugLineNum = 2516;BA.debugLine="If EditTextKoniMesafesi24.Text.Length == 0 Then";
Debug.ShouldStop(524288);
if (RemoteObject.solveBoolean("=",programveri.mostCurrent._edittextkonimesafesi24.runMethod(true,"getText").runMethod(true,"length"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 2517;BA.debugLine="koniMesafesi24 = Old";
Debug.ShouldStop(1048576);
programveri._konimesafesi24 = BA.numberCast(float.class, _old);
 }else {
 BA.debugLineNum = 2519;BA.debugLine="koniMesafesi24 = New";
Debug.ShouldStop(4194304);
programveri._konimesafesi24 = BA.numberCast(float.class, _new);
 };
 BA.debugLineNum = 2521;BA.debugLine="End Sub";
Debug.ShouldStop(16777216);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _edittextkonimesafesi25_textchanged(RemoteObject _old,RemoteObject _new) throws Exception{
try {
		Debug.PushSubsStack("EditTextKoniMesafesi25_TextChanged (programveri) ","programveri",12,programveri.mostCurrent.activityBA,programveri.mostCurrent,2571);
if (RapidSub.canDelegate("edittextkonimesafesi25_textchanged")) { return b4a.example3.programveri.remoteMe.runUserSub(false, "programveri","edittextkonimesafesi25_textchanged", _old, _new);}
Debug.locals.put("Old", _old);
Debug.locals.put("New", _new);
 BA.debugLineNum = 2571;BA.debugLine="Sub EditTextKoniMesafesi25_TextChanged (Old As Str";
Debug.ShouldStop(1024);
 BA.debugLineNum = 2572;BA.debugLine="If EditTextKoniMesafesi25.Text.Length == 0 Then";
Debug.ShouldStop(2048);
if (RemoteObject.solveBoolean("=",programveri.mostCurrent._edittextkonimesafesi25.runMethod(true,"getText").runMethod(true,"length"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 2573;BA.debugLine="koniMesafesi25 = Old";
Debug.ShouldStop(4096);
programveri._konimesafesi25 = BA.numberCast(float.class, _old);
 }else {
 BA.debugLineNum = 2575;BA.debugLine="koniMesafesi25 = New";
Debug.ShouldStop(16384);
programveri._konimesafesi25 = BA.numberCast(float.class, _new);
 };
 BA.debugLineNum = 2577;BA.debugLine="End Sub";
Debug.ShouldStop(65536);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _edittextkonimesafesi3_textchanged(RemoteObject _old,RemoteObject _new) throws Exception{
try {
		Debug.PushSubsStack("EditTextKoniMesafesi3_TextChanged (programveri) ","programveri",12,programveri.mostCurrent.activityBA,programveri.mostCurrent,1843);
if (RapidSub.canDelegate("edittextkonimesafesi3_textchanged")) { return b4a.example3.programveri.remoteMe.runUserSub(false, "programveri","edittextkonimesafesi3_textchanged", _old, _new);}
Debug.locals.put("Old", _old);
Debug.locals.put("New", _new);
 BA.debugLineNum = 1843;BA.debugLine="Sub EditTextKoniMesafesi3_TextChanged (Old As Stri";
Debug.ShouldStop(262144);
 BA.debugLineNum = 1844;BA.debugLine="If EditTextKoniMesafesi3.Text.Length == 0 Then";
Debug.ShouldStop(524288);
if (RemoteObject.solveBoolean("=",programveri.mostCurrent._edittextkonimesafesi3.runMethod(true,"getText").runMethod(true,"length"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 1845;BA.debugLine="koniMesafesi3 = Old";
Debug.ShouldStop(1048576);
programveri._konimesafesi3 = BA.numberCast(float.class, _old);
 }else {
 BA.debugLineNum = 1847;BA.debugLine="koniMesafesi3 = New";
Debug.ShouldStop(4194304);
programveri._konimesafesi3 = BA.numberCast(float.class, _new);
 };
 BA.debugLineNum = 1849;BA.debugLine="End Sub";
Debug.ShouldStop(16777216);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _edittextkonimesafesi4_textchanged(RemoteObject _old,RemoteObject _new) throws Exception{
try {
		Debug.PushSubsStack("EditTextKoniMesafesi4_TextChanged (programveri) ","programveri",12,programveri.mostCurrent.activityBA,programveri.mostCurrent,1875);
if (RapidSub.canDelegate("edittextkonimesafesi4_textchanged")) { return b4a.example3.programveri.remoteMe.runUserSub(false, "programveri","edittextkonimesafesi4_textchanged", _old, _new);}
Debug.locals.put("Old", _old);
Debug.locals.put("New", _new);
 BA.debugLineNum = 1875;BA.debugLine="Sub EditTextKoniMesafesi4_TextChanged (Old As Stri";
Debug.ShouldStop(262144);
 BA.debugLineNum = 1876;BA.debugLine="If EditTextKoniMesafesi4.Text.Length == 0 Then";
Debug.ShouldStop(524288);
if (RemoteObject.solveBoolean("=",programveri.mostCurrent._edittextkonimesafesi4.runMethod(true,"getText").runMethod(true,"length"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 1877;BA.debugLine="koniMesafesi4 = Old";
Debug.ShouldStop(1048576);
programveri._konimesafesi4 = BA.numberCast(float.class, _old);
 }else {
 BA.debugLineNum = 1879;BA.debugLine="koniMesafesi4 = New";
Debug.ShouldStop(4194304);
programveri._konimesafesi4 = BA.numberCast(float.class, _new);
 };
 BA.debugLineNum = 1881;BA.debugLine="End Sub";
Debug.ShouldStop(16777216);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _edittextkonimesafesi5_textchanged(RemoteObject _old,RemoteObject _new) throws Exception{
try {
		Debug.PushSubsStack("EditTextKoniMesafesi5_TextChanged (programveri) ","programveri",12,programveri.mostCurrent.activityBA,programveri.mostCurrent,1907);
if (RapidSub.canDelegate("edittextkonimesafesi5_textchanged")) { return b4a.example3.programveri.remoteMe.runUserSub(false, "programveri","edittextkonimesafesi5_textchanged", _old, _new);}
Debug.locals.put("Old", _old);
Debug.locals.put("New", _new);
 BA.debugLineNum = 1907;BA.debugLine="Sub EditTextKoniMesafesi5_TextChanged (Old As Stri";
Debug.ShouldStop(262144);
 BA.debugLineNum = 1908;BA.debugLine="If EditTextKoniMesafesi5.Text.Length == 0 Then";
Debug.ShouldStop(524288);
if (RemoteObject.solveBoolean("=",programveri.mostCurrent._edittextkonimesafesi5.runMethod(true,"getText").runMethod(true,"length"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 1909;BA.debugLine="koniMesafesi5 = Old";
Debug.ShouldStop(1048576);
programveri._konimesafesi5 = BA.numberCast(float.class, _old);
 }else {
 BA.debugLineNum = 1911;BA.debugLine="koniMesafesi5 = New";
Debug.ShouldStop(4194304);
programveri._konimesafesi5 = BA.numberCast(float.class, _new);
 };
 BA.debugLineNum = 1913;BA.debugLine="End Sub";
Debug.ShouldStop(16777216);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _edittextkonimesafesi6_textchanged(RemoteObject _old,RemoteObject _new) throws Exception{
try {
		Debug.PushSubsStack("EditTextKoniMesafesi6_TextChanged (programveri) ","programveri",12,programveri.mostCurrent.activityBA,programveri.mostCurrent,1939);
if (RapidSub.canDelegate("edittextkonimesafesi6_textchanged")) { return b4a.example3.programveri.remoteMe.runUserSub(false, "programveri","edittextkonimesafesi6_textchanged", _old, _new);}
Debug.locals.put("Old", _old);
Debug.locals.put("New", _new);
 BA.debugLineNum = 1939;BA.debugLine="Sub EditTextKoniMesafesi6_TextChanged (Old As Stri";
Debug.ShouldStop(262144);
 BA.debugLineNum = 1940;BA.debugLine="If EditTextKoniMesafesi6.Text.Length == 0 Then";
Debug.ShouldStop(524288);
if (RemoteObject.solveBoolean("=",programveri.mostCurrent._edittextkonimesafesi6.runMethod(true,"getText").runMethod(true,"length"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 1941;BA.debugLine="koniMesafesi6 = Old";
Debug.ShouldStop(1048576);
programveri._konimesafesi6 = BA.numberCast(float.class, _old);
 }else {
 BA.debugLineNum = 1943;BA.debugLine="koniMesafesi6 = New";
Debug.ShouldStop(4194304);
programveri._konimesafesi6 = BA.numberCast(float.class, _new);
 };
 BA.debugLineNum = 1945;BA.debugLine="End Sub";
Debug.ShouldStop(16777216);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _edittextkonimesafesi7_textchanged(RemoteObject _old,RemoteObject _new) throws Exception{
try {
		Debug.PushSubsStack("EditTextKoniMesafesi7_TextChanged (programveri) ","programveri",12,programveri.mostCurrent.activityBA,programveri.mostCurrent,1971);
if (RapidSub.canDelegate("edittextkonimesafesi7_textchanged")) { return b4a.example3.programveri.remoteMe.runUserSub(false, "programveri","edittextkonimesafesi7_textchanged", _old, _new);}
Debug.locals.put("Old", _old);
Debug.locals.put("New", _new);
 BA.debugLineNum = 1971;BA.debugLine="Sub EditTextKoniMesafesi7_TextChanged (Old As Stri";
Debug.ShouldStop(262144);
 BA.debugLineNum = 1972;BA.debugLine="If EditTextKoniMesafesi7.Text.Length == 0 Then";
Debug.ShouldStop(524288);
if (RemoteObject.solveBoolean("=",programveri.mostCurrent._edittextkonimesafesi7.runMethod(true,"getText").runMethod(true,"length"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 1973;BA.debugLine="koniMesafesi7 = Old";
Debug.ShouldStop(1048576);
programveri._konimesafesi7 = BA.numberCast(float.class, _old);
 }else {
 BA.debugLineNum = 1975;BA.debugLine="koniMesafesi7 = New";
Debug.ShouldStop(4194304);
programveri._konimesafesi7 = BA.numberCast(float.class, _new);
 };
 BA.debugLineNum = 1977;BA.debugLine="End Sub";
Debug.ShouldStop(16777216);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _edittextkonimesafesi8_textchanged(RemoteObject _old,RemoteObject _new) throws Exception{
try {
		Debug.PushSubsStack("EditTextKoniMesafesi8_TextChanged (programveri) ","programveri",12,programveri.mostCurrent.activityBA,programveri.mostCurrent,2003);
if (RapidSub.canDelegate("edittextkonimesafesi8_textchanged")) { return b4a.example3.programveri.remoteMe.runUserSub(false, "programveri","edittextkonimesafesi8_textchanged", _old, _new);}
Debug.locals.put("Old", _old);
Debug.locals.put("New", _new);
 BA.debugLineNum = 2003;BA.debugLine="Sub EditTextKoniMesafesi8_TextChanged (Old As Stri";
Debug.ShouldStop(262144);
 BA.debugLineNum = 2004;BA.debugLine="If EditTextKoniMesafesi8.Text.Length == 0 Then";
Debug.ShouldStop(524288);
if (RemoteObject.solveBoolean("=",programveri.mostCurrent._edittextkonimesafesi8.runMethod(true,"getText").runMethod(true,"length"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 2005;BA.debugLine="koniMesafesi8 = Old";
Debug.ShouldStop(1048576);
programveri._konimesafesi8 = BA.numberCast(float.class, _old);
 }else {
 BA.debugLineNum = 2007;BA.debugLine="koniMesafesi8 = New";
Debug.ShouldStop(4194304);
programveri._konimesafesi8 = BA.numberCast(float.class, _new);
 };
 BA.debugLineNum = 2009;BA.debugLine="End Sub";
Debug.ShouldStop(16777216);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _edittextkonimesafesi9_textchanged(RemoteObject _old,RemoteObject _new) throws Exception{
try {
		Debug.PushSubsStack("EditTextKoniMesafesi9_TextChanged (programveri) ","programveri",12,programveri.mostCurrent.activityBA,programveri.mostCurrent,2035);
if (RapidSub.canDelegate("edittextkonimesafesi9_textchanged")) { return b4a.example3.programveri.remoteMe.runUserSub(false, "programveri","edittextkonimesafesi9_textchanged", _old, _new);}
Debug.locals.put("Old", _old);
Debug.locals.put("New", _new);
 BA.debugLineNum = 2035;BA.debugLine="Sub EditTextKoniMesafesi9_TextChanged (Old As Stri";
Debug.ShouldStop(262144);
 BA.debugLineNum = 2036;BA.debugLine="If EditTextKoniMesafesi9.Text.Length == 0 Then";
Debug.ShouldStop(524288);
if (RemoteObject.solveBoolean("=",programveri.mostCurrent._edittextkonimesafesi9.runMethod(true,"getText").runMethod(true,"length"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 2037;BA.debugLine="koniMesafesi9 = Old";
Debug.ShouldStop(1048576);
programveri._konimesafesi9 = BA.numberCast(float.class, _old);
 }else {
 BA.debugLineNum = 2039;BA.debugLine="koniMesafesi9 = New";
Debug.ShouldStop(4194304);
programveri._konimesafesi9 = BA.numberCast(float.class, _new);
 };
 BA.debugLineNum = 2041;BA.debugLine="End Sub";
Debug.ShouldStop(16777216);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _edittextsaniye1_textchanged(RemoteObject _old,RemoteObject _new) throws Exception{
try {
		Debug.PushSubsStack("EditTextSaniye1_TextChanged (programveri) ","programveri",12,programveri.mostCurrent.activityBA,programveri.mostCurrent,1803);
if (RapidSub.canDelegate("edittextsaniye1_textchanged")) { return b4a.example3.programveri.remoteMe.runUserSub(false, "programveri","edittextsaniye1_textchanged", _old, _new);}
Debug.locals.put("Old", _old);
Debug.locals.put("New", _new);
 BA.debugLineNum = 1803;BA.debugLine="Sub EditTextSaniye1_TextChanged (Old As String, Ne";
Debug.ShouldStop(1024);
 BA.debugLineNum = 1804;BA.debugLine="If EditTextSaniye1.Text.Length == 0 Then";
Debug.ShouldStop(2048);
if (RemoteObject.solveBoolean("=",programveri.mostCurrent._edittextsaniye1.runMethod(true,"getText").runMethod(true,"length"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 1805;BA.debugLine="saniye1 = Old";
Debug.ShouldStop(4096);
programveri._saniye1 = BA.numberCast(int.class, _old);
 }else {
 BA.debugLineNum = 1807;BA.debugLine="saniye1 = New";
Debug.ShouldStop(16384);
programveri._saniye1 = BA.numberCast(int.class, _new);
 };
 BA.debugLineNum = 1809;BA.debugLine="End Sub";
Debug.ShouldStop(65536);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _edittextsaniye10_textchanged(RemoteObject _old,RemoteObject _new) throws Exception{
try {
		Debug.PushSubsStack("EditTextSaniye10_TextChanged (programveri) ","programveri",12,programveri.mostCurrent.activityBA,programveri.mostCurrent,2091);
if (RapidSub.canDelegate("edittextsaniye10_textchanged")) { return b4a.example3.programveri.remoteMe.runUserSub(false, "programveri","edittextsaniye10_textchanged", _old, _new);}
Debug.locals.put("Old", _old);
Debug.locals.put("New", _new);
 BA.debugLineNum = 2091;BA.debugLine="Sub EditTextSaniye10_TextChanged (Old As String, N";
Debug.ShouldStop(1024);
 BA.debugLineNum = 2092;BA.debugLine="If EditTextSaniye10.Text.Length == 0 Then";
Debug.ShouldStop(2048);
if (RemoteObject.solveBoolean("=",programveri.mostCurrent._edittextsaniye10.runMethod(true,"getText").runMethod(true,"length"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 2093;BA.debugLine="saniye10 = Old";
Debug.ShouldStop(4096);
programveri._saniye10 = BA.numberCast(int.class, _old);
 }else {
 BA.debugLineNum = 2095;BA.debugLine="saniye10 = New";
Debug.ShouldStop(16384);
programveri._saniye10 = BA.numberCast(int.class, _new);
 };
 BA.debugLineNum = 2097;BA.debugLine="End Sub";
Debug.ShouldStop(65536);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _edittextsaniye11_textchanged(RemoteObject _old,RemoteObject _new) throws Exception{
try {
		Debug.PushSubsStack("EditTextSaniye11_TextChanged (programveri) ","programveri",12,programveri.mostCurrent.activityBA,programveri.mostCurrent,2123);
if (RapidSub.canDelegate("edittextsaniye11_textchanged")) { return b4a.example3.programveri.remoteMe.runUserSub(false, "programveri","edittextsaniye11_textchanged", _old, _new);}
Debug.locals.put("Old", _old);
Debug.locals.put("New", _new);
 BA.debugLineNum = 2123;BA.debugLine="Sub EditTextSaniye11_TextChanged (Old As String, N";
Debug.ShouldStop(1024);
 BA.debugLineNum = 2124;BA.debugLine="If EditTextSaniye11.Text.Length == 0 Then";
Debug.ShouldStop(2048);
if (RemoteObject.solveBoolean("=",programveri.mostCurrent._edittextsaniye11.runMethod(true,"getText").runMethod(true,"length"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 2125;BA.debugLine="saniye11 = Old";
Debug.ShouldStop(4096);
programveri._saniye11 = BA.numberCast(int.class, _old);
 }else {
 BA.debugLineNum = 2127;BA.debugLine="saniye11 = New";
Debug.ShouldStop(16384);
programveri._saniye11 = BA.numberCast(int.class, _new);
 };
 BA.debugLineNum = 2129;BA.debugLine="End Sub";
Debug.ShouldStop(65536);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _edittextsaniye12_textchanged(RemoteObject _old,RemoteObject _new) throws Exception{
try {
		Debug.PushSubsStack("EditTextSaniye12_TextChanged (programveri) ","programveri",12,programveri.mostCurrent.activityBA,programveri.mostCurrent,2155);
if (RapidSub.canDelegate("edittextsaniye12_textchanged")) { return b4a.example3.programveri.remoteMe.runUserSub(false, "programveri","edittextsaniye12_textchanged", _old, _new);}
Debug.locals.put("Old", _old);
Debug.locals.put("New", _new);
 BA.debugLineNum = 2155;BA.debugLine="Sub EditTextSaniye12_TextChanged (Old As String, N";
Debug.ShouldStop(1024);
 BA.debugLineNum = 2156;BA.debugLine="If EditTextSaniye12.Text.Length == 0 Then";
Debug.ShouldStop(2048);
if (RemoteObject.solveBoolean("=",programveri.mostCurrent._edittextsaniye12.runMethod(true,"getText").runMethod(true,"length"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 2157;BA.debugLine="saniye12 = Old";
Debug.ShouldStop(4096);
programveri._saniye12 = BA.numberCast(int.class, _old);
 }else {
 BA.debugLineNum = 2159;BA.debugLine="saniye12 = New";
Debug.ShouldStop(16384);
programveri._saniye12 = BA.numberCast(int.class, _new);
 };
 BA.debugLineNum = 2161;BA.debugLine="End Sub";
Debug.ShouldStop(65536);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _edittextsaniye13_textchanged(RemoteObject _old,RemoteObject _new) throws Exception{
try {
		Debug.PushSubsStack("EditTextSaniye13_TextChanged (programveri) ","programveri",12,programveri.mostCurrent.activityBA,programveri.mostCurrent,2187);
if (RapidSub.canDelegate("edittextsaniye13_textchanged")) { return b4a.example3.programveri.remoteMe.runUserSub(false, "programveri","edittextsaniye13_textchanged", _old, _new);}
Debug.locals.put("Old", _old);
Debug.locals.put("New", _new);
 BA.debugLineNum = 2187;BA.debugLine="Sub EditTextSaniye13_TextChanged (Old As String, N";
Debug.ShouldStop(1024);
 BA.debugLineNum = 2188;BA.debugLine="If EditTextSaniye13.Text.Length == 0 Then";
Debug.ShouldStop(2048);
if (RemoteObject.solveBoolean("=",programveri.mostCurrent._edittextsaniye13.runMethod(true,"getText").runMethod(true,"length"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 2189;BA.debugLine="saniye13 = Old";
Debug.ShouldStop(4096);
programveri._saniye13 = BA.numberCast(int.class, _old);
 }else {
 BA.debugLineNum = 2191;BA.debugLine="saniye13 = New";
Debug.ShouldStop(16384);
programveri._saniye13 = BA.numberCast(int.class, _new);
 };
 BA.debugLineNum = 2193;BA.debugLine="End Sub";
Debug.ShouldStop(65536);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _edittextsaniye14_textchanged(RemoteObject _old,RemoteObject _new) throws Exception{
try {
		Debug.PushSubsStack("EditTextSaniye14_TextChanged (programveri) ","programveri",12,programveri.mostCurrent.activityBA,programveri.mostCurrent,2219);
if (RapidSub.canDelegate("edittextsaniye14_textchanged")) { return b4a.example3.programveri.remoteMe.runUserSub(false, "programveri","edittextsaniye14_textchanged", _old, _new);}
Debug.locals.put("Old", _old);
Debug.locals.put("New", _new);
 BA.debugLineNum = 2219;BA.debugLine="Sub EditTextSaniye14_TextChanged (Old As String, N";
Debug.ShouldStop(1024);
 BA.debugLineNum = 2220;BA.debugLine="If EditTextSaniye14.Text.Length == 0 Then";
Debug.ShouldStop(2048);
if (RemoteObject.solveBoolean("=",programveri.mostCurrent._edittextsaniye14.runMethod(true,"getText").runMethod(true,"length"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 2221;BA.debugLine="saniye14 = Old";
Debug.ShouldStop(4096);
programveri._saniye14 = BA.numberCast(int.class, _old);
 }else {
 BA.debugLineNum = 2223;BA.debugLine="saniye14 = New";
Debug.ShouldStop(16384);
programveri._saniye14 = BA.numberCast(int.class, _new);
 };
 BA.debugLineNum = 2225;BA.debugLine="End Sub";
Debug.ShouldStop(65536);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _edittextsaniye15_textchanged(RemoteObject _old,RemoteObject _new) throws Exception{
try {
		Debug.PushSubsStack("EditTextSaniye15_TextChanged (programveri) ","programveri",12,programveri.mostCurrent.activityBA,programveri.mostCurrent,2251);
if (RapidSub.canDelegate("edittextsaniye15_textchanged")) { return b4a.example3.programveri.remoteMe.runUserSub(false, "programveri","edittextsaniye15_textchanged", _old, _new);}
Debug.locals.put("Old", _old);
Debug.locals.put("New", _new);
 BA.debugLineNum = 2251;BA.debugLine="Sub EditTextSaniye15_TextChanged (Old As String, N";
Debug.ShouldStop(1024);
 BA.debugLineNum = 2252;BA.debugLine="If EditTextSaniye15.Text.Length == 0 Then";
Debug.ShouldStop(2048);
if (RemoteObject.solveBoolean("=",programveri.mostCurrent._edittextsaniye15.runMethod(true,"getText").runMethod(true,"length"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 2253;BA.debugLine="saniye15 = Old";
Debug.ShouldStop(4096);
programveri._saniye15 = BA.numberCast(int.class, _old);
 }else {
 BA.debugLineNum = 2255;BA.debugLine="saniye15 = New";
Debug.ShouldStop(16384);
programveri._saniye15 = BA.numberCast(int.class, _new);
 };
 BA.debugLineNum = 2257;BA.debugLine="End Sub";
Debug.ShouldStop(65536);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _edittextsaniye16_textchanged(RemoteObject _old,RemoteObject _new) throws Exception{
try {
		Debug.PushSubsStack("EditTextSaniye16_TextChanged (programveri) ","programveri",12,programveri.mostCurrent.activityBA,programveri.mostCurrent,2283);
if (RapidSub.canDelegate("edittextsaniye16_textchanged")) { return b4a.example3.programveri.remoteMe.runUserSub(false, "programveri","edittextsaniye16_textchanged", _old, _new);}
Debug.locals.put("Old", _old);
Debug.locals.put("New", _new);
 BA.debugLineNum = 2283;BA.debugLine="Sub EditTextSaniye16_TextChanged (Old As String, N";
Debug.ShouldStop(1024);
 BA.debugLineNum = 2284;BA.debugLine="If EditTextSaniye16.Text.Length == 0 Then";
Debug.ShouldStop(2048);
if (RemoteObject.solveBoolean("=",programveri.mostCurrent._edittextsaniye16.runMethod(true,"getText").runMethod(true,"length"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 2285;BA.debugLine="saniye16 = Old";
Debug.ShouldStop(4096);
programveri._saniye16 = BA.numberCast(int.class, _old);
 }else {
 BA.debugLineNum = 2287;BA.debugLine="saniye16 = New";
Debug.ShouldStop(16384);
programveri._saniye16 = BA.numberCast(int.class, _new);
 };
 BA.debugLineNum = 2289;BA.debugLine="End Sub";
Debug.ShouldStop(65536);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _edittextsaniye17_textchanged(RemoteObject _old,RemoteObject _new) throws Exception{
try {
		Debug.PushSubsStack("EditTextSaniye17_TextChanged (programveri) ","programveri",12,programveri.mostCurrent.activityBA,programveri.mostCurrent,2315);
if (RapidSub.canDelegate("edittextsaniye17_textchanged")) { return b4a.example3.programveri.remoteMe.runUserSub(false, "programveri","edittextsaniye17_textchanged", _old, _new);}
Debug.locals.put("Old", _old);
Debug.locals.put("New", _new);
 BA.debugLineNum = 2315;BA.debugLine="Sub EditTextSaniye17_TextChanged (Old As String, N";
Debug.ShouldStop(1024);
 BA.debugLineNum = 2316;BA.debugLine="If EditTextSaniye17.Text.Length == 0 Then";
Debug.ShouldStop(2048);
if (RemoteObject.solveBoolean("=",programveri.mostCurrent._edittextsaniye17.runMethod(true,"getText").runMethod(true,"length"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 2317;BA.debugLine="saniye17 = Old";
Debug.ShouldStop(4096);
programveri._saniye17 = BA.numberCast(int.class, _old);
 }else {
 BA.debugLineNum = 2319;BA.debugLine="saniye17 = New";
Debug.ShouldStop(16384);
programveri._saniye17 = BA.numberCast(int.class, _new);
 };
 BA.debugLineNum = 2321;BA.debugLine="End Sub";
Debug.ShouldStop(65536);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _edittextsaniye18_textchanged(RemoteObject _old,RemoteObject _new) throws Exception{
try {
		Debug.PushSubsStack("EditTextSaniye18_TextChanged (programveri) ","programveri",12,programveri.mostCurrent.activityBA,programveri.mostCurrent,2347);
if (RapidSub.canDelegate("edittextsaniye18_textchanged")) { return b4a.example3.programveri.remoteMe.runUserSub(false, "programveri","edittextsaniye18_textchanged", _old, _new);}
Debug.locals.put("Old", _old);
Debug.locals.put("New", _new);
 BA.debugLineNum = 2347;BA.debugLine="Sub EditTextSaniye18_TextChanged (Old As String, N";
Debug.ShouldStop(1024);
 BA.debugLineNum = 2348;BA.debugLine="If EditTextSaniye18.Text.Length == 0 Then";
Debug.ShouldStop(2048);
if (RemoteObject.solveBoolean("=",programveri.mostCurrent._edittextsaniye18.runMethod(true,"getText").runMethod(true,"length"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 2349;BA.debugLine="saniye18 = Old";
Debug.ShouldStop(4096);
programveri._saniye18 = BA.numberCast(int.class, _old);
 }else {
 BA.debugLineNum = 2351;BA.debugLine="saniye18 = New";
Debug.ShouldStop(16384);
programveri._saniye18 = BA.numberCast(int.class, _new);
 };
 BA.debugLineNum = 2353;BA.debugLine="End Sub";
Debug.ShouldStop(65536);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _edittextsaniye19_textchanged(RemoteObject _old,RemoteObject _new) throws Exception{
try {
		Debug.PushSubsStack("EditTextSaniye19_TextChanged (programveri) ","programveri",12,programveri.mostCurrent.activityBA,programveri.mostCurrent,2379);
if (RapidSub.canDelegate("edittextsaniye19_textchanged")) { return b4a.example3.programveri.remoteMe.runUserSub(false, "programveri","edittextsaniye19_textchanged", _old, _new);}
Debug.locals.put("Old", _old);
Debug.locals.put("New", _new);
 BA.debugLineNum = 2379;BA.debugLine="Sub EditTextSaniye19_TextChanged (Old As String, N";
Debug.ShouldStop(1024);
 BA.debugLineNum = 2380;BA.debugLine="If EditTextSaniye19.Text.Length == 0 Then";
Debug.ShouldStop(2048);
if (RemoteObject.solveBoolean("=",programveri.mostCurrent._edittextsaniye19.runMethod(true,"getText").runMethod(true,"length"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 2381;BA.debugLine="saniye19 = Old";
Debug.ShouldStop(4096);
programveri._saniye19 = BA.numberCast(int.class, _old);
 }else {
 BA.debugLineNum = 2383;BA.debugLine="saniye19 = New";
Debug.ShouldStop(16384);
programveri._saniye19 = BA.numberCast(int.class, _new);
 };
 BA.debugLineNum = 2385;BA.debugLine="End Sub";
Debug.ShouldStop(65536);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _edittextsaniye2_textchanged(RemoteObject _old,RemoteObject _new) throws Exception{
try {
		Debug.PushSubsStack("EditTextSaniye2_TextChanged (programveri) ","programveri",12,programveri.mostCurrent.activityBA,programveri.mostCurrent,1835);
if (RapidSub.canDelegate("edittextsaniye2_textchanged")) { return b4a.example3.programveri.remoteMe.runUserSub(false, "programveri","edittextsaniye2_textchanged", _old, _new);}
Debug.locals.put("Old", _old);
Debug.locals.put("New", _new);
 BA.debugLineNum = 1835;BA.debugLine="Sub EditTextSaniye2_TextChanged (Old As String, Ne";
Debug.ShouldStop(1024);
 BA.debugLineNum = 1836;BA.debugLine="If EditTextSaniye2.Text.Length == 0 Then";
Debug.ShouldStop(2048);
if (RemoteObject.solveBoolean("=",programveri.mostCurrent._edittextsaniye2.runMethod(true,"getText").runMethod(true,"length"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 1837;BA.debugLine="saniye2 = Old";
Debug.ShouldStop(4096);
programveri._saniye2 = BA.numberCast(int.class, _old);
 }else {
 BA.debugLineNum = 1839;BA.debugLine="saniye2 = New";
Debug.ShouldStop(16384);
programveri._saniye2 = BA.numberCast(int.class, _new);
 };
 BA.debugLineNum = 1841;BA.debugLine="End Sub";
Debug.ShouldStop(65536);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _edittextsaniye20_textchanged(RemoteObject _old,RemoteObject _new) throws Exception{
try {
		Debug.PushSubsStack("EditTextSaniye20_TextChanged (programveri) ","programveri",12,programveri.mostCurrent.activityBA,programveri.mostCurrent,2411);
if (RapidSub.canDelegate("edittextsaniye20_textchanged")) { return b4a.example3.programveri.remoteMe.runUserSub(false, "programveri","edittextsaniye20_textchanged", _old, _new);}
Debug.locals.put("Old", _old);
Debug.locals.put("New", _new);
 BA.debugLineNum = 2411;BA.debugLine="Sub EditTextSaniye20_TextChanged (Old As String, N";
Debug.ShouldStop(1024);
 BA.debugLineNum = 2412;BA.debugLine="If EditTextSaniye20.Text.Length == 0 Then";
Debug.ShouldStop(2048);
if (RemoteObject.solveBoolean("=",programveri.mostCurrent._edittextsaniye20.runMethod(true,"getText").runMethod(true,"length"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 2413;BA.debugLine="saniye20 = Old";
Debug.ShouldStop(4096);
programveri._saniye20 = BA.numberCast(int.class, _old);
 }else {
 BA.debugLineNum = 2415;BA.debugLine="saniye20 = New";
Debug.ShouldStop(16384);
programveri._saniye20 = BA.numberCast(int.class, _new);
 };
 BA.debugLineNum = 2417;BA.debugLine="End Sub";
Debug.ShouldStop(65536);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _edittextsaniye21_textchanged(RemoteObject _old,RemoteObject _new) throws Exception{
try {
		Debug.PushSubsStack("EditTextSaniye21_TextChanged (programveri) ","programveri",12,programveri.mostCurrent.activityBA,programveri.mostCurrent,2443);
if (RapidSub.canDelegate("edittextsaniye21_textchanged")) { return b4a.example3.programveri.remoteMe.runUserSub(false, "programveri","edittextsaniye21_textchanged", _old, _new);}
Debug.locals.put("Old", _old);
Debug.locals.put("New", _new);
 BA.debugLineNum = 2443;BA.debugLine="Sub EditTextSaniye21_TextChanged (Old As String, N";
Debug.ShouldStop(1024);
 BA.debugLineNum = 2444;BA.debugLine="If EditTextSaniye21.Text.Length == 0 Then";
Debug.ShouldStop(2048);
if (RemoteObject.solveBoolean("=",programveri.mostCurrent._edittextsaniye21.runMethod(true,"getText").runMethod(true,"length"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 2445;BA.debugLine="saniye21 = Old";
Debug.ShouldStop(4096);
programveri._saniye21 = BA.numberCast(int.class, _old);
 }else {
 BA.debugLineNum = 2447;BA.debugLine="saniye21 = New";
Debug.ShouldStop(16384);
programveri._saniye21 = BA.numberCast(int.class, _new);
 };
 BA.debugLineNum = 2449;BA.debugLine="End Sub";
Debug.ShouldStop(65536);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _edittextsaniye22_textchanged(RemoteObject _old,RemoteObject _new) throws Exception{
try {
		Debug.PushSubsStack("EditTextSaniye22_TextChanged (programveri) ","programveri",12,programveri.mostCurrent.activityBA,programveri.mostCurrent,2475);
if (RapidSub.canDelegate("edittextsaniye22_textchanged")) { return b4a.example3.programveri.remoteMe.runUserSub(false, "programveri","edittextsaniye22_textchanged", _old, _new);}
Debug.locals.put("Old", _old);
Debug.locals.put("New", _new);
 BA.debugLineNum = 2475;BA.debugLine="Sub EditTextSaniye22_TextChanged (Old As String, N";
Debug.ShouldStop(1024);
 BA.debugLineNum = 2476;BA.debugLine="If EditTextSaniye22.Text.Length == 0 Then";
Debug.ShouldStop(2048);
if (RemoteObject.solveBoolean("=",programveri.mostCurrent._edittextsaniye22.runMethod(true,"getText").runMethod(true,"length"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 2477;BA.debugLine="saniye22 = Old";
Debug.ShouldStop(4096);
programveri._saniye22 = BA.numberCast(int.class, _old);
 }else {
 BA.debugLineNum = 2479;BA.debugLine="saniye22 = New";
Debug.ShouldStop(16384);
programveri._saniye22 = BA.numberCast(int.class, _new);
 };
 BA.debugLineNum = 2481;BA.debugLine="End Sub";
Debug.ShouldStop(65536);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _edittextsaniye23_textchanged(RemoteObject _old,RemoteObject _new) throws Exception{
try {
		Debug.PushSubsStack("EditTextSaniye23_TextChanged (programveri) ","programveri",12,programveri.mostCurrent.activityBA,programveri.mostCurrent,2483);
if (RapidSub.canDelegate("edittextsaniye23_textchanged")) { return b4a.example3.programveri.remoteMe.runUserSub(false, "programveri","edittextsaniye23_textchanged", _old, _new);}
Debug.locals.put("Old", _old);
Debug.locals.put("New", _new);
 BA.debugLineNum = 2483;BA.debugLine="Sub EditTextSaniye23_TextChanged (Old As String, N";
Debug.ShouldStop(262144);
 BA.debugLineNum = 2484;BA.debugLine="If EditTextSaniye23.Text.Length == 0 Then";
Debug.ShouldStop(524288);
if (RemoteObject.solveBoolean("=",programveri.mostCurrent._edittextsaniye23.runMethod(true,"getText").runMethod(true,"length"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 2485;BA.debugLine="saniye23 = Old";
Debug.ShouldStop(1048576);
programveri._saniye23 = BA.numberCast(int.class, _old);
 }else {
 BA.debugLineNum = 2487;BA.debugLine="saniye23 = New";
Debug.ShouldStop(4194304);
programveri._saniye23 = BA.numberCast(int.class, _new);
 };
 BA.debugLineNum = 2489;BA.debugLine="End Sub";
Debug.ShouldStop(16777216);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _edittextsaniye24_textchanged(RemoteObject _old,RemoteObject _new) throws Exception{
try {
		Debug.PushSubsStack("EditTextSaniye24_TextChanged (programveri) ","programveri",12,programveri.mostCurrent.activityBA,programveri.mostCurrent,2539);
if (RapidSub.canDelegate("edittextsaniye24_textchanged")) { return b4a.example3.programveri.remoteMe.runUserSub(false, "programveri","edittextsaniye24_textchanged", _old, _new);}
Debug.locals.put("Old", _old);
Debug.locals.put("New", _new);
 BA.debugLineNum = 2539;BA.debugLine="Sub EditTextSaniye24_TextChanged (Old As String, N";
Debug.ShouldStop(1024);
 BA.debugLineNum = 2540;BA.debugLine="If EditTextSaniye24.Text.Length == 0 Then";
Debug.ShouldStop(2048);
if (RemoteObject.solveBoolean("=",programveri.mostCurrent._edittextsaniye24.runMethod(true,"getText").runMethod(true,"length"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 2541;BA.debugLine="saniye24 = Old";
Debug.ShouldStop(4096);
programveri._saniye24 = BA.numberCast(int.class, _old);
 }else {
 BA.debugLineNum = 2543;BA.debugLine="saniye24 = New";
Debug.ShouldStop(16384);
programveri._saniye24 = BA.numberCast(int.class, _new);
 };
 BA.debugLineNum = 2545;BA.debugLine="End Sub";
Debug.ShouldStop(65536);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _edittextsaniye25_textchanged(RemoteObject _old,RemoteObject _new) throws Exception{
try {
		Debug.PushSubsStack("EditTextSaniye25_TextChanged (programveri) ","programveri",12,programveri.mostCurrent.activityBA,programveri.mostCurrent,2547);
if (RapidSub.canDelegate("edittextsaniye25_textchanged")) { return b4a.example3.programveri.remoteMe.runUserSub(false, "programveri","edittextsaniye25_textchanged", _old, _new);}
Debug.locals.put("Old", _old);
Debug.locals.put("New", _new);
 BA.debugLineNum = 2547;BA.debugLine="Sub EditTextSaniye25_TextChanged (Old As String, N";
Debug.ShouldStop(262144);
 BA.debugLineNum = 2548;BA.debugLine="If EditTextSaniye25.Text.Length == 0 Then";
Debug.ShouldStop(524288);
if (RemoteObject.solveBoolean("=",programveri.mostCurrent._edittextsaniye25.runMethod(true,"getText").runMethod(true,"length"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 2549;BA.debugLine="saniye25 = Old";
Debug.ShouldStop(1048576);
programveri._saniye25 = BA.numberCast(int.class, _old);
 }else {
 BA.debugLineNum = 2551;BA.debugLine="saniye25 = New";
Debug.ShouldStop(4194304);
programveri._saniye25 = BA.numberCast(int.class, _new);
 };
 BA.debugLineNum = 2553;BA.debugLine="End Sub";
Debug.ShouldStop(16777216);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _edittextsaniye3_textchanged(RemoteObject _old,RemoteObject _new) throws Exception{
try {
		Debug.PushSubsStack("EditTextSaniye3_TextChanged (programveri) ","programveri",12,programveri.mostCurrent.activityBA,programveri.mostCurrent,1867);
if (RapidSub.canDelegate("edittextsaniye3_textchanged")) { return b4a.example3.programveri.remoteMe.runUserSub(false, "programveri","edittextsaniye3_textchanged", _old, _new);}
Debug.locals.put("Old", _old);
Debug.locals.put("New", _new);
 BA.debugLineNum = 1867;BA.debugLine="Sub EditTextSaniye3_TextChanged (Old As String, Ne";
Debug.ShouldStop(1024);
 BA.debugLineNum = 1868;BA.debugLine="If EditTextSaniye3.Text.Length == 0 Then";
Debug.ShouldStop(2048);
if (RemoteObject.solveBoolean("=",programveri.mostCurrent._edittextsaniye3.runMethod(true,"getText").runMethod(true,"length"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 1869;BA.debugLine="saniye3 = Old";
Debug.ShouldStop(4096);
programveri._saniye3 = BA.numberCast(int.class, _old);
 }else {
 BA.debugLineNum = 1871;BA.debugLine="saniye3 = New";
Debug.ShouldStop(16384);
programveri._saniye3 = BA.numberCast(int.class, _new);
 };
 BA.debugLineNum = 1873;BA.debugLine="End Sub";
Debug.ShouldStop(65536);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _edittextsaniye4_textchanged(RemoteObject _old,RemoteObject _new) throws Exception{
try {
		Debug.PushSubsStack("EditTextSaniye4_TextChanged (programveri) ","programveri",12,programveri.mostCurrent.activityBA,programveri.mostCurrent,1899);
if (RapidSub.canDelegate("edittextsaniye4_textchanged")) { return b4a.example3.programveri.remoteMe.runUserSub(false, "programveri","edittextsaniye4_textchanged", _old, _new);}
Debug.locals.put("Old", _old);
Debug.locals.put("New", _new);
 BA.debugLineNum = 1899;BA.debugLine="Sub EditTextSaniye4_TextChanged (Old As String, Ne";
Debug.ShouldStop(1024);
 BA.debugLineNum = 1900;BA.debugLine="If EditTextSaniye4.Text.Length == 0 Then";
Debug.ShouldStop(2048);
if (RemoteObject.solveBoolean("=",programveri.mostCurrent._edittextsaniye4.runMethod(true,"getText").runMethod(true,"length"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 1901;BA.debugLine="saniye4 = Old";
Debug.ShouldStop(4096);
programveri._saniye4 = BA.numberCast(int.class, _old);
 }else {
 BA.debugLineNum = 1903;BA.debugLine="saniye4 = New";
Debug.ShouldStop(16384);
programveri._saniye4 = BA.numberCast(int.class, _new);
 };
 BA.debugLineNum = 1905;BA.debugLine="End Sub";
Debug.ShouldStop(65536);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _edittextsaniye5_textchanged(RemoteObject _old,RemoteObject _new) throws Exception{
try {
		Debug.PushSubsStack("EditTextSaniye5_TextChanged (programveri) ","programveri",12,programveri.mostCurrent.activityBA,programveri.mostCurrent,1931);
if (RapidSub.canDelegate("edittextsaniye5_textchanged")) { return b4a.example3.programveri.remoteMe.runUserSub(false, "programveri","edittextsaniye5_textchanged", _old, _new);}
Debug.locals.put("Old", _old);
Debug.locals.put("New", _new);
 BA.debugLineNum = 1931;BA.debugLine="Sub EditTextSaniye5_TextChanged (Old As String, Ne";
Debug.ShouldStop(1024);
 BA.debugLineNum = 1932;BA.debugLine="If EditTextSaniye5.Text.Length == 0 Then";
Debug.ShouldStop(2048);
if (RemoteObject.solveBoolean("=",programveri.mostCurrent._edittextsaniye5.runMethod(true,"getText").runMethod(true,"length"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 1933;BA.debugLine="saniye5 = Old";
Debug.ShouldStop(4096);
programveri._saniye5 = BA.numberCast(int.class, _old);
 }else {
 BA.debugLineNum = 1935;BA.debugLine="saniye5 = New";
Debug.ShouldStop(16384);
programveri._saniye5 = BA.numberCast(int.class, _new);
 };
 BA.debugLineNum = 1937;BA.debugLine="End Sub";
Debug.ShouldStop(65536);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _edittextsaniye6_textchanged(RemoteObject _old,RemoteObject _new) throws Exception{
try {
		Debug.PushSubsStack("EditTextSaniye6_TextChanged (programveri) ","programveri",12,programveri.mostCurrent.activityBA,programveri.mostCurrent,1963);
if (RapidSub.canDelegate("edittextsaniye6_textchanged")) { return b4a.example3.programveri.remoteMe.runUserSub(false, "programveri","edittextsaniye6_textchanged", _old, _new);}
Debug.locals.put("Old", _old);
Debug.locals.put("New", _new);
 BA.debugLineNum = 1963;BA.debugLine="Sub EditTextSaniye6_TextChanged (Old As String, Ne";
Debug.ShouldStop(1024);
 BA.debugLineNum = 1964;BA.debugLine="If EditTextSaniye6.Text.Length == 0 Then";
Debug.ShouldStop(2048);
if (RemoteObject.solveBoolean("=",programveri.mostCurrent._edittextsaniye6.runMethod(true,"getText").runMethod(true,"length"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 1965;BA.debugLine="saniye6 = Old";
Debug.ShouldStop(4096);
programveri._saniye6 = BA.numberCast(int.class, _old);
 }else {
 BA.debugLineNum = 1967;BA.debugLine="saniye6 = New";
Debug.ShouldStop(16384);
programveri._saniye6 = BA.numberCast(int.class, _new);
 };
 BA.debugLineNum = 1969;BA.debugLine="End Sub";
Debug.ShouldStop(65536);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _edittextsaniye7_textchanged(RemoteObject _old,RemoteObject _new) throws Exception{
try {
		Debug.PushSubsStack("EditTextSaniye7_TextChanged (programveri) ","programveri",12,programveri.mostCurrent.activityBA,programveri.mostCurrent,1995);
if (RapidSub.canDelegate("edittextsaniye7_textchanged")) { return b4a.example3.programveri.remoteMe.runUserSub(false, "programveri","edittextsaniye7_textchanged", _old, _new);}
Debug.locals.put("Old", _old);
Debug.locals.put("New", _new);
 BA.debugLineNum = 1995;BA.debugLine="Sub EditTextSaniye7_TextChanged (Old As String, Ne";
Debug.ShouldStop(1024);
 BA.debugLineNum = 1996;BA.debugLine="If EditTextSaniye7.Text.Length == 0 Then";
Debug.ShouldStop(2048);
if (RemoteObject.solveBoolean("=",programveri.mostCurrent._edittextsaniye7.runMethod(true,"getText").runMethod(true,"length"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 1997;BA.debugLine="saniye7 = Old";
Debug.ShouldStop(4096);
programveri._saniye7 = BA.numberCast(int.class, _old);
 }else {
 BA.debugLineNum = 1999;BA.debugLine="saniye7 = New";
Debug.ShouldStop(16384);
programveri._saniye7 = BA.numberCast(int.class, _new);
 };
 BA.debugLineNum = 2001;BA.debugLine="End Sub";
Debug.ShouldStop(65536);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _edittextsaniye8_textchanged(RemoteObject _old,RemoteObject _new) throws Exception{
try {
		Debug.PushSubsStack("EditTextSaniye8_TextChanged (programveri) ","programveri",12,programveri.mostCurrent.activityBA,programveri.mostCurrent,2027);
if (RapidSub.canDelegate("edittextsaniye8_textchanged")) { return b4a.example3.programveri.remoteMe.runUserSub(false, "programveri","edittextsaniye8_textchanged", _old, _new);}
Debug.locals.put("Old", _old);
Debug.locals.put("New", _new);
 BA.debugLineNum = 2027;BA.debugLine="Sub EditTextSaniye8_TextChanged (Old As String, Ne";
Debug.ShouldStop(1024);
 BA.debugLineNum = 2028;BA.debugLine="If EditTextSaniye8.Text.Length == 0 Then";
Debug.ShouldStop(2048);
if (RemoteObject.solveBoolean("=",programveri.mostCurrent._edittextsaniye8.runMethod(true,"getText").runMethod(true,"length"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 2029;BA.debugLine="saniye8 = Old";
Debug.ShouldStop(4096);
programveri._saniye8 = BA.numberCast(int.class, _old);
 }else {
 BA.debugLineNum = 2031;BA.debugLine="saniye8 = New";
Debug.ShouldStop(16384);
programveri._saniye8 = BA.numberCast(int.class, _new);
 };
 BA.debugLineNum = 2033;BA.debugLine="End Sub";
Debug.ShouldStop(65536);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _edittextsaniye9_textchanged(RemoteObject _old,RemoteObject _new) throws Exception{
try {
		Debug.PushSubsStack("EditTextSaniye9_TextChanged (programveri) ","programveri",12,programveri.mostCurrent.activityBA,programveri.mostCurrent,2059);
if (RapidSub.canDelegate("edittextsaniye9_textchanged")) { return b4a.example3.programveri.remoteMe.runUserSub(false, "programveri","edittextsaniye9_textchanged", _old, _new);}
Debug.locals.put("Old", _old);
Debug.locals.put("New", _new);
 BA.debugLineNum = 2059;BA.debugLine="Sub EditTextSaniye9_TextChanged (Old As String, Ne";
Debug.ShouldStop(1024);
 BA.debugLineNum = 2060;BA.debugLine="If EditTextSaniye9.Text.Length == 0 Then";
Debug.ShouldStop(2048);
if (RemoteObject.solveBoolean("=",programveri.mostCurrent._edittextsaniye9.runMethod(true,"getText").runMethod(true,"length"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 2061;BA.debugLine="saniye9 = Old";
Debug.ShouldStop(4096);
programveri._saniye9 = BA.numberCast(int.class, _old);
 }else {
 BA.debugLineNum = 2063;BA.debugLine="saniye9 = New";
Debug.ShouldStop(16384);
programveri._saniye9 = BA.numberCast(int.class, _new);
 };
 BA.debugLineNum = 2065;BA.debugLine="End Sub";
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
 //BA.debugLineNum = 12;BA.debugLine="Sub Globals";
 //BA.debugLineNum = 16;BA.debugLine="Private ButtonOK As Button";
programveri.mostCurrent._buttonok = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 17;BA.debugLine="Private ScrollView1 As ScrollView";
programveri.mostCurrent._scrollview1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.ScrollViewWrapper");
 //BA.debugLineNum = 19;BA.debugLine="Dim ProgramID As Int";
programveri._programid = RemoteObject.createImmutable(0);
 //BA.debugLineNum = 20;BA.debugLine="Dim rs As ResultSet";
programveri.mostCurrent._rs = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL.ResultSetWrapper");
 //BA.debugLineNum = 22;BA.debugLine="Dim secilenTarih As String";
programveri.mostCurrent._secilentarih = RemoteObject.createImmutable("");
 //BA.debugLineNum = 23;BA.debugLine="Dim secilenSaat As String";
programveri.mostCurrent._secilensaat = RemoteObject.createImmutable("");
 //BA.debugLineNum = 25;BA.debugLine="Dim koniMesafesi1, koniMesafesi2 ,koniMesafesi3,";
programveri._konimesafesi1 = RemoteObject.createImmutable(0f);
programveri._konimesafesi2 = RemoteObject.createImmutable(0f);
programveri._konimesafesi3 = RemoteObject.createImmutable(0f);
programveri._konimesafesi4 = RemoteObject.createImmutable(0f);
programveri._konimesafesi5 = RemoteObject.createImmutable(0f);
programveri._konimesafesi6 = RemoteObject.createImmutable(0f);
programveri._konimesafesi7 = RemoteObject.createImmutable(0f);
programveri._konimesafesi8 = RemoteObject.createImmutable(0f);
programveri._konimesafesi9 = RemoteObject.createImmutable(0f);
programveri._konimesafesi10 = RemoteObject.createImmutable(0f);
programveri._konimesafesi11 = RemoteObject.createImmutable(0f);
programveri._konimesafesi12 = RemoteObject.createImmutable(0f);
programveri._konimesafesi13 = RemoteObject.createImmutable(0f);
programveri._konimesafesi14 = RemoteObject.createImmutable(0f);
programveri._konimesafesi15 = RemoteObject.createImmutable(0f);
programveri._konimesafesi16 = RemoteObject.createImmutable(0f);
programveri._konimesafesi17 = RemoteObject.createImmutable(0f);
programveri._konimesafesi18 = RemoteObject.createImmutable(0f);
programveri._konimesafesi19 = RemoteObject.createImmutable(0f);
programveri._konimesafesi20 = RemoteObject.createImmutable(0f);
programveri._konimesafesi21 = RemoteObject.createImmutable(0f);
programveri._konimesafesi22 = RemoteObject.createImmutable(0f);
programveri._konimesafesi23 = RemoteObject.createImmutable(0f);
programveri._konimesafesi24 = RemoteObject.createImmutable(0f);
programveri._konimesafesi25 = BA.numberCast(float.class, 0.0);
 //BA.debugLineNum = 26;BA.debugLine="Dim hiz1, hiz2, hiz3, hiz4, hiz5, hiz6, hiz7,hiz8";
programveri._hiz1 = RemoteObject.createImmutable(0f);
programveri._hiz2 = RemoteObject.createImmutable(0f);
programveri._hiz3 = RemoteObject.createImmutable(0f);
programveri._hiz4 = RemoteObject.createImmutable(0f);
programveri._hiz5 = RemoteObject.createImmutable(0f);
programveri._hiz6 = RemoteObject.createImmutable(0f);
programveri._hiz7 = RemoteObject.createImmutable(0f);
programveri._hiz8 = RemoteObject.createImmutable(0f);
programveri._hiz9 = RemoteObject.createImmutable(0f);
programveri._hiz10 = RemoteObject.createImmutable(0f);
programveri._hiz11 = RemoteObject.createImmutable(0f);
programveri._hiz12 = RemoteObject.createImmutable(0f);
programveri._hiz13 = RemoteObject.createImmutable(0f);
programveri._hiz14 = RemoteObject.createImmutable(0f);
programveri._hiz15 = RemoteObject.createImmutable(0f);
programveri._hiz16 = RemoteObject.createImmutable(0f);
programveri._hiz17 = RemoteObject.createImmutable(0f);
programveri._hiz18 = RemoteObject.createImmutable(0f);
programveri._hiz19 = RemoteObject.createImmutable(0f);
programveri._hiz20 = RemoteObject.createImmutable(0f);
programveri._hiz21 = RemoteObject.createImmutable(0f);
programveri._hiz22 = RemoteObject.createImmutable(0f);
programveri._hiz23 = RemoteObject.createImmutable(0f);
programveri._hiz24 = RemoteObject.createImmutable(0f);
programveri._hiz25 = BA.numberCast(float.class, 0.0);
 //BA.debugLineNum = 27;BA.debugLine="Dim dakika1, dakika2,dakika3, dakika4, dakika5, d";
programveri._dakika1 = RemoteObject.createImmutable(0);
programveri._dakika2 = RemoteObject.createImmutable(0);
programveri._dakika3 = RemoteObject.createImmutable(0);
programveri._dakika4 = RemoteObject.createImmutable(0);
programveri._dakika5 = RemoteObject.createImmutable(0);
programveri._dakika6 = RemoteObject.createImmutable(0);
programveri._dakika7 = RemoteObject.createImmutable(0);
programveri._dakika8 = RemoteObject.createImmutable(0);
programveri._dakika9 = RemoteObject.createImmutable(0);
programveri._dakika10 = RemoteObject.createImmutable(0);
programveri._dakika11 = RemoteObject.createImmutable(0);
programveri._dakika12 = RemoteObject.createImmutable(0);
programveri._dakika13 = RemoteObject.createImmutable(0);
programveri._dakika14 = RemoteObject.createImmutable(0);
programveri._dakika15 = RemoteObject.createImmutable(0);
programveri._dakika16 = RemoteObject.createImmutable(0);
programveri._dakika17 = RemoteObject.createImmutable(0);
programveri._dakika18 = RemoteObject.createImmutable(0);
programveri._dakika19 = RemoteObject.createImmutable(0);
programveri._dakika20 = RemoteObject.createImmutable(0);
programveri._dakika21 = RemoteObject.createImmutable(0);
programveri._dakika22 = RemoteObject.createImmutable(0);
programveri._dakika23 = RemoteObject.createImmutable(0);
programveri._dakika24 = RemoteObject.createImmutable(0);
programveri._dakika25 = BA.numberCast(int.class, 0);
 //BA.debugLineNum = 28;BA.debugLine="Dim saniye1 ,saniye2 , saniye3 , saniye4 , saniye";
programveri._saniye1 = RemoteObject.createImmutable(0);
programveri._saniye2 = RemoteObject.createImmutable(0);
programveri._saniye3 = RemoteObject.createImmutable(0);
programveri._saniye4 = RemoteObject.createImmutable(0);
programveri._saniye5 = RemoteObject.createImmutable(0);
programveri._saniye6 = RemoteObject.createImmutable(0);
programveri._saniye7 = RemoteObject.createImmutable(0);
programveri._saniye8 = RemoteObject.createImmutable(0);
programveri._saniye9 = RemoteObject.createImmutable(0);
programveri._saniye10 = RemoteObject.createImmutable(0);
programveri._saniye11 = RemoteObject.createImmutable(0);
programveri._saniye12 = RemoteObject.createImmutable(0);
programveri._saniye13 = RemoteObject.createImmutable(0);
programveri._saniye14 = RemoteObject.createImmutable(0);
programveri._saniye15 = RemoteObject.createImmutable(0);
programveri._saniye16 = RemoteObject.createImmutable(0);
programveri._saniye17 = RemoteObject.createImmutable(0);
programveri._saniye18 = RemoteObject.createImmutable(0);
programveri._saniye19 = RemoteObject.createImmutable(0);
programveri._saniye20 = RemoteObject.createImmutable(0);
programveri._saniye21 = RemoteObject.createImmutable(0);
programveri._saniye22 = RemoteObject.createImmutable(0);
programveri._saniye23 = RemoteObject.createImmutable(0);
programveri._saniye24 = RemoteObject.createImmutable(0);
programveri._saniye25 = BA.numberCast(int.class, 0);
 //BA.debugLineNum = 31;BA.debugLine="Private LabelSeviyeIsmi1 As Label";
programveri.mostCurrent._labelseviyeismi1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 32;BA.debugLine="Private LabelSeviyeIsmi2 As Label";
programveri.mostCurrent._labelseviyeismi2 = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 33;BA.debugLine="Private LabelSeviyeIsmi3 As Label";
programveri.mostCurrent._labelseviyeismi3 = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 34;BA.debugLine="Private LabelSeviyeIsmi4 As Label";
programveri.mostCurrent._labelseviyeismi4 = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 35;BA.debugLine="Private LabelSeviyeIsmi5 As Label";
programveri.mostCurrent._labelseviyeismi5 = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 36;BA.debugLine="Private LabelSeviyeIsmi6 As Label";
programveri.mostCurrent._labelseviyeismi6 = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 37;BA.debugLine="Private LabelSeviyeIsmi7 As Label";
programveri.mostCurrent._labelseviyeismi7 = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 38;BA.debugLine="Private LabelSeviyeIsmi8 As Label";
programveri.mostCurrent._labelseviyeismi8 = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 39;BA.debugLine="Private LabelSeviyeIsmi9 As Label";
programveri.mostCurrent._labelseviyeismi9 = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 40;BA.debugLine="Private LabelSeviyeIsmi10 As Label";
programveri.mostCurrent._labelseviyeismi10 = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 41;BA.debugLine="Private LabelSeviyeIsmi11 As Label";
programveri.mostCurrent._labelseviyeismi11 = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 42;BA.debugLine="Private LabelSeviyeIsmi12 As Label";
programveri.mostCurrent._labelseviyeismi12 = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 43;BA.debugLine="Private LabelSeviyeIsmi13 As Label";
programveri.mostCurrent._labelseviyeismi13 = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 44;BA.debugLine="Private LabelSeviyeIsmi14 As Label";
programveri.mostCurrent._labelseviyeismi14 = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 45;BA.debugLine="Private LabelSeviyeIsmi15 As Label";
programveri.mostCurrent._labelseviyeismi15 = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 46;BA.debugLine="Private LabelSeviyeIsmi16 As Label";
programveri.mostCurrent._labelseviyeismi16 = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 47;BA.debugLine="Private LabelSeviyeIsmi17 As Label";
programveri.mostCurrent._labelseviyeismi17 = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 48;BA.debugLine="Private LabelSeviyeIsmi18 As Label";
programveri.mostCurrent._labelseviyeismi18 = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 49;BA.debugLine="Private LabelSeviyeIsmi19 As Label";
programveri.mostCurrent._labelseviyeismi19 = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 50;BA.debugLine="Private LabelSeviyeIsmi20 As Label";
programveri.mostCurrent._labelseviyeismi20 = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 51;BA.debugLine="Private LabelSeviyeIsmi21 As Label";
programveri.mostCurrent._labelseviyeismi21 = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 52;BA.debugLine="Private LabelSeviyeIsmi22 As Label";
programveri.mostCurrent._labelseviyeismi22 = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 53;BA.debugLine="Private LabelSeviyeIsmi23 As Label";
programveri.mostCurrent._labelseviyeismi23 = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 54;BA.debugLine="Private LabelSeviyeIsmi24 As Label";
programveri.mostCurrent._labelseviyeismi24 = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 55;BA.debugLine="Private LabelSeviyeIsmi25 As Label";
programveri.mostCurrent._labelseviyeismi25 = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 57;BA.debugLine="Private LabelHiz1 As Label";
programveri.mostCurrent._labelhiz1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 58;BA.debugLine="Private LabelHiz2 As Label";
programveri.mostCurrent._labelhiz2 = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 59;BA.debugLine="Private LabelHiz3 As Label";
programveri.mostCurrent._labelhiz3 = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 60;BA.debugLine="Private LabelHiz4 As Label";
programveri.mostCurrent._labelhiz4 = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 61;BA.debugLine="Private LabelHiz5 As Label";
programveri.mostCurrent._labelhiz5 = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 62;BA.debugLine="Private LabelHiz6 As Label";
programveri.mostCurrent._labelhiz6 = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 63;BA.debugLine="Private LabelHiz7 As Label";
programveri.mostCurrent._labelhiz7 = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 64;BA.debugLine="Private LabelHiz8 As Label";
programveri.mostCurrent._labelhiz8 = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 65;BA.debugLine="Private LabelHiz9 As Label";
programveri.mostCurrent._labelhiz9 = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 66;BA.debugLine="Private LabelHiz10 As Label";
programveri.mostCurrent._labelhiz10 = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 67;BA.debugLine="Private LabelHiz11 As Label";
programveri.mostCurrent._labelhiz11 = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 68;BA.debugLine="Private LabelHiz12 As Label";
programveri.mostCurrent._labelhiz12 = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 69;BA.debugLine="Private LabelHiz13 As Label";
programveri.mostCurrent._labelhiz13 = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 70;BA.debugLine="Private LabelHiz14 As Label";
programveri.mostCurrent._labelhiz14 = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 71;BA.debugLine="Private LabelHiz15 As Label";
programveri.mostCurrent._labelhiz15 = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 72;BA.debugLine="Private LabelHiz16 As Label";
programveri.mostCurrent._labelhiz16 = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 73;BA.debugLine="Private LabelHiz17 As Label";
programveri.mostCurrent._labelhiz17 = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 74;BA.debugLine="Private LabelHiz18 As Label";
programveri.mostCurrent._labelhiz18 = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 75;BA.debugLine="Private LabelHiz19 As Label";
programveri.mostCurrent._labelhiz19 = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 76;BA.debugLine="Private LabelHiz20 As Label";
programveri.mostCurrent._labelhiz20 = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 77;BA.debugLine="Private LabelHiz21 As Label";
programveri.mostCurrent._labelhiz21 = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 78;BA.debugLine="Private LabelHiz22 As Label";
programveri.mostCurrent._labelhiz22 = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 79;BA.debugLine="Private LabelHiz23 As Label";
programveri.mostCurrent._labelhiz23 = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 80;BA.debugLine="Private LabelHiz24 As Label";
programveri.mostCurrent._labelhiz24 = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 81;BA.debugLine="Private LabelHiz25 As Label";
programveri.mostCurrent._labelhiz25 = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 83;BA.debugLine="Private LabelDakika1 As Label";
programveri.mostCurrent._labeldakika1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 84;BA.debugLine="Private LabelDakika2 As Label";
programveri.mostCurrent._labeldakika2 = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 85;BA.debugLine="Private LabelDakika3 As Label";
programveri.mostCurrent._labeldakika3 = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 86;BA.debugLine="Private LabelDakika4 As Label";
programveri.mostCurrent._labeldakika4 = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 87;BA.debugLine="Private LabelDakika5 As Label";
programveri.mostCurrent._labeldakika5 = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 88;BA.debugLine="Private LabelDakika6 As Label";
programveri.mostCurrent._labeldakika6 = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 89;BA.debugLine="Private LabelDakika7 As Label";
programveri.mostCurrent._labeldakika7 = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 90;BA.debugLine="Private LabelDakika8 As Label";
programveri.mostCurrent._labeldakika8 = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 91;BA.debugLine="Private LabelDakika9 As Label";
programveri.mostCurrent._labeldakika9 = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 92;BA.debugLine="Private LabelDakika10 As Label";
programveri.mostCurrent._labeldakika10 = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 93;BA.debugLine="Private LabelDakika11 As Label";
programveri.mostCurrent._labeldakika11 = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 94;BA.debugLine="Private LabelDakika12 As Label";
programveri.mostCurrent._labeldakika12 = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 95;BA.debugLine="Private LabelDakika13 As Label";
programveri.mostCurrent._labeldakika13 = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 96;BA.debugLine="Private LabelDakika14 As Label";
programveri.mostCurrent._labeldakika14 = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 97;BA.debugLine="Private LabelDakika15 As Label";
programveri.mostCurrent._labeldakika15 = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 98;BA.debugLine="Private LabelDakika16 As Label";
programveri.mostCurrent._labeldakika16 = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 99;BA.debugLine="Private LabelDakika17 As Label";
programveri.mostCurrent._labeldakika17 = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 100;BA.debugLine="Private LabelDakika18 As Label";
programveri.mostCurrent._labeldakika18 = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 101;BA.debugLine="Private LabelDakika19 As Label";
programveri.mostCurrent._labeldakika19 = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 102;BA.debugLine="Private LabelDakika20 As Label";
programveri.mostCurrent._labeldakika20 = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 103;BA.debugLine="Private LabelDakika21 As Label";
programveri.mostCurrent._labeldakika21 = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 104;BA.debugLine="Private LabelDakika22 As Label";
programveri.mostCurrent._labeldakika22 = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 105;BA.debugLine="Private LabelDakika23 As Label";
programveri.mostCurrent._labeldakika23 = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 106;BA.debugLine="Private LabelDakika24 As Label";
programveri.mostCurrent._labeldakika24 = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 107;BA.debugLine="Private LabelDakika25 As Label";
programveri.mostCurrent._labeldakika25 = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 110;BA.debugLine="Private LabelSaniye1 As Label";
programveri.mostCurrent._labelsaniye1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 111;BA.debugLine="Private LabelSaniye2 As Label";
programveri.mostCurrent._labelsaniye2 = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 112;BA.debugLine="Private LabelSaniye3 As Label";
programveri.mostCurrent._labelsaniye3 = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 113;BA.debugLine="Private LabelSaniye4 As Label";
programveri.mostCurrent._labelsaniye4 = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 114;BA.debugLine="Private LabelSaniye5 As Label";
programveri.mostCurrent._labelsaniye5 = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 115;BA.debugLine="Private LabelSaniye6 As Label";
programveri.mostCurrent._labelsaniye6 = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 116;BA.debugLine="Private LabelSaniye7 As Label";
programveri.mostCurrent._labelsaniye7 = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 117;BA.debugLine="Private LabelSaniye8 As Label";
programveri.mostCurrent._labelsaniye8 = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 118;BA.debugLine="Private LabelSaniye9 As Label";
programveri.mostCurrent._labelsaniye9 = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 119;BA.debugLine="Private LabelSaniye10 As Label";
programveri.mostCurrent._labelsaniye10 = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 120;BA.debugLine="Private LabelSaniye11 As Label";
programveri.mostCurrent._labelsaniye11 = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 121;BA.debugLine="Private LabelSaniye12 As Label";
programveri.mostCurrent._labelsaniye12 = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 122;BA.debugLine="Private LabelSaniye13 As Label";
programveri.mostCurrent._labelsaniye13 = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 123;BA.debugLine="Private LabelSaniye14 As Label";
programveri.mostCurrent._labelsaniye14 = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 124;BA.debugLine="Private LabelSaniye15 As Label";
programveri.mostCurrent._labelsaniye15 = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 125;BA.debugLine="Private LabelSaniye16 As Label";
programveri.mostCurrent._labelsaniye16 = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 126;BA.debugLine="Private LabelSaniye17 As Label";
programveri.mostCurrent._labelsaniye17 = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 127;BA.debugLine="Private LabelSaniye18 As Label";
programveri.mostCurrent._labelsaniye18 = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 128;BA.debugLine="Private LabelSaniye19 As Label";
programveri.mostCurrent._labelsaniye19 = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 129;BA.debugLine="Private LabelSaniye20 As Label";
programveri.mostCurrent._labelsaniye20 = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 130;BA.debugLine="Private LabelSaniye21 As Label";
programveri.mostCurrent._labelsaniye21 = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 131;BA.debugLine="Private LabelSaniye22 As Label";
programveri.mostCurrent._labelsaniye22 = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 132;BA.debugLine="Private LabelSaniye23 As Label";
programveri.mostCurrent._labelsaniye23 = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 133;BA.debugLine="Private LabelSaniye24 As Label";
programveri.mostCurrent._labelsaniye24 = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 134;BA.debugLine="Private LabelSaniye25 As Label";
programveri.mostCurrent._labelsaniye25 = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 137;BA.debugLine="Private LabelKoniMesafesi1 As Label";
programveri.mostCurrent._labelkonimesafesi1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 138;BA.debugLine="Private LabelKoniMesafesi2 As Label";
programveri.mostCurrent._labelkonimesafesi2 = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 139;BA.debugLine="Private LabelKoniMesafesi3 As Label";
programveri.mostCurrent._labelkonimesafesi3 = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 140;BA.debugLine="Private LabelKoniMesafesi4 As Label";
programveri.mostCurrent._labelkonimesafesi4 = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 141;BA.debugLine="Private LabelKoniMesafesi5 As Label";
programveri.mostCurrent._labelkonimesafesi5 = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 142;BA.debugLine="Private LabelKoniMesafesi6 As Label";
programveri.mostCurrent._labelkonimesafesi6 = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 143;BA.debugLine="Private LabelKoniMesafesi7 As Label";
programveri.mostCurrent._labelkonimesafesi7 = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 144;BA.debugLine="Private LabelKoniMesafesi8 As Label";
programveri.mostCurrent._labelkonimesafesi8 = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 145;BA.debugLine="Private LabelKoniMesafesi9 As Label";
programveri.mostCurrent._labelkonimesafesi9 = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 146;BA.debugLine="Private LabelKoniMesafesi10 As Label";
programveri.mostCurrent._labelkonimesafesi10 = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 147;BA.debugLine="Private LabelKoniMesafesi11 As Label";
programveri.mostCurrent._labelkonimesafesi11 = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 148;BA.debugLine="Private LabelKoniMesafesi12 As Label";
programveri.mostCurrent._labelkonimesafesi12 = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 149;BA.debugLine="Private LabelKoniMesafesi13 As Label";
programveri.mostCurrent._labelkonimesafesi13 = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 150;BA.debugLine="Private LabelKoniMesafesi14 As Label";
programveri.mostCurrent._labelkonimesafesi14 = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 151;BA.debugLine="Private LabelKoniMesafesi15 As Label";
programveri.mostCurrent._labelkonimesafesi15 = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 152;BA.debugLine="Private LabelKoniMesafesi16 As Label";
programveri.mostCurrent._labelkonimesafesi16 = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 153;BA.debugLine="Private LabelKoniMesafesi17 As Label";
programveri.mostCurrent._labelkonimesafesi17 = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 154;BA.debugLine="Private LabelKoniMesafesi18 As Label";
programveri.mostCurrent._labelkonimesafesi18 = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 155;BA.debugLine="Private LabelKoniMesafesi19 As Label";
programveri.mostCurrent._labelkonimesafesi19 = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 156;BA.debugLine="Private LabelKoniMesafesi20 As Label";
programveri.mostCurrent._labelkonimesafesi20 = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 157;BA.debugLine="Private LabelKoniMesafesi21 As Label";
programveri.mostCurrent._labelkonimesafesi21 = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 158;BA.debugLine="Private LabelKoniMesafesi22 As Label";
programveri.mostCurrent._labelkonimesafesi22 = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 159;BA.debugLine="Private LabelKoniMesafesi23 As Label";
programveri.mostCurrent._labelkonimesafesi23 = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 160;BA.debugLine="Private LabelKoniMesafesi24 As Label";
programveri.mostCurrent._labelkonimesafesi24 = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 161;BA.debugLine="Private LabelKoniMesafesi25 As Label";
programveri.mostCurrent._labelkonimesafesi25 = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 167;BA.debugLine="Private EditTextKoniMesafesi1 As EditText";
programveri.mostCurrent._edittextkonimesafesi1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
 //BA.debugLineNum = 168;BA.debugLine="Private EditTextKoniMesafesi2 As EditText";
programveri.mostCurrent._edittextkonimesafesi2 = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
 //BA.debugLineNum = 169;BA.debugLine="Private EditTextKoniMesafesi3 As EditText";
programveri.mostCurrent._edittextkonimesafesi3 = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
 //BA.debugLineNum = 170;BA.debugLine="Private EditTextKoniMesafesi4 As EditText";
programveri.mostCurrent._edittextkonimesafesi4 = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
 //BA.debugLineNum = 171;BA.debugLine="Private EditTextKoniMesafesi5 As EditText";
programveri.mostCurrent._edittextkonimesafesi5 = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
 //BA.debugLineNum = 172;BA.debugLine="Private EditTextKoniMesafesi6 As EditText";
programveri.mostCurrent._edittextkonimesafesi6 = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
 //BA.debugLineNum = 173;BA.debugLine="Private EditTextKoniMesafesi7 As EditText";
programveri.mostCurrent._edittextkonimesafesi7 = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
 //BA.debugLineNum = 174;BA.debugLine="Private EditTextKoniMesafesi8 As EditText";
programveri.mostCurrent._edittextkonimesafesi8 = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
 //BA.debugLineNum = 175;BA.debugLine="Private EditTextKoniMesafesi9 As EditText";
programveri.mostCurrent._edittextkonimesafesi9 = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
 //BA.debugLineNum = 176;BA.debugLine="Private EditTextKoniMesafesi10 As EditText";
programveri.mostCurrent._edittextkonimesafesi10 = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
 //BA.debugLineNum = 177;BA.debugLine="Private EditTextKoniMesafesi11 As EditText";
programveri.mostCurrent._edittextkonimesafesi11 = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
 //BA.debugLineNum = 178;BA.debugLine="Private EditTextKoniMesafesi12 As EditText";
programveri.mostCurrent._edittextkonimesafesi12 = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
 //BA.debugLineNum = 179;BA.debugLine="Private EditTextKoniMesafesi13 As EditText";
programveri.mostCurrent._edittextkonimesafesi13 = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
 //BA.debugLineNum = 180;BA.debugLine="Private EditTextKoniMesafesi14 As EditText";
programveri.mostCurrent._edittextkonimesafesi14 = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
 //BA.debugLineNum = 181;BA.debugLine="Private EditTextKoniMesafesi15 As EditText";
programveri.mostCurrent._edittextkonimesafesi15 = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
 //BA.debugLineNum = 182;BA.debugLine="Private EditTextKoniMesafesi16 As EditText";
programveri.mostCurrent._edittextkonimesafesi16 = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
 //BA.debugLineNum = 183;BA.debugLine="Private EditTextKoniMesafesi17 As EditText";
programveri.mostCurrent._edittextkonimesafesi17 = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
 //BA.debugLineNum = 184;BA.debugLine="Private EditTextKoniMesafesi18 As EditText";
programveri.mostCurrent._edittextkonimesafesi18 = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
 //BA.debugLineNum = 185;BA.debugLine="Private EditTextKoniMesafesi19 As EditText";
programveri.mostCurrent._edittextkonimesafesi19 = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
 //BA.debugLineNum = 186;BA.debugLine="Private EditTextKoniMesafesi20 As EditText";
programveri.mostCurrent._edittextkonimesafesi20 = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
 //BA.debugLineNum = 187;BA.debugLine="Private EditTextKoniMesafesi21 As EditText";
programveri.mostCurrent._edittextkonimesafesi21 = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
 //BA.debugLineNum = 188;BA.debugLine="Private EditTextKoniMesafesi22 As EditText";
programveri.mostCurrent._edittextkonimesafesi22 = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
 //BA.debugLineNum = 189;BA.debugLine="Private EditTextKoniMesafesi23 As EditText";
programveri.mostCurrent._edittextkonimesafesi23 = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
 //BA.debugLineNum = 190;BA.debugLine="Private EditTextKoniMesafesi24 As EditText";
programveri.mostCurrent._edittextkonimesafesi24 = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
 //BA.debugLineNum = 191;BA.debugLine="Private EditTextKoniMesafesi25 As EditText";
programveri.mostCurrent._edittextkonimesafesi25 = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
 //BA.debugLineNum = 194;BA.debugLine="Private EditTextHiz1 As EditText";
programveri.mostCurrent._edittexthiz1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
 //BA.debugLineNum = 195;BA.debugLine="Private EditTextHiz2 As EditText";
programveri.mostCurrent._edittexthiz2 = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
 //BA.debugLineNum = 196;BA.debugLine="Private EditTextHiz3 As EditText";
programveri.mostCurrent._edittexthiz3 = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
 //BA.debugLineNum = 197;BA.debugLine="Private EditTextHiz4 As EditText";
programveri.mostCurrent._edittexthiz4 = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
 //BA.debugLineNum = 198;BA.debugLine="Private EditTextHiz5 As EditText";
programveri.mostCurrent._edittexthiz5 = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
 //BA.debugLineNum = 199;BA.debugLine="Private EditTextHiz6 As EditText";
programveri.mostCurrent._edittexthiz6 = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
 //BA.debugLineNum = 200;BA.debugLine="Private EditTextHiz7 As EditText";
programveri.mostCurrent._edittexthiz7 = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
 //BA.debugLineNum = 201;BA.debugLine="Private EditTextHiz8 As EditText";
programveri.mostCurrent._edittexthiz8 = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
 //BA.debugLineNum = 202;BA.debugLine="Private EditTextHiz9 As EditText";
programveri.mostCurrent._edittexthiz9 = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
 //BA.debugLineNum = 203;BA.debugLine="Private EditTextHiz10 As EditText";
programveri.mostCurrent._edittexthiz10 = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
 //BA.debugLineNum = 204;BA.debugLine="Private EditTextHiz11 As EditText";
programveri.mostCurrent._edittexthiz11 = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
 //BA.debugLineNum = 205;BA.debugLine="Private EditTextHiz12 As EditText";
programveri.mostCurrent._edittexthiz12 = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
 //BA.debugLineNum = 206;BA.debugLine="Private EditTextHiz13 As EditText";
programveri.mostCurrent._edittexthiz13 = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
 //BA.debugLineNum = 207;BA.debugLine="Private EditTextHiz14 As EditText";
programveri.mostCurrent._edittexthiz14 = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
 //BA.debugLineNum = 208;BA.debugLine="Private EditTextHiz15 As EditText";
programveri.mostCurrent._edittexthiz15 = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
 //BA.debugLineNum = 209;BA.debugLine="Private EditTextHiz16 As EditText";
programveri.mostCurrent._edittexthiz16 = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
 //BA.debugLineNum = 210;BA.debugLine="Private EditTextHiz17 As EditText";
programveri.mostCurrent._edittexthiz17 = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
 //BA.debugLineNum = 211;BA.debugLine="Private EditTextHiz18 As EditText";
programveri.mostCurrent._edittexthiz18 = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
 //BA.debugLineNum = 212;BA.debugLine="Private EditTextHiz19 As EditText";
programveri.mostCurrent._edittexthiz19 = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
 //BA.debugLineNum = 213;BA.debugLine="Private EditTextHiz20 As EditText";
programveri.mostCurrent._edittexthiz20 = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
 //BA.debugLineNum = 214;BA.debugLine="Private EditTextHiz21 As EditText";
programveri.mostCurrent._edittexthiz21 = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
 //BA.debugLineNum = 215;BA.debugLine="Private EditTextHiz22 As EditText";
programveri.mostCurrent._edittexthiz22 = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
 //BA.debugLineNum = 216;BA.debugLine="Private EditTextHiz23 As EditText";
programveri.mostCurrent._edittexthiz23 = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
 //BA.debugLineNum = 217;BA.debugLine="Private EditTextHiz24 As EditText";
programveri.mostCurrent._edittexthiz24 = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
 //BA.debugLineNum = 218;BA.debugLine="Private EditTextHiz25 As EditText";
programveri.mostCurrent._edittexthiz25 = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
 //BA.debugLineNum = 220;BA.debugLine="Private EditTextDakika1 As EditText";
programveri.mostCurrent._edittextdakika1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
 //BA.debugLineNum = 221;BA.debugLine="Private EditTextDakika2 As EditText";
programveri.mostCurrent._edittextdakika2 = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
 //BA.debugLineNum = 222;BA.debugLine="Private EditTextDakika3 As EditText";
programveri.mostCurrent._edittextdakika3 = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
 //BA.debugLineNum = 223;BA.debugLine="Private EditTextDakika4 As EditText";
programveri.mostCurrent._edittextdakika4 = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
 //BA.debugLineNum = 224;BA.debugLine="Private EditTextDakika5 As EditText";
programveri.mostCurrent._edittextdakika5 = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
 //BA.debugLineNum = 225;BA.debugLine="Private EditTextDakika6 As EditText";
programveri.mostCurrent._edittextdakika6 = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
 //BA.debugLineNum = 226;BA.debugLine="Private EditTextDakika7 As EditText";
programveri.mostCurrent._edittextdakika7 = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
 //BA.debugLineNum = 227;BA.debugLine="Private EditTextDakika8 As EditText";
programveri.mostCurrent._edittextdakika8 = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
 //BA.debugLineNum = 228;BA.debugLine="Private EditTextDakika9 As EditText";
programveri.mostCurrent._edittextdakika9 = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
 //BA.debugLineNum = 229;BA.debugLine="Private EditTextDakika10 As EditText";
programveri.mostCurrent._edittextdakika10 = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
 //BA.debugLineNum = 230;BA.debugLine="Private EditTextDakika11 As EditText";
programveri.mostCurrent._edittextdakika11 = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
 //BA.debugLineNum = 231;BA.debugLine="Private EditTextDakika12 As EditText";
programveri.mostCurrent._edittextdakika12 = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
 //BA.debugLineNum = 232;BA.debugLine="Private EditTextDakika13 As EditText";
programveri.mostCurrent._edittextdakika13 = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
 //BA.debugLineNum = 233;BA.debugLine="Private EditTextDakika14 As EditText";
programveri.mostCurrent._edittextdakika14 = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
 //BA.debugLineNum = 234;BA.debugLine="Private EditTextDakika15 As EditText";
programveri.mostCurrent._edittextdakika15 = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
 //BA.debugLineNum = 235;BA.debugLine="Private EditTextDakika16 As EditText";
programveri.mostCurrent._edittextdakika16 = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
 //BA.debugLineNum = 236;BA.debugLine="Private EditTextDakika17 As EditText";
programveri.mostCurrent._edittextdakika17 = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
 //BA.debugLineNum = 237;BA.debugLine="Private EditTextDakika18 As EditText";
programveri.mostCurrent._edittextdakika18 = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
 //BA.debugLineNum = 238;BA.debugLine="Private EditTextDakika19 As EditText";
programveri.mostCurrent._edittextdakika19 = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
 //BA.debugLineNum = 239;BA.debugLine="Private EditTextDakika20 As EditText";
programveri.mostCurrent._edittextdakika20 = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
 //BA.debugLineNum = 240;BA.debugLine="Private EditTextDakika21 As EditText";
programveri.mostCurrent._edittextdakika21 = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
 //BA.debugLineNum = 241;BA.debugLine="Private EditTextDakika22 As EditText";
programveri.mostCurrent._edittextdakika22 = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
 //BA.debugLineNum = 242;BA.debugLine="Private EditTextDakika23 As EditText";
programveri.mostCurrent._edittextdakika23 = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
 //BA.debugLineNum = 243;BA.debugLine="Private EditTextDakika24 As EditText";
programveri.mostCurrent._edittextdakika24 = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
 //BA.debugLineNum = 244;BA.debugLine="Private EditTextDakika25 As EditText";
programveri.mostCurrent._edittextdakika25 = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
 //BA.debugLineNum = 247;BA.debugLine="Private EditTextSaniye1 As EditText";
programveri.mostCurrent._edittextsaniye1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
 //BA.debugLineNum = 248;BA.debugLine="Private EditTextSaniye2 As EditText";
programveri.mostCurrent._edittextsaniye2 = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
 //BA.debugLineNum = 249;BA.debugLine="Private EditTextSaniye3 As EditText";
programveri.mostCurrent._edittextsaniye3 = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
 //BA.debugLineNum = 250;BA.debugLine="Private EditTextSaniye4 As EditText";
programveri.mostCurrent._edittextsaniye4 = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
 //BA.debugLineNum = 251;BA.debugLine="Private EditTextSaniye5 As EditText";
programveri.mostCurrent._edittextsaniye5 = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
 //BA.debugLineNum = 252;BA.debugLine="Private EditTextSaniye6 As EditText";
programveri.mostCurrent._edittextsaniye6 = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
 //BA.debugLineNum = 253;BA.debugLine="Private EditTextSaniye7 As EditText";
programveri.mostCurrent._edittextsaniye7 = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
 //BA.debugLineNum = 254;BA.debugLine="Private EditTextSaniye8 As EditText";
programveri.mostCurrent._edittextsaniye8 = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
 //BA.debugLineNum = 255;BA.debugLine="Private EditTextSaniye9 As EditText";
programveri.mostCurrent._edittextsaniye9 = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
 //BA.debugLineNum = 256;BA.debugLine="Private EditTextSaniye10 As EditText";
programveri.mostCurrent._edittextsaniye10 = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
 //BA.debugLineNum = 257;BA.debugLine="Private EditTextSaniye11 As EditText";
programveri.mostCurrent._edittextsaniye11 = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
 //BA.debugLineNum = 258;BA.debugLine="Private EditTextSaniye12 As EditText";
programveri.mostCurrent._edittextsaniye12 = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
 //BA.debugLineNum = 259;BA.debugLine="Private EditTextSaniye13 As EditText";
programveri.mostCurrent._edittextsaniye13 = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
 //BA.debugLineNum = 260;BA.debugLine="Private EditTextSaniye14 As EditText";
programveri.mostCurrent._edittextsaniye14 = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
 //BA.debugLineNum = 261;BA.debugLine="Private EditTextSaniye15 As EditText";
programveri.mostCurrent._edittextsaniye15 = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
 //BA.debugLineNum = 262;BA.debugLine="Private EditTextSaniye16 As EditText";
programveri.mostCurrent._edittextsaniye16 = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
 //BA.debugLineNum = 263;BA.debugLine="Private EditTextSaniye17 As EditText";
programveri.mostCurrent._edittextsaniye17 = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
 //BA.debugLineNum = 264;BA.debugLine="Private EditTextSaniye18 As EditText";
programveri.mostCurrent._edittextsaniye18 = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
 //BA.debugLineNum = 265;BA.debugLine="Private EditTextSaniye19 As EditText";
programveri.mostCurrent._edittextsaniye19 = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
 //BA.debugLineNum = 266;BA.debugLine="Private EditTextSaniye20 As EditText";
programveri.mostCurrent._edittextsaniye20 = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
 //BA.debugLineNum = 267;BA.debugLine="Private EditTextSaniye21 As EditText";
programveri.mostCurrent._edittextsaniye21 = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
 //BA.debugLineNum = 268;BA.debugLine="Private EditTextSaniye22 As EditText";
programveri.mostCurrent._edittextsaniye22 = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
 //BA.debugLineNum = 269;BA.debugLine="Private EditTextSaniye23 As EditText";
programveri.mostCurrent._edittextsaniye23 = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
 //BA.debugLineNum = 270;BA.debugLine="Private EditTextSaniye24 As EditText";
programveri.mostCurrent._edittextsaniye24 = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
 //BA.debugLineNum = 271;BA.debugLine="Private EditTextSaniye25 As EditText";
programveri.mostCurrent._edittextsaniye25 = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
 //BA.debugLineNum = 277;BA.debugLine="Private Panel1 As Panel";
programveri.mostCurrent._panel1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 278;BA.debugLine="Private Panel2 As Panel";
programveri.mostCurrent._panel2 = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 279;BA.debugLine="Private Panel3 As Panel";
programveri.mostCurrent._panel3 = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 280;BA.debugLine="Private Panel4 As Panel";
programveri.mostCurrent._panel4 = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 281;BA.debugLine="Private Panel5 As Panel";
programveri.mostCurrent._panel5 = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 282;BA.debugLine="Private Panel6 As Panel";
programveri.mostCurrent._panel6 = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 283;BA.debugLine="Private Panel7 As Panel";
programveri.mostCurrent._panel7 = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 284;BA.debugLine="Private Panel8 As Panel";
programveri.mostCurrent._panel8 = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 285;BA.debugLine="Private Panel9 As Panel";
programveri.mostCurrent._panel9 = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 286;BA.debugLine="Private Panel10 As Panel";
programveri.mostCurrent._panel10 = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 287;BA.debugLine="Private Panel11 As Panel";
programveri.mostCurrent._panel11 = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 288;BA.debugLine="Private Panel12 As Panel";
programveri.mostCurrent._panel12 = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 289;BA.debugLine="Private Panel13 As Panel";
programveri.mostCurrent._panel13 = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 290;BA.debugLine="Private Panel14 As Panel";
programveri.mostCurrent._panel14 = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 291;BA.debugLine="Private Panel15 As Panel";
programveri.mostCurrent._panel15 = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 292;BA.debugLine="Private Panel16 As Panel";
programveri.mostCurrent._panel16 = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 293;BA.debugLine="Private Panel17 As Panel";
programveri.mostCurrent._panel17 = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 294;BA.debugLine="Private Panel18 As Panel";
programveri.mostCurrent._panel18 = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 295;BA.debugLine="Private Panel19 As Panel";
programveri.mostCurrent._panel19 = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 296;BA.debugLine="Private Panel20 As Panel";
programveri.mostCurrent._panel20 = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 297;BA.debugLine="Private Panel21 As Panel";
programveri.mostCurrent._panel21 = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 298;BA.debugLine="Private Panel22 As Panel";
programveri.mostCurrent._panel22 = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 299;BA.debugLine="Private Panel23 As Panel";
programveri.mostCurrent._panel23 = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 300;BA.debugLine="Private Panel24 As Panel";
programveri.mostCurrent._panel24 = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 301;BA.debugLine="Private Panel25 As Panel";
programveri.mostCurrent._panel25 = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 306;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _id() throws Exception{
try {
		Debug.PushSubsStack("ID (programveri) ","programveri",12,programveri.mostCurrent.activityBA,programveri.mostCurrent,1583);
if (RapidSub.canDelegate("id")) { return b4a.example3.programveri.remoteMe.runUserSub(false, "programveri","id");}
RemoteObject _sf = RemoteObject.declareNull("adr.stringfunctions.stringfunctions");
 BA.debugLineNum = 1583;BA.debugLine="Sub ID";
Debug.ShouldStop(16384);
 BA.debugLineNum = 1584;BA.debugLine="Dim sf As StringFunctions";
Debug.ShouldStop(32768);
_sf = RemoteObject.createNew ("adr.stringfunctions.stringfunctions");Debug.locals.put("sf", _sf);
 BA.debugLineNum = 1585;BA.debugLine="sf.initialize";
Debug.ShouldStop(65536);
_sf.runVoidMethod ("_initialize",programveri.processBA);
 BA.debugLineNum = 1587;BA.debugLine="rs= Main.sql.ExecQuery(\"SELECT * FROM Dayaniklili";
Debug.ShouldStop(262144);
programveri.mostCurrent._rs.setObject(programveri.mostCurrent._main._sql /*RemoteObject*/ .runMethod(false,"ExecQuery",(Object)(RemoteObject.createImmutable("SELECT * FROM DayaniklilikTestProgram ORDER BY program_id DESC"))));
 BA.debugLineNum = 1588;BA.debugLine="If rs.RowCount>0 Then";
Debug.ShouldStop(524288);
if (RemoteObject.solveBoolean(">",programveri.mostCurrent._rs.runMethod(true,"getRowCount"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 1589;BA.debugLine="rs.Position=0";
Debug.ShouldStop(1048576);
programveri.mostCurrent._rs.runMethod(true,"setPosition",BA.numberCast(int.class, 0));
 BA.debugLineNum = 1590;BA.debugLine="ProgramID = sf.Right(\"00\" &sf.Trim(sf.Val(sf.Rig";
Debug.ShouldStop(2097152);
programveri._programid = BA.numberCast(int.class, _sf.runMethod(true,"_vvvvv7",(Object)(RemoteObject.concat(RemoteObject.createImmutable("00"),_sf.runMethod(true,"_vvvvvvv4",(Object)(BA.NumberToString(RemoteObject.solve(new RemoteObject[] {_sf.runMethod(true,"_vvvvvvv6",(Object)(_sf.runMethod(true,"_vvvvv7",(Object)(programveri.mostCurrent._rs.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("program_id")))),(Object)(BA.numberCast(long.class, 3))))),RemoteObject.createImmutable(1)}, "+",1, 0)))))),(Object)(BA.numberCast(long.class, 3))));
 }else {
 BA.debugLineNum = 1592;BA.debugLine="ProgramID=\"001\"";
Debug.ShouldStop(8388608);
programveri._programid = BA.numberCast(int.class, "001");
 };
 BA.debugLineNum = 1594;BA.debugLine="rs.Close";
Debug.ShouldStop(33554432);
programveri.mostCurrent._rs.runVoidMethod ("Close");
 BA.debugLineNum = 1595;BA.debugLine="End Sub";
Debug.ShouldStop(67108864);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _levelpanelgoster() throws Exception{
try {
		Debug.PushSubsStack("levelPanelGoster (programveri) ","programveri",12,programveri.mostCurrent.activityBA,programveri.mostCurrent,1503);
if (RapidSub.canDelegate("levelpanelgoster")) { return b4a.example3.programveri.remoteMe.runUserSub(false, "programveri","levelpanelgoster");}
 BA.debugLineNum = 1503;BA.debugLine="Sub levelPanelGoster";
Debug.ShouldStop(1073741824);
 BA.debugLineNum = 1504;BA.debugLine="PanelKapat";
Debug.ShouldStop(-2147483648);
_panelkapat();
 BA.debugLineNum = 1505;BA.debugLine="If ProgramAyar.secilenLevel >= 1 Then";
Debug.ShouldStop(1);
if (RemoteObject.solveBoolean("g",programveri.mostCurrent._programayar._secilenlevel /*RemoteObject*/ ,BA.numberCast(double.class, 1))) { 
 BA.debugLineNum = 1506;BA.debugLine="Panel1.Visible = True";
Debug.ShouldStop(2);
programveri.mostCurrent._panel1.runMethod(true,"setVisible",programveri.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 1507;BA.debugLine="If ProgramAyar.secilenLevel >= 2 Then";
Debug.ShouldStop(4);
if (RemoteObject.solveBoolean("g",programveri.mostCurrent._programayar._secilenlevel /*RemoteObject*/ ,BA.numberCast(double.class, 2))) { 
 BA.debugLineNum = 1508;BA.debugLine="Panel2.Visible = True";
Debug.ShouldStop(8);
programveri.mostCurrent._panel2.runMethod(true,"setVisible",programveri.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 1509;BA.debugLine="If ProgramAyar.secilenLevel >=3 Then";
Debug.ShouldStop(16);
if (RemoteObject.solveBoolean("g",programveri.mostCurrent._programayar._secilenlevel /*RemoteObject*/ ,BA.numberCast(double.class, 3))) { 
 BA.debugLineNum = 1510;BA.debugLine="Panel3.Visible = True";
Debug.ShouldStop(32);
programveri.mostCurrent._panel3.runMethod(true,"setVisible",programveri.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 1511;BA.debugLine="If ProgramAyar.secilenLevel >= 4 Then";
Debug.ShouldStop(64);
if (RemoteObject.solveBoolean("g",programveri.mostCurrent._programayar._secilenlevel /*RemoteObject*/ ,BA.numberCast(double.class, 4))) { 
 BA.debugLineNum = 1512;BA.debugLine="Panel4.Visible = True";
Debug.ShouldStop(128);
programveri.mostCurrent._panel4.runMethod(true,"setVisible",programveri.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 1513;BA.debugLine="If ProgramAyar.secilenLevel >= 5 Then";
Debug.ShouldStop(256);
if (RemoteObject.solveBoolean("g",programveri.mostCurrent._programayar._secilenlevel /*RemoteObject*/ ,BA.numberCast(double.class, 5))) { 
 BA.debugLineNum = 1514;BA.debugLine="Panel5.Visible = True";
Debug.ShouldStop(512);
programveri.mostCurrent._panel5.runMethod(true,"setVisible",programveri.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 1515;BA.debugLine="If ProgramAyar.secilenLevel >= 6 Then";
Debug.ShouldStop(1024);
if (RemoteObject.solveBoolean("g",programveri.mostCurrent._programayar._secilenlevel /*RemoteObject*/ ,BA.numberCast(double.class, 6))) { 
 BA.debugLineNum = 1516;BA.debugLine="Panel6.Visible = True";
Debug.ShouldStop(2048);
programveri.mostCurrent._panel6.runMethod(true,"setVisible",programveri.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 1517;BA.debugLine="If ProgramAyar.secilenLevel >= 7 Then";
Debug.ShouldStop(4096);
if (RemoteObject.solveBoolean("g",programveri.mostCurrent._programayar._secilenlevel /*RemoteObject*/ ,BA.numberCast(double.class, 7))) { 
 BA.debugLineNum = 1518;BA.debugLine="Panel7.Visible = True";
Debug.ShouldStop(8192);
programveri.mostCurrent._panel7.runMethod(true,"setVisible",programveri.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 1519;BA.debugLine="If ProgramAyar.secilenLevel >= 8 Then";
Debug.ShouldStop(16384);
if (RemoteObject.solveBoolean("g",programveri.mostCurrent._programayar._secilenlevel /*RemoteObject*/ ,BA.numberCast(double.class, 8))) { 
 BA.debugLineNum = 1520;BA.debugLine="Panel8.Visible = True";
Debug.ShouldStop(32768);
programveri.mostCurrent._panel8.runMethod(true,"setVisible",programveri.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 1521;BA.debugLine="If ProgramAyar.secilenLevel >= 9 Then";
Debug.ShouldStop(65536);
if (RemoteObject.solveBoolean("g",programveri.mostCurrent._programayar._secilenlevel /*RemoteObject*/ ,BA.numberCast(double.class, 9))) { 
 BA.debugLineNum = 1522;BA.debugLine="Panel9.Visible = True";
Debug.ShouldStop(131072);
programveri.mostCurrent._panel9.runMethod(true,"setVisible",programveri.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 1523;BA.debugLine="If ProgramAyar.secilenLevel >= 10 Then";
Debug.ShouldStop(262144);
if (RemoteObject.solveBoolean("g",programveri.mostCurrent._programayar._secilenlevel /*RemoteObject*/ ,BA.numberCast(double.class, 10))) { 
 BA.debugLineNum = 1524;BA.debugLine="Panel10.Visible = True";
Debug.ShouldStop(524288);
programveri.mostCurrent._panel10.runMethod(true,"setVisible",programveri.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 1525;BA.debugLine="If ProgramAyar.secilenLevel >= 11 Then";
Debug.ShouldStop(1048576);
if (RemoteObject.solveBoolean("g",programveri.mostCurrent._programayar._secilenlevel /*RemoteObject*/ ,BA.numberCast(double.class, 11))) { 
 BA.debugLineNum = 1526;BA.debugLine="Panel11.Visible = True";
Debug.ShouldStop(2097152);
programveri.mostCurrent._panel11.runMethod(true,"setVisible",programveri.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 1527;BA.debugLine="If ProgramAyar.secilenLevel >= 12 Then";
Debug.ShouldStop(4194304);
if (RemoteObject.solveBoolean("g",programveri.mostCurrent._programayar._secilenlevel /*RemoteObject*/ ,BA.numberCast(double.class, 12))) { 
 BA.debugLineNum = 1528;BA.debugLine="Panel12.Visible = True";
Debug.ShouldStop(8388608);
programveri.mostCurrent._panel12.runMethod(true,"setVisible",programveri.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 1529;BA.debugLine="If ProgramAyar.secilenLevel >= 13 The";
Debug.ShouldStop(16777216);
if (RemoteObject.solveBoolean("g",programveri.mostCurrent._programayar._secilenlevel /*RemoteObject*/ ,BA.numberCast(double.class, 13))) { 
 BA.debugLineNum = 1530;BA.debugLine="Panel13.Visible = True";
Debug.ShouldStop(33554432);
programveri.mostCurrent._panel13.runMethod(true,"setVisible",programveri.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 1531;BA.debugLine="If ProgramAyar.secilenLevel >= 14 Th";
Debug.ShouldStop(67108864);
if (RemoteObject.solveBoolean("g",programveri.mostCurrent._programayar._secilenlevel /*RemoteObject*/ ,BA.numberCast(double.class, 14))) { 
 BA.debugLineNum = 1532;BA.debugLine="Panel14.Visible = True";
Debug.ShouldStop(134217728);
programveri.mostCurrent._panel14.runMethod(true,"setVisible",programveri.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 1533;BA.debugLine="If ProgramAyar.secilenLevel >= 15 T";
Debug.ShouldStop(268435456);
if (RemoteObject.solveBoolean("g",programveri.mostCurrent._programayar._secilenlevel /*RemoteObject*/ ,BA.numberCast(double.class, 15))) { 
 BA.debugLineNum = 1534;BA.debugLine="Panel15.Visible = True";
Debug.ShouldStop(536870912);
programveri.mostCurrent._panel15.runMethod(true,"setVisible",programveri.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 1535;BA.debugLine="If ProgramAyar.secilenLevel >= 16";
Debug.ShouldStop(1073741824);
if (RemoteObject.solveBoolean("g",programveri.mostCurrent._programayar._secilenlevel /*RemoteObject*/ ,BA.numberCast(double.class, 16))) { 
 BA.debugLineNum = 1536;BA.debugLine="Panel16. Visible = True";
Debug.ShouldStop(-2147483648);
programveri.mostCurrent._panel16.runMethod(true,"setVisible",programveri.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 1537;BA.debugLine="If ProgramAyar.secilenLevel >= 17";
Debug.ShouldStop(1);
if (RemoteObject.solveBoolean("g",programveri.mostCurrent._programayar._secilenlevel /*RemoteObject*/ ,BA.numberCast(double.class, 17))) { 
 BA.debugLineNum = 1538;BA.debugLine="Panel17.Visible = True";
Debug.ShouldStop(2);
programveri.mostCurrent._panel17.runMethod(true,"setVisible",programveri.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 1539;BA.debugLine="If ProgramAyar.secilenLevel >= 1";
Debug.ShouldStop(4);
if (RemoteObject.solveBoolean("g",programveri.mostCurrent._programayar._secilenlevel /*RemoteObject*/ ,BA.numberCast(double.class, 18))) { 
 BA.debugLineNum = 1540;BA.debugLine="Panel18.Visible = True";
Debug.ShouldStop(8);
programveri.mostCurrent._panel18.runMethod(true,"setVisible",programveri.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 1541;BA.debugLine="If ProgramAyar.secilenLevel >=";
Debug.ShouldStop(16);
if (RemoteObject.solveBoolean("g",programveri.mostCurrent._programayar._secilenlevel /*RemoteObject*/ ,BA.numberCast(double.class, 19))) { 
 BA.debugLineNum = 1542;BA.debugLine="Panel19.Visible = True";
Debug.ShouldStop(32);
programveri.mostCurrent._panel19.runMethod(true,"setVisible",programveri.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 1543;BA.debugLine="If ProgramAyar.secilenLevel >=";
Debug.ShouldStop(64);
if (RemoteObject.solveBoolean("g",programveri.mostCurrent._programayar._secilenlevel /*RemoteObject*/ ,BA.numberCast(double.class, 20))) { 
 BA.debugLineNum = 1544;BA.debugLine="Panel20.Visible = True";
Debug.ShouldStop(128);
programveri.mostCurrent._panel20.runMethod(true,"setVisible",programveri.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 1545;BA.debugLine="If ProgramAyar.secilenLevel >";
Debug.ShouldStop(256);
if (RemoteObject.solveBoolean("g",programveri.mostCurrent._programayar._secilenlevel /*RemoteObject*/ ,BA.numberCast(double.class, 21))) { 
 BA.debugLineNum = 1546;BA.debugLine="Panel21.Visible = True";
Debug.ShouldStop(512);
programveri.mostCurrent._panel21.runMethod(true,"setVisible",programveri.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 1547;BA.debugLine="If ProgramAyar.secilenLevel";
Debug.ShouldStop(1024);
if (RemoteObject.solveBoolean("g",programveri.mostCurrent._programayar._secilenlevel /*RemoteObject*/ ,BA.numberCast(double.class, 22))) { 
 BA.debugLineNum = 1548;BA.debugLine="Panel22.Visible = True";
Debug.ShouldStop(2048);
programveri.mostCurrent._panel22.runMethod(true,"setVisible",programveri.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 1549;BA.debugLine="If ProgramAyar.secilenLevel";
Debug.ShouldStop(4096);
if (RemoteObject.solveBoolean("g",programveri.mostCurrent._programayar._secilenlevel /*RemoteObject*/ ,BA.numberCast(double.class, 23))) { 
 BA.debugLineNum = 1550;BA.debugLine="Panel23.Visible = True";
Debug.ShouldStop(8192);
programveri.mostCurrent._panel23.runMethod(true,"setVisible",programveri.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 1551;BA.debugLine="If ProgramAyar.secilenLeve";
Debug.ShouldStop(16384);
if (RemoteObject.solveBoolean("g",programveri.mostCurrent._programayar._secilenlevel /*RemoteObject*/ ,BA.numberCast(double.class, 24))) { 
 BA.debugLineNum = 1552;BA.debugLine="Panel24.Visible = True";
Debug.ShouldStop(32768);
programveri.mostCurrent._panel24.runMethod(true,"setVisible",programveri.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 1553;BA.debugLine="If ProgramAyar.secilenLev";
Debug.ShouldStop(65536);
if (RemoteObject.solveBoolean("=",programveri.mostCurrent._programayar._secilenlevel /*RemoteObject*/ ,BA.numberCast(double.class, 25))) { 
 BA.debugLineNum = 1554;BA.debugLine="Panel25.Visible = True";
Debug.ShouldStop(131072);
programveri.mostCurrent._panel25.runMethod(true,"setVisible",programveri.mostCurrent.__c.getField(true,"True"));
 };
 };
 };
 };
 };
 };
 };
 };
 };
 };
 };
 };
 };
 };
 };
 };
 };
 };
 };
 };
 };
 };
 };
 };
 };
 BA.debugLineNum = 1581;BA.debugLine="End Sub";
Debug.ShouldStop(4096);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _panelkapat() throws Exception{
try {
		Debug.PushSubsStack("PanelKapat (programveri) ","programveri",12,programveri.mostCurrent.activityBA,programveri.mostCurrent,1475);
if (RapidSub.canDelegate("panelkapat")) { return b4a.example3.programveri.remoteMe.runUserSub(false, "programveri","panelkapat");}
 BA.debugLineNum = 1475;BA.debugLine="Sub PanelKapat";
Debug.ShouldStop(4);
 BA.debugLineNum = 1476;BA.debugLine="Panel1.Visible = False";
Debug.ShouldStop(8);
programveri.mostCurrent._panel1.runMethod(true,"setVisible",programveri.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 1477;BA.debugLine="Panel2.Visible = False";
Debug.ShouldStop(16);
programveri.mostCurrent._panel2.runMethod(true,"setVisible",programveri.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 1478;BA.debugLine="Panel3.Visible = False";
Debug.ShouldStop(32);
programveri.mostCurrent._panel3.runMethod(true,"setVisible",programveri.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 1479;BA.debugLine="Panel4.Visible = False";
Debug.ShouldStop(64);
programveri.mostCurrent._panel4.runMethod(true,"setVisible",programveri.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 1480;BA.debugLine="Panel5.Visible = False";
Debug.ShouldStop(128);
programveri.mostCurrent._panel5.runMethod(true,"setVisible",programveri.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 1481;BA.debugLine="Panel6.Visible = False";
Debug.ShouldStop(256);
programveri.mostCurrent._panel6.runMethod(true,"setVisible",programveri.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 1482;BA.debugLine="Panel7.Visible = False";
Debug.ShouldStop(512);
programveri.mostCurrent._panel7.runMethod(true,"setVisible",programveri.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 1483;BA.debugLine="Panel8.Visible = False";
Debug.ShouldStop(1024);
programveri.mostCurrent._panel8.runMethod(true,"setVisible",programveri.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 1484;BA.debugLine="Panel9.Visible = False";
Debug.ShouldStop(2048);
programveri.mostCurrent._panel9.runMethod(true,"setVisible",programveri.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 1485;BA.debugLine="Panel10.Visible = False";
Debug.ShouldStop(4096);
programveri.mostCurrent._panel10.runMethod(true,"setVisible",programveri.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 1486;BA.debugLine="Panel11.Visible = False";
Debug.ShouldStop(8192);
programveri.mostCurrent._panel11.runMethod(true,"setVisible",programveri.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 1487;BA.debugLine="Panel12.Visible = False";
Debug.ShouldStop(16384);
programveri.mostCurrent._panel12.runMethod(true,"setVisible",programveri.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 1488;BA.debugLine="Panel13.Visible = False";
Debug.ShouldStop(32768);
programveri.mostCurrent._panel13.runMethod(true,"setVisible",programveri.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 1489;BA.debugLine="Panel14.Visible = False";
Debug.ShouldStop(65536);
programveri.mostCurrent._panel14.runMethod(true,"setVisible",programveri.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 1490;BA.debugLine="Panel15.Visible = False";
Debug.ShouldStop(131072);
programveri.mostCurrent._panel15.runMethod(true,"setVisible",programveri.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 1491;BA.debugLine="Panel16.Visible = False";
Debug.ShouldStop(262144);
programveri.mostCurrent._panel16.runMethod(true,"setVisible",programveri.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 1492;BA.debugLine="Panel17.Visible = False";
Debug.ShouldStop(524288);
programveri.mostCurrent._panel17.runMethod(true,"setVisible",programveri.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 1493;BA.debugLine="Panel18.Visible = False";
Debug.ShouldStop(1048576);
programveri.mostCurrent._panel18.runMethod(true,"setVisible",programveri.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 1494;BA.debugLine="Panel19.Visible = False";
Debug.ShouldStop(2097152);
programveri.mostCurrent._panel19.runMethod(true,"setVisible",programveri.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 1495;BA.debugLine="Panel20.Visible = False";
Debug.ShouldStop(4194304);
programveri.mostCurrent._panel20.runMethod(true,"setVisible",programveri.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 1496;BA.debugLine="Panel21.Visible = False";
Debug.ShouldStop(8388608);
programveri.mostCurrent._panel21.runMethod(true,"setVisible",programveri.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 1497;BA.debugLine="Panel22.Visible = False";
Debug.ShouldStop(16777216);
programveri.mostCurrent._panel22.runMethod(true,"setVisible",programveri.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 1498;BA.debugLine="Panel23.Visible = False";
Debug.ShouldStop(33554432);
programveri.mostCurrent._panel23.runMethod(true,"setVisible",programveri.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 1499;BA.debugLine="Panel24.Visible = False";
Debug.ShouldStop(67108864);
programveri.mostCurrent._panel24.runMethod(true,"setVisible",programveri.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 1500;BA.debugLine="Panel25.Visible = False";
Debug.ShouldStop(134217728);
programveri.mostCurrent._panel25.runMethod(true,"setVisible",programveri.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 1501;BA.debugLine="End Sub";
Debug.ShouldStop(268435456);
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
public static RemoteObject  _verial() throws Exception{
try {
		Debug.PushSubsStack("VeriAl (programveri) ","programveri",12,programveri.mostCurrent.activityBA,programveri.mostCurrent,1597);
if (RapidSub.canDelegate("verial")) { return b4a.example3.programveri.remoteMe.runUserSub(false, "programveri","verial");}
 BA.debugLineNum = 1597;BA.debugLine="Sub VeriAl";
Debug.ShouldStop(268435456);
 BA.debugLineNum = 1598;BA.debugLine="If ProgramAyar.secilenLevel >= 1 Then";
Debug.ShouldStop(536870912);
if (RemoteObject.solveBoolean("g",programveri.mostCurrent._programayar._secilenlevel /*RemoteObject*/ ,BA.numberCast(double.class, 1))) { 
 BA.debugLineNum = 1599;BA.debugLine="EditTextKoniMesafesi1_TextChanged(\"0\",EditTextKo";
Debug.ShouldStop(1073741824);
_edittextkonimesafesi1_textchanged(BA.ObjectToString("0"),programveri.mostCurrent._edittextkonimesafesi1.runMethod(true,"getText"));
 BA.debugLineNum = 1600;BA.debugLine="EditTextHiz1_TextChanged(\"0\",EditTextHiz1.Text)";
Debug.ShouldStop(-2147483648);
_edittexthiz1_textchanged(BA.ObjectToString("0"),programveri.mostCurrent._edittexthiz1.runMethod(true,"getText"));
 BA.debugLineNum = 1601;BA.debugLine="EditTextDakika1_TextChanged(\"0\", EditTextDakika1";
Debug.ShouldStop(1);
_edittextdakika1_textchanged(BA.ObjectToString("0"),programveri.mostCurrent._edittextdakika1.runMethod(true,"getText"));
 BA.debugLineNum = 1602;BA.debugLine="EditTextSaniye1_TextChanged(\"0\", EditTextSaniye1";
Debug.ShouldStop(2);
_edittextsaniye1_textchanged(BA.ObjectToString("0"),programveri.mostCurrent._edittextsaniye1.runMethod(true,"getText"));
 BA.debugLineNum = 1603;BA.debugLine="If ProgramAyar.secilenLevel >= 2 Then";
Debug.ShouldStop(4);
if (RemoteObject.solveBoolean("g",programveri.mostCurrent._programayar._secilenlevel /*RemoteObject*/ ,BA.numberCast(double.class, 2))) { 
 BA.debugLineNum = 1604;BA.debugLine="EditTextKoniMesafesi2_TextChanged(\"0\",EditTextK";
Debug.ShouldStop(8);
_edittextkonimesafesi2_textchanged(BA.ObjectToString("0"),programveri.mostCurrent._edittextkonimesafesi2.runMethod(true,"getText"));
 BA.debugLineNum = 1605;BA.debugLine="EditTextHiz2_TextChanged(\"0\",EditTextHiz2.Text)";
Debug.ShouldStop(16);
_edittexthiz2_textchanged(BA.ObjectToString("0"),programveri.mostCurrent._edittexthiz2.runMethod(true,"getText"));
 BA.debugLineNum = 1606;BA.debugLine="EditTextDakika2_TextChanged(\"0\",EditTextDakika2";
Debug.ShouldStop(32);
_edittextdakika2_textchanged(BA.ObjectToString("0"),programveri.mostCurrent._edittextdakika2.runMethod(true,"getText"));
 BA.debugLineNum = 1607;BA.debugLine="EditTextSaniye2_TextChanged(\"0\", EditTextSaniye";
Debug.ShouldStop(64);
_edittextsaniye2_textchanged(BA.ObjectToString("0"),programveri.mostCurrent._edittextsaniye2.runMethod(true,"getText"));
 BA.debugLineNum = 1608;BA.debugLine="If ProgramAyar.secilenLevel >=3 Then";
Debug.ShouldStop(128);
if (RemoteObject.solveBoolean("g",programveri.mostCurrent._programayar._secilenlevel /*RemoteObject*/ ,BA.numberCast(double.class, 3))) { 
 BA.debugLineNum = 1609;BA.debugLine="EditTextKoniMesafesi3_TextChanged(\"0\",EditText";
Debug.ShouldStop(256);
_edittextkonimesafesi3_textchanged(BA.ObjectToString("0"),programveri.mostCurrent._edittextkonimesafesi3.runMethod(true,"getText"));
 BA.debugLineNum = 1610;BA.debugLine="EditTextHiz3_TextChanged(\"0\",  EditTextHiz3.Te";
Debug.ShouldStop(512);
_edittexthiz3_textchanged(BA.ObjectToString("0"),programveri.mostCurrent._edittexthiz3.runMethod(true,"getText"));
 BA.debugLineNum = 1611;BA.debugLine="EditTextDakika3_TextChanged(\"0\", EditTextDakik";
Debug.ShouldStop(1024);
_edittextdakika3_textchanged(BA.ObjectToString("0"),programveri.mostCurrent._edittextdakika3.runMethod(true,"getText"));
 BA.debugLineNum = 1612;BA.debugLine="EditTextSaniye3_TextChanged(\"0\", EditTextSaniy";
Debug.ShouldStop(2048);
_edittextsaniye3_textchanged(BA.ObjectToString("0"),programveri.mostCurrent._edittextsaniye3.runMethod(true,"getText"));
 BA.debugLineNum = 1613;BA.debugLine="If ProgramAyar.secilenLevel >= 4 Then";
Debug.ShouldStop(4096);
if (RemoteObject.solveBoolean("g",programveri.mostCurrent._programayar._secilenlevel /*RemoteObject*/ ,BA.numberCast(double.class, 4))) { 
 BA.debugLineNum = 1614;BA.debugLine="EditTextKoniMesafesi4_TextChanged(\"0\",EditTex";
Debug.ShouldStop(8192);
_edittextkonimesafesi4_textchanged(BA.ObjectToString("0"),programveri.mostCurrent._edittextkonimesafesi4.runMethod(true,"getText"));
 BA.debugLineNum = 1615;BA.debugLine="EditTextHiz4_TextChanged(\"0\",  EditTextHiz4.T";
Debug.ShouldStop(16384);
_edittexthiz4_textchanged(BA.ObjectToString("0"),programveri.mostCurrent._edittexthiz4.runMethod(true,"getText"));
 BA.debugLineNum = 1616;BA.debugLine="EditTextDakika4_TextChanged(\"0\", EditTextDaki";
Debug.ShouldStop(32768);
_edittextdakika4_textchanged(BA.ObjectToString("0"),programveri.mostCurrent._edittextdakika4.runMethod(true,"getText"));
 BA.debugLineNum = 1617;BA.debugLine="EditTextSaniye4_TextChanged(\"0\", EditTextSani";
Debug.ShouldStop(65536);
_edittextsaniye4_textchanged(BA.ObjectToString("0"),programveri.mostCurrent._edittextsaniye4.runMethod(true,"getText"));
 BA.debugLineNum = 1618;BA.debugLine="If ProgramAyar.secilenLevel >= 5 Then";
Debug.ShouldStop(131072);
if (RemoteObject.solveBoolean("g",programveri.mostCurrent._programayar._secilenlevel /*RemoteObject*/ ,BA.numberCast(double.class, 5))) { 
 BA.debugLineNum = 1619;BA.debugLine="EditTextKoniMesafesi5_TextChanged(\"0\",EditTe";
Debug.ShouldStop(262144);
_edittextkonimesafesi5_textchanged(BA.ObjectToString("0"),programveri.mostCurrent._edittextkonimesafesi5.runMethod(true,"getText"));
 BA.debugLineNum = 1620;BA.debugLine="EditTextHiz5_TextChanged(\"0\",  EditTextHiz5.";
Debug.ShouldStop(524288);
_edittexthiz5_textchanged(BA.ObjectToString("0"),programveri.mostCurrent._edittexthiz5.runMethod(true,"getText"));
 BA.debugLineNum = 1621;BA.debugLine="EditTextDakika5_TextChanged(\"0\", EditTextDak";
Debug.ShouldStop(1048576);
_edittextdakika5_textchanged(BA.ObjectToString("0"),programveri.mostCurrent._edittextdakika5.runMethod(true,"getText"));
 BA.debugLineNum = 1622;BA.debugLine="EditTextSaniye5_TextChanged(\"0\", EditTextSan";
Debug.ShouldStop(2097152);
_edittextsaniye5_textchanged(BA.ObjectToString("0"),programveri.mostCurrent._edittextsaniye5.runMethod(true,"getText"));
 BA.debugLineNum = 1623;BA.debugLine="If ProgramAyar.secilenLevel >= 6 Then";
Debug.ShouldStop(4194304);
if (RemoteObject.solveBoolean("g",programveri.mostCurrent._programayar._secilenlevel /*RemoteObject*/ ,BA.numberCast(double.class, 6))) { 
 BA.debugLineNum = 1624;BA.debugLine="EditTextKoniMesafesi6_TextChanged(\"0\",EditT";
Debug.ShouldStop(8388608);
_edittextkonimesafesi6_textchanged(BA.ObjectToString("0"),programveri.mostCurrent._edittextkonimesafesi6.runMethod(true,"getText"));
 BA.debugLineNum = 1625;BA.debugLine="EditTextHiz6_TextChanged(\"0\",  EditTextHiz6";
Debug.ShouldStop(16777216);
_edittexthiz6_textchanged(BA.ObjectToString("0"),programveri.mostCurrent._edittexthiz6.runMethod(true,"getText"));
 BA.debugLineNum = 1626;BA.debugLine="EditTextDakika6_TextChanged(\"0\", EditTextDa";
Debug.ShouldStop(33554432);
_edittextdakika6_textchanged(BA.ObjectToString("0"),programveri.mostCurrent._edittextdakika6.runMethod(true,"getText"));
 BA.debugLineNum = 1627;BA.debugLine="EditTextSaniye6_TextChanged(\"0\", EditTextSa";
Debug.ShouldStop(67108864);
_edittextsaniye6_textchanged(BA.ObjectToString("0"),programveri.mostCurrent._edittextsaniye6.runMethod(true,"getText"));
 BA.debugLineNum = 1628;BA.debugLine="If ProgramAyar.secilenLevel >= 7 Then";
Debug.ShouldStop(134217728);
if (RemoteObject.solveBoolean("g",programveri.mostCurrent._programayar._secilenlevel /*RemoteObject*/ ,BA.numberCast(double.class, 7))) { 
 BA.debugLineNum = 1629;BA.debugLine="EditTextKoniMesafesi7_TextChanged(\"0\",Edit";
Debug.ShouldStop(268435456);
_edittextkonimesafesi7_textchanged(BA.ObjectToString("0"),programveri.mostCurrent._edittextkonimesafesi7.runMethod(true,"getText"));
 BA.debugLineNum = 1630;BA.debugLine="EditTextHiz7_TextChanged(\"0\",  EditTextHiz";
Debug.ShouldStop(536870912);
_edittexthiz7_textchanged(BA.ObjectToString("0"),programveri.mostCurrent._edittexthiz7.runMethod(true,"getText"));
 BA.debugLineNum = 1631;BA.debugLine="EditTextDakika7_TextChanged(\"0\", EditTextD";
Debug.ShouldStop(1073741824);
_edittextdakika7_textchanged(BA.ObjectToString("0"),programveri.mostCurrent._edittextdakika7.runMethod(true,"getText"));
 BA.debugLineNum = 1632;BA.debugLine="EditTextSaniye7_TextChanged(\"0\", EditTextS";
Debug.ShouldStop(-2147483648);
_edittextsaniye7_textchanged(BA.ObjectToString("0"),programveri.mostCurrent._edittextsaniye7.runMethod(true,"getText"));
 BA.debugLineNum = 1633;BA.debugLine="If ProgramAyar.secilenLevel >= 8 Then";
Debug.ShouldStop(1);
if (RemoteObject.solveBoolean("g",programveri.mostCurrent._programayar._secilenlevel /*RemoteObject*/ ,BA.numberCast(double.class, 8))) { 
 BA.debugLineNum = 1634;BA.debugLine="EditTextKoniMesafesi8_TextChanged(\"0\",Edi";
Debug.ShouldStop(2);
_edittextkonimesafesi8_textchanged(BA.ObjectToString("0"),programveri.mostCurrent._edittextkonimesafesi8.runMethod(true,"getText"));
 BA.debugLineNum = 1635;BA.debugLine="EditTextHiz8_TextChanged(\"0\",  EditTextHi";
Debug.ShouldStop(4);
_edittexthiz8_textchanged(BA.ObjectToString("0"),programveri.mostCurrent._edittexthiz8.runMethod(true,"getText"));
 BA.debugLineNum = 1636;BA.debugLine="EditTextDakika8_TextChanged(\"0\", EditText";
Debug.ShouldStop(8);
_edittextdakika8_textchanged(BA.ObjectToString("0"),programveri.mostCurrent._edittextdakika8.runMethod(true,"getText"));
 BA.debugLineNum = 1637;BA.debugLine="EditTextSaniye8_TextChanged(\"0\", EditText";
Debug.ShouldStop(16);
_edittextsaniye8_textchanged(BA.ObjectToString("0"),programveri.mostCurrent._edittextsaniye8.runMethod(true,"getText"));
 BA.debugLineNum = 1638;BA.debugLine="If ProgramAyar.secilenLevel >= 9 Then";
Debug.ShouldStop(32);
if (RemoteObject.solveBoolean("g",programveri.mostCurrent._programayar._secilenlevel /*RemoteObject*/ ,BA.numberCast(double.class, 9))) { 
 BA.debugLineNum = 1639;BA.debugLine="EditTextKoniMesafesi9_TextChanged(\"0\",Ed";
Debug.ShouldStop(64);
_edittextkonimesafesi9_textchanged(BA.ObjectToString("0"),programveri.mostCurrent._edittextkonimesafesi9.runMethod(true,"getText"));
 BA.debugLineNum = 1640;BA.debugLine="EditTextHiz9_TextChanged(\"0\",  EditTextH";
Debug.ShouldStop(128);
_edittexthiz9_textchanged(BA.ObjectToString("0"),programveri.mostCurrent._edittexthiz9.runMethod(true,"getText"));
 BA.debugLineNum = 1641;BA.debugLine="EditTextDakika9_TextChanged(\"0\", EditTex";
Debug.ShouldStop(256);
_edittextdakika9_textchanged(BA.ObjectToString("0"),programveri.mostCurrent._edittextdakika9.runMethod(true,"getText"));
 BA.debugLineNum = 1642;BA.debugLine="EditTextSaniye9_TextChanged(\"0\", EditTex";
Debug.ShouldStop(512);
_edittextsaniye9_textchanged(BA.ObjectToString("0"),programveri.mostCurrent._edittextsaniye9.runMethod(true,"getText"));
 BA.debugLineNum = 1643;BA.debugLine="If ProgramAyar.secilenLevel >= 10 Then";
Debug.ShouldStop(1024);
if (RemoteObject.solveBoolean("g",programveri.mostCurrent._programayar._secilenlevel /*RemoteObject*/ ,BA.numberCast(double.class, 10))) { 
 BA.debugLineNum = 1644;BA.debugLine="EditTextKoniMesafesi10_TextChanged(\"0\",";
Debug.ShouldStop(2048);
_edittextkonimesafesi10_textchanged(BA.ObjectToString("0"),programveri.mostCurrent._edittextkonimesafesi10.runMethod(true,"getText"));
 BA.debugLineNum = 1645;BA.debugLine="EditTextHiz10_TextChanged(\"0\",  EditTex";
Debug.ShouldStop(4096);
_edittexthiz10_textchanged(BA.ObjectToString("0"),programveri.mostCurrent._edittexthiz10.runMethod(true,"getText"));
 BA.debugLineNum = 1646;BA.debugLine="EditTextDakika10_TextChanged(\"0\", EditT";
Debug.ShouldStop(8192);
_edittextdakika10_textchanged(BA.ObjectToString("0"),programveri.mostCurrent._edittextdakika10.runMethod(true,"getText"));
 BA.debugLineNum = 1647;BA.debugLine="EditTextSaniye10_TextChanged(\"0\", EditT";
Debug.ShouldStop(16384);
_edittextsaniye10_textchanged(BA.ObjectToString("0"),programveri.mostCurrent._edittextsaniye10.runMethod(true,"getText"));
 BA.debugLineNum = 1648;BA.debugLine="If ProgramAyar.secilenLevel >= 11 Then";
Debug.ShouldStop(32768);
if (RemoteObject.solveBoolean("g",programveri.mostCurrent._programayar._secilenlevel /*RemoteObject*/ ,BA.numberCast(double.class, 11))) { 
 BA.debugLineNum = 1649;BA.debugLine="EditTextKoniMesafesi11_TextChanged(\"0\"";
Debug.ShouldStop(65536);
_edittextkonimesafesi11_textchanged(BA.ObjectToString("0"),programveri.mostCurrent._edittextkonimesafesi11.runMethod(true,"getText"));
 BA.debugLineNum = 1650;BA.debugLine="EditTextHiz11_TextChanged(\"0\",  EditTe";
Debug.ShouldStop(131072);
_edittexthiz11_textchanged(BA.ObjectToString("0"),programveri.mostCurrent._edittexthiz11.runMethod(true,"getText"));
 BA.debugLineNum = 1651;BA.debugLine="EditTextDakika11_TextChanged(\"0\", Edit";
Debug.ShouldStop(262144);
_edittextdakika11_textchanged(BA.ObjectToString("0"),programveri.mostCurrent._edittextdakika11.runMethod(true,"getText"));
 BA.debugLineNum = 1652;BA.debugLine="EditTextSaniye11_TextChanged(\"0\", Edit";
Debug.ShouldStop(524288);
_edittextsaniye11_textchanged(BA.ObjectToString("0"),programveri.mostCurrent._edittextsaniye11.runMethod(true,"getText"));
 BA.debugLineNum = 1653;BA.debugLine="If ProgramAyar.secilenLevel >= 12 Then";
Debug.ShouldStop(1048576);
if (RemoteObject.solveBoolean("g",programveri.mostCurrent._programayar._secilenlevel /*RemoteObject*/ ,BA.numberCast(double.class, 12))) { 
 BA.debugLineNum = 1654;BA.debugLine="EditTextKoniMesafesi12_TextChanged(\"0";
Debug.ShouldStop(2097152);
_edittextkonimesafesi12_textchanged(BA.ObjectToString("0"),programveri.mostCurrent._edittextkonimesafesi12.runMethod(true,"getText"));
 BA.debugLineNum = 1655;BA.debugLine="EditTextHiz12_TextChanged(\"0\",  EditT";
Debug.ShouldStop(4194304);
_edittexthiz12_textchanged(BA.ObjectToString("0"),programveri.mostCurrent._edittexthiz12.runMethod(true,"getText"));
 BA.debugLineNum = 1656;BA.debugLine="EditTextDakika12_TextChanged(\"0\", Edi";
Debug.ShouldStop(8388608);
_edittextdakika12_textchanged(BA.ObjectToString("0"),programveri.mostCurrent._edittextdakika12.runMethod(true,"getText"));
 BA.debugLineNum = 1657;BA.debugLine="EditTextSaniye12_TextChanged(\"0\", Edi";
Debug.ShouldStop(16777216);
_edittextsaniye12_textchanged(BA.ObjectToString("0"),programveri.mostCurrent._edittextsaniye12.runMethod(true,"getText"));
 BA.debugLineNum = 1658;BA.debugLine="If ProgramAyar.secilenLevel >= 13 The";
Debug.ShouldStop(33554432);
if (RemoteObject.solveBoolean("g",programveri.mostCurrent._programayar._secilenlevel /*RemoteObject*/ ,BA.numberCast(double.class, 13))) { 
 BA.debugLineNum = 1659;BA.debugLine="EditTextKoniMesafesi13_TextChanged(\"";
Debug.ShouldStop(67108864);
_edittextkonimesafesi13_textchanged(BA.ObjectToString("0"),programveri.mostCurrent._edittextkonimesafesi13.runMethod(true,"getText"));
 BA.debugLineNum = 1660;BA.debugLine="EditTextHiz13_TextChanged(\"0\",  Edit";
Debug.ShouldStop(134217728);
_edittexthiz13_textchanged(BA.ObjectToString("0"),programveri.mostCurrent._edittexthiz13.runMethod(true,"getText"));
 BA.debugLineNum = 1661;BA.debugLine="EditTextDakika13_TextChanged(\"0\", Ed";
Debug.ShouldStop(268435456);
_edittextdakika13_textchanged(BA.ObjectToString("0"),programveri.mostCurrent._edittextdakika13.runMethod(true,"getText"));
 BA.debugLineNum = 1662;BA.debugLine="EditTextSaniye13_TextChanged(\"0\", Ed";
Debug.ShouldStop(536870912);
_edittextsaniye13_textchanged(BA.ObjectToString("0"),programveri.mostCurrent._edittextsaniye13.runMethod(true,"getText"));
 BA.debugLineNum = 1663;BA.debugLine="If ProgramAyar.secilenLevel >= 14 Th";
Debug.ShouldStop(1073741824);
if (RemoteObject.solveBoolean("g",programveri.mostCurrent._programayar._secilenlevel /*RemoteObject*/ ,BA.numberCast(double.class, 14))) { 
 BA.debugLineNum = 1664;BA.debugLine="EditTextKoniMesafesi14_TextChanged(";
Debug.ShouldStop(-2147483648);
_edittextkonimesafesi14_textchanged(BA.ObjectToString("0"),programveri.mostCurrent._edittextkonimesafesi14.runMethod(true,"getText"));
 BA.debugLineNum = 1665;BA.debugLine="EditTextHiz14_TextChanged(\"0\",  Edi";
Debug.ShouldStop(1);
_edittexthiz14_textchanged(BA.ObjectToString("0"),programveri.mostCurrent._edittexthiz14.runMethod(true,"getText"));
 BA.debugLineNum = 1666;BA.debugLine="EditTextDakika14_TextChanged(\"0\", E";
Debug.ShouldStop(2);
_edittextdakika14_textchanged(BA.ObjectToString("0"),programveri.mostCurrent._edittextdakika14.runMethod(true,"getText"));
 BA.debugLineNum = 1667;BA.debugLine="EditTextSaniye14_TextChanged(\"0\", E";
Debug.ShouldStop(4);
_edittextsaniye14_textchanged(BA.ObjectToString("0"),programveri.mostCurrent._edittextsaniye14.runMethod(true,"getText"));
 BA.debugLineNum = 1668;BA.debugLine="If ProgramAyar.secilenLevel >= 15 T";
Debug.ShouldStop(8);
if (RemoteObject.solveBoolean("g",programveri.mostCurrent._programayar._secilenlevel /*RemoteObject*/ ,BA.numberCast(double.class, 15))) { 
 BA.debugLineNum = 1669;BA.debugLine="EditTextKoniMesafesi15_TextChanged";
Debug.ShouldStop(16);
_edittextkonimesafesi15_textchanged(BA.ObjectToString("0"),programveri.mostCurrent._edittextkonimesafesi15.runMethod(true,"getText"));
 BA.debugLineNum = 1670;BA.debugLine="EditTextHiz15_TextChanged(\"0\",  Ed";
Debug.ShouldStop(32);
_edittexthiz15_textchanged(BA.ObjectToString("0"),programveri.mostCurrent._edittexthiz15.runMethod(true,"getText"));
 BA.debugLineNum = 1671;BA.debugLine="EditTextDakika15_TextChanged(\"0\",";
Debug.ShouldStop(64);
_edittextdakika15_textchanged(BA.ObjectToString("0"),programveri.mostCurrent._edittextdakika15.runMethod(true,"getText"));
 BA.debugLineNum = 1672;BA.debugLine="EditTextSaniye15_TextChanged(\"0\",";
Debug.ShouldStop(128);
_edittextsaniye15_textchanged(BA.ObjectToString("0"),programveri.mostCurrent._edittextsaniye15.runMethod(true,"getText"));
 BA.debugLineNum = 1673;BA.debugLine="If ProgramAyar.secilenLevel >= 16";
Debug.ShouldStop(256);
if (RemoteObject.solveBoolean("g",programveri.mostCurrent._programayar._secilenlevel /*RemoteObject*/ ,BA.numberCast(double.class, 16))) { 
 BA.debugLineNum = 1674;BA.debugLine="EditTextKoniMesafesi16_TextChange";
Debug.ShouldStop(512);
_edittextkonimesafesi16_textchanged(BA.ObjectToString("0"),programveri.mostCurrent._edittextkonimesafesi16.runMethod(true,"getText"));
 BA.debugLineNum = 1675;BA.debugLine="EditTextHiz16_TextChanged(\"0\",  E";
Debug.ShouldStop(1024);
_edittexthiz16_textchanged(BA.ObjectToString("0"),programveri.mostCurrent._edittexthiz16.runMethod(true,"getText"));
 BA.debugLineNum = 1676;BA.debugLine="EditTextDakika16_TextChanged(\"0\",";
Debug.ShouldStop(2048);
_edittextdakika16_textchanged(BA.ObjectToString("0"),programveri.mostCurrent._edittextdakika16.runMethod(true,"getText"));
 BA.debugLineNum = 1677;BA.debugLine="EditTextSaniye16_TextChanged(\"0\",";
Debug.ShouldStop(4096);
_edittextsaniye16_textchanged(BA.ObjectToString("0"),programveri.mostCurrent._edittextsaniye16.runMethod(true,"getText"));
 BA.debugLineNum = 1678;BA.debugLine="If ProgramAyar.secilenLevel >= 17";
Debug.ShouldStop(8192);
if (RemoteObject.solveBoolean("g",programveri.mostCurrent._programayar._secilenlevel /*RemoteObject*/ ,BA.numberCast(double.class, 17))) { 
 BA.debugLineNum = 1679;BA.debugLine="EditTextKoniMesafesi17_TextChang";
Debug.ShouldStop(16384);
_edittextkonimesafesi17_textchanged(BA.ObjectToString("0"),programveri.mostCurrent._edittextkonimesafesi17.runMethod(true,"getText"));
 BA.debugLineNum = 1680;BA.debugLine="EditTextHiz17_TextChanged(\"0\",";
Debug.ShouldStop(32768);
_edittexthiz17_textchanged(BA.ObjectToString("0"),programveri.mostCurrent._edittexthiz17.runMethod(true,"getText"));
 BA.debugLineNum = 1681;BA.debugLine="EditTextDakika17_TextChanged(\"0\"";
Debug.ShouldStop(65536);
_edittextdakika17_textchanged(BA.ObjectToString("0"),programveri.mostCurrent._edittextdakika17.runMethod(true,"getText"));
 BA.debugLineNum = 1682;BA.debugLine="EditTextSaniye17_TextChanged(\"0\"";
Debug.ShouldStop(131072);
_edittextsaniye17_textchanged(BA.ObjectToString("0"),programveri.mostCurrent._edittextsaniye17.runMethod(true,"getText"));
 BA.debugLineNum = 1683;BA.debugLine="If ProgramAyar.secilenLevel >= 1";
Debug.ShouldStop(262144);
if (RemoteObject.solveBoolean("g",programveri.mostCurrent._programayar._secilenlevel /*RemoteObject*/ ,BA.numberCast(double.class, 18))) { 
 BA.debugLineNum = 1684;BA.debugLine="EditTextKoniMesafesi18_TextChan";
Debug.ShouldStop(524288);
_edittextkonimesafesi18_textchanged(BA.ObjectToString("0"),programveri.mostCurrent._edittextkonimesafesi18.runMethod(true,"getText"));
 BA.debugLineNum = 1685;BA.debugLine="EditTextHiz18_TextChanged(\"0\",";
Debug.ShouldStop(1048576);
_edittexthiz18_textchanged(BA.ObjectToString("0"),programveri.mostCurrent._edittexthiz18.runMethod(true,"getText"));
 BA.debugLineNum = 1686;BA.debugLine="EditTextDakika18_TextChanged(\"0";
Debug.ShouldStop(2097152);
_edittextdakika18_textchanged(BA.ObjectToString("0"),programveri.mostCurrent._edittextdakika18.runMethod(true,"getText"));
 BA.debugLineNum = 1687;BA.debugLine="EditTextSaniye18_TextChanged(\"0";
Debug.ShouldStop(4194304);
_edittextsaniye18_textchanged(BA.ObjectToString("0"),programveri.mostCurrent._edittextsaniye18.runMethod(true,"getText"));
 BA.debugLineNum = 1688;BA.debugLine="If ProgramAyar.secilenLevel >=";
Debug.ShouldStop(8388608);
if (RemoteObject.solveBoolean("g",programveri.mostCurrent._programayar._secilenlevel /*RemoteObject*/ ,BA.numberCast(double.class, 19))) { 
 BA.debugLineNum = 1689;BA.debugLine="EditTextKoniMesafesi19_TextCha";
Debug.ShouldStop(16777216);
_edittextkonimesafesi19_textchanged(BA.ObjectToString("0"),programveri.mostCurrent._edittextkonimesafesi19.runMethod(true,"getText"));
 BA.debugLineNum = 1690;BA.debugLine="EditTextHiz19_TextChanged(\"0\",";
Debug.ShouldStop(33554432);
_edittexthiz19_textchanged(BA.ObjectToString("0"),programveri.mostCurrent._edittexthiz19.runMethod(true,"getText"));
 BA.debugLineNum = 1691;BA.debugLine="EditTextDakika19_TextChanged(\"";
Debug.ShouldStop(67108864);
_edittextdakika19_textchanged(BA.ObjectToString("0"),programveri.mostCurrent._edittextdakika19.runMethod(true,"getText"));
 BA.debugLineNum = 1692;BA.debugLine="EditTextSaniye19_TextChanged(\"";
Debug.ShouldStop(134217728);
_edittextsaniye19_textchanged(BA.ObjectToString("0"),programveri.mostCurrent._edittextsaniye19.runMethod(true,"getText"));
 BA.debugLineNum = 1693;BA.debugLine="If ProgramAyar.secilenLevel >=";
Debug.ShouldStop(268435456);
if (RemoteObject.solveBoolean("g",programveri.mostCurrent._programayar._secilenlevel /*RemoteObject*/ ,BA.numberCast(double.class, 20))) { 
 BA.debugLineNum = 1694;BA.debugLine="EditTextKoniMesafesi20_TextCh";
Debug.ShouldStop(536870912);
_edittextkonimesafesi20_textchanged(BA.ObjectToString("0"),programveri.mostCurrent._edittextkonimesafesi20.runMethod(true,"getText"));
 BA.debugLineNum = 1695;BA.debugLine="EditTextHiz20_TextChanged(\"0\"";
Debug.ShouldStop(1073741824);
_edittexthiz20_textchanged(BA.ObjectToString("0"),programveri.mostCurrent._edittexthiz20.runMethod(true,"getText"));
 BA.debugLineNum = 1696;BA.debugLine="EditTextDakika20_TextChanged(";
Debug.ShouldStop(-2147483648);
_edittextdakika20_textchanged(BA.ObjectToString("0"),programveri.mostCurrent._edittextdakika20.runMethod(true,"getText"));
 BA.debugLineNum = 1697;BA.debugLine="EditTextSaniye20_TextChanged(";
Debug.ShouldStop(1);
_edittextsaniye20_textchanged(BA.ObjectToString("0"),programveri.mostCurrent._edittextsaniye20.runMethod(true,"getText"));
 BA.debugLineNum = 1698;BA.debugLine="If ProgramAyar.secilenLevel >";
Debug.ShouldStop(2);
if (RemoteObject.solveBoolean("g",programveri.mostCurrent._programayar._secilenlevel /*RemoteObject*/ ,BA.numberCast(double.class, 21))) { 
 BA.debugLineNum = 1699;BA.debugLine="EditTextKoniMesafesi21_TextC";
Debug.ShouldStop(4);
_edittextkonimesafesi21_textchanged(BA.ObjectToString("0"),programveri.mostCurrent._edittextkonimesafesi21.runMethod(true,"getText"));
 BA.debugLineNum = 1700;BA.debugLine="EditTextHiz21_TextChanged(\"0";
Debug.ShouldStop(8);
_edittexthiz21_textchanged(BA.ObjectToString("0"),programveri.mostCurrent._edittexthiz21.runMethod(true,"getText"));
 BA.debugLineNum = 1701;BA.debugLine="EditTextDakika21_TextChanged";
Debug.ShouldStop(16);
_edittextdakika21_textchanged(BA.ObjectToString("0"),programveri.mostCurrent._edittextdakika21.runMethod(true,"getText"));
 BA.debugLineNum = 1702;BA.debugLine="EditTextSaniye21_TextChanged";
Debug.ShouldStop(32);
_edittextsaniye21_textchanged(BA.ObjectToString("0"),programveri.mostCurrent._edittextsaniye21.runMethod(true,"getText"));
 BA.debugLineNum = 1703;BA.debugLine="If ProgramAyar.secilenLevel";
Debug.ShouldStop(64);
if (RemoteObject.solveBoolean("g",programveri.mostCurrent._programayar._secilenlevel /*RemoteObject*/ ,BA.numberCast(double.class, 22))) { 
 BA.debugLineNum = 1704;BA.debugLine="EditTextKoniMesafesi22_Text";
Debug.ShouldStop(128);
_edittextkonimesafesi22_textchanged(BA.ObjectToString("0"),programveri.mostCurrent._edittextkonimesafesi22.runMethod(true,"getText"));
 BA.debugLineNum = 1705;BA.debugLine="EditTextHiz22_TextChanged(\"";
Debug.ShouldStop(256);
_edittexthiz22_textchanged(BA.ObjectToString("0"),programveri.mostCurrent._edittexthiz22.runMethod(true,"getText"));
 BA.debugLineNum = 1706;BA.debugLine="EditTextDakika22_TextChange";
Debug.ShouldStop(512);
_edittextdakika22_textchanged(BA.ObjectToString("0"),programveri.mostCurrent._edittextdakika22.runMethod(true,"getText"));
 BA.debugLineNum = 1707;BA.debugLine="EditTextSaniye22_TextChange";
Debug.ShouldStop(1024);
_edittextsaniye22_textchanged(BA.ObjectToString("0"),programveri.mostCurrent._edittextsaniye22.runMethod(true,"getText"));
 BA.debugLineNum = 1708;BA.debugLine="If ProgramAyar.secilenLevel";
Debug.ShouldStop(2048);
if (RemoteObject.solveBoolean("g",programveri.mostCurrent._programayar._secilenlevel /*RemoteObject*/ ,BA.numberCast(double.class, 23))) { 
 BA.debugLineNum = 1709;BA.debugLine="EditTextKoniMesafesi23_Tex";
Debug.ShouldStop(4096);
_edittextkonimesafesi23_textchanged(BA.ObjectToString("0"),programveri.mostCurrent._edittextkonimesafesi23.runMethod(true,"getText"));
 BA.debugLineNum = 1710;BA.debugLine="EditTextHiz23_TextChanged(";
Debug.ShouldStop(8192);
_edittexthiz23_textchanged(BA.ObjectToString("0"),programveri.mostCurrent._edittexthiz23.runMethod(true,"getText"));
 BA.debugLineNum = 1711;BA.debugLine="EditTextDakika23_TextChang";
Debug.ShouldStop(16384);
_edittextdakika23_textchanged(BA.ObjectToString("0"),programveri.mostCurrent._edittextdakika23.runMethod(true,"getText"));
 BA.debugLineNum = 1712;BA.debugLine="EditTextSaniye23_TextChang";
Debug.ShouldStop(32768);
_edittextsaniye23_textchanged(BA.ObjectToString("0"),programveri.mostCurrent._edittextsaniye23.runMethod(true,"getText"));
 BA.debugLineNum = 1713;BA.debugLine="If ProgramAyar.secilenLeve";
Debug.ShouldStop(65536);
if (RemoteObject.solveBoolean("g",programveri.mostCurrent._programayar._secilenlevel /*RemoteObject*/ ,BA.numberCast(double.class, 24))) { 
 BA.debugLineNum = 1714;BA.debugLine="EditTextKoniMesafesi24_Te";
Debug.ShouldStop(131072);
_edittextkonimesafesi24_textchanged(BA.ObjectToString("0"),programveri.mostCurrent._edittextkonimesafesi24.runMethod(true,"getText"));
 BA.debugLineNum = 1715;BA.debugLine="EditTextHiz24_TextChanged";
Debug.ShouldStop(262144);
_edittexthiz24_textchanged(BA.ObjectToString("0"),programveri.mostCurrent._edittexthiz24.runMethod(true,"getText"));
 BA.debugLineNum = 1716;BA.debugLine="EditTextDakika24_TextChan";
Debug.ShouldStop(524288);
_edittextdakika24_textchanged(BA.ObjectToString("0"),programveri.mostCurrent._edittextdakika24.runMethod(true,"getText"));
 BA.debugLineNum = 1717;BA.debugLine="EditTextSaniye24_TextChan";
Debug.ShouldStop(1048576);
_edittextsaniye24_textchanged(BA.ObjectToString("0"),programveri.mostCurrent._edittextsaniye24.runMethod(true,"getText"));
 BA.debugLineNum = 1718;BA.debugLine="If ProgramAyar.secilenLev";
Debug.ShouldStop(2097152);
if (RemoteObject.solveBoolean("=",programveri.mostCurrent._programayar._secilenlevel /*RemoteObject*/ ,BA.numberCast(double.class, 25))) { 
 BA.debugLineNum = 1719;BA.debugLine="EditTextKoniMesafesi25_T";
Debug.ShouldStop(4194304);
_edittextkonimesafesi25_textchanged(BA.ObjectToString("0"),programveri.mostCurrent._edittextkonimesafesi25.runMethod(true,"getText"));
 BA.debugLineNum = 1720;BA.debugLine="EditTextHiz25_TextChange";
Debug.ShouldStop(8388608);
_edittexthiz25_textchanged(BA.ObjectToString("0"),programveri.mostCurrent._edittexthiz25.runMethod(true,"getText"));
 BA.debugLineNum = 1721;BA.debugLine="EditTextDakika25_TextCha";
Debug.ShouldStop(16777216);
_edittextdakika25_textchanged(BA.ObjectToString("0"),programveri.mostCurrent._edittextdakika25.runMethod(true,"getText"));
 BA.debugLineNum = 1722;BA.debugLine="EditTextSaniye25_TextCha";
Debug.ShouldStop(33554432);
_edittextsaniye25_textchanged(BA.ObjectToString("0"),programveri.mostCurrent._edittextsaniye25.runMethod(true,"getText"));
 };
 };
 };
 };
 };
 };
 };
 };
 };
 };
 };
 };
 };
 };
 };
 };
 };
 };
 };
 };
 };
 };
 };
 };
 };
 BA.debugLineNum = 1748;BA.debugLine="End Sub";
Debug.ShouldStop(524288);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}