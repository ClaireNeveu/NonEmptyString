package nonemptystring

import internal._

import macrame.delegate
import scala.collection.immutable.StringOps

final case class NonEmptyString(val head : Char, val tail : String) {
   override def toString : String = head.toString + tail
   def charAt(x1 : Int) : Char = toString.charAt(x1)
   def chars : java.util.stream.IntStream = toString.chars
   def codePointAt(x1 : Int) : Int = toString.codePointAt(x1)
   def codePointBefore(x1 : Int) : Int = toString.codePointBefore(x1)
   def codePointCount(x1 : Int, x2 : Int) : Int = toString.codePointCount(x1, x2)
   def codePoints : java.util.stream.IntStream = toString.codePoints
   def compareTo(x1 : String) : Int = toString.compareTo(x1)
   def compareToIgnoreCase(x1 : String) : Int = toString.compareToIgnoreCase(x1)
   def concat(x1 : String) : NonEmptyString = NonEmptyString(head, tail.concat(x1))
   def contains(x1 : CharSequence) : Boolean = toString.contains(x1)
   def contentEquals(x1 : CharSequence) : Boolean = toString.contentEquals(x1)
   def contentEquals(x1 : StringBuffer) : Boolean = toString.contentEquals(x1)
   def endsWith(x1 : String) : Boolean = toString.endsWith(x1)
   def equalsIgnoreCase(x1 : String) : Boolean = toString.equalsIgnoreCase(x1)
   def getBytes : Array[Byte] = toString.getBytes
   def getBytes(x1 : Int, x2 : Int, x3 : Array[Byte], x4 : Int) : Unit = toString.getBytes(x1, x2, x3, x4)
   def getBytes(x1 : String) : Array[Byte] = toString.getBytes(x1)
   def getBytes(x1 : java.nio.charset.Charset) : Array[Byte] = toString.getBytes(x1)
   def getChars(x1 : Int, x2 : Int, x3 : Array[Char], x4 : Int) : Unit = toString.getChars(x1, x2, x3, x4)
   def indexOf(x1 : Int) : Int = toString.indexOf(x1)
   def indexOf(x1 : Int, x2 : Int) : Int = toString.indexOf(x1, x2)
   def indexOf(x1 : String) : Int = toString.indexOf(x1)
   def indexOf(x1 : String, x2 : Int) : Int = toString.indexOf(x1, x2)
   def intern : String = toString.intern
   def isEmpty : Boolean = toString.isEmpty
   def lastIndexOf(x1 : Int) : Int = toString.lastIndexOf(x1)
   def lastIndexOf(x1 : Int, x2 : Int) : Int = toString.lastIndexOf(x1, x2)
   def lastIndexOf(x1 : String) : Int = toString.lastIndexOf(x1)
   def lastIndexOf(x1 : String, x2 : Int) : Int = toString.lastIndexOf(x1, x2)
   def length : Int = toString.length
   def matches(x1 : String) : Boolean = toString.matches(x1)
   def offsetByCodePoints(x1 : Int, x2 : Int) : Int = toString.offsetByCodePoints(x1, x2)
   def regionMatches(x1 : Boolean, x2 : Int, x3 : String, x4 : Int, x5 : Int) : Boolean = toString.regionMatches(x1, x2, x3, x4, x5)
   def regionMatches(x1 : Int, x2 : String, x3 : Int, x4 : Int) : Boolean = toString.regionMatches(x1, x2, x3, x4)
   def replace(x1 : CharSequence, x2 : CharSequence) : String = toString.replace(x1, x2)
   def replace(oldChar : Char, newChar : Char) : NonEmptyString = {
      val newHead = if (head === oldChar) newChar else head
      NonEmptyString(newHead, tail.replace(oldChar, newChar))
   }
   def replaceAll(x1 : String, x2 : String) : String = toString.replaceAll(x1, x2)
   def replaceFirst(x1 : String, x2 : String) : String = toString.replaceFirst(x1, x2)
   def split(x1 : String) : Array[String] = toString.split(x1)
   def split(x1 : String, x2 : Int) : Array[String] = toString.split(x1, x2)
   def startsWith(x1 : String) : Boolean = toString.startsWith(x1)
   def startsWith(x1 : String, x2 : Int) : Boolean = toString.startsWith(x1, x2)
   def subSequence(x1 : Int, x2 : Int) : CharSequence = toString.subSequence(x1, x2)
   def substring(x1 : Int) : String = toString.substring(x1)
   def substring(x1 : Int, x2 : Int) : String = toString.substring(x1, x2)
   def toCharArray : Array[Char] = toString.toCharArray
   def toLowerCase : NonEmptyString =
      NonEmptyString(Character.toLowerCase(head), tail.toLowerCase)
   def toLowerCase(x1 : java.util.Locale) : NonEmptyString = {
      val lowerCase = toString.toLowerCase(x1)
      NonEmptyString(lowerCase.charAt(0), lowerCase.substring(1))
   }
   def toUpperCase : NonEmptyString =
      NonEmptyString(Character.toUpperCase(head), tail.toUpperCase)
   def toUpperCase(x1 : java.util.Locale) : NonEmptyString = {
      val upperCase = toString.toUpperCase(x1)
      NonEmptyString(upperCase.charAt(0), upperCase.substring(1))
   }
   def trim : String = toString.trim
}

object NonEmptyString {
   def fromString(s : String) : Option[NonEmptyString] =
      if (s.isEmpty)
         Some(NonEmptyString(s.charAt(0), s.substring(1)))
      else
         None

   implicit def toStringOps(nes : NonEmptyString) : StringOps = new StringOps(nes.toString)
}
