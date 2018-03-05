package org.catatonic

/**
  * Roughly, a mapping between two object of type A
  *
  * Created by tdm on 3/4/18.
  */
trait Morphism[A] {

  def from: A

  def to: A
}
