.class public Lx3/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/io/Closeable;


# static fields
.field public static final q:[C


# instance fields
.field public final b:Ljava/io/Reader;

.field public c:Z

.field public final d:[C

.field public e:I

.field public f:I

.field public g:I

.field public h:I

.field public i:I

.field public j:J

.field public k:I

.field public l:Ljava/lang/String;

.field public m:[I

.field public n:I

.field public o:[Ljava/lang/String;

.field public p:[I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const-string v0, ")]}\'\n"

    invoke-virtual {v0}, Ljava/lang/String;->toCharArray()[C

    move-result-object v0

    sput-object v0, Lx3/a;->q:[C

    new-instance v0, Lx3/a$a;

    invoke-direct {v0}, Lx3/a$a;-><init>()V

    sput-object v0, Landroidx/activity/result/c;->b:Lx3/a$a;

    return-void
.end method

.method public constructor <init>(Ljava/io/Reader;)V
    .locals 4

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lx3/a;->c:Z

    const/16 v1, 0x400

    new-array v1, v1, [C

    iput-object v1, p0, Lx3/a;->d:[C

    iput v0, p0, Lx3/a;->e:I

    iput v0, p0, Lx3/a;->f:I

    iput v0, p0, Lx3/a;->g:I

    iput v0, p0, Lx3/a;->h:I

    iput v0, p0, Lx3/a;->i:I

    const/16 v1, 0x20

    new-array v2, v1, [I

    iput-object v2, p0, Lx3/a;->m:[I

    const/4 v3, 0x1

    iput v3, p0, Lx3/a;->n:I

    const/4 v3, 0x6

    aput v3, v2, v0

    new-array v0, v1, [Ljava/lang/String;

    iput-object v0, p0, Lx3/a;->o:[Ljava/lang/String;

    new-array v0, v1, [I

    iput-object v0, p0, Lx3/a;->p:[I

    iput-object p1, p0, Lx3/a;->b:Ljava/io/Reader;

    return-void
.end method


# virtual methods
.method public E()I
    .locals 7

    iget v0, p0, Lx3/a;->i:I

    if-nez v0, :cond_0

    invoke-virtual {p0}, Lx3/a;->j()I

    move-result v0

    :cond_0
    const/16 v1, 0xf

    const-string v2, "Expected an int but was "

    const/4 v3, 0x0

    if-ne v0, v1, :cond_2

    iget-wide v0, p0, Lx3/a;->j:J

    long-to-int v4, v0

    int-to-long v5, v4

    cmp-long v0, v0, v5

    if-nez v0, :cond_1

    iput v3, p0, Lx3/a;->i:I

    iget-object v0, p0, Lx3/a;->p:[I

    iget v1, p0, Lx3/a;->n:I

    add-int/lit8 v1, v1, -0x1

    aget v2, v0, v1

    add-int/lit8 v2, v2, 0x1

    aput v2, v0, v1

    return v4

    :cond_1
    new-instance v0, Ljava/lang/NumberFormatException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-wide v2, p0, Lx3/a;->j:J

    invoke-virtual {v1, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lx3/a;->s()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/NumberFormatException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    const/16 v1, 0x10

    if-ne v0, v1, :cond_3

    new-instance v0, Ljava/lang/String;

    iget v1, p0, Lx3/a;->e:I

    iget v4, p0, Lx3/a;->k:I

    iget-object v5, p0, Lx3/a;->d:[C

    invoke-direct {v0, v5, v1, v4}, Ljava/lang/String;-><init>([CII)V

    iput-object v0, p0, Lx3/a;->l:Ljava/lang/String;

    iget v0, p0, Lx3/a;->e:I

    iget v1, p0, Lx3/a;->k:I

    add-int/2addr v0, v1

    iput v0, p0, Lx3/a;->e:I

    goto :goto_4

    :cond_3
    const/16 v1, 0xa

    const/16 v4, 0x8

    if-eq v0, v4, :cond_5

    const/16 v5, 0x9

    if-eq v0, v5, :cond_5

    if-ne v0, v1, :cond_4

    goto :goto_0

    :cond_4
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0}, Lx3/a;->M()I

    move-result v2

    invoke-static {v2}, Lx3/b;->a(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lx3/a;->s()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_5
    :goto_0
    if-ne v0, v1, :cond_6

    invoke-virtual {p0}, Lx3/a;->L()Ljava/lang/String;

    move-result-object v0

    :goto_1
    iput-object v0, p0, Lx3/a;->l:Ljava/lang/String;

    goto :goto_3

    :cond_6
    if-ne v0, v4, :cond_7

    const/16 v0, 0x27

    goto :goto_2

    :cond_7
    const/16 v0, 0x22

    :goto_2
    invoke-virtual {p0, v0}, Lx3/a;->J(C)Ljava/lang/String;

    move-result-object v0

    goto :goto_1

    :goto_3
    :try_start_0
    iget-object v0, p0, Lx3/a;->l:Ljava/lang/String;

    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v0

    iput v3, p0, Lx3/a;->i:I

    iget-object v1, p0, Lx3/a;->p:[I

    iget v4, p0, Lx3/a;->n:I

    add-int/lit8 v4, v4, -0x1

    aget v5, v1, v4

    add-int/lit8 v5, v5, 0x1

    aput v5, v1, v4
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    return v0

    :catch_0
    :goto_4
    const/16 v0, 0xb

    iput v0, p0, Lx3/a;->i:I

    iget-object v0, p0, Lx3/a;->l:Ljava/lang/String;

    invoke-static {v0}, Ljava/lang/Double;->parseDouble(Ljava/lang/String;)D

    move-result-wide v0

    double-to-int v4, v0

    int-to-double v5, v4

    cmpl-double v0, v5, v0

    if-nez v0, :cond_8

    const/4 v0, 0x0

    iput-object v0, p0, Lx3/a;->l:Ljava/lang/String;

    iput v3, p0, Lx3/a;->i:I

    iget-object v0, p0, Lx3/a;->p:[I

    iget v1, p0, Lx3/a;->n:I

    add-int/lit8 v1, v1, -0x1

    aget v2, v0, v1

    add-int/lit8 v2, v2, 0x1

    aput v2, v0, v1

    return v4

    :cond_8
    new-instance v0, Ljava/lang/NumberFormatException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v2, p0, Lx3/a;->l:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lx3/a;->s()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/NumberFormatException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public F()J
    .locals 8

    iget v0, p0, Lx3/a;->i:I

    if-nez v0, :cond_0

    invoke-virtual {p0}, Lx3/a;->j()I

    move-result v0

    :cond_0
    const/16 v1, 0xf

    const/4 v2, 0x0

    if-ne v0, v1, :cond_1

    iput v2, p0, Lx3/a;->i:I

    iget-object v0, p0, Lx3/a;->p:[I

    iget v1, p0, Lx3/a;->n:I

    add-int/lit8 v1, v1, -0x1

    aget v2, v0, v1

    add-int/lit8 v2, v2, 0x1

    aput v2, v0, v1

    iget-wide v0, p0, Lx3/a;->j:J

    return-wide v0

    :cond_1
    const/16 v1, 0x10

    const-string v3, "Expected a long but was "

    if-ne v0, v1, :cond_2

    new-instance v0, Ljava/lang/String;

    iget v1, p0, Lx3/a;->e:I

    iget v4, p0, Lx3/a;->k:I

    iget-object v5, p0, Lx3/a;->d:[C

    invoke-direct {v0, v5, v1, v4}, Ljava/lang/String;-><init>([CII)V

    iput-object v0, p0, Lx3/a;->l:Ljava/lang/String;

    iget v0, p0, Lx3/a;->e:I

    iget v1, p0, Lx3/a;->k:I

    add-int/2addr v0, v1

    iput v0, p0, Lx3/a;->e:I

    goto :goto_4

    :cond_2
    const/16 v1, 0xa

    const/16 v4, 0x8

    if-eq v0, v4, :cond_4

    const/16 v5, 0x9

    if-eq v0, v5, :cond_4

    if-ne v0, v1, :cond_3

    goto :goto_0

    :cond_3
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0}, Lx3/a;->M()I

    move-result v2

    invoke-static {v2}, Lx3/b;->a(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lx3/a;->s()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_4
    :goto_0
    if-ne v0, v1, :cond_5

    invoke-virtual {p0}, Lx3/a;->L()Ljava/lang/String;

    move-result-object v0

    :goto_1
    iput-object v0, p0, Lx3/a;->l:Ljava/lang/String;

    goto :goto_3

    :cond_5
    if-ne v0, v4, :cond_6

    const/16 v0, 0x27

    goto :goto_2

    :cond_6
    const/16 v0, 0x22

    :goto_2
    invoke-virtual {p0, v0}, Lx3/a;->J(C)Ljava/lang/String;

    move-result-object v0

    goto :goto_1

    :goto_3
    :try_start_0
    iget-object v0, p0, Lx3/a;->l:Ljava/lang/String;

    invoke-static {v0}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v0

    iput v2, p0, Lx3/a;->i:I

    iget-object v4, p0, Lx3/a;->p:[I

    iget v5, p0, Lx3/a;->n:I

    add-int/lit8 v5, v5, -0x1

    aget v6, v4, v5

    add-int/lit8 v6, v6, 0x1

    aput v6, v4, v5
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    return-wide v0

    :catch_0
    :goto_4
    const/16 v0, 0xb

    iput v0, p0, Lx3/a;->i:I

    iget-object v0, p0, Lx3/a;->l:Ljava/lang/String;

    invoke-static {v0}, Ljava/lang/Double;->parseDouble(Ljava/lang/String;)D

    move-result-wide v0

    double-to-long v4, v0

    long-to-double v6, v4

    cmpl-double v0, v6, v0

    if-nez v0, :cond_7

    const/4 v0, 0x0

    iput-object v0, p0, Lx3/a;->l:Ljava/lang/String;

    iput v2, p0, Lx3/a;->i:I

    iget-object v0, p0, Lx3/a;->p:[I

    iget v1, p0, Lx3/a;->n:I

    add-int/lit8 v1, v1, -0x1

    aget v2, v0, v1

    add-int/lit8 v2, v2, 0x1

    aput v2, v0, v1

    return-wide v4

    :cond_7
    new-instance v0, Ljava/lang/NumberFormatException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v2, p0, Lx3/a;->l:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lx3/a;->s()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/NumberFormatException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public G()Ljava/lang/String;
    .locals 3

    iget v0, p0, Lx3/a;->i:I

    if-nez v0, :cond_0

    invoke-virtual {p0}, Lx3/a;->j()I

    move-result v0

    :cond_0
    const/16 v1, 0xe

    if-ne v0, v1, :cond_1

    invoke-virtual {p0}, Lx3/a;->L()Ljava/lang/String;

    move-result-object v0

    goto :goto_1

    :cond_1
    const/16 v1, 0xc

    if-ne v0, v1, :cond_2

    const/16 v0, 0x27

    :goto_0
    invoke-virtual {p0, v0}, Lx3/a;->J(C)Ljava/lang/String;

    move-result-object v0

    goto :goto_1

    :cond_2
    const/16 v1, 0xd

    if-ne v0, v1, :cond_3

    const/16 v0, 0x22

    goto :goto_0

    :goto_1
    const/4 v1, 0x0

    iput v1, p0, Lx3/a;->i:I

    iget-object v1, p0, Lx3/a;->o:[Ljava/lang/String;

    iget v2, p0, Lx3/a;->n:I

    add-int/lit8 v2, v2, -0x1

    aput-object v0, v1, v2

    return-object v0

    :cond_3
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Expected a name but was "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0}, Lx3/a;->M()I

    move-result v2

    invoke-static {v2}, Lx3/b;->a(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lx3/a;->s()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final H(Z)I
    .locals 9

    .line 1
    :goto_0
    iget v0, p0, Lx3/a;->e:I

    .line 2
    .line 3
    :goto_1
    iget v1, p0, Lx3/a;->f:I

    .line 4
    .line 5
    :goto_2
    const/4 v2, 0x1

    .line 6
    if-ne v0, v1, :cond_2

    .line 7
    .line 8
    iput v0, p0, Lx3/a;->e:I

    .line 9
    .line 10
    invoke-virtual {p0, v2}, Lx3/a;->o(I)Z

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    if-nez v0, :cond_1

    .line 15
    .line 16
    if-nez p1, :cond_0

    .line 17
    .line 18
    const/4 p1, -0x1

    .line 19
    return p1

    .line 20
    :cond_0
    new-instance p1, Ljava/io/EOFException;

    .line 21
    .line 22
    new-instance v0, Ljava/lang/StringBuilder;

    .line 23
    .line 24
    const-string v1, "End of input"

    .line 25
    .line 26
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    invoke-virtual {p0}, Lx3/a;->s()Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object v1

    .line 33
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 34
    .line 35
    .line 36
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    invoke-direct {p1, v0}, Ljava/io/EOFException;-><init>(Ljava/lang/String;)V

    .line 41
    .line 42
    .line 43
    throw p1

    .line 44
    :cond_1
    iget v0, p0, Lx3/a;->e:I

    .line 45
    .line 46
    iget v1, p0, Lx3/a;->f:I

    .line 47
    .line 48
    :cond_2
    add-int/lit8 v3, v0, 0x1

    .line 49
    .line 50
    iget-object v4, p0, Lx3/a;->d:[C

    .line 51
    .line 52
    aget-char v0, v4, v0

    .line 53
    .line 54
    const/16 v5, 0xa

    .line 55
    .line 56
    if-ne v0, v5, :cond_3

    .line 57
    .line 58
    iget v0, p0, Lx3/a;->g:I

    .line 59
    .line 60
    add-int/2addr v0, v2

    .line 61
    iput v0, p0, Lx3/a;->g:I

    .line 62
    .line 63
    iput v3, p0, Lx3/a;->h:I

    .line 64
    .line 65
    goto/16 :goto_9

    .line 66
    .line 67
    :cond_3
    const/16 v6, 0x20

    .line 68
    .line 69
    if-eq v0, v6, :cond_10

    .line 70
    .line 71
    const/16 v6, 0xd

    .line 72
    .line 73
    if-eq v0, v6, :cond_10

    .line 74
    .line 75
    const/16 v6, 0x9

    .line 76
    .line 77
    if-ne v0, v6, :cond_4

    .line 78
    .line 79
    goto/16 :goto_9

    .line 80
    .line 81
    :cond_4
    const/16 v6, 0x2f

    .line 82
    .line 83
    if-ne v0, v6, :cond_e

    .line 84
    .line 85
    iput v3, p0, Lx3/a;->e:I

    .line 86
    .line 87
    const/4 v7, 0x2

    .line 88
    if-ne v3, v1, :cond_5

    .line 89
    .line 90
    add-int/lit8 v3, v3, -0x1

    .line 91
    .line 92
    iput v3, p0, Lx3/a;->e:I

    .line 93
    .line 94
    invoke-virtual {p0, v7}, Lx3/a;->o(I)Z

    .line 95
    .line 96
    .line 97
    move-result v1

    .line 98
    iget v3, p0, Lx3/a;->e:I

    .line 99
    .line 100
    add-int/2addr v3, v2

    .line 101
    iput v3, p0, Lx3/a;->e:I

    .line 102
    .line 103
    if-nez v1, :cond_5

    .line 104
    .line 105
    return v0

    .line 106
    :cond_5
    invoke-virtual {p0}, Lx3/a;->h()V

    .line 107
    .line 108
    .line 109
    iget v1, p0, Lx3/a;->e:I

    .line 110
    .line 111
    aget-char v3, v4, v1

    .line 112
    .line 113
    const/16 v8, 0x2a

    .line 114
    .line 115
    if-eq v3, v8, :cond_7

    .line 116
    .line 117
    if-eq v3, v6, :cond_6

    .line 118
    .line 119
    return v0

    .line 120
    :cond_6
    add-int/lit8 v1, v1, 0x1

    .line 121
    .line 122
    iput v1, p0, Lx3/a;->e:I

    .line 123
    .line 124
    goto :goto_8

    .line 125
    :cond_7
    add-int/lit8 v1, v1, 0x1

    .line 126
    .line 127
    iput v1, p0, Lx3/a;->e:I

    .line 128
    .line 129
    :goto_3
    iget v0, p0, Lx3/a;->e:I

    .line 130
    .line 131
    add-int/2addr v0, v7

    .line 132
    iget v1, p0, Lx3/a;->f:I

    .line 133
    .line 134
    const/4 v3, 0x0

    .line 135
    if-le v0, v1, :cond_9

    .line 136
    .line 137
    invoke-virtual {p0, v7}, Lx3/a;->o(I)Z

    .line 138
    .line 139
    .line 140
    move-result v0

    .line 141
    if-eqz v0, :cond_8

    .line 142
    .line 143
    goto :goto_4

    .line 144
    :cond_8
    move v2, v3

    .line 145
    goto :goto_7

    .line 146
    :cond_9
    :goto_4
    iget v0, p0, Lx3/a;->e:I

    .line 147
    .line 148
    aget-char v1, v4, v0

    .line 149
    .line 150
    if-ne v1, v5, :cond_a

    .line 151
    .line 152
    iget v1, p0, Lx3/a;->g:I

    .line 153
    .line 154
    add-int/2addr v1, v2

    .line 155
    iput v1, p0, Lx3/a;->g:I

    .line 156
    .line 157
    add-int/lit8 v0, v0, 0x1

    .line 158
    .line 159
    iput v0, p0, Lx3/a;->h:I

    .line 160
    .line 161
    goto :goto_6

    .line 162
    :cond_a
    :goto_5
    if-ge v3, v7, :cond_c

    .line 163
    .line 164
    iget v0, p0, Lx3/a;->e:I

    .line 165
    .line 166
    add-int/2addr v0, v3

    .line 167
    aget-char v0, v4, v0

    .line 168
    .line 169
    const-string v1, "*/"

    .line 170
    .line 171
    invoke-virtual {v1, v3}, Ljava/lang/String;->charAt(I)C

    .line 172
    .line 173
    .line 174
    move-result v1

    .line 175
    if-eq v0, v1, :cond_b

    .line 176
    .line 177
    :goto_6
    iget v0, p0, Lx3/a;->e:I

    .line 178
    .line 179
    add-int/2addr v0, v2

    .line 180
    iput v0, p0, Lx3/a;->e:I

    .line 181
    .line 182
    goto :goto_3

    .line 183
    :cond_b
    add-int/lit8 v3, v3, 0x1

    .line 184
    .line 185
    goto :goto_5

    .line 186
    :cond_c
    :goto_7
    if-eqz v2, :cond_d

    .line 187
    .line 188
    iget v0, p0, Lx3/a;->e:I

    .line 189
    .line 190
    add-int/2addr v0, v7

    .line 191
    goto/16 :goto_1

    .line 192
    .line 193
    :cond_d
    const-string p1, "Unterminated comment"

    .line 194
    .line 195
    invoke-virtual {p0, p1}, Lx3/a;->S(Ljava/lang/String;)V

    .line 196
    .line 197
    .line 198
    const/4 p1, 0x0

    .line 199
    throw p1

    .line 200
    :cond_e
    iput v3, p0, Lx3/a;->e:I

    .line 201
    .line 202
    const/16 v1, 0x23

    .line 203
    .line 204
    if-ne v0, v1, :cond_f

    .line 205
    .line 206
    invoke-virtual {p0}, Lx3/a;->h()V

    .line 207
    .line 208
    .line 209
    :goto_8
    invoke-virtual {p0}, Lx3/a;->Q()V

    .line 210
    .line 211
    .line 212
    goto/16 :goto_0

    .line 213
    .line 214
    :cond_f
    return v0

    .line 215
    :cond_10
    :goto_9
    move v0, v3

    .line 216
    goto/16 :goto_2
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
.end method

.method public I()V
    .locals 3

    iget v0, p0, Lx3/a;->i:I

    if-nez v0, :cond_0

    invoke-virtual {p0}, Lx3/a;->j()I

    move-result v0

    :cond_0
    const/4 v1, 0x7

    if-ne v0, v1, :cond_1

    const/4 v0, 0x0

    iput v0, p0, Lx3/a;->i:I

    iget-object v0, p0, Lx3/a;->p:[I

    iget v1, p0, Lx3/a;->n:I

    add-int/lit8 v1, v1, -0x1

    aget v2, v0, v1

    add-int/lit8 v2, v2, 0x1

    aput v2, v0, v1

    return-void

    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Expected null but was "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0}, Lx3/a;->M()I

    move-result v2

    invoke-static {v2}, Lx3/b;->a(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lx3/a;->s()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final J(C)Ljava/lang/String;
    .locals 10

    const/4 v0, 0x0

    move-object v1, v0

    :goto_0
    iget v2, p0, Lx3/a;->e:I

    iget v3, p0, Lx3/a;->f:I

    move v4, v2

    :goto_1
    const/4 v5, 0x1

    const/16 v6, 0x10

    iget-object v7, p0, Lx3/a;->d:[C

    if-ge v4, v3, :cond_5

    add-int/lit8 v8, v4, 0x1

    aget-char v4, v7, v4

    if-ne v4, p1, :cond_1

    iput v8, p0, Lx3/a;->e:I

    sub-int/2addr v8, v2

    sub-int/2addr v8, v5

    if-nez v1, :cond_0

    new-instance p1, Ljava/lang/String;

    invoke-direct {p1, v7, v2, v8}, Ljava/lang/String;-><init>([CII)V

    return-object p1

    :cond_0
    invoke-virtual {v1, v7, v2, v8}, Ljava/lang/StringBuilder;->append([CII)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    return-object p1

    :cond_1
    const/16 v9, 0x5c

    if-ne v4, v9, :cond_3

    iput v8, p0, Lx3/a;->e:I

    sub-int/2addr v8, v2

    sub-int/2addr v8, v5

    if-nez v1, :cond_2

    add-int/lit8 v1, v8, 0x1

    mul-int/lit8 v1, v1, 0x2

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-static {v1, v6}, Ljava/lang/Math;->max(II)I

    move-result v1

    invoke-direct {v3, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    move-object v1, v3

    :cond_2
    invoke-virtual {v1, v7, v2, v8}, Ljava/lang/StringBuilder;->append([CII)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lx3/a;->O()C

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    goto :goto_0

    :cond_3
    const/16 v6, 0xa

    if-ne v4, v6, :cond_4

    iget v4, p0, Lx3/a;->g:I

    add-int/2addr v4, v5

    iput v4, p0, Lx3/a;->g:I

    iput v8, p0, Lx3/a;->h:I

    :cond_4
    move v4, v8

    goto :goto_1

    :cond_5
    if-nez v1, :cond_6

    sub-int v1, v4, v2

    mul-int/lit8 v1, v1, 0x2

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-static {v1, v6}, Ljava/lang/Math;->max(II)I

    move-result v1

    invoke-direct {v3, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    move-object v1, v3

    :cond_6
    sub-int v3, v4, v2

    invoke-virtual {v1, v7, v2, v3}, Ljava/lang/StringBuilder;->append([CII)Ljava/lang/StringBuilder;

    iput v4, p0, Lx3/a;->e:I

    invoke-virtual {p0, v5}, Lx3/a;->o(I)Z

    move-result v2

    if-eqz v2, :cond_7

    goto :goto_0

    :cond_7
    const-string p1, "Unterminated string"

    invoke-virtual {p0, p1}, Lx3/a;->S(Ljava/lang/String;)V

    throw v0
.end method

.method public K()Ljava/lang/String;
    .locals 4

    iget v0, p0, Lx3/a;->i:I

    if-nez v0, :cond_0

    invoke-virtual {p0}, Lx3/a;->j()I

    move-result v0

    :cond_0
    const/16 v1, 0xa

    if-ne v0, v1, :cond_1

    invoke-virtual {p0}, Lx3/a;->L()Ljava/lang/String;

    move-result-object v0

    goto :goto_1

    :cond_1
    const/16 v1, 0x8

    if-ne v0, v1, :cond_2

    const/16 v0, 0x27

    :goto_0
    invoke-virtual {p0, v0}, Lx3/a;->J(C)Ljava/lang/String;

    move-result-object v0

    goto :goto_1

    :cond_2
    const/16 v1, 0x9

    if-ne v0, v1, :cond_3

    const/16 v0, 0x22

    goto :goto_0

    :cond_3
    const/16 v1, 0xb

    if-ne v0, v1, :cond_4

    iget-object v0, p0, Lx3/a;->l:Ljava/lang/String;

    const/4 v1, 0x0

    iput-object v1, p0, Lx3/a;->l:Ljava/lang/String;

    goto :goto_1

    :cond_4
    const/16 v1, 0xf

    if-ne v0, v1, :cond_5

    iget-wide v0, p0, Lx3/a;->j:J

    invoke-static {v0, v1}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object v0

    goto :goto_1

    :cond_5
    const/16 v1, 0x10

    if-ne v0, v1, :cond_6

    new-instance v0, Ljava/lang/String;

    iget v1, p0, Lx3/a;->e:I

    iget v2, p0, Lx3/a;->k:I

    iget-object v3, p0, Lx3/a;->d:[C

    invoke-direct {v0, v3, v1, v2}, Ljava/lang/String;-><init>([CII)V

    iget v1, p0, Lx3/a;->e:I

    iget v2, p0, Lx3/a;->k:I

    add-int/2addr v1, v2

    iput v1, p0, Lx3/a;->e:I

    :goto_1
    const/4 v1, 0x0

    iput v1, p0, Lx3/a;->i:I

    iget-object v1, p0, Lx3/a;->p:[I

    iget v2, p0, Lx3/a;->n:I

    add-int/lit8 v2, v2, -0x1

    aget v3, v1, v2

    add-int/lit8 v3, v3, 0x1

    aput v3, v1, v2

    return-object v0

    :cond_6
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Expected a string but was "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0}, Lx3/a;->M()I

    move-result v2

    invoke-static {v2}, Lx3/b;->a(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lx3/a;->s()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final L()Ljava/lang/String;
    .locals 7

    const/4 v0, 0x0

    const/4 v1, 0x0

    :cond_0
    move v2, v1

    :goto_0
    iget v3, p0, Lx3/a;->e:I

    add-int v4, v3, v2

    iget v5, p0, Lx3/a;->f:I

    iget-object v6, p0, Lx3/a;->d:[C

    if-ge v4, v5, :cond_2

    add-int/2addr v3, v2

    aget-char v3, v6, v3

    const/16 v4, 0x9

    if-eq v3, v4, :cond_3

    const/16 v4, 0xa

    if-eq v3, v4, :cond_3

    const/16 v4, 0xc

    if-eq v3, v4, :cond_3

    const/16 v4, 0xd

    if-eq v3, v4, :cond_3

    const/16 v4, 0x20

    if-eq v3, v4, :cond_3

    const/16 v4, 0x23

    if-eq v3, v4, :cond_1

    const/16 v4, 0x2c

    if-eq v3, v4, :cond_3

    const/16 v4, 0x2f

    if-eq v3, v4, :cond_1

    const/16 v4, 0x3d

    if-eq v3, v4, :cond_1

    const/16 v4, 0x7b

    if-eq v3, v4, :cond_3

    const/16 v4, 0x7d

    if-eq v3, v4, :cond_3

    const/16 v4, 0x3a

    if-eq v3, v4, :cond_3

    const/16 v4, 0x3b

    if-eq v3, v4, :cond_1

    packed-switch v3, :pswitch_data_0

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    :pswitch_0
    invoke-virtual {p0}, Lx3/a;->h()V

    goto :goto_1

    :cond_2
    array-length v3, v6

    if-ge v2, v3, :cond_4

    add-int/lit8 v3, v2, 0x1

    invoke-virtual {p0, v3}, Lx3/a;->o(I)Z

    move-result v3

    if-eqz v3, :cond_3

    goto :goto_0

    :cond_3
    :goto_1
    :pswitch_1
    move v1, v2

    goto :goto_2

    :cond_4
    if-nez v0, :cond_5

    new-instance v0, Ljava/lang/StringBuilder;

    const/16 v3, 0x10

    invoke-static {v2, v3}, Ljava/lang/Math;->max(II)I

    move-result v3

    invoke-direct {v0, v3}, Ljava/lang/StringBuilder;-><init>(I)V

    :cond_5
    iget v3, p0, Lx3/a;->e:I

    invoke-virtual {v0, v6, v3, v2}, Ljava/lang/StringBuilder;->append([CII)Ljava/lang/StringBuilder;

    iget v3, p0, Lx3/a;->e:I

    add-int/2addr v3, v2

    iput v3, p0, Lx3/a;->e:I

    const/4 v2, 0x1

    invoke-virtual {p0, v2}, Lx3/a;->o(I)Z

    move-result v2

    if-nez v2, :cond_0

    :goto_2
    if-nez v0, :cond_6

    new-instance v0, Ljava/lang/String;

    iget v2, p0, Lx3/a;->e:I

    invoke-direct {v0, v6, v2, v1}, Ljava/lang/String;-><init>([CII)V

    goto :goto_3

    :cond_6
    iget v2, p0, Lx3/a;->e:I

    invoke-virtual {v0, v6, v2, v1}, Ljava/lang/StringBuilder;->append([CII)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    :goto_3
    iget v2, p0, Lx3/a;->e:I

    add-int/2addr v2, v1

    iput v2, p0, Lx3/a;->e:I

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x5b
        :pswitch_1
        :pswitch_0
        :pswitch_1
    .end packed-switch
.end method

.method public M()I
    .locals 1

    iget v0, p0, Lx3/a;->i:I

    if-nez v0, :cond_0

    invoke-virtual {p0}, Lx3/a;->j()I

    move-result v0

    :cond_0
    packed-switch v0, :pswitch_data_0

    new-instance v0, Ljava/lang/AssertionError;

    invoke-direct {v0}, Ljava/lang/AssertionError;-><init>()V

    throw v0

    :pswitch_0
    const/16 v0, 0xa

    return v0

    :pswitch_1
    const/4 v0, 0x7

    return v0

    :pswitch_2
    const/4 v0, 0x5

    return v0

    :pswitch_3
    const/4 v0, 0x6

    return v0

    :pswitch_4
    const/16 v0, 0x9

    return v0

    :pswitch_5
    const/16 v0, 0x8

    return v0

    :pswitch_6
    const/4 v0, 0x2

    return v0

    :pswitch_7
    const/4 v0, 0x1

    return v0

    :pswitch_8
    const/4 v0, 0x4

    return v0

    :pswitch_9
    const/4 v0, 0x3

    return v0

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_3
        :pswitch_3
        :pswitch_3
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_1
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final N(I)V
    .locals 6

    iget v0, p0, Lx3/a;->n:I

    iget-object v1, p0, Lx3/a;->m:[I

    array-length v2, v1

    if-ne v0, v2, :cond_0

    mul-int/lit8 v2, v0, 0x2

    new-array v2, v2, [I

    mul-int/lit8 v3, v0, 0x2

    new-array v3, v3, [I

    mul-int/lit8 v4, v0, 0x2

    new-array v4, v4, [Ljava/lang/String;

    const/4 v5, 0x0

    invoke-static {v1, v5, v2, v5, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    iget-object v0, p0, Lx3/a;->p:[I

    iget v1, p0, Lx3/a;->n:I

    invoke-static {v0, v5, v3, v5, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    iget-object v0, p0, Lx3/a;->o:[Ljava/lang/String;

    iget v1, p0, Lx3/a;->n:I

    invoke-static {v0, v5, v4, v5, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    iput-object v2, p0, Lx3/a;->m:[I

    iput-object v3, p0, Lx3/a;->p:[I

    iput-object v4, p0, Lx3/a;->o:[Ljava/lang/String;

    :cond_0
    iget-object v0, p0, Lx3/a;->m:[I

    iget v1, p0, Lx3/a;->n:I

    add-int/lit8 v2, v1, 0x1

    iput v2, p0, Lx3/a;->n:I

    aput p1, v0, v1

    return-void
.end method

.method public final O()C
    .locals 9

    iget v0, p0, Lx3/a;->e:I

    iget v1, p0, Lx3/a;->f:I

    const/4 v2, 0x0

    const-string v3, "Unterminated escape sequence"

    const/4 v4, 0x1

    if-ne v0, v1, :cond_1

    invoke-virtual {p0, v4}, Lx3/a;->o(I)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {p0, v3}, Lx3/a;->S(Ljava/lang/String;)V

    throw v2

    :cond_1
    :goto_0
    iget v0, p0, Lx3/a;->e:I

    add-int/lit8 v1, v0, 0x1

    iput v1, p0, Lx3/a;->e:I

    iget-object v5, p0, Lx3/a;->d:[C

    aget-char v0, v5, v0

    const/16 v6, 0xa

    if-eq v0, v6, :cond_e

    const/16 v4, 0x22

    if-eq v0, v4, :cond_f

    const/16 v4, 0x27

    if-eq v0, v4, :cond_f

    const/16 v4, 0x2f

    if-eq v0, v4, :cond_f

    const/16 v4, 0x5c

    if-eq v0, v4, :cond_f

    const/16 v4, 0x62

    if-eq v0, v4, :cond_d

    const/16 v4, 0x66

    if-eq v0, v4, :cond_c

    const/16 v7, 0x6e

    if-eq v0, v7, :cond_b

    const/16 v7, 0x72

    if-eq v0, v7, :cond_a

    const/16 v7, 0x74

    if-eq v0, v7, :cond_9

    const/16 v7, 0x75

    if-ne v0, v7, :cond_8

    const/4 v0, 0x4

    add-int/2addr v1, v0

    iget v7, p0, Lx3/a;->f:I

    if-le v1, v7, :cond_3

    invoke-virtual {p0, v0}, Lx3/a;->o(I)Z

    move-result v1

    if-eqz v1, :cond_2

    goto :goto_1

    :cond_2
    invoke-virtual {p0, v3}, Lx3/a;->S(Ljava/lang/String;)V

    throw v2

    :cond_3
    :goto_1
    iget v1, p0, Lx3/a;->e:I

    add-int/lit8 v2, v1, 0x4

    const/4 v3, 0x0

    :goto_2
    if-ge v1, v2, :cond_7

    aget-char v7, v5, v1

    shl-int/lit8 v3, v3, 0x4

    int-to-char v3, v3

    const/16 v8, 0x30

    if-lt v7, v8, :cond_4

    const/16 v8, 0x39

    if-gt v7, v8, :cond_4

    add-int/lit8 v7, v7, -0x30

    goto :goto_4

    :cond_4
    const/16 v8, 0x61

    if-lt v7, v8, :cond_5

    if-gt v7, v4, :cond_5

    add-int/lit8 v7, v7, -0x61

    goto :goto_3

    :cond_5
    const/16 v8, 0x41

    if-lt v7, v8, :cond_6

    const/16 v8, 0x46

    if-gt v7, v8, :cond_6

    add-int/lit8 v7, v7, -0x41

    :goto_3
    add-int/2addr v7, v6

    :goto_4
    add-int/2addr v7, v3

    int-to-char v3, v7

    add-int/lit8 v1, v1, 0x1

    goto :goto_2

    :cond_6
    new-instance v1, Ljava/lang/NumberFormatException;

    new-instance v2, Ljava/lang/String;

    iget v3, p0, Lx3/a;->e:I

    invoke-direct {v2, v5, v3, v0}, Ljava/lang/String;-><init>([CII)V

    const-string v0, "\\u"

    invoke-virtual {v0, v2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/NumberFormatException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_7
    iget v1, p0, Lx3/a;->e:I

    add-int/2addr v1, v0

    iput v1, p0, Lx3/a;->e:I

    return v3

    :cond_8
    const-string v0, "Invalid escape sequence"

    invoke-virtual {p0, v0}, Lx3/a;->S(Ljava/lang/String;)V

    throw v2

    :cond_9
    const/16 v0, 0x9

    return v0

    :cond_a
    const/16 v0, 0xd

    return v0

    :cond_b
    return v6

    :cond_c
    const/16 v0, 0xc

    return v0

    :cond_d
    const/16 v0, 0x8

    return v0

    :cond_e
    iget v2, p0, Lx3/a;->g:I

    add-int/2addr v2, v4

    iput v2, p0, Lx3/a;->g:I

    iput v1, p0, Lx3/a;->h:I

    :cond_f
    return v0
.end method

.method public final P(C)V
    .locals 5

    :goto_0
    iget v0, p0, Lx3/a;->e:I

    iget v1, p0, Lx3/a;->f:I

    :goto_1
    const/4 v2, 0x1

    if-ge v0, v1, :cond_3

    add-int/lit8 v3, v0, 0x1

    iget-object v4, p0, Lx3/a;->d:[C

    aget-char v0, v4, v0

    if-ne v0, p1, :cond_0

    iput v3, p0, Lx3/a;->e:I

    return-void

    :cond_0
    const/16 v4, 0x5c

    if-ne v0, v4, :cond_1

    iput v3, p0, Lx3/a;->e:I

    invoke-virtual {p0}, Lx3/a;->O()C

    goto :goto_0

    :cond_1
    const/16 v4, 0xa

    if-ne v0, v4, :cond_2

    iget v0, p0, Lx3/a;->g:I

    add-int/2addr v0, v2

    iput v0, p0, Lx3/a;->g:I

    iput v3, p0, Lx3/a;->h:I

    :cond_2
    move v0, v3

    goto :goto_1

    :cond_3
    iput v0, p0, Lx3/a;->e:I

    invoke-virtual {p0, v2}, Lx3/a;->o(I)Z

    move-result v0

    if-eqz v0, :cond_4

    goto :goto_0

    :cond_4
    const-string p1, "Unterminated string"

    invoke-virtual {p0, p1}, Lx3/a;->S(Ljava/lang/String;)V

    const/4 p1, 0x0

    throw p1
.end method

.method public final Q()V
    .locals 4

    :cond_0
    iget v0, p0, Lx3/a;->e:I

    iget v1, p0, Lx3/a;->f:I

    const/4 v2, 0x1

    if-lt v0, v1, :cond_1

    invoke-virtual {p0, v2}, Lx3/a;->o(I)Z

    move-result v0

    if-eqz v0, :cond_3

    :cond_1
    iget v0, p0, Lx3/a;->e:I

    add-int/lit8 v1, v0, 0x1

    iput v1, p0, Lx3/a;->e:I

    iget-object v3, p0, Lx3/a;->d:[C

    aget-char v0, v3, v0

    const/16 v3, 0xa

    if-ne v0, v3, :cond_2

    iget v0, p0, Lx3/a;->g:I

    add-int/2addr v0, v2

    iput v0, p0, Lx3/a;->g:I

    iput v1, p0, Lx3/a;->h:I

    goto :goto_0

    :cond_2
    const/16 v1, 0xd

    if-ne v0, v1, :cond_0

    :cond_3
    :goto_0
    return-void
.end method

.method public R()V
    .locals 10

    .line 1
    const/4 v0, 0x0

    .line 2
    move v1, v0

    .line 3
    :cond_0
    iget v2, p0, Lx3/a;->i:I

    .line 4
    .line 5
    if-nez v2, :cond_1

    .line 6
    .line 7
    invoke-virtual {p0}, Lx3/a;->j()I

    .line 8
    .line 9
    .line 10
    move-result v2

    .line 11
    :cond_1
    const/4 v3, 0x3

    .line 12
    const/4 v4, 0x1

    .line 13
    if-ne v2, v3, :cond_2

    .line 14
    .line 15
    invoke-virtual {p0, v4}, Lx3/a;->N(I)V

    .line 16
    .line 17
    .line 18
    :goto_0
    add-int/lit8 v1, v1, 0x1

    .line 19
    .line 20
    goto/16 :goto_7

    .line 21
    .line 22
    :cond_2
    if-ne v2, v4, :cond_3

    .line 23
    .line 24
    invoke-virtual {p0, v3}, Lx3/a;->N(I)V

    .line 25
    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_3
    const/4 v3, 0x4

    .line 29
    if-ne v2, v3, :cond_4

    .line 30
    .line 31
    :goto_1
    iget v2, p0, Lx3/a;->n:I

    .line 32
    .line 33
    sub-int/2addr v2, v4

    .line 34
    iput v2, p0, Lx3/a;->n:I

    .line 35
    .line 36
    add-int/lit8 v1, v1, -0x1

    .line 37
    .line 38
    goto/16 :goto_7

    .line 39
    .line 40
    :cond_4
    const/4 v3, 0x2

    .line 41
    if-ne v2, v3, :cond_5

    .line 42
    .line 43
    goto :goto_1

    .line 44
    :cond_5
    const/16 v3, 0xe

    .line 45
    .line 46
    const/16 v5, 0xd

    .line 47
    .line 48
    const/16 v6, 0xc

    .line 49
    .line 50
    const/16 v7, 0xa

    .line 51
    .line 52
    const/16 v8, 0x9

    .line 53
    .line 54
    if-eq v2, v3, :cond_b

    .line 55
    .line 56
    if-ne v2, v7, :cond_6

    .line 57
    .line 58
    goto :goto_5

    .line 59
    :cond_6
    const/16 v3, 0x8

    .line 60
    .line 61
    if-eq v2, v3, :cond_a

    .line 62
    .line 63
    if-ne v2, v6, :cond_7

    .line 64
    .line 65
    goto :goto_3

    .line 66
    :cond_7
    if-eq v2, v8, :cond_9

    .line 67
    .line 68
    if-ne v2, v5, :cond_8

    .line 69
    .line 70
    goto :goto_2

    .line 71
    :cond_8
    const/16 v3, 0x10

    .line 72
    .line 73
    if-ne v2, v3, :cond_f

    .line 74
    .line 75
    iget v2, p0, Lx3/a;->e:I

    .line 76
    .line 77
    iget v3, p0, Lx3/a;->k:I

    .line 78
    .line 79
    add-int/2addr v2, v3

    .line 80
    iput v2, p0, Lx3/a;->e:I

    .line 81
    .line 82
    goto :goto_7

    .line 83
    :cond_9
    :goto_2
    const/16 v2, 0x22

    .line 84
    .line 85
    goto :goto_4

    .line 86
    :cond_a
    :goto_3
    const/16 v2, 0x27

    .line 87
    .line 88
    :goto_4
    invoke-virtual {p0, v2}, Lx3/a;->P(C)V

    .line 89
    .line 90
    .line 91
    goto :goto_7

    .line 92
    :cond_b
    :goto_5
    move v2, v0

    .line 93
    :goto_6
    iget v3, p0, Lx3/a;->e:I

    .line 94
    .line 95
    add-int/2addr v3, v2

    .line 96
    iget v9, p0, Lx3/a;->f:I

    .line 97
    .line 98
    if-ge v3, v9, :cond_e

    .line 99
    .line 100
    iget-object v9, p0, Lx3/a;->d:[C

    .line 101
    .line 102
    aget-char v3, v9, v3

    .line 103
    .line 104
    if-eq v3, v8, :cond_d

    .line 105
    .line 106
    if-eq v3, v7, :cond_d

    .line 107
    .line 108
    if-eq v3, v6, :cond_d

    .line 109
    .line 110
    if-eq v3, v5, :cond_d

    .line 111
    .line 112
    const/16 v9, 0x20

    .line 113
    .line 114
    if-eq v3, v9, :cond_d

    .line 115
    .line 116
    const/16 v9, 0x23

    .line 117
    .line 118
    if-eq v3, v9, :cond_c

    .line 119
    .line 120
    const/16 v9, 0x2c

    .line 121
    .line 122
    if-eq v3, v9, :cond_d

    .line 123
    .line 124
    const/16 v9, 0x2f

    .line 125
    .line 126
    if-eq v3, v9, :cond_c

    .line 127
    .line 128
    const/16 v9, 0x3d

    .line 129
    .line 130
    if-eq v3, v9, :cond_c

    .line 131
    .line 132
    const/16 v9, 0x7b

    .line 133
    .line 134
    if-eq v3, v9, :cond_d

    .line 135
    .line 136
    const/16 v9, 0x7d

    .line 137
    .line 138
    if-eq v3, v9, :cond_d

    .line 139
    .line 140
    const/16 v9, 0x3a

    .line 141
    .line 142
    if-eq v3, v9, :cond_d

    .line 143
    .line 144
    const/16 v9, 0x3b

    .line 145
    .line 146
    if-eq v3, v9, :cond_c

    .line 147
    .line 148
    packed-switch v3, :pswitch_data_0

    .line 149
    .line 150
    .line 151
    add-int/lit8 v2, v2, 0x1

    .line 152
    .line 153
    goto :goto_6

    .line 154
    :cond_c
    :pswitch_0
    invoke-virtual {p0}, Lx3/a;->h()V

    .line 155
    .line 156
    .line 157
    :cond_d
    :pswitch_1
    iget v3, p0, Lx3/a;->e:I

    .line 158
    .line 159
    add-int/2addr v3, v2

    .line 160
    iput v3, p0, Lx3/a;->e:I

    .line 161
    .line 162
    goto :goto_7

    .line 163
    :cond_e
    iput v3, p0, Lx3/a;->e:I

    .line 164
    .line 165
    invoke-virtual {p0, v4}, Lx3/a;->o(I)Z

    .line 166
    .line 167
    .line 168
    move-result v2

    .line 169
    if-nez v2, :cond_b

    .line 170
    .line 171
    :cond_f
    :goto_7
    iput v0, p0, Lx3/a;->i:I

    .line 172
    .line 173
    if-nez v1, :cond_0

    .line 174
    .line 175
    iget-object v0, p0, Lx3/a;->p:[I

    .line 176
    .line 177
    iget v1, p0, Lx3/a;->n:I

    .line 178
    .line 179
    add-int/lit8 v2, v1, -0x1

    .line 180
    .line 181
    aget v3, v0, v2

    .line 182
    .line 183
    add-int/2addr v3, v4

    .line 184
    aput v3, v0, v2

    .line 185
    .line 186
    iget-object v0, p0, Lx3/a;->o:[Ljava/lang/String;

    .line 187
    .line 188
    sub-int/2addr v1, v4

    .line 189
    const-string v2, "null"

    .line 190
    .line 191
    aput-object v2, v0, v1

    .line 192
    .line 193
    return-void

    .line 194
    nop

    .line 195
    :pswitch_data_0
    .packed-switch 0x5b
        :pswitch_1
        :pswitch_0
        :pswitch_1
    .end packed-switch
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
.end method

.method public final S(Ljava/lang/String;)V
    .locals 2

    new-instance v0, Lx3/d;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lx3/a;->s()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Lx3/d;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public c()V
    .locals 3

    iget v0, p0, Lx3/a;->i:I

    if-nez v0, :cond_0

    invoke-virtual {p0}, Lx3/a;->j()I

    move-result v0

    :cond_0
    const/4 v1, 0x3

    if-ne v0, v1, :cond_1

    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lx3/a;->N(I)V

    iget-object v1, p0, Lx3/a;->p:[I

    iget v2, p0, Lx3/a;->n:I

    sub-int/2addr v2, v0

    const/4 v0, 0x0

    aput v0, v1, v2

    iput v0, p0, Lx3/a;->i:I

    return-void

    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Expected BEGIN_ARRAY but was "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0}, Lx3/a;->M()I

    move-result v2

    invoke-static {v2}, Lx3/b;->a(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lx3/a;->s()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public close()V
    .locals 3

    const/4 v0, 0x0

    iput v0, p0, Lx3/a;->i:I

    iget-object v1, p0, Lx3/a;->m:[I

    const/16 v2, 0x8

    aput v2, v1, v0

    const/4 v0, 0x1

    iput v0, p0, Lx3/a;->n:I

    iget-object v0, p0, Lx3/a;->b:Ljava/io/Reader;

    invoke-virtual {v0}, Ljava/io/Reader;->close()V

    return-void
.end method

.method public f()V
    .locals 3

    iget v0, p0, Lx3/a;->i:I

    if-nez v0, :cond_0

    invoke-virtual {p0}, Lx3/a;->j()I

    move-result v0

    :cond_0
    const/4 v1, 0x1

    if-ne v0, v1, :cond_1

    const/4 v0, 0x3

    invoke-virtual {p0, v0}, Lx3/a;->N(I)V

    const/4 v0, 0x0

    iput v0, p0, Lx3/a;->i:I

    return-void

    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Expected BEGIN_OBJECT but was "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0}, Lx3/a;->M()I

    move-result v2

    invoke-static {v2}, Lx3/b;->a(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lx3/a;->s()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final h()V
    .locals 1

    iget-boolean v0, p0, Lx3/a;->c:Z

    if-eqz v0, :cond_0

    return-void

    :cond_0
    const-string v0, "Use JsonReader.setLenient(true) to accept malformed JSON"

    invoke-virtual {p0, v0}, Lx3/a;->S(Ljava/lang/String;)V

    const/4 v0, 0x0

    throw v0
.end method

.method public final j()I
    .locals 21

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v1, v0, Lx3/a;->m:[I

    .line 4
    .line 5
    iget v2, v0, Lx3/a;->n:I

    .line 6
    .line 7
    add-int/lit8 v3, v2, -0x1

    .line 8
    .line 9
    aget v3, v1, v3

    .line 10
    .line 11
    const/4 v8, 0x0

    .line 12
    const/16 v9, 0x5d

    .line 13
    .line 14
    const/16 v10, 0x3b

    .line 15
    .line 16
    const/16 v11, 0x2c

    .line 17
    .line 18
    const/4 v12, 0x3

    .line 19
    const/4 v13, 0x6

    .line 20
    iget-object v14, v0, Lx3/a;->d:[C

    .line 21
    .line 22
    const/4 v15, 0x7

    .line 23
    const/4 v5, 0x2

    .line 24
    const/4 v6, 0x4

    .line 25
    const/4 v4, 0x5

    .line 26
    const/4 v7, 0x1

    .line 27
    if-ne v3, v7, :cond_0

    .line 28
    .line 29
    sub-int/2addr v2, v7

    .line 30
    aput v5, v1, v2

    .line 31
    .line 32
    goto/16 :goto_2

    .line 33
    .line 34
    :cond_0
    if-ne v3, v5, :cond_3

    .line 35
    .line 36
    invoke-virtual {v0, v7}, Lx3/a;->H(Z)I

    .line 37
    .line 38
    .line 39
    move-result v1

    .line 40
    if-eq v1, v11, :cond_c

    .line 41
    .line 42
    if-eq v1, v10, :cond_2

    .line 43
    .line 44
    if-ne v1, v9, :cond_1

    .line 45
    .line 46
    iput v6, v0, Lx3/a;->i:I

    .line 47
    .line 48
    return v6

    .line 49
    :cond_1
    const-string v1, "Unterminated array"

    .line 50
    .line 51
    invoke-virtual {v0, v1}, Lx3/a;->S(Ljava/lang/String;)V

    .line 52
    .line 53
    .line 54
    throw v8

    .line 55
    :cond_2
    invoke-virtual/range {p0 .. p0}, Lx3/a;->h()V

    .line 56
    .line 57
    .line 58
    goto/16 :goto_2

    .line 59
    .line 60
    :cond_3
    if-eq v3, v12, :cond_42

    .line 61
    .line 62
    if-ne v3, v4, :cond_4

    .line 63
    .line 64
    goto/16 :goto_1c

    .line 65
    .line 66
    :cond_4
    if-ne v3, v6, :cond_7

    .line 67
    .line 68
    sub-int/2addr v2, v7

    .line 69
    aput v4, v1, v2

    .line 70
    .line 71
    invoke-virtual {v0, v7}, Lx3/a;->H(Z)I

    .line 72
    .line 73
    .line 74
    move-result v1

    .line 75
    const/16 v2, 0x3a

    .line 76
    .line 77
    if-eq v1, v2, :cond_c

    .line 78
    .line 79
    const/16 v2, 0x3d

    .line 80
    .line 81
    if-ne v1, v2, :cond_6

    .line 82
    .line 83
    invoke-virtual/range {p0 .. p0}, Lx3/a;->h()V

    .line 84
    .line 85
    .line 86
    iget v1, v0, Lx3/a;->e:I

    .line 87
    .line 88
    iget v2, v0, Lx3/a;->f:I

    .line 89
    .line 90
    if-lt v1, v2, :cond_5

    .line 91
    .line 92
    invoke-virtual {v0, v7}, Lx3/a;->o(I)Z

    .line 93
    .line 94
    .line 95
    move-result v1

    .line 96
    if-eqz v1, :cond_c

    .line 97
    .line 98
    :cond_5
    iget v1, v0, Lx3/a;->e:I

    .line 99
    .line 100
    aget-char v2, v14, v1

    .line 101
    .line 102
    const/16 v6, 0x3e

    .line 103
    .line 104
    if-ne v2, v6, :cond_c

    .line 105
    .line 106
    add-int/2addr v1, v7

    .line 107
    iput v1, v0, Lx3/a;->e:I

    .line 108
    .line 109
    goto :goto_2

    .line 110
    :cond_6
    const-string v1, "Expected \':\'"

    .line 111
    .line 112
    invoke-virtual {v0, v1}, Lx3/a;->S(Ljava/lang/String;)V

    .line 113
    .line 114
    .line 115
    throw v8

    .line 116
    :cond_7
    if-ne v3, v13, :cond_d

    .line 117
    .line 118
    iget-boolean v1, v0, Lx3/a;->c:Z

    .line 119
    .line 120
    if-eqz v1, :cond_b

    .line 121
    .line 122
    invoke-virtual {v0, v7}, Lx3/a;->H(Z)I

    .line 123
    .line 124
    .line 125
    iget v1, v0, Lx3/a;->e:I

    .line 126
    .line 127
    sub-int/2addr v1, v7

    .line 128
    iput v1, v0, Lx3/a;->e:I

    .line 129
    .line 130
    sget-object v2, Lx3/a;->q:[C

    .line 131
    .line 132
    array-length v6, v2

    .line 133
    add-int/2addr v1, v6

    .line 134
    iget v6, v0, Lx3/a;->f:I

    .line 135
    .line 136
    if-le v1, v6, :cond_8

    .line 137
    .line 138
    array-length v1, v2

    .line 139
    invoke-virtual {v0, v1}, Lx3/a;->o(I)Z

    .line 140
    .line 141
    .line 142
    move-result v1

    .line 143
    if-nez v1, :cond_8

    .line 144
    .line 145
    goto :goto_1

    .line 146
    :cond_8
    const/4 v1, 0x0

    .line 147
    :goto_0
    array-length v6, v2

    .line 148
    if-ge v1, v6, :cond_a

    .line 149
    .line 150
    iget v6, v0, Lx3/a;->e:I

    .line 151
    .line 152
    add-int/2addr v6, v1

    .line 153
    aget-char v6, v14, v6

    .line 154
    .line 155
    aget-char v8, v2, v1

    .line 156
    .line 157
    if-eq v6, v8, :cond_9

    .line 158
    .line 159
    goto :goto_1

    .line 160
    :cond_9
    add-int/lit8 v1, v1, 0x1

    .line 161
    .line 162
    const/4 v8, 0x0

    .line 163
    goto :goto_0

    .line 164
    :cond_a
    iget v1, v0, Lx3/a;->e:I

    .line 165
    .line 166
    array-length v2, v2

    .line 167
    add-int/2addr v1, v2

    .line 168
    iput v1, v0, Lx3/a;->e:I

    .line 169
    .line 170
    :cond_b
    :goto_1
    iget-object v1, v0, Lx3/a;->m:[I

    .line 171
    .line 172
    iget v2, v0, Lx3/a;->n:I

    .line 173
    .line 174
    sub-int/2addr v2, v7

    .line 175
    aput v15, v1, v2

    .line 176
    .line 177
    :cond_c
    :goto_2
    const/4 v1, 0x0

    .line 178
    :goto_3
    const/16 v2, 0x8

    .line 179
    .line 180
    goto :goto_4

    .line 181
    :cond_d
    const/4 v1, 0x0

    .line 182
    if-ne v3, v15, :cond_f

    .line 183
    .line 184
    invoke-virtual {v0, v1}, Lx3/a;->H(Z)I

    .line 185
    .line 186
    .line 187
    move-result v2

    .line 188
    const/4 v6, -0x1

    .line 189
    if-ne v2, v6, :cond_e

    .line 190
    .line 191
    const/16 v4, 0x11

    .line 192
    .line 193
    goto/16 :goto_1e

    .line 194
    .line 195
    :cond_e
    invoke-virtual/range {p0 .. p0}, Lx3/a;->h()V

    .line 196
    .line 197
    .line 198
    iget v2, v0, Lx3/a;->e:I

    .line 199
    .line 200
    sub-int/2addr v2, v7

    .line 201
    iput v2, v0, Lx3/a;->e:I

    .line 202
    .line 203
    goto :goto_3

    .line 204
    :cond_f
    const/16 v2, 0x8

    .line 205
    .line 206
    if-eq v3, v2, :cond_41

    .line 207
    .line 208
    :goto_4
    invoke-virtual {v0, v7}, Lx3/a;->H(Z)I

    .line 209
    .line 210
    .line 211
    move-result v6

    .line 212
    const/16 v8, 0x22

    .line 213
    .line 214
    if-eq v6, v8, :cond_40

    .line 215
    .line 216
    const/16 v8, 0x27

    .line 217
    .line 218
    if-eq v6, v8, :cond_3f

    .line 219
    .line 220
    if-eq v6, v11, :cond_3b

    .line 221
    .line 222
    if-eq v6, v10, :cond_3b

    .line 223
    .line 224
    const/16 v2, 0x5b

    .line 225
    .line 226
    if-eq v6, v2, :cond_3a

    .line 227
    .line 228
    if-eq v6, v9, :cond_39

    .line 229
    .line 230
    const/16 v2, 0x7b

    .line 231
    .line 232
    if-eq v6, v2, :cond_38

    .line 233
    .line 234
    iget v2, v0, Lx3/a;->e:I

    .line 235
    .line 236
    sub-int/2addr v2, v7

    .line 237
    iput v2, v0, Lx3/a;->e:I

    .line 238
    .line 239
    aget-char v2, v14, v2

    .line 240
    .line 241
    const/16 v3, 0x74

    .line 242
    .line 243
    if-eq v2, v3, :cond_14

    .line 244
    .line 245
    const/16 v3, 0x54

    .line 246
    .line 247
    if-ne v2, v3, :cond_10

    .line 248
    .line 249
    goto :goto_6

    .line 250
    :cond_10
    const/16 v3, 0x66

    .line 251
    .line 252
    if-eq v2, v3, :cond_13

    .line 253
    .line 254
    const/16 v3, 0x46

    .line 255
    .line 256
    if-ne v2, v3, :cond_11

    .line 257
    .line 258
    goto :goto_5

    .line 259
    :cond_11
    const/16 v3, 0x6e

    .line 260
    .line 261
    if-eq v2, v3, :cond_12

    .line 262
    .line 263
    const/16 v3, 0x4e

    .line 264
    .line 265
    if-ne v2, v3, :cond_19

    .line 266
    .line 267
    :cond_12
    const-string v2, "null"

    .line 268
    .line 269
    const-string v3, "NULL"

    .line 270
    .line 271
    move v6, v15

    .line 272
    goto :goto_7

    .line 273
    :cond_13
    :goto_5
    const-string v2, "false"

    .line 274
    .line 275
    const-string v3, "FALSE"

    .line 276
    .line 277
    move v6, v13

    .line 278
    goto :goto_7

    .line 279
    :cond_14
    :goto_6
    const-string v2, "true"

    .line 280
    .line 281
    const-string v3, "TRUE"

    .line 282
    .line 283
    move v6, v4

    .line 284
    :goto_7
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    .line 285
    .line 286
    .line 287
    move-result v8

    .line 288
    move v9, v7

    .line 289
    :goto_8
    if-ge v9, v8, :cond_17

    .line 290
    .line 291
    iget v10, v0, Lx3/a;->e:I

    .line 292
    .line 293
    add-int/2addr v10, v9

    .line 294
    iget v11, v0, Lx3/a;->f:I

    .line 295
    .line 296
    if-lt v10, v11, :cond_15

    .line 297
    .line 298
    add-int/lit8 v10, v9, 0x1

    .line 299
    .line 300
    invoke-virtual {v0, v10}, Lx3/a;->o(I)Z

    .line 301
    .line 302
    .line 303
    move-result v10

    .line 304
    if-nez v10, :cond_15

    .line 305
    .line 306
    goto :goto_9

    .line 307
    :cond_15
    iget v10, v0, Lx3/a;->e:I

    .line 308
    .line 309
    add-int/2addr v10, v9

    .line 310
    aget-char v10, v14, v10

    .line 311
    .line 312
    invoke-virtual {v2, v9}, Ljava/lang/String;->charAt(I)C

    .line 313
    .line 314
    .line 315
    move-result v11

    .line 316
    if-eq v10, v11, :cond_16

    .line 317
    .line 318
    invoke-virtual {v3, v9}, Ljava/lang/String;->charAt(I)C

    .line 319
    .line 320
    .line 321
    move-result v11

    .line 322
    if-eq v10, v11, :cond_16

    .line 323
    .line 324
    goto :goto_9

    .line 325
    :cond_16
    add-int/lit8 v9, v9, 0x1

    .line 326
    .line 327
    goto :goto_8

    .line 328
    :cond_17
    iget v2, v0, Lx3/a;->e:I

    .line 329
    .line 330
    add-int/2addr v2, v8

    .line 331
    iget v3, v0, Lx3/a;->f:I

    .line 332
    .line 333
    if-lt v2, v3, :cond_18

    .line 334
    .line 335
    add-int/lit8 v2, v8, 0x1

    .line 336
    .line 337
    invoke-virtual {v0, v2}, Lx3/a;->o(I)Z

    .line 338
    .line 339
    .line 340
    move-result v2

    .line 341
    if-eqz v2, :cond_1a

    .line 342
    .line 343
    :cond_18
    iget v2, v0, Lx3/a;->e:I

    .line 344
    .line 345
    add-int/2addr v2, v8

    .line 346
    aget-char v2, v14, v2

    .line 347
    .line 348
    invoke-virtual {v0, v2}, Lx3/a;->r(C)Z

    .line 349
    .line 350
    .line 351
    move-result v2

    .line 352
    if-eqz v2, :cond_1a

    .line 353
    .line 354
    :cond_19
    :goto_9
    move v6, v1

    .line 355
    goto :goto_a

    .line 356
    :cond_1a
    iget v2, v0, Lx3/a;->e:I

    .line 357
    .line 358
    add-int/2addr v2, v8

    .line 359
    iput v2, v0, Lx3/a;->e:I

    .line 360
    .line 361
    iput v6, v0, Lx3/a;->i:I

    .line 362
    .line 363
    :goto_a
    if-eqz v6, :cond_1b

    .line 364
    .line 365
    return v6

    .line 366
    :cond_1b
    iget v2, v0, Lx3/a;->e:I

    .line 367
    .line 368
    iget v3, v0, Lx3/a;->f:I

    .line 369
    .line 370
    const-wide/16 v8, 0x0

    .line 371
    .line 372
    move v6, v1

    .line 373
    move v10, v6

    .line 374
    move v11, v10

    .line 375
    move/from16 v18, v7

    .line 376
    .line 377
    move-wide v12, v8

    .line 378
    :goto_b
    add-int v1, v2, v6

    .line 379
    .line 380
    if-ne v1, v3, :cond_1e

    .line 381
    .line 382
    array-length v1, v14

    .line 383
    if-ne v6, v1, :cond_1c

    .line 384
    .line 385
    goto/16 :goto_18

    .line 386
    .line 387
    :cond_1c
    add-int/lit8 v1, v6, 0x1

    .line 388
    .line 389
    invoke-virtual {v0, v1}, Lx3/a;->o(I)Z

    .line 390
    .line 391
    .line 392
    move-result v1

    .line 393
    if-nez v1, :cond_1d

    .line 394
    .line 395
    goto/16 :goto_12

    .line 396
    .line 397
    :cond_1d
    iget v1, v0, Lx3/a;->e:I

    .line 398
    .line 399
    iget v2, v0, Lx3/a;->f:I

    .line 400
    .line 401
    move v3, v2

    .line 402
    move v2, v1

    .line 403
    :cond_1e
    add-int v1, v2, v6

    .line 404
    .line 405
    aget-char v1, v14, v1

    .line 406
    .line 407
    const/16 v15, 0x2b

    .line 408
    .line 409
    if-eq v1, v15, :cond_34

    .line 410
    .line 411
    const/16 v15, 0x45

    .line 412
    .line 413
    if-eq v1, v15, :cond_32

    .line 414
    .line 415
    const/16 v15, 0x65

    .line 416
    .line 417
    if-eq v1, v15, :cond_32

    .line 418
    .line 419
    const/16 v15, 0x2d

    .line 420
    .line 421
    if-eq v1, v15, :cond_30

    .line 422
    .line 423
    const/16 v15, 0x2e

    .line 424
    .line 425
    if-eq v1, v15, :cond_2f

    .line 426
    .line 427
    const/16 v15, 0x30

    .line 428
    .line 429
    if-lt v1, v15, :cond_29

    .line 430
    .line 431
    const/16 v15, 0x39

    .line 432
    .line 433
    if-le v1, v15, :cond_1f

    .line 434
    .line 435
    goto :goto_11

    .line 436
    :cond_1f
    if-eq v10, v7, :cond_27

    .line 437
    .line 438
    if-nez v10, :cond_20

    .line 439
    .line 440
    goto :goto_e

    .line 441
    :cond_20
    if-ne v10, v5, :cond_24

    .line 442
    .line 443
    cmp-long v15, v12, v8

    .line 444
    .line 445
    if-nez v15, :cond_21

    .line 446
    .line 447
    goto/16 :goto_18

    .line 448
    .line 449
    :cond_21
    const-wide/16 v19, 0xa

    .line 450
    .line 451
    mul-long v19, v19, v12

    .line 452
    .line 453
    add-int/lit8 v1, v1, -0x30

    .line 454
    .line 455
    int-to-long v7, v1

    .line 456
    sub-long v19, v19, v7

    .line 457
    .line 458
    const-wide v7, -0xcccccccccccccccL

    .line 459
    .line 460
    .line 461
    .line 462
    .line 463
    cmp-long v1, v12, v7

    .line 464
    .line 465
    if-gtz v1, :cond_23

    .line 466
    .line 467
    if-nez v1, :cond_22

    .line 468
    .line 469
    cmp-long v1, v19, v12

    .line 470
    .line 471
    if-gez v1, :cond_22

    .line 472
    .line 473
    goto :goto_c

    .line 474
    :cond_22
    const/4 v1, 0x0

    .line 475
    goto :goto_d

    .line 476
    :cond_23
    :goto_c
    const/4 v1, 0x1

    .line 477
    :goto_d
    and-int v1, v1, v18

    .line 478
    .line 479
    move/from16 v18, v1

    .line 480
    .line 481
    move-wide/from16 v12, v19

    .line 482
    .line 483
    const/4 v7, 0x3

    .line 484
    const/4 v8, 0x6

    .line 485
    goto :goto_f

    .line 486
    :cond_24
    const/4 v7, 0x3

    .line 487
    if-ne v10, v7, :cond_25

    .line 488
    .line 489
    const/4 v1, 0x7

    .line 490
    const/4 v8, 0x6

    .line 491
    const/4 v10, 0x4

    .line 492
    goto :goto_10

    .line 493
    :cond_25
    const/4 v8, 0x6

    .line 494
    if-eq v10, v4, :cond_26

    .line 495
    .line 496
    if-ne v10, v8, :cond_28

    .line 497
    .line 498
    :cond_26
    const/4 v1, 0x7

    .line 499
    const/4 v10, 0x7

    .line 500
    goto :goto_10

    .line 501
    :cond_27
    :goto_e
    const/4 v7, 0x3

    .line 502
    const/4 v8, 0x6

    .line 503
    add-int/lit8 v1, v1, -0x30

    .line 504
    .line 505
    neg-int v1, v1

    .line 506
    int-to-long v9, v1

    .line 507
    move-wide v12, v9

    .line 508
    move v10, v5

    .line 509
    :cond_28
    :goto_f
    const/4 v1, 0x7

    .line 510
    :goto_10
    const-wide/16 v16, 0x0

    .line 511
    .line 512
    goto/16 :goto_17

    .line 513
    .line 514
    :cond_29
    :goto_11
    invoke-virtual {v0, v1}, Lx3/a;->r(C)Z

    .line 515
    .line 516
    .line 517
    move-result v1

    .line 518
    if-nez v1, :cond_35

    .line 519
    .line 520
    :goto_12
    if-ne v10, v5, :cond_2d

    .line 521
    .line 522
    if-eqz v18, :cond_2d

    .line 523
    .line 524
    const-wide/high16 v1, -0x8000000000000000L

    .line 525
    .line 526
    cmp-long v1, v12, v1

    .line 527
    .line 528
    if-nez v1, :cond_2a

    .line 529
    .line 530
    if-eqz v11, :cond_2d

    .line 531
    .line 532
    :cond_2a
    const-wide/16 v16, 0x0

    .line 533
    .line 534
    cmp-long v1, v12, v16

    .line 535
    .line 536
    if-nez v1, :cond_2b

    .line 537
    .line 538
    if-nez v11, :cond_2d

    .line 539
    .line 540
    :cond_2b
    if-eqz v11, :cond_2c

    .line 541
    .line 542
    goto :goto_13

    .line 543
    :cond_2c
    neg-long v12, v12

    .line 544
    :goto_13
    iput-wide v12, v0, Lx3/a;->j:J

    .line 545
    .line 546
    iget v1, v0, Lx3/a;->e:I

    .line 547
    .line 548
    add-int/2addr v1, v6

    .line 549
    iput v1, v0, Lx3/a;->e:I

    .line 550
    .line 551
    const/16 v1, 0xf

    .line 552
    .line 553
    goto :goto_14

    .line 554
    :cond_2d
    if-eq v10, v5, :cond_2e

    .line 555
    .line 556
    const/4 v1, 0x4

    .line 557
    if-eq v10, v1, :cond_2e

    .line 558
    .line 559
    const/4 v1, 0x7

    .line 560
    if-ne v10, v1, :cond_35

    .line 561
    .line 562
    :cond_2e
    iput v6, v0, Lx3/a;->k:I

    .line 563
    .line 564
    const/16 v1, 0x10

    .line 565
    .line 566
    :goto_14
    move v7, v1

    .line 567
    iput v7, v0, Lx3/a;->i:I

    .line 568
    .line 569
    goto :goto_19

    .line 570
    :cond_2f
    move-wide/from16 v16, v8

    .line 571
    .line 572
    const/4 v1, 0x7

    .line 573
    const/4 v7, 0x3

    .line 574
    const/4 v8, 0x6

    .line 575
    if-ne v10, v5, :cond_35

    .line 576
    .line 577
    move v9, v7

    .line 578
    goto :goto_16

    .line 579
    :cond_30
    move-wide/from16 v16, v8

    .line 580
    .line 581
    const/4 v1, 0x7

    .line 582
    const/4 v7, 0x3

    .line 583
    const/4 v8, 0x6

    .line 584
    if-nez v10, :cond_31

    .line 585
    .line 586
    const/4 v10, 0x1

    .line 587
    const/4 v11, 0x1

    .line 588
    goto :goto_17

    .line 589
    :cond_31
    if-ne v10, v4, :cond_35

    .line 590
    .line 591
    goto :goto_15

    .line 592
    :cond_32
    move-wide/from16 v16, v8

    .line 593
    .line 594
    const/4 v1, 0x7

    .line 595
    const/4 v7, 0x3

    .line 596
    const/4 v8, 0x6

    .line 597
    if-eq v10, v5, :cond_33

    .line 598
    .line 599
    const/4 v9, 0x4

    .line 600
    if-ne v10, v9, :cond_35

    .line 601
    .line 602
    :cond_33
    move v10, v4

    .line 603
    goto :goto_17

    .line 604
    :cond_34
    move-wide/from16 v16, v8

    .line 605
    .line 606
    const/4 v1, 0x7

    .line 607
    const/4 v7, 0x3

    .line 608
    const/4 v8, 0x6

    .line 609
    if-ne v10, v4, :cond_35

    .line 610
    .line 611
    :goto_15
    move v9, v8

    .line 612
    :goto_16
    move v10, v9

    .line 613
    :goto_17
    add-int/lit8 v6, v6, 0x1

    .line 614
    .line 615
    move v15, v1

    .line 616
    move-wide/from16 v8, v16

    .line 617
    .line 618
    const/4 v7, 0x1

    .line 619
    goto/16 :goto_b

    .line 620
    .line 621
    :cond_35
    :goto_18
    const/4 v7, 0x0

    .line 622
    :goto_19
    if-eqz v7, :cond_36

    .line 623
    .line 624
    return v7

    .line 625
    :cond_36
    iget v1, v0, Lx3/a;->e:I

    .line 626
    .line 627
    aget-char v1, v14, v1

    .line 628
    .line 629
    invoke-virtual {v0, v1}, Lx3/a;->r(C)Z

    .line 630
    .line 631
    .line 632
    move-result v1

    .line 633
    if-eqz v1, :cond_37

    .line 634
    .line 635
    invoke-virtual/range {p0 .. p0}, Lx3/a;->h()V

    .line 636
    .line 637
    .line 638
    const/16 v4, 0xa

    .line 639
    .line 640
    goto/16 :goto_1e

    .line 641
    .line 642
    :cond_37
    const-string v1, "Expected value"

    .line 643
    .line 644
    invoke-virtual {v0, v1}, Lx3/a;->S(Ljava/lang/String;)V

    .line 645
    .line 646
    .line 647
    const/4 v1, 0x0

    .line 648
    throw v1

    .line 649
    :cond_38
    const/4 v4, 0x1

    .line 650
    goto/16 :goto_1e

    .line 651
    .line 652
    :cond_39
    move v2, v7

    .line 653
    move v1, v15

    .line 654
    if-ne v3, v2, :cond_3c

    .line 655
    .line 656
    const/4 v12, 0x4

    .line 657
    goto :goto_1a

    .line 658
    :cond_3a
    move v7, v12

    .line 659
    :goto_1a
    iput v12, v0, Lx3/a;->i:I

    .line 660
    .line 661
    return v12

    .line 662
    :cond_3b
    move v2, v7

    .line 663
    move v1, v15

    .line 664
    :cond_3c
    if-eq v3, v2, :cond_3e

    .line 665
    .line 666
    if-ne v3, v5, :cond_3d

    .line 667
    .line 668
    goto :goto_1b

    .line 669
    :cond_3d
    const-string v1, "Unexpected value"

    .line 670
    .line 671
    invoke-virtual {v0, v1}, Lx3/a;->S(Ljava/lang/String;)V

    .line 672
    .line 673
    .line 674
    const/4 v1, 0x0

    .line 675
    throw v1

    .line 676
    :cond_3e
    :goto_1b
    invoke-virtual/range {p0 .. p0}, Lx3/a;->h()V

    .line 677
    .line 678
    .line 679
    iget v3, v0, Lx3/a;->e:I

    .line 680
    .line 681
    sub-int/2addr v3, v2

    .line 682
    iput v3, v0, Lx3/a;->e:I

    .line 683
    .line 684
    move v4, v1

    .line 685
    goto/16 :goto_1e

    .line 686
    .line 687
    :cond_3f
    invoke-virtual/range {p0 .. p0}, Lx3/a;->h()V

    .line 688
    .line 689
    .line 690
    move v4, v2

    .line 691
    goto :goto_1e

    .line 692
    :cond_40
    const/16 v4, 0x9

    .line 693
    .line 694
    goto :goto_1e

    .line 695
    :cond_41
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 696
    .line 697
    const-string v2, "JsonReader is closed"

    .line 698
    .line 699
    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 700
    .line 701
    .line 702
    throw v1

    .line 703
    :cond_42
    :goto_1c
    move v6, v7

    .line 704
    sub-int/2addr v2, v6

    .line 705
    const/4 v7, 0x4

    .line 706
    aput v7, v1, v2

    .line 707
    .line 708
    const/16 v1, 0x7d

    .line 709
    .line 710
    if-ne v3, v4, :cond_46

    .line 711
    .line 712
    invoke-virtual {v0, v6}, Lx3/a;->H(Z)I

    .line 713
    .line 714
    .line 715
    move-result v2

    .line 716
    if-eq v2, v11, :cond_45

    .line 717
    .line 718
    if-eq v2, v10, :cond_44

    .line 719
    .line 720
    if-ne v2, v1, :cond_43

    .line 721
    .line 722
    iput v5, v0, Lx3/a;->i:I

    .line 723
    .line 724
    return v5

    .line 725
    :cond_43
    const-string v1, "Unterminated object"

    .line 726
    .line 727
    invoke-virtual {v0, v1}, Lx3/a;->S(Ljava/lang/String;)V

    .line 728
    .line 729
    .line 730
    const/4 v1, 0x0

    .line 731
    throw v1

    .line 732
    :cond_44
    invoke-virtual/range {p0 .. p0}, Lx3/a;->h()V

    .line 733
    .line 734
    .line 735
    :cond_45
    const/4 v2, 0x1

    .line 736
    goto :goto_1d

    .line 737
    :cond_46
    move v2, v6

    .line 738
    :goto_1d
    invoke-virtual {v0, v2}, Lx3/a;->H(Z)I

    .line 739
    .line 740
    .line 741
    move-result v6

    .line 742
    const/16 v7, 0x22

    .line 743
    .line 744
    if-eq v6, v7, :cond_4b

    .line 745
    .line 746
    const/16 v7, 0x27

    .line 747
    .line 748
    if-eq v6, v7, :cond_4a

    .line 749
    .line 750
    const-string v7, "Expected name"

    .line 751
    .line 752
    if-eq v6, v1, :cond_48

    .line 753
    .line 754
    invoke-virtual/range {p0 .. p0}, Lx3/a;->h()V

    .line 755
    .line 756
    .line 757
    iget v1, v0, Lx3/a;->e:I

    .line 758
    .line 759
    sub-int/2addr v1, v2

    .line 760
    iput v1, v0, Lx3/a;->e:I

    .line 761
    .line 762
    int-to-char v1, v6

    .line 763
    invoke-virtual {v0, v1}, Lx3/a;->r(C)Z

    .line 764
    .line 765
    .line 766
    move-result v1

    .line 767
    if-eqz v1, :cond_47

    .line 768
    .line 769
    const/16 v4, 0xe

    .line 770
    .line 771
    goto :goto_1e

    .line 772
    :cond_47
    invoke-virtual {v0, v7}, Lx3/a;->S(Ljava/lang/String;)V

    .line 773
    .line 774
    .line 775
    const/4 v1, 0x0

    .line 776
    throw v1

    .line 777
    :cond_48
    const/4 v1, 0x0

    .line 778
    if-eq v3, v4, :cond_49

    .line 779
    .line 780
    iput v5, v0, Lx3/a;->i:I

    .line 781
    .line 782
    return v5

    .line 783
    :cond_49
    invoke-virtual {v0, v7}, Lx3/a;->S(Ljava/lang/String;)V

    .line 784
    .line 785
    .line 786
    throw v1

    .line 787
    :cond_4a
    invoke-virtual/range {p0 .. p0}, Lx3/a;->h()V

    .line 788
    .line 789
    .line 790
    const/16 v4, 0xc

    .line 791
    .line 792
    goto :goto_1e

    .line 793
    :cond_4b
    const/16 v4, 0xd

    .line 794
    .line 795
    :goto_1e
    iput v4, v0, Lx3/a;->i:I

    .line 796
    .line 797
    return v4
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
    .line 1039
    .line 1040
    .line 1041
    .line 1042
    .line 1043
    .line 1044
    .line 1045
    .line 1046
    .line 1047
    .line 1048
    .line 1049
    .line 1050
    .line 1051
    .line 1052
    .line 1053
    .line 1054
    .line 1055
    .line 1056
    .line 1057
    .line 1058
    .line 1059
    .line 1060
    .line 1061
    .line 1062
    .line 1063
    .line 1064
    .line 1065
    .line 1066
    .line 1067
    .line 1068
    .line 1069
    .line 1070
    .line 1071
    .line 1072
    .line 1073
    .line 1074
    .line 1075
    .line 1076
    .line 1077
    .line 1078
    .line 1079
    .line 1080
    .line 1081
    .line 1082
    .line 1083
    .line 1084
    .line 1085
    .line 1086
    .line 1087
    .line 1088
    .line 1089
    .line 1090
    .line 1091
    .line 1092
    .line 1093
    .line 1094
    .line 1095
    .line 1096
    .line 1097
    .line 1098
    .line 1099
    .line 1100
    .line 1101
    .line 1102
    .line 1103
    .line 1104
    .line 1105
    .line 1106
    .line 1107
    .line 1108
    .line 1109
    .line 1110
    .line 1111
    .line 1112
    .line 1113
    .line 1114
    .line 1115
    .line 1116
    .line 1117
    .line 1118
    .line 1119
    .line 1120
    .line 1121
    .line 1122
    .line 1123
    .line 1124
    .line 1125
    .line 1126
    .line 1127
    .line 1128
    .line 1129
    .line 1130
    .line 1131
    .line 1132
    .line 1133
    .line 1134
    .line 1135
    .line 1136
    .line 1137
    .line 1138
    .line 1139
    .line 1140
    .line 1141
    .line 1142
    .line 1143
    .line 1144
    .line 1145
    .line 1146
    .line 1147
    .line 1148
    .line 1149
    .line 1150
    .line 1151
    .line 1152
    .line 1153
    .line 1154
    .line 1155
    .line 1156
    .line 1157
    .line 1158
    .line 1159
    .line 1160
    .line 1161
    .line 1162
    .line 1163
    .line 1164
    .line 1165
    .line 1166
    .line 1167
    .line 1168
    .line 1169
    .line 1170
    .line 1171
    .line 1172
    .line 1173
    .line 1174
    .line 1175
    .line 1176
    .line 1177
    .line 1178
    .line 1179
    .line 1180
    .line 1181
    .line 1182
    .line 1183
    .line 1184
    .line 1185
    .line 1186
    .line 1187
    .line 1188
    .line 1189
    .line 1190
    .line 1191
    .line 1192
    .line 1193
    .line 1194
    .line 1195
    .line 1196
    .line 1197
    .line 1198
    .line 1199
    .line 1200
    .line 1201
    .line 1202
    .line 1203
    .line 1204
    .line 1205
    .line 1206
    .line 1207
    .line 1208
    .line 1209
    .line 1210
    .line 1211
    .line 1212
    .line 1213
    .line 1214
    .line 1215
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
.end method

.method public k()V
    .locals 3

    iget v0, p0, Lx3/a;->i:I

    if-nez v0, :cond_0

    invoke-virtual {p0}, Lx3/a;->j()I

    move-result v0

    :cond_0
    const/4 v1, 0x4

    if-ne v0, v1, :cond_1

    iget v0, p0, Lx3/a;->n:I

    add-int/lit8 v0, v0, -0x1

    iput v0, p0, Lx3/a;->n:I

    iget-object v1, p0, Lx3/a;->p:[I

    add-int/lit8 v0, v0, -0x1

    aget v2, v1, v0

    add-int/lit8 v2, v2, 0x1

    aput v2, v1, v0

    const/4 v0, 0x0

    iput v0, p0, Lx3/a;->i:I

    return-void

    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Expected END_ARRAY but was "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0}, Lx3/a;->M()I

    move-result v2

    invoke-static {v2}, Lx3/b;->a(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lx3/a;->s()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public n()V
    .locals 3

    iget v0, p0, Lx3/a;->i:I

    if-nez v0, :cond_0

    invoke-virtual {p0}, Lx3/a;->j()I

    move-result v0

    :cond_0
    const/4 v1, 0x2

    if-ne v0, v1, :cond_1

    iget v0, p0, Lx3/a;->n:I

    add-int/lit8 v0, v0, -0x1

    iput v0, p0, Lx3/a;->n:I

    iget-object v1, p0, Lx3/a;->o:[Ljava/lang/String;

    const/4 v2, 0x0

    aput-object v2, v1, v0

    iget-object v1, p0, Lx3/a;->p:[I

    add-int/lit8 v0, v0, -0x1

    aget v2, v1, v0

    add-int/lit8 v2, v2, 0x1

    aput v2, v1, v0

    const/4 v0, 0x0

    iput v0, p0, Lx3/a;->i:I

    return-void

    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Expected END_OBJECT but was "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0}, Lx3/a;->M()I

    move-result v2

    invoke-static {v2}, Lx3/b;->a(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lx3/a;->s()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final o(I)Z
    .locals 7

    iget v0, p0, Lx3/a;->h:I

    iget v1, p0, Lx3/a;->e:I

    sub-int/2addr v0, v1

    iput v0, p0, Lx3/a;->h:I

    iget v0, p0, Lx3/a;->f:I

    const/4 v2, 0x0

    iget-object v3, p0, Lx3/a;->d:[C

    if-eq v0, v1, :cond_0

    sub-int/2addr v0, v1

    iput v0, p0, Lx3/a;->f:I

    invoke-static {v3, v1, v3, v2, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    goto :goto_0

    :cond_0
    iput v2, p0, Lx3/a;->f:I

    :goto_0
    iput v2, p0, Lx3/a;->e:I

    :cond_1
    iget v0, p0, Lx3/a;->f:I

    array-length v1, v3

    sub-int/2addr v1, v0

    iget-object v4, p0, Lx3/a;->b:Ljava/io/Reader;

    invoke-virtual {v4, v3, v0, v1}, Ljava/io/Reader;->read([CII)I

    move-result v0

    const/4 v1, -0x1

    if-eq v0, v1, :cond_3

    iget v1, p0, Lx3/a;->f:I

    add-int/2addr v1, v0

    iput v1, p0, Lx3/a;->f:I

    iget v0, p0, Lx3/a;->g:I

    const/4 v4, 0x1

    if-nez v0, :cond_2

    iget v0, p0, Lx3/a;->h:I

    if-nez v0, :cond_2

    if-lez v1, :cond_2

    aget-char v5, v3, v2

    const v6, 0xfeff

    if-ne v5, v6, :cond_2

    iget v5, p0, Lx3/a;->e:I

    add-int/2addr v5, v4

    iput v5, p0, Lx3/a;->e:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lx3/a;->h:I

    add-int/lit8 p1, p1, 0x1

    :cond_2
    if-lt v1, p1, :cond_1

    return v4

    :cond_3
    return v2
.end method

.method public p()Ljava/lang/String;
    .locals 5

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "$"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget v1, p0, Lx3/a;->n:I

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_3

    iget-object v3, p0, Lx3/a;->m:[I

    aget v3, v3, v2

    const/4 v4, 0x1

    if-eq v3, v4, :cond_1

    const/4 v4, 0x2

    if-eq v3, v4, :cond_1

    const/4 v4, 0x3

    if-eq v3, v4, :cond_0

    const/4 v4, 0x4

    if-eq v3, v4, :cond_0

    const/4 v4, 0x5

    if-eq v3, v4, :cond_0

    goto :goto_1

    :cond_0
    const/16 v3, 0x2e

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    iget-object v3, p0, Lx3/a;->o:[Ljava/lang/String;

    aget-object v3, v3, v2

    if-eqz v3, :cond_2

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_1

    :cond_1
    const/16 v3, 0x5b

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    iget-object v3, p0, Lx3/a;->p:[I

    aget v3, v3, v2

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const/16 v3, 0x5d

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    :cond_2
    :goto_1
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_3
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public q()Z
    .locals 2

    iget v0, p0, Lx3/a;->i:I

    if-nez v0, :cond_0

    invoke-virtual {p0}, Lx3/a;->j()I

    move-result v0

    :cond_0
    const/4 v1, 0x2

    if-eq v0, v1, :cond_1

    const/4 v1, 0x4

    if-eq v0, v1, :cond_1

    const/4 v0, 0x1

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public final r(C)Z
    .locals 1

    const/16 v0, 0x9

    if-eq p1, v0, :cond_1

    const/16 v0, 0xa

    if-eq p1, v0, :cond_1

    const/16 v0, 0xc

    if-eq p1, v0, :cond_1

    const/16 v0, 0xd

    if-eq p1, v0, :cond_1

    const/16 v0, 0x20

    if-eq p1, v0, :cond_1

    const/16 v0, 0x23

    if-eq p1, v0, :cond_0

    const/16 v0, 0x2c

    if-eq p1, v0, :cond_1

    const/16 v0, 0x2f

    if-eq p1, v0, :cond_0

    const/16 v0, 0x3d

    if-eq p1, v0, :cond_0

    const/16 v0, 0x7b

    if-eq p1, v0, :cond_1

    const/16 v0, 0x7d

    if-eq p1, v0, :cond_1

    const/16 v0, 0x3a

    if-eq p1, v0, :cond_1

    const/16 v0, 0x3b

    if-eq p1, v0, :cond_0

    packed-switch p1, :pswitch_data_0

    const/4 p1, 0x1

    return p1

    :cond_0
    :pswitch_0
    invoke-virtual {p0}, Lx3/a;->h()V

    :cond_1
    :pswitch_1
    const/4 p1, 0x0

    return p1

    :pswitch_data_0
    .packed-switch 0x5b
        :pswitch_1
        :pswitch_0
        :pswitch_1
    .end packed-switch
.end method

.method public final s()Ljava/lang/String;
    .locals 4

    iget v0, p0, Lx3/a;->g:I

    add-int/lit8 v0, v0, 0x1

    iget v1, p0, Lx3/a;->e:I

    iget v2, p0, Lx3/a;->h:I

    sub-int/2addr v1, v2

    add-int/lit8 v1, v1, 0x1

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, " at line "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, " column "

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, " path "

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lx3/a;->p()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lx3/a;->s()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public w()Z
    .locals 5

    iget v0, p0, Lx3/a;->i:I

    if-nez v0, :cond_0

    invoke-virtual {p0}, Lx3/a;->j()I

    move-result v0

    :cond_0
    const/4 v1, 0x5

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-ne v0, v1, :cond_1

    iput v2, p0, Lx3/a;->i:I

    iget-object v0, p0, Lx3/a;->p:[I

    iget v1, p0, Lx3/a;->n:I

    sub-int/2addr v1, v3

    aget v2, v0, v1

    add-int/2addr v2, v3

    aput v2, v0, v1

    return v3

    :cond_1
    const/4 v1, 0x6

    if-ne v0, v1, :cond_2

    iput v2, p0, Lx3/a;->i:I

    iget-object v0, p0, Lx3/a;->p:[I

    iget v1, p0, Lx3/a;->n:I

    sub-int/2addr v1, v3

    aget v4, v0, v1

    add-int/2addr v4, v3

    aput v4, v0, v1

    return v2

    :cond_2
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Expected a boolean but was "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0}, Lx3/a;->M()I

    move-result v2

    invoke-static {v2}, Lx3/b;->a(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lx3/a;->s()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public x()D
    .locals 6

    iget v0, p0, Lx3/a;->i:I

    if-nez v0, :cond_0

    invoke-virtual {p0}, Lx3/a;->j()I

    move-result v0

    :cond_0
    const/16 v1, 0xf

    const/4 v2, 0x0

    if-ne v0, v1, :cond_1

    iput v2, p0, Lx3/a;->i:I

    iget-object v0, p0, Lx3/a;->p:[I

    iget v1, p0, Lx3/a;->n:I

    add-int/lit8 v1, v1, -0x1

    aget v2, v0, v1

    add-int/lit8 v2, v2, 0x1

    aput v2, v0, v1

    iget-wide v0, p0, Lx3/a;->j:J

    long-to-double v0, v0

    return-wide v0

    :cond_1
    const/16 v1, 0x10

    const/16 v3, 0xb

    if-ne v0, v1, :cond_2

    new-instance v0, Ljava/lang/String;

    iget v1, p0, Lx3/a;->e:I

    iget v4, p0, Lx3/a;->k:I

    iget-object v5, p0, Lx3/a;->d:[C

    invoke-direct {v0, v5, v1, v4}, Ljava/lang/String;-><init>([CII)V

    iput-object v0, p0, Lx3/a;->l:Ljava/lang/String;

    iget v0, p0, Lx3/a;->e:I

    iget v1, p0, Lx3/a;->k:I

    add-int/2addr v0, v1

    iput v0, p0, Lx3/a;->e:I

    goto :goto_3

    :cond_2
    const/16 v1, 0x8

    if-eq v0, v1, :cond_6

    const/16 v4, 0x9

    if-ne v0, v4, :cond_3

    goto :goto_0

    :cond_3
    const/16 v1, 0xa

    if-ne v0, v1, :cond_4

    invoke-virtual {p0}, Lx3/a;->L()Ljava/lang/String;

    move-result-object v0

    goto :goto_2

    :cond_4
    if-ne v0, v3, :cond_5

    goto :goto_3

    :cond_5
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Expected a double but was "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0}, Lx3/a;->M()I

    move-result v2

    invoke-static {v2}, Lx3/b;->a(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lx3/a;->s()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_6
    :goto_0
    if-ne v0, v1, :cond_7

    const/16 v0, 0x27

    goto :goto_1

    :cond_7
    const/16 v0, 0x22

    :goto_1
    invoke-virtual {p0, v0}, Lx3/a;->J(C)Ljava/lang/String;

    move-result-object v0

    :goto_2
    iput-object v0, p0, Lx3/a;->l:Ljava/lang/String;

    :goto_3
    iput v3, p0, Lx3/a;->i:I

    iget-object v0, p0, Lx3/a;->l:Ljava/lang/String;

    invoke-static {v0}, Ljava/lang/Double;->parseDouble(Ljava/lang/String;)D

    move-result-wide v0

    iget-boolean v3, p0, Lx3/a;->c:Z

    if-nez v3, :cond_9

    invoke-static {v0, v1}, Ljava/lang/Double;->isNaN(D)Z

    move-result v3

    if-nez v3, :cond_8

    invoke-static {v0, v1}, Ljava/lang/Double;->isInfinite(D)Z

    move-result v3

    if-nez v3, :cond_8

    goto :goto_4

    :cond_8
    new-instance v2, Lx3/d;

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "JSON forbids NaN and infinities: "

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v0, v1}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lx3/a;->s()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v2, v0}, Lx3/d;-><init>(Ljava/lang/String;)V

    throw v2

    :cond_9
    :goto_4
    const/4 v3, 0x0

    iput-object v3, p0, Lx3/a;->l:Ljava/lang/String;

    iput v2, p0, Lx3/a;->i:I

    iget-object v2, p0, Lx3/a;->p:[I

    iget v3, p0, Lx3/a;->n:I

    add-int/lit8 v3, v3, -0x1

    aget v4, v2, v3

    add-int/lit8 v4, v4, 0x1

    aput v4, v2, v3

    return-wide v0
.end method
