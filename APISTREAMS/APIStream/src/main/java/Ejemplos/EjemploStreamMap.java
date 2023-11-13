package Ejemplos;

import java.util.Comparator;
import java.util.Iterator;
import java.util.Optional;
import java.util.Spliterator;
import java.util.function.*;
import java.util.stream.*;

public class EjemploStreamMap {
    public static void main(String[] args) {
        /*Stream<String> nombres = Stream.of("Pato", "Paco", "Pepa", "Pepe")
                .map(nombre->{
                    return nombre.toUpperCase();
                });
        nombres.forEach(System.out::println);
        */

        Stream<String> nombres = new Stream<String>() {
            @Override
            public Stream<String> filter(Predicate<? super String> predicate) {
                return null;
            }

            @Override
            public <R> Stream<R> map(Function<? super String, ? extends R> mapper) {
                return null;
            }

            @Override
            public IntStream mapToInt(ToIntFunction<? super String> mapper) {
                return null;
            }

            @Override
            public LongStream mapToLong(ToLongFunction<? super String> mapper) {
                return null;
            }

            @Override
            public DoubleStream mapToDouble(ToDoubleFunction<? super String> mapper) {
                return null;
            }

            @Override
            public <R> Stream<R> flatMap(Function<? super String, ? extends Stream<? extends R>> mapper) {
                return null;
            }

            @Override
            public IntStream flatMapToInt(Function<? super String, ? extends IntStream> mapper) {
                return null;
            }

            @Override
            public LongStream flatMapToLong(Function<? super String, ? extends LongStream> mapper) {
                return null;
            }

            @Override
            public DoubleStream flatMapToDouble(Function<? super String, ? extends DoubleStream> mapper) {
                return null;
            }

            @Override
            public Stream<String> distinct() {
                return null;
            }

            @Override
            public Stream<String> sorted() {
                return null;
            }

            @Override
            public Stream<String> sorted(Comparator<? super String> comparator) {
                return null;
            }

            @Override
            public Stream<String> peek(Consumer<? super String> action) {
                return null;
            }

            @Override
            public Stream<String> limit(long maxSize) {
                return null;
            }

            @Override
            public Stream<String> skip(long n) {
                return null;
            }

            @Override
            public void forEach(Consumer<? super String> action) {

            }

            @Override
            public void forEachOrdered(Consumer<? super String> action) {

            }

            @Override
            public Object[] toArray() {
                return new Object[0];
            }

            @Override
            public <A> A[] toArray(IntFunction<A[]> generator) {
                return null;
            }

            @Override
            public String reduce(String identity, BinaryOperator<String> accumulator) {
                return null;
            }

            @Override
            public Optional<String> reduce(BinaryOperator<String> accumulator) {
                return Optional.empty();
            }

            @Override
            public <U> U reduce(U identity, BiFunction<U, ? super String, U> accumulator, BinaryOperator<U> combiner) {
                return null;
            }

            @Override
            public <R> R collect(Supplier<R> supplier, BiConsumer<R, ? super String> accumulator, BiConsumer<R, R> combiner) {
                return null;
            }

            @Override
            public <R, A> R collect(Collector<? super String, A, R> collector) {
                return null;
            }

            @Override
            public Optional<String> min(Comparator<? super String> comparator) {
                return Optional.empty();
            }

            @Override
            public Optional<String> max(Comparator<? super String> comparator) {
                return Optional.empty();
            }

            @Override
            public long count() {
                return 0;
            }

            @Override
            public boolean anyMatch(Predicate<? super String> predicate) {
                return false;
            }

            @Override
            public boolean allMatch(Predicate<? super String> predicate) {
                return false;
            }

            @Override
            public boolean noneMatch(Predicate<? super String> predicate) {
                return false;
            }

            @Override
            public Optional<String> findFirst() {
                return Optional.empty();
            }

            @Override
            public Optional<String> findAny() {
                return Optional.empty();
            }

            @Override
            public Iterator<String> iterator() {
                return null;
            }

            @Override
            public Spliterator<String> spliterator() {
                return null;
            }

            @Override
            public boolean isParallel() {
                return false;
            }

            @Override
            public Stream<String> sequential() {
                return null;
            }

            @Override
            public Stream<String> parallel() {
                return null;
            }

            @Override
            public Stream<String> unordered() {
                return null;
            }

            @Override
            public Stream<String> onClose(Runnable closeHandler) {
                return null;
            }

            @Override
            public void close() {

            }
        }

    }
}
