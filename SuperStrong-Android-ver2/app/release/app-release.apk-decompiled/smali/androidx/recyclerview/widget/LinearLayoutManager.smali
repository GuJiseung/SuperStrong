.class public Landroidx/recyclerview/widget/LinearLayoutManager;
.super Landroidx/recyclerview/widget/RecyclerView$l;
.source "SourceFile"

# interfaces
.implements Landroidx/recyclerview/widget/RecyclerView$w$b;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/recyclerview/widget/LinearLayoutManager$b;,
        Landroidx/recyclerview/widget/LinearLayoutManager$a;,
        Landroidx/recyclerview/widget/LinearLayoutManager$d;,
        Landroidx/recyclerview/widget/LinearLayoutManager$c;
    }
.end annotation


# instance fields
.field public final A:Landroidx/recyclerview/widget/LinearLayoutManager$a;

.field public final B:Landroidx/recyclerview/widget/LinearLayoutManager$b;

.field public final C:I

.field public final D:[I

.field public p:I

.field public q:Landroidx/recyclerview/widget/LinearLayoutManager$c;

.field public r:Landroidx/recyclerview/widget/s;

.field public s:Z

.field public t:Z

.field public u:Z

.field public v:Z

.field public final w:Z

.field public x:I

.field public y:I

.field public z:Landroidx/recyclerview/widget/LinearLayoutManager$d;


# direct methods
.method public constructor <init>(I)V
    .locals 3

    invoke-direct {p0}, Landroidx/recyclerview/widget/RecyclerView$l;-><init>()V

    const/4 v0, 0x1

    iput v0, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->p:I

    const/4 v1, 0x0

    iput-boolean v1, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->t:Z

    iput-boolean v1, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->u:Z

    iput-boolean v1, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->v:Z

    iput-boolean v0, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->w:Z

    const/4 v0, -0x1

    iput v0, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->x:I

    const/high16 v0, -0x80000000

    iput v0, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->y:I

    const/4 v0, 0x0

    iput-object v0, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->z:Landroidx/recyclerview/widget/LinearLayoutManager$d;

    new-instance v2, Landroidx/recyclerview/widget/LinearLayoutManager$a;

    invoke-direct {v2}, Landroidx/recyclerview/widget/LinearLayoutManager$a;-><init>()V

    iput-object v2, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->A:Landroidx/recyclerview/widget/LinearLayoutManager$a;

    new-instance v2, Landroidx/recyclerview/widget/LinearLayoutManager$b;

    invoke-direct {v2}, Landroidx/recyclerview/widget/LinearLayoutManager$b;-><init>()V

    iput-object v2, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->B:Landroidx/recyclerview/widget/LinearLayoutManager$b;

    const/4 v2, 0x2

    iput v2, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->C:I

    new-array v2, v2, [I

    iput-object v2, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->D:[I

    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/LinearLayoutManager;->c1(I)V

    .line 1
    invoke-virtual {p0, v0}, Landroidx/recyclerview/widget/LinearLayoutManager;->c(Ljava/lang/String;)V

    iget-boolean p1, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->t:Z

    if-nez p1, :cond_0

    goto :goto_0

    :cond_0
    iput-boolean v1, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->t:Z

    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$l;->n0()V

    :goto_0
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V
    .locals 2

    invoke-direct {p0}, Landroidx/recyclerview/widget/RecyclerView$l;-><init>()V

    const/4 v0, 0x1

    iput v0, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->p:I

    const/4 v1, 0x0

    iput-boolean v1, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->t:Z

    iput-boolean v1, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->u:Z

    iput-boolean v1, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->v:Z

    iput-boolean v0, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->w:Z

    const/4 v0, -0x1

    iput v0, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->x:I

    const/high16 v0, -0x80000000

    iput v0, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->y:I

    const/4 v0, 0x0

    iput-object v0, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->z:Landroidx/recyclerview/widget/LinearLayoutManager$d;

    new-instance v1, Landroidx/recyclerview/widget/LinearLayoutManager$a;

    invoke-direct {v1}, Landroidx/recyclerview/widget/LinearLayoutManager$a;-><init>()V

    iput-object v1, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->A:Landroidx/recyclerview/widget/LinearLayoutManager$a;

    new-instance v1, Landroidx/recyclerview/widget/LinearLayoutManager$b;

    invoke-direct {v1}, Landroidx/recyclerview/widget/LinearLayoutManager$b;-><init>()V

    iput-object v1, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->B:Landroidx/recyclerview/widget/LinearLayoutManager$b;

    const/4 v1, 0x2

    iput v1, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->C:I

    new-array v1, v1, [I

    iput-object v1, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->D:[I

    invoke-static {p1, p2, p3, p4}, Landroidx/recyclerview/widget/RecyclerView$l;->H(Landroid/content/Context;Landroid/util/AttributeSet;II)Landroidx/recyclerview/widget/RecyclerView$l$d;

    move-result-object p1

    iget p2, p1, Landroidx/recyclerview/widget/RecyclerView$l$d;->a:I

    invoke-virtual {p0, p2}, Landroidx/recyclerview/widget/LinearLayoutManager;->c1(I)V

    iget-boolean p2, p1, Landroidx/recyclerview/widget/RecyclerView$l$d;->c:Z

    .line 2
    invoke-virtual {p0, v0}, Landroidx/recyclerview/widget/LinearLayoutManager;->c(Ljava/lang/String;)V

    iget-boolean p3, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->t:Z

    if-ne p2, p3, :cond_0

    goto :goto_0

    :cond_0
    iput-boolean p2, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->t:Z

    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$l;->n0()V

    .line 3
    :goto_0
    iget-boolean p1, p1, Landroidx/recyclerview/widget/RecyclerView$l$d;->d:Z

    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/LinearLayoutManager;->d1(Z)V

    return-void
.end method


# virtual methods
.method public B0()Z
    .locals 2

    iget-object v0, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->z:Landroidx/recyclerview/widget/LinearLayoutManager$d;

    if-nez v0, :cond_0

    iget-boolean v0, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->s:Z

    iget-boolean v1, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->v:Z

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public C0(Landroidx/recyclerview/widget/RecyclerView$x;[I)V
    .locals 4

    .line 1
    iget p1, p1, Landroidx/recyclerview/widget/RecyclerView$x;->a:I

    .line 2
    .line 3
    const/4 v0, 0x1

    .line 4
    const/4 v1, -0x1

    .line 5
    const/4 v2, 0x0

    .line 6
    if-eq p1, v1, :cond_0

    .line 7
    .line 8
    move p1, v0

    .line 9
    goto :goto_0

    .line 10
    :cond_0
    move p1, v2

    .line 11
    :goto_0
    if-eqz p1, :cond_1

    .line 12
    .line 13
    iget-object p1, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->r:Landroidx/recyclerview/widget/s;

    .line 14
    .line 15
    invoke-virtual {p1}, Landroidx/recyclerview/widget/s;->l()I

    .line 16
    .line 17
    .line 18
    move-result p1

    .line 19
    goto :goto_1

    .line 20
    :cond_1
    move p1, v2

    .line 21
    :goto_1
    iget-object v3, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->q:Landroidx/recyclerview/widget/LinearLayoutManager$c;

    .line 22
    .line 23
    iget v3, v3, Landroidx/recyclerview/widget/LinearLayoutManager$c;->f:I

    .line 24
    .line 25
    if-ne v3, v1, :cond_2

    .line 26
    .line 27
    move v1, v2

    .line 28
    goto :goto_2

    .line 29
    :cond_2
    move v1, p1

    .line 30
    move p1, v2

    .line 31
    :goto_2
    aput p1, p2, v2

    .line 32
    .line 33
    aput v1, p2, v0

    .line 34
    .line 35
    return-void
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

.method public D0(Landroidx/recyclerview/widget/RecyclerView$x;Landroidx/recyclerview/widget/LinearLayoutManager$c;Landroidx/recyclerview/widget/RecyclerView$l$c;)V
    .locals 1

    iget v0, p2, Landroidx/recyclerview/widget/LinearLayoutManager$c;->d:I

    if-ltz v0, :cond_0

    invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView$x;->b()I

    move-result p1

    if-ge v0, p1, :cond_0

    const/4 p1, 0x0

    iget p2, p2, Landroidx/recyclerview/widget/LinearLayoutManager$c;->g:I

    invoke-static {p1, p2}, Ljava/lang/Math;->max(II)I

    move-result p1

    check-cast p3, Landroidx/recyclerview/widget/m$b;

    invoke-virtual {p3, v0, p1}, Landroidx/recyclerview/widget/m$b;->a(II)V

    :cond_0
    return-void
.end method

.method public final E0(Landroidx/recyclerview/widget/RecyclerView$x;)I
    .locals 6

    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$l;->w()I

    move-result v0

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    invoke-virtual {p0}, Landroidx/recyclerview/widget/LinearLayoutManager;->I0()V

    iget-object v1, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->r:Landroidx/recyclerview/widget/s;

    iget-boolean v0, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->w:Z

    xor-int/lit8 v0, v0, 0x1

    invoke-virtual {p0, v0}, Landroidx/recyclerview/widget/LinearLayoutManager;->L0(Z)Landroid/view/View;

    move-result-object v2

    invoke-virtual {p0, v0}, Landroidx/recyclerview/widget/LinearLayoutManager;->K0(Z)Landroid/view/View;

    move-result-object v3

    iget-boolean v5, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->w:Z

    move-object v0, p1

    move-object v4, p0

    invoke-static/range {v0 .. v5}, Landroidx/recyclerview/widget/y;->a(Landroidx/recyclerview/widget/RecyclerView$x;Landroidx/recyclerview/widget/s;Landroid/view/View;Landroid/view/View;Landroidx/recyclerview/widget/RecyclerView$l;Z)I

    move-result p1

    return p1
.end method

.method public final F0(Landroidx/recyclerview/widget/RecyclerView$x;)I
    .locals 7

    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$l;->w()I

    move-result v0

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    invoke-virtual {p0}, Landroidx/recyclerview/widget/LinearLayoutManager;->I0()V

    iget-object v1, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->r:Landroidx/recyclerview/widget/s;

    iget-boolean v0, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->w:Z

    xor-int/lit8 v0, v0, 0x1

    invoke-virtual {p0, v0}, Landroidx/recyclerview/widget/LinearLayoutManager;->L0(Z)Landroid/view/View;

    move-result-object v2

    invoke-virtual {p0, v0}, Landroidx/recyclerview/widget/LinearLayoutManager;->K0(Z)Landroid/view/View;

    move-result-object v3

    iget-boolean v5, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->w:Z

    iget-boolean v6, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->u:Z

    move-object v0, p1

    move-object v4, p0

    invoke-static/range {v0 .. v6}, Landroidx/recyclerview/widget/y;->b(Landroidx/recyclerview/widget/RecyclerView$x;Landroidx/recyclerview/widget/s;Landroid/view/View;Landroid/view/View;Landroidx/recyclerview/widget/RecyclerView$l;ZZ)I

    move-result p1

    return p1
.end method

.method public final G0(Landroidx/recyclerview/widget/RecyclerView$x;)I
    .locals 6

    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$l;->w()I

    move-result v0

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    invoke-virtual {p0}, Landroidx/recyclerview/widget/LinearLayoutManager;->I0()V

    iget-object v1, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->r:Landroidx/recyclerview/widget/s;

    iget-boolean v0, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->w:Z

    xor-int/lit8 v0, v0, 0x1

    invoke-virtual {p0, v0}, Landroidx/recyclerview/widget/LinearLayoutManager;->L0(Z)Landroid/view/View;

    move-result-object v2

    invoke-virtual {p0, v0}, Landroidx/recyclerview/widget/LinearLayoutManager;->K0(Z)Landroid/view/View;

    move-result-object v3

    iget-boolean v5, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->w:Z

    move-object v0, p1

    move-object v4, p0

    invoke-static/range {v0 .. v5}, Landroidx/recyclerview/widget/y;->c(Landroidx/recyclerview/widget/RecyclerView$x;Landroidx/recyclerview/widget/s;Landroid/view/View;Landroid/view/View;Landroidx/recyclerview/widget/RecyclerView$l;Z)I

    move-result p1

    return p1
.end method

.method public final H0(I)I
    .locals 4

    const/4 v0, -0x1

    const/4 v1, 0x1

    if-eq p1, v1, :cond_b

    const/4 v2, 0x2

    if-eq p1, v2, :cond_8

    const/16 v2, 0x11

    const/high16 v3, -0x80000000

    if-eq p1, v2, :cond_6

    const/16 v2, 0x21

    if-eq p1, v2, :cond_4

    const/16 v0, 0x42

    if-eq p1, v0, :cond_2

    const/16 v0, 0x82

    if-eq p1, v0, :cond_0

    return v3

    :cond_0
    iget p1, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->p:I

    if-ne p1, v1, :cond_1

    goto :goto_0

    :cond_1
    move v1, v3

    :goto_0
    return v1

    :cond_2
    iget p1, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->p:I

    if-nez p1, :cond_3

    goto :goto_1

    :cond_3
    move v1, v3

    :goto_1
    return v1

    :cond_4
    iget p1, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->p:I

    if-ne p1, v1, :cond_5

    goto :goto_2

    :cond_5
    move v0, v3

    :goto_2
    return v0

    :cond_6
    iget p1, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->p:I

    if-nez p1, :cond_7

    goto :goto_3

    :cond_7
    move v0, v3

    :goto_3
    return v0

    :cond_8
    iget p1, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->p:I

    if-ne p1, v1, :cond_9

    return v1

    :cond_9
    invoke-virtual {p0}, Landroidx/recyclerview/widget/LinearLayoutManager;->V0()Z

    move-result p1

    if-eqz p1, :cond_a

    return v0

    :cond_a
    return v1

    :cond_b
    iget p1, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->p:I

    if-ne p1, v1, :cond_c

    return v0

    :cond_c
    invoke-virtual {p0}, Landroidx/recyclerview/widget/LinearLayoutManager;->V0()Z

    move-result p1

    if-eqz p1, :cond_d

    return v1

    :cond_d
    return v0
.end method

.method public final I0()V
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->q:Landroidx/recyclerview/widget/LinearLayoutManager$c;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Landroidx/recyclerview/widget/LinearLayoutManager$c;

    .line 6
    .line 7
    invoke-direct {v0}, Landroidx/recyclerview/widget/LinearLayoutManager$c;-><init>()V

    .line 8
    .line 9
    .line 10
    iput-object v0, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->q:Landroidx/recyclerview/widget/LinearLayoutManager$c;

    .line 11
    .line 12
    :cond_0
    return-void
    .line 13
    .line 14
    .line 15
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

.method public final J0(Landroidx/recyclerview/widget/RecyclerView$s;Landroidx/recyclerview/widget/LinearLayoutManager$c;Landroidx/recyclerview/widget/RecyclerView$x;Z)I
    .locals 7

    .line 1
    iget v0, p2, Landroidx/recyclerview/widget/LinearLayoutManager$c;->c:I

    .line 2
    .line 3
    iget v1, p2, Landroidx/recyclerview/widget/LinearLayoutManager$c;->g:I

    .line 4
    .line 5
    const/high16 v2, -0x80000000

    .line 6
    .line 7
    if-eq v1, v2, :cond_1

    .line 8
    .line 9
    if-gez v0, :cond_0

    .line 10
    .line 11
    add-int/2addr v1, v0

    .line 12
    iput v1, p2, Landroidx/recyclerview/widget/LinearLayoutManager$c;->g:I

    .line 13
    .line 14
    :cond_0
    invoke-virtual {p0, p1, p2}, Landroidx/recyclerview/widget/LinearLayoutManager;->Y0(Landroidx/recyclerview/widget/RecyclerView$s;Landroidx/recyclerview/widget/LinearLayoutManager$c;)V

    .line 15
    .line 16
    .line 17
    :cond_1
    iget v1, p2, Landroidx/recyclerview/widget/LinearLayoutManager$c;->c:I

    .line 18
    .line 19
    iget v3, p2, Landroidx/recyclerview/widget/LinearLayoutManager$c;->h:I

    .line 20
    .line 21
    add-int/2addr v1, v3

    .line 22
    :cond_2
    iget-boolean v3, p2, Landroidx/recyclerview/widget/LinearLayoutManager$c;->l:Z

    .line 23
    .line 24
    if-nez v3, :cond_3

    .line 25
    .line 26
    if-lez v1, :cond_a

    .line 27
    .line 28
    :cond_3
    iget v3, p2, Landroidx/recyclerview/widget/LinearLayoutManager$c;->d:I

    .line 29
    .line 30
    const/4 v4, 0x0

    .line 31
    if-ltz v3, :cond_4

    .line 32
    .line 33
    invoke-virtual {p3}, Landroidx/recyclerview/widget/RecyclerView$x;->b()I

    .line 34
    .line 35
    .line 36
    move-result v5

    .line 37
    if-ge v3, v5, :cond_4

    .line 38
    .line 39
    const/4 v3, 0x1

    .line 40
    goto :goto_0

    .line 41
    :cond_4
    move v3, v4

    .line 42
    :goto_0
    if-eqz v3, :cond_a

    .line 43
    .line 44
    iget-object v3, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->B:Landroidx/recyclerview/widget/LinearLayoutManager$b;

    .line 45
    .line 46
    iput v4, v3, Landroidx/recyclerview/widget/LinearLayoutManager$b;->a:I

    .line 47
    .line 48
    iput-boolean v4, v3, Landroidx/recyclerview/widget/LinearLayoutManager$b;->b:Z

    .line 49
    .line 50
    iput-boolean v4, v3, Landroidx/recyclerview/widget/LinearLayoutManager$b;->c:Z

    .line 51
    .line 52
    iput-boolean v4, v3, Landroidx/recyclerview/widget/LinearLayoutManager$b;->d:Z

    .line 53
    .line 54
    invoke-virtual {p0, p1, p3, p2, v3}, Landroidx/recyclerview/widget/LinearLayoutManager;->W0(Landroidx/recyclerview/widget/RecyclerView$s;Landroidx/recyclerview/widget/RecyclerView$x;Landroidx/recyclerview/widget/LinearLayoutManager$c;Landroidx/recyclerview/widget/LinearLayoutManager$b;)V

    .line 55
    .line 56
    .line 57
    iget-boolean v4, v3, Landroidx/recyclerview/widget/LinearLayoutManager$b;->b:Z

    .line 58
    .line 59
    if-eqz v4, :cond_5

    .line 60
    .line 61
    goto :goto_1

    .line 62
    :cond_5
    iget v4, p2, Landroidx/recyclerview/widget/LinearLayoutManager$c;->b:I

    .line 63
    .line 64
    iget v5, v3, Landroidx/recyclerview/widget/LinearLayoutManager$b;->a:I

    .line 65
    .line 66
    iget v6, p2, Landroidx/recyclerview/widget/LinearLayoutManager$c;->f:I

    .line 67
    .line 68
    mul-int/2addr v6, v5

    .line 69
    add-int/2addr v6, v4

    .line 70
    iput v6, p2, Landroidx/recyclerview/widget/LinearLayoutManager$c;->b:I

    .line 71
    .line 72
    iget-boolean v4, v3, Landroidx/recyclerview/widget/LinearLayoutManager$b;->c:Z

    .line 73
    .line 74
    if-eqz v4, :cond_6

    .line 75
    .line 76
    iget-object v4, p2, Landroidx/recyclerview/widget/LinearLayoutManager$c;->k:Ljava/util/List;

    .line 77
    .line 78
    if-nez v4, :cond_6

    .line 79
    .line 80
    iget-boolean v4, p3, Landroidx/recyclerview/widget/RecyclerView$x;->g:Z

    .line 81
    .line 82
    if-nez v4, :cond_7

    .line 83
    .line 84
    :cond_6
    iget v4, p2, Landroidx/recyclerview/widget/LinearLayoutManager$c;->c:I

    .line 85
    .line 86
    sub-int/2addr v4, v5

    .line 87
    iput v4, p2, Landroidx/recyclerview/widget/LinearLayoutManager$c;->c:I

    .line 88
    .line 89
    sub-int/2addr v1, v5

    .line 90
    :cond_7
    iget v4, p2, Landroidx/recyclerview/widget/LinearLayoutManager$c;->g:I

    .line 91
    .line 92
    if-eq v4, v2, :cond_9

    .line 93
    .line 94
    add-int/2addr v4, v5

    .line 95
    iput v4, p2, Landroidx/recyclerview/widget/LinearLayoutManager$c;->g:I

    .line 96
    .line 97
    iget v5, p2, Landroidx/recyclerview/widget/LinearLayoutManager$c;->c:I

    .line 98
    .line 99
    if-gez v5, :cond_8

    .line 100
    .line 101
    add-int/2addr v4, v5

    .line 102
    iput v4, p2, Landroidx/recyclerview/widget/LinearLayoutManager$c;->g:I

    .line 103
    .line 104
    :cond_8
    invoke-virtual {p0, p1, p2}, Landroidx/recyclerview/widget/LinearLayoutManager;->Y0(Landroidx/recyclerview/widget/RecyclerView$s;Landroidx/recyclerview/widget/LinearLayoutManager$c;)V

    .line 105
    .line 106
    .line 107
    :cond_9
    if-eqz p4, :cond_2

    .line 108
    .line 109
    iget-boolean v3, v3, Landroidx/recyclerview/widget/LinearLayoutManager$b;->d:Z

    .line 110
    .line 111
    if-eqz v3, :cond_2

    .line 112
    .line 113
    :cond_a
    :goto_1
    iget p1, p2, Landroidx/recyclerview/widget/LinearLayoutManager$c;->c:I

    .line 114
    .line 115
    sub-int/2addr v0, p1

    .line 116
    return v0
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
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
    .line 358
    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
    .line 371
    .line 372
    .line 373
    .line 374
    .line 375
    .line 376
    .line 377
    .line 378
    .line 379
    .line 380
    .line 381
    .line 382
    .line 383
    .line 384
    .line 385
    .line 386
    .line 387
    .line 388
    .line 389
    .line 390
    .line 391
    .line 392
    .line 393
    .line 394
    .line 395
    .line 396
    .line 397
    .line 398
    .line 399
    .line 400
    .line 401
    .line 402
    .line 403
    .line 404
    .line 405
    .line 406
    .line 407
    .line 408
    .line 409
    .line 410
    .line 411
    .line 412
    .line 413
    .line 414
    .line 415
    .line 416
    .line 417
    .line 418
    .line 419
    .line 420
    .line 421
    .line 422
    .line 423
    .line 424
    .line 425
    .line 426
    .line 427
    .line 428
    .line 429
    .line 430
    .line 431
    .line 432
    .line 433
    .line 434
    .line 435
    .line 436
    .line 437
    .line 438
    .line 439
    .line 440
    .line 441
    .line 442
    .line 443
    .line 444
    .line 445
    .line 446
    .line 447
    .line 448
    .line 449
    .line 450
    .line 451
    .line 452
    .line 453
    .line 454
    .line 455
    .line 456
    .line 457
    .line 458
    .line 459
    .line 460
    .line 461
    .line 462
    .line 463
    .line 464
    .line 465
    .line 466
    .line 467
    .line 468
    .line 469
    .line 470
    .line 471
    .line 472
    .line 473
    .line 474
    .line 475
    .line 476
    .line 477
    .line 478
    .line 479
    .line 480
    .line 481
    .line 482
    .line 483
    .line 484
    .line 485
    .line 486
    .line 487
    .line 488
    .line 489
    .line 490
    .line 491
    .line 492
    .line 493
    .line 494
    .line 495
    .line 496
    .line 497
    .line 498
    .line 499
    .line 500
    .line 501
    .line 502
    .line 503
    .line 504
    .line 505
    .line 506
    .line 507
    .line 508
    .line 509
    .line 510
    .line 511
    .line 512
    .line 513
    .line 514
    .line 515
    .line 516
    .line 517
    .line 518
    .line 519
    .line 520
    .line 521
    .line 522
    .line 523
    .line 524
    .line 525
    .line 526
    .line 527
    .line 528
    .line 529
    .line 530
    .line 531
    .line 532
    .line 533
    .line 534
    .line 535
    .line 536
    .line 537
    .line 538
    .line 539
    .line 540
    .line 541
    .line 542
    .line 543
    .line 544
    .line 545
    .line 546
    .line 547
    .line 548
    .line 549
    .line 550
    .line 551
    .line 552
    .line 553
    .line 554
    .line 555
    .line 556
    .line 557
    .line 558
    .line 559
    .line 560
    .line 561
    .line 562
    .line 563
    .line 564
    .line 565
    .line 566
    .line 567
    .line 568
    .line 569
    .line 570
    .line 571
    .line 572
    .line 573
    .line 574
    .line 575
    .line 576
    .line 577
    .line 578
    .line 579
    .line 580
    .line 581
    .line 582
    .line 583
    .line 584
    .line 585
    .line 586
    .line 587
    .line 588
    .line 589
    .line 590
    .line 591
    .line 592
    .line 593
    .line 594
    .line 595
    .line 596
    .line 597
    .line 598
    .line 599
    .line 600
    .line 601
    .line 602
    .line 603
    .line 604
    .line 605
    .line 606
    .line 607
    .line 608
    .line 609
    .line 610
    .line 611
    .line 612
    .line 613
    .line 614
    .line 615
    .line 616
    .line 617
    .line 618
    .line 619
    .line 620
    .line 621
    .line 622
    .line 623
    .line 624
    .line 625
    .line 626
    .line 627
    .line 628
    .line 629
    .line 630
    .line 631
    .line 632
    .line 633
    .line 634
    .line 635
    .line 636
    .line 637
    .line 638
    .line 639
    .line 640
    .line 641
    .line 642
    .line 643
    .line 644
    .line 645
    .line 646
    .line 647
    .line 648
    .line 649
    .line 650
    .line 651
    .line 652
    .line 653
    .line 654
    .line 655
    .line 656
    .line 657
    .line 658
    .line 659
    .line 660
    .line 661
    .line 662
    .line 663
    .line 664
    .line 665
    .line 666
    .line 667
    .line 668
    .line 669
    .line 670
    .line 671
    .line 672
    .line 673
    .line 674
    .line 675
    .line 676
    .line 677
    .line 678
    .line 679
    .line 680
    .line 681
    .line 682
    .line 683
    .line 684
    .line 685
    .line 686
    .line 687
    .line 688
    .line 689
    .line 690
    .line 691
    .line 692
    .line 693
    .line 694
    .line 695
    .line 696
    .line 697
    .line 698
    .line 699
    .line 700
    .line 701
    .line 702
    .line 703
    .line 704
    .line 705
    .line 706
    .line 707
    .line 708
    .line 709
    .line 710
    .line 711
    .line 712
    .line 713
    .line 714
    .line 715
    .line 716
    .line 717
    .line 718
    .line 719
    .line 720
    .line 721
    .line 722
    .line 723
    .line 724
    .line 725
    .line 726
    .line 727
    .line 728
    .line 729
    .line 730
    .line 731
    .line 732
    .line 733
    .line 734
    .line 735
    .line 736
    .line 737
    .line 738
    .line 739
    .line 740
    .line 741
    .line 742
    .line 743
    .line 744
    .line 745
    .line 746
    .line 747
    .line 748
    .line 749
    .line 750
    .line 751
    .line 752
    .line 753
    .line 754
    .line 755
    .line 756
    .line 757
    .line 758
    .line 759
    .line 760
    .line 761
    .line 762
    .line 763
    .line 764
    .line 765
    .line 766
    .line 767
    .line 768
    .line 769
    .line 770
    .line 771
    .line 772
    .line 773
    .line 774
    .line 775
    .line 776
    .line 777
    .line 778
    .line 779
    .line 780
    .line 781
    .line 782
    .line 783
    .line 784
    .line 785
    .line 786
    .line 787
    .line 788
    .line 789
    .line 790
    .line 791
    .line 792
    .line 793
    .line 794
    .line 795
    .line 796
    .line 797
    .line 798
    .line 799
    .line 800
    .line 801
    .line 802
    .line 803
    .line 804
    .line 805
    .line 806
    .line 807
    .line 808
    .line 809
    .line 810
    .line 811
    .line 812
    .line 813
    .line 814
    .line 815
    .line 816
    .line 817
    .line 818
    .line 819
    .line 820
    .line 821
    .line 822
    .line 823
    .line 824
    .line 825
    .line 826
    .line 827
    .line 828
    .line 829
    .line 830
    .line 831
    .line 832
    .line 833
    .line 834
    .line 835
    .line 836
    .line 837
    .line 838
    .line 839
    .line 840
    .line 841
    .line 842
    .line 843
    .line 844
    .line 845
    .line 846
    .line 847
    .line 848
    .line 849
    .line 850
    .line 851
    .line 852
    .line 853
    .line 854
    .line 855
    .line 856
    .line 857
    .line 858
    .line 859
    .line 860
    .line 861
    .line 862
    .line 863
    .line 864
    .line 865
    .line 866
    .line 867
    .line 868
    .line 869
    .line 870
    .line 871
    .line 872
    .line 873
    .line 874
    .line 875
    .line 876
    .line 877
    .line 878
    .line 879
    .line 880
    .line 881
    .line 882
    .line 883
    .line 884
    .line 885
    .line 886
    .line 887
    .line 888
    .line 889
    .line 890
    .line 891
    .line 892
    .line 893
    .line 894
    .line 895
    .line 896
    .line 897
    .line 898
    .line 899
    .line 900
    .line 901
    .line 902
    .line 903
    .line 904
    .line 905
    .line 906
    .line 907
    .line 908
    .line 909
    .line 910
    .line 911
    .line 912
    .line 913
    .line 914
    .line 915
    .line 916
    .line 917
    .line 918
    .line 919
    .line 920
    .line 921
    .line 922
    .line 923
    .line 924
    .line 925
    .line 926
    .line 927
    .line 928
    .line 929
    .line 930
    .line 931
    .line 932
    .line 933
    .line 934
    .line 935
    .line 936
    .line 937
    .line 938
    .line 939
    .line 940
    .line 941
    .line 942
    .line 943
    .line 944
    .line 945
    .line 946
    .line 947
    .line 948
    .line 949
    .line 950
    .line 951
    .line 952
    .line 953
    .line 954
    .line 955
    .line 956
    .line 957
    .line 958
    .line 959
    .line 960
    .line 961
    .line 962
    .line 963
    .line 964
    .line 965
    .line 966
    .line 967
    .line 968
    .line 969
    .line 970
    .line 971
    .line 972
    .line 973
    .line 974
    .line 975
    .line 976
    .line 977
    .line 978
    .line 979
    .line 980
    .line 981
    .line 982
    .line 983
    .line 984
    .line 985
    .line 986
    .line 987
    .line 988
    .line 989
    .line 990
    .line 991
    .line 992
    .line 993
    .line 994
    .line 995
    .line 996
    .line 997
    .line 998
    .line 999
    .line 1000
    .line 1001
    .line 1002
    .line 1003
    .line 1004
    .line 1005
    .line 1006
    .line 1007
    .line 1008
    .line 1009
    .line 1010
    .line 1011
    .line 1012
    .line 1013
    .line 1014
    .line 1015
    .line 1016
    .line 1017
    .line 1018
    .line 1019
    .line 1020
    .line 1021
    .line 1022
    .line 1023
    .line 1024
    .line 1025
    .line 1026
    .line 1027
    .line 1028
    .line 1029
    .line 1030
    .line 1031
    .line 1032
    .line 1033
    .line 1034
    .line 1035
    .line 1036
    .line 1037
    .line 1038
.end method

.method public final K0(Z)Landroid/view/View;
    .locals 3

    iget-boolean v0, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->u:Z

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$l;->w()I

    move-result v0

    const/4 v1, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$l;->w()I

    move-result v0

    const/4 v1, -0x1

    add-int/2addr v0, v1

    move v2, v1

    move v1, v0

    move v0, v2

    :goto_0
    invoke-virtual {p0, v1, v0, p1}, Landroidx/recyclerview/widget/LinearLayoutManager;->P0(IIZ)Landroid/view/View;

    move-result-object p1

    return-object p1
.end method

.method public final L0(Z)Landroid/view/View;
    .locals 2

    iget-boolean v0, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->u:Z

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$l;->w()I

    move-result v0

    const/4 v1, -0x1

    add-int/2addr v0, v1

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$l;->w()I

    move-result v1

    const/4 v0, 0x0

    :goto_0
    invoke-virtual {p0, v0, v1, p1}, Landroidx/recyclerview/widget/LinearLayoutManager;->P0(IIZ)Landroid/view/View;

    move-result-object p1

    return-object p1
.end method

.method public final M()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public final M0()I
    .locals 2

    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$l;->w()I

    move-result v0

    const/4 v1, 0x0

    invoke-virtual {p0, v1, v0, v1}, Landroidx/recyclerview/widget/LinearLayoutManager;->P0(IIZ)Landroid/view/View;

    move-result-object v0

    if-nez v0, :cond_0

    const/4 v0, -0x1

    goto :goto_0

    :cond_0
    invoke-static {v0}, Landroidx/recyclerview/widget/RecyclerView$l;->G(Landroid/view/View;)I

    move-result v0

    :goto_0
    return v0
.end method

.method public final N0()I
    .locals 3

    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$l;->w()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    const/4 v1, -0x1

    const/4 v2, 0x0

    invoke-virtual {p0, v0, v1, v2}, Landroidx/recyclerview/widget/LinearLayoutManager;->P0(IIZ)Landroid/view/View;

    move-result-object v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-static {v0}, Landroidx/recyclerview/widget/RecyclerView$l;->G(Landroid/view/View;)I

    move-result v1

    :goto_0
    return v1
.end method

.method public final O0(II)Landroid/view/View;
    .locals 3

    invoke-virtual {p0}, Landroidx/recyclerview/widget/LinearLayoutManager;->I0()V

    if-le p2, p1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    if-ge p2, p1, :cond_1

    const/4 v0, -0x1

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    if-nez v0, :cond_2

    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/RecyclerView$l;->v(I)Landroid/view/View;

    move-result-object p1

    return-object p1

    :cond_2
    iget-object v0, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->r:Landroidx/recyclerview/widget/s;

    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/RecyclerView$l;->v(I)Landroid/view/View;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroidx/recyclerview/widget/s;->e(Landroid/view/View;)I

    move-result v0

    iget-object v1, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->r:Landroidx/recyclerview/widget/s;

    invoke-virtual {v1}, Landroidx/recyclerview/widget/s;->k()I

    move-result v1

    if-ge v0, v1, :cond_3

    const/16 v0, 0x4104

    const/16 v1, 0x4004

    goto :goto_1

    :cond_3
    const/16 v0, 0x1041

    const/16 v1, 0x1001

    :goto_1
    iget v2, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->p:I

    if-nez v2, :cond_4

    iget-object v2, p0, Landroidx/recyclerview/widget/RecyclerView$l;->c:Landroidx/recyclerview/widget/b0;

    goto :goto_2

    :cond_4
    iget-object v2, p0, Landroidx/recyclerview/widget/RecyclerView$l;->d:Landroidx/recyclerview/widget/b0;

    :goto_2
    invoke-virtual {v2, p1, p2, v0, v1}, Landroidx/recyclerview/widget/b0;->a(IIII)Landroid/view/View;

    move-result-object p1

    return-object p1
.end method

.method public final P0(IIZ)Landroid/view/View;
    .locals 2

    invoke-virtual {p0}, Landroidx/recyclerview/widget/LinearLayoutManager;->I0()V

    const/16 v0, 0x140

    if-eqz p3, :cond_0

    const/16 p3, 0x6003

    goto :goto_0

    :cond_0
    move p3, v0

    :goto_0
    iget v1, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->p:I

    if-nez v1, :cond_1

    iget-object v1, p0, Landroidx/recyclerview/widget/RecyclerView$l;->c:Landroidx/recyclerview/widget/b0;

    goto :goto_1

    :cond_1
    iget-object v1, p0, Landroidx/recyclerview/widget/RecyclerView$l;->d:Landroidx/recyclerview/widget/b0;

    :goto_1
    invoke-virtual {v1, p1, p2, p3, v0}, Landroidx/recyclerview/widget/b0;->a(IIII)Landroid/view/View;

    move-result-object p1

    return-object p1
.end method

.method public Q0(Landroidx/recyclerview/widget/RecyclerView$s;Landroidx/recyclerview/widget/RecyclerView$x;III)Landroid/view/View;
    .locals 5

    invoke-virtual {p0}, Landroidx/recyclerview/widget/LinearLayoutManager;->I0()V

    iget-object p1, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->r:Landroidx/recyclerview/widget/s;

    invoke-virtual {p1}, Landroidx/recyclerview/widget/s;->k()I

    move-result p1

    iget-object p2, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->r:Landroidx/recyclerview/widget/s;

    invoke-virtual {p2}, Landroidx/recyclerview/widget/s;->g()I

    move-result p2

    if-le p4, p3, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, -0x1

    :goto_0
    const/4 v1, 0x0

    move-object v2, v1

    :goto_1
    if-eq p3, p4, :cond_5

    invoke-virtual {p0, p3}, Landroidx/recyclerview/widget/RecyclerView$l;->v(I)Landroid/view/View;

    move-result-object v3

    invoke-static {v3}, Landroidx/recyclerview/widget/RecyclerView$l;->G(Landroid/view/View;)I

    move-result v4

    if-ltz v4, :cond_4

    if-ge v4, p5, :cond_4

    invoke-virtual {v3}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v4

    check-cast v4, Landroidx/recyclerview/widget/RecyclerView$m;

    invoke-virtual {v4}, Landroidx/recyclerview/widget/RecyclerView$m;->c()Z

    move-result v4

    if-eqz v4, :cond_1

    if-nez v2, :cond_4

    move-object v2, v3

    goto :goto_3

    :cond_1
    iget-object v4, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->r:Landroidx/recyclerview/widget/s;

    invoke-virtual {v4, v3}, Landroidx/recyclerview/widget/s;->e(Landroid/view/View;)I

    move-result v4

    if-ge v4, p2, :cond_3

    iget-object v4, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->r:Landroidx/recyclerview/widget/s;

    invoke-virtual {v4, v3}, Landroidx/recyclerview/widget/s;->b(Landroid/view/View;)I

    move-result v4

    if-ge v4, p1, :cond_2

    goto :goto_2

    :cond_2
    return-object v3

    :cond_3
    :goto_2
    if-nez v1, :cond_4

    move-object v1, v3

    :cond_4
    :goto_3
    add-int/2addr p3, v0

    goto :goto_1

    :cond_5
    if-eqz v1, :cond_6

    goto :goto_4

    :cond_6
    move-object v1, v2

    :goto_4
    return-object v1
.end method

.method public final R(Landroidx/recyclerview/widget/RecyclerView;)V
    .locals 0

    return-void
.end method

.method public final R0(ILandroidx/recyclerview/widget/RecyclerView$s;Landroidx/recyclerview/widget/RecyclerView$x;Z)I
    .locals 1

    iget-object v0, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->r:Landroidx/recyclerview/widget/s;

    invoke-virtual {v0}, Landroidx/recyclerview/widget/s;->g()I

    move-result v0

    sub-int/2addr v0, p1

    if-lez v0, :cond_1

    neg-int v0, v0

    invoke-virtual {p0, v0, p2, p3}, Landroidx/recyclerview/widget/LinearLayoutManager;->b1(ILandroidx/recyclerview/widget/RecyclerView$s;Landroidx/recyclerview/widget/RecyclerView$x;)I

    move-result p2

    neg-int p2, p2

    add-int/2addr p1, p2

    if-eqz p4, :cond_0

    iget-object p3, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->r:Landroidx/recyclerview/widget/s;

    invoke-virtual {p3}, Landroidx/recyclerview/widget/s;->g()I

    move-result p3

    sub-int/2addr p3, p1

    if-lez p3, :cond_0

    iget-object p1, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->r:Landroidx/recyclerview/widget/s;

    invoke-virtual {p1, p3}, Landroidx/recyclerview/widget/s;->o(I)V

    add-int/2addr p3, p2

    return p3

    :cond_0
    return p2

    :cond_1
    const/4 p1, 0x0

    return p1
.end method

.method public S(Landroid/view/View;ILandroidx/recyclerview/widget/RecyclerView$s;Landroidx/recyclerview/widget/RecyclerView$x;)Landroid/view/View;
    .locals 3

    .line 1
    invoke-virtual {p0}, Landroidx/recyclerview/widget/LinearLayoutManager;->a1()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$l;->w()I

    .line 5
    .line 6
    .line 7
    move-result p1

    .line 8
    const/4 v0, 0x0

    .line 9
    if-nez p1, :cond_0

    .line 10
    .line 11
    return-object v0

    .line 12
    :cond_0
    invoke-virtual {p0, p2}, Landroidx/recyclerview/widget/LinearLayoutManager;->H0(I)I

    .line 13
    .line 14
    .line 15
    move-result p1

    .line 16
    const/high16 p2, -0x80000000

    .line 17
    .line 18
    if-ne p1, p2, :cond_1

    .line 19
    .line 20
    return-object v0

    .line 21
    :cond_1
    invoke-virtual {p0}, Landroidx/recyclerview/widget/LinearLayoutManager;->I0()V

    .line 22
    .line 23
    .line 24
    iget-object v1, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->r:Landroidx/recyclerview/widget/s;

    .line 25
    .line 26
    invoke-virtual {v1}, Landroidx/recyclerview/widget/s;->l()I

    .line 27
    .line 28
    .line 29
    move-result v1

    .line 30
    int-to-float v1, v1

    .line 31
    const v2, 0x3eaaaaab

    .line 32
    .line 33
    .line 34
    mul-float/2addr v1, v2

    .line 35
    float-to-int v1, v1

    .line 36
    const/4 v2, 0x0

    .line 37
    invoke-virtual {p0, p1, v1, v2, p4}, Landroidx/recyclerview/widget/LinearLayoutManager;->e1(IIZLandroidx/recyclerview/widget/RecyclerView$x;)V

    .line 38
    .line 39
    .line 40
    iget-object v1, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->q:Landroidx/recyclerview/widget/LinearLayoutManager$c;

    .line 41
    .line 42
    iput p2, v1, Landroidx/recyclerview/widget/LinearLayoutManager$c;->g:I

    .line 43
    .line 44
    iput-boolean v2, v1, Landroidx/recyclerview/widget/LinearLayoutManager$c;->a:Z

    .line 45
    .line 46
    const/4 p2, 0x1

    .line 47
    invoke-virtual {p0, p3, v1, p4, p2}, Landroidx/recyclerview/widget/LinearLayoutManager;->J0(Landroidx/recyclerview/widget/RecyclerView$s;Landroidx/recyclerview/widget/LinearLayoutManager$c;Landroidx/recyclerview/widget/RecyclerView$x;Z)I

    .line 48
    .line 49
    .line 50
    const/4 p2, -0x1

    .line 51
    if-ne p1, p2, :cond_3

    .line 52
    .line 53
    iget-boolean p3, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->u:Z

    .line 54
    .line 55
    if-eqz p3, :cond_2

    .line 56
    .line 57
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$l;->w()I

    .line 58
    .line 59
    .line 60
    move-result p3

    .line 61
    add-int/2addr p3, p2

    .line 62
    invoke-virtual {p0, p3, p2}, Landroidx/recyclerview/widget/LinearLayoutManager;->O0(II)Landroid/view/View;

    .line 63
    .line 64
    .line 65
    move-result-object p3

    .line 66
    goto :goto_0

    .line 67
    :cond_2
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$l;->w()I

    .line 68
    .line 69
    .line 70
    move-result p3

    .line 71
    invoke-virtual {p0, v2, p3}, Landroidx/recyclerview/widget/LinearLayoutManager;->O0(II)Landroid/view/View;

    .line 72
    .line 73
    .line 74
    move-result-object p3

    .line 75
    goto :goto_0

    .line 76
    :cond_3
    iget-boolean p3, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->u:Z

    .line 77
    .line 78
    if-eqz p3, :cond_4

    .line 79
    .line 80
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$l;->w()I

    .line 81
    .line 82
    .line 83
    move-result p3

    .line 84
    invoke-virtual {p0, v2, p3}, Landroidx/recyclerview/widget/LinearLayoutManager;->O0(II)Landroid/view/View;

    .line 85
    .line 86
    .line 87
    move-result-object p3

    .line 88
    goto :goto_0

    .line 89
    :cond_4
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$l;->w()I

    .line 90
    .line 91
    .line 92
    move-result p3

    .line 93
    add-int/2addr p3, p2

    .line 94
    invoke-virtual {p0, p3, p2}, Landroidx/recyclerview/widget/LinearLayoutManager;->O0(II)Landroid/view/View;

    .line 95
    .line 96
    .line 97
    move-result-object p3

    .line 98
    :goto_0
    if-ne p1, p2, :cond_5

    .line 99
    .line 100
    invoke-virtual {p0}, Landroidx/recyclerview/widget/LinearLayoutManager;->U0()Landroid/view/View;

    .line 101
    .line 102
    .line 103
    move-result-object p1

    .line 104
    goto :goto_1

    .line 105
    :cond_5
    invoke-virtual {p0}, Landroidx/recyclerview/widget/LinearLayoutManager;->T0()Landroid/view/View;

    .line 106
    .line 107
    .line 108
    move-result-object p1

    .line 109
    :goto_1
    invoke-virtual {p1}, Landroid/view/View;->hasFocusable()Z

    .line 110
    .line 111
    .line 112
    move-result p2

    .line 113
    if-eqz p2, :cond_7

    .line 114
    .line 115
    if-nez p3, :cond_6

    .line 116
    .line 117
    return-object v0

    .line 118
    :cond_6
    return-object p1

    .line 119
    :cond_7
    return-object p3
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
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
    .line 358
    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
    .line 371
    .line 372
    .line 373
    .line 374
    .line 375
    .line 376
    .line 377
    .line 378
    .line 379
    .line 380
    .line 381
    .line 382
    .line 383
    .line 384
    .line 385
    .line 386
    .line 387
    .line 388
    .line 389
    .line 390
    .line 391
    .line 392
    .line 393
    .line 394
    .line 395
    .line 396
    .line 397
    .line 398
    .line 399
    .line 400
    .line 401
    .line 402
    .line 403
    .line 404
    .line 405
    .line 406
    .line 407
    .line 408
    .line 409
    .line 410
    .line 411
    .line 412
    .line 413
    .line 414
    .line 415
    .line 416
    .line 417
    .line 418
    .line 419
    .line 420
    .line 421
    .line 422
    .line 423
    .line 424
    .line 425
    .line 426
    .line 427
    .line 428
    .line 429
    .line 430
    .line 431
    .line 432
    .line 433
    .line 434
    .line 435
    .line 436
    .line 437
    .line 438
    .line 439
    .line 440
    .line 441
    .line 442
    .line 443
    .line 444
    .line 445
    .line 446
    .line 447
    .line 448
    .line 449
    .line 450
    .line 451
    .line 452
    .line 453
    .line 454
    .line 455
    .line 456
    .line 457
    .line 458
    .line 459
    .line 460
    .line 461
    .line 462
    .line 463
    .line 464
    .line 465
    .line 466
    .line 467
    .line 468
    .line 469
    .line 470
    .line 471
    .line 472
    .line 473
    .line 474
    .line 475
    .line 476
    .line 477
    .line 478
    .line 479
    .line 480
    .line 481
    .line 482
    .line 483
    .line 484
    .line 485
    .line 486
    .line 487
    .line 488
    .line 489
    .line 490
    .line 491
    .line 492
    .line 493
    .line 494
    .line 495
    .line 496
    .line 497
    .line 498
    .line 499
    .line 500
    .line 501
    .line 502
    .line 503
    .line 504
    .line 505
    .line 506
    .line 507
    .line 508
    .line 509
    .line 510
    .line 511
    .line 512
    .line 513
    .line 514
    .line 515
    .line 516
    .line 517
    .line 518
    .line 519
    .line 520
    .line 521
    .line 522
    .line 523
    .line 524
    .line 525
    .line 526
    .line 527
    .line 528
    .line 529
    .line 530
    .line 531
    .line 532
    .line 533
    .line 534
    .line 535
    .line 536
    .line 537
    .line 538
    .line 539
    .line 540
    .line 541
    .line 542
    .line 543
    .line 544
    .line 545
    .line 546
    .line 547
    .line 548
    .line 549
    .line 550
    .line 551
    .line 552
    .line 553
    .line 554
    .line 555
    .line 556
    .line 557
    .line 558
    .line 559
    .line 560
    .line 561
    .line 562
    .line 563
    .line 564
    .line 565
    .line 566
    .line 567
    .line 568
    .line 569
    .line 570
    .line 571
    .line 572
    .line 573
    .line 574
    .line 575
    .line 576
    .line 577
    .line 578
    .line 579
    .line 580
    .line 581
    .line 582
    .line 583
    .line 584
    .line 585
    .line 586
    .line 587
    .line 588
    .line 589
    .line 590
    .line 591
    .line 592
    .line 593
    .line 594
    .line 595
    .line 596
    .line 597
    .line 598
    .line 599
    .line 600
    .line 601
    .line 602
    .line 603
    .line 604
    .line 605
    .line 606
    .line 607
    .line 608
    .line 609
    .line 610
    .line 611
    .line 612
    .line 613
    .line 614
    .line 615
    .line 616
    .line 617
    .line 618
    .line 619
    .line 620
    .line 621
    .line 622
    .line 623
    .line 624
    .line 625
    .line 626
    .line 627
    .line 628
    .line 629
    .line 630
    .line 631
    .line 632
    .line 633
    .line 634
    .line 635
    .line 636
    .line 637
    .line 638
    .line 639
    .line 640
    .line 641
    .line 642
    .line 643
    .line 644
    .line 645
    .line 646
    .line 647
    .line 648
    .line 649
    .line 650
    .line 651
    .line 652
    .line 653
    .line 654
    .line 655
    .line 656
    .line 657
    .line 658
    .line 659
    .line 660
    .line 661
    .line 662
    .line 663
    .line 664
    .line 665
    .line 666
    .line 667
    .line 668
    .line 669
    .line 670
    .line 671
    .line 672
    .line 673
    .line 674
    .line 675
    .line 676
    .line 677
    .line 678
    .line 679
    .line 680
    .line 681
    .line 682
    .line 683
    .line 684
    .line 685
    .line 686
    .line 687
    .line 688
    .line 689
    .line 690
    .line 691
    .line 692
    .line 693
    .line 694
    .line 695
    .line 696
    .line 697
    .line 698
    .line 699
    .line 700
    .line 701
    .line 702
    .line 703
    .line 704
    .line 705
    .line 706
    .line 707
    .line 708
    .line 709
    .line 710
    .line 711
    .line 712
    .line 713
    .line 714
    .line 715
    .line 716
    .line 717
    .line 718
    .line 719
    .line 720
    .line 721
    .line 722
    .line 723
    .line 724
    .line 725
    .line 726
    .line 727
    .line 728
    .line 729
    .line 730
    .line 731
    .line 732
    .line 733
    .line 734
    .line 735
    .line 736
    .line 737
    .line 738
    .line 739
    .line 740
    .line 741
    .line 742
    .line 743
    .line 744
    .line 745
    .line 746
    .line 747
    .line 748
    .line 749
    .line 750
    .line 751
    .line 752
    .line 753
    .line 754
    .line 755
    .line 756
    .line 757
    .line 758
    .line 759
    .line 760
    .line 761
    .line 762
    .line 763
    .line 764
    .line 765
    .line 766
    .line 767
    .line 768
    .line 769
    .line 770
    .line 771
    .line 772
    .line 773
    .line 774
    .line 775
    .line 776
    .line 777
    .line 778
    .line 779
    .line 780
    .line 781
    .line 782
    .line 783
    .line 784
    .line 785
    .line 786
    .line 787
    .line 788
    .line 789
    .line 790
    .line 791
    .line 792
    .line 793
    .line 794
    .line 795
    .line 796
    .line 797
    .line 798
    .line 799
    .line 800
    .line 801
    .line 802
    .line 803
    .line 804
    .line 805
    .line 806
    .line 807
    .line 808
    .line 809
    .line 810
    .line 811
    .line 812
    .line 813
    .line 814
    .line 815
    .line 816
    .line 817
    .line 818
    .line 819
    .line 820
    .line 821
    .line 822
    .line 823
    .line 824
    .line 825
    .line 826
    .line 827
    .line 828
    .line 829
    .line 830
    .line 831
    .line 832
    .line 833
    .line 834
    .line 835
    .line 836
    .line 837
    .line 838
    .line 839
    .line 840
    .line 841
    .line 842
    .line 843
    .line 844
    .line 845
    .line 846
    .line 847
    .line 848
    .line 849
    .line 850
    .line 851
    .line 852
    .line 853
    .line 854
    .line 855
    .line 856
    .line 857
    .line 858
    .line 859
    .line 860
    .line 861
    .line 862
    .line 863
    .line 864
    .line 865
    .line 866
    .line 867
    .line 868
    .line 869
    .line 870
    .line 871
    .line 872
    .line 873
    .line 874
    .line 875
    .line 876
    .line 877
    .line 878
    .line 879
    .line 880
    .line 881
    .line 882
    .line 883
    .line 884
    .line 885
    .line 886
    .line 887
    .line 888
    .line 889
    .line 890
    .line 891
    .line 892
    .line 893
    .line 894
    .line 895
    .line 896
    .line 897
    .line 898
    .line 899
    .line 900
    .line 901
    .line 902
    .line 903
    .line 904
    .line 905
    .line 906
    .line 907
    .line 908
    .line 909
    .line 910
    .line 911
    .line 912
    .line 913
    .line 914
    .line 915
    .line 916
    .line 917
    .line 918
    .line 919
    .line 920
    .line 921
    .line 922
    .line 923
    .line 924
    .line 925
    .line 926
    .line 927
    .line 928
    .line 929
    .line 930
    .line 931
    .line 932
    .line 933
    .line 934
    .line 935
    .line 936
    .line 937
    .line 938
    .line 939
    .line 940
    .line 941
    .line 942
    .line 943
    .line 944
    .line 945
    .line 946
    .line 947
    .line 948
    .line 949
    .line 950
    .line 951
    .line 952
    .line 953
    .line 954
    .line 955
    .line 956
    .line 957
    .line 958
    .line 959
    .line 960
    .line 961
    .line 962
    .line 963
    .line 964
    .line 965
    .line 966
    .line 967
    .line 968
    .line 969
    .line 970
    .line 971
    .line 972
    .line 973
    .line 974
    .line 975
    .line 976
    .line 977
    .line 978
    .line 979
    .line 980
    .line 981
    .line 982
    .line 983
    .line 984
    .line 985
    .line 986
    .line 987
    .line 988
    .line 989
    .line 990
    .line 991
    .line 992
    .line 993
    .line 994
    .line 995
    .line 996
    .line 997
    .line 998
    .line 999
    .line 1000
    .line 1001
    .line 1002
    .line 1003
    .line 1004
    .line 1005
    .line 1006
    .line 1007
    .line 1008
    .line 1009
    .line 1010
    .line 1011
    .line 1012
    .line 1013
    .line 1014
    .line 1015
    .line 1016
    .line 1017
    .line 1018
    .line 1019
    .line 1020
    .line 1021
    .line 1022
    .line 1023
    .line 1024
    .line 1025
    .line 1026
    .line 1027
    .line 1028
    .line 1029
    .line 1030
    .line 1031
    .line 1032
    .line 1033
    .line 1034
    .line 1035
    .line 1036
    .line 1037
    .line 1038
.end method

.method public final S0(ILandroidx/recyclerview/widget/RecyclerView$s;Landroidx/recyclerview/widget/RecyclerView$x;Z)I
    .locals 1

    iget-object v0, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->r:Landroidx/recyclerview/widget/s;

    invoke-virtual {v0}, Landroidx/recyclerview/widget/s;->k()I

    move-result v0

    sub-int v0, p1, v0

    if-lez v0, :cond_1

    invoke-virtual {p0, v0, p2, p3}, Landroidx/recyclerview/widget/LinearLayoutManager;->b1(ILandroidx/recyclerview/widget/RecyclerView$s;Landroidx/recyclerview/widget/RecyclerView$x;)I

    move-result p2

    neg-int p2, p2

    add-int/2addr p1, p2

    if-eqz p4, :cond_0

    iget-object p3, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->r:Landroidx/recyclerview/widget/s;

    invoke-virtual {p3}, Landroidx/recyclerview/widget/s;->k()I

    move-result p3

    sub-int/2addr p1, p3

    if-lez p1, :cond_0

    iget-object p3, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->r:Landroidx/recyclerview/widget/s;

    neg-int p4, p1

    invoke-virtual {p3, p4}, Landroidx/recyclerview/widget/s;->o(I)V

    sub-int/2addr p2, p1

    :cond_0
    return p2

    :cond_1
    const/4 p1, 0x0

    return p1
.end method

.method public final T(Landroid/view/accessibility/AccessibilityEvent;)V
    .locals 1

    invoke-super {p0, p1}, Landroidx/recyclerview/widget/RecyclerView$l;->T(Landroid/view/accessibility/AccessibilityEvent;)V

    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$l;->w()I

    move-result v0

    if-lez v0, :cond_0

    invoke-virtual {p0}, Landroidx/recyclerview/widget/LinearLayoutManager;->M0()I

    move-result v0

    invoke-virtual {p1, v0}, Landroid/view/accessibility/AccessibilityRecord;->setFromIndex(I)V

    invoke-virtual {p0}, Landroidx/recyclerview/widget/LinearLayoutManager;->N0()I

    move-result v0

    invoke-virtual {p1, v0}, Landroid/view/accessibility/AccessibilityRecord;->setToIndex(I)V

    :cond_0
    return-void
.end method

.method public final T0()Landroid/view/View;
    .locals 1

    iget-boolean v0, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->u:Z

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$l;->w()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    :goto_0
    invoke-virtual {p0, v0}, Landroidx/recyclerview/widget/RecyclerView$l;->v(I)Landroid/view/View;

    move-result-object v0

    return-object v0
.end method

.method public final U0()Landroid/view/View;
    .locals 1

    iget-boolean v0, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->u:Z

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$l;->w()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-virtual {p0, v0}, Landroidx/recyclerview/widget/RecyclerView$l;->v(I)Landroid/view/View;

    move-result-object v0

    return-object v0
.end method

.method public final V0()Z
    .locals 2

    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$l;->A()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    return v1
.end method

.method public W0(Landroidx/recyclerview/widget/RecyclerView$s;Landroidx/recyclerview/widget/RecyclerView$x;Landroidx/recyclerview/widget/LinearLayoutManager$c;Landroidx/recyclerview/widget/LinearLayoutManager$b;)V
    .locals 10

    .line 1
    invoke-virtual {p3, p1}, Landroidx/recyclerview/widget/LinearLayoutManager$c;->b(Landroidx/recyclerview/widget/RecyclerView$s;)Landroid/view/View;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    const/4 p2, 0x1

    .line 6
    if-nez p1, :cond_0

    .line 7
    .line 8
    iput-boolean p2, p4, Landroidx/recyclerview/widget/LinearLayoutManager$b;->b:Z

    .line 9
    .line 10
    return-void

    .line 11
    :cond_0
    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    check-cast v0, Landroidx/recyclerview/widget/RecyclerView$m;

    .line 16
    .line 17
    iget-object v1, p3, Landroidx/recyclerview/widget/LinearLayoutManager$c;->k:Ljava/util/List;

    .line 18
    .line 19
    const/4 v2, 0x0

    .line 20
    const/4 v3, -0x1

    .line 21
    if-nez v1, :cond_3

    .line 22
    .line 23
    iget-boolean v1, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->u:Z

    .line 24
    .line 25
    iget v4, p3, Landroidx/recyclerview/widget/LinearLayoutManager$c;->f:I

    .line 26
    .line 27
    if-ne v4, v3, :cond_1

    .line 28
    .line 29
    move v4, p2

    .line 30
    goto :goto_0

    .line 31
    :cond_1
    move v4, v2

    .line 32
    :goto_0
    if-ne v1, v4, :cond_2

    .line 33
    .line 34
    invoke-virtual {p0, p1, v3, v2}, Landroidx/recyclerview/widget/RecyclerView$l;->b(Landroid/view/View;IZ)V

    .line 35
    .line 36
    .line 37
    goto :goto_2

    .line 38
    :cond_2
    invoke-virtual {p0, p1, v2, v2}, Landroidx/recyclerview/widget/RecyclerView$l;->b(Landroid/view/View;IZ)V

    .line 39
    .line 40
    .line 41
    goto :goto_2

    .line 42
    :cond_3
    iget-boolean v1, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->u:Z

    .line 43
    .line 44
    iget v4, p3, Landroidx/recyclerview/widget/LinearLayoutManager$c;->f:I

    .line 45
    .line 46
    if-ne v4, v3, :cond_4

    .line 47
    .line 48
    move v4, p2

    .line 49
    goto :goto_1

    .line 50
    :cond_4
    move v4, v2

    .line 51
    :goto_1
    if-ne v1, v4, :cond_5

    .line 52
    .line 53
    invoke-virtual {p0, p1, v3, p2}, Landroidx/recyclerview/widget/RecyclerView$l;->b(Landroid/view/View;IZ)V

    .line 54
    .line 55
    .line 56
    goto :goto_2

    .line 57
    :cond_5
    invoke-virtual {p0, p1, v2, p2}, Landroidx/recyclerview/widget/RecyclerView$l;->b(Landroid/view/View;IZ)V

    .line 58
    .line 59
    .line 60
    :goto_2
    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 61
    .line 62
    .line 63
    move-result-object v1

    .line 64
    check-cast v1, Landroidx/recyclerview/widget/RecyclerView$m;

    .line 65
    .line 66
    iget-object v4, p0, Landroidx/recyclerview/widget/RecyclerView$l;->b:Landroidx/recyclerview/widget/RecyclerView;

    .line 67
    .line 68
    invoke-virtual {v4, p1}, Landroidx/recyclerview/widget/RecyclerView;->K(Landroid/view/View;)Landroid/graphics/Rect;

    .line 69
    .line 70
    .line 71
    move-result-object v4

    .line 72
    iget v5, v4, Landroid/graphics/Rect;->left:I

    .line 73
    .line 74
    iget v6, v4, Landroid/graphics/Rect;->right:I

    .line 75
    .line 76
    add-int/2addr v5, v6

    .line 77
    add-int/2addr v5, v2

    .line 78
    iget v6, v4, Landroid/graphics/Rect;->top:I

    .line 79
    .line 80
    iget v4, v4, Landroid/graphics/Rect;->bottom:I

    .line 81
    .line 82
    add-int/2addr v6, v4

    .line 83
    add-int/2addr v6, v2

    .line 84
    iget v2, p0, Landroidx/recyclerview/widget/RecyclerView$l;->n:I

    .line 85
    .line 86
    iget v4, p0, Landroidx/recyclerview/widget/RecyclerView$l;->l:I

    .line 87
    .line 88
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$l;->D()I

    .line 89
    .line 90
    .line 91
    move-result v7

    .line 92
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$l;->E()I

    .line 93
    .line 94
    .line 95
    move-result v8

    .line 96
    add-int/2addr v8, v7

    .line 97
    iget v7, v1, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I

    .line 98
    .line 99
    add-int/2addr v8, v7

    .line 100
    iget v7, v1, Landroid/view/ViewGroup$MarginLayoutParams;->rightMargin:I

    .line 101
    .line 102
    add-int/2addr v8, v7

    .line 103
    add-int/2addr v8, v5

    .line 104
    iget v5, v1, Landroid/view/ViewGroup$MarginLayoutParams;->width:I

    .line 105
    .line 106
    invoke-virtual {p0}, Landroidx/recyclerview/widget/LinearLayoutManager;->d()Z

    .line 107
    .line 108
    .line 109
    move-result v7

    .line 110
    invoke-static {v7, v2, v4, v8, v5}, Landroidx/recyclerview/widget/RecyclerView$l;->x(ZIIII)I

    .line 111
    .line 112
    .line 113
    move-result v2

    .line 114
    iget v4, p0, Landroidx/recyclerview/widget/RecyclerView$l;->o:I

    .line 115
    .line 116
    iget v5, p0, Landroidx/recyclerview/widget/RecyclerView$l;->m:I

    .line 117
    .line 118
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$l;->F()I

    .line 119
    .line 120
    .line 121
    move-result v7

    .line 122
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$l;->C()I

    .line 123
    .line 124
    .line 125
    move-result v8

    .line 126
    add-int/2addr v8, v7

    .line 127
    iget v7, v1, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    .line 128
    .line 129
    add-int/2addr v8, v7

    .line 130
    iget v7, v1, Landroid/view/ViewGroup$MarginLayoutParams;->bottomMargin:I

    .line 131
    .line 132
    add-int/2addr v8, v7

    .line 133
    add-int/2addr v8, v6

    .line 134
    iget v6, v1, Landroid/view/ViewGroup$MarginLayoutParams;->height:I

    .line 135
    .line 136
    invoke-virtual {p0}, Landroidx/recyclerview/widget/LinearLayoutManager;->e()Z

    .line 137
    .line 138
    .line 139
    move-result v7

    .line 140
    invoke-static {v7, v4, v5, v8, v6}, Landroidx/recyclerview/widget/RecyclerView$l;->x(ZIIII)I

    .line 141
    .line 142
    .line 143
    move-result v4

    .line 144
    invoke-virtual {p0, p1, v2, v4, v1}, Landroidx/recyclerview/widget/RecyclerView$l;->w0(Landroid/view/View;IILandroidx/recyclerview/widget/RecyclerView$m;)Z

    .line 145
    .line 146
    .line 147
    move-result v1

    .line 148
    if-eqz v1, :cond_6

    .line 149
    .line 150
    invoke-virtual {p1, v2, v4}, Landroid/view/View;->measure(II)V

    .line 151
    .line 152
    .line 153
    :cond_6
    iget-object v1, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->r:Landroidx/recyclerview/widget/s;

    .line 154
    .line 155
    invoke-virtual {v1, p1}, Landroidx/recyclerview/widget/s;->c(Landroid/view/View;)I

    .line 156
    .line 157
    .line 158
    move-result v1

    .line 159
    iput v1, p4, Landroidx/recyclerview/widget/LinearLayoutManager$b;->a:I

    .line 160
    .line 161
    iget v1, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->p:I

    .line 162
    .line 163
    if-ne v1, p2, :cond_9

    .line 164
    .line 165
    invoke-virtual {p0}, Landroidx/recyclerview/widget/LinearLayoutManager;->V0()Z

    .line 166
    .line 167
    .line 168
    move-result v1

    .line 169
    if-eqz v1, :cond_7

    .line 170
    .line 171
    iget v1, p0, Landroidx/recyclerview/widget/RecyclerView$l;->n:I

    .line 172
    .line 173
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$l;->E()I

    .line 174
    .line 175
    .line 176
    move-result v2

    .line 177
    sub-int/2addr v1, v2

    .line 178
    iget-object v2, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->r:Landroidx/recyclerview/widget/s;

    .line 179
    .line 180
    invoke-virtual {v2, p1}, Landroidx/recyclerview/widget/s;->d(Landroid/view/View;)I

    .line 181
    .line 182
    .line 183
    move-result v2

    .line 184
    sub-int v2, v1, v2

    .line 185
    .line 186
    goto :goto_3

    .line 187
    :cond_7
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$l;->D()I

    .line 188
    .line 189
    .line 190
    move-result v2

    .line 191
    iget-object v1, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->r:Landroidx/recyclerview/widget/s;

    .line 192
    .line 193
    invoke-virtual {v1, p1}, Landroidx/recyclerview/widget/s;->d(Landroid/view/View;)I

    .line 194
    .line 195
    .line 196
    move-result v1

    .line 197
    add-int/2addr v1, v2

    .line 198
    :goto_3
    iget v4, p3, Landroidx/recyclerview/widget/LinearLayoutManager$c;->f:I

    .line 199
    .line 200
    iget p3, p3, Landroidx/recyclerview/widget/LinearLayoutManager$c;->b:I

    .line 201
    .line 202
    if-ne v4, v3, :cond_8

    .line 203
    .line 204
    iget v3, p4, Landroidx/recyclerview/widget/LinearLayoutManager$b;->a:I

    .line 205
    .line 206
    sub-int v3, p3, v3

    .line 207
    .line 208
    move v9, v2

    .line 209
    move v2, p3

    .line 210
    move p3, v3

    .line 211
    move v3, v9

    .line 212
    goto :goto_4

    .line 213
    :cond_8
    iget v3, p4, Landroidx/recyclerview/widget/LinearLayoutManager$b;->a:I

    .line 214
    .line 215
    add-int/2addr v3, p3

    .line 216
    move v9, v3

    .line 217
    move v3, v2

    .line 218
    move v2, v9

    .line 219
    goto :goto_4

    .line 220
    :cond_9
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$l;->F()I

    .line 221
    .line 222
    .line 223
    move-result v1

    .line 224
    iget-object v2, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->r:Landroidx/recyclerview/widget/s;

    .line 225
    .line 226
    invoke-virtual {v2, p1}, Landroidx/recyclerview/widget/s;->d(Landroid/view/View;)I

    .line 227
    .line 228
    .line 229
    move-result v2

    .line 230
    add-int/2addr v2, v1

    .line 231
    iget v4, p3, Landroidx/recyclerview/widget/LinearLayoutManager$c;->f:I

    .line 232
    .line 233
    iget p3, p3, Landroidx/recyclerview/widget/LinearLayoutManager$c;->b:I

    .line 234
    .line 235
    if-ne v4, v3, :cond_a

    .line 236
    .line 237
    iget v3, p4, Landroidx/recyclerview/widget/LinearLayoutManager$b;->a:I

    .line 238
    .line 239
    sub-int v3, p3, v3

    .line 240
    .line 241
    move v9, v1

    .line 242
    move v1, p3

    .line 243
    move p3, v9

    .line 244
    goto :goto_4

    .line 245
    :cond_a
    iget v3, p4, Landroidx/recyclerview/widget/LinearLayoutManager$b;->a:I

    .line 246
    .line 247
    add-int/2addr v3, p3

    .line 248
    move v9, v3

    .line 249
    move v3, p3

    .line 250
    move p3, v1

    .line 251
    move v1, v9

    .line 252
    :goto_4
    invoke-static {p1, v3, p3, v1, v2}, Landroidx/recyclerview/widget/RecyclerView$l;->O(Landroid/view/View;IIII)V

    .line 253
    .line 254
    .line 255
    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView$m;->c()Z

    .line 256
    .line 257
    .line 258
    move-result p3

    .line 259
    if-nez p3, :cond_b

    .line 260
    .line 261
    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView$m;->b()Z

    .line 262
    .line 263
    .line 264
    move-result p3

    .line 265
    if-eqz p3, :cond_c

    .line 266
    .line 267
    :cond_b
    iput-boolean p2, p4, Landroidx/recyclerview/widget/LinearLayoutManager$b;->c:Z

    .line 268
    .line 269
    :cond_c
    invoke-virtual {p1}, Landroid/view/View;->hasFocusable()Z

    .line 270
    .line 271
    .line 272
    move-result p1

    .line 273
    iput-boolean p1, p4, Landroidx/recyclerview/widget/LinearLayoutManager$b;->d:Z

    .line 274
    .line 275
    return-void
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
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
    .line 358
    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
    .line 371
    .line 372
    .line 373
    .line 374
    .line 375
    .line 376
    .line 377
    .line 378
    .line 379
    .line 380
    .line 381
    .line 382
    .line 383
    .line 384
    .line 385
    .line 386
    .line 387
    .line 388
    .line 389
    .line 390
    .line 391
    .line 392
    .line 393
    .line 394
    .line 395
    .line 396
    .line 397
    .line 398
    .line 399
    .line 400
    .line 401
    .line 402
    .line 403
    .line 404
    .line 405
    .line 406
    .line 407
    .line 408
    .line 409
    .line 410
    .line 411
    .line 412
    .line 413
    .line 414
    .line 415
    .line 416
    .line 417
    .line 418
    .line 419
    .line 420
    .line 421
    .line 422
    .line 423
    .line 424
    .line 425
    .line 426
    .line 427
    .line 428
    .line 429
    .line 430
    .line 431
    .line 432
    .line 433
    .line 434
    .line 435
    .line 436
    .line 437
    .line 438
    .line 439
    .line 440
    .line 441
    .line 442
    .line 443
    .line 444
    .line 445
    .line 446
    .line 447
    .line 448
    .line 449
    .line 450
    .line 451
    .line 452
    .line 453
    .line 454
    .line 455
    .line 456
    .line 457
    .line 458
    .line 459
    .line 460
    .line 461
    .line 462
    .line 463
    .line 464
    .line 465
    .line 466
    .line 467
    .line 468
    .line 469
    .line 470
    .line 471
    .line 472
    .line 473
    .line 474
    .line 475
    .line 476
    .line 477
    .line 478
    .line 479
    .line 480
    .line 481
    .line 482
    .line 483
    .line 484
    .line 485
    .line 486
    .line 487
    .line 488
    .line 489
    .line 490
    .line 491
    .line 492
    .line 493
    .line 494
    .line 495
    .line 496
    .line 497
    .line 498
    .line 499
    .line 500
    .line 501
    .line 502
    .line 503
    .line 504
    .line 505
    .line 506
    .line 507
    .line 508
    .line 509
    .line 510
    .line 511
    .line 512
    .line 513
    .line 514
    .line 515
    .line 516
    .line 517
    .line 518
    .line 519
    .line 520
    .line 521
    .line 522
    .line 523
    .line 524
    .line 525
    .line 526
    .line 527
    .line 528
    .line 529
    .line 530
    .line 531
    .line 532
    .line 533
    .line 534
    .line 535
    .line 536
    .line 537
    .line 538
    .line 539
    .line 540
    .line 541
    .line 542
    .line 543
    .line 544
    .line 545
    .line 546
    .line 547
    .line 548
    .line 549
    .line 550
    .line 551
    .line 552
    .line 553
    .line 554
    .line 555
    .line 556
    .line 557
    .line 558
    .line 559
    .line 560
    .line 561
    .line 562
    .line 563
    .line 564
    .line 565
    .line 566
    .line 567
    .line 568
    .line 569
    .line 570
    .line 571
    .line 572
    .line 573
    .line 574
    .line 575
    .line 576
    .line 577
    .line 578
    .line 579
    .line 580
    .line 581
    .line 582
    .line 583
    .line 584
    .line 585
    .line 586
    .line 587
    .line 588
    .line 589
    .line 590
    .line 591
    .line 592
    .line 593
    .line 594
    .line 595
    .line 596
    .line 597
    .line 598
    .line 599
    .line 600
    .line 601
    .line 602
    .line 603
    .line 604
    .line 605
    .line 606
    .line 607
    .line 608
    .line 609
    .line 610
    .line 611
    .line 612
    .line 613
    .line 614
    .line 615
    .line 616
    .line 617
    .line 618
    .line 619
    .line 620
    .line 621
    .line 622
    .line 623
    .line 624
    .line 625
    .line 626
    .line 627
    .line 628
    .line 629
    .line 630
    .line 631
    .line 632
    .line 633
    .line 634
    .line 635
    .line 636
    .line 637
    .line 638
    .line 639
    .line 640
    .line 641
    .line 642
    .line 643
    .line 644
    .line 645
    .line 646
    .line 647
    .line 648
    .line 649
    .line 650
    .line 651
    .line 652
    .line 653
    .line 654
    .line 655
    .line 656
    .line 657
    .line 658
    .line 659
    .line 660
    .line 661
    .line 662
    .line 663
    .line 664
    .line 665
    .line 666
    .line 667
    .line 668
    .line 669
    .line 670
    .line 671
    .line 672
    .line 673
    .line 674
    .line 675
    .line 676
    .line 677
    .line 678
    .line 679
    .line 680
    .line 681
    .line 682
    .line 683
    .line 684
    .line 685
    .line 686
    .line 687
    .line 688
    .line 689
    .line 690
    .line 691
    .line 692
    .line 693
    .line 694
    .line 695
    .line 696
    .line 697
    .line 698
    .line 699
    .line 700
    .line 701
    .line 702
    .line 703
    .line 704
    .line 705
    .line 706
    .line 707
    .line 708
    .line 709
    .line 710
    .line 711
    .line 712
    .line 713
    .line 714
    .line 715
    .line 716
    .line 717
    .line 718
    .line 719
    .line 720
    .line 721
    .line 722
    .line 723
    .line 724
    .line 725
    .line 726
    .line 727
    .line 728
    .line 729
    .line 730
    .line 731
    .line 732
    .line 733
    .line 734
    .line 735
    .line 736
    .line 737
    .line 738
    .line 739
    .line 740
    .line 741
    .line 742
    .line 743
    .line 744
    .line 745
    .line 746
    .line 747
    .line 748
    .line 749
    .line 750
    .line 751
    .line 752
    .line 753
    .line 754
    .line 755
    .line 756
    .line 757
    .line 758
    .line 759
    .line 760
    .line 761
    .line 762
    .line 763
    .line 764
    .line 765
    .line 766
    .line 767
    .line 768
    .line 769
    .line 770
    .line 771
    .line 772
    .line 773
    .line 774
    .line 775
    .line 776
    .line 777
    .line 778
    .line 779
    .line 780
    .line 781
    .line 782
    .line 783
    .line 784
    .line 785
    .line 786
    .line 787
    .line 788
    .line 789
    .line 790
    .line 791
    .line 792
    .line 793
    .line 794
    .line 795
    .line 796
    .line 797
    .line 798
    .line 799
    .line 800
    .line 801
    .line 802
    .line 803
    .line 804
    .line 805
    .line 806
    .line 807
    .line 808
    .line 809
    .line 810
    .line 811
    .line 812
    .line 813
    .line 814
    .line 815
    .line 816
    .line 817
    .line 818
    .line 819
    .line 820
    .line 821
    .line 822
    .line 823
    .line 824
    .line 825
    .line 826
    .line 827
    .line 828
    .line 829
    .line 830
    .line 831
    .line 832
    .line 833
    .line 834
    .line 835
    .line 836
    .line 837
    .line 838
    .line 839
    .line 840
    .line 841
    .line 842
    .line 843
    .line 844
    .line 845
    .line 846
    .line 847
    .line 848
    .line 849
    .line 850
    .line 851
    .line 852
    .line 853
    .line 854
    .line 855
    .line 856
    .line 857
    .line 858
    .line 859
    .line 860
    .line 861
    .line 862
    .line 863
    .line 864
    .line 865
    .line 866
    .line 867
    .line 868
    .line 869
    .line 870
    .line 871
    .line 872
    .line 873
    .line 874
    .line 875
    .line 876
    .line 877
    .line 878
    .line 879
    .line 880
    .line 881
    .line 882
    .line 883
    .line 884
    .line 885
    .line 886
    .line 887
    .line 888
    .line 889
    .line 890
    .line 891
    .line 892
    .line 893
    .line 894
    .line 895
    .line 896
    .line 897
    .line 898
    .line 899
    .line 900
    .line 901
    .line 902
    .line 903
    .line 904
    .line 905
    .line 906
    .line 907
    .line 908
    .line 909
    .line 910
    .line 911
    .line 912
    .line 913
    .line 914
    .line 915
    .line 916
    .line 917
    .line 918
    .line 919
    .line 920
    .line 921
    .line 922
    .line 923
    .line 924
    .line 925
    .line 926
    .line 927
    .line 928
    .line 929
    .line 930
    .line 931
    .line 932
    .line 933
    .line 934
    .line 935
    .line 936
    .line 937
    .line 938
    .line 939
    .line 940
    .line 941
    .line 942
    .line 943
    .line 944
    .line 945
    .line 946
    .line 947
    .line 948
    .line 949
    .line 950
    .line 951
    .line 952
    .line 953
    .line 954
    .line 955
    .line 956
    .line 957
    .line 958
    .line 959
    .line 960
    .line 961
    .line 962
    .line 963
    .line 964
    .line 965
    .line 966
    .line 967
    .line 968
    .line 969
    .line 970
    .line 971
    .line 972
    .line 973
    .line 974
    .line 975
    .line 976
    .line 977
    .line 978
    .line 979
    .line 980
    .line 981
    .line 982
    .line 983
    .line 984
    .line 985
    .line 986
    .line 987
    .line 988
    .line 989
    .line 990
    .line 991
    .line 992
    .line 993
    .line 994
    .line 995
    .line 996
    .line 997
    .line 998
    .line 999
    .line 1000
    .line 1001
    .line 1002
    .line 1003
    .line 1004
    .line 1005
    .line 1006
    .line 1007
    .line 1008
    .line 1009
    .line 1010
    .line 1011
    .line 1012
    .line 1013
    .line 1014
    .line 1015
    .line 1016
    .line 1017
    .line 1018
    .line 1019
    .line 1020
    .line 1021
    .line 1022
    .line 1023
    .line 1024
    .line 1025
    .line 1026
    .line 1027
    .line 1028
    .line 1029
    .line 1030
    .line 1031
    .line 1032
    .line 1033
    .line 1034
    .line 1035
    .line 1036
    .line 1037
    .line 1038
.end method

.method public X0(Landroidx/recyclerview/widget/RecyclerView$s;Landroidx/recyclerview/widget/RecyclerView$x;Landroidx/recyclerview/widget/LinearLayoutManager$a;I)V
    .locals 0

    return-void
.end method

.method public final Y0(Landroidx/recyclerview/widget/RecyclerView$s;Landroidx/recyclerview/widget/LinearLayoutManager$c;)V
    .locals 5

    .line 1
    iget-boolean v0, p2, Landroidx/recyclerview/widget/LinearLayoutManager$c;->a:Z

    .line 2
    .line 3
    if-eqz v0, :cond_e

    .line 4
    .line 5
    iget-boolean v0, p2, Landroidx/recyclerview/widget/LinearLayoutManager$c;->l:Z

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    goto/16 :goto_8

    .line 10
    .line 11
    :cond_0
    iget v0, p2, Landroidx/recyclerview/widget/LinearLayoutManager$c;->g:I

    .line 12
    .line 13
    iget v1, p2, Landroidx/recyclerview/widget/LinearLayoutManager$c;->i:I

    .line 14
    .line 15
    iget p2, p2, Landroidx/recyclerview/widget/LinearLayoutManager$c;->f:I

    .line 16
    .line 17
    const/4 v2, 0x0

    .line 18
    const/4 v3, -0x1

    .line 19
    if-ne p2, v3, :cond_7

    .line 20
    .line 21
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$l;->w()I

    .line 22
    .line 23
    .line 24
    move-result p2

    .line 25
    if-gez v0, :cond_1

    .line 26
    .line 27
    goto/16 :goto_8

    .line 28
    .line 29
    :cond_1
    iget-object v4, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->r:Landroidx/recyclerview/widget/s;

    .line 30
    .line 31
    invoke-virtual {v4}, Landroidx/recyclerview/widget/s;->f()I

    .line 32
    .line 33
    .line 34
    move-result v4

    .line 35
    sub-int/2addr v4, v0

    .line 36
    add-int/2addr v4, v1

    .line 37
    iget-boolean v0, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->u:Z

    .line 38
    .line 39
    if-eqz v0, :cond_4

    .line 40
    .line 41
    move v0, v2

    .line 42
    :goto_0
    if-ge v0, p2, :cond_e

    .line 43
    .line 44
    invoke-virtual {p0, v0}, Landroidx/recyclerview/widget/RecyclerView$l;->v(I)Landroid/view/View;

    .line 45
    .line 46
    .line 47
    move-result-object v1

    .line 48
    iget-object v3, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->r:Landroidx/recyclerview/widget/s;

    .line 49
    .line 50
    invoke-virtual {v3, v1}, Landroidx/recyclerview/widget/s;->e(Landroid/view/View;)I

    .line 51
    .line 52
    .line 53
    move-result v3

    .line 54
    if-lt v3, v4, :cond_3

    .line 55
    .line 56
    iget-object v3, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->r:Landroidx/recyclerview/widget/s;

    .line 57
    .line 58
    invoke-virtual {v3, v1}, Landroidx/recyclerview/widget/s;->n(Landroid/view/View;)I

    .line 59
    .line 60
    .line 61
    move-result v1

    .line 62
    if-ge v1, v4, :cond_2

    .line 63
    .line 64
    goto :goto_1

    .line 65
    :cond_2
    add-int/lit8 v0, v0, 0x1

    .line 66
    .line 67
    goto :goto_0

    .line 68
    :cond_3
    :goto_1
    invoke-virtual {p0, p1, v2, v0}, Landroidx/recyclerview/widget/LinearLayoutManager;->Z0(Landroidx/recyclerview/widget/RecyclerView$s;II)V

    .line 69
    .line 70
    .line 71
    goto/16 :goto_8

    .line 72
    .line 73
    :cond_4
    add-int/2addr p2, v3

    .line 74
    move v0, p2

    .line 75
    :goto_2
    if-ltz v0, :cond_e

    .line 76
    .line 77
    invoke-virtual {p0, v0}, Landroidx/recyclerview/widget/RecyclerView$l;->v(I)Landroid/view/View;

    .line 78
    .line 79
    .line 80
    move-result-object v1

    .line 81
    iget-object v2, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->r:Landroidx/recyclerview/widget/s;

    .line 82
    .line 83
    invoke-virtual {v2, v1}, Landroidx/recyclerview/widget/s;->e(Landroid/view/View;)I

    .line 84
    .line 85
    .line 86
    move-result v2

    .line 87
    if-lt v2, v4, :cond_6

    .line 88
    .line 89
    iget-object v2, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->r:Landroidx/recyclerview/widget/s;

    .line 90
    .line 91
    invoke-virtual {v2, v1}, Landroidx/recyclerview/widget/s;->n(Landroid/view/View;)I

    .line 92
    .line 93
    .line 94
    move-result v1

    .line 95
    if-ge v1, v4, :cond_5

    .line 96
    .line 97
    goto :goto_3

    .line 98
    :cond_5
    add-int/lit8 v0, v0, -0x1

    .line 99
    .line 100
    goto :goto_2

    .line 101
    :cond_6
    :goto_3
    invoke-virtual {p0, p1, p2, v0}, Landroidx/recyclerview/widget/LinearLayoutManager;->Z0(Landroidx/recyclerview/widget/RecyclerView$s;II)V

    .line 102
    .line 103
    .line 104
    goto :goto_8

    .line 105
    :cond_7
    if-gez v0, :cond_8

    .line 106
    .line 107
    goto :goto_8

    .line 108
    :cond_8
    sub-int/2addr v0, v1

    .line 109
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$l;->w()I

    .line 110
    .line 111
    .line 112
    move-result p2

    .line 113
    iget-boolean v1, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->u:Z

    .line 114
    .line 115
    if-eqz v1, :cond_b

    .line 116
    .line 117
    add-int/2addr p2, v3

    .line 118
    move v1, p2

    .line 119
    :goto_4
    if-ltz v1, :cond_e

    .line 120
    .line 121
    invoke-virtual {p0, v1}, Landroidx/recyclerview/widget/RecyclerView$l;->v(I)Landroid/view/View;

    .line 122
    .line 123
    .line 124
    move-result-object v2

    .line 125
    iget-object v3, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->r:Landroidx/recyclerview/widget/s;

    .line 126
    .line 127
    invoke-virtual {v3, v2}, Landroidx/recyclerview/widget/s;->b(Landroid/view/View;)I

    .line 128
    .line 129
    .line 130
    move-result v3

    .line 131
    if-gt v3, v0, :cond_a

    .line 132
    .line 133
    iget-object v3, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->r:Landroidx/recyclerview/widget/s;

    .line 134
    .line 135
    invoke-virtual {v3, v2}, Landroidx/recyclerview/widget/s;->m(Landroid/view/View;)I

    .line 136
    .line 137
    .line 138
    move-result v2

    .line 139
    if-le v2, v0, :cond_9

    .line 140
    .line 141
    goto :goto_5

    .line 142
    :cond_9
    add-int/lit8 v1, v1, -0x1

    .line 143
    .line 144
    goto :goto_4

    .line 145
    :cond_a
    :goto_5
    invoke-virtual {p0, p1, p2, v1}, Landroidx/recyclerview/widget/LinearLayoutManager;->Z0(Landroidx/recyclerview/widget/RecyclerView$s;II)V

    .line 146
    .line 147
    .line 148
    goto :goto_8

    .line 149
    :cond_b
    move v1, v2

    .line 150
    :goto_6
    if-ge v1, p2, :cond_e

    .line 151
    .line 152
    invoke-virtual {p0, v1}, Landroidx/recyclerview/widget/RecyclerView$l;->v(I)Landroid/view/View;

    .line 153
    .line 154
    .line 155
    move-result-object v3

    .line 156
    iget-object v4, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->r:Landroidx/recyclerview/widget/s;

    .line 157
    .line 158
    invoke-virtual {v4, v3}, Landroidx/recyclerview/widget/s;->b(Landroid/view/View;)I

    .line 159
    .line 160
    .line 161
    move-result v4

    .line 162
    if-gt v4, v0, :cond_d

    .line 163
    .line 164
    iget-object v4, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->r:Landroidx/recyclerview/widget/s;

    .line 165
    .line 166
    invoke-virtual {v4, v3}, Landroidx/recyclerview/widget/s;->m(Landroid/view/View;)I

    .line 167
    .line 168
    .line 169
    move-result v3

    .line 170
    if-le v3, v0, :cond_c

    .line 171
    .line 172
    goto :goto_7

    .line 173
    :cond_c
    add-int/lit8 v1, v1, 0x1

    .line 174
    .line 175
    goto :goto_6

    .line 176
    :cond_d
    :goto_7
    invoke-virtual {p0, p1, v2, v1}, Landroidx/recyclerview/widget/LinearLayoutManager;->Z0(Landroidx/recyclerview/widget/RecyclerView$s;II)V

    .line 177
    .line 178
    .line 179
    :cond_e
    :goto_8
    return-void
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

.method public final Z0(Landroidx/recyclerview/widget/RecyclerView$s;II)V
    .locals 1

    if-ne p2, p3, :cond_0

    return-void

    :cond_0
    if-le p3, p2, :cond_1

    :goto_0
    add-int/lit8 p3, p3, -0x1

    if-lt p3, p2, :cond_2

    invoke-virtual {p0, p3}, Landroidx/recyclerview/widget/RecyclerView$l;->v(I)Landroid/view/View;

    move-result-object v0

    invoke-virtual {p0, p3}, Landroidx/recyclerview/widget/RecyclerView$l;->l0(I)V

    invoke-virtual {p1, v0}, Landroidx/recyclerview/widget/RecyclerView$s;->f(Landroid/view/View;)V

    goto :goto_0

    :cond_1
    :goto_1
    if-le p2, p3, :cond_2

    invoke-virtual {p0, p2}, Landroidx/recyclerview/widget/RecyclerView$l;->v(I)Landroid/view/View;

    move-result-object v0

    invoke-virtual {p0, p2}, Landroidx/recyclerview/widget/RecyclerView$l;->l0(I)V

    invoke-virtual {p1, v0}, Landroidx/recyclerview/widget/RecyclerView$s;->f(Landroid/view/View;)V

    add-int/lit8 p2, p2, -0x1

    goto :goto_1

    :cond_2
    return-void
.end method

.method public final a(I)Landroid/graphics/PointF;
    .locals 3

    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$l;->w()I

    move-result v0

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return-object p1

    :cond_0
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Landroidx/recyclerview/widget/RecyclerView$l;->v(I)Landroid/view/View;

    move-result-object v1

    invoke-static {v1}, Landroidx/recyclerview/widget/RecyclerView$l;->G(Landroid/view/View;)I

    move-result v1

    const/4 v2, 0x1

    if-ge p1, v1, :cond_1

    move v0, v2

    :cond_1
    iget-boolean p1, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->u:Z

    if-eq v0, p1, :cond_2

    const/4 v2, -0x1

    :cond_2
    iget p1, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->p:I

    const/4 v0, 0x0

    if-nez p1, :cond_3

    new-instance p1, Landroid/graphics/PointF;

    int-to-float v1, v2

    invoke-direct {p1, v1, v0}, Landroid/graphics/PointF;-><init>(FF)V

    return-object p1

    :cond_3
    new-instance p1, Landroid/graphics/PointF;

    int-to-float v1, v2

    invoke-direct {p1, v0, v1}, Landroid/graphics/PointF;-><init>(FF)V

    return-object p1
.end method

.method public final a1()V
    .locals 2

    iget v0, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->p:I

    const/4 v1, 0x1

    if-eq v0, v1, :cond_1

    invoke-virtual {p0}, Landroidx/recyclerview/widget/LinearLayoutManager;->V0()Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    iget-boolean v0, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->t:Z

    xor-int/2addr v0, v1

    goto :goto_1

    :cond_1
    :goto_0
    iget-boolean v0, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->t:Z

    :goto_1
    iput-boolean v0, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->u:Z

    return-void
.end method

.method public final b1(ILandroidx/recyclerview/widget/RecyclerView$s;Landroidx/recyclerview/widget/RecyclerView$x;)I
    .locals 5

    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$l;->w()I

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_4

    if-nez p1, :cond_0

    goto :goto_1

    :cond_0
    invoke-virtual {p0}, Landroidx/recyclerview/widget/LinearLayoutManager;->I0()V

    iget-object v0, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->q:Landroidx/recyclerview/widget/LinearLayoutManager$c;

    const/4 v2, 0x1

    iput-boolean v2, v0, Landroidx/recyclerview/widget/LinearLayoutManager$c;->a:Z

    if-lez p1, :cond_1

    move v0, v2

    goto :goto_0

    :cond_1
    const/4 v0, -0x1

    :goto_0
    invoke-static {p1}, Ljava/lang/Math;->abs(I)I

    move-result v3

    invoke-virtual {p0, v0, v3, v2, p3}, Landroidx/recyclerview/widget/LinearLayoutManager;->e1(IIZLandroidx/recyclerview/widget/RecyclerView$x;)V

    iget-object v2, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->q:Landroidx/recyclerview/widget/LinearLayoutManager$c;

    iget v4, v2, Landroidx/recyclerview/widget/LinearLayoutManager$c;->g:I

    invoke-virtual {p0, p2, v2, p3, v1}, Landroidx/recyclerview/widget/LinearLayoutManager;->J0(Landroidx/recyclerview/widget/RecyclerView$s;Landroidx/recyclerview/widget/LinearLayoutManager$c;Landroidx/recyclerview/widget/RecyclerView$x;Z)I

    move-result p2

    add-int/2addr p2, v4

    if-gez p2, :cond_2

    return v1

    :cond_2
    if-le v3, p2, :cond_3

    mul-int p1, v0, p2

    :cond_3
    iget-object p2, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->r:Landroidx/recyclerview/widget/s;

    neg-int p3, p1

    invoke-virtual {p2, p3}, Landroidx/recyclerview/widget/s;->o(I)V

    iget-object p2, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->q:Landroidx/recyclerview/widget/LinearLayoutManager$c;

    iput p1, p2, Landroidx/recyclerview/widget/LinearLayoutManager$c;->j:I

    return p1

    :cond_4
    :goto_1
    return v1
.end method

.method public final c(Ljava/lang/String;)V
    .locals 1

    iget-object v0, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->z:Landroidx/recyclerview/widget/LinearLayoutManager$d;

    if-nez v0, :cond_0

    invoke-super {p0, p1}, Landroidx/recyclerview/widget/RecyclerView$l;->c(Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method public c0(Landroidx/recyclerview/widget/RecyclerView$s;Landroidx/recyclerview/widget/RecyclerView$x;)V
    .locals 17

    .line 1
    move-object/from16 v6, p0

    .line 2
    .line 3
    move-object/from16 v7, p1

    .line 4
    .line 5
    move-object/from16 v8, p2

    .line 6
    .line 7
    iget-object v0, v6, Landroidx/recyclerview/widget/LinearLayoutManager;->z:Landroidx/recyclerview/widget/LinearLayoutManager$d;

    .line 8
    .line 9
    const/4 v9, -0x1

    .line 10
    if-nez v0, :cond_0

    .line 11
    .line 12
    iget v0, v6, Landroidx/recyclerview/widget/LinearLayoutManager;->x:I

    .line 13
    .line 14
    if-eq v0, v9, :cond_1

    .line 15
    .line 16
    :cond_0
    invoke-virtual/range {p2 .. p2}, Landroidx/recyclerview/widget/RecyclerView$x;->b()I

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    if-nez v0, :cond_1

    .line 21
    .line 22
    invoke-virtual/range {p0 .. p1}, Landroidx/recyclerview/widget/RecyclerView$l;->i0(Landroidx/recyclerview/widget/RecyclerView$s;)V

    .line 23
    .line 24
    .line 25
    return-void

    .line 26
    :cond_1
    iget-object v0, v6, Landroidx/recyclerview/widget/LinearLayoutManager;->z:Landroidx/recyclerview/widget/LinearLayoutManager$d;

    .line 27
    .line 28
    const/4 v10, 0x1

    .line 29
    const/4 v11, 0x0

    .line 30
    if-eqz v0, :cond_3

    .line 31
    .line 32
    iget v0, v0, Landroidx/recyclerview/widget/LinearLayoutManager$d;->b:I

    .line 33
    .line 34
    if-ltz v0, :cond_2

    .line 35
    .line 36
    move v1, v10

    .line 37
    goto :goto_0

    .line 38
    :cond_2
    move v1, v11

    .line 39
    :goto_0
    if-eqz v1, :cond_3

    .line 40
    .line 41
    iput v0, v6, Landroidx/recyclerview/widget/LinearLayoutManager;->x:I

    .line 42
    .line 43
    :cond_3
    invoke-virtual/range {p0 .. p0}, Landroidx/recyclerview/widget/LinearLayoutManager;->I0()V

    .line 44
    .line 45
    .line 46
    iget-object v0, v6, Landroidx/recyclerview/widget/LinearLayoutManager;->q:Landroidx/recyclerview/widget/LinearLayoutManager$c;

    .line 47
    .line 48
    iput-boolean v11, v0, Landroidx/recyclerview/widget/LinearLayoutManager$c;->a:Z

    .line 49
    .line 50
    invoke-virtual/range {p0 .. p0}, Landroidx/recyclerview/widget/LinearLayoutManager;->a1()V

    .line 51
    .line 52
    .line 53
    iget-object v0, v6, Landroidx/recyclerview/widget/RecyclerView$l;->b:Landroidx/recyclerview/widget/RecyclerView;

    .line 54
    .line 55
    if-nez v0, :cond_5

    .line 56
    .line 57
    :cond_4
    :goto_1
    const/4 v0, 0x0

    .line 58
    goto :goto_2

    .line 59
    :cond_5
    invoke-virtual {v0}, Landroid/view/ViewGroup;->getFocusedChild()Landroid/view/View;

    .line 60
    .line 61
    .line 62
    move-result-object v0

    .line 63
    if-eqz v0, :cond_4

    .line 64
    .line 65
    iget-object v1, v6, Landroidx/recyclerview/widget/RecyclerView$l;->a:Landroidx/recyclerview/widget/b;

    .line 66
    .line 67
    invoke-virtual {v1, v0}, Landroidx/recyclerview/widget/b;->j(Landroid/view/View;)Z

    .line 68
    .line 69
    .line 70
    move-result v1

    .line 71
    if-eqz v1, :cond_6

    .line 72
    .line 73
    goto :goto_1

    .line 74
    :cond_6
    :goto_2
    iget-object v13, v6, Landroidx/recyclerview/widget/LinearLayoutManager;->A:Landroidx/recyclerview/widget/LinearLayoutManager$a;

    .line 75
    .line 76
    iget-boolean v1, v13, Landroidx/recyclerview/widget/LinearLayoutManager$a;->e:Z

    .line 77
    .line 78
    const/high16 v14, -0x80000000

    .line 79
    .line 80
    if-eqz v1, :cond_9

    .line 81
    .line 82
    iget v1, v6, Landroidx/recyclerview/widget/LinearLayoutManager;->x:I

    .line 83
    .line 84
    if-ne v1, v9, :cond_9

    .line 85
    .line 86
    iget-object v1, v6, Landroidx/recyclerview/widget/LinearLayoutManager;->z:Landroidx/recyclerview/widget/LinearLayoutManager$d;

    .line 87
    .line 88
    if-eqz v1, :cond_7

    .line 89
    .line 90
    goto :goto_3

    .line 91
    :cond_7
    if-eqz v0, :cond_30

    .line 92
    .line 93
    iget-object v1, v6, Landroidx/recyclerview/widget/LinearLayoutManager;->r:Landroidx/recyclerview/widget/s;

    .line 94
    .line 95
    invoke-virtual {v1, v0}, Landroidx/recyclerview/widget/s;->e(Landroid/view/View;)I

    .line 96
    .line 97
    .line 98
    move-result v1

    .line 99
    iget-object v2, v6, Landroidx/recyclerview/widget/LinearLayoutManager;->r:Landroidx/recyclerview/widget/s;

    .line 100
    .line 101
    invoke-virtual {v2}, Landroidx/recyclerview/widget/s;->g()I

    .line 102
    .line 103
    .line 104
    move-result v2

    .line 105
    if-ge v1, v2, :cond_8

    .line 106
    .line 107
    iget-object v1, v6, Landroidx/recyclerview/widget/LinearLayoutManager;->r:Landroidx/recyclerview/widget/s;

    .line 108
    .line 109
    invoke-virtual {v1, v0}, Landroidx/recyclerview/widget/s;->b(Landroid/view/View;)I

    .line 110
    .line 111
    .line 112
    move-result v1

    .line 113
    iget-object v2, v6, Landroidx/recyclerview/widget/LinearLayoutManager;->r:Landroidx/recyclerview/widget/s;

    .line 114
    .line 115
    invoke-virtual {v2}, Landroidx/recyclerview/widget/s;->k()I

    .line 116
    .line 117
    .line 118
    move-result v2

    .line 119
    if-gt v1, v2, :cond_30

    .line 120
    .line 121
    :cond_8
    invoke-static {v0}, Landroidx/recyclerview/widget/RecyclerView$l;->G(Landroid/view/View;)I

    .line 122
    .line 123
    .line 124
    move-result v1

    .line 125
    invoke-virtual {v13, v0, v1}, Landroidx/recyclerview/widget/LinearLayoutManager$a;->b(Landroid/view/View;I)V

    .line 126
    .line 127
    .line 128
    goto/16 :goto_1f

    .line 129
    .line 130
    :cond_9
    :goto_3
    invoke-virtual {v13}, Landroidx/recyclerview/widget/LinearLayoutManager$a;->c()V

    .line 131
    .line 132
    .line 133
    iget-boolean v0, v6, Landroidx/recyclerview/widget/LinearLayoutManager;->u:Z

    .line 134
    .line 135
    iget-boolean v1, v6, Landroidx/recyclerview/widget/LinearLayoutManager;->v:Z

    .line 136
    .line 137
    xor-int/2addr v0, v1

    .line 138
    iput-boolean v0, v13, Landroidx/recyclerview/widget/LinearLayoutManager$a;->d:Z

    .line 139
    .line 140
    iget-boolean v0, v8, Landroidx/recyclerview/widget/RecyclerView$x;->g:Z

    .line 141
    .line 142
    if-nez v0, :cond_1c

    .line 143
    .line 144
    iget v0, v6, Landroidx/recyclerview/widget/LinearLayoutManager;->x:I

    .line 145
    .line 146
    if-ne v0, v9, :cond_a

    .line 147
    .line 148
    goto/16 :goto_10

    .line 149
    .line 150
    :cond_a
    if-ltz v0, :cond_1b

    .line 151
    .line 152
    invoke-virtual/range {p2 .. p2}, Landroidx/recyclerview/widget/RecyclerView$x;->b()I

    .line 153
    .line 154
    .line 155
    move-result v1

    .line 156
    if-lt v0, v1, :cond_b

    .line 157
    .line 158
    goto/16 :goto_f

    .line 159
    .line 160
    :cond_b
    iget v0, v6, Landroidx/recyclerview/widget/LinearLayoutManager;->x:I

    .line 161
    .line 162
    iput v0, v13, Landroidx/recyclerview/widget/LinearLayoutManager$a;->b:I

    .line 163
    .line 164
    iget-object v1, v6, Landroidx/recyclerview/widget/LinearLayoutManager;->z:Landroidx/recyclerview/widget/LinearLayoutManager$d;

    .line 165
    .line 166
    if-eqz v1, :cond_e

    .line 167
    .line 168
    iget v2, v1, Landroidx/recyclerview/widget/LinearLayoutManager$d;->b:I

    .line 169
    .line 170
    if-ltz v2, :cond_c

    .line 171
    .line 172
    move v2, v10

    .line 173
    goto :goto_4

    .line 174
    :cond_c
    move v2, v11

    .line 175
    :goto_4
    if-eqz v2, :cond_e

    .line 176
    .line 177
    iget-boolean v0, v1, Landroidx/recyclerview/widget/LinearLayoutManager$d;->d:Z

    .line 178
    .line 179
    iput-boolean v0, v13, Landroidx/recyclerview/widget/LinearLayoutManager$a;->d:Z

    .line 180
    .line 181
    if-eqz v0, :cond_d

    .line 182
    .line 183
    iget-object v0, v6, Landroidx/recyclerview/widget/LinearLayoutManager;->r:Landroidx/recyclerview/widget/s;

    .line 184
    .line 185
    invoke-virtual {v0}, Landroidx/recyclerview/widget/s;->g()I

    .line 186
    .line 187
    .line 188
    move-result v0

    .line 189
    iget-object v1, v6, Landroidx/recyclerview/widget/LinearLayoutManager;->z:Landroidx/recyclerview/widget/LinearLayoutManager$d;

    .line 190
    .line 191
    iget v1, v1, Landroidx/recyclerview/widget/LinearLayoutManager$d;->c:I

    .line 192
    .line 193
    goto/16 :goto_b

    .line 194
    .line 195
    :cond_d
    iget-object v0, v6, Landroidx/recyclerview/widget/LinearLayoutManager;->r:Landroidx/recyclerview/widget/s;

    .line 196
    .line 197
    invoke-virtual {v0}, Landroidx/recyclerview/widget/s;->k()I

    .line 198
    .line 199
    .line 200
    move-result v0

    .line 201
    iget-object v1, v6, Landroidx/recyclerview/widget/LinearLayoutManager;->z:Landroidx/recyclerview/widget/LinearLayoutManager$d;

    .line 202
    .line 203
    iget v1, v1, Landroidx/recyclerview/widget/LinearLayoutManager$d;->c:I

    .line 204
    .line 205
    goto/16 :goto_c

    .line 206
    .line 207
    :cond_e
    iget v1, v6, Landroidx/recyclerview/widget/LinearLayoutManager;->y:I

    .line 208
    .line 209
    if-ne v1, v14, :cond_19

    .line 210
    .line 211
    invoke-virtual {v6, v0}, Landroidx/recyclerview/widget/LinearLayoutManager;->q(I)Landroid/view/View;

    .line 212
    .line 213
    .line 214
    move-result-object v0

    .line 215
    if-eqz v0, :cond_14

    .line 216
    .line 217
    iget-object v1, v6, Landroidx/recyclerview/widget/LinearLayoutManager;->r:Landroidx/recyclerview/widget/s;

    .line 218
    .line 219
    invoke-virtual {v1, v0}, Landroidx/recyclerview/widget/s;->c(Landroid/view/View;)I

    .line 220
    .line 221
    .line 222
    move-result v1

    .line 223
    iget-object v2, v6, Landroidx/recyclerview/widget/LinearLayoutManager;->r:Landroidx/recyclerview/widget/s;

    .line 224
    .line 225
    invoke-virtual {v2}, Landroidx/recyclerview/widget/s;->l()I

    .line 226
    .line 227
    .line 228
    move-result v2

    .line 229
    if-le v1, v2, :cond_f

    .line 230
    .line 231
    goto/16 :goto_9

    .line 232
    .line 233
    :cond_f
    iget-object v1, v6, Landroidx/recyclerview/widget/LinearLayoutManager;->r:Landroidx/recyclerview/widget/s;

    .line 234
    .line 235
    invoke-virtual {v1, v0}, Landroidx/recyclerview/widget/s;->e(Landroid/view/View;)I

    .line 236
    .line 237
    .line 238
    move-result v1

    .line 239
    iget-object v2, v6, Landroidx/recyclerview/widget/LinearLayoutManager;->r:Landroidx/recyclerview/widget/s;

    .line 240
    .line 241
    invoke-virtual {v2}, Landroidx/recyclerview/widget/s;->k()I

    .line 242
    .line 243
    .line 244
    move-result v2

    .line 245
    sub-int/2addr v1, v2

    .line 246
    if-gez v1, :cond_10

    .line 247
    .line 248
    iget-object v0, v6, Landroidx/recyclerview/widget/LinearLayoutManager;->r:Landroidx/recyclerview/widget/s;

    .line 249
    .line 250
    invoke-virtual {v0}, Landroidx/recyclerview/widget/s;->k()I

    .line 251
    .line 252
    .line 253
    move-result v0

    .line 254
    iput v0, v13, Landroidx/recyclerview/widget/LinearLayoutManager$a;->c:I

    .line 255
    .line 256
    iput-boolean v11, v13, Landroidx/recyclerview/widget/LinearLayoutManager$a;->d:Z

    .line 257
    .line 258
    goto/16 :goto_e

    .line 259
    .line 260
    :cond_10
    iget-object v1, v6, Landroidx/recyclerview/widget/LinearLayoutManager;->r:Landroidx/recyclerview/widget/s;

    .line 261
    .line 262
    invoke-virtual {v1}, Landroidx/recyclerview/widget/s;->g()I

    .line 263
    .line 264
    .line 265
    move-result v1

    .line 266
    iget-object v2, v6, Landroidx/recyclerview/widget/LinearLayoutManager;->r:Landroidx/recyclerview/widget/s;

    .line 267
    .line 268
    invoke-virtual {v2, v0}, Landroidx/recyclerview/widget/s;->b(Landroid/view/View;)I

    .line 269
    .line 270
    .line 271
    move-result v2

    .line 272
    sub-int/2addr v1, v2

    .line 273
    if-gez v1, :cond_11

    .line 274
    .line 275
    iget-object v0, v6, Landroidx/recyclerview/widget/LinearLayoutManager;->r:Landroidx/recyclerview/widget/s;

    .line 276
    .line 277
    invoke-virtual {v0}, Landroidx/recyclerview/widget/s;->g()I

    .line 278
    .line 279
    .line 280
    move-result v0

    .line 281
    iput v0, v13, Landroidx/recyclerview/widget/LinearLayoutManager$a;->c:I

    .line 282
    .line 283
    iput-boolean v10, v13, Landroidx/recyclerview/widget/LinearLayoutManager$a;->d:Z

    .line 284
    .line 285
    goto/16 :goto_e

    .line 286
    .line 287
    :cond_11
    iget-boolean v1, v13, Landroidx/recyclerview/widget/LinearLayoutManager$a;->d:Z

    .line 288
    .line 289
    if-eqz v1, :cond_13

    .line 290
    .line 291
    iget-object v1, v6, Landroidx/recyclerview/widget/LinearLayoutManager;->r:Landroidx/recyclerview/widget/s;

    .line 292
    .line 293
    invoke-virtual {v1, v0}, Landroidx/recyclerview/widget/s;->b(Landroid/view/View;)I

    .line 294
    .line 295
    .line 296
    move-result v0

    .line 297
    iget-object v1, v6, Landroidx/recyclerview/widget/LinearLayoutManager;->r:Landroidx/recyclerview/widget/s;

    .line 298
    .line 299
    iget v2, v1, Landroidx/recyclerview/widget/s;->b:I

    .line 300
    .line 301
    if-ne v14, v2, :cond_12

    .line 302
    .line 303
    move v2, v11

    .line 304
    goto :goto_5

    .line 305
    :cond_12
    invoke-virtual {v1}, Landroidx/recyclerview/widget/s;->l()I

    .line 306
    .line 307
    .line 308
    move-result v2

    .line 309
    iget v1, v1, Landroidx/recyclerview/widget/s;->b:I

    .line 310
    .line 311
    sub-int/2addr v2, v1

    .line 312
    :goto_5
    add-int/2addr v2, v0

    .line 313
    goto :goto_6

    .line 314
    :cond_13
    iget-object v1, v6, Landroidx/recyclerview/widget/LinearLayoutManager;->r:Landroidx/recyclerview/widget/s;

    .line 315
    .line 316
    invoke-virtual {v1, v0}, Landroidx/recyclerview/widget/s;->e(Landroid/view/View;)I

    .line 317
    .line 318
    .line 319
    move-result v2

    .line 320
    :goto_6
    iput v2, v13, Landroidx/recyclerview/widget/LinearLayoutManager$a;->c:I

    .line 321
    .line 322
    goto :goto_e

    .line 323
    :cond_14
    invoke-virtual/range {p0 .. p0}, Landroidx/recyclerview/widget/RecyclerView$l;->w()I

    .line 324
    .line 325
    .line 326
    move-result v0

    .line 327
    if-lez v0, :cond_17

    .line 328
    .line 329
    invoke-virtual {v6, v11}, Landroidx/recyclerview/widget/RecyclerView$l;->v(I)Landroid/view/View;

    .line 330
    .line 331
    .line 332
    move-result-object v0

    .line 333
    invoke-static {v0}, Landroidx/recyclerview/widget/RecyclerView$l;->G(Landroid/view/View;)I

    .line 334
    .line 335
    .line 336
    move-result v0

    .line 337
    iget v1, v6, Landroidx/recyclerview/widget/LinearLayoutManager;->x:I

    .line 338
    .line 339
    if-ge v1, v0, :cond_15

    .line 340
    .line 341
    move v0, v10

    .line 342
    goto :goto_7

    .line 343
    :cond_15
    move v0, v11

    .line 344
    :goto_7
    iget-boolean v1, v6, Landroidx/recyclerview/widget/LinearLayoutManager;->u:Z

    .line 345
    .line 346
    if-ne v0, v1, :cond_16

    .line 347
    .line 348
    move v0, v10

    .line 349
    goto :goto_8

    .line 350
    :cond_16
    move v0, v11

    .line 351
    :goto_8
    iput-boolean v0, v13, Landroidx/recyclerview/widget/LinearLayoutManager$a;->d:Z

    .line 352
    .line 353
    :cond_17
    :goto_9
    iget-boolean v0, v13, Landroidx/recyclerview/widget/LinearLayoutManager$a;->d:Z

    .line 354
    .line 355
    if-eqz v0, :cond_18

    .line 356
    .line 357
    iget-object v0, v13, Landroidx/recyclerview/widget/LinearLayoutManager$a;->a:Landroidx/recyclerview/widget/s;

    .line 358
    .line 359
    invoke-virtual {v0}, Landroidx/recyclerview/widget/s;->g()I

    .line 360
    .line 361
    .line 362
    move-result v0

    .line 363
    goto :goto_a

    .line 364
    :cond_18
    iget-object v0, v13, Landroidx/recyclerview/widget/LinearLayoutManager$a;->a:Landroidx/recyclerview/widget/s;

    .line 365
    .line 366
    invoke-virtual {v0}, Landroidx/recyclerview/widget/s;->k()I

    .line 367
    .line 368
    .line 369
    move-result v0

    .line 370
    :goto_a
    iput v0, v13, Landroidx/recyclerview/widget/LinearLayoutManager$a;->c:I

    .line 371
    .line 372
    goto :goto_e

    .line 373
    :cond_19
    iget-boolean v0, v6, Landroidx/recyclerview/widget/LinearLayoutManager;->u:Z

    .line 374
    .line 375
    iput-boolean v0, v13, Landroidx/recyclerview/widget/LinearLayoutManager$a;->d:Z

    .line 376
    .line 377
    if-eqz v0, :cond_1a

    .line 378
    .line 379
    iget-object v0, v6, Landroidx/recyclerview/widget/LinearLayoutManager;->r:Landroidx/recyclerview/widget/s;

    .line 380
    .line 381
    invoke-virtual {v0}, Landroidx/recyclerview/widget/s;->g()I

    .line 382
    .line 383
    .line 384
    move-result v0

    .line 385
    iget v1, v6, Landroidx/recyclerview/widget/LinearLayoutManager;->y:I

    .line 386
    .line 387
    :goto_b
    sub-int/2addr v0, v1

    .line 388
    goto :goto_d

    .line 389
    :cond_1a
    iget-object v0, v6, Landroidx/recyclerview/widget/LinearLayoutManager;->r:Landroidx/recyclerview/widget/s;

    .line 390
    .line 391
    invoke-virtual {v0}, Landroidx/recyclerview/widget/s;->k()I

    .line 392
    .line 393
    .line 394
    move-result v0

    .line 395
    iget v1, v6, Landroidx/recyclerview/widget/LinearLayoutManager;->y:I

    .line 396
    .line 397
    :goto_c
    add-int/2addr v0, v1

    .line 398
    :goto_d
    iput v0, v13, Landroidx/recyclerview/widget/LinearLayoutManager$a;->c:I

    .line 399
    .line 400
    :goto_e
    move v0, v10

    .line 401
    goto :goto_11

    .line 402
    :cond_1b
    :goto_f
    iput v9, v6, Landroidx/recyclerview/widget/LinearLayoutManager;->x:I

    .line 403
    .line 404
    iput v14, v6, Landroidx/recyclerview/widget/LinearLayoutManager;->y:I

    .line 405
    .line 406
    :cond_1c
    :goto_10
    move v0, v11

    .line 407
    :goto_11
    if-eqz v0, :cond_1d

    .line 408
    .line 409
    goto/16 :goto_1e

    .line 410
    .line 411
    :cond_1d
    invoke-virtual/range {p0 .. p0}, Landroidx/recyclerview/widget/RecyclerView$l;->w()I

    .line 412
    .line 413
    .line 414
    move-result v0

    .line 415
    if-nez v0, :cond_1e

    .line 416
    .line 417
    goto/16 :goto_1a

    .line 418
    .line 419
    :cond_1e
    iget-object v0, v6, Landroidx/recyclerview/widget/RecyclerView$l;->b:Landroidx/recyclerview/widget/RecyclerView;

    .line 420
    .line 421
    if-nez v0, :cond_20

    .line 422
    .line 423
    :cond_1f
    :goto_12
    const/4 v0, 0x0

    .line 424
    goto :goto_13

    .line 425
    :cond_20
    invoke-virtual {v0}, Landroid/view/ViewGroup;->getFocusedChild()Landroid/view/View;

    .line 426
    .line 427
    .line 428
    move-result-object v0

    .line 429
    if-eqz v0, :cond_1f

    .line 430
    .line 431
    iget-object v1, v6, Landroidx/recyclerview/widget/RecyclerView$l;->a:Landroidx/recyclerview/widget/b;

    .line 432
    .line 433
    invoke-virtual {v1, v0}, Landroidx/recyclerview/widget/b;->j(Landroid/view/View;)Z

    .line 434
    .line 435
    .line 436
    move-result v1

    .line 437
    if-eqz v1, :cond_21

    .line 438
    .line 439
    goto :goto_12

    .line 440
    :cond_21
    :goto_13
    if-eqz v0, :cond_23

    .line 441
    .line 442
    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 443
    .line 444
    .line 445
    move-result-object v1

    .line 446
    check-cast v1, Landroidx/recyclerview/widget/RecyclerView$m;

    .line 447
    .line 448
    invoke-virtual {v1}, Landroidx/recyclerview/widget/RecyclerView$m;->c()Z

    .line 449
    .line 450
    .line 451
    move-result v2

    .line 452
    if-nez v2, :cond_22

    .line 453
    .line 454
    invoke-virtual {v1}, Landroidx/recyclerview/widget/RecyclerView$m;->a()I

    .line 455
    .line 456
    .line 457
    move-result v2

    .line 458
    if-ltz v2, :cond_22

    .line 459
    .line 460
    invoke-virtual {v1}, Landroidx/recyclerview/widget/RecyclerView$m;->a()I

    .line 461
    .line 462
    .line 463
    move-result v1

    .line 464
    invoke-virtual/range {p2 .. p2}, Landroidx/recyclerview/widget/RecyclerView$x;->b()I

    .line 465
    .line 466
    .line 467
    move-result v2

    .line 468
    if-ge v1, v2, :cond_22

    .line 469
    .line 470
    move v1, v10

    .line 471
    goto :goto_14

    .line 472
    :cond_22
    move v1, v11

    .line 473
    :goto_14
    if-eqz v1, :cond_23

    .line 474
    .line 475
    invoke-static {v0}, Landroidx/recyclerview/widget/RecyclerView$l;->G(Landroid/view/View;)I

    .line 476
    .line 477
    .line 478
    move-result v1

    .line 479
    invoke-virtual {v13, v0, v1}, Landroidx/recyclerview/widget/LinearLayoutManager$a;->b(Landroid/view/View;I)V

    .line 480
    .line 481
    .line 482
    goto/16 :goto_19

    .line 483
    .line 484
    :cond_23
    iget-boolean v0, v6, Landroidx/recyclerview/widget/LinearLayoutManager;->s:Z

    .line 485
    .line 486
    iget-boolean v1, v6, Landroidx/recyclerview/widget/LinearLayoutManager;->v:Z

    .line 487
    .line 488
    if-eq v0, v1, :cond_24

    .line 489
    .line 490
    goto/16 :goto_1a

    .line 491
    .line 492
    :cond_24
    iget-boolean v0, v13, Landroidx/recyclerview/widget/LinearLayoutManager$a;->d:Z

    .line 493
    .line 494
    if-eqz v0, :cond_26

    .line 495
    .line 496
    iget-boolean v0, v6, Landroidx/recyclerview/widget/LinearLayoutManager;->u:Z

    .line 497
    .line 498
    if-eqz v0, :cond_25

    .line 499
    .line 500
    const/4 v3, 0x0

    .line 501
    invoke-virtual/range {p0 .. p0}, Landroidx/recyclerview/widget/RecyclerView$l;->w()I

    .line 502
    .line 503
    .line 504
    move-result v4

    .line 505
    invoke-virtual/range {p2 .. p2}, Landroidx/recyclerview/widget/RecyclerView$x;->b()I

    .line 506
    .line 507
    .line 508
    move-result v5

    .line 509
    move-object/from16 v0, p0

    .line 510
    .line 511
    move-object/from16 v1, p1

    .line 512
    .line 513
    move-object/from16 v2, p2

    .line 514
    .line 515
    invoke-virtual/range {v0 .. v5}, Landroidx/recyclerview/widget/LinearLayoutManager;->Q0(Landroidx/recyclerview/widget/RecyclerView$s;Landroidx/recyclerview/widget/RecyclerView$x;III)Landroid/view/View;

    .line 516
    .line 517
    .line 518
    move-result-object v0

    .line 519
    goto :goto_15

    .line 520
    :cond_25
    invoke-virtual/range {p0 .. p0}, Landroidx/recyclerview/widget/RecyclerView$l;->w()I

    .line 521
    .line 522
    .line 523
    move-result v0

    .line 524
    add-int/lit8 v3, v0, -0x1

    .line 525
    .line 526
    const/4 v4, -0x1

    .line 527
    invoke-virtual/range {p2 .. p2}, Landroidx/recyclerview/widget/RecyclerView$x;->b()I

    .line 528
    .line 529
    .line 530
    move-result v5

    .line 531
    move-object/from16 v0, p0

    .line 532
    .line 533
    move-object/from16 v1, p1

    .line 534
    .line 535
    move-object/from16 v2, p2

    .line 536
    .line 537
    invoke-virtual/range {v0 .. v5}, Landroidx/recyclerview/widget/LinearLayoutManager;->Q0(Landroidx/recyclerview/widget/RecyclerView$s;Landroidx/recyclerview/widget/RecyclerView$x;III)Landroid/view/View;

    .line 538
    .line 539
    .line 540
    move-result-object v0

    .line 541
    goto :goto_15

    .line 542
    :cond_26
    iget-boolean v0, v6, Landroidx/recyclerview/widget/LinearLayoutManager;->u:Z

    .line 543
    .line 544
    if-eqz v0, :cond_27

    .line 545
    .line 546
    invoke-virtual/range {p0 .. p0}, Landroidx/recyclerview/widget/RecyclerView$l;->w()I

    .line 547
    .line 548
    .line 549
    move-result v0

    .line 550
    add-int/lit8 v3, v0, -0x1

    .line 551
    .line 552
    const/4 v4, -0x1

    .line 553
    invoke-virtual/range {p2 .. p2}, Landroidx/recyclerview/widget/RecyclerView$x;->b()I

    .line 554
    .line 555
    .line 556
    move-result v5

    .line 557
    move-object/from16 v0, p0

    .line 558
    .line 559
    move-object/from16 v1, p1

    .line 560
    .line 561
    move-object/from16 v2, p2

    .line 562
    .line 563
    invoke-virtual/range {v0 .. v5}, Landroidx/recyclerview/widget/LinearLayoutManager;->Q0(Landroidx/recyclerview/widget/RecyclerView$s;Landroidx/recyclerview/widget/RecyclerView$x;III)Landroid/view/View;

    .line 564
    .line 565
    .line 566
    move-result-object v0

    .line 567
    goto :goto_15

    .line 568
    :cond_27
    const/4 v3, 0x0

    .line 569
    invoke-virtual/range {p0 .. p0}, Landroidx/recyclerview/widget/RecyclerView$l;->w()I

    .line 570
    .line 571
    .line 572
    move-result v4

    .line 573
    invoke-virtual/range {p2 .. p2}, Landroidx/recyclerview/widget/RecyclerView$x;->b()I

    .line 574
    .line 575
    .line 576
    move-result v5

    .line 577
    move-object/from16 v0, p0

    .line 578
    .line 579
    move-object/from16 v1, p1

    .line 580
    .line 581
    move-object/from16 v2, p2

    .line 582
    .line 583
    invoke-virtual/range {v0 .. v5}, Landroidx/recyclerview/widget/LinearLayoutManager;->Q0(Landroidx/recyclerview/widget/RecyclerView$s;Landroidx/recyclerview/widget/RecyclerView$x;III)Landroid/view/View;

    .line 584
    .line 585
    .line 586
    move-result-object v0

    .line 587
    :goto_15
    if-eqz v0, :cond_2c

    .line 588
    .line 589
    invoke-static {v0}, Landroidx/recyclerview/widget/RecyclerView$l;->G(Landroid/view/View;)I

    .line 590
    .line 591
    .line 592
    move-result v1

    .line 593
    invoke-virtual {v13, v0, v1}, Landroidx/recyclerview/widget/LinearLayoutManager$a;->a(Landroid/view/View;I)V

    .line 594
    .line 595
    .line 596
    iget-boolean v1, v8, Landroidx/recyclerview/widget/RecyclerView$x;->g:Z

    .line 597
    .line 598
    if-nez v1, :cond_2b

    .line 599
    .line 600
    invoke-virtual/range {p0 .. p0}, Landroidx/recyclerview/widget/LinearLayoutManager;->B0()Z

    .line 601
    .line 602
    .line 603
    move-result v1

    .line 604
    if-eqz v1, :cond_2b

    .line 605
    .line 606
    iget-object v1, v6, Landroidx/recyclerview/widget/LinearLayoutManager;->r:Landroidx/recyclerview/widget/s;

    .line 607
    .line 608
    invoke-virtual {v1, v0}, Landroidx/recyclerview/widget/s;->e(Landroid/view/View;)I

    .line 609
    .line 610
    .line 611
    move-result v1

    .line 612
    iget-object v2, v6, Landroidx/recyclerview/widget/LinearLayoutManager;->r:Landroidx/recyclerview/widget/s;

    .line 613
    .line 614
    invoke-virtual {v2}, Landroidx/recyclerview/widget/s;->g()I

    .line 615
    .line 616
    .line 617
    move-result v2

    .line 618
    if-ge v1, v2, :cond_29

    .line 619
    .line 620
    iget-object v1, v6, Landroidx/recyclerview/widget/LinearLayoutManager;->r:Landroidx/recyclerview/widget/s;

    .line 621
    .line 622
    invoke-virtual {v1, v0}, Landroidx/recyclerview/widget/s;->b(Landroid/view/View;)I

    .line 623
    .line 624
    .line 625
    move-result v0

    .line 626
    iget-object v1, v6, Landroidx/recyclerview/widget/LinearLayoutManager;->r:Landroidx/recyclerview/widget/s;

    .line 627
    .line 628
    invoke-virtual {v1}, Landroidx/recyclerview/widget/s;->k()I

    .line 629
    .line 630
    .line 631
    move-result v1

    .line 632
    if-ge v0, v1, :cond_28

    .line 633
    .line 634
    goto :goto_16

    .line 635
    :cond_28
    move v0, v11

    .line 636
    goto :goto_17

    .line 637
    :cond_29
    :goto_16
    move v0, v10

    .line 638
    :goto_17
    if-eqz v0, :cond_2b

    .line 639
    .line 640
    iget-boolean v0, v13, Landroidx/recyclerview/widget/LinearLayoutManager$a;->d:Z

    .line 641
    .line 642
    if-eqz v0, :cond_2a

    .line 643
    .line 644
    iget-object v0, v6, Landroidx/recyclerview/widget/LinearLayoutManager;->r:Landroidx/recyclerview/widget/s;

    .line 645
    .line 646
    invoke-virtual {v0}, Landroidx/recyclerview/widget/s;->g()I

    .line 647
    .line 648
    .line 649
    move-result v0

    .line 650
    goto :goto_18

    .line 651
    :cond_2a
    iget-object v0, v6, Landroidx/recyclerview/widget/LinearLayoutManager;->r:Landroidx/recyclerview/widget/s;

    .line 652
    .line 653
    invoke-virtual {v0}, Landroidx/recyclerview/widget/s;->k()I

    .line 654
    .line 655
    .line 656
    move-result v0

    .line 657
    :goto_18
    iput v0, v13, Landroidx/recyclerview/widget/LinearLayoutManager$a;->c:I

    .line 658
    .line 659
    :cond_2b
    :goto_19
    move v0, v10

    .line 660
    goto :goto_1b

    .line 661
    :cond_2c
    :goto_1a
    move v0, v11

    .line 662
    :goto_1b
    if-eqz v0, :cond_2d

    .line 663
    .line 664
    goto :goto_1e

    .line 665
    :cond_2d
    iget-boolean v0, v13, Landroidx/recyclerview/widget/LinearLayoutManager$a;->d:Z

    .line 666
    .line 667
    if-eqz v0, :cond_2e

    .line 668
    .line 669
    iget-object v0, v13, Landroidx/recyclerview/widget/LinearLayoutManager$a;->a:Landroidx/recyclerview/widget/s;

    .line 670
    .line 671
    invoke-virtual {v0}, Landroidx/recyclerview/widget/s;->g()I

    .line 672
    .line 673
    .line 674
    move-result v0

    .line 675
    goto :goto_1c

    .line 676
    :cond_2e
    iget-object v0, v13, Landroidx/recyclerview/widget/LinearLayoutManager$a;->a:Landroidx/recyclerview/widget/s;

    .line 677
    .line 678
    invoke-virtual {v0}, Landroidx/recyclerview/widget/s;->k()I

    .line 679
    .line 680
    .line 681
    move-result v0

    .line 682
    :goto_1c
    iput v0, v13, Landroidx/recyclerview/widget/LinearLayoutManager$a;->c:I

    .line 683
    .line 684
    iget-boolean v0, v6, Landroidx/recyclerview/widget/LinearLayoutManager;->v:Z

    .line 685
    .line 686
    if-eqz v0, :cond_2f

    .line 687
    .line 688
    invoke-virtual/range {p2 .. p2}, Landroidx/recyclerview/widget/RecyclerView$x;->b()I

    .line 689
    .line 690
    .line 691
    move-result v0

    .line 692
    add-int/2addr v0, v9

    .line 693
    goto :goto_1d

    .line 694
    :cond_2f
    move v0, v11

    .line 695
    :goto_1d
    iput v0, v13, Landroidx/recyclerview/widget/LinearLayoutManager$a;->b:I

    .line 696
    .line 697
    :goto_1e
    iput-boolean v10, v13, Landroidx/recyclerview/widget/LinearLayoutManager$a;->e:Z

    .line 698
    .line 699
    :cond_30
    :goto_1f
    iget-object v0, v6, Landroidx/recyclerview/widget/LinearLayoutManager;->q:Landroidx/recyclerview/widget/LinearLayoutManager$c;

    .line 700
    .line 701
    iget v1, v0, Landroidx/recyclerview/widget/LinearLayoutManager$c;->j:I

    .line 702
    .line 703
    if-ltz v1, :cond_31

    .line 704
    .line 705
    move v1, v10

    .line 706
    goto :goto_20

    .line 707
    :cond_31
    move v1, v9

    .line 708
    :goto_20
    iput v1, v0, Landroidx/recyclerview/widget/LinearLayoutManager$c;->f:I

    .line 709
    .line 710
    iget-object v0, v6, Landroidx/recyclerview/widget/LinearLayoutManager;->D:[I

    .line 711
    .line 712
    aput v11, v0, v11

    .line 713
    .line 714
    aput v11, v0, v10

    .line 715
    .line 716
    invoke-virtual {v6, v8, v0}, Landroidx/recyclerview/widget/LinearLayoutManager;->C0(Landroidx/recyclerview/widget/RecyclerView$x;[I)V

    .line 717
    .line 718
    .line 719
    aget v1, v0, v11

    .line 720
    .line 721
    invoke-static {v11, v1}, Ljava/lang/Math;->max(II)I

    .line 722
    .line 723
    .line 724
    move-result v1

    .line 725
    iget-object v2, v6, Landroidx/recyclerview/widget/LinearLayoutManager;->r:Landroidx/recyclerview/widget/s;

    .line 726
    .line 727
    invoke-virtual {v2}, Landroidx/recyclerview/widget/s;->k()I

    .line 728
    .line 729
    .line 730
    move-result v2

    .line 731
    add-int/2addr v2, v1

    .line 732
    aget v0, v0, v10

    .line 733
    .line 734
    invoke-static {v11, v0}, Ljava/lang/Math;->max(II)I

    .line 735
    .line 736
    .line 737
    move-result v0

    .line 738
    iget-object v1, v6, Landroidx/recyclerview/widget/LinearLayoutManager;->r:Landroidx/recyclerview/widget/s;

    .line 739
    .line 740
    invoke-virtual {v1}, Landroidx/recyclerview/widget/s;->h()I

    .line 741
    .line 742
    .line 743
    move-result v1

    .line 744
    add-int/2addr v1, v0

    .line 745
    iget-boolean v0, v8, Landroidx/recyclerview/widget/RecyclerView$x;->g:Z

    .line 746
    .line 747
    if-eqz v0, :cond_34

    .line 748
    .line 749
    iget v0, v6, Landroidx/recyclerview/widget/LinearLayoutManager;->x:I

    .line 750
    .line 751
    if-eq v0, v9, :cond_34

    .line 752
    .line 753
    iget v3, v6, Landroidx/recyclerview/widget/LinearLayoutManager;->y:I

    .line 754
    .line 755
    if-eq v3, v14, :cond_34

    .line 756
    .line 757
    invoke-virtual {v6, v0}, Landroidx/recyclerview/widget/LinearLayoutManager;->q(I)Landroid/view/View;

    .line 758
    .line 759
    .line 760
    move-result-object v0

    .line 761
    if-eqz v0, :cond_34

    .line 762
    .line 763
    iget-boolean v3, v6, Landroidx/recyclerview/widget/LinearLayoutManager;->u:Z

    .line 764
    .line 765
    if-eqz v3, :cond_32

    .line 766
    .line 767
    iget-object v3, v6, Landroidx/recyclerview/widget/LinearLayoutManager;->r:Landroidx/recyclerview/widget/s;

    .line 768
    .line 769
    invoke-virtual {v3}, Landroidx/recyclerview/widget/s;->g()I

    .line 770
    .line 771
    .line 772
    move-result v3

    .line 773
    iget-object v4, v6, Landroidx/recyclerview/widget/LinearLayoutManager;->r:Landroidx/recyclerview/widget/s;

    .line 774
    .line 775
    invoke-virtual {v4, v0}, Landroidx/recyclerview/widget/s;->b(Landroid/view/View;)I

    .line 776
    .line 777
    .line 778
    move-result v0

    .line 779
    sub-int/2addr v3, v0

    .line 780
    iget v0, v6, Landroidx/recyclerview/widget/LinearLayoutManager;->y:I

    .line 781
    .line 782
    goto :goto_21

    .line 783
    :cond_32
    iget-object v3, v6, Landroidx/recyclerview/widget/LinearLayoutManager;->r:Landroidx/recyclerview/widget/s;

    .line 784
    .line 785
    invoke-virtual {v3, v0}, Landroidx/recyclerview/widget/s;->e(Landroid/view/View;)I

    .line 786
    .line 787
    .line 788
    move-result v0

    .line 789
    iget-object v3, v6, Landroidx/recyclerview/widget/LinearLayoutManager;->r:Landroidx/recyclerview/widget/s;

    .line 790
    .line 791
    invoke-virtual {v3}, Landroidx/recyclerview/widget/s;->k()I

    .line 792
    .line 793
    .line 794
    move-result v3

    .line 795
    sub-int/2addr v0, v3

    .line 796
    iget v3, v6, Landroidx/recyclerview/widget/LinearLayoutManager;->y:I

    .line 797
    .line 798
    :goto_21
    sub-int/2addr v3, v0

    .line 799
    if-lez v3, :cond_33

    .line 800
    .line 801
    add-int/2addr v2, v3

    .line 802
    goto :goto_22

    .line 803
    :cond_33
    sub-int/2addr v1, v3

    .line 804
    :cond_34
    :goto_22
    iget-boolean v0, v13, Landroidx/recyclerview/widget/LinearLayoutManager$a;->d:Z

    .line 805
    .line 806
    if-eqz v0, :cond_35

    .line 807
    .line 808
    iget-boolean v0, v6, Landroidx/recyclerview/widget/LinearLayoutManager;->u:Z

    .line 809
    .line 810
    if-eqz v0, :cond_36

    .line 811
    .line 812
    goto :goto_23

    .line 813
    :cond_35
    iget-boolean v0, v6, Landroidx/recyclerview/widget/LinearLayoutManager;->u:Z

    .line 814
    .line 815
    if-eqz v0, :cond_37

    .line 816
    .line 817
    :cond_36
    move v0, v9

    .line 818
    goto :goto_24

    .line 819
    :cond_37
    :goto_23
    move v0, v10

    .line 820
    :goto_24
    invoke-virtual {v6, v7, v8, v13, v0}, Landroidx/recyclerview/widget/LinearLayoutManager;->X0(Landroidx/recyclerview/widget/RecyclerView$s;Landroidx/recyclerview/widget/RecyclerView$x;Landroidx/recyclerview/widget/LinearLayoutManager$a;I)V

    .line 821
    .line 822
    .line 823
    invoke-virtual/range {p0 .. p1}, Landroidx/recyclerview/widget/RecyclerView$l;->p(Landroidx/recyclerview/widget/RecyclerView$s;)V

    .line 824
    .line 825
    .line 826
    iget-object v0, v6, Landroidx/recyclerview/widget/LinearLayoutManager;->q:Landroidx/recyclerview/widget/LinearLayoutManager$c;

    .line 827
    .line 828
    iget-object v3, v6, Landroidx/recyclerview/widget/LinearLayoutManager;->r:Landroidx/recyclerview/widget/s;

    .line 829
    .line 830
    invoke-virtual {v3}, Landroidx/recyclerview/widget/s;->i()I

    .line 831
    .line 832
    .line 833
    move-result v3

    .line 834
    if-nez v3, :cond_38

    .line 835
    .line 836
    iget-object v3, v6, Landroidx/recyclerview/widget/LinearLayoutManager;->r:Landroidx/recyclerview/widget/s;

    .line 837
    .line 838
    invoke-virtual {v3}, Landroidx/recyclerview/widget/s;->f()I

    .line 839
    .line 840
    .line 841
    move-result v3

    .line 842
    if-nez v3, :cond_38

    .line 843
    .line 844
    move v3, v10

    .line 845
    goto :goto_25

    .line 846
    :cond_38
    move v3, v11

    .line 847
    :goto_25
    iput-boolean v3, v0, Landroidx/recyclerview/widget/LinearLayoutManager$c;->l:Z

    .line 848
    .line 849
    iget-object v0, v6, Landroidx/recyclerview/widget/LinearLayoutManager;->q:Landroidx/recyclerview/widget/LinearLayoutManager$c;

    .line 850
    .line 851
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 852
    .line 853
    .line 854
    iget-object v0, v6, Landroidx/recyclerview/widget/LinearLayoutManager;->q:Landroidx/recyclerview/widget/LinearLayoutManager$c;

    .line 855
    .line 856
    iput v11, v0, Landroidx/recyclerview/widget/LinearLayoutManager$c;->i:I

    .line 857
    .line 858
    iget-boolean v0, v13, Landroidx/recyclerview/widget/LinearLayoutManager$a;->d:Z

    .line 859
    .line 860
    if-eqz v0, :cond_3a

    .line 861
    .line 862
    iget v0, v13, Landroidx/recyclerview/widget/LinearLayoutManager$a;->b:I

    .line 863
    .line 864
    iget v3, v13, Landroidx/recyclerview/widget/LinearLayoutManager$a;->c:I

    .line 865
    .line 866
    invoke-virtual {v6, v0, v3}, Landroidx/recyclerview/widget/LinearLayoutManager;->g1(II)V

    .line 867
    .line 868
    .line 869
    iget-object v0, v6, Landroidx/recyclerview/widget/LinearLayoutManager;->q:Landroidx/recyclerview/widget/LinearLayoutManager$c;

    .line 870
    .line 871
    iput v2, v0, Landroidx/recyclerview/widget/LinearLayoutManager$c;->h:I

    .line 872
    .line 873
    invoke-virtual {v6, v7, v0, v8, v11}, Landroidx/recyclerview/widget/LinearLayoutManager;->J0(Landroidx/recyclerview/widget/RecyclerView$s;Landroidx/recyclerview/widget/LinearLayoutManager$c;Landroidx/recyclerview/widget/RecyclerView$x;Z)I

    .line 874
    .line 875
    .line 876
    iget-object v0, v6, Landroidx/recyclerview/widget/LinearLayoutManager;->q:Landroidx/recyclerview/widget/LinearLayoutManager$c;

    .line 877
    .line 878
    iget v2, v0, Landroidx/recyclerview/widget/LinearLayoutManager$c;->b:I

    .line 879
    .line 880
    iget v3, v0, Landroidx/recyclerview/widget/LinearLayoutManager$c;->d:I

    .line 881
    .line 882
    iget v0, v0, Landroidx/recyclerview/widget/LinearLayoutManager$c;->c:I

    .line 883
    .line 884
    if-lez v0, :cond_39

    .line 885
    .line 886
    add-int/2addr v1, v0

    .line 887
    :cond_39
    iget v0, v13, Landroidx/recyclerview/widget/LinearLayoutManager$a;->b:I

    .line 888
    .line 889
    iget v4, v13, Landroidx/recyclerview/widget/LinearLayoutManager$a;->c:I

    .line 890
    .line 891
    invoke-virtual {v6, v0, v4}, Landroidx/recyclerview/widget/LinearLayoutManager;->f1(II)V

    .line 892
    .line 893
    .line 894
    iget-object v0, v6, Landroidx/recyclerview/widget/LinearLayoutManager;->q:Landroidx/recyclerview/widget/LinearLayoutManager$c;

    .line 895
    .line 896
    iput v1, v0, Landroidx/recyclerview/widget/LinearLayoutManager$c;->h:I

    .line 897
    .line 898
    iget v1, v0, Landroidx/recyclerview/widget/LinearLayoutManager$c;->d:I

    .line 899
    .line 900
    iget v4, v0, Landroidx/recyclerview/widget/LinearLayoutManager$c;->e:I

    .line 901
    .line 902
    add-int/2addr v1, v4

    .line 903
    iput v1, v0, Landroidx/recyclerview/widget/LinearLayoutManager$c;->d:I

    .line 904
    .line 905
    invoke-virtual {v6, v7, v0, v8, v11}, Landroidx/recyclerview/widget/LinearLayoutManager;->J0(Landroidx/recyclerview/widget/RecyclerView$s;Landroidx/recyclerview/widget/LinearLayoutManager$c;Landroidx/recyclerview/widget/RecyclerView$x;Z)I

    .line 906
    .line 907
    .line 908
    iget-object v0, v6, Landroidx/recyclerview/widget/LinearLayoutManager;->q:Landroidx/recyclerview/widget/LinearLayoutManager$c;

    .line 909
    .line 910
    iget v1, v0, Landroidx/recyclerview/widget/LinearLayoutManager$c;->b:I

    .line 911
    .line 912
    iget v0, v0, Landroidx/recyclerview/widget/LinearLayoutManager$c;->c:I

    .line 913
    .line 914
    if-lez v0, :cond_3c

    .line 915
    .line 916
    invoke-virtual {v6, v3, v2}, Landroidx/recyclerview/widget/LinearLayoutManager;->g1(II)V

    .line 917
    .line 918
    .line 919
    iget-object v2, v6, Landroidx/recyclerview/widget/LinearLayoutManager;->q:Landroidx/recyclerview/widget/LinearLayoutManager$c;

    .line 920
    .line 921
    iput v0, v2, Landroidx/recyclerview/widget/LinearLayoutManager$c;->h:I

    .line 922
    .line 923
    invoke-virtual {v6, v7, v2, v8, v11}, Landroidx/recyclerview/widget/LinearLayoutManager;->J0(Landroidx/recyclerview/widget/RecyclerView$s;Landroidx/recyclerview/widget/LinearLayoutManager$c;Landroidx/recyclerview/widget/RecyclerView$x;Z)I

    .line 924
    .line 925
    .line 926
    iget-object v0, v6, Landroidx/recyclerview/widget/LinearLayoutManager;->q:Landroidx/recyclerview/widget/LinearLayoutManager$c;

    .line 927
    .line 928
    iget v2, v0, Landroidx/recyclerview/widget/LinearLayoutManager$c;->b:I

    .line 929
    .line 930
    goto :goto_26

    .line 931
    :cond_3a
    iget v0, v13, Landroidx/recyclerview/widget/LinearLayoutManager$a;->b:I

    .line 932
    .line 933
    iget v3, v13, Landroidx/recyclerview/widget/LinearLayoutManager$a;->c:I

    .line 934
    .line 935
    invoke-virtual {v6, v0, v3}, Landroidx/recyclerview/widget/LinearLayoutManager;->f1(II)V

    .line 936
    .line 937
    .line 938
    iget-object v0, v6, Landroidx/recyclerview/widget/LinearLayoutManager;->q:Landroidx/recyclerview/widget/LinearLayoutManager$c;

    .line 939
    .line 940
    iput v1, v0, Landroidx/recyclerview/widget/LinearLayoutManager$c;->h:I

    .line 941
    .line 942
    invoke-virtual {v6, v7, v0, v8, v11}, Landroidx/recyclerview/widget/LinearLayoutManager;->J0(Landroidx/recyclerview/widget/RecyclerView$s;Landroidx/recyclerview/widget/LinearLayoutManager$c;Landroidx/recyclerview/widget/RecyclerView$x;Z)I

    .line 943
    .line 944
    .line 945
    iget-object v0, v6, Landroidx/recyclerview/widget/LinearLayoutManager;->q:Landroidx/recyclerview/widget/LinearLayoutManager$c;

    .line 946
    .line 947
    iget v1, v0, Landroidx/recyclerview/widget/LinearLayoutManager$c;->b:I

    .line 948
    .line 949
    iget v3, v0, Landroidx/recyclerview/widget/LinearLayoutManager$c;->d:I

    .line 950
    .line 951
    iget v0, v0, Landroidx/recyclerview/widget/LinearLayoutManager$c;->c:I

    .line 952
    .line 953
    if-lez v0, :cond_3b

    .line 954
    .line 955
    add-int/2addr v2, v0

    .line 956
    :cond_3b
    iget v0, v13, Landroidx/recyclerview/widget/LinearLayoutManager$a;->b:I

    .line 957
    .line 958
    iget v4, v13, Landroidx/recyclerview/widget/LinearLayoutManager$a;->c:I

    .line 959
    .line 960
    invoke-virtual {v6, v0, v4}, Landroidx/recyclerview/widget/LinearLayoutManager;->g1(II)V

    .line 961
    .line 962
    .line 963
    iget-object v0, v6, Landroidx/recyclerview/widget/LinearLayoutManager;->q:Landroidx/recyclerview/widget/LinearLayoutManager$c;

    .line 964
    .line 965
    iput v2, v0, Landroidx/recyclerview/widget/LinearLayoutManager$c;->h:I

    .line 966
    .line 967
    iget v2, v0, Landroidx/recyclerview/widget/LinearLayoutManager$c;->d:I

    .line 968
    .line 969
    iget v4, v0, Landroidx/recyclerview/widget/LinearLayoutManager$c;->e:I

    .line 970
    .line 971
    add-int/2addr v2, v4

    .line 972
    iput v2, v0, Landroidx/recyclerview/widget/LinearLayoutManager$c;->d:I

    .line 973
    .line 974
    invoke-virtual {v6, v7, v0, v8, v11}, Landroidx/recyclerview/widget/LinearLayoutManager;->J0(Landroidx/recyclerview/widget/RecyclerView$s;Landroidx/recyclerview/widget/LinearLayoutManager$c;Landroidx/recyclerview/widget/RecyclerView$x;Z)I

    .line 975
    .line 976
    .line 977
    iget-object v0, v6, Landroidx/recyclerview/widget/LinearLayoutManager;->q:Landroidx/recyclerview/widget/LinearLayoutManager$c;

    .line 978
    .line 979
    iget v2, v0, Landroidx/recyclerview/widget/LinearLayoutManager$c;->b:I

    .line 980
    .line 981
    iget v0, v0, Landroidx/recyclerview/widget/LinearLayoutManager$c;->c:I

    .line 982
    .line 983
    if-lez v0, :cond_3c

    .line 984
    .line 985
    invoke-virtual {v6, v3, v1}, Landroidx/recyclerview/widget/LinearLayoutManager;->f1(II)V

    .line 986
    .line 987
    .line 988
    iget-object v1, v6, Landroidx/recyclerview/widget/LinearLayoutManager;->q:Landroidx/recyclerview/widget/LinearLayoutManager$c;

    .line 989
    .line 990
    iput v0, v1, Landroidx/recyclerview/widget/LinearLayoutManager$c;->h:I

    .line 991
    .line 992
    invoke-virtual {v6, v7, v1, v8, v11}, Landroidx/recyclerview/widget/LinearLayoutManager;->J0(Landroidx/recyclerview/widget/RecyclerView$s;Landroidx/recyclerview/widget/LinearLayoutManager$c;Landroidx/recyclerview/widget/RecyclerView$x;Z)I

    .line 993
    .line 994
    .line 995
    iget-object v0, v6, Landroidx/recyclerview/widget/LinearLayoutManager;->q:Landroidx/recyclerview/widget/LinearLayoutManager$c;

    .line 996
    .line 997
    iget v0, v0, Landroidx/recyclerview/widget/LinearLayoutManager$c;->b:I

    .line 998
    .line 999
    move v1, v0

    .line 1000
    :cond_3c
    :goto_26
    invoke-virtual/range {p0 .. p0}, Landroidx/recyclerview/widget/RecyclerView$l;->w()I

    .line 1001
    .line 1002
    .line 1003
    move-result v0

    .line 1004
    if-lez v0, :cond_3e

    .line 1005
    .line 1006
    iget-boolean v0, v6, Landroidx/recyclerview/widget/LinearLayoutManager;->u:Z

    .line 1007
    .line 1008
    iget-boolean v3, v6, Landroidx/recyclerview/widget/LinearLayoutManager;->v:Z

    .line 1009
    .line 1010
    xor-int/2addr v0, v3

    .line 1011
    if-eqz v0, :cond_3d

    .line 1012
    .line 1013
    invoke-virtual {v6, v1, v7, v8, v10}, Landroidx/recyclerview/widget/LinearLayoutManager;->R0(ILandroidx/recyclerview/widget/RecyclerView$s;Landroidx/recyclerview/widget/RecyclerView$x;Z)I

    .line 1014
    .line 1015
    .line 1016
    move-result v0

    .line 1017
    add-int/2addr v2, v0

    .line 1018
    add-int/2addr v1, v0

    .line 1019
    invoke-virtual {v6, v2, v7, v8, v11}, Landroidx/recyclerview/widget/LinearLayoutManager;->S0(ILandroidx/recyclerview/widget/RecyclerView$s;Landroidx/recyclerview/widget/RecyclerView$x;Z)I

    .line 1020
    .line 1021
    .line 1022
    move-result v0

    .line 1023
    goto :goto_27

    .line 1024
    :cond_3d
    invoke-virtual {v6, v2, v7, v8, v10}, Landroidx/recyclerview/widget/LinearLayoutManager;->S0(ILandroidx/recyclerview/widget/RecyclerView$s;Landroidx/recyclerview/widget/RecyclerView$x;Z)I

    .line 1025
    .line 1026
    .line 1027
    move-result v0

    .line 1028
    add-int/2addr v2, v0

    .line 1029
    add-int/2addr v1, v0

    .line 1030
    invoke-virtual {v6, v1, v7, v8, v11}, Landroidx/recyclerview/widget/LinearLayoutManager;->R0(ILandroidx/recyclerview/widget/RecyclerView$s;Landroidx/recyclerview/widget/RecyclerView$x;Z)I

    .line 1031
    .line 1032
    .line 1033
    move-result v0

    .line 1034
    :goto_27
    add-int/2addr v2, v0

    .line 1035
    add-int/2addr v1, v0

    .line 1036
    :cond_3e
    iget-boolean v0, v8, Landroidx/recyclerview/widget/RecyclerView$x;->k:Z

    .line 1037
    .line 1038
    if-eqz v0, :cond_47

    .line 1039
    .line 1040
    invoke-virtual/range {p0 .. p0}, Landroidx/recyclerview/widget/RecyclerView$l;->w()I

    .line 1041
    .line 1042
    .line 1043
    move-result v0

    .line 1044
    if-eqz v0, :cond_47

    .line 1045
    .line 1046
    iget-boolean v0, v8, Landroidx/recyclerview/widget/RecyclerView$x;->g:Z

    .line 1047
    .line 1048
    if-nez v0, :cond_47

    .line 1049
    .line 1050
    invoke-virtual/range {p0 .. p0}, Landroidx/recyclerview/widget/LinearLayoutManager;->B0()Z

    .line 1051
    .line 1052
    .line 1053
    move-result v0

    .line 1054
    if-nez v0, :cond_3f

    .line 1055
    .line 1056
    goto/16 :goto_2e

    .line 1057
    .line 1058
    :cond_3f
    iget-object v0, v7, Landroidx/recyclerview/widget/RecyclerView$s;->d:Ljava/util/List;

    .line 1059
    .line 1060
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 1061
    .line 1062
    .line 1063
    move-result v3

    .line 1064
    invoke-virtual {v6, v11}, Landroidx/recyclerview/widget/RecyclerView$l;->v(I)Landroid/view/View;

    .line 1065
    .line 1066
    .line 1067
    move-result-object v4

    .line 1068
    invoke-static {v4}, Landroidx/recyclerview/widget/RecyclerView$l;->G(Landroid/view/View;)I

    .line 1069
    .line 1070
    .line 1071
    move-result v4

    .line 1072
    move v5, v11

    .line 1073
    move v14, v5

    .line 1074
    move v15, v14

    .line 1075
    :goto_28
    if-ge v5, v3, :cond_44

    .line 1076
    .line 1077
    invoke-interface {v0, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 1078
    .line 1079
    .line 1080
    move-result-object v16

    .line 1081
    move-object/from16 v10, v16

    .line 1082
    .line 1083
    check-cast v10, Landroidx/recyclerview/widget/RecyclerView$a0;

    .line 1084
    .line 1085
    invoke-virtual {v10}, Landroidx/recyclerview/widget/RecyclerView$a0;->i()Z

    .line 1086
    .line 1087
    .line 1088
    move-result v16

    .line 1089
    if-eqz v16, :cond_40

    .line 1090
    .line 1091
    goto :goto_2b

    .line 1092
    :cond_40
    invoke-virtual {v10}, Landroidx/recyclerview/widget/RecyclerView$a0;->c()I

    .line 1093
    .line 1094
    .line 1095
    move-result v12

    .line 1096
    if-ge v12, v4, :cond_41

    .line 1097
    .line 1098
    const/4 v12, 0x1

    .line 1099
    goto :goto_29

    .line 1100
    :cond_41
    move v12, v11

    .line 1101
    :goto_29
    iget-boolean v11, v6, Landroidx/recyclerview/widget/LinearLayoutManager;->u:Z

    .line 1102
    .line 1103
    if-eq v12, v11, :cond_42

    .line 1104
    .line 1105
    move v11, v9

    .line 1106
    goto :goto_2a

    .line 1107
    :cond_42
    const/4 v11, 0x1

    .line 1108
    :goto_2a
    iget-object v10, v10, Landroidx/recyclerview/widget/RecyclerView$a0;->a:Landroid/view/View;

    .line 1109
    .line 1110
    iget-object v12, v6, Landroidx/recyclerview/widget/LinearLayoutManager;->r:Landroidx/recyclerview/widget/s;

    .line 1111
    .line 1112
    invoke-virtual {v12, v10}, Landroidx/recyclerview/widget/s;->c(Landroid/view/View;)I

    .line 1113
    .line 1114
    .line 1115
    move-result v10

    .line 1116
    if-ne v11, v9, :cond_43

    .line 1117
    .line 1118
    add-int/2addr v14, v10

    .line 1119
    goto :goto_2b

    .line 1120
    :cond_43
    add-int/2addr v15, v10

    .line 1121
    :goto_2b
    add-int/lit8 v5, v5, 0x1

    .line 1122
    .line 1123
    const/4 v10, 0x1

    .line 1124
    const/4 v11, 0x0

    .line 1125
    goto :goto_28

    .line 1126
    :cond_44
    iget-object v3, v6, Landroidx/recyclerview/widget/LinearLayoutManager;->q:Landroidx/recyclerview/widget/LinearLayoutManager$c;

    .line 1127
    .line 1128
    iput-object v0, v3, Landroidx/recyclerview/widget/LinearLayoutManager$c;->k:Ljava/util/List;

    .line 1129
    .line 1130
    if-lez v14, :cond_45

    .line 1131
    .line 1132
    invoke-virtual/range {p0 .. p0}, Landroidx/recyclerview/widget/LinearLayoutManager;->U0()Landroid/view/View;

    .line 1133
    .line 1134
    .line 1135
    move-result-object v0

    .line 1136
    invoke-static {v0}, Landroidx/recyclerview/widget/RecyclerView$l;->G(Landroid/view/View;)I

    .line 1137
    .line 1138
    .line 1139
    move-result v0

    .line 1140
    invoke-virtual {v6, v0, v2}, Landroidx/recyclerview/widget/LinearLayoutManager;->g1(II)V

    .line 1141
    .line 1142
    .line 1143
    iget-object v0, v6, Landroidx/recyclerview/widget/LinearLayoutManager;->q:Landroidx/recyclerview/widget/LinearLayoutManager$c;

    .line 1144
    .line 1145
    iput v14, v0, Landroidx/recyclerview/widget/LinearLayoutManager$c;->h:I

    .line 1146
    .line 1147
    const/4 v2, 0x0

    .line 1148
    iput v2, v0, Landroidx/recyclerview/widget/LinearLayoutManager$c;->c:I

    .line 1149
    .line 1150
    const/4 v3, 0x0

    .line 1151
    invoke-virtual {v0, v3}, Landroidx/recyclerview/widget/LinearLayoutManager$c;->a(Landroid/view/View;)V

    .line 1152
    .line 1153
    .line 1154
    iget-object v0, v6, Landroidx/recyclerview/widget/LinearLayoutManager;->q:Landroidx/recyclerview/widget/LinearLayoutManager$c;

    .line 1155
    .line 1156
    invoke-virtual {v6, v7, v0, v8, v2}, Landroidx/recyclerview/widget/LinearLayoutManager;->J0(Landroidx/recyclerview/widget/RecyclerView$s;Landroidx/recyclerview/widget/LinearLayoutManager$c;Landroidx/recyclerview/widget/RecyclerView$x;Z)I

    .line 1157
    .line 1158
    .line 1159
    goto :goto_2c

    .line 1160
    :cond_45
    const/4 v2, 0x0

    .line 1161
    :goto_2c
    if-lez v15, :cond_46

    .line 1162
    .line 1163
    invoke-virtual/range {p0 .. p0}, Landroidx/recyclerview/widget/LinearLayoutManager;->T0()Landroid/view/View;

    .line 1164
    .line 1165
    .line 1166
    move-result-object v0

    .line 1167
    invoke-static {v0}, Landroidx/recyclerview/widget/RecyclerView$l;->G(Landroid/view/View;)I

    .line 1168
    .line 1169
    .line 1170
    move-result v0

    .line 1171
    invoke-virtual {v6, v0, v1}, Landroidx/recyclerview/widget/LinearLayoutManager;->f1(II)V

    .line 1172
    .line 1173
    .line 1174
    iget-object v0, v6, Landroidx/recyclerview/widget/LinearLayoutManager;->q:Landroidx/recyclerview/widget/LinearLayoutManager$c;

    .line 1175
    .line 1176
    iput v15, v0, Landroidx/recyclerview/widget/LinearLayoutManager$c;->h:I

    .line 1177
    .line 1178
    iput v2, v0, Landroidx/recyclerview/widget/LinearLayoutManager$c;->c:I

    .line 1179
    .line 1180
    const/4 v1, 0x0

    .line 1181
    invoke-virtual {v0, v1}, Landroidx/recyclerview/widget/LinearLayoutManager$c;->a(Landroid/view/View;)V

    .line 1182
    .line 1183
    .line 1184
    iget-object v0, v6, Landroidx/recyclerview/widget/LinearLayoutManager;->q:Landroidx/recyclerview/widget/LinearLayoutManager$c;

    .line 1185
    .line 1186
    invoke-virtual {v6, v7, v0, v8, v2}, Landroidx/recyclerview/widget/LinearLayoutManager;->J0(Landroidx/recyclerview/widget/RecyclerView$s;Landroidx/recyclerview/widget/LinearLayoutManager$c;Landroidx/recyclerview/widget/RecyclerView$x;Z)I

    .line 1187
    .line 1188
    .line 1189
    goto :goto_2d

    .line 1190
    :cond_46
    const/4 v1, 0x0

    .line 1191
    :goto_2d
    iget-object v0, v6, Landroidx/recyclerview/widget/LinearLayoutManager;->q:Landroidx/recyclerview/widget/LinearLayoutManager$c;

    .line 1192
    .line 1193
    iput-object v1, v0, Landroidx/recyclerview/widget/LinearLayoutManager$c;->k:Ljava/util/List;

    .line 1194
    .line 1195
    :cond_47
    :goto_2e
    iget-boolean v0, v8, Landroidx/recyclerview/widget/RecyclerView$x;->g:Z

    .line 1196
    .line 1197
    if-nez v0, :cond_48

    .line 1198
    .line 1199
    iget-object v0, v6, Landroidx/recyclerview/widget/LinearLayoutManager;->r:Landroidx/recyclerview/widget/s;

    .line 1200
    .line 1201
    invoke-virtual {v0}, Landroidx/recyclerview/widget/s;->l()I

    .line 1202
    .line 1203
    .line 1204
    move-result v1

    .line 1205
    iput v1, v0, Landroidx/recyclerview/widget/s;->b:I

    .line 1206
    .line 1207
    goto :goto_2f

    .line 1208
    :cond_48
    invoke-virtual {v13}, Landroidx/recyclerview/widget/LinearLayoutManager$a;->c()V

    .line 1209
    .line 1210
    .line 1211
    :goto_2f
    iget-boolean v0, v6, Landroidx/recyclerview/widget/LinearLayoutManager;->v:Z

    .line 1212
    .line 1213
    iput-boolean v0, v6, Landroidx/recyclerview/widget/LinearLayoutManager;->s:Z

    .line 1214
    .line 1215
    return-void
    .line 1216
    .line 1217
    .line 1218
    .line 1219
    .line 1220
    .line 1221
    .line 1222
    .line 1223
    .line 1224
    .line 1225
    .line 1226
    .line 1227
    .line 1228
    .line 1229
    .line 1230
    .line 1231
    .line 1232
    .line 1233
    .line 1234
    .line 1235
    .line 1236
    .line 1237
    .line 1238
    .line 1239
    .line 1240
    .line 1241
    .line 1242
    .line 1243
    .line 1244
    .line 1245
    .line 1246
    .line 1247
    .line 1248
    .line 1249
    .line 1250
    .line 1251
    .line 1252
    .line 1253
    .line 1254
    .line 1255
    .line 1256
    .line 1257
    .line 1258
    .line 1259
    .line 1260
    .line 1261
    .line 1262
    .line 1263
    .line 1264
    .line 1265
    .line 1266
    .line 1267
    .line 1268
    .line 1269
    .line 1270
    .line 1271
    .line 1272
    .line 1273
    .line 1274
    .line 1275
    .line 1276
    .line 1277
    .line 1278
    .line 1279
    .line 1280
    .line 1281
    .line 1282
    .line 1283
    .line 1284
    .line 1285
    .line 1286
    .line 1287
    .line 1288
    .line 1289
    .line 1290
    .line 1291
    .line 1292
    .line 1293
    .line 1294
    .line 1295
    .line 1296
    .line 1297
    .line 1298
    .line 1299
    .line 1300
    .line 1301
    .line 1302
    .line 1303
    .line 1304
    .line 1305
    .line 1306
    .line 1307
    .line 1308
    .line 1309
    .line 1310
    .line 1311
    .line 1312
    .line 1313
    .line 1314
    .line 1315
    .line 1316
    .line 1317
    .line 1318
    .line 1319
    .line 1320
    .line 1321
    .line 1322
    .line 1323
    .line 1324
    .line 1325
    .line 1326
    .line 1327
    .line 1328
    .line 1329
    .line 1330
    .line 1331
    .line 1332
    .line 1333
    .line 1334
    .line 1335
    .line 1336
    .line 1337
    .line 1338
    .line 1339
    .line 1340
    .line 1341
    .line 1342
    .line 1343
    .line 1344
    .line 1345
    .line 1346
    .line 1347
    .line 1348
    .line 1349
    .line 1350
    .line 1351
    .line 1352
    .line 1353
    .line 1354
    .line 1355
    .line 1356
    .line 1357
    .line 1358
    .line 1359
    .line 1360
    .line 1361
    .line 1362
    .line 1363
    .line 1364
    .line 1365
    .line 1366
    .line 1367
    .line 1368
    .line 1369
    .line 1370
    .line 1371
    .line 1372
    .line 1373
    .line 1374
    .line 1375
    .line 1376
    .line 1377
    .line 1378
    .line 1379
    .line 1380
    .line 1381
    .line 1382
    .line 1383
    .line 1384
    .line 1385
    .line 1386
    .line 1387
    .line 1388
    .line 1389
    .line 1390
    .line 1391
    .line 1392
    .line 1393
    .line 1394
    .line 1395
    .line 1396
    .line 1397
    .line 1398
    .line 1399
    .line 1400
    .line 1401
    .line 1402
    .line 1403
    .line 1404
    .line 1405
    .line 1406
    .line 1407
    .line 1408
    .line 1409
    .line 1410
    .line 1411
    .line 1412
    .line 1413
    .line 1414
    .line 1415
    .line 1416
    .line 1417
    .line 1418
    .line 1419
    .line 1420
    .line 1421
    .line 1422
    .line 1423
    .line 1424
    .line 1425
    .line 1426
    .line 1427
    .line 1428
    .line 1429
    .line 1430
    .line 1431
    .line 1432
    .line 1433
    .line 1434
    .line 1435
    .line 1436
    .line 1437
    .line 1438
    .line 1439
    .line 1440
    .line 1441
    .line 1442
    .line 1443
    .line 1444
    .line 1445
    .line 1446
    .line 1447
    .line 1448
    .line 1449
    .line 1450
    .line 1451
    .line 1452
    .line 1453
    .line 1454
    .line 1455
    .line 1456
    .line 1457
    .line 1458
    .line 1459
    .line 1460
    .line 1461
    .line 1462
    .line 1463
    .line 1464
    .line 1465
    .line 1466
    .line 1467
    .line 1468
    .line 1469
    .line 1470
    .line 1471
    .line 1472
    .line 1473
    .line 1474
    .line 1475
    .line 1476
    .line 1477
    .line 1478
    .line 1479
    .line 1480
    .line 1481
    .line 1482
    .line 1483
    .line 1484
    .line 1485
    .line 1486
    .line 1487
    .line 1488
    .line 1489
    .line 1490
    .line 1491
    .line 1492
    .line 1493
    .line 1494
    .line 1495
    .line 1496
    .line 1497
    .line 1498
    .line 1499
    .line 1500
    .line 1501
    .line 1502
    .line 1503
    .line 1504
    .line 1505
    .line 1506
    .line 1507
    .line 1508
    .line 1509
    .line 1510
    .line 1511
    .line 1512
    .line 1513
    .line 1514
    .line 1515
    .line 1516
    .line 1517
    .line 1518
    .line 1519
    .line 1520
    .line 1521
    .line 1522
    .line 1523
    .line 1524
    .line 1525
    .line 1526
    .line 1527
    .line 1528
    .line 1529
    .line 1530
    .line 1531
    .line 1532
    .line 1533
    .line 1534
    .line 1535
    .line 1536
    .line 1537
    .line 1538
    .line 1539
    .line 1540
    .line 1541
    .line 1542
    .line 1543
    .line 1544
    .line 1545
    .line 1546
    .line 1547
    .line 1548
    .line 1549
    .line 1550
    .line 1551
    .line 1552
    .line 1553
    .line 1554
    .line 1555
    .line 1556
    .line 1557
    .line 1558
    .line 1559
    .line 1560
    .line 1561
    .line 1562
    .line 1563
    .line 1564
    .line 1565
    .line 1566
    .line 1567
    .line 1568
    .line 1569
    .line 1570
    .line 1571
    .line 1572
    .line 1573
    .line 1574
    .line 1575
    .line 1576
    .line 1577
    .line 1578
    .line 1579
    .line 1580
    .line 1581
    .line 1582
    .line 1583
    .line 1584
    .line 1585
    .line 1586
    .line 1587
    .line 1588
    .line 1589
    .line 1590
    .line 1591
    .line 1592
    .line 1593
    .line 1594
    .line 1595
    .line 1596
    .line 1597
    .line 1598
    .line 1599
    .line 1600
    .line 1601
    .line 1602
    .line 1603
    .line 1604
    .line 1605
    .line 1606
    .line 1607
    .line 1608
    .line 1609
    .line 1610
    .line 1611
    .line 1612
    .line 1613
    .line 1614
    .line 1615
    .line 1616
    .line 1617
    .line 1618
    .line 1619
    .line 1620
    .line 1621
    .line 1622
    .line 1623
    .line 1624
    .line 1625
    .line 1626
    .line 1627
    .line 1628
    .line 1629
    .line 1630
    .line 1631
    .line 1632
    .line 1633
    .line 1634
    .line 1635
    .line 1636
    .line 1637
    .line 1638
    .line 1639
    .line 1640
    .line 1641
    .line 1642
    .line 1643
    .line 1644
    .line 1645
    .line 1646
    .line 1647
    .line 1648
    .line 1649
    .line 1650
    .line 1651
    .line 1652
    .line 1653
    .line 1654
    .line 1655
    .line 1656
    .line 1657
    .line 1658
    .line 1659
    .line 1660
    .line 1661
    .line 1662
    .line 1663
    .line 1664
    .line 1665
    .line 1666
    .line 1667
    .line 1668
    .line 1669
    .line 1670
    .line 1671
    .line 1672
    .line 1673
    .line 1674
    .line 1675
    .line 1676
    .line 1677
    .line 1678
    .line 1679
    .line 1680
    .line 1681
    .line 1682
    .line 1683
    .line 1684
    .line 1685
    .line 1686
    .line 1687
    .line 1688
    .line 1689
    .line 1690
    .line 1691
    .line 1692
    .line 1693
    .line 1694
    .line 1695
    .line 1696
    .line 1697
    .line 1698
    .line 1699
    .line 1700
    .line 1701
    .line 1702
    .line 1703
    .line 1704
    .line 1705
    .line 1706
    .line 1707
    .line 1708
    .line 1709
    .line 1710
    .line 1711
    .line 1712
    .line 1713
    .line 1714
    .line 1715
    .line 1716
    .line 1717
    .line 1718
    .line 1719
    .line 1720
    .line 1721
    .line 1722
    .line 1723
    .line 1724
    .line 1725
    .line 1726
    .line 1727
    .line 1728
    .line 1729
    .line 1730
    .line 1731
    .line 1732
    .line 1733
    .line 1734
    .line 1735
    .line 1736
    .line 1737
    .line 1738
    .line 1739
    .line 1740
    .line 1741
    .line 1742
    .line 1743
    .line 1744
    .line 1745
    .line 1746
    .line 1747
    .line 1748
    .line 1749
    .line 1750
    .line 1751
    .line 1752
    .line 1753
    .line 1754
    .line 1755
    .line 1756
    .line 1757
    .line 1758
    .line 1759
    .line 1760
    .line 1761
    .line 1762
    .line 1763
    .line 1764
    .line 1765
    .line 1766
    .line 1767
    .line 1768
    .line 1769
    .line 1770
    .line 1771
    .line 1772
    .line 1773
    .line 1774
    .line 1775
    .line 1776
    .line 1777
    .line 1778
    .line 1779
    .line 1780
    .line 1781
    .line 1782
    .line 1783
    .line 1784
    .line 1785
    .line 1786
    .line 1787
    .line 1788
    .line 1789
    .line 1790
    .line 1791
    .line 1792
    .line 1793
    .line 1794
    .line 1795
    .line 1796
    .line 1797
    .line 1798
    .line 1799
    .line 1800
    .line 1801
    .line 1802
    .line 1803
    .line 1804
    .line 1805
    .line 1806
    .line 1807
    .line 1808
    .line 1809
    .line 1810
    .line 1811
    .line 1812
    .line 1813
    .line 1814
    .line 1815
    .line 1816
    .line 1817
    .line 1818
    .line 1819
    .line 1820
    .line 1821
    .line 1822
    .line 1823
    .line 1824
    .line 1825
    .line 1826
    .line 1827
    .line 1828
    .line 1829
    .line 1830
    .line 1831
    .line 1832
    .line 1833
    .line 1834
    .line 1835
    .line 1836
    .line 1837
    .line 1838
    .line 1839
    .line 1840
    .line 1841
    .line 1842
    .line 1843
    .line 1844
    .line 1845
    .line 1846
    .line 1847
    .line 1848
    .line 1849
    .line 1850
    .line 1851
    .line 1852
    .line 1853
    .line 1854
    .line 1855
    .line 1856
    .line 1857
    .line 1858
    .line 1859
    .line 1860
    .line 1861
    .line 1862
    .line 1863
    .line 1864
    .line 1865
    .line 1866
    .line 1867
    .line 1868
    .line 1869
    .line 1870
    .line 1871
    .line 1872
    .line 1873
    .line 1874
    .line 1875
    .line 1876
    .line 1877
    .line 1878
    .line 1879
    .line 1880
    .line 1881
    .line 1882
    .line 1883
    .line 1884
    .line 1885
    .line 1886
    .line 1887
    .line 1888
    .line 1889
    .line 1890
    .line 1891
    .line 1892
    .line 1893
    .line 1894
    .line 1895
    .line 1896
    .line 1897
    .line 1898
    .line 1899
    .line 1900
    .line 1901
    .line 1902
    .line 1903
    .line 1904
    .line 1905
    .line 1906
    .line 1907
    .line 1908
    .line 1909
    .line 1910
    .line 1911
    .line 1912
    .line 1913
    .line 1914
    .line 1915
    .line 1916
    .line 1917
    .line 1918
    .line 1919
    .line 1920
    .line 1921
    .line 1922
    .line 1923
    .line 1924
    .line 1925
    .line 1926
    .line 1927
    .line 1928
    .line 1929
    .line 1930
    .line 1931
    .line 1932
    .line 1933
    .line 1934
    .line 1935
    .line 1936
    .line 1937
    .line 1938
    .line 1939
    .line 1940
    .line 1941
    .line 1942
    .line 1943
    .line 1944
    .line 1945
    .line 1946
    .line 1947
    .line 1948
    .line 1949
    .line 1950
    .line 1951
    .line 1952
    .line 1953
    .line 1954
    .line 1955
    .line 1956
    .line 1957
    .line 1958
    .line 1959
    .line 1960
    .line 1961
    .line 1962
    .line 1963
    .line 1964
    .line 1965
    .line 1966
    .line 1967
    .line 1968
    .line 1969
    .line 1970
    .line 1971
    .line 1972
    .line 1973
    .line 1974
    .line 1975
    .line 1976
    .line 1977
    .line 1978
    .line 1979
    .line 1980
    .line 1981
    .line 1982
    .line 1983
    .line 1984
    .line 1985
    .line 1986
    .line 1987
    .line 1988
    .line 1989
    .line 1990
    .line 1991
    .line 1992
    .line 1993
    .line 1994
    .line 1995
    .line 1996
    .line 1997
    .line 1998
    .line 1999
    .line 2000
    .line 2001
    .line 2002
    .line 2003
    .line 2004
    .line 2005
    .line 2006
    .line 2007
    .line 2008
    .line 2009
    .line 2010
    .line 2011
    .line 2012
    .line 2013
    .line 2014
    .line 2015
    .line 2016
    .line 2017
    .line 2018
    .line 2019
    .line 2020
    .line 2021
    .line 2022
    .line 2023
    .line 2024
    .line 2025
    .line 2026
    .line 2027
    .line 2028
    .line 2029
    .line 2030
    .line 2031
    .line 2032
    .line 2033
    .line 2034
    .line 2035
    .line 2036
    .line 2037
    .line 2038
    .line 2039
    .line 2040
    .line 2041
    .line 2042
    .line 2043
    .line 2044
    .line 2045
    .line 2046
    .line 2047
    .line 2048
    .line 2049
    .line 2050
    .line 2051
    .line 2052
    .line 2053
    .line 2054
    .line 2055
    .line 2056
    .line 2057
    .line 2058
    .line 2059
    .line 2060
    .line 2061
    .line 2062
    .line 2063
    .line 2064
    .line 2065
    .line 2066
    .line 2067
    .line 2068
    .line 2069
    .line 2070
    .line 2071
    .line 2072
    .line 2073
    .line 2074
    .line 2075
    .line 2076
    .line 2077
    .line 2078
    .line 2079
    .line 2080
    .line 2081
    .line 2082
    .line 2083
    .line 2084
    .line 2085
    .line 2086
    .line 2087
    .line 2088
    .line 2089
    .line 2090
    .line 2091
    .line 2092
    .line 2093
    .line 2094
    .line 2095
    .line 2096
    .line 2097
    .line 2098
    .line 2099
    .line 2100
    .line 2101
    .line 2102
    .line 2103
    .line 2104
    .line 2105
    .line 2106
    .line 2107
    .line 2108
    .line 2109
    .line 2110
    .line 2111
    .line 2112
    .line 2113
    .line 2114
    .line 2115
    .line 2116
    .line 2117
    .line 2118
    .line 2119
    .line 2120
    .line 2121
    .line 2122
    .line 2123
    .line 2124
    .line 2125
    .line 2126
    .line 2127
    .line 2128
    .line 2129
    .line 2130
    .line 2131
    .line 2132
    .line 2133
    .line 2134
    .line 2135
    .line 2136
    .line 2137
    .line 2138
    .line 2139
    .line 2140
    .line 2141
    .line 2142
    .line 2143
    .line 2144
    .line 2145
    .line 2146
    .line 2147
    .line 2148
    .line 2149
    .line 2150
    .line 2151
    .line 2152
    .line 2153
    .line 2154
    .line 2155
    .line 2156
    .line 2157
    .line 2158
    .line 2159
    .line 2160
    .line 2161
    .line 2162
    .line 2163
    .line 2164
    .line 2165
    .line 2166
    .line 2167
    .line 2168
    .line 2169
    .line 2170
    .line 2171
    .line 2172
    .line 2173
    .line 2174
    .line 2175
    .line 2176
    .line 2177
    .line 2178
    .line 2179
    .line 2180
    .line 2181
    .line 2182
    .line 2183
    .line 2184
    .line 2185
    .line 2186
    .line 2187
    .line 2188
    .line 2189
    .line 2190
    .line 2191
    .line 2192
    .line 2193
    .line 2194
    .line 2195
    .line 2196
    .line 2197
    .line 2198
    .line 2199
    .line 2200
    .line 2201
    .line 2202
    .line 2203
    .line 2204
    .line 2205
    .line 2206
    .line 2207
    .line 2208
    .line 2209
    .line 2210
    .line 2211
    .line 2212
    .line 2213
    .line 2214
    .line 2215
    .line 2216
    .line 2217
    .line 2218
    .line 2219
    .line 2220
    .line 2221
    .line 2222
    .line 2223
    .line 2224
    .line 2225
    .line 2226
    .line 2227
    .line 2228
    .line 2229
    .line 2230
    .line 2231
    .line 2232
    .line 2233
    .line 2234
    .line 2235
    .line 2236
    .line 2237
    .line 2238
    .line 2239
    .line 2240
    .line 2241
    .line 2242
    .line 2243
    .line 2244
    .line 2245
    .line 2246
    .line 2247
    .line 2248
    .line 2249
    .line 2250
    .line 2251
    .line 2252
    .line 2253
    .line 2254
    .line 2255
    .line 2256
    .line 2257
    .line 2258
    .line 2259
    .line 2260
    .line 2261
    .line 2262
    .line 2263
    .line 2264
    .line 2265
    .line 2266
    .line 2267
    .line 2268
    .line 2269
    .line 2270
    .line 2271
    .line 2272
    .line 2273
    .line 2274
    .line 2275
    .line 2276
    .line 2277
    .line 2278
    .line 2279
    .line 2280
    .line 2281
    .line 2282
    .line 2283
    .line 2284
    .line 2285
    .line 2286
    .line 2287
    .line 2288
    .line 2289
    .line 2290
    .line 2291
    .line 2292
    .line 2293
    .line 2294
    .line 2295
    .line 2296
    .line 2297
    .line 2298
    .line 2299
    .line 2300
    .line 2301
    .line 2302
    .line 2303
    .line 2304
    .line 2305
    .line 2306
    .line 2307
    .line 2308
    .line 2309
    .line 2310
    .line 2311
    .line 2312
    .line 2313
    .line 2314
    .line 2315
    .line 2316
    .line 2317
    .line 2318
    .line 2319
    .line 2320
    .line 2321
    .line 2322
    .line 2323
    .line 2324
    .line 2325
    .line 2326
    .line 2327
    .line 2328
    .line 2329
    .line 2330
    .line 2331
    .line 2332
    .line 2333
    .line 2334
    .line 2335
    .line 2336
    .line 2337
    .line 2338
    .line 2339
    .line 2340
    .line 2341
    .line 2342
    .line 2343
    .line 2344
    .line 2345
    .line 2346
    .line 2347
    .line 2348
    .line 2349
    .line 2350
    .line 2351
    .line 2352
    .line 2353
    .line 2354
    .line 2355
    .line 2356
    .line 2357
    .line 2358
    .line 2359
    .line 2360
    .line 2361
    .line 2362
    .line 2363
    .line 2364
    .line 2365
    .line 2366
    .line 2367
    .line 2368
    .line 2369
    .line 2370
    .line 2371
    .line 2372
    .line 2373
    .line 2374
    .line 2375
    .line 2376
    .line 2377
    .line 2378
    .line 2379
    .line 2380
    .line 2381
    .line 2382
    .line 2383
    .line 2384
    .line 2385
    .line 2386
    .line 2387
    .line 2388
    .line 2389
    .line 2390
    .line 2391
    .line 2392
    .line 2393
    .line 2394
    .line 2395
    .line 2396
    .line 2397
    .line 2398
    .line 2399
    .line 2400
    .line 2401
    .line 2402
    .line 2403
    .line 2404
    .line 2405
    .line 2406
    .line 2407
    .line 2408
    .line 2409
    .line 2410
    .line 2411
    .line 2412
    .line 2413
    .line 2414
    .line 2415
    .line 2416
    .line 2417
    .line 2418
    .line 2419
    .line 2420
    .line 2421
    .line 2422
    .line 2423
    .line 2424
    .line 2425
    .line 2426
    .line 2427
    .line 2428
    .line 2429
    .line 2430
    .line 2431
    .line 2432
    .line 2433
    .line 2434
    .line 2435
    .line 2436
    .line 2437
    .line 2438
    .line 2439
    .line 2440
    .line 2441
    .line 2442
    .line 2443
    .line 2444
    .line 2445
    .line 2446
    .line 2447
    .line 2448
    .line 2449
    .line 2450
    .line 2451
    .line 2452
    .line 2453
    .line 2454
    .line 2455
    .line 2456
    .line 2457
    .line 2458
    .line 2459
    .line 2460
    .line 2461
    .line 2462
    .line 2463
    .line 2464
    .line 2465
    .line 2466
    .line 2467
    .line 2468
    .line 2469
    .line 2470
    .line 2471
    .line 2472
    .line 2473
    .line 2474
    .line 2475
    .line 2476
    .line 2477
    .line 2478
    .line 2479
    .line 2480
    .line 2481
    .line 2482
    .line 2483
    .line 2484
    .line 2485
    .line 2486
    .line 2487
    .line 2488
    .line 2489
    .line 2490
    .line 2491
    .line 2492
    .line 2493
    .line 2494
    .line 2495
    .line 2496
    .line 2497
    .line 2498
    .line 2499
    .line 2500
    .line 2501
    .line 2502
    .line 2503
    .line 2504
    .line 2505
    .line 2506
    .line 2507
    .line 2508
    .line 2509
    .line 2510
    .line 2511
    .line 2512
    .line 2513
    .line 2514
    .line 2515
    .line 2516
    .line 2517
    .line 2518
    .line 2519
    .line 2520
    .line 2521
    .line 2522
    .line 2523
    .line 2524
    .line 2525
    .line 2526
    .line 2527
    .line 2528
    .line 2529
    .line 2530
    .line 2531
    .line 2532
    .line 2533
    .line 2534
    .line 2535
    .line 2536
    .line 2537
    .line 2538
    .line 2539
    .line 2540
    .line 2541
    .line 2542
    .line 2543
    .line 2544
    .line 2545
    .line 2546
    .line 2547
    .line 2548
    .line 2549
    .line 2550
    .line 2551
    .line 2552
    .line 2553
    .line 2554
    .line 2555
    .line 2556
    .line 2557
    .line 2558
    .line 2559
    .line 2560
    .line 2561
    .line 2562
    .line 2563
    .line 2564
    .line 2565
    .line 2566
    .line 2567
    .line 2568
    .line 2569
    .line 2570
    .line 2571
    .line 2572
    .line 2573
    .line 2574
    .line 2575
    .line 2576
    .line 2577
    .line 2578
    .line 2579
    .line 2580
    .line 2581
    .line 2582
    .line 2583
    .line 2584
    .line 2585
    .line 2586
    .line 2587
    .line 2588
    .line 2589
    .line 2590
    .line 2591
    .line 2592
    .line 2593
    .line 2594
    .line 2595
    .line 2596
    .line 2597
    .line 2598
    .line 2599
    .line 2600
    .line 2601
    .line 2602
    .line 2603
    .line 2604
    .line 2605
    .line 2606
    .line 2607
    .line 2608
    .line 2609
    .line 2610
    .line 2611
    .line 2612
    .line 2613
    .line 2614
    .line 2615
    .line 2616
    .line 2617
    .line 2618
    .line 2619
    .line 2620
    .line 2621
    .line 2622
    .line 2623
    .line 2624
    .line 2625
    .line 2626
    .line 2627
    .line 2628
    .line 2629
    .line 2630
    .line 2631
    .line 2632
    .line 2633
    .line 2634
    .line 2635
    .line 2636
    .line 2637
    .line 2638
    .line 2639
    .line 2640
    .line 2641
    .line 2642
    .line 2643
    .line 2644
    .line 2645
    .line 2646
    .line 2647
    .line 2648
    .line 2649
    .line 2650
    .line 2651
    .line 2652
    .line 2653
    .line 2654
    .line 2655
    .line 2656
    .line 2657
    .line 2658
    .line 2659
    .line 2660
    .line 2661
    .line 2662
    .line 2663
    .line 2664
    .line 2665
    .line 2666
    .line 2667
    .line 2668
    .line 2669
    .line 2670
    .line 2671
    .line 2672
    .line 2673
    .line 2674
    .line 2675
    .line 2676
    .line 2677
    .line 2678
    .line 2679
    .line 2680
    .line 2681
    .line 2682
    .line 2683
    .line 2684
    .line 2685
    .line 2686
    .line 2687
    .line 2688
    .line 2689
    .line 2690
    .line 2691
    .line 2692
    .line 2693
    .line 2694
    .line 2695
    .line 2696
    .line 2697
    .line 2698
    .line 2699
    .line 2700
    .line 2701
    .line 2702
    .line 2703
    .line 2704
    .line 2705
    .line 2706
    .line 2707
    .line 2708
    .line 2709
    .line 2710
    .line 2711
    .line 2712
    .line 2713
    .line 2714
    .line 2715
    .line 2716
    .line 2717
    .line 2718
    .line 2719
    .line 2720
    .line 2721
    .line 2722
    .line 2723
    .line 2724
    .line 2725
    .line 2726
    .line 2727
    .line 2728
    .line 2729
    .line 2730
    .line 2731
    .line 2732
    .line 2733
    .line 2734
    .line 2735
    .line 2736
    .line 2737
    .line 2738
    .line 2739
    .line 2740
    .line 2741
    .line 2742
    .line 2743
    .line 2744
    .line 2745
    .line 2746
    .line 2747
    .line 2748
    .line 2749
    .line 2750
    .line 2751
    .line 2752
    .line 2753
    .line 2754
    .line 2755
    .line 2756
    .line 2757
    .line 2758
    .line 2759
    .line 2760
    .line 2761
    .line 2762
    .line 2763
    .line 2764
    .line 2765
    .line 2766
    .line 2767
    .line 2768
    .line 2769
    .line 2770
    .line 2771
    .line 2772
    .line 2773
    .line 2774
    .line 2775
    .line 2776
    .line 2777
    .line 2778
    .line 2779
    .line 2780
    .line 2781
    .line 2782
    .line 2783
    .line 2784
    .line 2785
    .line 2786
    .line 2787
    .line 2788
    .line 2789
    .line 2790
.end method

.method public final c1(I)V
    .locals 2

    .line 1
    if-eqz p1, :cond_1

    .line 2
    .line 3
    const/4 v0, 0x1

    .line 4
    if-ne p1, v0, :cond_0

    .line 5
    .line 6
    goto :goto_0

    .line 7
    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 8
    .line 9
    const-string v1, "invalid orientation:"

    .line 10
    .line 11
    invoke-static {v1, p1}, Landroidx/activity/j;->a(Ljava/lang/String;I)Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    throw v0

    .line 19
    :cond_1
    :goto_0
    const/4 v0, 0x0

    .line 20
    invoke-virtual {p0, v0}, Landroidx/recyclerview/widget/LinearLayoutManager;->c(Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    iget v0, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->p:I

    .line 24
    .line 25
    if-ne p1, v0, :cond_2

    .line 26
    .line 27
    iget-object v0, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->r:Landroidx/recyclerview/widget/s;

    .line 28
    .line 29
    if-nez v0, :cond_3

    .line 30
    .line 31
    :cond_2
    invoke-static {p0, p1}, Landroidx/recyclerview/widget/s;->a(Landroidx/recyclerview/widget/RecyclerView$l;I)Landroidx/recyclerview/widget/s;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    iput-object v0, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->r:Landroidx/recyclerview/widget/s;

    .line 36
    .line 37
    iget-object v1, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->A:Landroidx/recyclerview/widget/LinearLayoutManager$a;

    .line 38
    .line 39
    iput-object v0, v1, Landroidx/recyclerview/widget/LinearLayoutManager$a;->a:Landroidx/recyclerview/widget/s;

    .line 40
    .line 41
    iput p1, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->p:I

    .line 42
    .line 43
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$l;->n0()V

    .line 44
    .line 45
    .line 46
    :cond_3
    return-void
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

.method public final d()Z
    .locals 1

    iget v0, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->p:I

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public d0(Landroidx/recyclerview/widget/RecyclerView$x;)V
    .locals 0

    const/4 p1, 0x0

    iput-object p1, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->z:Landroidx/recyclerview/widget/LinearLayoutManager$d;

    const/4 p1, -0x1

    iput p1, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->x:I

    const/high16 p1, -0x80000000

    iput p1, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->y:I

    iget-object p1, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->A:Landroidx/recyclerview/widget/LinearLayoutManager$a;

    invoke-virtual {p1}, Landroidx/recyclerview/widget/LinearLayoutManager$a;->c()V

    return-void
.end method

.method public d1(Z)V
    .locals 1

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Landroidx/recyclerview/widget/LinearLayoutManager;->c(Ljava/lang/String;)V

    iget-boolean v0, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->v:Z

    if-ne v0, p1, :cond_0

    return-void

    :cond_0
    iput-boolean p1, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->v:Z

    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$l;->n0()V

    return-void
.end method

.method public final e()Z
    .locals 2

    iget v0, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->p:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    return v1
.end method

.method public final e0(Landroid/os/Parcelable;)V
    .locals 1

    instance-of v0, p1, Landroidx/recyclerview/widget/LinearLayoutManager$d;

    if-eqz v0, :cond_0

    check-cast p1, Landroidx/recyclerview/widget/LinearLayoutManager$d;

    iput-object p1, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->z:Landroidx/recyclerview/widget/LinearLayoutManager$d;

    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$l;->n0()V

    :cond_0
    return-void
.end method

.method public final e1(IIZLandroidx/recyclerview/widget/RecyclerView$x;)V
    .locals 4

    .line 1
    iget-object v0, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->q:Landroidx/recyclerview/widget/LinearLayoutManager$c;

    .line 2
    .line 3
    iget-object v1, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->r:Landroidx/recyclerview/widget/s;

    .line 4
    .line 5
    invoke-virtual {v1}, Landroidx/recyclerview/widget/s;->i()I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    const/4 v2, 0x1

    .line 10
    const/4 v3, 0x0

    .line 11
    if-nez v1, :cond_0

    .line 12
    .line 13
    iget-object v1, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->r:Landroidx/recyclerview/widget/s;

    .line 14
    .line 15
    invoke-virtual {v1}, Landroidx/recyclerview/widget/s;->f()I

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    if-nez v1, :cond_0

    .line 20
    .line 21
    move v1, v2

    .line 22
    goto :goto_0

    .line 23
    :cond_0
    move v1, v3

    .line 24
    :goto_0
    iput-boolean v1, v0, Landroidx/recyclerview/widget/LinearLayoutManager$c;->l:Z

    .line 25
    .line 26
    iget-object v0, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->q:Landroidx/recyclerview/widget/LinearLayoutManager$c;

    .line 27
    .line 28
    iput p1, v0, Landroidx/recyclerview/widget/LinearLayoutManager$c;->f:I

    .line 29
    .line 30
    iget-object v0, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->D:[I

    .line 31
    .line 32
    aput v3, v0, v3

    .line 33
    .line 34
    aput v3, v0, v2

    .line 35
    .line 36
    invoke-virtual {p0, p4, v0}, Landroidx/recyclerview/widget/LinearLayoutManager;->C0(Landroidx/recyclerview/widget/RecyclerView$x;[I)V

    .line 37
    .line 38
    .line 39
    aget p4, v0, v3

    .line 40
    .line 41
    invoke-static {v3, p4}, Ljava/lang/Math;->max(II)I

    .line 42
    .line 43
    .line 44
    move-result p4

    .line 45
    aget v0, v0, v2

    .line 46
    .line 47
    invoke-static {v3, v0}, Ljava/lang/Math;->max(II)I

    .line 48
    .line 49
    .line 50
    move-result v0

    .line 51
    if-ne p1, v2, :cond_1

    .line 52
    .line 53
    move v3, v2

    .line 54
    :cond_1
    iget-object p1, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->q:Landroidx/recyclerview/widget/LinearLayoutManager$c;

    .line 55
    .line 56
    if-eqz v3, :cond_2

    .line 57
    .line 58
    move v1, v0

    .line 59
    goto :goto_1

    .line 60
    :cond_2
    move v1, p4

    .line 61
    :goto_1
    iput v1, p1, Landroidx/recyclerview/widget/LinearLayoutManager$c;->h:I

    .line 62
    .line 63
    if-eqz v3, :cond_3

    .line 64
    .line 65
    goto :goto_2

    .line 66
    :cond_3
    move p4, v0

    .line 67
    :goto_2
    iput p4, p1, Landroidx/recyclerview/widget/LinearLayoutManager$c;->i:I

    .line 68
    .line 69
    const/4 p4, -0x1

    .line 70
    if-eqz v3, :cond_5

    .line 71
    .line 72
    iget-object v0, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->r:Landroidx/recyclerview/widget/s;

    .line 73
    .line 74
    invoke-virtual {v0}, Landroidx/recyclerview/widget/s;->h()I

    .line 75
    .line 76
    .line 77
    move-result v0

    .line 78
    add-int/2addr v0, v1

    .line 79
    iput v0, p1, Landroidx/recyclerview/widget/LinearLayoutManager$c;->h:I

    .line 80
    .line 81
    invoke-virtual {p0}, Landroidx/recyclerview/widget/LinearLayoutManager;->T0()Landroid/view/View;

    .line 82
    .line 83
    .line 84
    move-result-object p1

    .line 85
    iget-object v0, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->q:Landroidx/recyclerview/widget/LinearLayoutManager$c;

    .line 86
    .line 87
    iget-boolean v1, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->u:Z

    .line 88
    .line 89
    if-eqz v1, :cond_4

    .line 90
    .line 91
    move v2, p4

    .line 92
    :cond_4
    iput v2, v0, Landroidx/recyclerview/widget/LinearLayoutManager$c;->e:I

    .line 93
    .line 94
    invoke-static {p1}, Landroidx/recyclerview/widget/RecyclerView$l;->G(Landroid/view/View;)I

    .line 95
    .line 96
    .line 97
    move-result p4

    .line 98
    iget-object v1, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->q:Landroidx/recyclerview/widget/LinearLayoutManager$c;

    .line 99
    .line 100
    iget v2, v1, Landroidx/recyclerview/widget/LinearLayoutManager$c;->e:I

    .line 101
    .line 102
    add-int/2addr p4, v2

    .line 103
    iput p4, v0, Landroidx/recyclerview/widget/LinearLayoutManager$c;->d:I

    .line 104
    .line 105
    iget-object p4, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->r:Landroidx/recyclerview/widget/s;

    .line 106
    .line 107
    invoke-virtual {p4, p1}, Landroidx/recyclerview/widget/s;->b(Landroid/view/View;)I

    .line 108
    .line 109
    .line 110
    move-result p4

    .line 111
    iput p4, v1, Landroidx/recyclerview/widget/LinearLayoutManager$c;->b:I

    .line 112
    .line 113
    iget-object p4, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->r:Landroidx/recyclerview/widget/s;

    .line 114
    .line 115
    invoke-virtual {p4, p1}, Landroidx/recyclerview/widget/s;->b(Landroid/view/View;)I

    .line 116
    .line 117
    .line 118
    move-result p1

    .line 119
    iget-object p4, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->r:Landroidx/recyclerview/widget/s;

    .line 120
    .line 121
    invoke-virtual {p4}, Landroidx/recyclerview/widget/s;->g()I

    .line 122
    .line 123
    .line 124
    move-result p4

    .line 125
    sub-int/2addr p1, p4

    .line 126
    goto :goto_4

    .line 127
    :cond_5
    invoke-virtual {p0}, Landroidx/recyclerview/widget/LinearLayoutManager;->U0()Landroid/view/View;

    .line 128
    .line 129
    .line 130
    move-result-object p1

    .line 131
    iget-object v0, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->q:Landroidx/recyclerview/widget/LinearLayoutManager$c;

    .line 132
    .line 133
    iget v1, v0, Landroidx/recyclerview/widget/LinearLayoutManager$c;->h:I

    .line 134
    .line 135
    iget-object v3, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->r:Landroidx/recyclerview/widget/s;

    .line 136
    .line 137
    invoke-virtual {v3}, Landroidx/recyclerview/widget/s;->k()I

    .line 138
    .line 139
    .line 140
    move-result v3

    .line 141
    add-int/2addr v3, v1

    .line 142
    iput v3, v0, Landroidx/recyclerview/widget/LinearLayoutManager$c;->h:I

    .line 143
    .line 144
    iget-object v0, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->q:Landroidx/recyclerview/widget/LinearLayoutManager$c;

    .line 145
    .line 146
    iget-boolean v1, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->u:Z

    .line 147
    .line 148
    if-eqz v1, :cond_6

    .line 149
    .line 150
    goto :goto_3

    .line 151
    :cond_6
    move v2, p4

    .line 152
    :goto_3
    iput v2, v0, Landroidx/recyclerview/widget/LinearLayoutManager$c;->e:I

    .line 153
    .line 154
    invoke-static {p1}, Landroidx/recyclerview/widget/RecyclerView$l;->G(Landroid/view/View;)I

    .line 155
    .line 156
    .line 157
    move-result p4

    .line 158
    iget-object v1, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->q:Landroidx/recyclerview/widget/LinearLayoutManager$c;

    .line 159
    .line 160
    iget v2, v1, Landroidx/recyclerview/widget/LinearLayoutManager$c;->e:I

    .line 161
    .line 162
    add-int/2addr p4, v2

    .line 163
    iput p4, v0, Landroidx/recyclerview/widget/LinearLayoutManager$c;->d:I

    .line 164
    .line 165
    iget-object p4, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->r:Landroidx/recyclerview/widget/s;

    .line 166
    .line 167
    invoke-virtual {p4, p1}, Landroidx/recyclerview/widget/s;->e(Landroid/view/View;)I

    .line 168
    .line 169
    .line 170
    move-result p4

    .line 171
    iput p4, v1, Landroidx/recyclerview/widget/LinearLayoutManager$c;->b:I

    .line 172
    .line 173
    iget-object p4, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->r:Landroidx/recyclerview/widget/s;

    .line 174
    .line 175
    invoke-virtual {p4, p1}, Landroidx/recyclerview/widget/s;->e(Landroid/view/View;)I

    .line 176
    .line 177
    .line 178
    move-result p1

    .line 179
    neg-int p1, p1

    .line 180
    iget-object p4, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->r:Landroidx/recyclerview/widget/s;

    .line 181
    .line 182
    invoke-virtual {p4}, Landroidx/recyclerview/widget/s;->k()I

    .line 183
    .line 184
    .line 185
    move-result p4

    .line 186
    add-int/2addr p1, p4

    .line 187
    :goto_4
    iget-object p4, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->q:Landroidx/recyclerview/widget/LinearLayoutManager$c;

    .line 188
    .line 189
    iput p2, p4, Landroidx/recyclerview/widget/LinearLayoutManager$c;->c:I

    .line 190
    .line 191
    if-eqz p3, :cond_7

    .line 192
    .line 193
    sub-int/2addr p2, p1

    .line 194
    iput p2, p4, Landroidx/recyclerview/widget/LinearLayoutManager$c;->c:I

    .line 195
    .line 196
    :cond_7
    iput p1, p4, Landroidx/recyclerview/widget/LinearLayoutManager$c;->g:I

    .line 197
    .line 198
    return-void
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
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
    .line 358
    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
    .line 371
    .line 372
    .line 373
    .line 374
    .line 375
    .line 376
    .line 377
    .line 378
    .line 379
    .line 380
    .line 381
    .line 382
    .line 383
    .line 384
    .line 385
    .line 386
    .line 387
    .line 388
    .line 389
    .line 390
    .line 391
    .line 392
    .line 393
    .line 394
    .line 395
    .line 396
    .line 397
    .line 398
    .line 399
    .line 400
    .line 401
    .line 402
    .line 403
    .line 404
    .line 405
    .line 406
    .line 407
    .line 408
    .line 409
    .line 410
    .line 411
    .line 412
    .line 413
    .line 414
    .line 415
    .line 416
    .line 417
    .line 418
    .line 419
    .line 420
    .line 421
    .line 422
    .line 423
    .line 424
    .line 425
    .line 426
    .line 427
    .line 428
    .line 429
    .line 430
    .line 431
    .line 432
    .line 433
    .line 434
    .line 435
    .line 436
    .line 437
    .line 438
    .line 439
    .line 440
    .line 441
    .line 442
    .line 443
    .line 444
    .line 445
    .line 446
    .line 447
    .line 448
    .line 449
    .line 450
    .line 451
    .line 452
    .line 453
    .line 454
    .line 455
    .line 456
    .line 457
    .line 458
    .line 459
    .line 460
    .line 461
    .line 462
    .line 463
    .line 464
    .line 465
    .line 466
    .line 467
    .line 468
    .line 469
    .line 470
    .line 471
    .line 472
    .line 473
    .line 474
    .line 475
    .line 476
    .line 477
    .line 478
    .line 479
    .line 480
    .line 481
    .line 482
    .line 483
    .line 484
    .line 485
    .line 486
    .line 487
    .line 488
    .line 489
    .line 490
    .line 491
    .line 492
    .line 493
    .line 494
    .line 495
    .line 496
    .line 497
    .line 498
    .line 499
    .line 500
    .line 501
    .line 502
    .line 503
    .line 504
    .line 505
    .line 506
    .line 507
    .line 508
    .line 509
    .line 510
    .line 511
    .line 512
    .line 513
    .line 514
    .line 515
    .line 516
    .line 517
    .line 518
    .line 519
    .line 520
    .line 521
    .line 522
    .line 523
    .line 524
    .line 525
    .line 526
    .line 527
    .line 528
    .line 529
    .line 530
    .line 531
    .line 532
    .line 533
    .line 534
    .line 535
    .line 536
    .line 537
    .line 538
    .line 539
    .line 540
    .line 541
    .line 542
    .line 543
    .line 544
    .line 545
    .line 546
    .line 547
    .line 548
    .line 549
    .line 550
    .line 551
    .line 552
    .line 553
    .line 554
    .line 555
    .line 556
    .line 557
    .line 558
    .line 559
    .line 560
    .line 561
    .line 562
    .line 563
    .line 564
    .line 565
    .line 566
    .line 567
    .line 568
    .line 569
    .line 570
    .line 571
    .line 572
    .line 573
    .line 574
    .line 575
    .line 576
    .line 577
    .line 578
    .line 579
    .line 580
    .line 581
    .line 582
    .line 583
    .line 584
    .line 585
    .line 586
    .line 587
    .line 588
    .line 589
    .line 590
    .line 591
    .line 592
    .line 593
    .line 594
    .line 595
    .line 596
    .line 597
    .line 598
    .line 599
    .line 600
    .line 601
    .line 602
    .line 603
    .line 604
    .line 605
    .line 606
    .line 607
    .line 608
    .line 609
    .line 610
    .line 611
    .line 612
    .line 613
    .line 614
    .line 615
    .line 616
    .line 617
    .line 618
    .line 619
    .line 620
    .line 621
    .line 622
    .line 623
    .line 624
    .line 625
    .line 626
    .line 627
    .line 628
    .line 629
    .line 630
    .line 631
    .line 632
    .line 633
    .line 634
    .line 635
    .line 636
    .line 637
    .line 638
    .line 639
    .line 640
    .line 641
    .line 642
    .line 643
    .line 644
    .line 645
    .line 646
    .line 647
    .line 648
    .line 649
    .line 650
    .line 651
    .line 652
    .line 653
    .line 654
    .line 655
    .line 656
    .line 657
    .line 658
    .line 659
    .line 660
    .line 661
    .line 662
    .line 663
    .line 664
    .line 665
    .line 666
    .line 667
    .line 668
    .line 669
    .line 670
    .line 671
    .line 672
    .line 673
    .line 674
    .line 675
    .line 676
    .line 677
    .line 678
    .line 679
    .line 680
    .line 681
    .line 682
    .line 683
    .line 684
    .line 685
    .line 686
    .line 687
    .line 688
    .line 689
    .line 690
    .line 691
    .line 692
    .line 693
    .line 694
    .line 695
    .line 696
    .line 697
    .line 698
    .line 699
    .line 700
    .line 701
    .line 702
    .line 703
    .line 704
    .line 705
    .line 706
    .line 707
    .line 708
    .line 709
    .line 710
    .line 711
    .line 712
    .line 713
    .line 714
    .line 715
    .line 716
    .line 717
    .line 718
    .line 719
    .line 720
    .line 721
    .line 722
    .line 723
    .line 724
    .line 725
    .line 726
    .line 727
    .line 728
    .line 729
    .line 730
    .line 731
    .line 732
    .line 733
    .line 734
    .line 735
    .line 736
    .line 737
    .line 738
    .line 739
    .line 740
    .line 741
    .line 742
    .line 743
    .line 744
    .line 745
    .line 746
    .line 747
    .line 748
    .line 749
    .line 750
    .line 751
    .line 752
    .line 753
    .line 754
    .line 755
    .line 756
    .line 757
    .line 758
    .line 759
    .line 760
    .line 761
    .line 762
    .line 763
    .line 764
    .line 765
    .line 766
    .line 767
    .line 768
    .line 769
    .line 770
    .line 771
    .line 772
    .line 773
    .line 774
    .line 775
    .line 776
    .line 777
    .line 778
    .line 779
    .line 780
    .line 781
    .line 782
    .line 783
    .line 784
    .line 785
    .line 786
    .line 787
    .line 788
    .line 789
    .line 790
    .line 791
    .line 792
    .line 793
    .line 794
    .line 795
    .line 796
    .line 797
    .line 798
    .line 799
    .line 800
    .line 801
    .line 802
    .line 803
    .line 804
    .line 805
    .line 806
    .line 807
    .line 808
    .line 809
    .line 810
    .line 811
    .line 812
    .line 813
    .line 814
    .line 815
    .line 816
    .line 817
    .line 818
    .line 819
    .line 820
    .line 821
    .line 822
    .line 823
    .line 824
    .line 825
    .line 826
    .line 827
    .line 828
    .line 829
    .line 830
    .line 831
    .line 832
    .line 833
    .line 834
    .line 835
    .line 836
    .line 837
    .line 838
    .line 839
    .line 840
    .line 841
    .line 842
    .line 843
    .line 844
    .line 845
    .line 846
    .line 847
    .line 848
    .line 849
    .line 850
    .line 851
    .line 852
    .line 853
    .line 854
    .line 855
    .line 856
    .line 857
    .line 858
    .line 859
    .line 860
    .line 861
    .line 862
    .line 863
    .line 864
    .line 865
    .line 866
    .line 867
    .line 868
    .line 869
    .line 870
    .line 871
    .line 872
    .line 873
    .line 874
    .line 875
    .line 876
    .line 877
    .line 878
    .line 879
    .line 880
    .line 881
    .line 882
    .line 883
    .line 884
    .line 885
    .line 886
    .line 887
    .line 888
    .line 889
    .line 890
    .line 891
    .line 892
    .line 893
    .line 894
    .line 895
    .line 896
    .line 897
    .line 898
    .line 899
    .line 900
    .line 901
    .line 902
    .line 903
    .line 904
    .line 905
    .line 906
    .line 907
    .line 908
    .line 909
    .line 910
    .line 911
    .line 912
    .line 913
    .line 914
    .line 915
    .line 916
    .line 917
    .line 918
    .line 919
    .line 920
    .line 921
    .line 922
    .line 923
    .line 924
    .line 925
    .line 926
    .line 927
    .line 928
    .line 929
    .line 930
    .line 931
    .line 932
    .line 933
    .line 934
    .line 935
    .line 936
    .line 937
    .line 938
    .line 939
    .line 940
    .line 941
    .line 942
    .line 943
    .line 944
    .line 945
    .line 946
    .line 947
    .line 948
    .line 949
    .line 950
    .line 951
    .line 952
    .line 953
    .line 954
    .line 955
    .line 956
    .line 957
    .line 958
    .line 959
    .line 960
    .line 961
    .line 962
    .line 963
    .line 964
    .line 965
    .line 966
    .line 967
    .line 968
    .line 969
    .line 970
    .line 971
    .line 972
    .line 973
    .line 974
    .line 975
    .line 976
    .line 977
    .line 978
    .line 979
    .line 980
    .line 981
    .line 982
    .line 983
    .line 984
    .line 985
    .line 986
    .line 987
    .line 988
    .line 989
    .line 990
    .line 991
    .line 992
    .line 993
    .line 994
    .line 995
    .line 996
    .line 997
    .line 998
    .line 999
    .line 1000
    .line 1001
    .line 1002
    .line 1003
    .line 1004
    .line 1005
    .line 1006
    .line 1007
    .line 1008
    .line 1009
    .line 1010
    .line 1011
    .line 1012
    .line 1013
    .line 1014
    .line 1015
    .line 1016
    .line 1017
    .line 1018
    .line 1019
    .line 1020
    .line 1021
    .line 1022
    .line 1023
    .line 1024
    .line 1025
    .line 1026
    .line 1027
    .line 1028
    .line 1029
    .line 1030
    .line 1031
    .line 1032
    .line 1033
    .line 1034
    .line 1035
    .line 1036
    .line 1037
    .line 1038
.end method

.method public final f0()Landroid/os/Parcelable;
    .locals 4

    .line 1
    iget-object v0, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->z:Landroidx/recyclerview/widget/LinearLayoutManager$d;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    new-instance v1, Landroidx/recyclerview/widget/LinearLayoutManager$d;

    .line 6
    .line 7
    invoke-direct {v1, v0}, Landroidx/recyclerview/widget/LinearLayoutManager$d;-><init>(Landroidx/recyclerview/widget/LinearLayoutManager$d;)V

    .line 8
    .line 9
    .line 10
    return-object v1

    .line 11
    :cond_0
    new-instance v0, Landroidx/recyclerview/widget/LinearLayoutManager$d;

    .line 12
    .line 13
    invoke-direct {v0}, Landroidx/recyclerview/widget/LinearLayoutManager$d;-><init>()V

    .line 14
    .line 15
    .line 16
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$l;->w()I

    .line 17
    .line 18
    .line 19
    move-result v1

    .line 20
    if-lez v1, :cond_2

    .line 21
    .line 22
    invoke-virtual {p0}, Landroidx/recyclerview/widget/LinearLayoutManager;->I0()V

    .line 23
    .line 24
    .line 25
    iget-boolean v1, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->s:Z

    .line 26
    .line 27
    iget-boolean v2, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->u:Z

    .line 28
    .line 29
    xor-int/2addr v1, v2

    .line 30
    iput-boolean v1, v0, Landroidx/recyclerview/widget/LinearLayoutManager$d;->d:Z

    .line 31
    .line 32
    if-eqz v1, :cond_1

    .line 33
    .line 34
    invoke-virtual {p0}, Landroidx/recyclerview/widget/LinearLayoutManager;->T0()Landroid/view/View;

    .line 35
    .line 36
    .line 37
    move-result-object v1

    .line 38
    iget-object v2, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->r:Landroidx/recyclerview/widget/s;

    .line 39
    .line 40
    invoke-virtual {v2}, Landroidx/recyclerview/widget/s;->g()I

    .line 41
    .line 42
    .line 43
    move-result v2

    .line 44
    iget-object v3, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->r:Landroidx/recyclerview/widget/s;

    .line 45
    .line 46
    invoke-virtual {v3, v1}, Landroidx/recyclerview/widget/s;->b(Landroid/view/View;)I

    .line 47
    .line 48
    .line 49
    move-result v3

    .line 50
    sub-int/2addr v2, v3

    .line 51
    iput v2, v0, Landroidx/recyclerview/widget/LinearLayoutManager$d;->c:I

    .line 52
    .line 53
    invoke-static {v1}, Landroidx/recyclerview/widget/RecyclerView$l;->G(Landroid/view/View;)I

    .line 54
    .line 55
    .line 56
    move-result v1

    .line 57
    iput v1, v0, Landroidx/recyclerview/widget/LinearLayoutManager$d;->b:I

    .line 58
    .line 59
    goto :goto_0

    .line 60
    :cond_1
    invoke-virtual {p0}, Landroidx/recyclerview/widget/LinearLayoutManager;->U0()Landroid/view/View;

    .line 61
    .line 62
    .line 63
    move-result-object v1

    .line 64
    invoke-static {v1}, Landroidx/recyclerview/widget/RecyclerView$l;->G(Landroid/view/View;)I

    .line 65
    .line 66
    .line 67
    move-result v2

    .line 68
    iput v2, v0, Landroidx/recyclerview/widget/LinearLayoutManager$d;->b:I

    .line 69
    .line 70
    iget-object v2, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->r:Landroidx/recyclerview/widget/s;

    .line 71
    .line 72
    invoke-virtual {v2, v1}, Landroidx/recyclerview/widget/s;->e(Landroid/view/View;)I

    .line 73
    .line 74
    .line 75
    move-result v1

    .line 76
    iget-object v2, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->r:Landroidx/recyclerview/widget/s;

    .line 77
    .line 78
    invoke-virtual {v2}, Landroidx/recyclerview/widget/s;->k()I

    .line 79
    .line 80
    .line 81
    move-result v2

    .line 82
    sub-int/2addr v1, v2

    .line 83
    iput v1, v0, Landroidx/recyclerview/widget/LinearLayoutManager$d;->c:I

    .line 84
    .line 85
    goto :goto_0

    .line 86
    :cond_2
    const/4 v1, -0x1

    .line 87
    iput v1, v0, Landroidx/recyclerview/widget/LinearLayoutManager$d;->b:I

    .line 88
    .line 89
    :goto_0
    return-object v0
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

.method public final f1(II)V
    .locals 3

    iget-object v0, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->q:Landroidx/recyclerview/widget/LinearLayoutManager$c;

    iget-object v1, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->r:Landroidx/recyclerview/widget/s;

    invoke-virtual {v1}, Landroidx/recyclerview/widget/s;->g()I

    move-result v1

    sub-int/2addr v1, p2

    iput v1, v0, Landroidx/recyclerview/widget/LinearLayoutManager$c;->c:I

    iget-object v0, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->q:Landroidx/recyclerview/widget/LinearLayoutManager$c;

    iget-boolean v1, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->u:Z

    const/4 v2, 0x1

    if-eqz v1, :cond_0

    const/4 v1, -0x1

    goto :goto_0

    :cond_0
    move v1, v2

    :goto_0
    iput v1, v0, Landroidx/recyclerview/widget/LinearLayoutManager$c;->e:I

    iput p1, v0, Landroidx/recyclerview/widget/LinearLayoutManager$c;->d:I

    iput v2, v0, Landroidx/recyclerview/widget/LinearLayoutManager$c;->f:I

    iput p2, v0, Landroidx/recyclerview/widget/LinearLayoutManager$c;->b:I

    const/high16 p1, -0x80000000

    iput p1, v0, Landroidx/recyclerview/widget/LinearLayoutManager$c;->g:I

    return-void
.end method

.method public final g1(II)V
    .locals 2

    iget-object v0, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->q:Landroidx/recyclerview/widget/LinearLayoutManager$c;

    iget-object v1, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->r:Landroidx/recyclerview/widget/s;

    invoke-virtual {v1}, Landroidx/recyclerview/widget/s;->k()I

    move-result v1

    sub-int v1, p2, v1

    iput v1, v0, Landroidx/recyclerview/widget/LinearLayoutManager$c;->c:I

    iget-object v0, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->q:Landroidx/recyclerview/widget/LinearLayoutManager$c;

    iput p1, v0, Landroidx/recyclerview/widget/LinearLayoutManager$c;->d:I

    iget-boolean p1, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->u:Z

    const/4 v1, -0x1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    move p1, v1

    :goto_0
    iput p1, v0, Landroidx/recyclerview/widget/LinearLayoutManager$c;->e:I

    iput v1, v0, Landroidx/recyclerview/widget/LinearLayoutManager$c;->f:I

    iput p2, v0, Landroidx/recyclerview/widget/LinearLayoutManager$c;->b:I

    const/high16 p1, -0x80000000

    iput p1, v0, Landroidx/recyclerview/widget/LinearLayoutManager$c;->g:I

    return-void
.end method

.method public final h(IILandroidx/recyclerview/widget/RecyclerView$x;Landroidx/recyclerview/widget/RecyclerView$l$c;)V
    .locals 1

    iget v0, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->p:I

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    move p1, p2

    :goto_0
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$l;->w()I

    move-result p2

    if-eqz p2, :cond_3

    if-nez p1, :cond_1

    goto :goto_2

    :cond_1
    invoke-virtual {p0}, Landroidx/recyclerview/widget/LinearLayoutManager;->I0()V

    const/4 p2, 0x1

    if-lez p1, :cond_2

    move v0, p2

    goto :goto_1

    :cond_2
    const/4 v0, -0x1

    :goto_1
    invoke-static {p1}, Ljava/lang/Math;->abs(I)I

    move-result p1

    invoke-virtual {p0, v0, p1, p2, p3}, Landroidx/recyclerview/widget/LinearLayoutManager;->e1(IIZLandroidx/recyclerview/widget/RecyclerView$x;)V

    iget-object p1, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->q:Landroidx/recyclerview/widget/LinearLayoutManager$c;

    invoke-virtual {p0, p3, p1, p4}, Landroidx/recyclerview/widget/LinearLayoutManager;->D0(Landroidx/recyclerview/widget/RecyclerView$x;Landroidx/recyclerview/widget/LinearLayoutManager$c;Landroidx/recyclerview/widget/RecyclerView$l$c;)V

    :cond_3
    :goto_2
    return-void
.end method

.method public final i(ILandroidx/recyclerview/widget/RecyclerView$l$c;)V
    .locals 6

    .line 1
    iget-object v0, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->z:Landroidx/recyclerview/widget/LinearLayoutManager$d;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    const/4 v2, -0x1

    .line 5
    const/4 v3, 0x0

    .line 6
    if-eqz v0, :cond_1

    .line 7
    .line 8
    iget v4, v0, Landroidx/recyclerview/widget/LinearLayoutManager$d;->b:I

    .line 9
    .line 10
    if-ltz v4, :cond_0

    .line 11
    .line 12
    move v5, v1

    .line 13
    goto :goto_0

    .line 14
    :cond_0
    move v5, v3

    .line 15
    :goto_0
    if-eqz v5, :cond_1

    .line 16
    .line 17
    iget-boolean v0, v0, Landroidx/recyclerview/widget/LinearLayoutManager$d;->d:Z

    .line 18
    .line 19
    goto :goto_1

    .line 20
    :cond_1
    invoke-virtual {p0}, Landroidx/recyclerview/widget/LinearLayoutManager;->a1()V

    .line 21
    .line 22
    .line 23
    iget-boolean v0, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->u:Z

    .line 24
    .line 25
    iget v4, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->x:I

    .line 26
    .line 27
    if-ne v4, v2, :cond_3

    .line 28
    .line 29
    if-eqz v0, :cond_2

    .line 30
    .line 31
    add-int/lit8 v4, p1, -0x1

    .line 32
    .line 33
    goto :goto_1

    .line 34
    :cond_2
    move v4, v3

    .line 35
    :cond_3
    :goto_1
    if-eqz v0, :cond_4

    .line 36
    .line 37
    move v1, v2

    .line 38
    :cond_4
    move v0, v3

    .line 39
    :goto_2
    iget v2, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->C:I

    .line 40
    .line 41
    if-ge v0, v2, :cond_5

    .line 42
    .line 43
    if-ltz v4, :cond_5

    .line 44
    .line 45
    if-ge v4, p1, :cond_5

    .line 46
    .line 47
    move-object v2, p2

    .line 48
    check-cast v2, Landroidx/recyclerview/widget/m$b;

    .line 49
    .line 50
    invoke-virtual {v2, v4, v3}, Landroidx/recyclerview/widget/m$b;->a(II)V

    .line 51
    .line 52
    .line 53
    add-int/2addr v4, v1

    .line 54
    add-int/lit8 v0, v0, 0x1

    .line 55
    .line 56
    goto :goto_2

    .line 57
    :cond_5
    return-void
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

.method public final j(Landroidx/recyclerview/widget/RecyclerView$x;)I
    .locals 0

    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/LinearLayoutManager;->E0(Landroidx/recyclerview/widget/RecyclerView$x;)I

    move-result p1

    return p1
.end method

.method public k(Landroidx/recyclerview/widget/RecyclerView$x;)I
    .locals 0

    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/LinearLayoutManager;->F0(Landroidx/recyclerview/widget/RecyclerView$x;)I

    move-result p1

    return p1
.end method

.method public l(Landroidx/recyclerview/widget/RecyclerView$x;)I
    .locals 0

    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/LinearLayoutManager;->G0(Landroidx/recyclerview/widget/RecyclerView$x;)I

    move-result p1

    return p1
.end method

.method public final m(Landroidx/recyclerview/widget/RecyclerView$x;)I
    .locals 0

    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/LinearLayoutManager;->E0(Landroidx/recyclerview/widget/RecyclerView$x;)I

    move-result p1

    return p1
.end method

.method public n(Landroidx/recyclerview/widget/RecyclerView$x;)I
    .locals 0

    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/LinearLayoutManager;->F0(Landroidx/recyclerview/widget/RecyclerView$x;)I

    move-result p1

    return p1
.end method

.method public o(Landroidx/recyclerview/widget/RecyclerView$x;)I
    .locals 0

    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/LinearLayoutManager;->G0(Landroidx/recyclerview/widget/RecyclerView$x;)I

    move-result p1

    return p1
.end method

.method public o0(ILandroidx/recyclerview/widget/RecyclerView$s;Landroidx/recyclerview/widget/RecyclerView$x;)I
    .locals 2

    iget v0, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->p:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    invoke-virtual {p0, p1, p2, p3}, Landroidx/recyclerview/widget/LinearLayoutManager;->b1(ILandroidx/recyclerview/widget/RecyclerView$s;Landroidx/recyclerview/widget/RecyclerView$x;)I

    move-result p1

    return p1
.end method

.method public final p0(I)V
    .locals 1

    .line 1
    iput p1, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->x:I

    .line 2
    .line 3
    const/high16 p1, -0x80000000

    .line 4
    .line 5
    iput p1, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->y:I

    .line 6
    .line 7
    iget-object p1, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->z:Landroidx/recyclerview/widget/LinearLayoutManager$d;

    .line 8
    .line 9
    if-eqz p1, :cond_0

    .line 10
    .line 11
    const/4 v0, -0x1

    .line 12
    iput v0, p1, Landroidx/recyclerview/widget/LinearLayoutManager$d;->b:I

    .line 13
    .line 14
    :cond_0
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$l;->n0()V

    .line 15
    .line 16
    .line 17
    return-void
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

.method public final q(I)Landroid/view/View;
    .locals 2

    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$l;->w()I

    move-result v0

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return-object p1

    :cond_0
    const/4 v1, 0x0

    invoke-virtual {p0, v1}, Landroidx/recyclerview/widget/RecyclerView$l;->v(I)Landroid/view/View;

    move-result-object v1

    invoke-static {v1}, Landroidx/recyclerview/widget/RecyclerView$l;->G(Landroid/view/View;)I

    move-result v1

    sub-int v1, p1, v1

    if-ltz v1, :cond_1

    if-ge v1, v0, :cond_1

    invoke-virtual {p0, v1}, Landroidx/recyclerview/widget/RecyclerView$l;->v(I)Landroid/view/View;

    move-result-object v0

    invoke-static {v0}, Landroidx/recyclerview/widget/RecyclerView$l;->G(Landroid/view/View;)I

    move-result v1

    if-ne v1, p1, :cond_1

    return-object v0

    :cond_1
    invoke-super {p0, p1}, Landroidx/recyclerview/widget/RecyclerView$l;->q(I)Landroid/view/View;

    move-result-object p1

    return-object p1
.end method

.method public q0(ILandroidx/recyclerview/widget/RecyclerView$s;Landroidx/recyclerview/widget/RecyclerView$x;)I
    .locals 1

    iget v0, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->p:I

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    invoke-virtual {p0, p1, p2, p3}, Landroidx/recyclerview/widget/LinearLayoutManager;->b1(ILandroidx/recyclerview/widget/RecyclerView$s;Landroidx/recyclerview/widget/RecyclerView$x;)I

    move-result p1

    return p1
.end method

.method public r()Landroidx/recyclerview/widget/RecyclerView$m;
    .locals 2

    new-instance v0, Landroidx/recyclerview/widget/RecyclerView$m;

    const/4 v1, -0x2

    invoke-direct {v0, v1, v1}, Landroidx/recyclerview/widget/RecyclerView$m;-><init>(II)V

    return-object v0
.end method

.method public final x0()Z
    .locals 6

    .line 1
    iget v0, p0, Landroidx/recyclerview/widget/RecyclerView$l;->m:I

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/high16 v2, 0x40000000    # 2.0f

    .line 5
    .line 6
    if-eq v0, v2, :cond_2

    .line 7
    .line 8
    iget v0, p0, Landroidx/recyclerview/widget/RecyclerView$l;->l:I

    .line 9
    .line 10
    if-eq v0, v2, :cond_2

    .line 11
    .line 12
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$l;->w()I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    move v2, v1

    .line 17
    :goto_0
    const/4 v3, 0x1

    .line 18
    if-ge v2, v0, :cond_1

    .line 19
    .line 20
    invoke-virtual {p0, v2}, Landroidx/recyclerview/widget/RecyclerView$l;->v(I)Landroid/view/View;

    .line 21
    .line 22
    .line 23
    move-result-object v4

    .line 24
    invoke-virtual {v4}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 25
    .line 26
    .line 27
    move-result-object v4

    .line 28
    iget v5, v4, Landroid/view/ViewGroup$LayoutParams;->width:I

    .line 29
    .line 30
    if-gez v5, :cond_0

    .line 31
    .line 32
    iget v4, v4, Landroid/view/ViewGroup$LayoutParams;->height:I

    .line 33
    .line 34
    if-gez v4, :cond_0

    .line 35
    .line 36
    move v0, v3

    .line 37
    goto :goto_1

    .line 38
    :cond_0
    add-int/lit8 v2, v2, 0x1

    .line 39
    .line 40
    goto :goto_0

    .line 41
    :cond_1
    move v0, v1

    .line 42
    :goto_1
    if-eqz v0, :cond_2

    .line 43
    .line 44
    move v1, v3

    .line 45
    :cond_2
    return v1
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

.method public z0(Landroidx/recyclerview/widget/RecyclerView;I)V
    .locals 1

    .line 1
    new-instance v0, Landroidx/recyclerview/widget/o;

    .line 2
    .line 3
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    invoke-direct {v0, p1}, Landroidx/recyclerview/widget/o;-><init>(Landroid/content/Context;)V

    .line 8
    .line 9
    .line 10
    iput p2, v0, Landroidx/recyclerview/widget/RecyclerView$w;->a:I

    .line 11
    .line 12
    invoke-virtual {p0, v0}, Landroidx/recyclerview/widget/RecyclerView$l;->A0(Landroidx/recyclerview/widget/o;)V

    .line 13
    .line 14
    .line 15
    return-void
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
