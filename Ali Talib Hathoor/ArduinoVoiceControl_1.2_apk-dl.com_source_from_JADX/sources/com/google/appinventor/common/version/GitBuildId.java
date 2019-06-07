package com.google.appinventor.common.version;

public final class GitBuildId {
    public static final String ACRA_URI = "${acra.uri}";
    public static final String ANT_BUILD_DATE = "January 24 2018";
    public static final String GIT_BUILD_FINGERPRINT = "78985bca601d294fdb8541d43139d6fba9f43d69";
    public static final String GIT_BUILD_VERSION = "nb166";

    private GitBuildId() {
    }

    public static String getVersion() {
        String version = GIT_BUILD_VERSION;
        if (version == "" || version.contains(" ")) {
            return "none";
        }
        return version;
    }

    public static String getFingerprint() {
        return GIT_BUILD_FINGERPRINT;
    }

    public static String getDate() {
        return ANT_BUILD_DATE;
    }

    public static String getAcraUri() {
        if (ACRA_URI.equals(ACRA_URI)) {
            return "";
        }
        return ACRA_URI.trim();
    }
}
