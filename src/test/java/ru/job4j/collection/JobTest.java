package ru.job4j.collection;

import org.junit.jupiter.api.Test;
import java.util.Comparator;
import static org.assertj.core.api.Assertions.assertThat;

public class JobTest {
    @Test
    public void whenComparatorByNameAndPriority() {
        Comparator<Job> cmpNamePriority = new JobDescByName().thenComparing(new JobDescByPriority());
        int rsl = cmpNamePriority.compare(
                new Job("Impl task", 0),
                new Job("Fix bug", 1)
        );
        assertThat(rsl).isLessThan(0);
    }

    @Test
    public void whenComparatorAscByName() {
        Comparator<Job> cmpAscByName = new JobAscByName();
        int rsl = cmpAscByName.compare(
                new Job("Impl task", 0),
                new Job("Fix bug", 1)
        );
        assertThat(rsl).isGreaterThan(0);
    }

    @Test
    public void whenComparatorDescByName() {
        Comparator<Job> cmpDescByName = new JobDescByName();
        int rsl = cmpDescByName.compare(
                new Job("Fix bug", 0),
                new Job("Impl task", 1)
        );
        assertThat(rsl).isGreaterThan(0);
    }

    @Test
    public void whenComparatorAscByPriority() {
        Comparator<Job> cmpAscByPriority = new JobAscByPriority();
        int rsl = cmpAscByPriority.compare(
                new Job("Fix bug", 0),
                new Job("Impl task", 1)
        );
        assertThat(rsl).isLessThan(0);
    }

    @Test
    public void whenComparatorDescByPriority() {
        Comparator<Job> cmpDescByPriority = new JobDescByPriority();
        int rsl = cmpDescByPriority.compare(
                new Job("Fix bug", 0),
                new Job("Impl task", 1)
        );
        assertThat(rsl).isGreaterThan(0);
    }

    @Test
    public void whenComparatorAscByNameAndAscByPriority() {
        Comparator<Job> cmpAscByNameAndAscByPriority = new JobAscByName().thenComparing(new JobAscByPriority());
        int rsl = cmpAscByNameAndAscByPriority.compare(
                new Job("Fix bug", 0),
                new Job("Fix bug", 1)
        );
        assertThat(rsl).isLessThan(0);
    }

    @Test
    public void whenComparatorDescByNameAndAscByPriority() {
        Comparator<Job> cmpDescByNameAndAscByPriority = new JobDescByName().thenComparing(new JobAscByPriority());
        int rsl = cmpDescByNameAndAscByPriority.compare(
                new Job("Fix bug", 0),
                new Job("Impl task", 1)
        );
        assertThat(rsl).isGreaterThan(0);
        rsl = cmpDescByNameAndAscByPriority.compare(
                new Job("Fix bug", 0),
                new Job("Fix bug", 1)
        );
        assertThat(rsl).isLessThan(0);
    }

    @Test
    public void whenComparatorAscByNameAndDescByPriority() {
        Comparator<Job> cmpAscByNameAndDescByPriority = new JobAscByName().thenComparing(new JobDescByPriority());
        int rsl = cmpAscByNameAndDescByPriority.compare(
                new Job("Fix bug", 1),
                new Job("Impl task", 1)
        );
        assertThat(rsl).isLessThan(0);
        rsl = cmpAscByNameAndDescByPriority.compare(
                new Job("Impl task", 1),
                new Job("Impl task", 1)
        );
        assertThat(rsl).isEqualTo(0);
    }
}