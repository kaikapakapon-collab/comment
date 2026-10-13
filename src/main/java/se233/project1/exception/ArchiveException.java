package se233.project1.exception;

/** Thrown when a zip archive is corrupted, unsafe (Zip Slip / zip bomb) or contains no usable images. */
/**
 * สรุปหน้าที่ไฟล์: Exception สำหรับข้อผิดพลาดที่เกิดจากการอ่านหรือแตกไฟล์ ZIP
 */
public class ArchiveException extends ConversionException {

    public ArchiveException(String message) {
        super(message);
    }

    public ArchiveException(String message, Throwable cause) {
        super(message, cause);
    }
}
