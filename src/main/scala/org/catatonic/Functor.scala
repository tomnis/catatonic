package org.catatonic

/**
  * A (covariant) Functor is a mapping between categories.
  *
  * - each object in C is associated with some object in D
  * - each morphism f in C is associated with some morphism g in D such that identity and composition are preserved.
  *
  * Created by tdm on 3/3/18.
  */
trait Functor[A, B] {

  def fromCat: Category[A]

  def toCat: Category[B]

  def mapObject(a: A): B

  def mapMorphism(m: Morphism[A]): Morphism[B]
}


/**
  * A Cofunctor reversed the direction of composition. This is a contravariant functor.
  *
  * @tparam A
  * @tparam B
  */
trait Cofunctor[A, B] {
  def fromCat: Category[A]

  def toCat: Category[B]

  def mapObject(a: A): B

  def mapMorphism(m: Morphism[B]): Morphism[A]
}