;
; This is an attempted solution for Project Euler Problem 91.
; Currently really rudimentary, but a really cool thing to work on with other
; people!
; I am trying an approach where I write functions to calculate the angle
; information, then use Clojure's built in permutation functions to
; calculate the solution.
;
; ~vladh
;

(defn slope [x1 y1 x2 y2] (let [xdiff (- x2 x1)] (if (= xdiff 0) 0 (/ (- y2 y1) xdiff))))
(defn angle [x1 y1 x2 y2 x3 y3] (- (abs (slope x1 y1 x2 y2)) (abs (slope x2 y2 x3 y3))))

(println (angle 0 0 1 1 2 0))
(println (angle 2 0 0 0 1 1))
(println (angle 2 1 0 0 2 0))
