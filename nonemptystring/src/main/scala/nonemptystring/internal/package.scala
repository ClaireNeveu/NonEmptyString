package nonemptystring

package object internal {
   @SuppressWarnings(Array("org.wartremover.warts.Equals"))
   implicit final private[nonemptystring] class AnyOps[A](self : A) {
      def ===(other : A) : Boolean = self == other
      def =/=(other : A) : Boolean = self != other
   }

}
