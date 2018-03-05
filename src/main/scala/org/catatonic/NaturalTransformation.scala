package org.catatonic

/**
  * A natural transformation is a mapping between functors.
  *
  * Created by tdm on 3/3/18.
  */
trait NaturalTransformation {

  def map[A, B, C, D](f: Functor[A, B]): Functor[C, D]
}
