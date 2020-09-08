package net.gamingcraft.utils4j.logger;

public class Logger {
    LogStyle logStyle;
    String prefix;

    public Logger(String pre, LogStyle ls) {
        this.logStyle = ls;
        this.prefix = pre;
    }

    public void log(String msg, LogLevel lvl) {
        logStyle.printMessage(this.prefix, msg, lvl);
    }

    public void log(String msg) {
        logStyle.printMessage(this.prefix, msg, LogLevel.INFO);
    }

    public String getPrefix() {
        return prefix;
    }

    public LogStyle getLogStyle() {
        return logStyle;
    }
}
