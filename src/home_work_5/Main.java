package home_work_5;

import home_work_5.DTO.Animal;
import home_work_5.DTO.Person;
import home_work_5.comparator.AgeNickOfAnimalComparator;
import home_work_5.comparator.AnimalAgeComparator;
import home_work_5.comparator.LenghtPasswordComparator;
import home_work_5.comparator.PasswordNickComparator;
import home_work_5.random.*;
import home_work_5.supplier.SupplierAnimal;
import home_work_5.supplier.SupplierPerson;
import home_work_5.utils.GenerateCollection;
import home_work_5.utils.Sort;
import home_work_5.utils.TimeMeasurement;

import java.util.*;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        int count = 1000000;
        GenerateCollection collection = new GenerateCollection();

        Collection<Person> linkedListPerson = collection.generateCollection(new SupplierPerson(new RandomEnglishNick(), new RandomRussianName()), new LinkedList<>(), count);
        Sort.sort(linkedListPerson, new PasswordNickComparator());
        System.out.println(linkedListPerson);
        Collections.sort((List<Person>) linkedListPerson, new PasswordNickComparator());
        String timeLinkedListPerson = TimeMeasurement.collectionFillingTime(new SupplierPerson(new RandomEnglishNick(), new RandomRussianName()), new LinkedList<>(), count);
        System.out.println(timeLinkedListPerson);
        String timeLinkedListPersonIterator = TimeMeasurement.collectionIterationTime(linkedListPerson);
        System.out.println(timeLinkedListPersonIterator);
        String timeLinkedListPersonIteratorWithFor = TimeMeasurement.collectionIterationWithForTime(linkedListPerson);
        System.out.println(timeLinkedListPersonIteratorWithFor);
        String timeDeleteObjectsPerson = TimeMeasurement.deletingObjectsTime(linkedListPerson);
        System.out.println(timeDeleteObjectsPerson);
        System.out.println();

        Collection<Animal> linkedListAnimal = collection.generateCollection(new SupplierAnimal(new RandomRussianName()), new LinkedList<>(),count);
        Collections.sort((List<Animal>) linkedListAnimal, new AnimalAgeComparator());
        String timeLinkedListAnimal = TimeMeasurement.collectionFillingTime(new SupplierAnimal(new RandomRussianName()), new LinkedList<>(),count);
        System.out.println(timeLinkedListAnimal);
        String timeLinkedListAnimalIterator = TimeMeasurement.collectionIterationTime(linkedListAnimal);
        System.out.println(timeLinkedListAnimalIterator);
        String timeLinkedListAnimalIteratorWithFor = TimeMeasurement.collectionIterationWithForTime(linkedListAnimal);
        System.out.println(timeLinkedListAnimalIteratorWithFor);
        String timeDeleteObjectsAnimal = TimeMeasurement.deletingObjectsTime(linkedListAnimal);
        System.out.println(timeDeleteObjectsAnimal);
        System.out.println();

        Collection<Person> arrayListPerson = collection.generateCollection(new SupplierPerson(new RandomEnglishNick(), new RandomRussianName()), new ArrayList<>(), count);
        Collections.sort((List<Person>) arrayListPerson, new PasswordNickComparator());
        String timeArrayListPerson = TimeMeasurement.collectionFillingTime(new SupplierPerson(new RandomEnglishNick(), new RandomRussianName()), new ArrayList<>(), count);
        System.out.println(timeArrayListPerson);
        String timeArrayListPersonIterator = TimeMeasurement.collectionIterationTime(arrayListPerson);
        System.out.println(timeArrayListPersonIterator);
        String timeArrayListPersonIteratorWithFor = TimeMeasurement.collectionIterationWithForTime(arrayListPerson);
        System.out.println(timeArrayListPersonIteratorWithFor);
        String timeDeleteObjectsOfArrayListPerson = TimeMeasurement.deletingObjectsTime(arrayListPerson);
        System.out.println(timeDeleteObjectsOfArrayListPerson);
        System.out.println();

        Collection<Animal> arrayListAnimal = collection.generateCollection(new SupplierAnimal(new RandomRussianName()), new ArrayList<>(),count);
        Collections.sort((List<Animal>) arrayListAnimal, new AgeNickOfAnimalComparator());
        String timeArrayListAnimal = TimeMeasurement.collectionFillingTime(new SupplierAnimal(new RandomRussianName()), new ArrayList<>(),count);
        System.out.println(timeArrayListAnimal);
        String timeArrayListAnimalIterator = TimeMeasurement.collectionIterationTime(arrayListAnimal);
        System.out.println(timeArrayListAnimalIterator);
        String timeArrayListAnimalIteratorWithFor = TimeMeasurement.collectionIterationWithForTime(arrayListAnimal);
        System.out.println(timeArrayListAnimalIteratorWithFor);
        String timeDeleteObjectsOfArrayListAnimal = TimeMeasurement.deletingObjectsTime(arrayListAnimal);
        System.out.println(timeDeleteObjectsOfArrayListAnimal);
        System.out.println();

        Collection<Person> hashSetPerson = collection.generateCollection(new SupplierPerson(new RandomEnglishNick(),new RandomRealName()), new HashSet<>(),count);
        String timeHashSetPerson = TimeMeasurement.collectionFillingTime(new SupplierPerson(new RandomEnglishNick(),new RandomRealName()), new HashSet<>(), count);
        System.out.println(timeHashSetPerson);
        String timeHashSetPersonIterator = TimeMeasurement.collectionIterationTime(hashSetPerson);
        System.out.println(timeHashSetPersonIterator);
        String timeHashSetPersonIteratorWithFor = TimeMeasurement.collectionIterationWithForTime(hashSetPerson);
        System.out.println(timeHashSetPersonIteratorWithFor);
        String timeDeleteObjectsOfHashSetPerson = TimeMeasurement.deletingObjectsTime(hashSetPerson);
        System.out.println(timeDeleteObjectsOfHashSetPerson);
        System.out.println();

        Collection<Animal> hashSetAnimal = collection.generateCollection(new SupplierAnimal(new RandomRussianName()), new HashSet<>(),count);
        String timeHashSetAnimal = TimeMeasurement.collectionFillingTime(new SupplierAnimal(new RandomRussianName()), new HashSet<>(),count);
        System.out.println(timeHashSetAnimal);
        String timeHashSetAnimalIterator = TimeMeasurement.collectionIterationTime(hashSetAnimal);
        System.out.println(timeHashSetAnimalIterator);
        String timeHashSetAnimalIteratorWithFor = TimeMeasurement.collectionIterationWithForTime(hashSetAnimal);
        System.out.println(timeHashSetAnimalIteratorWithFor);
        String timeDeleteObjectsOfHashSetAnimal = TimeMeasurement.deletingObjectsTime(hashSetAnimal);
        System.out.println(timeDeleteObjectsOfHashSetAnimal);
        System.out.println();

        Collection<Person> treeSetPerson = collection.generateCollection(new SupplierPerson(new RandomEnglishNick(), new RandomRussianName()), new TreeSet<>(new LenghtPasswordComparator().thenComparing(Person::getNick)),count);
        String timeTreeSetPerson = TimeMeasurement.collectionFillingTime(new SupplierPerson(new RandomEnglishNick(), new RandomRussianName()), new TreeSet<>(new LenghtPasswordComparator().thenComparing(Person::getNick)), count);
        System.out.println(timeTreeSetPerson);
        String timeTreeSetPersonIterator = TimeMeasurement.collectionIterationTime(treeSetPerson);
        System.out.println(timeTreeSetPersonIterator);
        String timeTreeSetPersonIteratorWithFor = TimeMeasurement.collectionIterationWithForTime(treeSetPerson);
        System.out.println(timeTreeSetPersonIteratorWithFor);
        String timeDeleteObjectsOfTreeSetPerson = TimeMeasurement.deletingObjectsTime(treeSetPerson);
        System.out.println(timeDeleteObjectsOfTreeSetPerson);
        System.out.println();

        Collection<Animal> treeSetAnimal = collection.generateCollection(new SupplierAnimal(new RandomRussianName()), new TreeSet<>(new AnimalAgeComparator().thenComparing(Animal::getNick)),count);
        String timeTreeSetAnimal = TimeMeasurement.collectionFillingTime(new SupplierAnimal(new RandomRussianName()), new TreeSet<>(new AnimalAgeComparator().thenComparing(Animal::getNick)), count);
        System.out.println(timeTreeSetAnimal);
        String timeTreeSetAnimalIterator = TimeMeasurement.collectionIterationTime(treeSetAnimal);
        System.out.println(timeTreeSetAnimalIterator);
        String timeTreeSetAnimalIteratorWithFor = TimeMeasurement.collectionIterationWithForTime(treeSetAnimal);
        System.out.println(timeTreeSetAnimalIteratorWithFor);
        String timeDeleteObjectsOfTreeSetAnimal = TimeMeasurement.deletingObjectsTime(treeSetAnimal);
        System.out.println(timeDeleteObjectsOfTreeSetAnimal);
        System.out.println();
    }
}
