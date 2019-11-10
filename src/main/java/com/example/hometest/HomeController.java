package com.example.hometest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;

@RestController
public class HomeController {

    @RequestMapping("/")
    public String index() {
        return "hi intelliJ spring boot!";
    }

    @RequestMapping("test1")
    @ResponseBody
    public Map<String, Object> test1() {
        Map<String, Object> ret = new HashMap<String, Object>();
        ret.put("key1", "value1");
        ret.put("key2", "value2");

        return ret;
    }

    @RequestMapping("test2")
    @ResponseBody
    public List<Map<String, Object>> test2() {
        List<Map<String, Object>> list = new List<Map<String, Object>>() {
            @Override
            public int size() {
                return 0;
            }

            @Override
            public boolean isEmpty() {
                return false;
            }

            @Override
            public boolean contains(Object o) {
                return false;
            }

            @Override
            public Iterator<Map<String, Object>> iterator() {
                return null;
            }

            @Override
            public Object[] toArray() {
                return new Object[0];
            }

            @Override
            public <T> T[] toArray(T[] a) {
                return null;
            }

            @Override
            public boolean add(Map<String, Object> stringObjectMap) {
                return false;
            }

            @Override
            public boolean remove(Object o) {
                return false;
            }

            @Override
            public boolean containsAll(Collection<?> c) {
                return false;
            }

            @Override
            public boolean addAll(Collection<? extends Map<String, Object>> c) {
                return false;
            }

            @Override
            public boolean addAll(int index, Collection<? extends Map<String, Object>> c) {
                return false;
            }

            @Override
            public boolean removeAll(Collection<?> c) {
                return false;
            }

            @Override
            public boolean retainAll(Collection<?> c) {
                return false;
            }

            @Override
            public void clear() {

            }

            @Override
            public boolean equals(Object o) {
                return false;
            }

            @Override
            public int hashCode() {
                return 0;
            }

            @Override
            public Map<String, Object> get(int index) {
                return null;
            }

            @Override
            public Map<String, Object> set(int index, Map<String, Object> element) {
                return null;
            }

            @Override
            public void add(int index, Map<String, Object> element) {

            }

            @Override
            public Map<String, Object> remove(int index) {
                return null;
            }

            @Override
            public int indexOf(Object o) {
                return 0;
            }

            @Override
            public int lastIndexOf(Object o) {
                return 0;
            }

            @Override
            public ListIterator<Map<String, Object>> listIterator() {
                return null;
            }

            @Override
            public ListIterator<Map<String, Object>> listIterator(int index) {
                return null;
            }

            @Override
            public List<Map<String, Object>> subList(int fromIndex, int toIndex) {
                return null;
            }
        };
        Map<String, Object> ret1 = new HashMap<String, Object>();
        ret1.put("key1", "value1");
        ret1.put("key2", "value2");
        list.add(ret1);
        Map<String, Object> ret2 = new HashMap<String, Object>();
        ret2.put("key3", "value3");
        ret2.put("key4", "value4");
        list.add(ret2);
        System.out.println("##### list: "+list.toString());
        return list;
    }

}
