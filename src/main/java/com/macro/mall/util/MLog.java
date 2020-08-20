package com.macro.mall.util;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MLog {
    private static final Logger logger = LoggerFactory.getLogger("adminLogger");

    public static void info(Object o) {
        StringBuilder sb = new StringBuilder();
        StackTraceElement ste = new Throwable().getStackTrace()[1];
        if (o instanceof String) {
            sb.append(getSessionId()).append(" - ");
            sb.append(o);
            sb.append(" - ");
            sb.append(ste.getFileName());
            sb.append(" Line:[");
            sb.append(ste.getLineNumber());
            sb.append("]");
            logger.info(sb.toString());
        } else if (o instanceof Exception) {
            sb.append(getSessionId()).append(" - ");
            sb.append(((Exception) o).getMessage());
            sb.append(" - ");
            sb.append(ste.getFileName());
            sb.append(" Line:[");
            sb.append(ste.getLineNumber());
            sb.append("]");
            logger.info(sb.toString(), (Exception) o);
        } else {
            sb.append(getSessionId()).append(" - ");
            sb.append(FormatJson.format(o));
            sb.append(" - ");
            sb.append(ste.getFileName());
            sb.append(" Line:[");
            sb.append(ste.getLineNumber());
            sb.append("]");
            logger.info(sb.toString());
        }
    }

    public static void info2( Throwable cause) {
        if(cause==null){
            logger.info(" - ■ ■ ■ System Err Info ■ ■ ■ ==> cause null");
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(getSessionId()).append(" - ■ ■ ■ System Err Info ■ ■ ■ ==> Caused by: ").append(cause.toString());
        int i = 0;
        for(StackTraceElement s:cause.getStackTrace()){
            sb.append("\n\t").append(s.toString());
            i++;
            if(i>6){
                break;
            }
        }
        logger.info(sb.toString());
    }

    public static void result(Object o) {
        // StringBuilder sb = new StringBuilder("Respone Info ===============\n");
        StringBuilder sb = new StringBuilder();
        if (o instanceof String) {
            sb.append(getSessionId()).append(" - ");
            sb.append(o);
            sb.append("\n");
            logger.info(sb.toString());
        } else if (o instanceof Exception) {
            sb.append(getSessionId()).append(" - ");
            sb.append(((Exception) o).getMessage());
            logger.info(sb.toString() + "\n=============== Respone Info ===============", (Exception) o);
        } else {
            sb.append(getSessionId()).append(" - ");
            sb.append("[ Send To Client ] ");
            sb.append(FormatJson.format(o));
            logger.info(sb.toString());
            // logger.info(sb.toString() + "\n=============== Respone Info ===============");
        }
    }

    public static void result2(Object o, Object r) {
        // StringBuilder sb = new StringBuilder("Respone Info ===============\n");
        StringBuilder sb = new StringBuilder();
        if (o instanceof String) {
            sb.append(getSessionId()).append(" - ");
            sb.append(o);
            if (r != null) {
//                sb.append(FormatJson.format(r));
                sb.append(JsonSerializer.serialize(r));
                sb.append("\n");
            }
            logger.info(sb.toString());
        } else if (o instanceof Exception) {
            sb.append(getSessionId()).append(" - ");
            sb.append(((Exception) o).getMessage());
            logger.info(sb.toString() + "\n=============== Respone Info ===============", (Exception) o);
        } else {
            sb.append(getSessionId()).append(" - ");
            sb.append("[ Send To Client ] ");
            sb.append(FormatJson.format(o));
            logger.info(sb.toString());
        }
    }

    public static void result(Object o, Object r) {
        // StringBuilder sb = new StringBuilder("Respone Info ===============\n");
        StringBuilder sb = new StringBuilder();
        if (o instanceof String) {
            sb.append(getSessionId()).append(" - ");
            sb.append("[ Send To Client ] ");
            sb.append(o);
            sb.append("\n");
            if (r != null) {
//                sb.append(FormatJson.format(r));
                sb.append(JsonSerializer.serialize(r));
                sb.append("\n");
            }
            logger.info(sb.toString());
        } else if (o instanceof Exception) {
            sb.append(getSessionId()).append(" - ");
            sb.append(((Exception) o).getMessage());
            logger.info(sb.toString() + "\n=============== Respone Info ===============", (Exception) o);
        } else {
            sb.append(getSessionId()).append(" - ");
            sb.append("[ Send To Client ] ");
            sb.append(FormatJson.format(o));
            logger.info(sb.toString());
        }
    }

    public static void tt(String o) {
        StringBuilder sb = new StringBuilder();
        sb.append(getSessionId()).append(" - ");
        sb.append(o);
        logger.info(sb.toString());
    }

    public static void tt2(String o) {
        logger.info(o);
    }

    public static void bussinfo(String message, Exception e) {
        StackTraceElement ste = e.getStackTrace()[0];
        StringBuilder sb = new StringBuilder();
        sb.append(getSessionId()).append(" - ");
        sb.append(message);
        sb.append(" - ");
        sb.append(ste.getFileName());
        sb.append(" Line:[");
        sb.append(ste.getLineNumber());
        sb.append("]");
        logger.info(sb.toString());
    }

    public static void info(String message, Exception t) {
        StringBuilder sb = new StringBuilder();
        StackTraceElement ste = new Throwable().getStackTrace()[1];
        sb.append(getSessionId()).append(" - ");
        sb.append(message);
        sb.append(" - ");
        sb.append(ste.getFileName());
        sb.append(" Line:[");
        sb.append(ste.getLineNumber());
        sb.append("]");
        logger.info(sb.toString(), t);
    }

    public static void debug(Object o, Exception ex) {
        StringBuilder sb = new StringBuilder();
        sb.append(getSessionId()).append(" - ");
        StackTraceElement ste = new Throwable().getStackTrace()[1];
        sb.append(" [debug] ");
        sb.append(FormatJson.format(o));
        sb.append(" - ");
        sb.append(ste.getFileName());
        sb.append(" Line:[");
        sb.append(ste.getLineNumber());
        sb.append("]");
        logger.debug(sb.toString());
    }

    public static void error(Object o) {
        StringBuilder sb = new StringBuilder();
        sb.append(getSessionId()).append(" - ");
        StackTraceElement ste = new Throwable().getStackTrace()[1];
        sb.append(" [■error■] ");
        sb.append(FormatJson.format(o));
        sb.append(" - ");
        sb.append(ste.getFileName());
        sb.append(" Line:[");
        sb.append(ste.getLineNumber());
        sb.append("]");
        logger.error(sb.toString());
    }


    public static String getSessionId() {
//        return Thread.currentThread().getName();
        return "";
    }


}
