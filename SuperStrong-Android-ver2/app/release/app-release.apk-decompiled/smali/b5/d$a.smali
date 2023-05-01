.class public final Lb5/d$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lb5/d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# instance fields
.field public final a:Ljava/util/ArrayList;

.field public final b:Lf5/t;

.field public final c:I

.field public d:I

.field public e:[Lb5/c;

.field public f:I

.field public g:I

.field public h:I


# direct methods
.method public constructor <init>(Lb5/q$a;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/util/ArrayList;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lb5/d$a;->a:Ljava/util/ArrayList;

    .line 10
    .line 11
    const/16 v0, 0x8

    .line 12
    .line 13
    new-array v0, v0, [Lb5/c;

    .line 14
    .line 15
    iput-object v0, p0, Lb5/d$a;->e:[Lb5/c;

    .line 16
    .line 17
    const/4 v0, 0x7

    .line 18
    iput v0, p0, Lb5/d$a;->f:I

    .line 19
    .line 20
    const/4 v0, 0x0

    .line 21
    iput v0, p0, Lb5/d$a;->g:I

    .line 22
    .line 23
    iput v0, p0, Lb5/d$a;->h:I

    .line 24
    .line 25
    const/16 v0, 0x1000

    .line 26
    .line 27
    iput v0, p0, Lb5/d$a;->c:I

    .line 28
    .line 29
    iput v0, p0, Lb5/d$a;->d:I

    .line 30
    .line 31
    sget-object v0, Lf5/q;->a:Ljava/util/logging/Logger;

    .line 32
    .line 33
    new-instance v0, Lf5/t;

    .line 34
    .line 35
    invoke-direct {v0, p1}, Lf5/t;-><init>(Lf5/y;)V

    .line 36
    .line 37
    .line 38
    iput-object v0, p0, Lb5/d$a;->b:Lf5/t;

    .line 39
    .line 40
    return-void
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


# virtual methods
.method public final a(I)I
    .locals 4

    const/4 v0, 0x0

    if-lez p1, :cond_1

    iget-object v1, p0, Lb5/d$a;->e:[Lb5/c;

    array-length v1, v1

    add-int/lit8 v1, v1, -0x1

    :goto_0
    iget v2, p0, Lb5/d$a;->f:I

    if-lt v1, v2, :cond_0

    if-lez p1, :cond_0

    iget-object v2, p0, Lb5/d$a;->e:[Lb5/c;

    aget-object v2, v2, v1

    iget v2, v2, Lb5/c;->c:I

    sub-int/2addr p1, v2

    iget v3, p0, Lb5/d$a;->h:I

    sub-int/2addr v3, v2

    iput v3, p0, Lb5/d$a;->h:I

    iget v2, p0, Lb5/d$a;->g:I

    add-int/lit8 v2, v2, -0x1

    iput v2, p0, Lb5/d$a;->g:I

    add-int/lit8 v0, v0, 0x1

    add-int/lit8 v1, v1, -0x1

    goto :goto_0

    :cond_0
    iget-object p1, p0, Lb5/d$a;->e:[Lb5/c;

    add-int/lit8 v1, v2, 0x1

    add-int/lit8 v2, v2, 0x1

    add-int/2addr v2, v0

    iget v3, p0, Lb5/d$a;->g:I

    invoke-static {p1, v1, p1, v2, v3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    iget p1, p0, Lb5/d$a;->f:I

    add-int/2addr p1, v0

    iput p1, p0, Lb5/d$a;->f:I

    :cond_1
    return v0
.end method

.method public final b(I)Lf5/h;
    .locals 4

    .line 1
    const/4 v0, 0x1

    .line 2
    if-ltz p1, :cond_0

    .line 3
    .line 4
    sget-object v1, Lb5/d;->a:[Lb5/c;

    .line 5
    .line 6
    array-length v1, v1

    .line 7
    sub-int/2addr v1, v0

    .line 8
    if-gt p1, v1, :cond_0

    .line 9
    .line 10
    move v1, v0

    .line 11
    goto :goto_0

    .line 12
    :cond_0
    const/4 v1, 0x0

    .line 13
    :goto_0
    if-eqz v1, :cond_1

    .line 14
    .line 15
    sget-object v0, Lb5/d;->a:[Lb5/c;

    .line 16
    .line 17
    aget-object p1, v0, p1

    .line 18
    .line 19
    goto :goto_1

    .line 20
    :cond_1
    sget-object v1, Lb5/d;->a:[Lb5/c;

    .line 21
    .line 22
    array-length v1, v1

    .line 23
    sub-int v1, p1, v1

    .line 24
    .line 25
    iget v2, p0, Lb5/d$a;->f:I

    .line 26
    .line 27
    add-int/2addr v2, v0

    .line 28
    add-int/2addr v2, v1

    .line 29
    if-ltz v2, :cond_2

    .line 30
    .line 31
    iget-object v1, p0, Lb5/d$a;->e:[Lb5/c;

    .line 32
    .line 33
    array-length v3, v1

    .line 34
    if-ge v2, v3, :cond_2

    .line 35
    .line 36
    aget-object p1, v1, v2

    .line 37
    .line 38
    :goto_1
    iget-object p1, p1, Lb5/c;->a:Lf5/h;

    .line 39
    .line 40
    return-object p1

    .line 41
    :cond_2
    new-instance v1, Ljava/io/IOException;

    .line 42
    .line 43
    new-instance v2, Ljava/lang/StringBuilder;

    .line 44
    .line 45
    const-string v3, "Header index too large "

    .line 46
    .line 47
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 48
    .line 49
    .line 50
    add-int/2addr p1, v0

    .line 51
    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 52
    .line 53
    .line 54
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 55
    .line 56
    .line 57
    move-result-object p1

    .line 58
    invoke-direct {v1, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 59
    .line 60
    .line 61
    throw v1
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

.method public final c(Lb5/c;)V
    .locals 6

    .line 1
    iget-object v0, p0, Lb5/d$a;->a:Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    iget v0, p0, Lb5/d$a;->d:I

    .line 7
    .line 8
    const/4 v1, 0x0

    .line 9
    iget v2, p1, Lb5/c;->c:I

    .line 10
    .line 11
    if-le v2, v0, :cond_0

    .line 12
    .line 13
    iget-object p1, p0, Lb5/d$a;->e:[Lb5/c;

    .line 14
    .line 15
    const/4 v0, 0x0

    .line 16
    invoke-static {p1, v0}, Ljava/util/Arrays;->fill([Ljava/lang/Object;Ljava/lang/Object;)V

    .line 17
    .line 18
    .line 19
    iget-object p1, p0, Lb5/d$a;->e:[Lb5/c;

    .line 20
    .line 21
    array-length p1, p1

    .line 22
    add-int/lit8 p1, p1, -0x1

    .line 23
    .line 24
    iput p1, p0, Lb5/d$a;->f:I

    .line 25
    .line 26
    iput v1, p0, Lb5/d$a;->g:I

    .line 27
    .line 28
    iput v1, p0, Lb5/d$a;->h:I

    .line 29
    .line 30
    return-void

    .line 31
    :cond_0
    iget v3, p0, Lb5/d$a;->h:I

    .line 32
    .line 33
    add-int/2addr v3, v2

    .line 34
    sub-int/2addr v3, v0

    .line 35
    invoke-virtual {p0, v3}, Lb5/d$a;->a(I)I

    .line 36
    .line 37
    .line 38
    iget v0, p0, Lb5/d$a;->g:I

    .line 39
    .line 40
    add-int/lit8 v0, v0, 0x1

    .line 41
    .line 42
    iget-object v3, p0, Lb5/d$a;->e:[Lb5/c;

    .line 43
    .line 44
    array-length v4, v3

    .line 45
    if-le v0, v4, :cond_1

    .line 46
    .line 47
    array-length v0, v3

    .line 48
    mul-int/lit8 v0, v0, 0x2

    .line 49
    .line 50
    new-array v0, v0, [Lb5/c;

    .line 51
    .line 52
    array-length v4, v3

    .line 53
    array-length v5, v3

    .line 54
    invoke-static {v3, v1, v0, v4, v5}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 55
    .line 56
    .line 57
    iget-object v1, p0, Lb5/d$a;->e:[Lb5/c;

    .line 58
    .line 59
    array-length v1, v1

    .line 60
    add-int/lit8 v1, v1, -0x1

    .line 61
    .line 62
    iput v1, p0, Lb5/d$a;->f:I

    .line 63
    .line 64
    iput-object v0, p0, Lb5/d$a;->e:[Lb5/c;

    .line 65
    .line 66
    :cond_1
    iget v0, p0, Lb5/d$a;->f:I

    .line 67
    .line 68
    add-int/lit8 v1, v0, -0x1

    .line 69
    .line 70
    iput v1, p0, Lb5/d$a;->f:I

    .line 71
    .line 72
    iget-object v1, p0, Lb5/d$a;->e:[Lb5/c;

    .line 73
    .line 74
    aput-object p1, v1, v0

    .line 75
    .line 76
    iget p1, p0, Lb5/d$a;->g:I

    .line 77
    .line 78
    add-int/lit8 p1, p1, 0x1

    .line 79
    .line 80
    iput p1, p0, Lb5/d$a;->g:I

    .line 81
    .line 82
    iget p1, p0, Lb5/d$a;->h:I

    .line 83
    .line 84
    add-int/2addr p1, v2

    .line 85
    iput p1, p0, Lb5/d$a;->h:I

    .line 86
    .line 87
    return-void
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

.method public final d()Lf5/h;
    .locals 9

    .line 1
    iget-object v0, p0, Lb5/d$a;->b:Lf5/t;

    .line 2
    .line 3
    invoke-virtual {v0}, Lf5/t;->readByte()B

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    and-int/lit16 v1, v1, 0xff

    .line 8
    .line 9
    and-int/lit16 v2, v1, 0x80

    .line 10
    .line 11
    const/16 v3, 0x80

    .line 12
    .line 13
    const/4 v4, 0x0

    .line 14
    if-ne v2, v3, :cond_0

    .line 15
    .line 16
    const/4 v2, 0x1

    .line 17
    goto :goto_0

    .line 18
    :cond_0
    move v2, v4

    .line 19
    :goto_0
    const/16 v3, 0x7f

    .line 20
    .line 21
    invoke-virtual {p0, v1, v3}, Lb5/d$a;->e(II)I

    .line 22
    .line 23
    .line 24
    move-result v1

    .line 25
    if-eqz v2, :cond_6

    .line 26
    .line 27
    sget-object v2, Lb5/t;->d:Lb5/t;

    .line 28
    .line 29
    int-to-long v5, v1

    .line 30
    invoke-virtual {v0, v5, v6}, Lf5/t;->y(J)V

    .line 31
    .line 32
    .line 33
    iget-object v0, v0, Lf5/t;->b:Lf5/e;

    .line 34
    .line 35
    invoke-virtual {v0, v5, v6}, Lf5/e;->q(J)[B

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 40
    .line 41
    .line 42
    new-instance v1, Ljava/io/ByteArrayOutputStream;

    .line 43
    .line 44
    invoke-direct {v1}, Ljava/io/ByteArrayOutputStream;-><init>()V

    .line 45
    .line 46
    .line 47
    iget-object v2, v2, Lb5/t;->a:Lb5/t$a;

    .line 48
    .line 49
    move-object v6, v2

    .line 50
    move v3, v4

    .line 51
    move v5, v3

    .line 52
    :goto_1
    array-length v7, v0

    .line 53
    if-ge v4, v7, :cond_3

    .line 54
    .line 55
    aget-byte v7, v0, v4

    .line 56
    .line 57
    and-int/lit16 v7, v7, 0xff

    .line 58
    .line 59
    shl-int/lit8 v3, v3, 0x8

    .line 60
    .line 61
    or-int/2addr v3, v7

    .line 62
    add-int/lit8 v5, v5, 0x8

    .line 63
    .line 64
    :goto_2
    const/16 v7, 0x8

    .line 65
    .line 66
    if-lt v5, v7, :cond_2

    .line 67
    .line 68
    add-int/lit8 v7, v5, -0x8

    .line 69
    .line 70
    ushr-int v8, v3, v7

    .line 71
    .line 72
    and-int/lit16 v8, v8, 0xff

    .line 73
    .line 74
    iget-object v6, v6, Lb5/t$a;->a:[Lb5/t$a;

    .line 75
    .line 76
    aget-object v6, v6, v8

    .line 77
    .line 78
    iget-object v8, v6, Lb5/t$a;->a:[Lb5/t$a;

    .line 79
    .line 80
    if-nez v8, :cond_1

    .line 81
    .line 82
    iget v7, v6, Lb5/t$a;->b:I

    .line 83
    .line 84
    invoke-virtual {v1, v7}, Ljava/io/ByteArrayOutputStream;->write(I)V

    .line 85
    .line 86
    .line 87
    iget v6, v6, Lb5/t$a;->c:I

    .line 88
    .line 89
    sub-int/2addr v5, v6

    .line 90
    move-object v6, v2

    .line 91
    goto :goto_2

    .line 92
    :cond_1
    move v5, v7

    .line 93
    goto :goto_2

    .line 94
    :cond_2
    add-int/lit8 v4, v4, 0x1

    .line 95
    .line 96
    goto :goto_1

    .line 97
    :cond_3
    :goto_3
    if-lez v5, :cond_5

    .line 98
    .line 99
    rsub-int/lit8 v0, v5, 0x8

    .line 100
    .line 101
    shl-int v0, v3, v0

    .line 102
    .line 103
    and-int/lit16 v0, v0, 0xff

    .line 104
    .line 105
    iget-object v4, v6, Lb5/t$a;->a:[Lb5/t$a;

    .line 106
    .line 107
    aget-object v0, v4, v0

    .line 108
    .line 109
    iget-object v4, v0, Lb5/t$a;->a:[Lb5/t$a;

    .line 110
    .line 111
    if-nez v4, :cond_5

    .line 112
    .line 113
    iget v4, v0, Lb5/t$a;->c:I

    .line 114
    .line 115
    if-le v4, v5, :cond_4

    .line 116
    .line 117
    goto :goto_4

    .line 118
    :cond_4
    iget v0, v0, Lb5/t$a;->b:I

    .line 119
    .line 120
    invoke-virtual {v1, v0}, Ljava/io/ByteArrayOutputStream;->write(I)V

    .line 121
    .line 122
    .line 123
    sub-int/2addr v5, v4

    .line 124
    move-object v6, v2

    .line 125
    goto :goto_3

    .line 126
    :cond_5
    :goto_4
    invoke-virtual {v1}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    .line 127
    .line 128
    .line 129
    move-result-object v0

    .line 130
    invoke-static {v0}, Lf5/h;->g([B)Lf5/h;

    .line 131
    .line 132
    .line 133
    move-result-object v0

    .line 134
    return-object v0

    .line 135
    :cond_6
    int-to-long v1, v1

    .line 136
    invoke-virtual {v0, v1, v2}, Lf5/t;->e(J)Lf5/h;

    .line 137
    .line 138
    .line 139
    move-result-object v0

    .line 140
    return-object v0
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

.method public final e(II)I
    .locals 2

    and-int/2addr p1, p2

    if-ge p1, p2, :cond_0

    return p1

    :cond_0
    const/4 p1, 0x0

    :goto_0
    iget-object v0, p0, Lb5/d$a;->b:Lf5/t;

    invoke-virtual {v0}, Lf5/t;->readByte()B

    move-result v0

    and-int/lit16 v0, v0, 0xff

    and-int/lit16 v1, v0, 0x80

    if-eqz v1, :cond_1

    and-int/lit8 v0, v0, 0x7f

    shl-int/2addr v0, p1

    add-int/2addr p2, v0

    add-int/lit8 p1, p1, 0x7

    goto :goto_0

    :cond_1
    shl-int p1, v0, p1

    add-int/2addr p2, p1

    return p2
.end method
