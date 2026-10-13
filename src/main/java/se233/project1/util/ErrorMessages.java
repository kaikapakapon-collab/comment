package se233.project1.util;

import se233.project1.exception.ConversionException;

/** Turns exceptions into short, user-friendly messages. */
/**
 * สรุปหน้าที่ไฟล์: แปลง Exception ต่าง ๆ ให้เป็นข้อความที่ผู้ใช้เข้าใจง่าย
 */
public final class ErrorMessages {

    private ErrorMessages() {
    }

    // หน้าที่: แปลง Throwable ให้เป็นข้อความสำหรับแสดงต่อผู้ใช้

    public static String describe(Throwable t) {
        if (t == null) {
            return "Unknown error";
        }
        if (t instanceof OutOfMemoryError) {
            return "Not enough memory to process this image. Try a smaller image or a lower detail level.";
        }
        if (t instanceof ConversionException && t.getMessage() != null) {
            return t.getMessage();
        }
        String message = t.getMessage();
        String type = t.getClass().getSimpleName();
        return message == null || message.isBlank() ? type : type + ": " + message;
    }
}
