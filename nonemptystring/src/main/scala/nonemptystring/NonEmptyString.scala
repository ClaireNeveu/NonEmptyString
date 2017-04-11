package nonemptystring

import macrame.delegate
import scala.collection.immutable.StringOps

final case class NonEmptyString(val head : Char, val tail : String) {
   override def toString : String = head + tail
   def intern = toString.intern
   def toCharArray = toString.toCharArray
   def trim = toString.trim
   def toUpperCase = toString.toUpperCase
   def toUpperCase(x1 : java.util.Locale) = toString.toUpperCase(x1)
   def toLowerCase = toString.toLowerCase
   def toLowerCase(x1 : java.util.Locale) = toString.toLowerCase(x1)
   def split(x1 : String) = toString.split(x1)
   def split(x1 : String, x2 : Int) = toString.split(x1, x2)
   def replace(x1 : CharSequence, x2 : CharSequence) = toString.replace(x1, x2)
   def replaceAll(x1 : String, x2 : String) = toString.replaceAll(x1, x2)
   def replaceFirst(x1 : String, x2 : String) = toString.replaceFirst(x1, x2)
   def contains(x1 : CharSequence) = toString.contains(x1)
   def matches(x1 : String) = toString.matches(x1)
   def replace(x1 : Char, x2 : Char) = toString.replace(x1, x2)
   def concat(x1 : String) = toString.concat(x1)
   def subSequence(x1 : Int, x2 : Int) = toString.subSequence(x1, x2)
   def substring(x1 : Int, x2 : Int) = toString.substring(x1, x2)
   def substring(x1 : Int) = toString.substring(x1)
   def lastIndexOf(x1 : String, x2 : Int) = toString.lastIndexOf(x1, x2)
   def lastIndexOf(x1 : String) = toString.lastIndexOf(x1)
   def indexOf(x1 : String, x2 : Int) = toString.indexOf(x1, x2)
   def indexOf(x1 : String) = toString.indexOf(x1)
   def lastIndexOf(x1 : Int, x2 : Int) = toString.lastIndexOf(x1, x2)
   def lastIndexOf(x1 : Int) = toString.lastIndexOf(x1)
   def indexOf(x1 : Int, x2 : Int) = toString.indexOf(x1, x2)
   def indexOf(x1 : Int) = toString.indexOf(x1)
   def endsWith(x1 : String) = toString.endsWith(x1)
   def startsWith(x1 : String) = toString.startsWith(x1)
   def startsWith(x1 : String, x2 : Int) = toString.startsWith(x1, x2)
   def regionMatches(x1 : Boolean, x2 : Int, x3 : String, x4 : Int, x5 : Int) = toString.regionMatches(x1, x2, x3, x4, x5)
   def regionMatches(x1 : Int, x2 : String, x3 : Int, x4 : Int) = toString.regionMatches(x1, x2, x3, x4)
   def compareToIgnoreCase(x1 : String) = toString.compareToIgnoreCase(x1)
   def compareTo(x1 : String) = toString.compareTo(x1)
   def equalsIgnoreCase(x1 : String) = toString.equalsIgnoreCase(x1)
   def contentEquals(x1 : CharSequence) = toString.contentEquals(x1)
   def contentEquals(x1 : StringBuffer) = toString.contentEquals(x1)
   def getBytes = toString.getBytes
   def getBytes(x1 : java.nio.charset.Charset) = toString.getBytes(x1)
   def getBytes(x1 : String) = toString.getBytes(x1)
   def getBytes(x1 : Int, x2 : Int, x3 : Array[Byte], x4 : Int) = toString.getBytes(x1, x2, x3, x4)
   def getChars(x1 : Int, x2 : Int, x3 : Array[Char], x4 : Int) = toString.getChars(x1, x2, x3, x4)
   def offsetByCodePoints(x1 : Int, x2 : Int) = toString.offsetByCodePoints(x1, x2)
   def codePointCount(x1 : Int, x2 : Int) = toString.codePointCount(x1, x2)
   def codePointBefore(x1 : Int) = toString.codePointBefore(x1)
   def codePointAt(x1 : Int) = toString.codePointAt(x1)
   def charAt(x1 : Int) = toString.charAt(x1)
   def isEmpty = toString.isEmpty
   def length = toString.length
   def codePoints = toString.codePoints
   def chars = toString.chars
}

object NonEmptyString {
   def fromString(s : String) : Option[NonEmptyString] =
      if (s.isEmpty)
         Some(NonEmptyString(s.charAt(0), s.substring(1)))
      else
         None

   implicit def toStringOps(nes : NonEmptyString) : StringOps = new StringOps(nes.toString)
}
