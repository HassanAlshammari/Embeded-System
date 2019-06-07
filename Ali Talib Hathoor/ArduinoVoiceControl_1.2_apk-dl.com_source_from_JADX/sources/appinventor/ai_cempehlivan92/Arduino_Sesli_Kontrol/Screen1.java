package appinventor.ai_cempehlivan92.Arduino_Sesli_Kontrol;

import android.support.v4.app.FragmentTransaction;
import com.google.appinventor.components.common.PropertyTypeConstants;
import com.google.appinventor.components.runtime.ActivityStarter;
import com.google.appinventor.components.runtime.BluetoothClient;
import com.google.appinventor.components.runtime.Button;
import com.google.appinventor.components.runtime.Clock;
import com.google.appinventor.components.runtime.Component;
import com.google.appinventor.components.runtime.EventDispatcher;
import com.google.appinventor.components.runtime.Form;
import com.google.appinventor.components.runtime.HandlesEventDispatching;
import com.google.appinventor.components.runtime.HorizontalArrangement;
import com.google.appinventor.components.runtime.Label;
import com.google.appinventor.components.runtime.ListPicker;
import com.google.appinventor.components.runtime.Notifier;
import com.google.appinventor.components.runtime.SpeechRecognizer;
import com.google.appinventor.components.runtime.TextToSpeech;
import com.google.appinventor.components.runtime.TinyDB;
import com.google.appinventor.components.runtime.errors.YailRuntimeError;
import com.google.appinventor.components.runtime.util.RetValManager;
import com.google.appinventor.components.runtime.util.RuntimeErrorAlert;
import com.google.youngandroid.runtime;
import gnu.expr.Language;
import gnu.expr.ModuleBody;
import gnu.expr.ModuleInfo;
import gnu.expr.ModuleMethod;
import gnu.kawa.functions.Format;
import gnu.kawa.functions.GetNamedPart;
import gnu.kawa.reflect.Invoke;
import gnu.kawa.reflect.SlotGet;
import gnu.kawa.reflect.SlotSet;
import gnu.lists.Consumer;
import gnu.lists.FString;
import gnu.lists.LList;
import gnu.lists.Pair;
import gnu.lists.PairWithPosition;
import gnu.lists.VoidConsumer;
import gnu.mapping.CallContext;
import gnu.mapping.Environment;
import gnu.mapping.Procedure;
import gnu.mapping.PropertySet;
import gnu.mapping.SimpleSymbol;
import gnu.mapping.Symbol;
import gnu.mapping.Values;
import gnu.mapping.WrongType;
import gnu.math.IntNum;
import kawa.lang.Promise;
import kawa.lib.lists;
import kawa.lib.misc;
import kawa.lib.strings;
import kawa.standard.Scheme;
import kawa.standard.require;

/* compiled from: Screen1.yail */
public class Screen1 extends Form implements Runnable {
    static final SimpleSymbol Lit0 = ((SimpleSymbol) new SimpleSymbol("Screen1").readResolve());
    static final SimpleSymbol Lit1 = ((SimpleSymbol) new SimpleSymbol("getMessage").readResolve());
    static final SimpleSymbol Lit10 = ((SimpleSymbol) new SimpleSymbol("BackgroundImage").readResolve());
    static final SimpleSymbol Lit100 = ((SimpleSymbol) new SimpleSymbol("SpeechRecognizer1").readResolve());
    static final SimpleSymbol Lit101 = ((SimpleSymbol) new SimpleSymbol("GetText").readResolve());
    static final SimpleSymbol Lit102 = ((SimpleSymbol) new SimpleSymbol("Bildirim").readResolve());
    static final SimpleSymbol Lit103 = ((SimpleSymbol) new SimpleSymbol("ShowMessageDialog").readResolve());
    static final PairWithPosition Lit104 = PairWithPosition.make(Lit7, PairWithPosition.make(Lit7, PairWithPosition.make(Lit7, LList.Empty, "/tmp/1519769971818_0.8604563026951658-0/youngandroidproject/../src/appinventor/ai_cempehlivan92/Arduino_Sesli_Kontrol/Screen1.yail", 672018), "/tmp/1519769971818_0.8604563026951658-0/youngandroidproject/../src/appinventor/ai_cempehlivan92/Arduino_Sesli_Kontrol/Screen1.yail", 672013), "/tmp/1519769971818_0.8604563026951658-0/youngandroidproject/../src/appinventor/ai_cempehlivan92/Arduino_Sesli_Kontrol/Screen1.yail", 672007);
    static final IntNum Lit105 = IntNum.make(-65536);
    static final SimpleSymbol Lit106 = ((SimpleSymbol) new SimpleSymbol("mic$Click").readResolve());
    static final FString Lit107 = new FString("com.google.appinventor.components.runtime.Notifier");
    static final FString Lit108 = new FString("com.google.appinventor.components.runtime.Notifier");
    static final FString Lit109 = new FString("com.google.appinventor.components.runtime.SpeechRecognizer");
    static final SimpleSymbol Lit11 = ((SimpleSymbol) new SimpleSymbol("Icon").readResolve());
    static final FString Lit110 = new FString("com.google.appinventor.components.runtime.SpeechRecognizer");
    static final SimpleSymbol Lit111 = ((SimpleSymbol) new SimpleSymbol("SendText").readResolve());
    static final SimpleSymbol Lit112 = ((SimpleSymbol) new SimpleSymbol("$result").readResolve());
    static final PairWithPosition Lit113 = PairWithPosition.make(Lit7, LList.Empty, "/tmp/1519769971818_0.8604563026951658-0/youngandroidproject/../src/appinventor/ai_cempehlivan92/Arduino_Sesli_Kontrol/Screen1.yail", 720998);
    static final SimpleSymbol Lit114 = ((SimpleSymbol) new SimpleSymbol("ShowAlert").readResolve());
    static final PairWithPosition Lit115 = PairWithPosition.make(Lit7, LList.Empty, "/tmp/1519769971818_0.8604563026951658-0/youngandroidproject/../src/appinventor/ai_cempehlivan92/Arduino_Sesli_Kontrol/Screen1.yail", 721095);
    static final SimpleSymbol Lit116 = ((SimpleSymbol) new SimpleSymbol("SpeechRecognizer1$AfterGettingText").readResolve());
    static final SimpleSymbol Lit117 = ((SimpleSymbol) new SimpleSymbol("AfterGettingText").readResolve());
    static final FString Lit118 = new FString("com.google.appinventor.components.runtime.BluetoothClient");
    static final FString Lit119 = new FString("com.google.appinventor.components.runtime.BluetoothClient");
    static final SimpleSymbol Lit12 = ((SimpleSymbol) new SimpleSymbol("ShowStatusBar").readResolve());
    static final FString Lit120 = new FString("com.google.appinventor.components.runtime.ActivityStarter");
    static final FString Lit121 = new FString("com.google.appinventor.components.runtime.ActivityStarter");
    static final FString Lit122 = new FString("com.google.appinventor.components.runtime.TinyDB");
    static final SimpleSymbol Lit123 = ((SimpleSymbol) new SimpleSymbol("TinyDB1").readResolve());
    static final FString Lit124 = new FString("com.google.appinventor.components.runtime.TinyDB");
    static final FString Lit125 = new FString("com.google.appinventor.components.runtime.Clock");
    static final SimpleSymbol Lit126 = ((SimpleSymbol) new SimpleSymbol("Clock1").readResolve());
    static final SimpleSymbol Lit127 = ((SimpleSymbol) new SimpleSymbol("TimerInterval").readResolve());
    static final IntNum Lit128 = IntNum.make(500);
    static final FString Lit129 = new FString("com.google.appinventor.components.runtime.Clock");
    static final SimpleSymbol Lit13 = ((SimpleSymbol) new SimpleSymbol(PropertyTypeConstants.PROPERTY_TYPE_BOOLEAN).readResolve());
    static final SimpleSymbol Lit130 = ((SimpleSymbol) new SimpleSymbol("BytesAvailableToReceive").readResolve());
    static final IntNum Lit131 = IntNum.make(0);
    static final PairWithPosition Lit132 = PairWithPosition.make(Lit5, PairWithPosition.make(Lit5, LList.Empty, "/tmp/1519769971818_0.8604563026951658-0/youngandroidproject/../src/appinventor/ai_cempehlivan92/Arduino_Sesli_Kontrol/Screen1.yail", 819415), "/tmp/1519769971818_0.8604563026951658-0/youngandroidproject/../src/appinventor/ai_cempehlivan92/Arduino_Sesli_Kontrol/Screen1.yail", 819407);
    static final SimpleSymbol Lit133 = ((SimpleSymbol) new SimpleSymbol("Speak").readResolve());
    static final SimpleSymbol Lit134 = ((SimpleSymbol) new SimpleSymbol("ReceiveText").readResolve());
    static final PairWithPosition Lit135;
    static final PairWithPosition Lit136;
    static final SimpleSymbol Lit137 = ((SimpleSymbol) new SimpleSymbol("Clock1$Timer").readResolve());
    static final SimpleSymbol Lit138 = ((SimpleSymbol) new SimpleSymbol("Timer").readResolve());
    static final FString Lit139 = new FString("com.google.appinventor.components.runtime.TextToSpeech");
    static final SimpleSymbol Lit14 = ((SimpleSymbol) new SimpleSymbol("Title").readResolve());
    static final FString Lit140 = new FString("com.google.appinventor.components.runtime.TextToSpeech");
    static final SimpleSymbol Lit141 = ((SimpleSymbol) new SimpleSymbol("android-log-form").readResolve());
    static final SimpleSymbol Lit142 = ((SimpleSymbol) new SimpleSymbol("add-to-form-environment").readResolve());
    static final SimpleSymbol Lit143 = ((SimpleSymbol) new SimpleSymbol("lookup-in-form-environment").readResolve());
    static final SimpleSymbol Lit144 = ((SimpleSymbol) new SimpleSymbol("is-bound-in-form-environment").readResolve());
    static final SimpleSymbol Lit145 = ((SimpleSymbol) new SimpleSymbol("add-to-global-var-environment").readResolve());
    static final SimpleSymbol Lit146 = ((SimpleSymbol) new SimpleSymbol("add-to-events").readResolve());
    static final SimpleSymbol Lit147 = ((SimpleSymbol) new SimpleSymbol("add-to-components").readResolve());
    static final SimpleSymbol Lit148 = ((SimpleSymbol) new SimpleSymbol("add-to-global-vars").readResolve());
    static final SimpleSymbol Lit149 = ((SimpleSymbol) new SimpleSymbol("add-to-form-do-after-creation").readResolve());
    static final SimpleSymbol Lit15 = ((SimpleSymbol) new SimpleSymbol("TitleVisible").readResolve());
    static final SimpleSymbol Lit150 = ((SimpleSymbol) new SimpleSymbol("send-error").readResolve());
    static final SimpleSymbol Lit151 = ((SimpleSymbol) new SimpleSymbol("dispatchEvent").readResolve());
    static final SimpleSymbol Lit152 = ((SimpleSymbol) new SimpleSymbol("lookup-handler").readResolve());
    static final SimpleSymbol Lit153 = ((SimpleSymbol) new SimpleSymbol("any").readResolve());
    static final SimpleSymbol Lit16 = ((SimpleSymbol) new SimpleSymbol("VersionCode").readResolve());
    static final SimpleSymbol Lit17 = ((SimpleSymbol) new SimpleSymbol("VersionName").readResolve());
    static final SimpleSymbol Lit18 = ((SimpleSymbol) new SimpleSymbol("BluetoothClient1").readResolve());
    static final SimpleSymbol Lit19 = ((SimpleSymbol) new SimpleSymbol("Enabled").readResolve());
    static final SimpleSymbol Lit2 = ((SimpleSymbol) new SimpleSymbol("*the-null-value*").readResolve());
    static final PairWithPosition Lit20 = PairWithPosition.make(Lit153, PairWithPosition.make(Lit153, LList.Empty, "/tmp/1519769971818_0.8604563026951658-0/youngandroidproject/../src/appinventor/ai_cempehlivan92/Arduino_Sesli_Kontrol/Screen1.yail", 94322), "/tmp/1519769971818_0.8604563026951658-0/youngandroidproject/../src/appinventor/ai_cempehlivan92/Arduino_Sesli_Kontrol/Screen1.yail", 94317);
    static final SimpleSymbol Lit21 = ((SimpleSymbol) new SimpleSymbol("ActivityStarter1").readResolve());
    static final SimpleSymbol Lit22 = ((SimpleSymbol) new SimpleSymbol("Action").readResolve());
    static final SimpleSymbol Lit23 = ((SimpleSymbol) new SimpleSymbol("StartActivity").readResolve());
    static final SimpleSymbol Lit24 = ((SimpleSymbol) new SimpleSymbol("lblLang").readResolve());
    static final SimpleSymbol Lit25 = ((SimpleSymbol) new SimpleSymbol("Text").readResolve());
    static final SimpleSymbol Lit26 = ((SimpleSymbol) new SimpleSymbol("TextToSpeech1").readResolve());
    static final SimpleSymbol Lit27 = ((SimpleSymbol) new SimpleSymbol("Language").readResolve());
    static final SimpleSymbol Lit28 = ((SimpleSymbol) new SimpleSymbol("Screen1$Initialize").readResolve());
    static final SimpleSymbol Lit29 = ((SimpleSymbol) new SimpleSymbol("Initialize").readResolve());
    static final SimpleSymbol Lit3 = ((SimpleSymbol) new SimpleSymbol("AlignHorizontal").readResolve());
    static final FString Lit30 = new FString("com.google.appinventor.components.runtime.HorizontalArrangement");
    static final SimpleSymbol Lit31 = ((SimpleSymbol) new SimpleSymbol("Ust").readResolve());
    static final SimpleSymbol Lit32 = ((SimpleSymbol) new SimpleSymbol("Width").readResolve());
    static final IntNum Lit33 = IntNum.make(-2);
    static final FString Lit34 = new FString("com.google.appinventor.components.runtime.HorizontalArrangement");
    static final FString Lit35 = new FString("com.google.appinventor.components.runtime.ListPicker");
    static final SimpleSymbol Lit36 = ((SimpleSymbol) new SimpleSymbol("btnConnect").readResolve());
    static final SimpleSymbol Lit37 = ((SimpleSymbol) new SimpleSymbol("FontSize").readResolve());
    static final IntNum Lit38 = IntNum.make(12);
    static final SimpleSymbol Lit39 = ((SimpleSymbol) new SimpleSymbol("Image").readResolve());
    static final IntNum Lit4 = IntNum.make(3);
    static final SimpleSymbol Lit40 = ((SimpleSymbol) new SimpleSymbol("TextColor").readResolve());
    static final IntNum Lit41;
    static final FString Lit42 = new FString("com.google.appinventor.components.runtime.ListPicker");
    static final SimpleSymbol Lit43 = ((SimpleSymbol) new SimpleSymbol("Elements").readResolve());
    static final SimpleSymbol Lit44 = ((SimpleSymbol) new SimpleSymbol("AddressesAndNames").readResolve());
    static final SimpleSymbol Lit45 = ((SimpleSymbol) new SimpleSymbol("list").readResolve());
    static final SimpleSymbol Lit46 = ((SimpleSymbol) new SimpleSymbol("btnConnect$BeforePicking").readResolve());
    static final SimpleSymbol Lit47 = ((SimpleSymbol) new SimpleSymbol("BeforePicking").readResolve());
    static final SimpleSymbol Lit48 = ((SimpleSymbol) new SimpleSymbol("Selection").readResolve());
    static final SimpleSymbol Lit49 = ((SimpleSymbol) new SimpleSymbol("Connect").readResolve());
    static final SimpleSymbol Lit5;
    static final PairWithPosition Lit50 = PairWithPosition.make(Lit7, LList.Empty, "/tmp/1519769971818_0.8604563026951658-0/youngandroidproject/../src/appinventor/ai_cempehlivan92/Arduino_Sesli_Kontrol/Screen1.yail", 209060);
    static final SimpleSymbol Lit51 = ((SimpleSymbol) new SimpleSymbol("IsConnected").readResolve());
    static final SimpleSymbol Lit52 = ((SimpleSymbol) new SimpleSymbol("Durum").readResolve());
    static final IntNum Lit53 = IntNum.make(-13369549);
    static final SimpleSymbol Lit54 = ((SimpleSymbol) new SimpleSymbol("btnConnect$AfterPicking").readResolve());
    static final SimpleSymbol Lit55 = ((SimpleSymbol) new SimpleSymbol("AfterPicking").readResolve());
    static final FString Lit56 = new FString("com.google.appinventor.components.runtime.Button");
    static final SimpleSymbol Lit57 = ((SimpleSymbol) new SimpleSymbol("btnDisconnect").readResolve());
    static final IntNum Lit58;
    static final FString Lit59 = new FString("com.google.appinventor.components.runtime.Button");
    static final SimpleSymbol Lit6 = ((SimpleSymbol) new SimpleSymbol("AppName").readResolve());
    static final SimpleSymbol Lit60 = ((SimpleSymbol) new SimpleSymbol("Disconnect").readResolve());
    static final IntNum Lit61 = IntNum.make(-65536);
    static final SimpleSymbol Lit62 = ((SimpleSymbol) new SimpleSymbol("btnDisconnect$Click").readResolve());
    static final SimpleSymbol Lit63 = ((SimpleSymbol) new SimpleSymbol("Click").readResolve());
    static final FString Lit64 = new FString("com.google.appinventor.components.runtime.ListPicker");
    static final SimpleSymbol Lit65 = ((SimpleSymbol) new SimpleSymbol("btnChangeLanguage").readResolve());
    static final SimpleSymbol Lit66 = ((SimpleSymbol) new SimpleSymbol("ShowFilterBar").readResolve());
    static final IntNum Lit67;
    static final FString Lit68 = new FString("com.google.appinventor.components.runtime.ListPicker");
    static final SimpleSymbol Lit69 = ((SimpleSymbol) new SimpleSymbol("AvailableLanguages").readResolve());
    static final SimpleSymbol Lit7;
    static final SimpleSymbol Lit70 = ((SimpleSymbol) new SimpleSymbol("btnChangeLanguage$BeforePicking").readResolve());
    static final SimpleSymbol Lit71 = ((SimpleSymbol) new SimpleSymbol("btnChangeLanguage$AfterPicking").readResolve());
    static final FString Lit72 = new FString("com.google.appinventor.components.runtime.HorizontalArrangement");
    static final SimpleSymbol Lit73 = ((SimpleSymbol) new SimpleSymbol("HorizontalArrangement1").readResolve());
    static final SimpleSymbol Lit74 = ((SimpleSymbol) new SimpleSymbol("AlignVertical").readResolve());
    static final IntNum Lit75 = IntNum.make(2);
    static final SimpleSymbol Lit76 = ((SimpleSymbol) new SimpleSymbol("Height").readResolve());
    static final IntNum Lit77 = IntNum.make(20);
    static final FString Lit78 = new FString("com.google.appinventor.components.runtime.HorizontalArrangement");
    static final FString Lit79 = new FString("com.google.appinventor.components.runtime.Label");
    static final SimpleSymbol Lit8 = ((SimpleSymbol) new SimpleSymbol("BackgroundColor").readResolve());
    static final SimpleSymbol Lit80 = ((SimpleSymbol) new SimpleSymbol("Label1").readResolve());
    static final IntNum Lit81;
    static final FString Lit82 = new FString("com.google.appinventor.components.runtime.Label");
    static final FString Lit83 = new FString("com.google.appinventor.components.runtime.Label");
    static final IntNum Lit84;
    static final FString Lit85 = new FString("com.google.appinventor.components.runtime.Label");
    static final FString Lit86 = new FString("com.google.appinventor.components.runtime.Label");
    static final SimpleSymbol Lit87 = ((SimpleSymbol) new SimpleSymbol("Label2").readResolve());
    static final IntNum Lit88;
    static final FString Lit89 = new FString("com.google.appinventor.components.runtime.Label");
    static final IntNum Lit9 = IntNum.make(16777215);
    static final FString Lit90 = new FString("com.google.appinventor.components.runtime.Label");
    static final IntNum Lit91;
    static final FString Lit92 = new FString("com.google.appinventor.components.runtime.Label");
    static final FString Lit93 = new FString("com.google.appinventor.components.runtime.HorizontalArrangement");
    static final SimpleSymbol Lit94 = ((SimpleSymbol) new SimpleSymbol("Orta").readResolve());
    static final FString Lit95 = new FString("com.google.appinventor.components.runtime.HorizontalArrangement");
    static final FString Lit96 = new FString("com.google.appinventor.components.runtime.Button");
    static final SimpleSymbol Lit97 = ((SimpleSymbol) new SimpleSymbol("mic").readResolve());
    static final SimpleSymbol Lit98 = ((SimpleSymbol) new SimpleSymbol("ShowFeedback").readResolve());
    static final FString Lit99 = new FString("com.google.appinventor.components.runtime.Button");
    public static Screen1 Screen1;
    static final ModuleMethod lambda$Fn1 = null;
    static final ModuleMethod lambda$Fn10 = null;
    static final ModuleMethod lambda$Fn11 = null;
    static final ModuleMethod lambda$Fn12 = null;
    static final ModuleMethod lambda$Fn13 = null;
    static final ModuleMethod lambda$Fn14 = null;
    static final ModuleMethod lambda$Fn15 = null;
    static final ModuleMethod lambda$Fn16 = null;
    static final ModuleMethod lambda$Fn17 = null;
    static final ModuleMethod lambda$Fn18 = null;
    static final ModuleMethod lambda$Fn19 = null;
    static final ModuleMethod lambda$Fn2 = null;
    static final ModuleMethod lambda$Fn20 = null;
    static final ModuleMethod lambda$Fn21 = null;
    static final ModuleMethod lambda$Fn22 = null;
    static final ModuleMethod lambda$Fn23 = null;
    static final ModuleMethod lambda$Fn24 = null;
    static final ModuleMethod lambda$Fn25 = null;
    static final ModuleMethod lambda$Fn26 = null;
    static final ModuleMethod lambda$Fn27 = null;
    static final ModuleMethod lambda$Fn28 = null;
    static final ModuleMethod lambda$Fn3 = null;
    static final ModuleMethod lambda$Fn4 = null;
    static final ModuleMethod lambda$Fn5 = null;
    static final ModuleMethod lambda$Fn6 = null;
    static final ModuleMethod lambda$Fn7 = null;
    static final ModuleMethod lambda$Fn8 = null;
    static final ModuleMethod lambda$Fn9 = null;
    public Boolean $Stdebug$Mnform$St;
    public final ModuleMethod $define;
    public ActivityStarter ActivityStarter1;
    public Notifier Bildirim;
    public BluetoothClient BluetoothClient1;
    public Clock Clock1;
    public final ModuleMethod Clock1$Timer;
    public Label Durum;
    public HorizontalArrangement HorizontalArrangement1;
    public Label Label1;
    public Label Label2;
    public HorizontalArrangement Orta;
    public final ModuleMethod Screen1$Initialize;
    public SpeechRecognizer SpeechRecognizer1;
    public final ModuleMethod SpeechRecognizer1$AfterGettingText;
    public TextToSpeech TextToSpeech1;
    public TinyDB TinyDB1;
    public HorizontalArrangement Ust;
    public final ModuleMethod add$Mnto$Mncomponents;
    public final ModuleMethod add$Mnto$Mnevents;
    public final ModuleMethod add$Mnto$Mnform$Mndo$Mnafter$Mncreation;
    public final ModuleMethod add$Mnto$Mnform$Mnenvironment;
    public final ModuleMethod add$Mnto$Mnglobal$Mnvar$Mnenvironment;
    public final ModuleMethod add$Mnto$Mnglobal$Mnvars;
    public final ModuleMethod android$Mnlog$Mnform;
    public ListPicker btnChangeLanguage;
    public final ModuleMethod btnChangeLanguage$AfterPicking;
    public final ModuleMethod btnChangeLanguage$BeforePicking;
    public ListPicker btnConnect;
    public final ModuleMethod btnConnect$AfterPicking;
    public final ModuleMethod btnConnect$BeforePicking;
    public Button btnDisconnect;
    public final ModuleMethod btnDisconnect$Click;
    public LList components$Mnto$Mncreate;
    public final ModuleMethod dispatchEvent;
    public LList events$Mnto$Mnregister;
    public LList form$Mndo$Mnafter$Mncreation;
    public Environment form$Mnenvironment;
    public Symbol form$Mnname$Mnsymbol;
    public Environment global$Mnvar$Mnenvironment;
    public LList global$Mnvars$Mnto$Mncreate;
    public final ModuleMethod is$Mnbound$Mnin$Mnform$Mnenvironment;
    public Label lblLang;
    public final ModuleMethod lookup$Mnhandler;
    public final ModuleMethod lookup$Mnin$Mnform$Mnenvironment;
    public Button mic;
    public final ModuleMethod mic$Click;
    public final ModuleMethod process$Mnexception;
    public final ModuleMethod send$Mnerror;

    /* compiled from: Screen1.yail */
    public class frame extends ModuleBody {
        Screen1 $main = this;

        public int match1(ModuleMethod moduleMethod, Object obj, CallContext callContext) {
            switch (moduleMethod.selector) {
                case 1:
                    callContext.value1 = obj;
                    callContext.proc = moduleMethod;
                    callContext.pc = 1;
                    return 0;
                case 3:
                    if (!(obj instanceof Symbol)) {
                        return -786431;
                    }
                    callContext.value1 = obj;
                    callContext.proc = moduleMethod;
                    callContext.pc = 1;
                    return 0;
                case 5:
                    if (!(obj instanceof Symbol)) {
                        return -786431;
                    }
                    callContext.value1 = obj;
                    callContext.proc = moduleMethod;
                    callContext.pc = 1;
                    return 0;
                case 10:
                    callContext.value1 = obj;
                    callContext.proc = moduleMethod;
                    callContext.pc = 1;
                    return 0;
                case 11:
                    callContext.value1 = obj;
                    callContext.proc = moduleMethod;
                    callContext.pc = 1;
                    return 0;
                case 12:
                    if (!(obj instanceof Screen1)) {
                        return -786431;
                    }
                    callContext.value1 = obj;
                    callContext.proc = moduleMethod;
                    callContext.pc = 1;
                    return 0;
                case 47:
                    callContext.value1 = obj;
                    callContext.proc = moduleMethod;
                    callContext.pc = 1;
                    return 0;
                default:
                    return super.match1(moduleMethod, obj, callContext);
            }
        }

        public int match2(ModuleMethod moduleMethod, Object obj, Object obj2, CallContext callContext) {
            switch (moduleMethod.selector) {
                case 2:
                    if (!(obj instanceof Symbol)) {
                        return -786431;
                    }
                    callContext.value1 = obj;
                    callContext.value2 = obj2;
                    callContext.proc = moduleMethod;
                    callContext.pc = 2;
                    return 0;
                case 3:
                    if (!(obj instanceof Symbol)) {
                        return -786431;
                    }
                    callContext.value1 = obj;
                    callContext.value2 = obj2;
                    callContext.proc = moduleMethod;
                    callContext.pc = 2;
                    return 0;
                case 6:
                    if (!(obj instanceof Symbol)) {
                        return -786431;
                    }
                    callContext.value1 = obj;
                    callContext.value2 = obj2;
                    callContext.proc = moduleMethod;
                    callContext.pc = 2;
                    return 0;
                case 7:
                    callContext.value1 = obj;
                    callContext.value2 = obj2;
                    callContext.proc = moduleMethod;
                    callContext.pc = 2;
                    return 0;
                case 9:
                    callContext.value1 = obj;
                    callContext.value2 = obj2;
                    callContext.proc = moduleMethod;
                    callContext.pc = 2;
                    return 0;
                case 14:
                    callContext.value1 = obj;
                    callContext.value2 = obj2;
                    callContext.proc = moduleMethod;
                    callContext.pc = 2;
                    return 0;
                default:
                    return super.match2(moduleMethod, obj, obj2, callContext);
            }
        }

        public int match4(ModuleMethod moduleMethod, Object obj, Object obj2, Object obj3, Object obj4, CallContext callContext) {
            switch (moduleMethod.selector) {
                case 8:
                    callContext.value1 = obj;
                    callContext.value2 = obj2;
                    callContext.value3 = obj3;
                    callContext.value4 = obj4;
                    callContext.proc = moduleMethod;
                    callContext.pc = 4;
                    return 0;
                case 13:
                    if (!(obj instanceof Screen1)) {
                        return -786431;
                    }
                    callContext.value1 = obj;
                    if (!(obj2 instanceof Component)) {
                        return -786430;
                    }
                    callContext.value2 = obj2;
                    if (!(obj3 instanceof String)) {
                        return -786429;
                    }
                    callContext.value3 = obj3;
                    if (!(obj4 instanceof String)) {
                        return -786428;
                    }
                    callContext.value4 = obj4;
                    callContext.proc = moduleMethod;
                    callContext.pc = 4;
                    return 0;
                default:
                    return super.match4(moduleMethod, obj, obj2, obj3, obj4, callContext);
            }
        }

        public Object apply1(ModuleMethod moduleMethod, Object obj) {
            switch (moduleMethod.selector) {
                case 1:
                    this.$main.androidLogForm(obj);
                    return Values.empty;
                case 3:
                    try {
                        return this.$main.lookupInFormEnvironment((Symbol) obj);
                    } catch (ClassCastException e) {
                        throw new WrongType(e, "lookup-in-form-environment", 1, obj);
                    }
                case 5:
                    try {
                        return this.$main.isBoundInFormEnvironment((Symbol) obj) ? Boolean.TRUE : Boolean.FALSE;
                    } catch (ClassCastException e2) {
                        throw new WrongType(e2, "is-bound-in-form-environment", 1, obj);
                    }
                case 10:
                    this.$main.addToFormDoAfterCreation(obj);
                    return Values.empty;
                case 11:
                    this.$main.sendError(obj);
                    return Values.empty;
                case 12:
                    this.$main.processException(obj);
                    return Values.empty;
                case 47:
                    return this.$main.SpeechRecognizer1$AfterGettingText(obj);
                default:
                    return super.apply1(moduleMethod, obj);
            }
        }

        public Object apply4(ModuleMethod moduleMethod, Object obj, Object obj2, Object obj3, Object obj4) {
            switch (moduleMethod.selector) {
                case 8:
                    this.$main.addToComponents(obj, obj2, obj3, obj4);
                    return Values.empty;
                case 13:
                    try {
                        try {
                            try {
                                try {
                                    return this.$main.dispatchEvent((Component) obj, (String) obj2, (String) obj3, (Object[]) obj4) ? Boolean.TRUE : Boolean.FALSE;
                                } catch (ClassCastException e) {
                                    throw new WrongType(e, "dispatchEvent", 4, obj4);
                                }
                            } catch (ClassCastException e2) {
                                throw new WrongType(e2, "dispatchEvent", 3, obj3);
                            }
                        } catch (ClassCastException e22) {
                            throw new WrongType(e22, "dispatchEvent", 2, obj2);
                        }
                    } catch (ClassCastException e222) {
                        throw new WrongType(e222, "dispatchEvent", 1, obj);
                    }
                default:
                    return super.apply4(moduleMethod, obj, obj2, obj3, obj4);
            }
        }

        public Object apply2(ModuleMethod moduleMethod, Object obj, Object obj2) {
            switch (moduleMethod.selector) {
                case 2:
                    try {
                        this.$main.addToFormEnvironment((Symbol) obj, obj2);
                        return Values.empty;
                    } catch (ClassCastException e) {
                        throw new WrongType(e, "add-to-form-environment", 1, obj);
                    }
                case 3:
                    try {
                        return this.$main.lookupInFormEnvironment((Symbol) obj, obj2);
                    } catch (ClassCastException e2) {
                        throw new WrongType(e2, "lookup-in-form-environment", 1, obj);
                    }
                case 6:
                    try {
                        this.$main.addToGlobalVarEnvironment((Symbol) obj, obj2);
                        return Values.empty;
                    } catch (ClassCastException e22) {
                        throw new WrongType(e22, "add-to-global-var-environment", 1, obj);
                    }
                case 7:
                    this.$main.addToEvents(obj, obj2);
                    return Values.empty;
                case 9:
                    this.$main.addToGlobalVars(obj, obj2);
                    return Values.empty;
                case 14:
                    return this.$main.lookupHandler(obj, obj2);
                default:
                    return super.apply2(moduleMethod, obj, obj2);
            }
        }

        public Object apply0(ModuleMethod moduleMethod) {
            switch (moduleMethod.selector) {
                case 15:
                    return Screen1.lambda2();
                case 16:
                    this.$main.$define();
                    return Values.empty;
                case 17:
                    return Screen1.lambda3();
                case 18:
                    return this.$main.Screen1$Initialize();
                case 19:
                    return Screen1.lambda4();
                case 20:
                    return Screen1.lambda5();
                case 21:
                    return Screen1.lambda6();
                case 22:
                    return Screen1.lambda7();
                case 23:
                    return this.$main.btnConnect$BeforePicking();
                case 24:
                    return this.$main.btnConnect$AfterPicking();
                case 25:
                    return Screen1.lambda8();
                case 26:
                    return Screen1.lambda9();
                case 27:
                    return this.$main.btnDisconnect$Click();
                case 28:
                    return Screen1.lambda10();
                case 29:
                    return Screen1.lambda11();
                case 30:
                    return this.$main.btnChangeLanguage$BeforePicking();
                case 31:
                    return this.$main.btnChangeLanguage$AfterPicking();
                case 32:
                    return Screen1.lambda12();
                case 33:
                    return Screen1.lambda13();
                case 34:
                    return Screen1.lambda14();
                case 35:
                    return Screen1.lambda15();
                case 36:
                    return Screen1.lambda16();
                case 37:
                    return Screen1.lambda17();
                case 38:
                    return Screen1.lambda18();
                case 39:
                    return Screen1.lambda19();
                case 40:
                    return Screen1.lambda20();
                case 41:
                    return Screen1.lambda21();
                case 42:
                    return Screen1.lambda22();
                case 43:
                    return Screen1.lambda23();
                case 44:
                    return Screen1.lambda24();
                case 45:
                    return Screen1.lambda25();
                case 46:
                    return this.$main.mic$Click();
                case 48:
                    return Screen1.lambda26();
                case 49:
                    return Screen1.lambda27();
                case 50:
                    return Screen1.lambda28();
                case 51:
                    return Screen1.lambda29();
                case 52:
                    return this.$main.Clock1$Timer();
                default:
                    return super.apply0(moduleMethod);
            }
        }

        public int match0(ModuleMethod moduleMethod, CallContext callContext) {
            switch (moduleMethod.selector) {
                case 15:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 16:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 17:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 18:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 19:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 20:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 21:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 22:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 23:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 24:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 25:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 26:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 27:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 28:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 29:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 30:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 31:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 32:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 33:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 34:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 35:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 36:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 37:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 38:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 39:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 40:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 41:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 42:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 43:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 44:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 45:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 46:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 48:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 49:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 50:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 51:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 52:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                default:
                    return super.match0(moduleMethod, callContext);
            }
        }
    }

    static {
        SimpleSymbol simpleSymbol = (SimpleSymbol) new SimpleSymbol(PropertyTypeConstants.PROPERTY_TYPE_TEXT).readResolve();
        Lit7 = simpleSymbol;
        Lit136 = PairWithPosition.make(simpleSymbol, LList.Empty, "/tmp/1519769971818_0.8604563026951658-0/youngandroidproject/../src/appinventor/ai_cempehlivan92/Arduino_Sesli_Kontrol/Screen1.yail", 819683);
        simpleSymbol = (SimpleSymbol) new SimpleSymbol("number").readResolve();
        Lit5 = simpleSymbol;
        Lit135 = PairWithPosition.make(simpleSymbol, LList.Empty, "/tmp/1519769971818_0.8604563026951658-0/youngandroidproject/../src/appinventor/ai_cempehlivan92/Arduino_Sesli_Kontrol/Screen1.yail", 819671);
        int[] iArr = new int[2];
        iArr[0] = -1;
        Lit91 = IntNum.make(iArr);
        iArr = new int[2];
        iArr[0] = Component.COLOR_LTGRAY;
        Lit88 = IntNum.make(iArr);
        iArr = new int[2];
        iArr[0] = -65536;
        Lit84 = IntNum.make(iArr);
        iArr = new int[2];
        iArr[0] = Component.COLOR_LTGRAY;
        Lit81 = IntNum.make(iArr);
        iArr = new int[2];
        iArr[0] = -1;
        Lit67 = IntNum.make(iArr);
        iArr = new int[2];
        iArr[0] = -1;
        Lit58 = IntNum.make(iArr);
        iArr = new int[2];
        iArr[0] = -1;
        Lit41 = IntNum.make(iArr);
    }

    public Screen1() {
        ModuleInfo.register(this);
        ModuleBody frame = new frame();
        this.android$Mnlog$Mnform = new ModuleMethod(frame, 1, Lit141, FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
        this.add$Mnto$Mnform$Mnenvironment = new ModuleMethod(frame, 2, Lit142, 8194);
        this.lookup$Mnin$Mnform$Mnenvironment = new ModuleMethod(frame, 3, Lit143, 8193);
        this.is$Mnbound$Mnin$Mnform$Mnenvironment = new ModuleMethod(frame, 5, Lit144, FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
        this.add$Mnto$Mnglobal$Mnvar$Mnenvironment = new ModuleMethod(frame, 6, Lit145, 8194);
        this.add$Mnto$Mnevents = new ModuleMethod(frame, 7, Lit146, 8194);
        this.add$Mnto$Mncomponents = new ModuleMethod(frame, 8, Lit147, 16388);
        this.add$Mnto$Mnglobal$Mnvars = new ModuleMethod(frame, 9, Lit148, 8194);
        this.add$Mnto$Mnform$Mndo$Mnafter$Mncreation = new ModuleMethod(frame, 10, Lit149, FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
        this.send$Mnerror = new ModuleMethod(frame, 11, Lit150, FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
        this.process$Mnexception = new ModuleMethod(frame, 12, "process-exception", FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
        this.dispatchEvent = new ModuleMethod(frame, 13, Lit151, 16388);
        this.lookup$Mnhandler = new ModuleMethod(frame, 14, Lit152, 8194);
        PropertySet moduleMethod = new ModuleMethod(frame, 15, null, 0);
        moduleMethod.setProperty("source-location", "/tmp/runtime7626381045890334216.scm:553");
        lambda$Fn1 = moduleMethod;
        this.$define = new ModuleMethod(frame, 16, "$define", 0);
        lambda$Fn2 = new ModuleMethod(frame, 17, null, 0);
        this.Screen1$Initialize = new ModuleMethod(frame, 18, Lit28, 0);
        lambda$Fn3 = new ModuleMethod(frame, 19, null, 0);
        lambda$Fn4 = new ModuleMethod(frame, 20, null, 0);
        lambda$Fn5 = new ModuleMethod(frame, 21, null, 0);
        lambda$Fn6 = new ModuleMethod(frame, 22, null, 0);
        this.btnConnect$BeforePicking = new ModuleMethod(frame, 23, Lit46, 0);
        this.btnConnect$AfterPicking = new ModuleMethod(frame, 24, Lit54, 0);
        lambda$Fn7 = new ModuleMethod(frame, 25, null, 0);
        lambda$Fn8 = new ModuleMethod(frame, 26, null, 0);
        this.btnDisconnect$Click = new ModuleMethod(frame, 27, Lit62, 0);
        lambda$Fn9 = new ModuleMethod(frame, 28, null, 0);
        lambda$Fn10 = new ModuleMethod(frame, 29, null, 0);
        this.btnChangeLanguage$BeforePicking = new ModuleMethod(frame, 30, Lit70, 0);
        this.btnChangeLanguage$AfterPicking = new ModuleMethod(frame, 31, Lit71, 0);
        lambda$Fn11 = new ModuleMethod(frame, 32, null, 0);
        lambda$Fn12 = new ModuleMethod(frame, 33, null, 0);
        lambda$Fn13 = new ModuleMethod(frame, 34, null, 0);
        lambda$Fn14 = new ModuleMethod(frame, 35, null, 0);
        lambda$Fn15 = new ModuleMethod(frame, 36, null, 0);
        lambda$Fn16 = new ModuleMethod(frame, 37, null, 0);
        lambda$Fn17 = new ModuleMethod(frame, 38, null, 0);
        lambda$Fn18 = new ModuleMethod(frame, 39, null, 0);
        lambda$Fn19 = new ModuleMethod(frame, 40, null, 0);
        lambda$Fn20 = new ModuleMethod(frame, 41, null, 0);
        lambda$Fn21 = new ModuleMethod(frame, 42, null, 0);
        lambda$Fn22 = new ModuleMethod(frame, 43, null, 0);
        lambda$Fn23 = new ModuleMethod(frame, 44, null, 0);
        lambda$Fn24 = new ModuleMethod(frame, 45, null, 0);
        this.mic$Click = new ModuleMethod(frame, 46, Lit106, 0);
        this.SpeechRecognizer1$AfterGettingText = new ModuleMethod(frame, 47, Lit116, FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
        lambda$Fn25 = new ModuleMethod(frame, 48, null, 0);
        lambda$Fn26 = new ModuleMethod(frame, 49, null, 0);
        lambda$Fn27 = new ModuleMethod(frame, 50, null, 0);
        lambda$Fn28 = new ModuleMethod(frame, 51, null, 0);
        this.Clock1$Timer = new ModuleMethod(frame, 52, Lit137, 0);
    }

    public Object lookupInFormEnvironment(Symbol symbol) {
        return lookupInFormEnvironment(symbol, Boolean.FALSE);
    }

    public void run() {
        Throwable th;
        CallContext instance = CallContext.getInstance();
        Consumer consumer = instance.consumer;
        instance.consumer = VoidConsumer.instance;
        try {
            run(instance);
            th = null;
        } catch (Throwable th2) {
            th = th2;
        }
        ModuleBody.runCleanup(instance, th, consumer);
    }

    public final void run(CallContext $ctx) {
        Consumer $result = $ctx.consumer;
        Object find = require.find("com.google.youngandroid.runtime");
        try {
            String str;
            ((Runnable) find).run();
            this.$Stdebug$Mnform$St = Boolean.FALSE;
            this.form$Mnenvironment = Environment.make(misc.symbol$To$String(Lit0));
            FString stringAppend = strings.stringAppend(misc.symbol$To$String(Lit0), "-global-vars");
            if (stringAppend == null) {
                str = null;
            } else {
                str = stringAppend.toString();
            }
            this.global$Mnvar$Mnenvironment = Environment.make(str);
            Screen1 = null;
            this.form$Mnname$Mnsymbol = Lit0;
            this.events$Mnto$Mnregister = LList.Empty;
            this.components$Mnto$Mncreate = LList.Empty;
            this.global$Mnvars$Mnto$Mncreate = LList.Empty;
            this.form$Mndo$Mnafter$Mncreation = LList.Empty;
            find = require.find("com.google.youngandroid.runtime");
            try {
                ((Runnable) find).run();
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    runtime.setAndCoerceProperty$Ex(Lit0, Lit3, Lit4, Lit5);
                    runtime.setAndCoerceProperty$Ex(Lit0, Lit6, "Arduino Voice Control", Lit7);
                    runtime.setAndCoerceProperty$Ex(Lit0, Lit8, Lit9, Lit5);
                    runtime.setAndCoerceProperty$Ex(Lit0, Lit10, "BG.jpg", Lit7);
                    runtime.setAndCoerceProperty$Ex(Lit0, Lit11, "logo.png", Lit7);
                    runtime.setAndCoerceProperty$Ex(Lit0, Lit12, Boolean.FALSE, Lit13);
                    runtime.setAndCoerceProperty$Ex(Lit0, Lit14, "Arduino Voice Control", Lit7);
                    runtime.setAndCoerceProperty$Ex(Lit0, Lit15, Boolean.FALSE, Lit13);
                    runtime.setAndCoerceProperty$Ex(Lit0, Lit16, Lit4, Lit5);
                    Values.writeValues(runtime.setAndCoerceProperty$Ex(Lit0, Lit17, "1.2", Lit7), $result);
                } else {
                    addToFormDoAfterCreation(new Promise(lambda$Fn2));
                }
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    runtime.addToCurrentFormEnvironment(Lit28, this.Screen1$Initialize);
                } else {
                    addToFormEnvironment(Lit28, this.Screen1$Initialize);
                }
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    EventDispatcher.registerEventForDelegation((HandlesEventDispatching) runtime.$Stthis$Mnform$St, "Screen1", "Initialize");
                } else {
                    addToEvents(Lit0, Lit29);
                }
                this.Ust = null;
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(runtime.addComponentWithinRepl(Lit0, Lit30, Lit31, lambda$Fn3), $result);
                } else {
                    addToComponents(Lit0, Lit34, Lit31, lambda$Fn4);
                }
                this.btnConnect = null;
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(runtime.addComponentWithinRepl(Lit31, Lit35, Lit36, lambda$Fn5), $result);
                } else {
                    addToComponents(Lit31, Lit42, Lit36, lambda$Fn6);
                }
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    runtime.addToCurrentFormEnvironment(Lit46, this.btnConnect$BeforePicking);
                } else {
                    addToFormEnvironment(Lit46, this.btnConnect$BeforePicking);
                }
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    EventDispatcher.registerEventForDelegation((HandlesEventDispatching) runtime.$Stthis$Mnform$St, "btnConnect", "BeforePicking");
                } else {
                    addToEvents(Lit36, Lit47);
                }
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    runtime.addToCurrentFormEnvironment(Lit54, this.btnConnect$AfterPicking);
                } else {
                    addToFormEnvironment(Lit54, this.btnConnect$AfterPicking);
                }
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    EventDispatcher.registerEventForDelegation((HandlesEventDispatching) runtime.$Stthis$Mnform$St, "btnConnect", "AfterPicking");
                } else {
                    addToEvents(Lit36, Lit55);
                }
                this.btnDisconnect = null;
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(runtime.addComponentWithinRepl(Lit31, Lit56, Lit57, lambda$Fn7), $result);
                } else {
                    addToComponents(Lit31, Lit59, Lit57, lambda$Fn8);
                }
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    runtime.addToCurrentFormEnvironment(Lit62, this.btnDisconnect$Click);
                } else {
                    addToFormEnvironment(Lit62, this.btnDisconnect$Click);
                }
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    EventDispatcher.registerEventForDelegation((HandlesEventDispatching) runtime.$Stthis$Mnform$St, "btnDisconnect", "Click");
                } else {
                    addToEvents(Lit57, Lit63);
                }
                this.btnChangeLanguage = null;
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(runtime.addComponentWithinRepl(Lit31, Lit64, Lit65, lambda$Fn9), $result);
                } else {
                    addToComponents(Lit31, Lit68, Lit65, lambda$Fn10);
                }
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    runtime.addToCurrentFormEnvironment(Lit70, this.btnChangeLanguage$BeforePicking);
                } else {
                    addToFormEnvironment(Lit70, this.btnChangeLanguage$BeforePicking);
                }
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    EventDispatcher.registerEventForDelegation((HandlesEventDispatching) runtime.$Stthis$Mnform$St, "btnChangeLanguage", "BeforePicking");
                } else {
                    addToEvents(Lit65, Lit47);
                }
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    runtime.addToCurrentFormEnvironment(Lit71, this.btnChangeLanguage$AfterPicking);
                } else {
                    addToFormEnvironment(Lit71, this.btnChangeLanguage$AfterPicking);
                }
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    EventDispatcher.registerEventForDelegation((HandlesEventDispatching) runtime.$Stthis$Mnform$St, "btnChangeLanguage", "AfterPicking");
                } else {
                    addToEvents(Lit65, Lit55);
                }
                this.HorizontalArrangement1 = null;
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(runtime.addComponentWithinRepl(Lit0, Lit72, Lit73, lambda$Fn11), $result);
                } else {
                    addToComponents(Lit0, Lit78, Lit73, lambda$Fn12);
                }
                this.Label1 = null;
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(runtime.addComponentWithinRepl(Lit73, Lit79, Lit80, lambda$Fn13), $result);
                } else {
                    addToComponents(Lit73, Lit82, Lit80, lambda$Fn14);
                }
                this.Durum = null;
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(runtime.addComponentWithinRepl(Lit73, Lit83, Lit52, lambda$Fn15), $result);
                } else {
                    addToComponents(Lit73, Lit85, Lit52, lambda$Fn16);
                }
                this.Label2 = null;
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(runtime.addComponentWithinRepl(Lit73, Lit86, Lit87, lambda$Fn17), $result);
                } else {
                    addToComponents(Lit73, Lit89, Lit87, lambda$Fn18);
                }
                this.lblLang = null;
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(runtime.addComponentWithinRepl(Lit73, Lit90, Lit24, lambda$Fn19), $result);
                } else {
                    addToComponents(Lit73, Lit92, Lit24, lambda$Fn20);
                }
                this.Orta = null;
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(runtime.addComponentWithinRepl(Lit0, Lit93, Lit94, lambda$Fn21), $result);
                } else {
                    addToComponents(Lit0, Lit95, Lit94, lambda$Fn22);
                }
                this.mic = null;
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(runtime.addComponentWithinRepl(Lit94, Lit96, Lit97, lambda$Fn23), $result);
                } else {
                    addToComponents(Lit94, Lit99, Lit97, lambda$Fn24);
                }
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    runtime.addToCurrentFormEnvironment(Lit106, this.mic$Click);
                } else {
                    addToFormEnvironment(Lit106, this.mic$Click);
                }
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    EventDispatcher.registerEventForDelegation((HandlesEventDispatching) runtime.$Stthis$Mnform$St, "mic", "Click");
                } else {
                    addToEvents(Lit97, Lit63);
                }
                this.Bildirim = null;
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(runtime.addComponentWithinRepl(Lit0, Lit107, Lit102, Boolean.FALSE), $result);
                } else {
                    addToComponents(Lit0, Lit108, Lit102, Boolean.FALSE);
                }
                this.SpeechRecognizer1 = null;
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(runtime.addComponentWithinRepl(Lit0, Lit109, Lit100, Boolean.FALSE), $result);
                } else {
                    addToComponents(Lit0, Lit110, Lit100, Boolean.FALSE);
                }
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    runtime.addToCurrentFormEnvironment(Lit116, this.SpeechRecognizer1$AfterGettingText);
                } else {
                    addToFormEnvironment(Lit116, this.SpeechRecognizer1$AfterGettingText);
                }
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    EventDispatcher.registerEventForDelegation((HandlesEventDispatching) runtime.$Stthis$Mnform$St, "SpeechRecognizer1", "AfterGettingText");
                } else {
                    addToEvents(Lit100, Lit117);
                }
                this.BluetoothClient1 = null;
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(runtime.addComponentWithinRepl(Lit0, Lit118, Lit18, Boolean.FALSE), $result);
                } else {
                    addToComponents(Lit0, Lit119, Lit18, Boolean.FALSE);
                }
                this.ActivityStarter1 = null;
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(runtime.addComponentWithinRepl(Lit0, Lit120, Lit21, Boolean.FALSE), $result);
                } else {
                    addToComponents(Lit0, Lit121, Lit21, Boolean.FALSE);
                }
                this.TinyDB1 = null;
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(runtime.addComponentWithinRepl(Lit0, Lit122, Lit123, Boolean.FALSE), $result);
                } else {
                    addToComponents(Lit0, Lit124, Lit123, Boolean.FALSE);
                }
                this.Clock1 = null;
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(runtime.addComponentWithinRepl(Lit0, Lit125, Lit126, lambda$Fn25), $result);
                } else {
                    addToComponents(Lit0, Lit129, Lit126, lambda$Fn26);
                }
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    runtime.addToCurrentFormEnvironment(Lit137, this.Clock1$Timer);
                } else {
                    addToFormEnvironment(Lit137, this.Clock1$Timer);
                }
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    EventDispatcher.registerEventForDelegation((HandlesEventDispatching) runtime.$Stthis$Mnform$St, "Clock1", "Timer");
                } else {
                    addToEvents(Lit126, Lit138);
                }
                this.TextToSpeech1 = null;
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(runtime.addComponentWithinRepl(Lit0, Lit139, Lit26, Boolean.FALSE), $result);
                } else {
                    addToComponents(Lit0, Lit140, Lit26, Boolean.FALSE);
                }
                runtime.initRuntime();
            } catch (ClassCastException e) {
                throw new WrongType(e, "java.lang.Runnable.run()", 1, find);
            }
        } catch (ClassCastException e2) {
            throw new WrongType(e2, "java.lang.Runnable.run()", 1, find);
        }
    }

    static Object lambda3() {
        runtime.setAndCoerceProperty$Ex(Lit0, Lit3, Lit4, Lit5);
        runtime.setAndCoerceProperty$Ex(Lit0, Lit6, "Arduino Voice Control", Lit7);
        runtime.setAndCoerceProperty$Ex(Lit0, Lit8, Lit9, Lit5);
        runtime.setAndCoerceProperty$Ex(Lit0, Lit10, "BG.jpg", Lit7);
        runtime.setAndCoerceProperty$Ex(Lit0, Lit11, "logo.png", Lit7);
        runtime.setAndCoerceProperty$Ex(Lit0, Lit12, Boolean.FALSE, Lit13);
        runtime.setAndCoerceProperty$Ex(Lit0, Lit14, "Arduino Voice Control", Lit7);
        runtime.setAndCoerceProperty$Ex(Lit0, Lit15, Boolean.FALSE, Lit13);
        runtime.setAndCoerceProperty$Ex(Lit0, Lit16, Lit4, Lit5);
        return runtime.setAndCoerceProperty$Ex(Lit0, Lit17, "1.2", Lit7);
    }

    public Object Screen1$Initialize() {
        runtime.setThisForm();
        if (runtime.callYailPrimitive(runtime.yail$Mnequal$Qu, LList.list2(runtime.getProperty$1(Lit18, Lit19), Boolean.FALSE), Lit20, "=") != Boolean.FALSE) {
            runtime.setAndCoerceProperty$Ex(Lit21, Lit22, "android.bluetooth.adapter.action.REQUEST_ENABLE", Lit7);
            runtime.callComponentMethod(Lit21, Lit23, LList.Empty, LList.Empty);
        }
        return runtime.setAndCoerceProperty$Ex(Lit24, Lit25, runtime.getProperty$1(Lit26, Lit27), Lit7);
    }

    static Object lambda4() {
        return runtime.setAndCoerceProperty$Ex(Lit31, Lit32, Lit33, Lit5);
    }

    static Object lambda5() {
        return runtime.setAndCoerceProperty$Ex(Lit31, Lit32, Lit33, Lit5);
    }

    static Object lambda6() {
        runtime.setAndCoerceProperty$Ex(Lit36, Lit37, Lit38, Lit5);
        runtime.setAndCoerceProperty$Ex(Lit36, Lit32, Lit33, Lit5);
        runtime.setAndCoerceProperty$Ex(Lit36, Lit39, "btn.jpg", Lit7);
        runtime.setAndCoerceProperty$Ex(Lit36, Lit25, "CONNECT", Lit7);
        runtime.setAndCoerceProperty$Ex(Lit36, Lit40, Lit41, Lit5);
        return runtime.setAndCoerceProperty$Ex(Lit36, Lit14, "BT List", Lit7);
    }

    static Object lambda7() {
        runtime.setAndCoerceProperty$Ex(Lit36, Lit37, Lit38, Lit5);
        runtime.setAndCoerceProperty$Ex(Lit36, Lit32, Lit33, Lit5);
        runtime.setAndCoerceProperty$Ex(Lit36, Lit39, "btn.jpg", Lit7);
        runtime.setAndCoerceProperty$Ex(Lit36, Lit25, "CONNECT", Lit7);
        runtime.setAndCoerceProperty$Ex(Lit36, Lit40, Lit41, Lit5);
        return runtime.setAndCoerceProperty$Ex(Lit36, Lit14, "BT List", Lit7);
    }

    public Object btnConnect$BeforePicking() {
        runtime.setThisForm();
        return runtime.setAndCoerceProperty$Ex(Lit36, Lit43, runtime.getProperty$1(Lit18, Lit44), Lit45);
    }

    public Object btnConnect$AfterPicking() {
        runtime.setThisForm();
        runtime.setAndCoerceProperty$Ex(Lit36, Lit48, runtime.callComponentMethod(Lit18, Lit49, LList.list1(runtime.getProperty$1(Lit36, Lit48)), Lit50), Lit7);
        if (runtime.getProperty$1(Lit18, Lit51) == Boolean.FALSE) {
            return Values.empty;
        }
        runtime.setAndCoerceProperty$Ex(Lit52, Lit25, "Connected", Lit7);
        return runtime.setAndCoerceProperty$Ex(Lit52, Lit40, Lit53, Lit5);
    }

    static Object lambda8() {
        runtime.setAndCoerceProperty$Ex(Lit57, Lit37, Lit38, Lit5);
        runtime.setAndCoerceProperty$Ex(Lit57, Lit32, Lit33, Lit5);
        runtime.setAndCoerceProperty$Ex(Lit57, Lit39, "btn.jpg", Lit7);
        runtime.setAndCoerceProperty$Ex(Lit57, Lit25, "DISCONNECT", Lit7);
        return runtime.setAndCoerceProperty$Ex(Lit57, Lit40, Lit58, Lit5);
    }

    static Object lambda9() {
        runtime.setAndCoerceProperty$Ex(Lit57, Lit37, Lit38, Lit5);
        runtime.setAndCoerceProperty$Ex(Lit57, Lit32, Lit33, Lit5);
        runtime.setAndCoerceProperty$Ex(Lit57, Lit39, "btn.jpg", Lit7);
        runtime.setAndCoerceProperty$Ex(Lit57, Lit25, "DISCONNECT", Lit7);
        return runtime.setAndCoerceProperty$Ex(Lit57, Lit40, Lit58, Lit5);
    }

    public Object btnDisconnect$Click() {
        runtime.setThisForm();
        if (runtime.getProperty$1(Lit18, Lit51) != Boolean.FALSE) {
            runtime.callComponentMethod(Lit18, Lit60, LList.Empty, LList.Empty);
        }
        runtime.setAndCoerceProperty$Ex(Lit52, Lit25, "Disconnected", Lit7);
        return runtime.setAndCoerceProperty$Ex(Lit52, Lit40, Lit61, Lit5);
    }

    static Object lambda10() {
        runtime.setAndCoerceProperty$Ex(Lit65, Lit37, Lit38, Lit5);
        runtime.setAndCoerceProperty$Ex(Lit65, Lit32, Lit33, Lit5);
        runtime.setAndCoerceProperty$Ex(Lit65, Lit39, "btn.jpg", Lit7);
        runtime.setAndCoerceProperty$Ex(Lit65, Lit66, Boolean.TRUE, Lit13);
        runtime.setAndCoerceProperty$Ex(Lit65, Lit25, "LANGUAGE", Lit7);
        runtime.setAndCoerceProperty$Ex(Lit65, Lit40, Lit67, Lit5);
        return runtime.setAndCoerceProperty$Ex(Lit65, Lit14, "Arduino Language", Lit7);
    }

    static Object lambda11() {
        runtime.setAndCoerceProperty$Ex(Lit65, Lit37, Lit38, Lit5);
        runtime.setAndCoerceProperty$Ex(Lit65, Lit32, Lit33, Lit5);
        runtime.setAndCoerceProperty$Ex(Lit65, Lit39, "btn.jpg", Lit7);
        runtime.setAndCoerceProperty$Ex(Lit65, Lit66, Boolean.TRUE, Lit13);
        runtime.setAndCoerceProperty$Ex(Lit65, Lit25, "LANGUAGE", Lit7);
        runtime.setAndCoerceProperty$Ex(Lit65, Lit40, Lit67, Lit5);
        return runtime.setAndCoerceProperty$Ex(Lit65, Lit14, "Arduino Language", Lit7);
    }

    public Object btnChangeLanguage$BeforePicking() {
        runtime.setThisForm();
        return runtime.setAndCoerceProperty$Ex(Lit65, Lit43, runtime.getProperty$1(Lit26, Lit69), Lit45);
    }

    public Object btnChangeLanguage$AfterPicking() {
        runtime.setThisForm();
        runtime.setAndCoerceProperty$Ex(Lit26, Lit27, runtime.getProperty$1(Lit65, Lit48), Lit7);
        return runtime.setAndCoerceProperty$Ex(Lit24, Lit25, runtime.getProperty$1(Lit65, Lit48), Lit7);
    }

    static Object lambda12() {
        runtime.setAndCoerceProperty$Ex(Lit73, Lit3, Lit4, Lit5);
        runtime.setAndCoerceProperty$Ex(Lit73, Lit74, Lit75, Lit5);
        runtime.setAndCoerceProperty$Ex(Lit73, Lit76, Lit77, Lit5);
        runtime.setAndCoerceProperty$Ex(Lit73, Lit32, Lit33, Lit5);
        return runtime.setAndCoerceProperty$Ex(Lit73, Lit39, "btn.jpg", Lit7);
    }

    static Object lambda13() {
        runtime.setAndCoerceProperty$Ex(Lit73, Lit3, Lit4, Lit5);
        runtime.setAndCoerceProperty$Ex(Lit73, Lit74, Lit75, Lit5);
        runtime.setAndCoerceProperty$Ex(Lit73, Lit76, Lit77, Lit5);
        runtime.setAndCoerceProperty$Ex(Lit73, Lit32, Lit33, Lit5);
        return runtime.setAndCoerceProperty$Ex(Lit73, Lit39, "btn.jpg", Lit7);
    }

    static Object lambda14() {
        runtime.setAndCoerceProperty$Ex(Lit80, Lit25, "Status : ", Lit7);
        return runtime.setAndCoerceProperty$Ex(Lit80, Lit40, Lit81, Lit5);
    }

    static Object lambda15() {
        runtime.setAndCoerceProperty$Ex(Lit80, Lit25, "Status : ", Lit7);
        return runtime.setAndCoerceProperty$Ex(Lit80, Lit40, Lit81, Lit5);
    }

    static Object lambda16() {
        runtime.setAndCoerceProperty$Ex(Lit52, Lit25, "Disconnect", Lit7);
        return runtime.setAndCoerceProperty$Ex(Lit52, Lit40, Lit84, Lit5);
    }

    static Object lambda17() {
        runtime.setAndCoerceProperty$Ex(Lit52, Lit25, "Disconnect", Lit7);
        return runtime.setAndCoerceProperty$Ex(Lit52, Lit40, Lit84, Lit5);
    }

    static Object lambda18() {
        runtime.setAndCoerceProperty$Ex(Lit87, Lit25, "Lang : ", Lit7);
        return runtime.setAndCoerceProperty$Ex(Lit87, Lit40, Lit88, Lit5);
    }

    static Object lambda19() {
        runtime.setAndCoerceProperty$Ex(Lit87, Lit25, "Lang : ", Lit7);
        return runtime.setAndCoerceProperty$Ex(Lit87, Lit40, Lit88, Lit5);
    }

    static Object lambda20() {
        return runtime.setAndCoerceProperty$Ex(Lit24, Lit40, Lit91, Lit5);
    }

    static Object lambda21() {
        return runtime.setAndCoerceProperty$Ex(Lit24, Lit40, Lit91, Lit5);
    }

    static Object lambda22() {
        runtime.setAndCoerceProperty$Ex(Lit94, Lit3, Lit4, Lit5);
        runtime.setAndCoerceProperty$Ex(Lit94, Lit74, Lit75, Lit5);
        runtime.setAndCoerceProperty$Ex(Lit94, Lit76, Lit33, Lit5);
        return runtime.setAndCoerceProperty$Ex(Lit94, Lit32, Lit33, Lit5);
    }

    static Object lambda23() {
        runtime.setAndCoerceProperty$Ex(Lit94, Lit3, Lit4, Lit5);
        runtime.setAndCoerceProperty$Ex(Lit94, Lit74, Lit75, Lit5);
        runtime.setAndCoerceProperty$Ex(Lit94, Lit76, Lit33, Lit5);
        return runtime.setAndCoerceProperty$Ex(Lit94, Lit32, Lit33, Lit5);
    }

    static Object lambda24() {
        runtime.setAndCoerceProperty$Ex(Lit97, Lit39, "mic2.png", Lit7);
        return runtime.setAndCoerceProperty$Ex(Lit97, Lit98, Boolean.FALSE, Lit13);
    }

    static Object lambda25() {
        runtime.setAndCoerceProperty$Ex(Lit97, Lit39, "mic2.png", Lit7);
        return runtime.setAndCoerceProperty$Ex(Lit97, Lit98, Boolean.FALSE, Lit13);
    }

    public Object mic$Click() {
        runtime.setThisForm();
        if (runtime.getProperty$1(Lit18, Lit51) != Boolean.FALSE) {
            return runtime.callComponentMethod(Lit100, Lit101, LList.Empty, LList.Empty);
        }
        runtime.callComponentMethod(Lit102, Lit103, LList.list3("Make a connection.", "Warning", "OK"), Lit104);
        runtime.setAndCoerceProperty$Ex(Lit52, Lit25, "Disconnected", Lit7);
        return runtime.setAndCoerceProperty$Ex(Lit52, Lit40, Lit105, Lit5);
    }

    public Object SpeechRecognizer1$AfterGettingText(Object $result) {
        Object signalRuntimeError;
        $result = runtime.sanitizeComponentData($result);
        runtime.setThisForm();
        SimpleSymbol simpleSymbol = Lit18;
        SimpleSymbol simpleSymbol2 = Lit111;
        if ($result instanceof Package) {
            signalRuntimeError = runtime.signalRuntimeError(strings.stringAppend("The variable ", runtime.getDisplayRepresentation(Lit112), " is not bound in the current context"), "Unbound Variable");
        } else {
            signalRuntimeError = $result;
        }
        runtime.callComponentMethod(simpleSymbol, simpleSymbol2, LList.list1(signalRuntimeError), Lit113);
        SimpleSymbol simpleSymbol3 = Lit102;
        simpleSymbol = Lit114;
        if ($result instanceof Package) {
            $result = runtime.signalRuntimeError(strings.stringAppend("The variable ", runtime.getDisplayRepresentation(Lit112), " is not bound in the current context"), "Unbound Variable");
        }
        return runtime.callComponentMethod(simpleSymbol3, simpleSymbol, LList.list1($result), Lit115);
    }

    static Object lambda26() {
        return runtime.setAndCoerceProperty$Ex(Lit126, Lit127, Lit128, Lit5);
    }

    static Object lambda27() {
        return runtime.setAndCoerceProperty$Ex(Lit126, Lit127, Lit128, Lit5);
    }

    public Object Clock1$Timer() {
        runtime.setThisForm();
        return runtime.processAndDelayed$V(new Object[]{lambda$Fn27, lambda$Fn28}) != Boolean.FALSE ? runtime.callComponentMethod(Lit26, Lit133, LList.list1(runtime.callComponentMethod(Lit18, Lit134, LList.list1(runtime.callComponentMethod(Lit18, Lit130, LList.Empty, LList.Empty)), Lit135)), Lit136) : Values.empty;
    }

    static Object lambda28() {
        return runtime.getProperty$1(Lit18, Lit51);
    }

    static Object lambda29() {
        return runtime.callYailPrimitive(Scheme.numGrt, LList.list2(runtime.callComponentMethod(Lit18, Lit130, LList.Empty, LList.Empty), Lit131), Lit132, ">");
    }

    public void androidLogForm(Object message) {
    }

    public void addToFormEnvironment(Symbol name, Object object) {
        androidLogForm(Format.formatToString(0, "Adding ~A to env ~A with value ~A", name, this.form$Mnenvironment, object));
        this.form$Mnenvironment.put(name, object);
    }

    public Object lookupInFormEnvironment(Symbol name, Object default$Mnvalue) {
        boolean x = ((this.form$Mnenvironment == null ? 1 : 0) + 1) & 1;
        if (x) {
            if (!this.form$Mnenvironment.isBound(name)) {
                return default$Mnvalue;
            }
        } else if (!x) {
            return default$Mnvalue;
        }
        return this.form$Mnenvironment.get(name);
    }

    public boolean isBoundInFormEnvironment(Symbol name) {
        return this.form$Mnenvironment.isBound(name);
    }

    public void addToGlobalVarEnvironment(Symbol name, Object object) {
        androidLogForm(Format.formatToString(0, "Adding ~A to env ~A with value ~A", name, this.global$Mnvar$Mnenvironment, object));
        this.global$Mnvar$Mnenvironment.put(name, object);
    }

    public void addToEvents(Object component$Mnname, Object event$Mnname) {
        this.events$Mnto$Mnregister = lists.cons(lists.cons(component$Mnname, event$Mnname), this.events$Mnto$Mnregister);
    }

    public void addToComponents(Object container$Mnname, Object component$Mntype, Object component$Mnname, Object init$Mnthunk) {
        this.components$Mnto$Mncreate = lists.cons(LList.list4(container$Mnname, component$Mntype, component$Mnname, init$Mnthunk), this.components$Mnto$Mncreate);
    }

    public void addToGlobalVars(Object var, Object val$Mnthunk) {
        this.global$Mnvars$Mnto$Mncreate = lists.cons(LList.list2(var, val$Mnthunk), this.global$Mnvars$Mnto$Mncreate);
    }

    public void addToFormDoAfterCreation(Object thunk) {
        this.form$Mndo$Mnafter$Mncreation = lists.cons(thunk, this.form$Mndo$Mnafter$Mncreation);
    }

    public void sendError(Object error) {
        RetValManager.sendError(error == null ? null : error.toString());
    }

    public void processException(Object ex) {
        Object apply1 = Scheme.applyToArgs.apply1(GetNamedPart.getNamedPart.apply2(ex, Lit1));
        RuntimeErrorAlert.alert(this, apply1 == null ? null : apply1.toString(), ex instanceof YailRuntimeError ? ((YailRuntimeError) ex).getErrorType() : "Runtime Error", "End Application");
    }

    public boolean dispatchEvent(Component componentObject, String registeredComponentName, String eventName, Object[] args) {
        SimpleSymbol registeredObject = misc.string$To$Symbol(registeredComponentName);
        if (!isBoundInFormEnvironment(registeredObject)) {
            EventDispatcher.unregisterEventForDelegation(this, registeredComponentName, eventName);
            return false;
        } else if (lookupInFormEnvironment(registeredObject) != componentObject) {
            return false;
        } else {
            try {
                Scheme.apply.apply2(lookupHandler(registeredComponentName, eventName), LList.makeList(args, 0));
                return true;
            } catch (Throwable exception) {
                androidLogForm(exception.getMessage());
                exception.printStackTrace();
                processException(exception);
                return false;
            }
        }
    }

    public Object lookupHandler(Object componentName, Object eventName) {
        String str = null;
        String obj = componentName == null ? null : componentName.toString();
        if (eventName != null) {
            str = eventName.toString();
        }
        return lookupInFormEnvironment(misc.string$To$Symbol(EventDispatcher.makeFullEventName(obj, str)));
    }

    public void $define() {
        Language.setDefaults(Scheme.getInstance());
        try {
            run();
        } catch (Exception exception) {
            androidLogForm(exception.getMessage());
            processException(exception);
        }
        Screen1 = this;
        addToFormEnvironment(Lit0, this);
        Object obj = this.events$Mnto$Mnregister;
        while (obj != LList.Empty) {
            try {
                Pair arg0 = (Pair) obj;
                Object event$Mninfo = arg0.getCar();
                Object apply1 = lists.car.apply1(event$Mninfo);
                String obj2 = apply1 == null ? null : apply1.toString();
                Object apply12 = lists.cdr.apply1(event$Mninfo);
                EventDispatcher.registerEventForDelegation(this, obj2, apply12 == null ? null : apply12.toString());
                obj = arg0.getCdr();
            } catch (ClassCastException e) {
                throw new WrongType(e, "arg0", -2, obj);
            }
        }
        addToGlobalVars(Lit2, lambda$Fn1);
        Screen1 closureEnv = this;
        obj = lists.reverse(this.global$Mnvars$Mnto$Mncreate);
        while (obj != LList.Empty) {
            try {
                arg0 = (Pair) obj;
                Object var$Mnval = arg0.getCar();
                Object var = lists.car.apply1(var$Mnval);
                addToGlobalVarEnvironment((Symbol) var, Scheme.applyToArgs.apply1(lists.cadr.apply1(var$Mnval)));
                obj = arg0.getCdr();
            } catch (ClassCastException e2) {
                throw new WrongType(e2, "arg0", -2, obj);
            } catch (ClassCastException e22) {
                throw new WrongType(e22, "arg0", -2, obj);
            } catch (ClassCastException e222) {
                throw new WrongType(e222, "add-to-form-environment", 0, component$Mnname);
            } catch (ClassCastException e3) {
                throw new WrongType(e3, "lookup-in-form-environment", 0, apply1);
            } catch (ClassCastException e2222) {
                throw new WrongType(e2222, "arg0", -2, obj);
            } catch (ClassCastException e22222) {
                throw new WrongType(e22222, "arg0", -2, obj);
            } catch (ClassCastException e222222) {
                throw new WrongType(e222222, "add-to-global-var-environment", 0, var);
            } catch (ClassCastException e2222222) {
                throw new WrongType(e2222222, "arg0", -2, obj);
            } catch (YailRuntimeError exception2) {
                processException(exception2);
                return;
            }
        }
        obj = lists.reverse(this.form$Mndo$Mnafter$Mncreation);
        while (obj != LList.Empty) {
            arg0 = (Pair) obj;
            misc.force(arg0.getCar());
            obj = arg0.getCdr();
        }
        LList component$Mndescriptors = lists.reverse(this.components$Mnto$Mncreate);
        closureEnv = this;
        obj = component$Mndescriptors;
        while (obj != LList.Empty) {
            arg0 = (Pair) obj;
            Object component$Mninfo = arg0.getCar();
            Object component$Mnname = lists.caddr.apply1(component$Mninfo);
            lists.cadddr.apply1(component$Mninfo);
            Object component$Mnobject = Invoke.make.apply2(lists.cadr.apply1(component$Mninfo), lookupInFormEnvironment((Symbol) lists.car.apply1(component$Mninfo)));
            SlotSet.set$Mnfield$Ex.apply3(this, component$Mnname, component$Mnobject);
            addToFormEnvironment((Symbol) component$Mnname, component$Mnobject);
            obj = arg0.getCdr();
        }
        obj = component$Mndescriptors;
        while (obj != LList.Empty) {
            arg0 = (Pair) obj;
            component$Mninfo = arg0.getCar();
            lists.caddr.apply1(component$Mninfo);
            Boolean init$Mnthunk = lists.cadddr.apply1(component$Mninfo);
            if (init$Mnthunk != Boolean.FALSE) {
                Scheme.applyToArgs.apply1(init$Mnthunk);
            }
            obj = arg0.getCdr();
        }
        obj = component$Mndescriptors;
        while (obj != LList.Empty) {
            arg0 = (Pair) obj;
            component$Mninfo = arg0.getCar();
            component$Mnname = lists.caddr.apply1(component$Mninfo);
            lists.cadddr.apply1(component$Mninfo);
            callInitialize(SlotGet.field.apply2(this, component$Mnname));
            obj = arg0.getCdr();
        }
    }

    public static SimpleSymbol lambda1symbolAppend$V(Object[] argsArray) {
        Object car;
        LList symbols = LList.makeList(argsArray, 0);
        Procedure procedure = Scheme.apply;
        ModuleMethod moduleMethod = strings.string$Mnappend;
        Pair result = LList.Empty;
        Object arg0 = symbols;
        while (arg0 != LList.Empty) {
            try {
                Pair arg02 = (Pair) arg0;
                Object arg03 = arg02.getCdr();
                car = arg02.getCar();
                try {
                    result = Pair.make(misc.symbol$To$String((Symbol) car), result);
                    arg0 = arg03;
                } catch (ClassCastException e) {
                    throw new WrongType(e, "symbol->string", 1, car);
                }
            } catch (ClassCastException e2) {
                throw new WrongType(e2, "arg0", -2, arg0);
            }
        }
        car = procedure.apply2(moduleMethod, LList.reverseInPlace(result));
        try {
            return misc.string$To$Symbol((CharSequence) car);
        } catch (ClassCastException e3) {
            throw new WrongType(e3, "string->symbol", 1, car);
        }
    }

    static Object lambda2() {
        return null;
    }
}
