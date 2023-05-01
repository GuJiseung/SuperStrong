.class public final Lf5/m;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lf5/y;


# instance fields
.field public final b:Lf5/g;

.field public final c:Ljava/util/zip/Inflater;

.field public d:I

.field public e:Z


# direct methods
.method public constructor <init>(Lf5/t;Ljava/util/zip/Inflater;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lf5/m;->b:Lf5/g;

    iput-object p2, p0, Lf5/m;->c:Ljava/util/zip/Inflater;

    return-void
.end method


# virtual methods
.method public final B(Lf5/e;J)J
    .locals 6

    .line 1
    iget-boolean p2, p0, Lf5/m;->e:Z

    .line 2
    .line 3
    if-nez p2, :cond_a

    .line 4
    .line 5
    :goto_0
    iget-object p2, p0, Lf5/m;->c:Ljava/util/zip/Inflater;

    .line 6
    .line 7
    invoke-virtual {p2}, Ljava/util/zip/Inflater;->needsInput()Z

    .line 8
    .line 9
    .line 10
    move-result p3

    .line 11
    iget-object v0, p0, Lf5/m;->b:Lf5/g;

    .line 12
    .line 13
    const/4 v1, 0x1

    .line 14
    if-nez p3, :cond_0

    .line 15
    .line 16
    goto :goto_2

    .line 17
    :cond_0
    iget p3, p0, Lf5/m;->d:I

    .line 18
    .line 19
    if-nez p3, :cond_1

    .line 20
    .line 21
    goto :goto_1

    .line 22
    :cond_1
    invoke-virtual {p2}, Ljava/util/zip/Inflater;->getRemaining()I

    .line 23
    .line 24
    .line 25
    move-result v2

    .line 26
    sub-int/2addr p3, v2

    .line 27
    iget v2, p0, Lf5/m;->d:I

    .line 28
    .line 29
    sub-int/2addr v2, p3

    .line 30
    iput v2, p0, Lf5/m;->d:I

    .line 31
    .line 32
    int-to-long v2, p3

    .line 33
    invoke-interface {v0, v2, v3}, Lf5/g;->skip(J)V

    .line 34
    .line 35
    .line 36
    :goto_1
    invoke-virtual {p2}, Ljava/util/zip/Inflater;->getRemaining()I

    .line 37
    .line 38
    .line 39
    move-result p3

    .line 40
    if-nez p3, :cond_9

    .line 41
    .line 42
    invoke-interface {v0}, Lf5/g;->m()Z

    .line 43
    .line 44
    .line 45
    move-result p3

    .line 46
    if-eqz p3, :cond_2

    .line 47
    .line 48
    move p3, v1

    .line 49
    goto :goto_3

    .line 50
    :cond_2
    invoke-interface {v0}, Lf5/g;->a()Lf5/e;

    .line 51
    .line 52
    .line 53
    move-result-object p3

    .line 54
    iget-object p3, p3, Lf5/e;->b:Lf5/u;

    .line 55
    .line 56
    iget v2, p3, Lf5/u;->c:I

    .line 57
    .line 58
    iget v3, p3, Lf5/u;->b:I

    .line 59
    .line 60
    sub-int/2addr v2, v3

    .line 61
    iput v2, p0, Lf5/m;->d:I

    .line 62
    .line 63
    iget-object p3, p3, Lf5/u;->a:[B

    .line 64
    .line 65
    invoke-virtual {p2, p3, v3, v2}, Ljava/util/zip/Inflater;->setInput([BII)V

    .line 66
    .line 67
    .line 68
    :goto_2
    const/4 p3, 0x0

    .line 69
    :goto_3
    :try_start_0
    invoke-virtual {p1, v1}, Lf5/e;->E(I)Lf5/u;

    .line 70
    .line 71
    .line 72
    move-result-object v1

    .line 73
    iget v2, v1, Lf5/u;->c:I

    .line 74
    .line 75
    rsub-int v2, v2, 0x2000

    .line 76
    .line 77
    int-to-long v2, v2

    .line 78
    const-wide/16 v4, 0x2000

    .line 79
    .line 80
    invoke-static {v4, v5, v2, v3}, Ljava/lang/Math;->min(JJ)J

    .line 81
    .line 82
    .line 83
    move-result-wide v2

    .line 84
    long-to-int v2, v2

    .line 85
    iget-object v3, v1, Lf5/u;->a:[B

    .line 86
    .line 87
    iget v4, v1, Lf5/u;->c:I

    .line 88
    .line 89
    invoke-virtual {p2, v3, v4, v2}, Ljava/util/zip/Inflater;->inflate([BII)I

    .line 90
    .line 91
    .line 92
    move-result v2

    .line 93
    if-lez v2, :cond_3

    .line 94
    .line 95
    iget p2, v1, Lf5/u;->c:I

    .line 96
    .line 97
    add-int/2addr p2, v2

    .line 98
    iput p2, v1, Lf5/u;->c:I

    .line 99
    .line 100
    iget-wide p2, p1, Lf5/e;->c:J

    .line 101
    .line 102
    int-to-long v0, v2

    .line 103
    add-long/2addr p2, v0

    .line 104
    iput-wide p2, p1, Lf5/e;->c:J

    .line 105
    .line 106
    return-wide v0

    .line 107
    :cond_3
    invoke-virtual {p2}, Ljava/util/zip/Inflater;->finished()Z

    .line 108
    .line 109
    .line 110
    move-result v2

    .line 111
    if-nez v2, :cond_6

    .line 112
    .line 113
    invoke-virtual {p2}, Ljava/util/zip/Inflater;->needsDictionary()Z

    .line 114
    .line 115
    .line 116
    move-result v2

    .line 117
    if-eqz v2, :cond_4

    .line 118
    .line 119
    goto :goto_4

    .line 120
    :cond_4
    if-nez p3, :cond_5

    .line 121
    .line 122
    goto :goto_0

    .line 123
    :cond_5
    new-instance p1, Ljava/io/EOFException;

    .line 124
    .line 125
    const-string p2, "source exhausted prematurely"

    .line 126
    .line 127
    invoke-direct {p1, p2}, Ljava/io/EOFException;-><init>(Ljava/lang/String;)V

    .line 128
    .line 129
    .line 130
    throw p1

    .line 131
    :cond_6
    :goto_4
    iget p3, p0, Lf5/m;->d:I

    .line 132
    .line 133
    if-nez p3, :cond_7

    .line 134
    .line 135
    goto :goto_5

    .line 136
    :cond_7
    invoke-virtual {p2}, Ljava/util/zip/Inflater;->getRemaining()I

    .line 137
    .line 138
    .line 139
    move-result p2

    .line 140
    sub-int/2addr p3, p2

    .line 141
    iget p2, p0, Lf5/m;->d:I

    .line 142
    .line 143
    sub-int/2addr p2, p3

    .line 144
    iput p2, p0, Lf5/m;->d:I

    .line 145
    .line 146
    int-to-long p2, p3

    .line 147
    invoke-interface {v0, p2, p3}, Lf5/g;->skip(J)V

    .line 148
    .line 149
    .line 150
    :goto_5
    iget p2, v1, Lf5/u;->b:I

    .line 151
    .line 152
    iget p3, v1, Lf5/u;->c:I

    .line 153
    .line 154
    if-ne p2, p3, :cond_8

    .line 155
    .line 156
    invoke-virtual {v1}, Lf5/u;->a()Lf5/u;

    .line 157
    .line 158
    .line 159
    move-result-object p2

    .line 160
    iput-object p2, p1, Lf5/e;->b:Lf5/u;

    .line 161
    .line 162
    invoke-static {v1}, Lf5/v;->a(Lf5/u;)V
    :try_end_0
    .catch Ljava/util/zip/DataFormatException; {:try_start_0 .. :try_end_0} :catch_0

    .line 163
    .line 164
    .line 165
    :cond_8
    const-wide/16 p1, -0x1

    .line 166
    .line 167
    return-wide p1

    .line 168
    :catch_0
    move-exception p1

    .line 169
    new-instance p2, Ljava/io/IOException;

    .line 170
    .line 171
    invoke-direct {p2, p1}, Ljava/io/IOException;-><init>(Ljava/lang/Throwable;)V

    .line 172
    .line 173
    .line 174
    throw p2

    .line 175
    :cond_9
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 176
    .line 177
    const-string p2, "?"

    .line 178
    .line 179
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 180
    .line 181
    .line 182
    throw p1

    .line 183
    :cond_a
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 184
    .line 185
    const-string p2, "closed"

    .line 186
    .line 187
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 188
    .line 189
    .line 190
    throw p1
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

.method public final b()Lf5/z;
    .locals 1

    iget-object v0, p0, Lf5/m;->b:Lf5/g;

    invoke-interface {v0}, Lf5/y;->b()Lf5/z;

    move-result-object v0

    return-object v0
.end method

.method public final close()V
    .locals 1

    iget-boolean v0, p0, Lf5/m;->e:Z

    if-eqz v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Lf5/m;->c:Ljava/util/zip/Inflater;

    invoke-virtual {v0}, Ljava/util/zip/Inflater;->end()V

    const/4 v0, 0x1

    iput-boolean v0, p0, Lf5/m;->e:Z

    iget-object v0, p0, Lf5/m;->b:Lf5/g;

    invoke-interface {v0}, Lf5/y;->close()V

    return-void
.end method
