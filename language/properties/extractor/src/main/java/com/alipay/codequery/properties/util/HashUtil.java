
package com.alipay.codequery.properties.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.security.MessageDigest;

import com.alipay.codequery.properties.Extractor;
import org.apache.commons.codec.binary.Hex;
import org.apache.commons.codec.digest.DigestUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class HashUtil {
  private static final Logger logger = LogManager.getLogger(Extractor.class);

  /**
   * Get the md5 value of the file.
   * @param filename
   * @return
   */
  public static String getFileMD5(String filename) {
    File cachedfile = new File(filename);
    FileInputStream fileInputStream = null;
    try {
      MessageDigest MD5 = MessageDigest.getInstance("MD5");
      fileInputStream = new FileInputStream(cachedfile);
      byte[] buffer = new byte[8192];
      int length;
      while ((length = fileInputStream.read(buffer)) != -1) {
        MD5.update(buffer, 0, length);
      }
      return new String(Hex.encodeHex(MD5.digest()));
    } catch (Exception e) {
      logger.error("Extraction failed, error message:{}", e.getMessage());
      return null;
    } finally {
      try {
        if (fileInputStream != null) {
          fileInputStream.close();
        }
      } catch (IOException e) {
        logger.error("Extraction failed, error message:{}", e.getMessage());
      }
    }
  }

  /**
   * Get the md5 value of a given string.
   * @param target
   * @return
   */
  public static String getStringMD5(String target) {
    return DigestUtils.md5Hex(target);
  }

  /**
   * Get the sha1 value of the file.
   * @param filename
   * @return
   */
  public static String getFileSHA1(String filename) {
    File cachedfile = new File(filename);
    String str = "";
    try {
      str = getHashCode(cachedfile, "SHA-256");
    } catch (Exception e) {
      logger.error("Extraction failed, error message:{}", e.getMessage());
    }
    return str;
  }

  /**
   * Calculate the hash value of a given string.
   * @param value
   * @return
   */
  public static Long hashString(String value) {
    Long hash = 0L;
    if (value.length() > 0) {
      for (int i = 0; i < value.length(); i++) {
        hash = 63 * hash + value.charAt(i);
      }
    }
    return hash;
  }

  /**
   * Calculate the hash value of a given string.
   * @param value
   * @return
   */
  public static Long getStringHash(String value) {
    return HashUtil.hashString(value);
  }

  /**
   * Calculate the sha256 value of a given string.
   * @param base
   * @return
   */
  public static Long getStringSHA256(String base) {
    try {
      MessageDigest digest = MessageDigest.getInstance("SHA-256");
      byte[] hash = digest.digest(base.getBytes("UTF-8"));
      StringBuffer hexString = new StringBuffer();
      for (int i = 0; i < hash.length; i++) {
        String hex = Integer.toHexString(0xff & hash[i]);
        if (hex.length() == 1) {
          hexString.append('0');
        }
        hexString.append(hex);
      }
      String temp = hexString.toString();
      Long hashId = Long.parseLong(temp.substring(49, 64), 16);
      return hashId;
    } catch (Exception ex) {
      throw new RuntimeException(ex);
    }
  }

  /**
   * Calculate the short sha256 value of a given string.
   * @param base
   * @return
   */
  public static int getShortStringSHA256(String base) {
    try {
      MessageDigest digest = MessageDigest.getInstance("SHA-256");
      byte[] hash = digest.digest(base.getBytes("UTF-8"));
      StringBuffer hexString = new StringBuffer();
      for (int i = 0; i < hash.length; i++) {
        String hex = Integer.toHexString(0xff & hash[i]);
        if (hex.length() == 1) {
          hexString.append('0');
        }
        hexString.append(hex);
      }
      String temp = hexString.toString();
      int hashId = Integer.parseInt(temp.substring(57, 64), 16);
      return hashId;
    } catch (Exception ex) {
      throw new RuntimeException(ex);
    }
  }

  /**
   * Calculate the hash value of a given file and given hash type.
   * @param file
   * @param hashType
   * @return
   * @throws Exception
   */
  public static String getHashCode(File file, String hashType) throws Exception {
    InputStream fis = new FileInputStream(file);
    byte buffer[] = new byte[1024];
    MessageDigest sha256 = MessageDigest.getInstance(hashType);
    for (int numRead = 0; (numRead = fis.read(buffer)) > 0; ) {
      sha256.update(buffer, 0, numRead);
    }
    fis.close();
    return toHexString(sha256.digest());
  }

  /**
   * Transfer the byte array value to hex.
   * @param b
   * @return
   */
  public static String toHexString(byte b[]) {
    StringBuilder sb = new StringBuilder();
    for (byte aB : b) {
      sb.append(Integer.toHexString(aB & 0xFF));
    }
    return sb.toString();
  }
}
