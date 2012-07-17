(ns rigor.animation)

(defprotocol Movable
  (translate [this direction amount]))
