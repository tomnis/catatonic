package org.catatonic

/**
  * Morphisms compose
  *
  * Created by tdm on 3/3/18.
  */
trait Category[A] {

  /**
    *
    */
  def objects: Set[A]

  /**
    * Morphisms in this category. Note that we also have an identity morphism for every object.
    *
    * Could also be represented as a Set[(A, A)]
    */
  def morphisms: Set[Morphism[A]]
}
