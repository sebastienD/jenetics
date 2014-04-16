/*
 * Java Genetic Algorithm Library (@__identifier__@).
 * Copyright (c) @__year__@ Franz Wilhelmstötter
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 * Author:
 *    Franz Wilhelmstötter (franz.wilhelmstoetter@gmx.at)
 */
package org.jenetics;

import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collector;
import java.util.stream.Collectors;

/**
 * @author <a href="mailto:franz.wilhelmstoetter@gmx.at">Franz Wilhelmstötter</a>
 * @version @__version__@ &mdash; <em>$Date: 2013-11-01 $</em>
 * @since @__version__@
 */
public class StatisticsCollector<
	G extends Gene<?, G>,
	C extends Comparable<? super C>,
	A
>
	implements Collector<Phenotype<G, C>, A, Stats<G, C>>
{

	Collectors f;

	static <G extends Gene<?, G>, C extends Comparable<? super C>>
	Collector<Phenotype<G, C>, ?, Stats<G, C>> collector() {
		return null;
	}

	@Override
	public Supplier<A> supplier() {
		return null;
	}

	@Override
	public BiConsumer<A, Phenotype<G, C>> accumulator() {
		return null;
	}

	@Override
	public BinaryOperator<A> combiner() {
		return null;
	}

	@Override
	public Function<A, Stats<G, C>> finisher() {
		return null;
	}

	@Override
	public Set<Characteristics> characteristics() {
		return null;
	}
}