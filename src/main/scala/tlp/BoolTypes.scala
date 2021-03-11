package tlp

object BoolTypes:

  type Not[B <: Boolean] <: Boolean = B match
    case true => false
    case false => true

  // type Or[B1 <: Boolean, B2 <: Boolean] <: Boolean = 

  // type And[B1 <: Boolean, B2 <: Boolean] <: Boolean = 

  // type If[C <: Boolean, A, B] = 

  summon[Not[true] =:= false]
  // summon[Or[true, false]] =:= true]
  // summon[Not[And[false, true]] =:= true]
  // summon[If[And[false, true], Int, Long] =:= Int]
  

