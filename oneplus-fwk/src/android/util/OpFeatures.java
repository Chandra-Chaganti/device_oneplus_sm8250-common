package android.util;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.BitSet;

public final class OpFeatures {

    private static String LOG_TAG = OpFeatures.class.getSimpleName();

    public static final int OP_FEATURE_SKU_CHINA = 0;
    public static final int OP_FEATURE_SKU_GLOBAL = 1;
    public static final int OP_FEATURE_MDM = 2;
    public static final int OP_FEATURE_AUTO_STARTUP = 3;
    public static final int OP_FEATURE_SUPPORT_LTM = 4;
    public static final int OP_FEATURE_OP_KEYGUARD = 5;
    public static final int OP_FEATURE_FASTPAIR = 6;
    public static final int OP_FEATURE_TURNOFF_LOADING = 7;
    public static final int OP_FEATURE_MM_DISPLAY_COLOR_SCREEN_MODE = 8;
    public static final int OP_FEATURE_SWAP_KEYS = 9;
    public static final int OP_FEATURE_KEY_LOCK = 10;
    public static final int OP_FEATURE_CTA_PERMISSION_CONTROL = 11;
    public static final int OP_FEATURE_GESTURE_SCREENSHOT = 12;
    public static final int OP_FEATURE_BG_DETECTION = 13;
    public static final int OP_FEATURE_BLACK_GESTURE = 14;
    public static final int OP_FEATURE_RESERVE_APP = 15;
    public static final int OP_FEATURE_OPEN_ID = 16;
    public static final int OP_FEATURE_URL_INSTANT_APP_AND_HEYTAP_BUSINESS = 17;
    public static final int OP_FEATURE_CHANGE_PACKAGE_NAME = 18;
    public static final int OP_FEATURE_APP_BOOT_MANAGER = 19;
    public static final int OP_FEATURE_MEMORY_TRACKER = 20;
    public static final int OP_FEATURE_APPRECORD = 21;
    public static final int OP_FEATURE_APP_LOCKER = 22;
    public static final int OP_FEATURE_LONG_SCREENSHOT = 23;
    public static final int OP_FEATURE_SCENE_MODES = 24;
    public static final int OP_FEATURE_QUICK_PAY = 25;
    public static final int OP_FEATURE_PARALLEL_APP = 26;
    public static final int OP_FEATURE_ONEPLUS_BOOTANIMATION = 27;
    public static final int OP_FEATURE_UXREALM = 28;
    public static final int OP_FEATURE_HIDE_NAVBAR = 29;
    public static final int OP_FEATURE_APP_USAGE_CLASSIFICATION = 30;
    public static final int OP_FEATURE_SCREEN_COMPAT = 31;
    public static final int OP_FEATURE_QUICK_REPLY = 32;
    public static final int OP_FEATURE_OTG_AUTO_SHUTDOWN = 33;
    public static final int OP_FEATURE_FACE_UNLOCK = 34;
    public static final int OP_FEATURE_BOOT_ENTER_BOUNCER = 35;
    public static final int OP_FEATURE_VIBRATION_INTENSITY = 36;
    public static final int OP_FEATURE_CUSTOM_STATUS_BAR = 37;
    public static final int OP_FEATURE_NEW_PLAN_POWEWR_OFF_ALARM = 38;
    public static final int OP_FEATURE_PCB_WATER_MARK = 39;
    public static final int OP_FEATURE_SYSTEM_UPDATE_BY_AB = 40;
    public static final int OP_FEATURE_ENABLE_AD = 41;
    public static final int OP_FEATURE_ENABLE_EU = 42;
    public static final int OP_FEATURE_ALWAYS_ON_DISPLAY = 43;
    public static final int OP_FEATURE_SHOW_MULTI_VOLTE = 44;
    public static final int OP_FEATURE_GESTURE_BUTTON = 45;
    public static final int OP_FEATURE_HEARING_AID = 46;
    public static final int OP_FEATURE_MM_AUDIO_OZO = 47;
    public static final int OP_FEATURE_BLUETOOTH_HEADSET = 48;
    public static final int OP_FEATURE_CAMERA_NOTCH = 49;
    public static final int OP_FEATURE_HIDE_CAMERA_NOTCH = 50;
    public static final int OP_FEATURE_CUSTOM_NAVBAR = 51;
    public static final int OP_FEATURE_SHOW_HD_FOR_CT = 52;
    public static final int OP_FEATURE_OPDIAGNOSE = 53;
    public static final int OP_FEATURE_SETTINGS_QUICKPAY_ANIM_FOR_ENCHILADA = 54;
    public static final int OP_FEATURE_ENABLE_FALSINGTOUCH = 55;
    public static final int OP_FEATURE_GAMEMODE_NETBOOST = 56;
    public static final int OP_FEATURE_GAMEMODE_POWERSAVER = 57;
    public static final int OP_FEATURE_ENABLE_FINGERPRINT_VENDOR_MOUDLE = 58;
    public static final int OP_FEATURE_SMALL_BOARD_CHECK_FAJITA = 59;
    public static final int OP_FEATURE_SUPPORT_CUSTOM_FINGERPRINT = 60;
    public static final int OP_FEATURE_ENABLE_FINGERPRINT_POCKET = 61;
    public static final int OP_FEATURE_SHUTDOWN_ANIMATION = 62;
    public static final int OP_FEATURE_NETWORK_MODE_DISABLE_2G = 63;
    public static final int OP_FEATURE_HEADSET_IMPEDANCE_DETECTION = 64;
    public static final int OP_FEATURE_REMOVE_ROAMING_ICON = 65;
    public static final int OP_FEATURE_DATA_ROAMING_ENABLE_MESSAGE = 66;
    public static final int OP_FEATURE_OIMC = 67;
    public static final int OP_FEATURE_APP_STATE_BROADCAST = 68;
    public static final int OP_FEATURE_OPSM = 69;
    public static final int OP_FEATURE_SHOW_4G_LTE = 70;
    public static final int OP_FEATURE_RTT = 71;
    public static final int OP_FEATURE_ANT_MODE_1X1 = 72;
    public static final int OP_FEATURE_UST_MODE = 73;
    public static final int OP_FEATURE_CUSTOM_BLINK_LIGHT = 74;
    public static final int OP_FEATURE_AGGRESSIVE_DOZE = 75;
    public static final int OP_FEATURE_SMART_POWER_CONTROL = 76;
    public static final int OP_FEATURE_ALARM_ALIGNMENT = 77;
    public static final int OP_FEATURE_BACKGROUND_PROCESS_FROZEN = 78;
    public static final int OP_FEATURE_DEEP_TASK_CLEANER = 79;
    public static final int OP_FEATURE_BGC = 80;
    public static final int OP_FEATURE_OPCS_RECORD_SCREENON_TIME = 81;
    public static final int OP_FEATURE_OHPD = 82;
    public static final int OP_FEATURE_OHPD_CLEAN_LOW = 83;
    public static final int OP_FEATURE_MM_SCREENOFF_WAKEUP = 84;
    public static final int OP_FEATURE_FROZEN = 85;
    public static final int OP_FEATURE_QUICK_LAUNCH = 86;
    public static final int OP_FEATURE_SWEET_MOMENTS = 87;
    public static final int OP_FEATURE_COLOR_MODE_FB0 = 88;
    public static final int OP_FEATURE_MAX_BACKLIGHT = 89;
    public static final int OP_FEATURE_CUSTOME_ANIMATION = 90;
    public static final int OP_FEATURE_MOTOR_CONTROL = 91;
    public static final int OP_FEATURE_SHOW_NOTIFICATION_BAR_BY_FINGERPRINT_SENSOR = 92;
    public static final int OP_FEATURE_PROCESS_RESIDENT = 93;
    public static final int OP_FEATURE_PARAM_BUILD_SERVICE = 94;
    public static final int OP_FEATURE_OPERATOR_GPS_E911 = 95;
    public static final int OP_FEATURE_SCREEN_REFRESH_RATE = 96;
    public static final int OP_FEATURE_X_LINEAR_VIBRATION_MOTOR = 97;
    public static final int OP_FEATURE_HBM_AUTO_ADJUST = 98;
    public static final int OP_FEATURE_BOOST_BRIGHTNESS = 99;
    public static final int OP_FEATURE_EN_P_SENSOR_IN_AB = 100;
    public static final int OP_FEATURE_CN_GOOGLEPLAY_SERVICE = 101;
    public static final int OP_FEATURE_FAKE_PROXIMITY = 102;
    public static final int OP_FEATURE_SUPPORT_5G = 103;
    public static final int OP_FEATURE_PRELOAD_APP_TO_DATA = 104;
    public static final int OP_FEATURE_SMART_BOOST = 105;
    public static final int OP_FEATURE_NOTIFICATION_LIGHT = 106;
    public static final int OP_FEATURE_IME_LAND_PADDING = 107;
    public static final int OP_FEATURE_AD_MODE = 108;
    public static final int OP_FEATURE_INSTALL_FROM_MARKET = 109;
    public static final int OP_FEATURE_APP_PREDICTION = 110;
    public static final int OP_FEATURE_MISTOUCH_PREVENTION = 111;
    public static final int OP_FEATURE_READING_MODE_INTERPOLATER = 112;
    public static final int OP_FEATURE_UPDATE_RESERVE = 113;
    public static final int OP_FEATURE_SYSTEM_OVERLAY = 114;
    public static final int OP_FEATURE_EARPHONE_MODE = 115;
    public static final int OP_FEATURE_ENABLE_POCKETMODE_SWITCH = 116;
    public static final int OP_FEATURE_RESRTICT_PKG_BASE_ON_NETWORK = 117;
    public static final int OP_FEATURE_PREBUILD_NETFLIX = 118;
    public static final int OP_FEATURE_APPS_DISPLAY_IN_FULLSCREEN = 119;
    public static final int OP_FEATURE_CTA_USE_PACKAGEINSTALLER_PERMISSION = 120;
    public static final int OP_FEATURE_WARP_CHARGE_5V6A = 121;
    public static final int OP_FEATURE_SPRINT = 122;
    public static final int OP_FEATURE_SPRINT_HIDDENMENU = 123;
    public static final int OP_FEATURE_SUPPORT_CUSTOMIZE_CLIENTID_MS = 124;
    public static final int OP_FEATURE_OVERHEAT_ENABLE = 125;
    public static final int OP_FEATURE_OVERHEAT_SKIN = 126;
    public static final int OP_FEATURE_HIGH_VSYNC = 127;
    public static final int OP_FEATURE_USS = 128;
    public static final int OP_FEATURE_USS_HIDDENMENU = 129;
    public static final int OP_FEATURE_POWER_CONSUMPTION_STATISTICS = 130;
    public static final int OP_FEATURE_POWER_CONTROLLER = 131;
    public static final int OP_FEATURE_COLOR_DISPLAY = 132;
    public static final int OP_FEATURE_OVERHEAT_DIAGNOSIS = 133;
    public static final int OP_FEATURE_OEMEX_SERVICE = 134;
    public static final int OP_FEATURE_STANDBY_DETECTION = 135;
    public static final int OP_FEATURE_ONEPLUS_SERVICE = 136;
    public static final int OP_FEATURE_FAST_CHARGE = 137;
    public static final int OP_FEATURE_MM_ALERTSLIDER = 138;
    public static final int OP_FEATURE_MM_LOG = 139;
    public static final int OP_FEATURE_MM_RESTORE_MODE = 140;
    public static final int OP_FEATURE_MM_HEADSET_PROFILE = 141;
    public static final int OP_FEATURE_MM_REDUCE_SAR = 142;
    public static final int OP_FEATURE_MM_TA = 143;
    public static final int OP_FEATURE_MM_SPECIAL_APP_SOUND_REDUCE = 144;
    public static final int OP_FEATURE_MM_WIDEVINE_DRM_L1 = 145;
    public static final int OP_FEATURE_MM_ULTRASOUND = 146;
    public static final int OP_FEATURE_MM_EU_ACDB_LOADER = 147;
    public static final int OP_FEATURE_MM_ENGINEERING_MODE = 148;
    public static final int OP_FEATURE_DEVICE_DEFAULT_WALLPAPER = 149;
    public static final int OP_FEATURE_WIFI_SERVICE = 150;
    public static final int OP_FEATURE_MM_AW = 151;
    public static final int OP_FEATURE_MM_CH_SWITCH = 152;
    public static final int OP_FEATURE_MM_AUDIO_DIAGNOSIS = 153;
    public static final int OP_FEATURE_PERF_MANAGER = 154;
    public static final int OP_FEATURE_NEW_MEMORY_OPTIMIZATION = 155;
    public static final int OP_FEATURE_OPUTIL = 156;
    public static final int OP_FEATURE_SKIP_UIDIDLE = 157;
    public static final int OP_FEATURE_SCREENSHOT_IMPROVEMENT = 158;
    public static final int OP_FEATURE_GPS_NOTIFICATION = 159;
    public static final int OP_FEATURE_ZEN_MODE = 160;
    public static final int OP_FEATURE_TCP_CONTROL = 161;
    public static final int OP_FEATURE_LOD_SWITCH = 162;
    public static final int OP_FEATURE_TCS3701_HBR_ENABLED = 163;
    public static final int OP_FEATURE_MM_HAC = 164;
    public static final int OP_FEATURE_MM_MODECLIENT = 165;
    public static final int OP_FEATURE_MM_RECODER_CH_SWITCH = 166;
    public static final int OP_FEATURE_MM_RECORDING_SCREEN = 167;
    public static final int OP_FEATURE_MM_AUDIO_CGROUP = 168;
    public static final int OP_FEATURE_MM_WECHAT_NS = 169;
    public static final int OP_FEATURE_MM_NS_AEC = 170;
    public static final int OP_FEATURE_DEXOPT = 171;
    public static final int OP_FEATURE_SKIP_DOFRAME = 172;
    public static final int OP_FEATURE_PROCESS_ADJ_CONTROL = 173;
    public static final int OP_FEATURE_SCREEN_ROTATION_IMPROVEMENT = 174;
    public static final int OP_FEATURE_JANKMANAGER = 175;
    public static final int OP_FEATURE_LANDSCAPE_APP_ANIMATION_IMPROVEMENT = 176;
    public static final int OP_FEATURE_HWUI_SKIA_REDUCE_OVERDRAW = 177;
    public static final int OP_FEATURE_MM_MDM = 178;
    public static final int OP_FEATURE_MM_AUDIO_ELEVOC_ECNS = 179;
    public static final int OP_FEATURE_MM_LOW_KING_VOLUME = 180;
    public static final int OP_FEATURE_AI_GESTURE = 181;
    public static final int OP_FEATURE_MM_VIDEO_ENHANCEMENT = 182;
    public static final int OP_FEATURE_UNIFIED_DEVICE = 183;
    public static final int OP_FEATURE_REDSCREEN_ASSERTION = 184;
    public static final int OP_FEATURE_INFRARED_POWER_CONTROL = 185;
    public static final int OP_FEATURE_OPSLA = 186;
    public static final int OP_FEATURE_OPSLM = 187;
    public static final int OP_FEATURE_SYNTHETIC_PASSWORD_DISABLED = 188;
    public static final int OP_FEATURE_SYSTEM_PRODUCTION_RINGTONE = 189;
    public static final int OP_FEATURE_APP_PRELOAD = 190;
    public static final int OP_FEATURE_VERIFICATION_BUBBLE = 191;
    public static final int OP_FEATURE_Z_VIBRATION_MOTOR = 192;
    public static final int OP_FEATURE_DUAL_CAMERA = 193;
    public static final int OP_FEATURE_TRIPLE_CAMERA = 194;
    public static final int OP_FEATURE_QUAD_CAMERA = 195;
    public static final int OP_FEATURE_FRONT_DUAL_CAMERA = 196;
    public static final int OP_FEATURE_REPORT_WIFI_GENERATION_INFO = 197;
    public static final int OP_FEATURE_BAS_WHITELIST = 198;
    public static final int OP_FEATURE_ENABLE_UNDERSCREEN_SENSOR = 199;
    public static final int OP_FEATURE_CUSTOM_GAME_CENTER = 200;
    public static final int OP_FEATURE_CUSTOM_ONEPLUS_WALLET = 201;
    public static final int OP_FEATURE_ENABLE_GAMUT_MAPPING = 202;
    public static final int OP_FEATURE_ENABLE_GAME_VIBRATE = 203;
    public static final int OP_FEATURE_ENABLE_ICON_DETECTION = 204;
    public static final int OP_FEATURE_ENABLE_ANTI_BURN = 205;
    public static final int OP_FEATURE_DIM_MODE_GESTURE = 206;
    public static final int OP_FEATURE_UPDATE_INDIA = 207;
    public static final int OP_FEATURE_USE_AUDIO_STATE = 208;
    public static final int OP_FEATURE_SCREEN_ON_USE_INFRARED = 209;
    public static final int OP_FEATURE_SUPPORT_COLOR_READ_MODE = 210;
    public static final int OP_FEATURE_SCREEN_AOD_USE_ULTRASOUND = 211;
    public static final int OP_FEATURE_SCREEN_OFF_USE_ULTRASOUND = 212;
    public static final int OP_FEATURE_SCREEN_OFF_USE_INFRARED = 213;
    public static final int OP_FEATURE_INFRARED_PROXIMITY_SUPPORT = 214;
    public static final int OP_FEATURE_SAR_TEST_SUPPORT = 215;
    public static final int OP_FEATURE_COLOR_ADS = 216;
    public static final int OP_FEATURE_PWM_UNDER_SCREEN_LIGHT = 217;
    public static final int OP_FEATURE_MM_LIMIT_SVA_BARGIN = 218;
    public static final int OP_FEATURE_MM_CLOSE_PA = 219;
    public static final int OP_FEATURE_GESTURE_DEPRECATED = 220;
    public static final int OP_FEATURE_ONE_HAND_MODE = 221;
    public static final int OP_FEATURE_DAILY_PROTO_REPORTING = 222;
    public static final int OP_FEATURE_MCL_FONT = 223;
    public static final int OP_FEATURE_CUSTOM_BROWSER_APP_INFO = 224;
    public static final int OP_FEATURE_DECR_BL_CJ = 225;
    public static final int OP_FEATURE_OPRECOVERY_BOOT_REASON = 226;
    public static final int OP_FEATURE_KTV_LOOPBACK = 227;
    public static final int OP_FEATURE_DYNAMIC_RESOLUTION = 228;
    public static final int OP_FEATURE_SUPPORT_5G_LTE = 229;
    public static final int OP_FEATURE_HOLE_PUNCH_FRONT_CAM = 230;
    public static final int OP_FEATURE_USV_MODE = 231;
    public static final int OP_FEATURE_USVIS_MODE = 232;
    public static final int OP_FEATURE_MM_ABANDON_DELAY = 233;
    public static final int OP_FEATURE_GPS_NFW_OTA_PATCH = 234;
    public static final int OP_FEATURE_PIXELWORKS_BRIGHTNESS_SMOOTH = 235;
    public static final int OP_FEATURE_FORCE_DARK = 236;
    public static final int OP_FEATURE_WIRELESS_CHARGE = 237;
    public static final int OP_FEATURE_SWARP_CHARGE = 238;
    public static final int OP_FEATURE_MM_FAST_WHITELIST = 239;
    public static final int OP_FEATURE_AI_BOOST_PACKAGE = 240;
    public static final int OP_FEATURE_CARRIER_3_BROADCAST_CUST = 241;
    public static final int OP_FEATURE_CARRIER_3_DEMO_MODE_CUST = 242;
    public static final int OP_FEATURE_CARRIER_3_SAFEMODE_CUST = 243;
    public static final int OP_FEATURE_APPDIED_STATISTICE = 244;
    public static final int OP_FEATURE_SECOND_PRIVATE_PASSWORD = 245;
    public static final int OP_FEATURE_OMM = 246;
    public static final int OP_FEATURE_ORM = 247;
    public static final int OP_FEATURE_OMM_KILL = 248;
    public static final int OP_FEATURE_OMM_RECLAIM = 249;
    public static final int OP_FEATURE_CARRIER_3_TALKBACK_CUST = 250;
    public static final int OP_FEATURE_UST_MAAP = 251;
    public static final int OP_FEATURE_CARRIER_3_UNIFIED_SETTINGS_CUST = 252;
    public static final int OP_FEATURE_CARRIER_3_LLK_AGENT_CUST = 253;
    public static final int OP_FEATURE_STA_SAP = 254;
    public static final int OP_FEATURE_ONEPLUS_SHARE = 255;
    public static final int OP_FEATURE_SAP_WPA3_SUPPORT = 256;
    public static final int OP_FEATURE_SUPPORT_RELLOADSPLASH = 257;
    public static final int OP_FEATURE_STARTING_WINDOW = 258;
    public static final int OP_FEATURE_SUPPORT_REDEFINE_POWER_BUTTON = 259;
    public static final int OP_FEATURE_AER_ZEROTOUCH = 260;
    public static final int OP_FEATURE_FACE_UNLOCK_SUPPORT_PASSIVE_WAKEUP = 261;
    public static final int OP_FEATURE_SMART_DOZE = 262;
    public static final int OP_FEATURE_WEAK_FACE_UNLOCK = 263;
    public static final int OP_FEATURE_SUPPORT_GCP = 264;
    public static final int OP_FEATURE_UIFIRST = 265;
    public static final int OP_FEATURE_GPS_SPRINT_SUPL = 266;
    public static final int OP_FEATURE_GAME_TP = 267;
    public static final int OP_FEATURE_TGPA = 268;
    public static final int OP_FEATURE_CHARGE_OPTIMIZATED = 269;
    public static final int OP_FEATURE_CARRIER_3_OVERHEAT_CUST = 270;
    public static final int OP_FEATURE_BOOTANIMATION_CUST_INSET = 271;
    public static final int OP_FEATURE_WARP_CHARGING_ANIM = 272;
    public static final int OP_FEATURE_DOUBLE_TAP_POWER_KEY_ALEXA = 273;
    public static final int OP_FEATURE_MM_GAME_DOLBY_WHITELIST = 274;
    public static final int OP_FEATURE_QPOWER = 275;
    public static final int OP_FEATURE_ENABLE_TAP_COEXIST = 276;
    public static final int OP_FEATURE_CUST_FAILED_PW_WIPE = 277;
    public static final int OP_FEATURE_COLLECT_BATTERYSTATS = 278;
    public static final int OP_FEATURE_NOMEDIA_WHITELIST = 279;
    public static final int OP_FEATURE_EXTREME_VSYNC = 280;
    public static final int OP_FEATURE_PROXIMITY_CONTROLLER = 281;
    public static final int OP_FEATURE_GAMEMODE_BOOST = 282;
    public static final int OP_FEATURE_QUICK_REPLY_BUBBLE = 283;
    public static final int OP_FEATURE_BLUETOOTH_UART_LOG = 284;
    public static final int OP_FEATURE_FUSIONLIGHT_SCREENSHOT_DISABLED = 285;
    public static final int OP_FEATURE_RECOVERY_FORMAT_WARNING = 286;
    public static final int OP_FEATURE_BUILDING_CUSTOM_PRODUCT_IMAGE = 287;
    public static final int OP_FEATURE_WIRELESS_CHARGE_DISCONNECT_DETECTOR = 288;
    public static final int OP_FEATURE_DYNAMIC_FONT = 289;
    public static final int OP_FEATURE_PERF_LOG = 290;
    public static final int OP_FEATURE_ENABLE_EMERGENCY_PANEL = 291;
    public static final int OP_FEATURE_MM_IRIS_CHIP_SUPPORT = 292;
    public static final int OP_FEATURE_MM_SOFT_IRIS_SUPPORT = 293;
    public static final int OP_FEATURE_ENABLE_HEACTE_SCREEN = 294;
    public static final int OP_FEATURE_PERF_MEMEX = 295;
    public static final int OP_FEATURE_SUPPORT_MIPI = 296;
    public static final int OP_FEATURE_SUPPORT_OSC = 297;
    public static final int OP_FEATURE_MM_DISPLAY_COLORTEMPRATURE_6000K_8000K = 298;
    public static final int OP_FEATURE_LITE_OOS = 299;
    public static final int OP_FEATURE_AOD_ALWAYS_ON = 300;
    public static final int OP_FEATURE_VIP_BROADCAST = 301;
    public static final int OP_FEATURE_SUPPORT_REAL_AOD = 302;
    public static final int OP_FEATURE_UST_NVVM = 303;
    public static final int OP_FEATURE_UST_EC = 304;
    public static final int OP_FEATURE_CHARGING_ANIM = 305;
    public static final int OP_FEATURE_OD_OPDMC = 306;
    public static final int OP_FEATURE_DISPLAY_DYNAMIC_RESOLUTION = 307;
    public static final int OP_FEATURE_WIRELESS_FAST_CHARGE = 308;
    public static final int OP_FEATURE_COTA = 309;
    public static final int OP_FEATURE_FLASH_BACK = 310;
    public static final int OP_FEATURE_GOOGLE_COMM_SUIT = 311;
    public static final int OP_FEATURE_SUPPORT_5G_5G = 312;
    public static final int OP_FEATURE_INPUTMETHOD_SHOWANIMATION = 313;
    public static final int OP_FEATURE_GOTA = 314;
    public static final int OP_FEATURE_MM_DC_SUPPORT = 315;
    public static final int OP_FEATURE_MM_DIRAC_SUPPORT = 316;
    public static final int OP_FEATURE_MM_VZW_CUSTOMIZATION = 317;
    public static final int OP_FEATURE_MAX_BACKLIGHT_2047 = 318;
    public static final int OP_FEATURE_MM_DOLBY = 319;
    public static final int OP_FEATURE_MM_DIMMING = 320;
    public static final int OP_FEATURE_MM_DITHER_CONTROLLER = 321;

    private static final BitSet sFeatures = new BitSet(323);

    static {
        File file = new File("/odm/etc/odm_feature_list");

        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            for (String line = br.readLine(); line != null; line = br.readLine()) {
                String[] values = line.split(" ");
                if (values.length == 4 && values[3].equals("true")) {
                    String id = values[0].replaceAll("[^0-9]", "");
                    if (id.length() != 0) {
                        sFeatures.set(Integer.parseInt(id));
                    }
                }
            }
        } catch (IOException e) {
            Log.e(LOG_TAG, "Failed to read odm feature list file", e);
        }
    }

    public static boolean isSupport(int... features) {
        for (int feature : features) {
            if (feature < 0 || feature > sFeatures.length()) {
                return false;
            }
            if (!sFeatures.get(feature)) {
                return false;
            }
        }
        return true;
    }
}
