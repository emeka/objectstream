/**
 * Copyright 2013 Emeka Mosanya, all rights reserved.
 *
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * Proprietary and confidential.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND
 * ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED
 * WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE
 * DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT HOLDER BE LIABLE FOR ANY
 * DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES
 * (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES;
 * LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND
 * ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT
 * (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS
 * SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */

package org.objectstream.model;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

public class A {
    private B b;
    private long value;

    public B getB() {
        return b;
    }

    public void setB(B b) {
        this.b = b;
    }

    public void setValue(long value) {
        this.value = value;
    }

    public long getValue(){
        return this.value;
    }

    public long getResult() {
        return value + (b != null ? b.getResult() : 0);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17,37).append(value).append(b).toHashCode();
    }

    @Override
    public boolean equals(Object object) {
        if (object == this) return true;
        if (object == null) return false;
        if (this.getClass() != object.getClass()) return false;
        A other = (A) object;
        return new EqualsBuilder().append(value, other.value).append(b,other.b).isEquals();
    }
}
