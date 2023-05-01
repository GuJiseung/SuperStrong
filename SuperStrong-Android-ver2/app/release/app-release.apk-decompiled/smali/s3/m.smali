.class public final Ls3/m;
.super Ljava/util/AbstractMap;
.source "SourceFile"

# interfaces
.implements Ljava/io/Serializable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ls3/m$c;,
        Ls3/m$b;,
        Ls3/m$d;,
        Ls3/m$e;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<K:",
        "Ljava/lang/Object;",
        "V:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/util/AbstractMap<",
        "TK;TV;>;",
        "Ljava/io/Serializable;"
    }
.end annotation


# static fields
.field public static final i:Ls3/m$a;


# instance fields
.field public final b:Ljava/util/Comparator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Comparator<",
            "-TK;>;"
        }
    .end annotation
.end field

.field public c:Ls3/m$e;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ls3/m$e<",
            "TK;TV;>;"
        }
    .end annotation
.end field

.field public d:I

.field public e:I

.field public final f:Ls3/m$e;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ls3/m$e<",
            "TK;TV;>;"
        }
    .end annotation
.end field

.field public g:Ls3/m$b;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ls3/m<",
            "TK;TV;>.b;"
        }
    .end annotation
.end field

.field public h:Ls3/m$c;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ls3/m<",
            "TK;TV;>.c;"
        }
    .end annotation
.end field


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Ls3/m$a;

    invoke-direct {v0}, Ls3/m$a;-><init>()V

    sput-object v0, Ls3/m;->i:Ls3/m$a;

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    .line 1
    sget-object v0, Ls3/m;->i:Ls3/m$a;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/util/AbstractMap;-><init>()V

    .line 4
    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    iput v1, p0, Ls3/m;->d:I

    .line 8
    .line 9
    iput v1, p0, Ls3/m;->e:I

    .line 10
    .line 11
    new-instance v1, Ls3/m$e;

    .line 12
    .line 13
    invoke-direct {v1}, Ls3/m$e;-><init>()V

    .line 14
    .line 15
    .line 16
    iput-object v1, p0, Ls3/m;->f:Ls3/m$e;

    .line 17
    .line 18
    iput-object v0, p0, Ls3/m;->b:Ljava/util/Comparator;

    .line 19
    .line 20
    return-void
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
.end method


# virtual methods
.method public final a(Ljava/lang/Object;Z)Ls3/m$e;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TK;Z)",
            "Ls3/m$e<",
            "TK;TV;>;"
        }
    .end annotation

    iget-object v0, p0, Ls3/m;->c:Ls3/m$e;

    sget-object v1, Ls3/m;->i:Ls3/m$a;

    const/4 v2, 0x0

    iget-object v3, p0, Ls3/m;->b:Ljava/util/Comparator;

    if-eqz v0, :cond_5

    if-ne v3, v1, :cond_0

    move-object v4, p1

    check-cast v4, Ljava/lang/Comparable;

    goto :goto_0

    :cond_0
    move-object v4, v2

    :goto_0
    iget-object v5, v0, Ls3/m$e;->g:Ljava/lang/Object;

    if-eqz v4, :cond_1

    invoke-interface {v4, v5}, Ljava/lang/Comparable;->compareTo(Ljava/lang/Object;)I

    move-result v5

    goto :goto_1

    :cond_1
    invoke-interface {v3, p1, v5}, Ljava/util/Comparator;->compare(Ljava/lang/Object;Ljava/lang/Object;)I

    move-result v5

    :goto_1
    if-nez v5, :cond_2

    return-object v0

    :cond_2
    if-gez v5, :cond_3

    iget-object v6, v0, Ls3/m$e;->c:Ls3/m$e;

    goto :goto_2

    :cond_3
    iget-object v6, v0, Ls3/m$e;->d:Ls3/m$e;

    :goto_2
    if-nez v6, :cond_4

    goto :goto_3

    :cond_4
    move-object v0, v6

    goto :goto_0

    :cond_5
    const/4 v5, 0x0

    :goto_3
    if-nez p2, :cond_6

    return-object v2

    :cond_6
    const/4 p2, 0x1

    iget-object v2, p0, Ls3/m;->f:Ls3/m$e;

    if-nez v0, :cond_9

    if-ne v3, v1, :cond_8

    instance-of v1, p1, Ljava/lang/Comparable;

    if-eqz v1, :cond_7

    goto :goto_4

    :cond_7
    new-instance p2, Ljava/lang/ClassCastException;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object p1

    const-string v0, " is not Comparable"

    invoke-virtual {p1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/ClassCastException;-><init>(Ljava/lang/String;)V

    throw p2

    :cond_8
    :goto_4
    new-instance v1, Ls3/m$e;

    iget-object v3, v2, Ls3/m$e;->f:Ls3/m$e;

    invoke-direct {v1, v0, p1, v2, v3}, Ls3/m$e;-><init>(Ls3/m$e;Ljava/lang/Object;Ls3/m$e;Ls3/m$e;)V

    iput-object v1, p0, Ls3/m;->c:Ls3/m$e;

    goto :goto_6

    :cond_9
    new-instance v1, Ls3/m$e;

    iget-object v3, v2, Ls3/m$e;->f:Ls3/m$e;

    invoke-direct {v1, v0, p1, v2, v3}, Ls3/m$e;-><init>(Ls3/m$e;Ljava/lang/Object;Ls3/m$e;Ls3/m$e;)V

    if-gez v5, :cond_a

    iput-object v1, v0, Ls3/m$e;->c:Ls3/m$e;

    goto :goto_5

    :cond_a
    iput-object v1, v0, Ls3/m$e;->d:Ls3/m$e;

    :goto_5
    invoke-virtual {p0, v0, p2}, Ls3/m;->c(Ls3/m$e;Z)V

    :goto_6
    iget p1, p0, Ls3/m;->d:I

    add-int/2addr p1, p2

    iput p1, p0, Ls3/m;->d:I

    iget p1, p0, Ls3/m;->e:I

    add-int/2addr p1, p2

    iput p1, p0, Ls3/m;->e:I

    return-object v1
.end method

.method public final b(Ljava/util/Map$Entry;)Ls3/m$e;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map$Entry<",
            "**>;)",
            "Ls3/m$e<",
            "TK;TV;>;"
        }
    .end annotation

    .line 1
    invoke-interface {p1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const/4 v1, 0x0

    .line 6
    const/4 v2, 0x0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    :try_start_0
    invoke-virtual {p0, v0, v1}, Ls3/m;->a(Ljava/lang/Object;Z)Ls3/m$e;

    .line 10
    .line 11
    .line 12
    move-result-object v0
    :try_end_0
    .catch Ljava/lang/ClassCastException; {:try_start_0 .. :try_end_0} :catch_0

    .line 13
    goto :goto_0

    .line 14
    :catch_0
    :cond_0
    move-object v0, v2

    .line 15
    :goto_0
    if-eqz v0, :cond_3

    .line 16
    .line 17
    iget-object v3, v0, Ls3/m$e;->h:Ljava/lang/Object;

    .line 18
    .line 19
    invoke-interface {p1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    const/4 v4, 0x1

    .line 24
    if-eq v3, p1, :cond_2

    .line 25
    .line 26
    if-eqz v3, :cond_1

    .line 27
    .line 28
    invoke-virtual {v3, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 29
    .line 30
    .line 31
    move-result p1

    .line 32
    if-eqz p1, :cond_1

    .line 33
    .line 34
    goto :goto_1

    .line 35
    :cond_1
    move p1, v1

    .line 36
    goto :goto_2

    .line 37
    :cond_2
    :goto_1
    move p1, v4

    .line 38
    :goto_2
    if-eqz p1, :cond_3

    .line 39
    .line 40
    move v1, v4

    .line 41
    :cond_3
    if-eqz v1, :cond_4

    .line 42
    .line 43
    move-object v2, v0

    .line 44
    :cond_4
    return-object v2
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
.end method

.method public final c(Ls3/m$e;Z)V
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ls3/m$e<",
            "TK;TV;>;Z)V"
        }
    .end annotation

    :goto_0
    if-eqz p1, :cond_e

    iget-object v0, p1, Ls3/m$e;->c:Ls3/m$e;

    iget-object v1, p1, Ls3/m$e;->d:Ls3/m$e;

    const/4 v2, 0x0

    if-eqz v0, :cond_0

    iget v3, v0, Ls3/m$e;->i:I

    goto :goto_1

    :cond_0
    move v3, v2

    :goto_1
    if-eqz v1, :cond_1

    iget v4, v1, Ls3/m$e;->i:I

    goto :goto_2

    :cond_1
    move v4, v2

    :goto_2
    sub-int v5, v3, v4

    const/4 v6, -0x2

    if-ne v5, v6, :cond_6

    iget-object v0, v1, Ls3/m$e;->c:Ls3/m$e;

    iget-object v3, v1, Ls3/m$e;->d:Ls3/m$e;

    if-eqz v3, :cond_2

    iget v3, v3, Ls3/m$e;->i:I

    goto :goto_3

    :cond_2
    move v3, v2

    :goto_3
    if-eqz v0, :cond_3

    iget v2, v0, Ls3/m$e;->i:I

    :cond_3
    sub-int/2addr v2, v3

    const/4 v0, -0x1

    if-eq v2, v0, :cond_5

    if-nez v2, :cond_4

    if-nez p2, :cond_4

    goto :goto_4

    :cond_4
    invoke-virtual {p0, v1}, Ls3/m;->g(Ls3/m$e;)V

    :cond_5
    :goto_4
    invoke-virtual {p0, p1}, Ls3/m;->f(Ls3/m$e;)V

    if-eqz p2, :cond_d

    goto :goto_7

    :cond_6
    const/4 v1, 0x2

    const/4 v6, 0x1

    if-ne v5, v1, :cond_b

    iget-object v1, v0, Ls3/m$e;->c:Ls3/m$e;

    iget-object v3, v0, Ls3/m$e;->d:Ls3/m$e;

    if-eqz v3, :cond_7

    iget v3, v3, Ls3/m$e;->i:I

    goto :goto_5

    :cond_7
    move v3, v2

    :goto_5
    if-eqz v1, :cond_8

    iget v2, v1, Ls3/m$e;->i:I

    :cond_8
    sub-int/2addr v2, v3

    if-eq v2, v6, :cond_a

    if-nez v2, :cond_9

    if-nez p2, :cond_9

    goto :goto_6

    :cond_9
    invoke-virtual {p0, v0}, Ls3/m;->f(Ls3/m$e;)V

    :cond_a
    :goto_6
    invoke-virtual {p0, p1}, Ls3/m;->g(Ls3/m$e;)V

    if-eqz p2, :cond_d

    goto :goto_7

    :cond_b
    if-nez v5, :cond_c

    add-int/lit8 v3, v3, 0x1

    iput v3, p1, Ls3/m$e;->i:I

    if-eqz p2, :cond_d

    goto :goto_7

    :cond_c
    invoke-static {v3, v4}, Ljava/lang/Math;->max(II)I

    move-result v0

    add-int/2addr v0, v6

    iput v0, p1, Ls3/m$e;->i:I

    if-nez p2, :cond_d

    goto :goto_7

    :cond_d
    iget-object p1, p1, Ls3/m$e;->b:Ls3/m$e;

    goto :goto_0

    :cond_e
    :goto_7
    return-void
.end method

.method public final clear()V
    .locals 1

    const/4 v0, 0x0

    iput-object v0, p0, Ls3/m;->c:Ls3/m$e;

    const/4 v0, 0x0

    iput v0, p0, Ls3/m;->d:I

    iget v0, p0, Ls3/m;->e:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Ls3/m;->e:I

    iget-object v0, p0, Ls3/m;->f:Ls3/m$e;

    iput-object v0, v0, Ls3/m$e;->f:Ls3/m$e;

    iput-object v0, v0, Ls3/m$e;->e:Ls3/m$e;

    return-void
.end method

.method public final containsKey(Ljava/lang/Object;)Z
    .locals 1

    const/4 v0, 0x0

    if-eqz p1, :cond_0

    :try_start_0
    invoke-virtual {p0, p1, v0}, Ls3/m;->a(Ljava/lang/Object;Z)Ls3/m$e;

    move-result-object p1
    :try_end_0
    .catch Ljava/lang/ClassCastException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    :cond_0
    const/4 p1, 0x0

    :goto_0
    if-eqz p1, :cond_1

    const/4 v0, 0x1

    :cond_1
    return v0
.end method

.method public final d(Ls3/m$e;Z)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ls3/m$e<",
            "TK;TV;>;Z)V"
        }
    .end annotation

    .line 1
    if-eqz p2, :cond_0

    .line 2
    .line 3
    iget-object p2, p1, Ls3/m$e;->f:Ls3/m$e;

    .line 4
    .line 5
    iget-object v0, p1, Ls3/m$e;->e:Ls3/m$e;

    .line 6
    .line 7
    iput-object v0, p2, Ls3/m$e;->e:Ls3/m$e;

    .line 8
    .line 9
    iget-object v0, p1, Ls3/m$e;->e:Ls3/m$e;

    .line 10
    .line 11
    iput-object p2, v0, Ls3/m$e;->f:Ls3/m$e;

    .line 12
    .line 13
    :cond_0
    iget-object p2, p1, Ls3/m$e;->c:Ls3/m$e;

    .line 14
    .line 15
    iget-object v0, p1, Ls3/m$e;->d:Ls3/m$e;

    .line 16
    .line 17
    iget-object v1, p1, Ls3/m$e;->b:Ls3/m$e;

    .line 18
    .line 19
    const/4 v2, 0x0

    .line 20
    const/4 v3, 0x0

    .line 21
    if-eqz p2, :cond_6

    .line 22
    .line 23
    if-eqz v0, :cond_6

    .line 24
    .line 25
    iget v1, p2, Ls3/m$e;->i:I

    .line 26
    .line 27
    iget v4, v0, Ls3/m$e;->i:I

    .line 28
    .line 29
    if-le v1, v4, :cond_1

    .line 30
    .line 31
    :goto_0
    iget-object v0, p2, Ls3/m$e;->d:Ls3/m$e;

    .line 32
    .line 33
    move-object v5, v0

    .line 34
    move-object v0, p2

    .line 35
    move-object p2, v5

    .line 36
    if-eqz p2, :cond_3

    .line 37
    .line 38
    goto :goto_0

    .line 39
    :cond_1
    :goto_1
    iget-object p2, v0, Ls3/m$e;->c:Ls3/m$e;

    .line 40
    .line 41
    move-object v5, v0

    .line 42
    move-object v0, p2

    .line 43
    move-object p2, v5

    .line 44
    if-eqz v0, :cond_2

    .line 45
    .line 46
    goto :goto_1

    .line 47
    :cond_2
    move-object v0, p2

    .line 48
    :cond_3
    invoke-virtual {p0, v0, v2}, Ls3/m;->d(Ls3/m$e;Z)V

    .line 49
    .line 50
    .line 51
    iget-object p2, p1, Ls3/m$e;->c:Ls3/m$e;

    .line 52
    .line 53
    if-eqz p2, :cond_4

    .line 54
    .line 55
    iget v1, p2, Ls3/m$e;->i:I

    .line 56
    .line 57
    iput-object p2, v0, Ls3/m$e;->c:Ls3/m$e;

    .line 58
    .line 59
    iput-object v0, p2, Ls3/m$e;->b:Ls3/m$e;

    .line 60
    .line 61
    iput-object v3, p1, Ls3/m$e;->c:Ls3/m$e;

    .line 62
    .line 63
    goto :goto_2

    .line 64
    :cond_4
    move v1, v2

    .line 65
    :goto_2
    iget-object p2, p1, Ls3/m$e;->d:Ls3/m$e;

    .line 66
    .line 67
    if-eqz p2, :cond_5

    .line 68
    .line 69
    iget v2, p2, Ls3/m$e;->i:I

    .line 70
    .line 71
    iput-object p2, v0, Ls3/m$e;->d:Ls3/m$e;

    .line 72
    .line 73
    iput-object v0, p2, Ls3/m$e;->b:Ls3/m$e;

    .line 74
    .line 75
    iput-object v3, p1, Ls3/m$e;->d:Ls3/m$e;

    .line 76
    .line 77
    :cond_5
    invoke-static {v1, v2}, Ljava/lang/Math;->max(II)I

    .line 78
    .line 79
    .line 80
    move-result p2

    .line 81
    add-int/lit8 p2, p2, 0x1

    .line 82
    .line 83
    iput p2, v0, Ls3/m$e;->i:I

    .line 84
    .line 85
    invoke-virtual {p0, p1, v0}, Ls3/m;->e(Ls3/m$e;Ls3/m$e;)V

    .line 86
    .line 87
    .line 88
    return-void

    .line 89
    :cond_6
    if-eqz p2, :cond_7

    .line 90
    .line 91
    invoke-virtual {p0, p1, p2}, Ls3/m;->e(Ls3/m$e;Ls3/m$e;)V

    .line 92
    .line 93
    .line 94
    iput-object v3, p1, Ls3/m$e;->c:Ls3/m$e;

    .line 95
    .line 96
    goto :goto_3

    .line 97
    :cond_7
    if-eqz v0, :cond_8

    .line 98
    .line 99
    invoke-virtual {p0, p1, v0}, Ls3/m;->e(Ls3/m$e;Ls3/m$e;)V

    .line 100
    .line 101
    .line 102
    iput-object v3, p1, Ls3/m$e;->d:Ls3/m$e;

    .line 103
    .line 104
    goto :goto_3

    .line 105
    :cond_8
    invoke-virtual {p0, p1, v3}, Ls3/m;->e(Ls3/m$e;Ls3/m$e;)V

    .line 106
    .line 107
    .line 108
    :goto_3
    invoke-virtual {p0, v1, v2}, Ls3/m;->c(Ls3/m$e;Z)V

    .line 109
    .line 110
    .line 111
    iget p1, p0, Ls3/m;->d:I

    .line 112
    .line 113
    add-int/lit8 p1, p1, -0x1

    .line 114
    .line 115
    iput p1, p0, Ls3/m;->d:I

    .line 116
    .line 117
    iget p1, p0, Ls3/m;->e:I

    .line 118
    .line 119
    add-int/lit8 p1, p1, 0x1

    .line 120
    .line 121
    iput p1, p0, Ls3/m;->e:I

    .line 122
    .line 123
    return-void
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
.end method

.method public final e(Ls3/m$e;Ls3/m$e;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ls3/m$e<",
            "TK;TV;>;",
            "Ls3/m$e<",
            "TK;TV;>;)V"
        }
    .end annotation

    iget-object v0, p1, Ls3/m$e;->b:Ls3/m$e;

    const/4 v1, 0x0

    iput-object v1, p1, Ls3/m$e;->b:Ls3/m$e;

    if-eqz p2, :cond_0

    iput-object v0, p2, Ls3/m$e;->b:Ls3/m$e;

    :cond_0
    if-eqz v0, :cond_2

    iget-object v1, v0, Ls3/m$e;->c:Ls3/m$e;

    if-ne v1, p1, :cond_1

    iput-object p2, v0, Ls3/m$e;->c:Ls3/m$e;

    goto :goto_0

    :cond_1
    iput-object p2, v0, Ls3/m$e;->d:Ls3/m$e;

    goto :goto_0

    :cond_2
    iput-object p2, p0, Ls3/m;->c:Ls3/m$e;

    :goto_0
    return-void
.end method

.method public final entrySet()Ljava/util/Set;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "Ljava/util/Map$Entry<",
            "TK;TV;>;>;"
        }
    .end annotation

    iget-object v0, p0, Ls3/m;->g:Ls3/m$b;

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    new-instance v0, Ls3/m$b;

    invoke-direct {v0, p0}, Ls3/m$b;-><init>(Ls3/m;)V

    iput-object v0, p0, Ls3/m;->g:Ls3/m$b;

    :goto_0
    return-object v0
.end method

.method public final f(Ls3/m$e;)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ls3/m$e<",
            "TK;TV;>;)V"
        }
    .end annotation

    iget-object v0, p1, Ls3/m$e;->c:Ls3/m$e;

    iget-object v1, p1, Ls3/m$e;->d:Ls3/m$e;

    iget-object v2, v1, Ls3/m$e;->c:Ls3/m$e;

    iget-object v3, v1, Ls3/m$e;->d:Ls3/m$e;

    iput-object v2, p1, Ls3/m$e;->d:Ls3/m$e;

    if-eqz v2, :cond_0

    iput-object p1, v2, Ls3/m$e;->b:Ls3/m$e;

    :cond_0
    invoke-virtual {p0, p1, v1}, Ls3/m;->e(Ls3/m$e;Ls3/m$e;)V

    iput-object p1, v1, Ls3/m$e;->c:Ls3/m$e;

    iput-object v1, p1, Ls3/m$e;->b:Ls3/m$e;

    const/4 v4, 0x0

    if-eqz v0, :cond_1

    iget v0, v0, Ls3/m$e;->i:I

    goto :goto_0

    :cond_1
    move v0, v4

    :goto_0
    if-eqz v2, :cond_2

    iget v2, v2, Ls3/m$e;->i:I

    goto :goto_1

    :cond_2
    move v2, v4

    :goto_1
    invoke-static {v0, v2}, Ljava/lang/Math;->max(II)I

    move-result v0

    add-int/lit8 v0, v0, 0x1

    iput v0, p1, Ls3/m$e;->i:I

    if-eqz v3, :cond_3

    iget v4, v3, Ls3/m$e;->i:I

    :cond_3
    invoke-static {v0, v4}, Ljava/lang/Math;->max(II)I

    move-result p1

    add-int/lit8 p1, p1, 0x1

    iput p1, v1, Ls3/m$e;->i:I

    return-void
.end method

.method public final g(Ls3/m$e;)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ls3/m$e<",
            "TK;TV;>;)V"
        }
    .end annotation

    iget-object v0, p1, Ls3/m$e;->c:Ls3/m$e;

    iget-object v1, p1, Ls3/m$e;->d:Ls3/m$e;

    iget-object v2, v0, Ls3/m$e;->c:Ls3/m$e;

    iget-object v3, v0, Ls3/m$e;->d:Ls3/m$e;

    iput-object v3, p1, Ls3/m$e;->c:Ls3/m$e;

    if-eqz v3, :cond_0

    iput-object p1, v3, Ls3/m$e;->b:Ls3/m$e;

    :cond_0
    invoke-virtual {p0, p1, v0}, Ls3/m;->e(Ls3/m$e;Ls3/m$e;)V

    iput-object p1, v0, Ls3/m$e;->d:Ls3/m$e;

    iput-object v0, p1, Ls3/m$e;->b:Ls3/m$e;

    const/4 v4, 0x0

    if-eqz v1, :cond_1

    iget v1, v1, Ls3/m$e;->i:I

    goto :goto_0

    :cond_1
    move v1, v4

    :goto_0
    if-eqz v3, :cond_2

    iget v3, v3, Ls3/m$e;->i:I

    goto :goto_1

    :cond_2
    move v3, v4

    :goto_1
    invoke-static {v1, v3}, Ljava/lang/Math;->max(II)I

    move-result v1

    add-int/lit8 v1, v1, 0x1

    iput v1, p1, Ls3/m$e;->i:I

    if-eqz v2, :cond_3

    iget v4, v2, Ls3/m$e;->i:I

    :cond_3
    invoke-static {v1, v4}, Ljava/lang/Math;->max(II)I

    move-result p1

    add-int/lit8 p1, p1, 0x1

    iput p1, v0, Ls3/m$e;->i:I

    return-void
.end method

.method public final get(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            ")TV;"
        }
    .end annotation

    .line 1
    const/4 v0, 0x0

    .line 2
    if-eqz p1, :cond_0

    .line 3
    .line 4
    const/4 v1, 0x0

    .line 5
    :try_start_0
    invoke-virtual {p0, p1, v1}, Ls3/m;->a(Ljava/lang/Object;Z)Ls3/m$e;

    .line 6
    .line 7
    .line 8
    move-result-object p1
    :try_end_0
    .catch Ljava/lang/ClassCastException; {:try_start_0 .. :try_end_0} :catch_0

    .line 9
    goto :goto_0

    .line 10
    :catch_0
    :cond_0
    move-object p1, v0

    .line 11
    :goto_0
    if-eqz p1, :cond_1

    .line 12
    .line 13
    iget-object v0, p1, Ls3/m$e;->h:Ljava/lang/Object;

    .line 14
    .line 15
    :cond_1
    return-object v0
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
.end method

.method public final keySet()Ljava/util/Set;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "TK;>;"
        }
    .end annotation

    iget-object v0, p0, Ls3/m;->h:Ls3/m$c;

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    new-instance v0, Ls3/m$c;

    invoke-direct {v0, p0}, Ls3/m$c;-><init>(Ls3/m;)V

    iput-object v0, p0, Ls3/m;->h:Ls3/m$c;

    :goto_0
    return-object v0
.end method

.method public final put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TK;TV;)TV;"
        }
    .end annotation

    if-eqz p1, :cond_0

    const/4 v0, 0x1

    invoke-virtual {p0, p1, v0}, Ls3/m;->a(Ljava/lang/Object;Z)Ls3/m$e;

    move-result-object p1

    iget-object v0, p1, Ls3/m$e;->h:Ljava/lang/Object;

    iput-object p2, p1, Ls3/m$e;->h:Ljava/lang/Object;

    return-object v0

    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    const-string p2, "key == null"

    invoke-direct {p1, p2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final remove(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            ")TV;"
        }
    .end annotation

    .line 1
    const/4 v0, 0x0

    .line 2
    if-eqz p1, :cond_0

    .line 3
    .line 4
    const/4 v1, 0x0

    .line 5
    :try_start_0
    invoke-virtual {p0, p1, v1}, Ls3/m;->a(Ljava/lang/Object;Z)Ls3/m$e;

    .line 6
    .line 7
    .line 8
    move-result-object p1
    :try_end_0
    .catch Ljava/lang/ClassCastException; {:try_start_0 .. :try_end_0} :catch_0

    .line 9
    goto :goto_0

    .line 10
    :catch_0
    :cond_0
    move-object p1, v0

    .line 11
    :goto_0
    if-eqz p1, :cond_1

    .line 12
    .line 13
    const/4 v1, 0x1

    .line 14
    invoke-virtual {p0, p1, v1}, Ls3/m;->d(Ls3/m$e;Z)V

    .line 15
    .line 16
    .line 17
    :cond_1
    if-eqz p1, :cond_2

    .line 18
    .line 19
    iget-object v0, p1, Ls3/m$e;->h:Ljava/lang/Object;

    .line 20
    .line 21
    :cond_2
    return-object v0
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
.end method

.method public final size()I
    .locals 1

    iget v0, p0, Ls3/m;->d:I

    return v0
.end method
