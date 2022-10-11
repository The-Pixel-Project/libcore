/*
 * Copyright (c) 2004, Oracle and/or its affiliates. All rights reserved.
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER.
 *
 * This code is free software; you can redistribute it and/or modify it
 * under the terms of the GNU General Public License version 2 only, as
 * published by the Free Software Foundation.
 *
 * This code is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or
 * FITNESS FOR A PARTICULAR PURPOSE.  See the GNU General Public License
 * version 2 for more details (a copy is included in the LICENSE file that
 * accompanied this code).
 *
 * You should have received a copy of the GNU General Public License version
 * 2 along with this work; if not, write to the Free Software Foundation,
 * Inc., 51 Franklin St, Fifth Floor, Boston, MA 02110-1301 USA.
 *
 * Please contact Oracle, 500 Oracle Parkway, Redwood Shores, CA 94065 USA
 * or visit www.oracle.com if you need additional information or have any
 * questions.
 */

/*
 * @test
 * @bug     4973432
 * @summary Test that toString on entrySet Iterator/Entry behaves reasonably
 * @author  Josh Bloch
 */

package test.java.util.IdentityHashMap;

import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class ToString {

    // Android-change: annotation added so runner can run the test
    @org.testng.annotations.Test
    public static void main(String[] args) {
        Map<String, String> m = new IdentityHashMap<>();
        Set<Map.Entry<String, String>> es = m.entrySet();
        m.put("beer", "good");
        Iterator<Map.Entry<String, String>> i = es.iterator();
        System.out.println(i); // Used to throw exception
        i.next();
        System.out.println(i);
    }
}