(ns fizzbuzz.core)

(defn multiple? [x n]
  (= 0 (mod x n)))

(defn fizzbuzz [number]
  (if (multiple? number 3)
    (if (multiple? number 5) (prn "FizzBuzz") (prn "Fizz"))
    (if (multiple? number 5) (prn "Buzz") (prn number))))

(defn -main [& _]
  (loop [i 1]
    (when (< i 101)
      (fizzbuzz i)
      (recur (inc i)))))